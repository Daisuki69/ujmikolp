package org.joda.time.format;

import We.s;
import androidx.camera.core.impl.a;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.connection.RealConnection;
import okio.Utf8;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

/* JADX INFO: loaded from: classes5.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        public CharacterLiteral(char c) {
            this.iValue = c;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            char upperCase;
            char upperCase2;
            if (i >= charSequence.length()) {
                return ~i;
            }
            char cCharAt = charSequence.charAt(i);
            char c = this.iValue;
            return (cCharAt == c || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class FixedNumber extends PaddedNumber {
        public FixedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z4) {
            super(dateTimeFieldType, i, z4, i);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i4;
            char cCharAt;
            int into = super.parseInto(dateTimeParserBucket, charSequence, i);
            if (into < 0 || into == (i4 = this.iMaxParsedDigits + i)) {
                return into;
            }
            if (this.iSigned && ((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) {
                i4++;
            }
            return into > i4 ? ~(i4 + 1) : into < i4 ? ~into : into;
        }
    }

    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        public Fraction(DateTimeFieldType dateTimeFieldType, int i, int i4) {
            this.iFieldType = dateTimeFieldType;
            i4 = i4 > 18 ? 18 : i4;
            this.iMinDigits = i;
            this.iMaxDigits = i4;
        }

        private long[] getFractionData(long j, DateTimeField dateTimeField) {
            long j6;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i = this.iMaxDigits;
            while (true) {
                switch (i) {
                    case 1:
                        j6 = 10;
                        break;
                    case 2:
                        j6 = 100;
                        break;
                    case 3:
                        j6 = 1000;
                        break;
                    case 4:
                        j6 = 10000;
                        break;
                    case 5:
                        j6 = SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
                        break;
                    case 6:
                        j6 = 1000000;
                        break;
                    case 7:
                        j6 = 10000000;
                        break;
                    case 8:
                        j6 = 100000000;
                        break;
                    case 9:
                        j6 = 1000000000;
                        break;
                    case 10:
                        j6 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
                        break;
                    case 11:
                        j6 = 100000000000L;
                        break;
                    case 12:
                        j6 = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
                        break;
                    case 13:
                        j6 = 10000000000000L;
                        break;
                    case 14:
                        j6 = 100000000000000L;
                        break;
                    case 15:
                        j6 = 1000000000000000L;
                        break;
                    case 16:
                        j6 = 10000000000000000L;
                        break;
                    case 17:
                        j6 = 100000000000000000L;
                        break;
                    case 18:
                        j6 = EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER;
                        break;
                    default:
                        j6 = 1;
                        break;
                }
                if ((unitMillis * j6) / j6 == unitMillis) {
                    return new long[]{(j * j6) / unitMillis, i};
                }
                i--;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int iMin = Math.min(this.iMaxDigits, charSequence.length() - i);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j = 0;
            int i4 = 0;
            while (i4 < iMin) {
                char cCharAt = charSequence.charAt(i + i4);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i4++;
                unitMillis /= 10;
                j += ((long) (cCharAt - '0')) * unitMillis;
            }
            long j6 = j / 10;
            if (i4 == 0) {
                return ~i;
            }
            if (j6 > 2147483647L) {
                return ~i;
            }
            dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j6);
            return i + i4;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j, chronology);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }

        public void printTo(Appendable appendable, long j, Chronology chronology) throws IOException {
            String string;
            DateTimeField field = this.iFieldType.getField(chronology);
            int i = this.iMinDigits;
            try {
                long jRemainder = field.remainder(j);
                if (jRemainder != 0) {
                    long[] fractionData = getFractionData(jRemainder, field);
                    long j6 = fractionData[0];
                    int i4 = (int) fractionData[1];
                    if ((2147483647L & j6) == j6) {
                        string = Integer.toString((int) j6);
                    } else {
                        string = Long.toString(j6);
                    }
                    int length = string.length();
                    while (length < i4) {
                        appendable.append('0');
                        i--;
                        i4--;
                    }
                    if (i < i4) {
                        while (i < i4 && length > 1 && string.charAt(length - 1) == '0') {
                            i4--;
                            length--;
                        }
                        if (length < string.length()) {
                            for (int i6 = 0; i6 < length; i6++) {
                                appendable.append(string.charAt(i6));
                            }
                            return;
                        }
                    }
                    appendable.append(string);
                    return;
                }
                while (true) {
                    i--;
                    if (i < 0) {
                        return;
                    } else {
                        appendable.append('0');
                    }
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i);
            }
        }
    }

    public static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        public MatchingParser(InternalParser[] internalParserArr) {
            int iEstimateParsedLength;
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.iParsedLengthEstimate = i;
                    return;
                }
                InternalParser internalParser = internalParserArr[length];
                if (internalParser != null && (iEstimateParsedLength = internalParser.estimateParsedLength()) > i) {
                    i = iEstimateParsedLength;
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        
            if (r6 > r12) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
        
            if (r6 != r12) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
        
            if (r3 == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
        
            return ~r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
        
            if (r4 == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
        
            r10.restoreState(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
        
            return r6;
         */
        @Override // org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r10, java.lang.CharSequence r11, int r12) {
            /*
                r9 = this;
                org.joda.time.format.InternalParser[] r0 = r9.iParsers
                int r1 = r0.length
                java.lang.Object r2 = r10.saveState()
                r3 = 0
                r4 = 0
                r6 = r12
                r7 = r6
                r5 = r3
            Lc:
                if (r5 >= r1) goto L41
                r8 = r0[r5]
                if (r8 != 0) goto L17
                if (r6 > r12) goto L15
                return r12
            L15:
                r3 = 1
                goto L41
            L17:
                int r8 = r8.parseInto(r10, r11, r12)
                if (r8 < r12) goto L35
                if (r8 <= r6) goto L3b
                int r4 = r11.length()
                if (r8 >= r4) goto L34
                int r4 = r5 + 1
                if (r4 >= r1) goto L34
                r4 = r0[r4]
                if (r4 != 0) goto L2e
                goto L34
            L2e:
                java.lang.Object r4 = r10.saveState()
                r6 = r8
                goto L3b
            L34:
                return r8
            L35:
                if (r8 >= 0) goto L3b
                int r8 = ~r8
                if (r8 <= r7) goto L3b
                r7 = r8
            L3b:
                r10.restoreState(r2)
                int r5 = r5 + 1
                goto Lc
            L41:
                if (r6 > r12) goto L4a
                if (r6 != r12) goto L48
                if (r3 == 0) goto L48
                goto L4a
            L48:
                int r10 = ~r7
                return r10
            L4a:
                if (r4 == 0) goto L4f
                r10.restoreState(r4)
            L4f:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.MatchingParser.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }
    }

    public static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        public NumberFormatter(DateTimeFieldType dateTimeFieldType, int i, boolean z4) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i;
            this.iSigned = z4;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i4;
            int i6;
            char cCharAt;
            int iMin = Math.min(this.iMaxParsedDigits, charSequence.length() - i);
            int i10 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i10 < iMin) {
                int i11 = i + i10;
                char cCharAt2 = charSequence.charAt(i11);
                if (i10 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.iSigned)) {
                    boolean z8 = cCharAt2 == '-';
                    boolean z9 = cCharAt2 == '+';
                    int i12 = i10 + 1;
                    if (i12 >= iMin || (cCharAt = charSequence.charAt(i11 + 1)) < '0' || cCharAt > '9') {
                        boolean z10 = z8;
                        z5 = z9;
                        z4 = z10;
                        break;
                    }
                    iMin = Math.min(iMin + 1, charSequence.length() - i);
                    boolean z11 = z8;
                    z5 = z9;
                    z4 = z11;
                    i10 = i12;
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i10++;
                }
            }
            if (i10 == 0) {
                return ~i;
            }
            if (i10 < 9) {
                int i13 = (z4 || z5) ? i + 1 : i;
                int i14 = i13 + 1;
                try {
                    int iCharAt = charSequence.charAt(i13) - '0';
                    i4 = i + i10;
                    while (i14 < i4) {
                        int i15 = (iCharAt << 3) + (iCharAt << 1);
                        int i16 = i14 + 1;
                        int iCharAt2 = (charSequence.charAt(i14) + i15) - 48;
                        i14 = i16;
                        iCharAt = iCharAt2;
                    }
                    i6 = z4 ? -iCharAt : iCharAt;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i;
                }
            } else if (z5) {
                i4 = i + i10;
                i6 = Integer.parseInt(charSequence.subSequence(i + 1, i4).toString());
            } else {
                int i17 = i + i10;
                i6 = Integer.parseInt(charSequence.subSequence(i, i17).toString());
                i4 = i17;
            }
            dateTimeParserBucket.saveField(this.iFieldType, i6);
            return i4;
        }
    }

    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        public StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i, this.iValue) ? this.iValue.length() + i : ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;

        private static final List<String> ALL_IDS;
        private static final List<String> BASE_GROUPED_IDS = new ArrayList();
        private static final Map<String, List<String>> GROUPED_IDS;
        static final int MAX_LENGTH;
        static final int MAX_PREFIX_LENGTH;

        static {
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.getAvailableIDs());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            GROUPED_IDS = new HashMap();
            int iMax = 0;
            int iMax2 = 0;
            for (String str : arrayList) {
                int iIndexOf = str.indexOf(47);
                if (iIndexOf >= 0) {
                    iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                    iMax2 = Math.max(iMax2, iIndexOf);
                    String strSubstring = str.substring(0, iIndexOf + 1);
                    String strSubstring2 = str.substring(iIndexOf);
                    Map<String, List<String>> map = GROUPED_IDS;
                    if (!map.containsKey(strSubstring)) {
                        map.put(strSubstring, new ArrayList());
                    }
                    map.get(strSubstring).add(strSubstring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                iMax = Math.max(iMax, str.length());
            }
            MAX_LENGTH = iMax;
            MAX_PREFIX_LENGTH = iMax2;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            String string;
            int length;
            String string2;
            List<String> list = BASE_GROUPED_IDS;
            int length2 = charSequence.length();
            int iMin = Math.min(length2, MAX_PREFIX_LENGTH + i);
            int i4 = i;
            while (true) {
                if (i4 >= iMin) {
                    string = "";
                    length = i;
                    break;
                }
                if (charSequence.charAt(i4) == '/') {
                    int i6 = i4 + 1;
                    string = charSequence.subSequence(i, i6).toString();
                    length = string.length() + i;
                    if (i4 < length2) {
                        StringBuilder sbW = a.w(string);
                        sbW.append(charSequence.charAt(i6));
                        string2 = sbW.toString();
                    } else {
                        string2 = string;
                    }
                    list = GROUPED_IDS.get(string2);
                    if (list == null) {
                        return ~i;
                    }
                } else {
                    i4++;
                }
            }
            String str = null;
            for (int i10 = 0; i10 < list.size(); i10++) {
                String str2 = list.get(i10);
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, length, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i;
            }
            dateTimeParserBucket.setZone(DateTimeZone.forID(string.concat(str)));
            return str.length() + length;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }
    }

    public static class TimeZoneName implements InternalPrinter, InternalParser {
        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        public TimeZoneName(int i, Map<String, DateTimeZone> map) {
            this.iType = i;
            this.iParseLookup = map;
        }

        private String print(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i = this.iType;
            return i != 0 ? i != 1 ? "" : dateTimeZone.getShortName(j, locale) : dateTimeZone.getName(j, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            Map<String, DateTimeZone> defaultTimeZoneNames = this.iParseLookup;
            if (defaultTimeZoneNames == null) {
                defaultTimeZoneNames = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : defaultTimeZoneNames.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i;
            }
            dateTimeParserBucket.setZone(defaultTimeZoneNames.get(str));
            return str.length() + i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j - ((long) i), dateTimeZone, locale));
        }
    }

    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        public TimeZoneOffset(String str, String str2, boolean z4, int i, int i4) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z4;
            if (i <= 0 || i4 < i) {
                throw new IllegalArgumentException();
            }
            if (i > 4) {
                i = 4;
                i4 = 4;
            }
            this.iMinFields = i;
            this.iMaxFields = i4;
        }

        private int digitCount(CharSequence charSequence, int i, int i4) {
            int i6 = 0;
            for (int iMin = Math.min(charSequence.length() - i, i4); iMin > 0; iMin--) {
                char cCharAt = charSequence.charAt(i + i6);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i6++;
            }
            return i6;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i = this.iMinFields;
            int i4 = (i + 1) << 1;
            if (this.iShowSeparators) {
                i4 += i - 1;
            }
            String str = this.iZeroOffsetPrintText;
            return (str == null || str.length() <= i4) ? i4 : this.iZeroOffsetPrintText.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:82:0x00e7 A[PHI: r0 r6
  0x00e7: PHI (r0v4 int) = (r0v3 int), (r0v5 int), (r0v3 int) binds: [B:75:0x00d2, B:93:0x0105, B:81:0x00e5] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r6v8 int) = (r6v7 int), (r6v9 int), (r6v7 int) binds: [B:75:0x00d2, B:93:0x0105, B:81:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r12, java.lang.CharSequence r13, int r14) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i == 0 && (str = this.iZeroOffsetPrintText) != null) {
                appendable.append(str);
                return;
            }
            if (i >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i = -i;
            }
            int i4 = i / DateTimeConstants.MILLIS_PER_HOUR;
            FormatUtils.appendPaddedInteger(appendable, i4, 2);
            if (this.iMaxFields == 1) {
                return;
            }
            int i6 = i - (i4 * DateTimeConstants.MILLIS_PER_HOUR);
            if (i6 != 0 || this.iMinFields > 1) {
                int i10 = i6 / 60000;
                if (this.iShowSeparators) {
                    appendable.append(':');
                }
                FormatUtils.appendPaddedInteger(appendable, i10, 2);
                if (this.iMaxFields == 2) {
                    return;
                }
                int i11 = i6 - (i10 * 60000);
                if (i11 != 0 || this.iMinFields > 2) {
                    int i12 = i11 / 1000;
                    if (this.iShowSeparators) {
                        appendable.append(':');
                    }
                    FormatUtils.appendPaddedInteger(appendable, i12, 2);
                    if (this.iMaxFields == 3) {
                        return;
                    }
                    int i13 = i11 - (i12 * 1000);
                    if (i13 != 0 || this.iMinFields > 3) {
                        if (this.iShowSeparators) {
                            appendable.append('.');
                        }
                        FormatUtils.appendPaddedInteger(appendable, i13, 3);
                    }
                }
            }
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    public static void appendUnknownString(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    public static boolean csStartsWith(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (charSequence.charAt(i + i4) != str.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    public static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = charSequence.charAt(i + i4);
            char cCharAt2 = str.charAt(i4);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object composite = this.iFormatter;
        if (composite == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj = this.iElementPairs.get(0);
                Object obj2 = this.iElementPairs.get(1);
                if (obj == null) {
                    composite = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    composite = obj;
                }
            }
            if (composite == null) {
                composite = new Composite(this.iElementPairs);
            }
            this.iFormatter = composite;
        }
        return composite;
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i, int i4) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i, i4);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i, int i4) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i4 < i) {
            i4 = i;
        }
        if (i < 0 || i4 <= 0) {
            throw new IllegalArgumentException();
        }
        return i <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i4, false)) : append0(new PaddedNumber(dateTimeFieldType, i4, false, i));
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i, false));
        }
        throw new IllegalArgumentException(s.f(i, "Illegal number of digits: "));
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i, true));
        }
        throw new IllegalArgumentException(s.f(i, "Illegal number of digits: "));
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i, int i4) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i4 < i) {
            i4 = i;
        }
        if (i < 0 || i4 <= 0) {
            throw new IllegalArgumentException();
        }
        return append0(new Fraction(dateTimeFieldType, i, i4));
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i, int i4) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i, i4);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i, int i4) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i, i4);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i, int i4) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i, i4);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i, int i4) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i, i4);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        return append0(new CharacterLiteral(c));
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i, int i4) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i4 < i) {
            i4 = i;
        }
        if (i < 0 || i4 <= 0) {
            throw new IllegalArgumentException();
        }
        return i <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i4, true)) : append0(new PaddedNumber(dateTimeFieldType, i4, true, i));
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z4, int i, int i4) {
        return append0(new TimeZoneOffset(str, str, z4, i, i4));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i) {
        return appendTwoDigitWeekyear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i) {
        return appendTwoDigitYear(i, false);
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i, int i4) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i, i4);
    }

    public DateTimeFormatterBuilder appendYear(int i, int i4) {
        return appendSignedDecimal(DateTimeFieldType.year(), i, i4);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i, int i4) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i, i4);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i, int i4) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i, i4);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        InternalParser internalParser = isParser(formatter) ? (InternalParser) formatter : null;
        if (internalPrinter == null && internalParser == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new DateTimeFormatter(internalPrinter, internalParser);
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.of((InternalParser) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.of((InternalPrinter) formatter);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }

    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        public TextField(DateTimeFieldType dateTimeFieldType, boolean z4) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z4;
        }

        private String print(long j, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            return this.iShort ? field.getAsShortText(j, locale) : field.getAsText(j, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int iIntValue;
            Map map;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> concurrentHashMap = cParseCache.get(locale);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                cParseCache.put(locale, concurrentHashMap);
            }
            Object[] objArr = concurrentHashMap.get(this.iFieldType);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i;
                }
                iIntValue = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap2.put(asShortText, bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                if ("en".equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap2.put("BCE", bool2);
                    concurrentHashMap2.put("bce", bool2);
                    concurrentHashMap2.put("CE", bool2);
                    concurrentHashMap2.put("ce", bool2);
                    iIntValue = 3;
                }
                concurrentHashMap.put(this.iFieldType, new Object[]{concurrentHashMap2, Integer.valueOf(iIntValue)});
                map = concurrentHashMap2;
            } else {
                Map map2 = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                map = map2;
            }
            for (int iMin = Math.min(charSequence.length(), iIntValue + i); iMin > i; iMin--) {
                String string = charSequence.subSequence(i, iMin).toString();
                if (map.containsKey(string)) {
                    dateTimeParserBucket.saveField(this.iFieldType, string, locale);
                    return iMin;
                }
            }
            return ~i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.iFieldType)) {
                DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
                if (this.iShort) {
                    return field.getAsShortText(readablePartial, locale);
                }
                return field.getAsText(readablePartial, locale);
            }
            return "�";
        }
    }

    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        public TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i, boolean z4) {
            this.iType = dateTimeFieldType;
            this.iPivot = i;
            this.iLenientParse = z4;
        }

        private int getTwoDigitYear(long j, Chronology chronology) {
            try {
                int i = this.iType.getField(chronology).get(j);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i4;
            int i6;
            int length = charSequence.length() - i;
            if (this.iLenientParse) {
                int i10 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (i10 < length) {
                    char cCharAt = charSequence.charAt(i + i10);
                    if (i10 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z5 = cCharAt == '-';
                        if (z5) {
                            i10++;
                        } else {
                            i++;
                            length--;
                        }
                        z4 = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i10++;
                    }
                }
                if (i10 == 0) {
                    return ~i;
                }
                if (z4 || i10 != 2) {
                    if (i10 >= 9) {
                        i4 = i10 + i;
                        i6 = Integer.parseInt(charSequence.subSequence(i, i4).toString());
                    } else {
                        int i11 = z5 ? i + 1 : i;
                        int i12 = i11 + 1;
                        try {
                            int iCharAt = charSequence.charAt(i11) - '0';
                            i4 = i10 + i;
                            while (i12 < i4) {
                                int iCharAt2 = (charSequence.charAt(i12) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
                                i12++;
                                iCharAt = iCharAt2;
                            }
                            i6 = z5 ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i;
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i6);
                    return i4;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i;
            }
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return ~i;
            }
            int i13 = cCharAt2 - '0';
            char cCharAt3 = charSequence.charAt(i + 1);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i;
            }
            int i14 = (((i13 << 3) + (i13 << 1)) + cCharAt3) - 48;
            int iIntValue = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                iIntValue = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i15 = iIntValue - 50;
            int i16 = i15 >= 0 ? i15 % 100 : ((iIntValue - 49) % 100) + 99;
            dateTimeParserBucket.saveField(this.iType, ((i15 + (i14 < i16 ? 100 : 0)) - i16) + i14);
            return i + 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j, chronology);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (!readablePartial.isSupported(this.iType)) {
                return -1;
            }
            try {
                int i = readablePartial.get(this.iType);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear < 0) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            } else {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            }
        }
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        int length = str.length();
        return length != 0 ? length != 1 ? append0(new StringLiteral(str)) : append0(new CharacterLiteral(str.charAt(0))) : this;
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z4, int i, int i4) {
        return append0(new TimeZoneOffset(str, str2, z4, i, i4));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i, boolean z4) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i, z4));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i, boolean z4) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i, z4));
    }

    public static class PaddedNumber extends NumberFormatter {
        protected final int iMinPrintedDigits;

        public PaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z4, int i4) {
            super(dateTimeFieldType, i, z4);
            this.iMinPrintedDigits = i4;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException unused) {
                    DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
                    return;
                }
            }
            DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
        }
    }

    public static class UnpaddedNumber extends NumberFormatter {
        public UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z4) {
            super(dateTimeFieldType, i, z4);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
                    return;
                } catch (RuntimeException unused) {
                    appendable.append(Utf8.REPLACEMENT_CHARACTER);
                    return;
                }
            }
            appendable.append(Utf8.REPLACEMENT_CHARACTER);
        }
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), null);
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int iEstimatePrintedLength = 0;
                for (int i = 0; i < size; i++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i);
                    iEstimatePrintedLength += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i] = internalPrinter;
                }
                this.iPrintedLengthEstimate = iEstimatePrintedLength;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int iEstimateParsedLength = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i4);
                iEstimateParsedLength += internalParser.estimateParsedLength();
                this.iParsers[i4] = internalParser;
            }
            this.iParsedLengthEstimate = iEstimateParsedLength;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        public boolean isParser() {
            return this.iParsers != null;
        }

        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = internalParserArr.length;
            for (int i4 = 0; i4 < length && i >= 0; i4++) {
                i = internalParserArr[i4].parseInto(dateTimeParserBucket, charSequence, i);
            }
            return i;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, j, chronology, i, dateTimeZone, locale2);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (InternalPrinter internalPrinter : internalPrinterArr) {
                    internalPrinter.printTo(appendable, readablePartial, locale);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr != null) {
            int length = dateTimeParserArr.length;
            int i = 0;
            if (length == 1) {
                if (dateTimeParserArr[0] != null) {
                    return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParserArr[0]));
                }
                throw new IllegalArgumentException("No parser supplied");
            }
            InternalParser[] internalParserArr = new InternalParser[length];
            while (i < length - 1) {
                InternalParser internalParserOf = DateTimeParserInternalParser.of(dateTimeParserArr[i]);
                internalParserArr[i] = internalParserOf;
                if (internalParserOf == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i++;
            }
            internalParserArr[i] = DateTimeParserInternalParser.of(dateTimeParserArr[i]);
            return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), new MatchingParser(internalParserArr));
        }
        throw new IllegalArgumentException("No parsers supplied");
    }
}
