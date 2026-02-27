package U1;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5895b;

    public b(boolean z4) {
        this.f5894a = 0;
        this.f5895b = z4;
    }

    public String toString() {
        switch (this.f5894a) {
            case 1:
                return this.f5895b ? "Main memory only with no size restriction" : "Scratch file only with no size restriction";
            default:
                return super.toString();
        }
    }

    public b() {
        this.f5894a = 1;
        this.f5895b = true;
    }
}
