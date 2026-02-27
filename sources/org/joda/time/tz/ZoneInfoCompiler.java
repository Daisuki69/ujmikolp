package org.joda.time.tz;

import We.s;
import androidx.camera.core.impl.a;
import androidx.media3.common.PlaybackException;
import com.dynatrace.android.agent.Global;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes5.dex */
public class ZoneInfoCompiler {
    static Chronology cLenientISO;
    static DateTimeOfYear cStartOfYear;
    private Map<String, RuleSet> iRuleSets = new HashMap();
    private List<Zone> iZones = new ArrayList();
    private List<String> iGoodLinks = new ArrayList();
    private List<String> iBackLinks = new ArrayList();

    public static class Rule {
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iFromYear;
        public final String iLetterS;
        public final String iName;
        public final int iSaveMillis;
        public final int iToYear;
        public final String iType;

        public Rule(StringTokenizer stringTokenizer) {
            if (stringTokenizer.countTokens() < 6) {
                throw new IllegalArgumentException("Attempting to create a Rule from an incomplete tokenizer");
            }
            this.iName = stringTokenizer.nextToken().intern();
            int year = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), 0);
            this.iFromYear = year;
            int year2 = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), year);
            this.iToYear = year2;
            if (year2 < year) {
                throw new IllegalArgumentException();
            }
            this.iType = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iDateTimeOfYear = new DateTimeOfYear(stringTokenizer);
            this.iSaveMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iLetterS = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
        }

        private String formatName(String str) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf > 0) {
                return this.iSaveMillis == 0 ? str.substring(0, iIndexOf).intern() : str.substring(iIndexOf + 1).intern();
            }
            int iIndexOf2 = str.indexOf("%s");
            if (iIndexOf2 < 0) {
                return str;
            }
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 2);
            return (this.iLetterS == null ? strSubstring.concat(strSubstring2) : s.p(a.w(strSubstring), this.iLetterS, strSubstring2)).intern();
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            this.iDateTimeOfYear.addRecurring(dateTimeZoneBuilder, formatName(str), this.iSaveMillis, this.iFromYear, this.iToYear);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[Rule]\nName: ");
            sb2.append(this.iName);
            sb2.append("\nFromYear: ");
            sb2.append(this.iFromYear);
            sb2.append("\nToYear: ");
            sb2.append(this.iToYear);
            sb2.append("\nType: ");
            sb2.append(this.iType);
            sb2.append(Global.NEWLINE);
            sb2.append(this.iDateTimeOfYear);
            sb2.append("SaveMillis: ");
            sb2.append(this.iSaveMillis);
            sb2.append("\nLetterS: ");
            return s.p(sb2, this.iLetterS, Global.NEWLINE);
        }
    }

    public static class RuleSet {
        private List<Rule> iRules;

        public RuleSet(Rule rule) {
            ArrayList arrayList = new ArrayList();
            this.iRules = arrayList;
            arrayList.add(rule);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            for (int i = 0; i < this.iRules.size(); i++) {
                this.iRules.get(i).addRecurring(dateTimeZoneBuilder, str);
            }
        }

        public void addRule(Rule rule) {
            if (!rule.iName.equals(this.iRules.get(0).iName)) {
                throw new IllegalArgumentException("Rule name mismatch");
            }
            this.iRules.add(rule);
        }
    }

    public static class Zone {
        public final String iFormat;
        public final String iName;
        private Zone iNext;
        public final int iOffsetMillis;
        public final String iRules;
        public final DateTimeOfYear iUntilDateTimeOfYear;
        public final int iUntilYear;

        public Zone(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        public void addToBuilder(DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            addToBuilder(this, dateTimeZoneBuilder, map);
        }

        public void chain(StringTokenizer stringTokenizer) {
            Zone zone = this.iNext;
            if (zone != null) {
                zone.chain(stringTokenizer);
            } else {
                this.iNext = new Zone(this.iName, stringTokenizer);
            }
        }

        public String toString() {
            String str = "[Zone]\nName: " + this.iName + "\nOffsetMillis: " + this.iOffsetMillis + "\nRules: " + this.iRules + "\nFormat: " + this.iFormat + "\nUntilYear: " + this.iUntilYear + Global.NEWLINE + this.iUntilDateTimeOfYear;
            if (this.iNext == null) {
                return str;
            }
            StringBuilder sbV = s.v(str, "...\n");
            sbV.append(this.iNext.toString());
            return sbV.toString();
        }

        private Zone(String str, StringTokenizer stringTokenizer) {
            int i;
            this.iName = str.intern();
            this.iOffsetMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iRules = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iFormat = stringTokenizer.nextToken().intern();
            DateTimeOfYear startOfYear = ZoneInfoCompiler.getStartOfYear();
            if (stringTokenizer.hasMoreTokens()) {
                i = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    startOfYear = new DateTimeOfYear(stringTokenizer);
                }
            } else {
                i = Integer.MAX_VALUE;
            }
            this.iUntilYear = i;
            this.iUntilDateTimeOfYear = startOfYear;
        }

        private static void addToBuilder(Zone zone, DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            while (zone != null) {
                dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                String str = zone.iRules;
                if (str == null) {
                    dateTimeZoneBuilder.setFixedSavings(zone.iFormat, 0);
                } else {
                    try {
                        dateTimeZoneBuilder.setFixedSavings(zone.iFormat, ZoneInfoCompiler.parseTime(str));
                    } catch (Exception unused) {
                        RuleSet ruleSet = map.get(zone.iRules);
                        if (ruleSet == null) {
                            throw new IllegalArgumentException("Rules not found: " + zone.iRules);
                        }
                        ruleSet.addRecurring(dateTimeZoneBuilder, zone.iFormat);
                    }
                }
                int i = zone.iUntilYear;
                if (i == Integer.MAX_VALUE) {
                    return;
                }
                zone.iUntilDateTimeOfYear.addCutover(dateTimeZoneBuilder, i);
                zone = zone.iNext;
            }
        }
    }

    public static Chronology getLenientISOChronology() {
        if (cLenientISO == null) {
            cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        return cLenientISO;
    }

    public static DateTimeOfYear getStartOfYear() {
        if (cStartOfYear == null) {
            cStartOfYear = new DateTimeOfYear();
        }
        return cStartOfYear;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if ("-?".equals(r9[r3]) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        printUsage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void main(java.lang.String[] r9) throws java.lang.Exception {
        /*
            int r0 = r9.length
            if (r0 != 0) goto L7
            printUsage()
            return
        L7:
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
            r4 = r3
        Lc:
            int r5 = r9.length
            r6 = 1
            if (r3 >= r5) goto L57
            java.lang.String r5 = "-src"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L24
            java.io.File r0 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L53
            int r3 = r3 + 1
            r5 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            r0.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            goto L43
        L24:
            java.lang.String r5 = "-dst"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L38
            java.io.File r2 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L53
            int r3 = r3 + 1
            r5 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            r2.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            goto L43
        L38:
            java.lang.String r5 = "-verbose"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L45
            r4 = r6
        L43:
            int r3 = r3 + r6
            goto Lc
        L45:
            java.lang.String r5 = "-?"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L57
            printUsage()     // Catch: java.lang.IndexOutOfBoundsException -> L53
            return
        L53:
            printUsage()
            return
        L57:
            int r5 = r9.length
            if (r3 < r5) goto L5e
            printUsage()
            return
        L5e:
            int r5 = r9.length
            int r5 = r5 - r3
            java.io.File[] r5 = new java.io.File[r5]
        L62:
            int r7 = r9.length
            if (r3 >= r7) goto L7a
            java.io.File r7 = new java.io.File
            if (r0 != 0) goto L6f
            r8 = r9[r3]
            r7.<init>(r8)
            goto L74
        L6f:
            r8 = r9[r3]
            r7.<init>(r0, r8)
        L74:
            r5[r1] = r7
            int r3 = r3 + 1
            int r1 = r1 + r6
            goto L62
        L7a:
            org.joda.time.tz.ZoneInfoLogger.set(r4)
            org.joda.time.tz.ZoneInfoCompiler r9 = new org.joda.time.tz.ZoneInfoCompiler
            r9.<init>()
            r9.compile(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.ZoneInfoCompiler.main(java.lang.String[]):void");
    }

    public static int parseDayOfWeek(String str) {
        DateTimeField dateTimeFieldDayOfWeek = ISOChronology.getInstanceUTC().dayOfWeek();
        return dateTimeFieldDayOfWeek.get(dateTimeFieldDayOfWeek.set(0L, str, Locale.ENGLISH));
    }

    public static int parseMonth(String str) {
        DateTimeField dateTimeFieldMonthOfYear = ISOChronology.getInstanceUTC().monthOfYear();
        return dateTimeFieldMonthOfYear.get(dateTimeFieldMonthOfYear.set(0L, str, Locale.ENGLISH));
    }

    public static String parseOptional(String str) {
        if (str.equals(Global.HYPHEN)) {
            return null;
        }
        return str;
    }

    public static int parseTime(String str) {
        DateTimeFormatter dateTimeFormatterHourMinuteSecondFraction = ISODateTimeFormat.hourMinuteSecondFraction();
        MutableDateTime mutableDateTime = new MutableDateTime(0L, getLenientISOChronology());
        boolean zStartsWith = str.startsWith(Global.HYPHEN);
        if (dateTimeFormatterHourMinuteSecondFraction.parseInto(mutableDateTime, str, zStartsWith ? 1 : 0) == (~(zStartsWith ? 1 : 0))) {
            throw new IllegalArgumentException(str);
        }
        int millis = (int) mutableDateTime.getMillis();
        return zStartsWith ? -millis : millis;
    }

    public static int parseYear(String str, int i) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.equals("minimum") || lowerCase.equals("min")) {
            return Integer.MIN_VALUE;
        }
        if (lowerCase.equals("maximum") || lowerCase.equals("max")) {
            return Integer.MAX_VALUE;
        }
        return lowerCase.equals("only") ? i : Integer.parseInt(lowerCase);
    }

    public static char parseZoneChar(char c) {
        if (c != 'G') {
            if (c != 'S') {
                if (c != 'U' && c != 'Z' && c != 'g') {
                    if (c != 's') {
                        if (c != 'u' && c != 'z') {
                            return 'w';
                        }
                    }
                }
            }
            return 's';
        }
        return 'u';
    }

    private static void printUsage() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        r5 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 2050);
        r3 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 1850);
        r1 = r13.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0100, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        if (r1 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0104, code lost:
    
        r7 = r18.previousTransition(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010a, code lost:
    
        if (r7 == r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010e, code lost:
    
        if (r7 >= r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
    
        r5 = ((java.lang.Long) r13.get(r1)).longValue() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0120, code lost:
    
        if (r5 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0122, code lost:
    
        java.lang.System.out.println("*r* Error in " + r18.getID() + com.dynatrace.android.agent.Global.BLANK + new org.joda.time.DateTime(r7, org.joda.time.chrono.ISOChronology.getInstanceUTC()) + " != " + new org.joda.time.DateTime(r5, org.joda.time.chrono.ISOChronology.getInstanceUTC()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0159, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015a, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015c, code lost:
    
        return r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean test(java.lang.String r17, org.joda.time.DateTimeZone r18) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.ZoneInfoCompiler.test(java.lang.String, org.joda.time.DateTimeZone):boolean");
    }

    private void writeZone(File file, DateTimeZoneBuilder dateTimeZoneBuilder, DateTimeZone dateTimeZone) throws IOException {
        if (ZoneInfoLogger.verbose()) {
            System.out.println("Writing " + dateTimeZone.getID());
        }
        File file2 = new File(file, dateTimeZone.getID());
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            dateTimeZoneBuilder.writeTo(dateTimeZone.getID(), fileOutputStream);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(file2);
            DateTimeZone from = DateTimeZoneBuilder.readFrom(fileInputStream, dateTimeZone.getID());
            fileInputStream.close();
            if (dateTimeZone.equals(from)) {
                return;
            }
            System.out.println("*e* Error in " + dateTimeZone.getID() + ": Didn't read properly from file");
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    public static void writeZoneInfoMap(DataOutputStream dataOutputStream, Map<String, DateTimeZone> map) throws IOException {
        HashMap map2 = new HashMap(map.size());
        TreeMap treeMap = new TreeMap();
        short s9 = 0;
        for (Map.Entry<String, DateTimeZone> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!map2.containsKey(key)) {
                Short shValueOf = Short.valueOf(s9);
                map2.put(key, shValueOf);
                treeMap.put(shValueOf, key);
                s9 = (short) (s9 + 1);
                if (s9 == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
            String id = entry.getValue().getID();
            if (!map2.containsKey(id)) {
                Short shValueOf2 = Short.valueOf(s9);
                map2.put(id, shValueOf2);
                treeMap.put(shValueOf2, id);
                s9 = (short) (s9 + 1);
                if (s9 == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
        }
        dataOutputStream.writeShort(treeMap.size());
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            dataOutputStream.writeUTF((String) it.next());
        }
        dataOutputStream.writeShort(map.size());
        for (Map.Entry<String, DateTimeZone> entry2 : map.entrySet()) {
            dataOutputStream.writeShort(((Short) map2.get(entry2.getKey())).shortValue());
            dataOutputStream.writeShort(((Short) map2.get(entry2.getValue().getID())).shortValue());
        }
    }

    public Map<String, DateTimeZone> compile(File file, File[] fileArr) throws Throwable {
        if (fileArr != null) {
            for (int i = 0; i < fileArr.length; i++) {
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileArr[i]));
                    try {
                        parseDataFile(bufferedReader2, "backward".equals(fileArr[i].getName()));
                        bufferedReader2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Destination directory doesn't exist and cannot be created: " + file);
            }
            if (!file.isDirectory()) {
                throw new IOException("Destination is not a directory: " + file);
            }
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        System.out.println("Writing zoneinfo files");
        for (int i4 = 0; i4 < this.iZones.size(); i4++) {
            Zone zone = this.iZones.get(i4);
            DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
            zone.addToBuilder(dateTimeZoneBuilder, this.iRuleSets);
            DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone(zone.iName, true);
            if (test(dateTimeZone.getID(), dateTimeZone)) {
                treeMap.put(dateTimeZone.getID(), dateTimeZone);
                treeMap2.put(dateTimeZone.getID(), zone);
                if (file != null) {
                    writeZone(file, dateTimeZoneBuilder, dateTimeZone);
                }
            }
        }
        for (int i6 = 0; i6 < this.iGoodLinks.size(); i6 += 2) {
            String str = this.iGoodLinks.get(i6);
            String str2 = this.iGoodLinks.get(i6 + 1);
            Zone zone2 = (Zone) treeMap2.get(str);
            if (zone2 == null) {
                System.out.println(s.l("Cannot find source zone '", str, "' to link alias '", str2, "' to"));
            } else {
                DateTimeZoneBuilder dateTimeZoneBuilder2 = new DateTimeZoneBuilder();
                zone2.addToBuilder(dateTimeZoneBuilder2, this.iRuleSets);
                DateTimeZone dateTimeZone2 = dateTimeZoneBuilder2.toDateTimeZone(str2, true);
                if (test(dateTimeZone2.getID(), dateTimeZone2)) {
                    treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                    if (file != null) {
                        writeZone(file, dateTimeZoneBuilder2, dateTimeZone2);
                    }
                }
                treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                if (ZoneInfoLogger.verbose()) {
                    System.out.println(s.l("Good link: ", str2, " -> ", str, " revived"));
                }
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = 0; i11 < this.iBackLinks.size(); i11 += 2) {
                String str3 = this.iBackLinks.get(i11);
                String str4 = this.iBackLinks.get(i11 + 1);
                DateTimeZone dateTimeZone3 = (DateTimeZone) treeMap.get(str3);
                if (dateTimeZone3 != null) {
                    treeMap.put(str4, dateTimeZone3);
                    if (ZoneInfoLogger.verbose()) {
                        PrintStream printStream = System.out;
                        StringBuilder sbW = s.w("Back link: ", str4, " -> ");
                        sbW.append(dateTimeZone3.getID());
                        printStream.println(sbW.toString());
                    }
                } else if (i10 > 0) {
                    System.out.println(s.l("Cannot find time zone '", str3, "' to link alias '", str4, "' to"));
                }
            }
        }
        if (file == null) {
            return treeMap;
        }
        System.out.println("Writing ZoneInfoMap");
        File file2 = new File(file, "ZoneInfoMap");
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file2));
        try {
            TreeMap treeMap3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap3.putAll(treeMap);
            writeZoneInfoMap(dataOutputStream, treeMap3);
            return treeMap;
        } finally {
            dataOutputStream.close();
        }
    }

    public void parseDataFile(BufferedReader bufferedReader, boolean z4) throws IOException {
        while (true) {
            Zone zone = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    if (zone != null) {
                        this.iZones.add(zone);
                        return;
                    }
                    return;
                }
                String strTrim = line.trim();
                if (strTrim.length() != 0 && strTrim.charAt(0) != '#') {
                    int iIndexOf = line.indexOf(35);
                    if (iIndexOf >= 0) {
                        line = line.substring(0, iIndexOf);
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " \t");
                    if (!Character.isWhitespace(line.charAt(0)) || !stringTokenizer.hasMoreTokens()) {
                        if (zone != null) {
                            this.iZones.add(zone);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            String strNextToken = stringTokenizer.nextToken();
                            if (strNextToken.equalsIgnoreCase("Rule")) {
                                Rule rule = new Rule(stringTokenizer);
                                RuleSet ruleSet = this.iRuleSets.get(rule.iName);
                                if (ruleSet == null) {
                                    this.iRuleSets.put(rule.iName, new RuleSet(rule));
                                } else {
                                    ruleSet.addRule(rule);
                                }
                            } else if (strNextToken.equalsIgnoreCase("Zone")) {
                                if (stringTokenizer.countTokens() < 4) {
                                    throw new IllegalArgumentException("Attempting to create a Zone from an incomplete tokenizer");
                                }
                                zone = new Zone(stringTokenizer);
                            } else if (strNextToken.equalsIgnoreCase(i.f16163L)) {
                                String strNextToken2 = stringTokenizer.nextToken();
                                String strNextToken3 = stringTokenizer.nextToken();
                                if (z4 || strNextToken3.equals("US/Pacific-New") || strNextToken3.startsWith("Etc/") || strNextToken3.equals("GMT")) {
                                    this.iBackLinks.add(strNextToken2);
                                    this.iBackLinks.add(strNextToken3);
                                } else {
                                    this.iGoodLinks.add(strNextToken2);
                                    this.iGoodLinks.add(strNextToken3);
                                }
                            } else {
                                System.out.println("Unknown line: ".concat(line));
                            }
                        }
                    } else if (zone != null) {
                        zone.chain(stringTokenizer);
                    }
                }
            }
        }
    }

    public static class DateTimeOfYear {
        public final boolean iAdvanceDayOfWeek;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final int iMonthOfYear;
        public final char iZoneChar;

        public DateTimeOfYear() {
            this.iMonthOfYear = 1;
            this.iDayOfMonth = 1;
            this.iDayOfWeek = 0;
            this.iAdvanceDayOfWeek = false;
            this.iMillisOfDay = 0;
            this.iZoneChar = 'w';
        }

        public void addCutover(DateTimeZoneBuilder dateTimeZoneBuilder, int i) {
            dateTimeZoneBuilder.addCutover(i, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i, int i4, int i6) {
            dateTimeZoneBuilder.addRecurringSavings(str, i, i4, i6, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public String toString() {
            return "MonthOfYear: " + this.iMonthOfYear + "\nDayOfMonth: " + this.iDayOfMonth + "\nDayOfWeek: " + this.iDayOfWeek + "\nAdvanceDayOfWeek: " + this.iAdvanceDayOfWeek + "\nMillisOfDay: " + this.iMillisOfDay + "\nZoneChar: " + this.iZoneChar + Global.NEWLINE;
        }

        public DateTimeOfYear(StringTokenizer stringTokenizer) {
            int i;
            int i4;
            boolean z4;
            int dayOfWeek;
            LocalDate localDate;
            LocalDate localDatePlusDays;
            int i6 = 1;
            int time = 0;
            char zoneChar = 'w';
            if (stringTokenizer.hasMoreTokens()) {
                int month = ZoneInfoCompiler.parseMonth(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.startsWith("last")) {
                        z4 = false;
                        dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(4));
                        i = -1;
                    } else {
                        try {
                            i = Integer.parseInt(strNextToken);
                            dayOfWeek = 0;
                            z4 = false;
                        } catch (NumberFormatException unused) {
                            int iIndexOf = strNextToken.indexOf(">=");
                            if (iIndexOf > 0) {
                                int i10 = Integer.parseInt(strNextToken.substring(iIndexOf + 2));
                                dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(0, iIndexOf));
                                i = i10;
                                z4 = true;
                            } else {
                                int iIndexOf2 = strNextToken.indexOf("<=");
                                if (iIndexOf2 > 0) {
                                    int i11 = Integer.parseInt(strNextToken.substring(iIndexOf2 + 2));
                                    dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(0, iIndexOf2));
                                    i = i11;
                                    z4 = false;
                                } else {
                                    throw new IllegalArgumentException(strNextToken);
                                }
                            }
                        }
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        String strNextToken2 = stringTokenizer.nextToken();
                        zoneChar = ZoneInfoCompiler.parseZoneChar(strNextToken2.charAt(strNextToken2.length() - 1));
                        if (!strNextToken2.equals("24:00")) {
                            time = ZoneInfoCompiler.parseTime(strNextToken2);
                        } else if (month == 12 && i == 31) {
                            time = ZoneInfoCompiler.parseTime("23:59:59.999");
                        } else {
                            if (i == -1) {
                                localDate = new LocalDate(PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, month, 1);
                                localDatePlusDays = localDate.plusMonths(1);
                            } else {
                                localDate = new LocalDate(PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED, month, i);
                                localDatePlusDays = localDate.plusDays(1);
                            }
                            boolean z5 = (i == -1 || dayOfWeek == 0) ? false : true;
                            int monthOfYear = localDatePlusDays.getMonthOfYear();
                            int dayOfMonth = localDatePlusDays.getDayOfMonth();
                            dayOfWeek = dayOfWeek != 0 ? (dayOfWeek % 7) + 1 : dayOfWeek;
                            z4 = z5;
                            i6 = monthOfYear;
                            i = dayOfMonth;
                            i4 = time;
                            time = dayOfWeek;
                        }
                        i6 = month;
                        i4 = time;
                        time = dayOfWeek;
                    } else {
                        i6 = month;
                        i4 = time;
                        time = dayOfWeek;
                    }
                } else {
                    i = 1;
                    i4 = 0;
                    z4 = false;
                    i6 = month;
                }
            } else {
                i = 1;
                i4 = 0;
                z4 = false;
            }
            this.iMonthOfYear = i6;
            this.iDayOfMonth = i;
            this.iDayOfWeek = time;
            this.iAdvanceDayOfWeek = z4;
            this.iMillisOfDay = i4;
            this.iZoneChar = zoneChar;
        }
    }
}
