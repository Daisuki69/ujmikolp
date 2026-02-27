package k2;

import d4.AbstractC1331a;

/* JADX INFO: renamed from: k2.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1715a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17913b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17914d;
    public byte e;

    public final C1717b0 a() {
        String str;
        if (this.e == 7 && (str = this.f17912a) != null) {
            return new C1717b0(str, this.f17913b, this.c, this.f17914d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f17912a == null) {
            sb2.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
