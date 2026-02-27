package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.annotation.OptIn;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.Config;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class CaptureRequestParameterCompat {
    public static final CaptureRequestParameterCompat INSTANCE = new CaptureRequestParameterCompat();

    private CaptureRequestParameterCompat() {
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public static final void setSettingsOverrideZoom(Camera2ImplConfig.Builder options, Config.OptionPriority priority) {
        j.g(options, "options");
        j.g(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
