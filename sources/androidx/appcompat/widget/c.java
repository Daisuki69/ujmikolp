package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f7344b;

    public /* synthetic */ c(Toolbar toolbar, int i) {
        this.f7343a = i;
        this.f7344b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7343a) {
            case 0:
                this.f7344b.collapseActionView();
                break;
            default:
                this.f7344b.invalidateMenu();
                break;
        }
    }
}
