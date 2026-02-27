package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.ComplianceApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0536e implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5061b;

    public C0536e(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5060a = interfaceC1101b;
        this.f5061b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        ComplianceApi complianceApi = (ComplianceApi) AbstractC1414e.f((Retrofit.Builder) this.f5061b.get(), "https://cpm-private.paymaya.com", (OkHttpClient) this.f5060a.get(), ComplianceApi.class);
        AbstractC1955a.d(complianceApi);
        return complianceApi;
    }
}
