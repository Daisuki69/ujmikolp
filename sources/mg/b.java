package mg;

import retrofit2.Call;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call f18412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f18413b;

    public b(Call call) {
        this.f18412a = call;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.f18413b = true;
        this.f18412a.cancel();
    }
}
