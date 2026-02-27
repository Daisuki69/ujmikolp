package androidx.window.layout;

import android.util.Log;
import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.adapter.WindowBackend;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackend;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInfoTracker$Companion$extensionBackend$2 extends k implements Function0<WindowBackend> {
    public static final WindowInfoTracker$Companion$extensionBackend$2 INSTANCE = new WindowInfoTracker$Companion$extensionBackend$2();

    public WindowInfoTracker$Companion$extensionBackend$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final WindowBackend invoke() {
        WindowLayoutComponent windowLayoutComponent;
        try {
            ClassLoader loader = WindowInfoTracker.class.getClassLoader();
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = loader != null ? new SafeWindowLayoutComponentProvider(loader, new ConsumerAdapter(loader)) : null;
            if (safeWindowLayoutComponentProvider == null || (windowLayoutComponent = safeWindowLayoutComponentProvider.getWindowLayoutComponent()) == null) {
                return null;
            }
            ExtensionWindowBackend.Companion companion = ExtensionWindowBackend.Companion;
            j.f(loader, "loader");
            return companion.newInstance(windowLayoutComponent, new ConsumerAdapter(loader));
        } catch (Throwable unused) {
            if (WindowInfoTracker.Companion.DEBUG) {
                Log.d(WindowInfoTracker.Companion.TAG, "Failed to load WindowExtensions");
            }
            return null;
        }
    }
}
