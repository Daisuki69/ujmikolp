package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.CreditApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0538g implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5070b;

    public C0538g(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5069a = interfaceC1101b;
        this.f5070b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        CreditApi creditApi = (CreditApi) AbstractC1414e.f((Retrofit.Builder) this.f5070b.get(), "https://api.mayabank.ph/credits/", (OkHttpClient) this.f5069a.get(), CreditApi.class);
        AbstractC1955a.d(creditApi);
        return creditApi;
    }
}
