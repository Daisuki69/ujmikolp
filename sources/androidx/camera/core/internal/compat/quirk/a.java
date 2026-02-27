package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.Quirks;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static boolean a(SurfaceProcessingQuirk surfaceProcessingQuirk) {
        return true;
    }

    public static boolean b(Quirks quirks) {
        Iterator it = quirks.getAll(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).workaroundBySurfaceProcessing()) {
                return true;
            }
        }
        return false;
    }
}
