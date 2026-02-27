package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.ReferralEligibilityClientApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0556z implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5149b;

    public C0556z(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5148a = interfaceC1101b;
        this.f5149b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        ReferralEligibilityClientApi referralEligibilityClientApi = (ReferralEligibilityClientApi) AbstractC1414e.f((Retrofit.Builder) this.f5149b.get(), "https://loyalty-referral-bff-production.voyagerapis.com/", (OkHttpClient) this.f5148a.get(), ReferralEligibilityClientApi.class);
        AbstractC1955a.d(referralEligibilityClientApi);
        return referralEligibilityClientApi;
    }
}
