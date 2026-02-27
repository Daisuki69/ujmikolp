package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.SuspendApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5005b;

    public D(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5004a = interfaceC1101b;
        this.f5005b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        SuspendApi suspendApi = (SuspendApi) AbstractC1414e.f((Retrofit.Builder) this.f5005b.get(), "https://api.paymaya.com/client/", (OkHttpClient) this.f5004a.get(), SuspendApi.class);
        AbstractC1955a.d(suspendApi);
        return suspendApi;
    }
}
