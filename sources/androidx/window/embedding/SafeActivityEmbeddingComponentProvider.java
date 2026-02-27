package androidx.window.embedding;

import android.app.Activity;
import androidx.annotation.VisibleForTesting;
import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class SafeActivityEmbeddingComponentProvider {
    private final ConsumerAdapter consumerAdapter;
    private final ClassLoader loader;
    private final SafeWindowExtensionsProvider safeWindowExtensionsProvider;
    private final WindowExtensions windowExtensions;

    /* JADX INFO: renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isActivityEmbeddingComponentValid$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            Method getActivityEmbeddingComponentMethod = SafeActivityEmbeddingComponentProvider.this.safeWindowExtensionsProvider.getWindowExtensionsClass$window_release().getMethod("getActivityEmbeddingComponent", null);
            Class<?> activityEmbeddingComponentClass = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass();
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            j.f(getActivityEmbeddingComponentMethod, "getActivityEmbeddingComponentMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(getActivityEmbeddingComponentMethod) && reflectionUtils.doesReturn$window_release(getActivityEmbeddingComponentMethod, activityEmbeddingComponentClass));
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodClearSplitInfoCallbackValid$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08191 extends k implements Function0<Boolean> {
        public C08191() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws NoSuchMethodException {
            Method clearSplitInfoCallbackMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("clearSplitInfoCallback", null);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            j.f(clearSplitInfoCallbackMethod, "clearSplitInfoCallbackMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(clearSplitInfoCallbackMethod));
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodIsActivityEmbeddedValid$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08201 extends k implements Function0<Boolean> {
        public C08201() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws NoSuchMethodException {
            Method isActivityEmbeddedMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("isActivityEmbedded", Activity.class);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            j.f(isActivityEmbeddedMethod, "isActivityEmbeddedMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(isActivityEmbeddedMethod) && reflectionUtils.doesReturn$window_release(isActivityEmbeddedMethod, Boolean.TYPE));
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodSetEmbeddingRulesValid$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08211 extends k implements Function0<Boolean> {
        public C08211() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws NoSuchMethodException {
            Method setEmbeddingRulesMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setEmbeddingRules", Set.class);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            j.f(setEmbeddingRulesMethod, "setEmbeddingRulesMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(setEmbeddingRulesMethod));
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodSetSplitInfoCallbackJavaConsumerValid$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08221 extends k implements Function0<Boolean> {
        public C08221() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws NoSuchMethodException {
            Class<?> clsConsumerClassOrNull$window_release = SafeActivityEmbeddingComponentProvider.this.consumerAdapter.consumerClassOrNull$window_release();
            if (clsConsumerClassOrNull$window_release == null) {
                return Boolean.FALSE;
            }
            Method setSplitInfoCallbackMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setSplitInfoCallback", clsConsumerClassOrNull$window_release);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            j.f(setSplitInfoCallbackMethod, "setSplitInfoCallbackMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(setSplitInfoCallbackMethod));
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodSetSplitInfoCallbackWindowConsumerValid$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08231 extends k implements Function0<Boolean> {
        public C08231() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws NoSuchMethodException {
            Method setSplitInfoCallbackMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setSplitInfoCallback", Consumer.class);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            j.f(setSplitInfoCallbackMethod, "setSplitInfoCallbackMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(setSplitInfoCallbackMethod));
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodSplitAttributesCalculatorValid$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08241 extends k implements Function0<Boolean> {
        public C08241() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException {
            /*
                r6 = this;
                androidx.window.embedding.SafeActivityEmbeddingComponentProvider r0 = androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this
                java.lang.Class r0 = androidx.window.embedding.SafeActivityEmbeddingComponentProvider.access$getActivityEmbeddingComponentClass(r0)
                r1 = 1
                java.lang.Class[] r2 = new java.lang.Class[r1]
                java.lang.Class<androidx.window.extensions.core.util.function.Function> r3 = androidx.window.extensions.core.util.function.Function.class
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = "setSplitAttributesCalculator"
                java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
                androidx.window.embedding.SafeActivityEmbeddingComponentProvider r2 = androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this
                java.lang.Class r2 = androidx.window.embedding.SafeActivityEmbeddingComponentProvider.access$getActivityEmbeddingComponentClass(r2)
                java.lang.String r3 = "clearSplitAttributesCalculator"
                r5 = 0
                java.lang.reflect.Method r2 = r2.getMethod(r3, r5)
                androidx.window.reflection.ReflectionUtils r3 = androidx.window.reflection.ReflectionUtils.INSTANCE
                java.lang.String r5 = "setSplitAttributesCalculatorMethod"
                kotlin.jvm.internal.j.f(r0, r5)
                boolean r0 = r3.isPublic$window_release(r0)
                if (r0 == 0) goto L3c
                java.lang.String r0 = "clearSplitAttributesCalculatorMethod"
                kotlin.jvm.internal.j.f(r2, r0)
                boolean r0 = r3.isPublic$window_release(r2)
                if (r0 == 0) goto L3c
                goto L3d
            L3c:
                r1 = r4
            L3d:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.C08241.invoke():java.lang.Boolean");
        }
    }

    public SafeActivityEmbeddingComponentProvider(ClassLoader loader, ConsumerAdapter consumerAdapter, WindowExtensions windowExtensions) {
        j.g(loader, "loader");
        j.g(consumerAdapter, "consumerAdapter");
        j.g(windowExtensions, "windowExtensions");
        this.loader = loader;
        this.consumerAdapter = consumerAdapter;
        this.windowExtensions = windowExtensions;
        this.safeWindowExtensionsProvider = new SafeWindowExtensionsProvider(loader);
    }

    private final boolean canUseActivityEmbeddingComponent() {
        if (!isActivityEmbeddingComponentAccessible$window_release()) {
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
    public final Class<?> getActivityEmbeddingComponentClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        j.f(clsLoadClass, "loader.loadClass(ACTIVIT…MBEDDING_COMPONENT_CLASS)");
        return clsLoadClass;
    }

    private final boolean isActivityEmbeddingComponentValid() {
        return ReflectionUtils.validateReflection$window_release("WindowExtensions#getActivityEmbeddingComponent is not valid", new AnonymousClass1());
    }

    private final boolean isMethodClearSplitInfoCallbackValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#clearSplitInfoCallback is not valid", new C08191());
    }

    private final boolean isMethodIsActivityEmbeddedValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new C08201());
    }

    private final boolean isMethodSetEmbeddingRulesValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new C08211());
    }

    private final boolean isMethodSetSplitInfoCallbackJavaConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new C08221());
    }

    private final boolean isMethodSetSplitInfoCallbackWindowConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new C08231());
    }

    private final boolean isMethodSplitAttributesCalculatorValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new C08241());
    }

    public final ActivityEmbeddingComponent getActivityEmbeddingComponent() {
        if (!canUseActivityEmbeddingComponent()) {
            return null;
        }
        try {
            return this.windowExtensions.getActivityEmbeddingComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @VisibleForTesting
    public final boolean hasValidVendorApiLevel1$window_release() {
        return isMethodSetEmbeddingRulesValid() && isMethodIsActivityEmbeddedValid() && isMethodSetSplitInfoCallbackJavaConsumerValid();
    }

    @VisibleForTesting
    public final boolean hasValidVendorApiLevel2$window_release() {
        return hasValidVendorApiLevel1$window_release() && isMethodSetSplitInfoCallbackWindowConsumerValid() && isMethodClearSplitInfoCallbackValid() && isMethodSplitAttributesCalculatorValid();
    }

    @VisibleForTesting
    public final boolean isActivityEmbeddingComponentAccessible$window_release() {
        return this.safeWindowExtensionsProvider.isWindowExtensionsValid$window_release() && isActivityEmbeddingComponentValid();
    }
}
