package androidx.window.area;

import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.area.reflectionguard.WindowAreaComponentValidator;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class SafeWindowAreaComponentProvider {
    private final ClassLoader loader;
    private final WindowExtensions windowExtensions;

    /* JADX INFO: renamed from: androidx.window.area.SafeWindowAreaComponentProvider$isWindowAreaProviderValid$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Boolean> {
        final /* synthetic */ Object $windowExtensions;
        final /* synthetic */ SafeWindowAreaComponentProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, SafeWindowAreaComponentProvider safeWindowAreaComponentProvider) {
            super(0);
            this.$windowExtensions = obj;
            this.this$0 = safeWindowAreaComponentProvider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws NoSuchMethodException {
            Method getWindowAreaComponentMethod = this.$windowExtensions.getClass().getMethod("getWindowAreaComponent", null);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            j.f(getWindowAreaComponentMethod, "getWindowAreaComponentMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(getWindowAreaComponentMethod) && reflectionUtils.doesReturn$window_release(getWindowAreaComponentMethod, this.this$0.getWindowAreaComponentClass()));
        }
    }

    public SafeWindowAreaComponentProvider(ClassLoader loader) {
        j.g(loader, "loader");
        this.loader = loader;
        this.windowExtensions = new SafeWindowExtensionsProvider(loader).getWindowExtensions();
    }

    private final Class<?> getExtensionWindowAreaPresentationClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.EXTENSION_WINDOW_AREA_PRESENTATION_CLASS);
        j.f(clsLoadClass, "loader.loadClass(\n      …ATION_CLASS\n            )");
        return clsLoadClass;
    }

    private final Class<?> getExtensionWindowAreaStatusClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.EXTENSION_WINDOW_AREA_STATUS_CLASS);
        j.f(clsLoadClass, "loader.loadClass(WindowE…WINDOW_AREA_STATUS_CLASS)");
        return clsLoadClass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getWindowAreaComponentClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_AREA_COMPONENT_CLASS);
        j.f(clsLoadClass, "loader.loadClass(WindowE…DOW_AREA_COMPONENT_CLASS)");
        return clsLoadClass;
    }

    private final boolean isValidExtensionWindowPresentation() {
        ExtensionsUtil extensionsUtil = ExtensionsUtil.INSTANCE;
        return extensionsUtil.getSafeVendorApiLevel() <= 2 || WindowAreaComponentValidator.INSTANCE.isExtensionWindowAreaPresentationValid$window_release(getExtensionWindowAreaPresentationClass(), extensionsUtil.getSafeVendorApiLevel());
    }

    private final boolean isWindowAreaProviderValid(Object obj) {
        return ReflectionUtils.validateReflection$window_release("WindowExtensions#getWindowAreaComponent is not valid", new AnonymousClass1(obj, this));
    }

    public final WindowAreaComponent getWindowAreaComponent() {
        try {
            WindowExtensions windowExtensions = this.windowExtensions;
            if (windowExtensions == null || !isWindowAreaProviderValid(windowExtensions)) {
                return null;
            }
            WindowAreaComponentValidator windowAreaComponentValidator = WindowAreaComponentValidator.INSTANCE;
            Class<?> windowAreaComponentClass = getWindowAreaComponentClass();
            ExtensionsUtil extensionsUtil = ExtensionsUtil.INSTANCE;
            if (windowAreaComponentValidator.isWindowAreaComponentValid$window_release(windowAreaComponentClass, extensionsUtil.getSafeVendorApiLevel()) && windowAreaComponentValidator.isExtensionWindowAreaStatusValid$window_release(getExtensionWindowAreaStatusClass(), extensionsUtil.getSafeVendorApiLevel()) && isValidExtensionWindowPresentation()) {
                return this.windowExtensions.getWindowAreaComponent();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
