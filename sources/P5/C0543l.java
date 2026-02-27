package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.KycCmsApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0543l implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5092b;

    public C0543l(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5091a = interfaceC1101b;
        this.f5092b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        KycCmsApi kycCmsApi = (KycCmsApi) AbstractC1414e.f((Retrofit.Builder) this.f5092b.get(), "https://kyc.paymaya.com/kyc-cms-service/", (OkHttpClient) this.f5091a.get(), KycCmsApi.class);
        AbstractC1955a.d(kycCmsApi);
        return kycCmsApi;
    }
}
