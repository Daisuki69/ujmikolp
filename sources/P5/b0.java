package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f5053b;

    public b0(a0 a0Var, v0 v0Var, J j) {
        this.f5052a = v0Var;
        this.f5053b = j;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient okHttpClientBuild = ((OkHttpClient.Builder) this.f5052a.get()).addInterceptor((Interceptor) this.f5053b.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
