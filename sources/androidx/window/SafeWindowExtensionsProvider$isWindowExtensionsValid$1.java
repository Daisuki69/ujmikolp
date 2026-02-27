package androidx.window;

import androidx.window.reflection.ReflectionUtils;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class SafeWindowExtensionsProvider$isWindowExtensionsValid$1 extends k implements Function0<Boolean> {
    final /* synthetic */ SafeWindowExtensionsProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowExtensionsProvider$isWindowExtensionsValid$1(SafeWindowExtensionsProvider safeWindowExtensionsProvider) {
        super(0);
        this.this$0 = safeWindowExtensionsProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
        Method getWindowExtensionsMethod = this.this$0.getWindowExtensionsProviderClass().getDeclaredMethod("getWindowExtensions", null);
        Class<?> windowExtensionsClass$window_release = this.this$0.getWindowExtensionsClass$window_release();
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        j.f(getWindowExtensionsMethod, "getWindowExtensionsMethod");
        return Boolean.valueOf(reflectionUtils.doesReturn$window_release(getWindowExtensionsMethod, windowExtensionsClass$window_release) && reflectionUtils.isPublic$window_release(getWindowExtensionsMethod));
    }
}
