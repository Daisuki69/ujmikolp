package androidx.activity;

import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7316b;

    public /* synthetic */ e(Object obj, int i) {
        this.f7315a = i;
        this.f7316b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7315a) {
            case 0:
                ComponentActivity.ReportFullyDrawnExecutorImpl.execute$lambda$0((ComponentActivity.ReportFullyDrawnExecutorImpl) this.f7316b);
                break;
            case 1:
                super/*android.app.Dialog*/.onBackPressed();
                break;
            default:
                FullyDrawnReporter.reportRunnable$lambda$2((FullyDrawnReporter) this.f7316b);
                break;
        }
    }
}
