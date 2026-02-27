package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.KycTencentApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0546o implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5106b;

    public C0546o(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5105a = interfaceC1101b;
        this.f5106b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        KycTencentApi kycTencentApi = (KycTencentApi) AbstractC1414e.f((Retrofit.Builder) this.f5106b.get(), "https://kyc-private.paymaya.com/tencent-service/", (OkHttpClient) this.f5105a.get(), KycTencentApi.class);
        AbstractC1955a.d(kycTencentApi);
        return kycTencentApi;
    }
}
