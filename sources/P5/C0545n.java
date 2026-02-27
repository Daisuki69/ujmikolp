package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.KycSubmissionApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0545n implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5102b;

    public C0545n(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5101a = interfaceC1101b;
        this.f5102b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        KycSubmissionApi kycSubmissionApi = (KycSubmissionApi) AbstractC1414e.f((Retrofit.Builder) this.f5102b.get(), "https://kyc-private.paymaya.com/kyc-submission-service/", (OkHttpClient) this.f5101a.get(), KycSubmissionApi.class);
        AbstractC1955a.d(kycSubmissionApi);
        return kycSubmissionApi;
    }
}
