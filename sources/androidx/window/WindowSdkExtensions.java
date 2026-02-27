package androidx.window;

import We.s;
import androidx.annotation.IntRange;
import androidx.window.core.ExtensionsUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WindowSdkExtensions {
    public static final Companion Companion = new Companion(null);
    private static WindowSdkExtensionsDecorator decorator = EmptyDecoratorWindowSdk.INSTANCE;
    private final int extensionVersion = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WindowSdkExtensions getInstance() {
            return WindowSdkExtensions.decorator.decorate(new WindowSdkExtensions() { // from class: androidx.window.WindowSdkExtensions$Companion$getInstance$1
            });
        }

        public final void overrideDecorator$window_release(WindowSdkExtensionsDecorator overridingDecorator) {
            j.g(overridingDecorator, "overridingDecorator");
            WindowSdkExtensions.decorator = overridingDecorator;
        }

        public final void reset$window_release() {
            WindowSdkExtensions.decorator = EmptyDecoratorWindowSdk.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final WindowSdkExtensions getInstance() {
        return Companion.getInstance();
    }

    @IntRange(from = 0)
    public int getExtensionVersion() {
        return this.extensionVersion;
    }

    public final void requireExtensionVersion$window_release(@IntRange(from = 1) int i) {
        if (getExtensionVersion() >= i) {
            return;
        }
        StringBuilder sbT = s.t(i, "This API requires extension version ", ", but the device is on ");
        sbT.append(getExtensionVersion());
        throw new UnsupportedOperationException(sbT.toString());
    }
}
