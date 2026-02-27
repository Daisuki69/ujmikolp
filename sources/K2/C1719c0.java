package k2;

import d4.AbstractC1331a;

/* JADX INFO: renamed from: k2.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1719c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f17924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17925b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17926d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f17927g;

    public final C1721d0 a() {
        if (this.f17927g == 31) {
            return new C1721d0(this.f17924a, this.f17925b, this.c, this.f17926d, this.e, this.f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f17927g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.f17927g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.f17927g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.f17927g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.f17927g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
