package P5;

import cg.InterfaceC1101b;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5135a;

    public u0(a0 a0Var, v0 v0Var) {
        this.f5135a = v0Var;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        OkHttpClient okHttpClientBuild = ((OkHttpClient.Builder) this.f5135a.get()).build();
        AbstractC1955a.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
