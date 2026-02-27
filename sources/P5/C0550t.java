package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.MayaPayBillsClientApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0550t implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5129b;

    public C0550t(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5128a = interfaceC1101b;
        this.f5129b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        MayaPayBillsClientApi mayaPayBillsClientApi = (MayaPayBillsClientApi) AbstractC1414e.f((Retrofit.Builder) this.f5129b.get(), "https://api.paymaya.com/bills-pay/", (OkHttpClient) this.f5128a.get(), MayaPayBillsClientApi.class);
        AbstractC1955a.d(mayaPayBillsClientApi);
        return mayaPayBillsClientApi;
    }
}
