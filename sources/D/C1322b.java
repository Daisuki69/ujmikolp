package d;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import java.util.Set;

/* JADX INFO: renamed from: d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C1322b implements CameraDeviceSurfaceManager.Provider {
    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider
    public final CameraDeviceSurfaceManager newInstance(Context context, Object obj, Set set) {
        return Camera2Config.lambda$defaultConfig$0(context, obj, set);
    }
}
