package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.ForgotPasswordApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0540i implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5078b;

    public C0540i(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5077a = interfaceC1101b;
        this.f5078b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        ForgotPasswordApi forgotPasswordApi = (ForgotPasswordApi) AbstractC1414e.f((Retrofit.Builder) this.f5078b.get(), "https://iam-api.maya.ph/", (OkHttpClient) this.f5077a.get(), ForgotPasswordApi.class);
        AbstractC1955a.d(forgotPasswordApi);
        return forgotPasswordApi;
    }
}
