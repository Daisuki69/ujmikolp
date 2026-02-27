package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.core.impl.Quirks;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static boolean a(CaptureIntentPreviewQuirk captureIntentPreviewQuirk) {
        return true;
    }

    public static boolean b(Quirks quirks) {
        Iterator it = quirks.getAll(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).workaroundByCaptureIntentPreview()) {
                return true;
            }
        }
        return false;
    }
}
