package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.RewardsCatalogApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5003b;

    public C(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5002a = interfaceC1101b;
        this.f5003b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        RewardsCatalogApi rewardsCatalogApi = (RewardsCatalogApi) AbstractC1414e.f((Retrofit.Builder) this.f5003b.get(), "https://benefits-client-production.voyagerapis.com/", (OkHttpClient) this.f5002a.get(), RewardsCatalogApi.class);
        AbstractC1955a.d(rewardsCatalogApi);
        return rewardsCatalogApi;
    }
}
