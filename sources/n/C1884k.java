package n;

/* JADX INFO: renamed from: n.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1884k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18475b;
    public final /* synthetic */ s c;

    public /* synthetic */ C1884k(s sVar, String str, int i) {
        this.f18474a = i;
        this.c = sVar;
        this.f18475b = str;
    }

    @Override // n.r
    public final void run() {
        switch (this.f18474a) {
            case 0:
                this.c.l(this.f18475b);
                break;
            case 1:
                this.c.n(this.f18475b);
                break;
            default:
                this.c.k(this.f18475b);
                break;
        }
    }
}
