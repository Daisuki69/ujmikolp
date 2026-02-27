package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.KycProfileRegulatoryApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0554x implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5143b;

    public C0554x(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5142a = interfaceC1101b;
        this.f5143b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        KycProfileRegulatoryApi kycProfileRegulatoryApi = (KycProfileRegulatoryApi) AbstractC1414e.f((Retrofit.Builder) this.f5143b.get(), "https://cpm-private.paymaya.com", (OkHttpClient) this.f5142a.get(), KycProfileRegulatoryApi.class);
        AbstractC1955a.d(kycProfileRegulatoryApi);
        return kycProfileRegulatoryApi;
    }
}
