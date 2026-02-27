package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7865b;

    public /* synthetic */ a(Object obj, int i) {
        this.f7864a = i;
        this.f7865b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7864a) {
            case 0:
                ComputableLiveData.refreshRunnable$lambda$0((ComputableLiveData) this.f7865b);
                break;
            case 1:
                ComputableLiveData.invalidationRunnable$lambda$1((ComputableLiveData) this.f7865b);
                break;
            default:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) this.f7865b);
                break;
        }
    }
}
