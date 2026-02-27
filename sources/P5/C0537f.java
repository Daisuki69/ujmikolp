package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.ConfigApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0537f implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5066b;

    public C0537f(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5065a = interfaceC1101b;
        this.f5066b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        ConfigApi configApi = (ConfigApi) AbstractC1414e.f((Retrofit.Builder) this.f5066b.get(), "https://assets.paymaya.com/paymaya_app/", (OkHttpClient) this.f5065a.get(), ConfigApi.class);
        AbstractC1955a.d(configApi);
        return configApi;
    }
}
