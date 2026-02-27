package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gb.d f5059b;
    public final P c;

    public d0(a0 a0Var, v0 v0Var, Gb.d dVar, P p10) {
        this.f5058a = v0Var;
        this.f5059b = dVar;
        this.c = p10;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5058a.get();
        Interceptor interceptor = (Interceptor) this.f5059b.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor(interceptor).addInterceptor((Interceptor) this.c.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
