package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f5108b;

    public o0(a0 a0Var, v0 v0Var, O o8) {
        this.f5107a = v0Var;
        this.f5108b = o8;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient okHttpClientBuild = ((OkHttpClient.Builder) this.f5107a.get()).addInterceptor((Interceptor) this.f5108b.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
