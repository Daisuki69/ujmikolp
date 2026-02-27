package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.MayaShopClientApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0548q implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5115b;

    public C0548q(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5114a = interfaceC1101b;
        this.f5115b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        MayaShopClientApi mayaShopClientApi = (MayaShopClientApi) AbstractC1414e.f((Retrofit.Builder) this.f5115b.get(), "https://api.paymaya.com/shop/", (OkHttpClient) this.f5114a.get(), MayaShopClientApi.class);
        AbstractC1955a.d(mayaShopClientApi);
        return mayaShopClientApi;
    }
}
