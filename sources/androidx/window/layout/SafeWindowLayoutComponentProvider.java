package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider {
    private final ConsumerAdapter consumerAdapter;
    private final ClassLoader loader;
    private final SafeWindowExtensionsProvider safeWindowExtensionsProvider;

    /* JADX INFO: renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            /*
                r5 = this;
                androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.this
                java.lang.Class r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$getFoldingFeatureClass(r0)
                java.lang.String r1 = "getBounds"
                r2 = 0
                java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                java.lang.String r3 = "getType"
                java.lang.reflect.Method r3 = r0.getMethod(r3, r2)
                java.lang.String r4 = "getState"
                java.lang.reflect.Method r0 = r0.getMethod(r4, r2)
                androidx.window.reflection.ReflectionUtils r2 = androidx.window.reflection.ReflectionUtils.INSTANCE
                java.lang.String r4 = "getBoundsMethod"
                kotlin.jvm.internal.j.f(r1, r4)
                java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
                kotlin.jvm.internal.e r4 = kotlin.jvm.internal.z.a(r4)
                boolean r4 = r2.doesReturn$window_release(r1, r4)
                if (r4 == 0) goto L60
                boolean r1 = r2.isPublic$window_release(r1)
                if (r1 == 0) goto L60
                java.lang.String r1 = "getTypeMethod"
                kotlin.jvm.internal.j.f(r3, r1)
                java.lang.Class r1 = java.lang.Integer.TYPE
                kotlin.jvm.internal.e r4 = kotlin.jvm.internal.z.a(r1)
                boolean r4 = r2.doesReturn$window_release(r3, r4)
                if (r4 == 0) goto L60
                boolean r3 = r2.isPublic$window_release(r3)
                if (r3 == 0) goto L60
                java.lang.String r3 = "getStateMethod"
                kotlin.jvm.internal.j.f(r0, r3)
                kotlin.jvm.internal.e r1 = kotlin.jvm.internal.z.a(r1)
                boolean r1 = r2.doesReturn$window_release(r0, r1)
                if (r1 == 0) goto L60
                boolean r0 = r2.isPublic$window_release(r0)
                if (r0 == 0) goto L60
                r0 = 1
                goto L61
            L60:
                r0 = 0
            L61:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider.AnonymousClass1.invoke():java.lang.Boolean");
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isMethodWindowLayoutInfoListenerJavaConsumerValid$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08251 extends k implements Function0<Boolean> {
        public C08251() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            /*
                r7 = this;
                r0 = 1
                r1 = 0
                androidx.window.layout.SafeWindowLayoutComponentProvider r2 = androidx.window.layout.SafeWindowLayoutComponentProvider.this
                androidx.window.core.ConsumerAdapter r2 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$getConsumerAdapter$p(r2)
                java.lang.Class r2 = r2.consumerClassOrNull$window_release()
                if (r2 != 0) goto L11
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L11:
                androidx.window.layout.SafeWindowLayoutComponentProvider r3 = androidx.window.layout.SafeWindowLayoutComponentProvider.this
                java.lang.Class r3 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$getWindowLayoutComponentClass(r3)
                r4 = 2
                java.lang.Class[] r4 = new java.lang.Class[r4]
                java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
                r4[r1] = r5
                r4[r0] = r2
                java.lang.String r5 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r4 = r3.getMethod(r5, r4)
                java.lang.String r5 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r6 = new java.lang.Class[r0]
                r6[r1] = r2
                java.lang.reflect.Method r2 = r3.getMethod(r5, r6)
                androidx.window.reflection.ReflectionUtils r3 = androidx.window.reflection.ReflectionUtils.INSTANCE
                java.lang.String r5 = "addListenerMethod"
                kotlin.jvm.internal.j.f(r4, r5)
                boolean r4 = r3.isPublic$window_release(r4)
                if (r4 == 0) goto L49
                java.lang.String r4 = "removeListenerMethod"
                kotlin.jvm.internal.j.f(r2, r4)
                boolean r2 = r3.isPublic$window_release(r2)
                if (r2 == 0) goto L49
                goto L4a
            L49:
                r0 = r1
            L4a:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider.C08251.invoke():java.lang.Boolean");
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isMethodWindowLayoutInfoListenerWindowConsumerValid$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08261 extends k implements Function0<Boolean> {
        public C08261() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            Class windowLayoutComponentClass = SafeWindowLayoutComponentProvider.this.getWindowLayoutComponentClass();
            boolean z4 = false;
            Method addListenerMethod = windowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
            Method removeListenerMethod = windowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            j.f(addListenerMethod, "addListenerMethod");
            if (reflectionUtils.isPublic$window_release(addListenerMethod)) {
                j.f(removeListenerMethod, "removeListenerMethod");
                if (reflectionUtils.isPublic$window_release(removeListenerMethod)) {
                    z4 = true;
                }
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08271 extends k implements Function0<Boolean> {
        public C08271() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            Method getWindowLayoutComponentMethod = SafeWindowLayoutComponentProvider.this.safeWindowExtensionsProvider.getWindowExtensionsClass$window_release().getMethod("getWindowLayoutComponent", null);
            Class<?> windowLayoutComponentClass = SafeWindowLayoutComponentProvider.this.getWindowLayoutComponentClass();
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            j.f(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(getWindowLayoutComponentMethod) && reflectionUtils.doesReturn$window_release(getWindowLayoutComponentMethod, windowLayoutComponentClass));
        }
    }

    public SafeWindowLayoutComponentProvider(ClassLoader loader, ConsumerAdapter consumerAdapter) {
        j.g(loader, "loader");
        j.g(consumerAdapter, "consumerAdapter");
        this.loader = loader;
        this.consumerAdapter = consumerAdapter;
        this.safeWindowExtensionsProvider = new SafeWindowExtensionsProvider(loader);
    }

    private final boolean canUseWindowLayoutComponent() {
        if (!isWindowLayoutComponentAccessible$window_release()) {
            return false;
        }
        int safeVendorApiLevel = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
        if (safeVendorApiLevel == 1) {
            return hasValidVendorApiLevel1$window_release();
        }
        if (2 > safeVendorApiLevel || safeVendorApiLevel > Integer.MAX_VALUE) {
            return false;
        }
        return hasValidVendorApiLevel2$window_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getFoldingFeatureClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.FOLDING_FEATURE_CLASS);
        j.f(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return clsLoadClass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getWindowLayoutComponentClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_LAYOUT_COMPONENT_CLASS);
        j.f(clsLoadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return clsLoadClass;
    }

    private final boolean isFoldingFeatureValid() {
        return ReflectionUtils.validateReflection$window_release("FoldingFeature class is not valid", new AnonymousClass1());
    }

    private final boolean isMethodWindowLayoutInfoListenerJavaConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C08251());
    }

    private final boolean isMethodWindowLayoutInfoListenerWindowConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C08261());
    }

    private final boolean isWindowLayoutProviderValid() {
        return ReflectionUtils.validateReflection$window_release("WindowExtensions#getWindowLayoutComponent is not valid", new C08271());
    }

    public final WindowLayoutComponent getWindowLayoutComponent() {
        if (!canUseWindowLayoutComponent()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @VisibleForTesting
    public final boolean hasValidVendorApiLevel1$window_release() {
        return isMethodWindowLayoutInfoListenerJavaConsumerValid();
    }

    @VisibleForTesting
    public final boolean hasValidVendorApiLevel2$window_release() {
        return hasValidVendorApiLevel1$window_release() && isMethodWindowLayoutInfoListenerWindowConsumerValid();
    }

    @VisibleForTesting
    public final boolean isWindowLayoutComponentAccessible$window_release() {
        return this.safeWindowExtensionsProvider.isWindowExtensionsValid$window_release() && isWindowLayoutProviderValid() && isFoldingFeatureValid();
    }
}
