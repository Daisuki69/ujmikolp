package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f5063b;
    public final Cg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f5064d;

    public e0(a0 a0Var, v0 v0Var, L l6, Cg.c cVar, Cg.c cVar2) {
        this.f5062a = v0Var;
        this.f5063b = l6;
        this.c = cVar;
        this.f5064d = cVar2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5062a.get();
        Interceptor interceptor = (Interceptor) this.f5063b.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor((Interceptor) this.f5064d.get()).addInterceptor(interceptor).addInterceptor((Interceptor) this.c.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
