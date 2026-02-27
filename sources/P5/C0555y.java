package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.PushApprovalApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0555y implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5147b;

    public C0555y(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5146a = interfaceC1101b;
        this.f5147b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        PushApprovalApi pushApprovalApi = (PushApprovalApi) AbstractC1414e.f((Retrofit.Builder) this.f5147b.get(), "https://push-api.maya.ph/", (OkHttpClient) this.f5146a.get(), PushApprovalApi.class);
        AbstractC1955a.d(pushApprovalApi);
        return pushApprovalApi;
    }
}
