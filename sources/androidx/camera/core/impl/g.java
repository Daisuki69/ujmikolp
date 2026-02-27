package androidx.camera.core.impl;

import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraFilter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements CameraFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7535b;

    public /* synthetic */ g(Object obj, int i) {
        this.f7534a = i;
        this.f7535b = obj;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        switch (this.f7534a) {
            case 0:
                return h.e((CameraInfoInternal) this.f7535b, list);
            default:
                return Camera2CameraCoordinator.lambda$createCameraSelectorById$0((String) this.f7535b, list);
        }
    }

    @Override // androidx.camera.core.CameraFilter
    public final /* synthetic */ Identifier getIdentifier() {
        switch (this.f7534a) {
        }
        return androidx.camera.core.e.a(this);
    }
}
