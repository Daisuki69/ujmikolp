package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.PayMayaCardApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0552v implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5137b;

    public C0552v(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5136a = interfaceC1101b;
        this.f5137b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        PayMayaCardApi payMayaCardApi = (PayMayaCardApi) AbstractC1414e.f((Retrofit.Builder) this.f5137b.get(), "https://api.paymaya.com/chd/", (OkHttpClient) this.f5136a.get(), PayMayaCardApi.class);
        AbstractC1955a.d(payMayaCardApi);
        return payMayaCardApi;
    }
}
