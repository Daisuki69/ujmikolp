package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.KycCmsAddressApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0542k implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5087b;

    public C0542k(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5086a = interfaceC1101b;
        this.f5087b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        KycCmsAddressApi kycCmsAddressApi = (KycCmsAddressApi) AbstractC1414e.f((Retrofit.Builder) this.f5087b.get(), "https://userprofiles-rdm.paymaya.com", (OkHttpClient) this.f5086a.get(), KycCmsAddressApi.class);
        AbstractC1955a.d(kycCmsAddressApi);
        return kycCmsAddressApi;
    }
}
