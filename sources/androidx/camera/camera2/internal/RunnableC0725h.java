package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0725h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f7456b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SessionConfig f7457d;
    public final /* synthetic */ UseCaseConfig e;
    public final /* synthetic */ StreamSpec f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f7458g;

    public /* synthetic */ RunnableC0725h(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list, int i) {
        this.f7455a = i;
        this.f7456b = camera2CameraImpl;
        this.c = str;
        this.f7457d = sessionConfig;
        this.e = useCaseConfig;
        this.f = streamSpec;
        this.f7458g = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7455a) {
            case 0:
                this.f7456b.lambda$onUseCaseActive$7(this.c, this.f7457d, this.e, this.f, this.f7458g);
                break;
            case 1:
                this.f7456b.lambda$resetUseCase$10(this.c, this.f7457d, this.e, this.f, this.f7458g);
                break;
            default:
                this.f7456b.lambda$onUseCaseUpdated$9(this.c, this.f7457d, this.e, this.f, this.f7458g);
                break;
        }
    }
}
