package k2;

import d4.AbstractC1331a;

/* JADX INFO: renamed from: k2.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1706P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17879b;
    public C1708S c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1721d0 f17880d;
    public C1723e0 e;
    public C1731i0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f17881g;

    public final C1707Q a() {
        String str;
        C1708S c1708s;
        C1721d0 c1721d0;
        if (this.f17881g == 1 && (str = this.f17879b) != null && (c1708s = this.c) != null && (c1721d0 = this.f17880d) != null) {
            return new C1707Q(this.f17878a, str, c1708s, c1721d0, this.e, this.f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f17881g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f17879b == null) {
            sb2.append(" type");
        }
        if (this.c == null) {
            sb2.append(" app");
        }
        if (this.f17880d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
