package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0533b f5068b;
    public final Cg.c c;

    public f0(a0 a0Var, v0 v0Var, C0533b c0533b, Cg.c cVar) {
        this.f5067a = v0Var;
        this.f5068b = c0533b;
        this.c = cVar;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5067a.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor((Interceptor) this.c.get()).addInterceptor((Interceptor) this.f5068b.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
