package androidx.window.area.reflectionguard;

import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.reflection.ReflectionUtils;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowAreaComponentValidator {
    public static final WindowAreaComponentValidator INSTANCE = new WindowAreaComponentValidator();

    private WindowAreaComponentValidator() {
    }

    public final boolean isExtensionWindowAreaPresentationValid$window_release(Class<?> extensionWindowAreaPresentation, int i) {
        j.g(extensionWindowAreaPresentation, "extensionWindowAreaPresentation");
        if (i <= 2) {
            return false;
        }
        return ReflectionUtils.INSTANCE.validateImplementation$window_release(extensionWindowAreaPresentation, ExtensionWindowAreaPresentation.class);
    }

    public final boolean isExtensionWindowAreaStatusValid$window_release(Class<?> extensionWindowAreaStatus, int i) {
        j.g(extensionWindowAreaStatus, "extensionWindowAreaStatus");
        if (i <= 1) {
            return false;
        }
        return ReflectionUtils.INSTANCE.validateImplementation$window_release(extensionWindowAreaStatus, ExtensionWindowAreaStatusRequirements.class);
    }

    public final boolean isWindowAreaComponentValid$window_release(Class<?> windowAreaComponent, int i) {
        j.g(windowAreaComponent, "windowAreaComponent");
        if (i <= 1) {
            return false;
        }
        return i == 2 ? ReflectionUtils.INSTANCE.validateImplementation$window_release(windowAreaComponent, WindowAreaComponentApi2Requirements.class) : ReflectionUtils.INSTANCE.validateImplementation$window_release(windowAreaComponent, WindowAreaComponentApi3Requirements.class);
    }
}
