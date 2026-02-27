package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.MayaInboxNotificationsClientApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0541j implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5082b;

    public C0541j(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5081a = interfaceC1101b;
        this.f5082b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        MayaInboxNotificationsClientApi mayaInboxNotificationsClientApi = (MayaInboxNotificationsClientApi) AbstractC1414e.f((Retrofit.Builder) this.f5082b.get(), "https://comms-client-api-production.voyagerapis.com/", (OkHttpClient) this.f5081a.get(), MayaInboxNotificationsClientApi.class);
        AbstractC1955a.d(mayaInboxNotificationsClientApi);
        return mayaInboxNotificationsClientApi;
    }
}
