package P5;

import cg.InterfaceC1101b;
import com.paymaya.data.api.FileManagementApi;
import defpackage.AbstractC1414e;
import o1.AbstractC1955a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: P5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0539h implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1101b f5073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5074b;

    public C0539h(C0534c c0534c, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2) {
        this.f5073a = interfaceC1101b;
        this.f5074b = interfaceC1101b2;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        FileManagementApi fileManagementApi = (FileManagementApi) AbstractC1414e.f((Retrofit.Builder) this.f5074b.get(), "https://filemgmt.paymaya.com/", (OkHttpClient) this.f5073a.get(), FileManagementApi.class);
        AbstractC1955a.d(fileManagementApi);
        return fileManagementApi;
    }
}
