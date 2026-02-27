package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f5125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f5126b;
    public final Cg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f5127d;

    public s0(a0 a0Var, w0 w0Var, K k8, Cg.c cVar, Cg.c cVar2) {
        this.f5125a = w0Var;
        this.f5126b = k8;
        this.c = cVar;
        this.f5127d = cVar2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5125a.get();
        Interceptor interceptor = (Interceptor) this.f5126b.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor((Interceptor) this.f5127d.get()).addInterceptor(interceptor).addInterceptor((Interceptor) this.c.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
