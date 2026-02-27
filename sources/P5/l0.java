package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0533b f5094b;
    public final P c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f5095d;
    public final Cg.c e;

    public l0(a0 a0Var, v0 v0Var, C0533b c0533b, P p10, Cg.c cVar, Cg.c cVar2) {
        this.f5093a = v0Var;
        this.f5094b = c0533b;
        this.c = p10;
        this.f5095d = cVar;
        this.e = cVar2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5093a.get();
        Interceptor interceptor = (Interceptor) this.f5094b.get();
        Interceptor interceptor2 = (Interceptor) this.c.get();
        Interceptor interceptor3 = (Interceptor) this.f5095d.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor(interceptor).addInterceptor(interceptor2).addInterceptor(interceptor3).addInterceptor((Interceptor) this.e.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
