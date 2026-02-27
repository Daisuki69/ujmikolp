package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.PayMayaClientApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0553w implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5140b;

    public C0553w(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5139a = interfaceC1101b;
        this.f5140b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) AbstractC1414e.f((Retrofit.Builder) this.f5140b.get(), "https://api.paymaya.com/client/", (OkHttpClient) this.f5139a.get(), PayMayaClientApi.class);
        AbstractC1955a.d(payMayaClientApi);
        return payMayaClientApi;
    }
}
