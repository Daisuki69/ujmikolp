package n;

/* JADX INFO: renamed from: n.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1886m implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18479b;
    public final /* synthetic */ s c;

    public /* synthetic */ C1886m(s sVar, int i, int i4) {
        this.f18478a = i4;
        this.c = sVar;
        this.f18479b = i;
    }

    @Override // n.r
    public final void run() {
        switch (this.f18478a) {
            case 0:
                this.c.i(this.f18479b);
                break;
            case 1:
                this.c.m(this.f18479b);
                break;
            default:
                this.c.j(this.f18479b);
                break;
        }
    }
}
