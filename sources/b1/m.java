package b1;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends AbstractC0847a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8321b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8322d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8323g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f8324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8325l;

    public m(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f8320a = num;
        this.f8321b = str;
        this.c = str2;
        this.f8322d = str3;
        this.e = str4;
        this.f = str5;
        this.f8323g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.f8324k = str10;
        this.f8325l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0847a) {
            AbstractC0847a abstractC0847a = (AbstractC0847a) obj;
            Integer num = this.f8320a;
            if (num != null ? num.equals(((m) abstractC0847a).f8320a) : ((m) abstractC0847a).f8320a == null) {
                String str = this.f8321b;
                if (str != null ? str.equals(((m) abstractC0847a).f8321b) : ((m) abstractC0847a).f8321b == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(((m) abstractC0847a).c) : ((m) abstractC0847a).c == null) {
                        String str3 = this.f8322d;
                        if (str3 != null ? str3.equals(((m) abstractC0847a).f8322d) : ((m) abstractC0847a).f8322d == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(((m) abstractC0847a).e) : ((m) abstractC0847a).e == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(((m) abstractC0847a).f) : ((m) abstractC0847a).f == null) {
                                    String str6 = this.f8323g;
                                    if (str6 != null ? str6.equals(((m) abstractC0847a).f8323g) : ((m) abstractC0847a).f8323g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((m) abstractC0847a).h) : ((m) abstractC0847a).h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((m) abstractC0847a).i) : ((m) abstractC0847a).i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((m) abstractC0847a).j) : ((m) abstractC0847a).j == null) {
                                                    String str10 = this.f8324k;
                                                    if (str10 != null ? str10.equals(((m) abstractC0847a).f8324k) : ((m) abstractC0847a).f8324k == null) {
                                                        String str11 = this.f8325l;
                                                        if (str11 != null ? str11.equals(((m) abstractC0847a).f8325l) : ((m) abstractC0847a).f8325l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f8320a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f8321b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8322d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f8323g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f8324k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f8325l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f8320a);
        sb2.append(", model=");
        sb2.append(this.f8321b);
        sb2.append(", hardware=");
        sb2.append(this.c);
        sb2.append(", device=");
        sb2.append(this.f8322d);
        sb2.append(", product=");
        sb2.append(this.e);
        sb2.append(", osBuild=");
        sb2.append(this.f);
        sb2.append(", manufacturer=");
        sb2.append(this.f8323g);
        sb2.append(", fingerprint=");
        sb2.append(this.h);
        sb2.append(", locale=");
        sb2.append(this.i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.f8324k);
        sb2.append(", applicationBuild=");
        return We.s.p(sb2, this.f8325l, "}");
    }
}
