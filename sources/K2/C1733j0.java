package k2;

import d4.AbstractC1331a;

/* JADX INFO: renamed from: k2.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1733j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17967b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17968d;
    public byte e;

    public final C1735k0 a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.f17967b) != null && (str2 = this.c) != null) {
            return new C1735k0(str, this.f17966a, str2, this.f17968d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f17967b == null) {
            sb2.append(" version");
        }
        if (this.c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
