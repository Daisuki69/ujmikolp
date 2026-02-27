package k2;

import d4.AbstractC1331a;

/* JADX INFO: renamed from: k2.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1704N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17871b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17872d;
    public long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17873g;
    public String h;
    public String i;
    public byte j;

    public final C1705O a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.f17871b) != null && (str2 = this.h) != null && (str3 = this.i) != null) {
            return new C1705O(this.f17870a, str, this.c, this.f17872d, this.e, this.f, this.f17873g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f17871b == null) {
            sb2.append(" model");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
