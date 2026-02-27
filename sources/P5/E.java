package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.UnifiedGatewayApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5007b;

    public E(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5006a = interfaceC1101b;
        this.f5007b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        UnifiedGatewayApi unifiedGatewayApi = (UnifiedGatewayApi) AbstractC1414e.f((Retrofit.Builder) this.f5007b.get(), "https://app.maya.ph/", (OkHttpClient) this.f5006a.get(), UnifiedGatewayApi.class);
        AbstractC1955a.d(unifiedGatewayApi);
        return unifiedGatewayApi;
    }
}
