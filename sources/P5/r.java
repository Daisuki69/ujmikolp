package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.MayaXpApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5119b;

    public r(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5118a = interfaceC1101b;
        this.f5119b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        MayaXpApi mayaXpApi = (MayaXpApi) AbstractC1414e.f((Retrofit.Builder) this.f5119b.get(), "https://personalization-score-bff-production.voyagerapis.com/", (OkHttpClient) this.f5118a.get(), MayaXpApi.class);
        AbstractC1955a.d(mayaXpApi);
        return mayaXpApi;
    }
}
