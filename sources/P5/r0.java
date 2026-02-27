package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0533b f5121b;
    public final Cg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f5122d;

    public r0(a0 a0Var, v0 v0Var, C0533b c0533b, Cg.c cVar, Cg.c cVar2) {
        this.f5120a = v0Var;
        this.f5121b = c0533b;
        this.c = cVar;
        this.f5122d = cVar2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5120a.get();
        Interceptor interceptor = (Interceptor) this.f5121b.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor((Interceptor) this.f5122d.get()).addInterceptor(interceptor).addInterceptor((Interceptor) this.c.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
