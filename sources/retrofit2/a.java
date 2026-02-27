package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f19944b;
    public final /* synthetic */ Callback c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19945d;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj, int i) {
        this.f19943a = i;
        this.f19944b = anonymousClass1;
        this.c = callback;
        this.f19945d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19943a) {
            case 0:
                this.f19944b.lambda$onResponse$0(this.c, (Response) this.f19945d);
                break;
            default:
                this.f19944b.lambda$onFailure$1(this.c, (Throwable) this.f19945d);
                break;
        }
    }
}
