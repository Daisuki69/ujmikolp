package k3;

import We.s;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.Global;
import com.google.firebase.messaging.r;
import com.google.i18n.phonenumbers.NumberParseException;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o1.AbstractC1955a;
import s.AbstractC2217b;

/* JADX INFO: renamed from: k3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1757b {
    public static final Logger h = Logger.getLogger(C1757b.class.getName());
    public static final Map i;
    public static final Map j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f18034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f18035l;
    public static final Pattern m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f18036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f18037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f18038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f18039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f18040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f18041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f18042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static C1757b f18043u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f18044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18045b;
    public final C1258f0 c = new C1258f0(17);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f18046d = new HashSet(35);
    public final L e = new L(20);
    public final HashSet f = new HashSet(320);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f18047g = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(52, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        i = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        j = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch2 : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch2.charValue())), ch2);
            map6.put(ch2, ch2);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map map7 = i;
        sb2.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb2.toString();
        f18034k = Pattern.compile("[+＋]+");
        f18035l = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        m = Pattern.compile("(\\p{Nd})");
        f18036n = Pattern.compile("[+＋\\p{Nd}]");
        f18037o = Pattern.compile("[\\\\/] *x");
        f18038p = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f18039q = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strJ = s.j("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        f18040r = Pattern.compile("(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[,;xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)$", 66);
        f18041s = Pattern.compile(strJ + "(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[,;xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)?", 66);
        Pattern.compile("(\\D+)");
        f18042t = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        f18043u = null;
    }

    public C1757b(r rVar, HashMap map) {
        this.f18044a = rVar;
        this.f18045b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f18047g.add(entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f18046d.addAll((Collection) map.get(1));
    }

    public static synchronized C1757b b() {
        try {
            if (f18043u == null) {
                z2.d dVar = AbstractC1756a.f18032a;
                k(new C1757b(new r(23), AbstractC1955a.n()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f18043u;
    }

    public static C1761f d(C1759d c1759d, int i4) {
        switch (AbstractC2217b.c(i4)) {
            case 0:
            case 2:
                return c1759d.f18070d;
            case 1:
                return c1759d.f;
            case 3:
                return c1759d.h;
            case 4:
                return c1759d.j;
            case 5:
                return c1759d.f18081l;
            case 6:
                return c1759d.f18087p;
            case 7:
                return c1759d.f18083n;
            case 8:
                return c1759d.f18091r;
            case 9:
                return c1759d.f18093t;
            case 10:
                return c1759d.f18097x;
            default:
                return c1759d.f18067b;
        }
    }

    public static void g(StringBuilder sb2) {
        if (!f18039q.matcher(sb2).matches()) {
            sb2.replace(0, sb2.length(), h(sb2));
            return;
        }
        int length = sb2.length();
        StringBuilder sb3 = new StringBuilder(sb2.length());
        for (int i4 = 0; i4 < sb2.length(); i4++) {
            Character ch2 = (Character) j.get(Character.valueOf(Character.toUpperCase(sb2.charAt(i4))));
            if (ch2 != null) {
                sb3.append(ch2);
            }
        }
        sb2.replace(0, length, sb3.toString());
    }

    public static String h(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            int iDigit = Character.digit(charSequence.charAt(i4), 10);
            if (iDigit != -1) {
                sb2.append(iDigit);
            }
        }
        return sb2.toString();
    }

    public static void j(StringBuilder sb2, int i4, int i6) {
        int iC = AbstractC2217b.c(i6);
        if (iC == 0) {
            sb2.insert(0, i4).insert(0, '+');
        } else if (iC == 1) {
            sb2.insert(0, Global.BLANK).insert(0, i4).insert(0, '+');
        } else {
            if (iC != 3) {
                return;
            }
            sb2.insert(0, Global.HYPHEN).insert(0, i4).insert(0, '+').insert(0, "tel:");
        }
    }

    public static synchronized void k(C1757b c1757b) {
        f18043u = c1757b;
    }

    public static int l(StringBuilder sb2, C1759d c1759d, int i4) {
        C1761f c1761fD = d(c1759d, i4);
        ArrayList arrayList = c1761fD.c.isEmpty() ? c1759d.f18067b.c : c1761fD.c;
        ArrayList arrayList2 = c1761fD.f18102d;
        if (i4 == 3) {
            C1761f c1761fD2 = d(c1759d, 1);
            if (!((c1761fD2.c.size() == 1 && ((Integer) c1761fD2.c.get(0)).intValue() == -1) ? false : true)) {
                return l(sb2, c1759d, 2);
            }
            C1761f c1761fD3 = d(c1759d, 2);
            if (c1761fD3.c.size() != 1 || ((Integer) c1761fD3.c.get(0)).intValue() != -1) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = c1761fD3.c;
                if (arrayList4.size() == 0) {
                    arrayList4 = c1759d.f18067b.c;
                }
                arrayList3.addAll(arrayList4);
                Collections.sort(arrayList3);
                boolean zIsEmpty = arrayList2.isEmpty();
                ArrayList arrayList5 = c1761fD3.f18102d;
                if (zIsEmpty) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList6 = new ArrayList(arrayList2);
                    arrayList6.addAll(arrayList5);
                    Collections.sort(arrayList6);
                    arrayList2 = arrayList6;
                }
                arrayList = arrayList3;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = sb2.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return 2;
        }
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if (iIntValue != length) {
            if (iIntValue > length) {
                return 4;
            }
            if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
                return 6;
            }
            if (!arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length))) {
                return 5;
            }
        }
        return 1;
    }

    public final String a(C1762g c1762g, int i4) {
        L l6;
        C1758c c1758c;
        int i6;
        StringBuilder sb2 = new StringBuilder(20);
        sb2.setLength(0);
        int i10 = c1762g.f18103a;
        StringBuilder sb3 = new StringBuilder();
        if (c1762g.f && (i6 = c1762g.h) > 0) {
            char[] cArr = new char[i6];
            Arrays.fill(cArr, '0');
            sb3.append(new String(cArr));
        }
        sb3.append(c1762g.f18104b);
        String string = sb3.toString();
        if (i4 == 1) {
            sb2.append(string);
            j(sb2, i10, 1);
        } else {
            Integer numValueOf = Integer.valueOf(i10);
            HashMap map = this.f18045b;
            if (map.containsKey(numValueOf)) {
                List list = (List) map.get(Integer.valueOf(i10));
                C1759d c1759dC = c(i10, list == null ? "ZZ" : (String) list.get(0));
                Iterator it = ((c1759dC.f18082l0.size() == 0 || i4 == 3) ? c1759dC.f18080k0 : c1759dC.f18082l0).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    l6 = this.e;
                    if (!zHasNext) {
                        c1758c = null;
                        break;
                    }
                    c1758c = (C1758c) it.next();
                    int size = c1758c.c.size();
                    if (size != 0) {
                        if (!l6.d((String) c1758c.c.get(size - 1)).matcher(string).lookingAt()) {
                            continue;
                        }
                    }
                    if (l6.d(c1758c.f18048a).matcher(string).matches()) {
                        break;
                    }
                }
                if (c1758c != null) {
                    String str = c1758c.f18049b;
                    Matcher matcher = l6.d(c1758c.f18048a).matcher(string);
                    String str2 = c1758c.e;
                    string = (i4 != 3 || str2 == null || str2.length() <= 0) ? matcher.replaceAll(str) : matcher.replaceAll(f18042t.matcher(str).replaceFirst(str2));
                    if (i4 == 4) {
                        Matcher matcher2 = f18035l.matcher(string);
                        if (matcher2.lookingAt()) {
                            string = matcher2.replaceFirst("");
                        }
                        string = matcher2.reset(string).replaceAll(Global.HYPHEN);
                    }
                }
                sb2.append(string);
                if (c1762g.c && c1762g.f18105d.length() > 0) {
                    if (i4 == 4) {
                        sb2.append(";ext=");
                        sb2.append(c1762g.f18105d);
                    } else if (c1759dC.f18071d0) {
                        sb2.append(c1759dC.f18072e0);
                        sb2.append(c1762g.f18105d);
                    } else {
                        sb2.append(" ext. ");
                        sb2.append(c1762g.f18105d);
                    }
                }
                j(sb2, i10, i4);
            } else {
                sb2.append(string);
            }
        }
        return sb2.toString();
    }

    public final C1759d c(int i4, String str) {
        boolean zEquals = "001".equals(str);
        r rVar = this.f18044a;
        if (!zEquals) {
            if (str == null || !this.f.contains(str)) {
                return null;
            }
            return AbstractC1756a.a(str, (ConcurrentHashMap) rVar.f9804d, (String) rVar.f9803b, (z2.d) rVar.c);
        }
        if (this.f18045b.containsKey(Integer.valueOf(i4))) {
            rVar.getClass();
            List list = (List) AbstractC1955a.n().get(Integer.valueOf(i4));
            if (list.size() == 1 && "001".equals(list.get(0))) {
                return AbstractC1756a.a(Integer.valueOf(i4), (ConcurrentHashMap) rVar.e, (String) rVar.f9803b, (z2.d) rVar.c);
            }
        }
        return null;
    }

    public final int e(CharSequence charSequence, C1759d c1759d, StringBuilder sb2, C1762g c1762g) throws NumberParseException {
        int i4 = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb3 = new StringBuilder(charSequence);
        String str = c1759d != null ? c1759d.f18063Y : "NonMatch";
        if (sb3.length() != 0) {
            Matcher matcher = f18034k.matcher(sb3);
            if (matcher.lookingAt()) {
                sb3.delete(0, matcher.end());
                g(sb3);
            } else {
                Pattern patternD = this.e.d(str);
                g(sb3);
                Matcher matcher2 = patternD.matcher(sb3);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    Matcher matcher3 = m.matcher(sb3.substring(iEnd));
                    if (!matcher3.find() || !h(matcher3.group(1)).equals("0")) {
                        sb3.delete(0, iEnd);
                    }
                }
            }
            if (sb3.length() <= 2) {
                throw new NumberParseException(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            if (sb3.length() != 0 && sb3.charAt(0) != '0') {
                int length = sb3.length();
                int i6 = 1;
                while (true) {
                    if (i6 > 3 || i6 > length) {
                        break;
                    }
                    int i10 = Integer.parseInt(sb3.substring(0, i6));
                    if (this.f18045b.containsKey(Integer.valueOf(i10))) {
                        sb2.append(sb3.substring(i6));
                        i4 = i10;
                        break;
                    }
                    i6++;
                }
            }
            if (i4 == 0) {
                throw new NumberParseException(1, "Country calling code supplied was not recognised.");
            }
            c1762g.f18103a = i4;
            return i4;
        }
        if (c1759d != null) {
            int i11 = c1759d.f18062X;
            String strValueOf = String.valueOf(i11);
            String string = sb3.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb4 = new StringBuilder(string.substring(strValueOf.length()));
                C1761f c1761f = c1759d.f18067b;
                f(sb4, c1759d, null);
                C1258f0 c1258f0 = this.c;
                if ((!c1258f0.b(sb3, c1761f) && c1258f0.b(sb4, c1761f)) || l(sb3, c1759d, 12) == 6) {
                    sb2.append((CharSequence) sb4);
                    c1762g.f18103a = i11;
                    return i11;
                }
            }
        }
        c1762g.f18103a = 0;
        return 0;
    }

    public final void f(StringBuilder sb2, C1759d c1759d, StringBuilder sb3) {
        int length = sb2.length();
        String str = c1759d.f18075g0;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.e.d(str).matcher(sb2);
        if (matcher.lookingAt()) {
            C1761f c1761f = c1759d.f18067b;
            C1258f0 c1258f0 = this.c;
            boolean zB = c1258f0.b(sb2, c1761f);
            int iGroupCount = matcher.groupCount();
            String str2 = c1759d.f18077i0;
            if (str2 == null || str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!zB || c1258f0.b(sb2.substring(matcher.end()), c1761f)) {
                    if (sb3 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb4 = new StringBuilder(sb2);
            sb4.replace(0, length, matcher.replaceFirst(str2));
            if (!zB || c1258f0.b(sb4.toString(), c1761f)) {
                if (sb3 != null && iGroupCount > 1) {
                    sb3.append(matcher.group(1));
                }
                sb2.replace(0, sb2.length(), sb4.toString());
            }
        }
    }

    public final C1762g i(String str, String str2) {
        CharSequence charSequenceSubSequence;
        C1759d c1759dC;
        int iE;
        C1762g c1762g = new C1762g();
        c1762g.f18103a = 0;
        c1762g.f18104b = 0L;
        String strGroup = "";
        c1762g.f18105d = "";
        c1762g.f = false;
        c1762g.h = 1;
        c1762g.i = "";
        c1762g.f18107k = "";
        c1762g.j = 5;
        if (str == null) {
            throw new NumberParseException(2, "The phone number supplied was null.");
        }
        if (str.length() > 250) {
            throw new NumberParseException(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb2 = new StringBuilder();
        String string = str.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        if (iIndexOf >= 0) {
            int i4 = iIndexOf + 15;
            if (i4 < string.length() - 1 && string.charAt(i4) == '+') {
                int iIndexOf2 = string.indexOf(59, i4);
                if (iIndexOf2 > 0) {
                    sb2.append(string.substring(i4, iIndexOf2));
                } else {
                    sb2.append(string.substring(i4));
                }
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb2.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = f18036n.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = f18038p.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = f18037o.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb2.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb2.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb2.delete(iIndexOf4, sb2.length());
        }
        int length = sb2.length();
        Pattern pattern = f18041s;
        if (!(length < 2 ? false : pattern.matcher(sb2).matches())) {
            throw new NumberParseException(2, "The string supplied did not seem to be a phone number.");
        }
        HashSet hashSet = this.f;
        boolean zContains = hashSet.contains(str2);
        Pattern pattern2 = f18034k;
        if (!zContains && (sb2.length() == 0 || !pattern2.matcher(sb2).lookingAt())) {
            throw new NumberParseException(1, "Missing or invalid default region.");
        }
        Matcher matcher4 = f18040r.matcher(sb2);
        if (matcher4.find()) {
            String strSubstring = sb2.substring(0, matcher4.start());
            if (strSubstring.length() < 2 ? false : pattern.matcher(strSubstring).matches()) {
                int iGroupCount = matcher4.groupCount();
                int i6 = 1;
                while (true) {
                    if (i6 > iGroupCount) {
                        break;
                    }
                    if (matcher4.group(i6) != null) {
                        strGroup = matcher4.group(i6);
                        sb2.delete(matcher4.start(), sb2.length());
                        break;
                    }
                    i6++;
                }
            }
        }
        if (strGroup.length() > 0) {
            c1762g.c = true;
            c1762g.f18105d = strGroup;
        }
        if (hashSet.contains(str2)) {
            r rVar = this.f18044a;
            c1759dC = AbstractC1756a.a(str2, (ConcurrentHashMap) rVar.f9804d, (String) rVar.f9803b, (z2.d) rVar.c);
        } else {
            c1759dC = null;
        }
        StringBuilder sb3 = new StringBuilder();
        try {
            iE = e(sb2, c1759dC, sb3, c1762g);
        } catch (NumberParseException e) {
            Matcher matcher5 = pattern2.matcher(sb2);
            int i10 = e.f10038a;
            if (i10 != 1 || !matcher5.lookingAt()) {
                throw new NumberParseException(i10, e.getMessage());
            }
            iE = e(sb2.substring(matcher5.end()), c1759dC, sb3, c1762g);
            if (iE == 0) {
                throw new NumberParseException(1, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iE != 0) {
            List list = (List) this.f18045b.get(Integer.valueOf(iE));
            String str3 = list == null ? "ZZ" : (String) list.get(0);
            if (!str3.equals(str2)) {
                c1759dC = c(iE, str3);
            }
        } else {
            g(sb2);
            sb3.append((CharSequence) sb2);
            c1762g.f18103a = c1759dC.f18062X;
        }
        if (sb3.length() < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (c1759dC != null) {
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder(sb3);
            f(sb5, c1759dC, sb4);
            int iL = l(sb5, c1759dC, 12);
            if (iL != 4 && iL != 2 && iL != 5) {
                sb3 = sb5;
            }
        }
        int length2 = sb3.length();
        if (length2 < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(5, "The string supplied is too long to be a phone number.");
        }
        if (sb3.length() > 1 && sb3.charAt(0) == '0') {
            c1762g.e = true;
            c1762g.f = true;
            int i11 = 1;
            while (i11 < sb3.length() - 1 && sb3.charAt(i11) == '0') {
                i11++;
            }
            if (i11 != 1) {
                c1762g.f18106g = true;
                c1762g.h = i11;
            }
        }
        c1762g.f18104b = Long.parseLong(sb3.toString());
        return c1762g;
    }
}
