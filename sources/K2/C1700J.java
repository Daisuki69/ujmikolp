package k2;

import d4.AbstractC1331a;
import java.util.List;

/* JADX INFO: renamed from: k2.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1700J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17856b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17857d;
    public Long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1702L f17858g;
    public C1737l0 h;
    public C1735k0 i;
    public C1705O j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f17859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17860l;
    public byte m;

    public final C1701K a() {
        String str;
        String str2;
        C1702L c1702l;
        if (this.m == 7 && (str = this.f17855a) != null && (str2 = this.f17856b) != null && (c1702l = this.f17858g) != null) {
            return new C1701K(str, str2, this.c, this.f17857d, this.e, this.f, c1702l, this.h, this.i, this.j, this.f17859k, this.f17860l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f17855a == null) {
            sb2.append(" generator");
        }
        if (this.f17856b == null) {
            sb2.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f17858g == null) {
            sb2.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
