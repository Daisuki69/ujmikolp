package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.KycInHouseApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0544m implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5097b;

    public C0544m(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5096a = interfaceC1101b;
        this.f5097b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        KycInHouseApi kycInHouseApi = (KycInHouseApi) AbstractC1414e.f((Retrofit.Builder) this.f5097b.get(), "https://kyc-private.paymaya.com/in-house-service/", (OkHttpClient) this.f5096a.get(), KycInHouseApi.class);
        AbstractC1955a.d(kycInHouseApi);
        return kycInHouseApi;
    }
}
