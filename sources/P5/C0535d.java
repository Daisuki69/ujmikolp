package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.ApigeeApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0535d implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5057b;

    public C0535d(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5056a = interfaceC1101b;
        this.f5057b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        ApigeeApi apigeeApi = (ApigeeApi) AbstractC1414e.f((Retrofit.Builder) this.f5057b.get(), "https://api.paymaya.com/auth/", (OkHttpClient) this.f5056a.get(), ApigeeApi.class);
        AbstractC1955a.d(apigeeApi);
        return apigeeApi;
    }
}
