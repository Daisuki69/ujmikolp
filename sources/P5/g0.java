package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6.v f5072b;

    public g0(a0 a0Var, v0 v0Var, G6.v vVar) {
        this.f5071a = v0Var;
        this.f5072b = vVar;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient okHttpClientBuild = ((OkHttpClient.Builder) this.f5071a.get()).addInterceptor((Interceptor) this.f5072b.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
