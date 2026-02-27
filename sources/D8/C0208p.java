package D8;

/* JADX INFO: renamed from: D8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0208p implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212u f1061b;

    public /* synthetic */ C0208p(C0212u c0212u, int i) {
        this.f1060a = i;
        this.f1061b = c0212u;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f1060a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f1061b.e0(it);
                break;
            case 1:
                Throwable p02 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                this.f1061b.e0(p02);
                break;
            default:
                Throwable p03 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                this.f1061b.e0(p03);
                break;
        }
    }
}
