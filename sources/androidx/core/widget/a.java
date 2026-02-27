package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContentLoadingProgressBar f7828b;

    public /* synthetic */ a(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.f7827a = i;
        this.f7828b = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7827a) {
            case 0:
                this.f7828b.lambda$new$0();
                break;
            case 1:
                this.f7828b.lambda$new$1();
                break;
            case 2:
                this.f7828b.showOnUiThread();
                break;
            default:
                this.f7828b.hideOnUiThread();
                break;
        }
    }
}
