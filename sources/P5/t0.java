package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f5131b;
    public final Cg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f5132d;

    public t0(a0 a0Var, v0 v0Var, K k8, Cg.c cVar, Cg.c cVar2) {
        this.f5130a = v0Var;
        this.f5131b = k8;
        this.c = cVar;
        this.f5132d = cVar2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5130a.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor((Interceptor) this.f5132d.get()).addInterceptor((Interceptor) this.c.get()).addInterceptor((Interceptor) this.f5131b.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
