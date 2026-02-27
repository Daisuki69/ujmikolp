package a3;

import d4.AbstractC1331a;

/* JADX INFO: renamed from: a3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0625b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6987b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6988d;
    public long e;
    public byte f;

    public final C0626c a() {
        if (this.f == 1 && this.f6986a != null && this.f6987b != null && this.c != null && this.f6988d != null) {
            return new C0626c(this.f6986a, this.f6987b, this.c, this.f6988d, this.e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6986a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f6987b == null) {
            sb2.append(" variantId");
        }
        if (this.c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f6988d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
