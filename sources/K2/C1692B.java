package k2;

import d4.AbstractC1331a;

/* JADX INFO: renamed from: k2.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1692B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17829b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17830d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17831g;
    public String h;
    public String i;
    public C1701K j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1698H f17832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1695E f17833l;
    public byte m;

    public final C1693C a() {
        if (this.m == 1 && this.f17828a != null && this.f17829b != null && this.f17830d != null && this.h != null && this.i != null) {
            return new C1693C(this.f17828a, this.f17829b, this.c, this.f17830d, this.e, this.f, this.f17831g, this.h, this.i, this.j, this.f17832k, this.f17833l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f17828a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f17829b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.m) == 0) {
            sb2.append(" platform");
        }
        if (this.f17830d == null) {
            sb2.append(" installationUuid");
        }
        if (this.h == null) {
            sb2.append(" buildVersion");
        }
        if (this.i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
