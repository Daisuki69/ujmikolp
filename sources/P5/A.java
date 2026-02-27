package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.KycRegulatoryProfileCmsApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5001b;

    public A(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5000a = interfaceC1101b;
        this.f5001b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        KycRegulatoryProfileCmsApi kycRegulatoryProfileCmsApi = (KycRegulatoryProfileCmsApi) AbstractC1414e.f((Retrofit.Builder) this.f5001b.get(), "https://cpm.paymaya.com", (OkHttpClient) this.f5000a.get(), KycRegulatoryProfileCmsApi.class);
        AbstractC1955a.d(kycRegulatoryProfileCmsApi);
        return kycRegulatoryProfileCmsApi;
    }
}
