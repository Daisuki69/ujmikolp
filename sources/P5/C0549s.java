package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.MfaApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0549s implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5124b;

    public C0549s(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5123a = interfaceC1101b;
        this.f5124b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        MfaApi mfaApi = (MfaApi) AbstractC1414e.f((Retrofit.Builder) this.f5124b.get(), "https://mfa-api.maya.ph/", (OkHttpClient) this.f5123a.get(), MfaApi.class);
        AbstractC1955a.d(mfaApi);
        return mfaApi;
    }
}
