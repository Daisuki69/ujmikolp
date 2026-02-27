package androidx.window.area;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.area.WindowAreaComponent;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public final class RearDisplaySessionImpl implements WindowAreaSession {
    private final WindowAreaComponent windowAreaComponent;

    public RearDisplaySessionImpl(WindowAreaComponent windowAreaComponent) {
        j.g(windowAreaComponent, "windowAreaComponent");
        this.windowAreaComponent = windowAreaComponent;
    }

    @Override // androidx.window.area.WindowAreaSession
    public void close() {
        this.windowAreaComponent.endRearDisplaySession();
    }
}
