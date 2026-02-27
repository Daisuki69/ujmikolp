package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lh.c f5104b;

    public n0(a0 a0Var, v0 v0Var, Lh.c cVar) {
        this.f5103a = v0Var;
        this.f5104b = cVar;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient okHttpClientBuild = ((OkHttpClient.Builder) this.f5103a.get()).addInterceptor((Interceptor) this.f5104b.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
