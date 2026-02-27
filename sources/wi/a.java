package Wi;

import We.s;
import dOYHB6.tiZVw8.numX49;
import io.split.android.engine.matchers.semver.SemverParseException;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f6449b;
    public final Long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f6450d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6451g;

    public a(String str) throws SemverParseException {
        this.f6450d = new String[0];
        String strTnTj78 = numX49.tnTj78("bkfP");
        int iIndexOf = str.indexOf(strTnTj78);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            this.f = strSubstring;
            if (strSubstring == null || strSubstring.isEmpty()) {
                throw new SemverParseException(numX49.tnTj78("bkfZ"));
            }
            str = str.substring(0, iIndexOf);
        }
        String strTnTj782 = numX49.tnTj78("bkfb");
        int iIndexOf2 = str.indexOf(strTnTj782);
        String strTnTj783 = numX49.tnTj78("bkf2");
        if (iIndexOf2 != -1) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(strTnTj783);
            this.f6450d = strArrSplit;
            if (strArrSplit != null) {
                for (String str2 : strArrSplit) {
                    if (str2 != null && !str2.isEmpty()) {
                    }
                }
                str = str.substring(0, iIndexOf2);
            }
            throw new SemverParseException(numX49.tnTj78("bkfr"));
        }
        this.e = true;
        String[] strArrSplit2 = str.split(strTnTj783);
        if (strArrSplit2.length != 3) {
            String strTnTj784 = numX49.tnTj78("bkfL");
            Ri.a.g(strTnTj784.concat(str));
            throw new SemverParseException(strTnTj784.concat(str));
        }
        this.f6448a = Long.valueOf(Long.parseLong(strArrSplit2[0]));
        this.f6449b = Long.valueOf(Long.parseLong(strArrSplit2[1]));
        this.c = Long.valueOf(Long.parseLong(strArrSplit2[2]));
        String string = this.f6448a + strTnTj783 + this.f6449b + strTnTj783 + this.c;
        String[] strArr = this.f6450d;
        if (strArr != null && strArr.length != 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f6450d;
                if (i >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i];
                if (str3 != null) {
                    try {
                        Double.parseDouble(str3);
                        String[] strArr3 = this.f6450d;
                        strArr3[i] = String.valueOf(Long.parseLong(strArr3[i]));
                    } catch (NumberFormatException unused) {
                    }
                }
                i++;
            }
            StringBuilder sbV = s.v(string, strTnTj782);
            String[] strArr4 = this.f6450d;
            StringBuilder sb2 = new StringBuilder();
            if (strArr4.length > 0) {
                sb2.append((CharSequence) strArr4[0]);
                for (int i4 = 1; i4 < strArr4.length; i4++) {
                    sb2.append((CharSequence) strTnTj783);
                    sb2.append((CharSequence) strArr4[i4]);
                }
            }
            sbV.append(sb2.toString());
            string = sbV.toString();
        }
        String str4 = this.f;
        if (str4 != null && !str4.isEmpty()) {
            StringBuilder sbV2 = s.v(string, strTnTj78);
            sbV2.append(this.f);
            string = sbV2.toString();
        }
        this.f6451g = string;
    }

    public static a a(String str) {
        try {
            return new a(str);
        } catch (Exception e) {
            Ri.a.g(String.format(numX49.tnTj78("bkfk"), e.getMessage()));
            return null;
        }
    }

    public final int b(a aVar) {
        if (this.f6451g.equals(aVar.f6451g)) {
            return 0;
        }
        int iCompare = Long.compare(this.f6448a.longValue(), aVar.f6448a.longValue());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(this.f6449b.longValue(), aVar.f6449b.longValue());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Long.compare(this.c.longValue(), aVar.c.longValue());
        if (iCompare3 != 0) {
            return iCompare3;
        }
        boolean z4 = this.e;
        if (!z4 && aVar.e) {
            return -1;
        }
        if (z4 && !aVar.e) {
            return 1;
        }
        int iMin = Math.min(this.f6450d.length, aVar.f6450d.length);
        for (int i = 0; i < iMin; i++) {
            if (!this.f6450d[i].equals(aVar.f6450d[i])) {
                String str = this.f6450d[i];
                if (str != null) {
                    try {
                        Double.parseDouble(str);
                        String str2 = aVar.f6450d[i];
                        if (str2 != null) {
                            Double.parseDouble(str2);
                            return Long.compare(Long.parseLong(this.f6450d[i]), Long.parseLong(aVar.f6450d[i]));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                return this.f6450d[i].compareTo(aVar.f6450d[i]);
            }
        }
        return Integer.compare(this.f6450d.length, aVar.f6450d.length);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f6451g.equals(((a) obj).f6451g);
    }
}
