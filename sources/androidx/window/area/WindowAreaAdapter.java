package androidx.window.area;

import androidx.window.area.WindowAreaCapability;
import androidx.window.core.ExperimentalWindowApi;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public final class WindowAreaAdapter {
    public static final WindowAreaAdapter INSTANCE = new WindowAreaAdapter();

    private WindowAreaAdapter() {
    }

    public final WindowAreaCapability.Status translate$window_release(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED : WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNAVAILABLE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED;
    }
}
