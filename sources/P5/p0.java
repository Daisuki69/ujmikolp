package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f5112b;
    public final Cg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f5113d;

    public p0(a0 a0Var, v0 v0Var, J j, Cg.c cVar, Cg.c cVar2) {
        this.f5111a = v0Var;
        this.f5112b = j;
        this.c = cVar;
        this.f5113d = cVar2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5111a.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor((Interceptor) this.f5113d.get()).addInterceptor((Interceptor) this.c.get()).addInterceptor((Interceptor) this.f5112b.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
