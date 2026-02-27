package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f5099b;
    public final Cg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f5100d;

    public m0(a0 a0Var, v0 v0Var, H h, Cg.c cVar, Cg.c cVar2) {
        this.f5098a = v0Var;
        this.f5099b = h;
        this.c = cVar;
        this.f5100d = cVar2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5098a.get();
        Interceptor interceptor = (Interceptor) this.f5099b.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor((Interceptor) this.f5100d.get()).addInterceptor(interceptor).addInterceptor((Interceptor) this.c.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
