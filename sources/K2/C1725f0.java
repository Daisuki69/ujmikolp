package k2;

import d4.AbstractC1331a;

/* JADX INFO: renamed from: k2.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1725f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1729h0 f17942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17943b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17944d;
    public byte e;

    public final C1727g0 a() {
        C1729h0 c1729h0;
        String str;
        String str2;
        if (this.e == 1 && (c1729h0 = this.f17942a) != null && (str = this.f17943b) != null && (str2 = this.c) != null) {
            return new C1727g0(c1729h0, str, str2, this.f17944d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f17942a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f17943b == null) {
            sb2.append(" parameterKey");
        }
        if (this.c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
