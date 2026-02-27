package Y3;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6737b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6738d;
    public final int e;
    public int f;

    public a(int i, int i4, int i6, int i10, int i11) {
        this.f6736a = i11;
        switch (i11) {
            case 1:
                this.f = -1;
                this.f6737b = i;
                this.c = i4;
                this.f6738d = i6;
                this.e = i10;
                break;
            default:
                this.f6737b = i;
                this.c = i10;
                this.f6738d = i4;
                this.e = i6;
                this.f = i4 + i6;
                break;
        }
    }

    public boolean a(int i) {
        if (i != -1) {
            return this.f6738d == (i % 3) * 3;
        }
        return false;
    }

    public void b() {
        this.f = (this.f6738d / 3) + ((this.e / 30) * 3);
    }

    public String toString() {
        switch (this.f6736a) {
            case 1:
                return this.f + "|" + this.e;
            default:
                return super.toString();
        }
    }
}
