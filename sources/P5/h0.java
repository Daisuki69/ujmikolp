package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gc.h f5076b;

    public h0(a0 a0Var, v0 v0Var, Gc.h hVar) {
        this.f5075a = v0Var;
        this.f5076b = hVar;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient okHttpClientBuild = ((OkHttpClient.Builder) this.f5075a.get()).addInterceptor((Interceptor) this.f5076b.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
