package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f5080b;
    public final Cg.c c;

    public i0(a0 a0Var, v0 v0Var, O o8, Cg.c cVar) {
        this.f5079a = v0Var;
        this.f5080b = o8;
        this.c = cVar;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5079a.get();
        Interceptor interceptor = (Interceptor) this.f5080b.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor(interceptor).addInterceptor((Interceptor) this.c.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
