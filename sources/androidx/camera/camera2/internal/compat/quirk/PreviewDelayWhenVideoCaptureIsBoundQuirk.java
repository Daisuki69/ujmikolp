package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;

/* JADX INFO: loaded from: classes.dex */
public class PreviewDelayWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    public static boolean load() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER);
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final /* synthetic */ boolean workaroundByCaptureIntentPreview() {
        return a.a(this);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final /* synthetic */ boolean workaroundBySurfaceProcessing() {
        return androidx.camera.core.internal.compat.quirk.a.a(this);
    }
}
