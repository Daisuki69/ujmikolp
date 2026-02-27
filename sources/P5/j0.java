package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f5084b;
    public final J c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f5085d;

    public j0(a0 a0Var, v0 v0Var, O o8, J j, Cg.c cVar) {
        this.f5083a = v0Var;
        this.f5084b = o8;
        this.c = j;
        this.f5085d = cVar;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f5083a.get();
        Interceptor interceptor = (Interceptor) this.f5084b.get();
        Interceptor interceptor2 = (Interceptor) this.c.get();
        OkHttpClient okHttpClientBuild = builder.addInterceptor(interceptor).addInterceptor(interceptor2).addInterceptor((Interceptor) this.f5085d.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
