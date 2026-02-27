package androidx.window.reflection;

import X5.f;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public static final boolean validateReflection$window_release(String str, Function0<Boolean> block) {
        j.g(block, "block");
        try {
            boolean zBooleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static /* synthetic */ boolean validateReflection$window_release$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return validateReflection$window_release(str, function0);
    }

    public final boolean checkIsPresent$window_release(Function0<? extends Class<?>> classLoader) {
        j.g(classLoader, "classLoader");
        try {
            classLoader.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean doesReturn$window_release(Method method, InterfaceC2488d clazz) {
        j.g(method, "<this>");
        j.g(clazz, "clazz");
        return doesReturn$window_release(method, f.n(clazz));
    }

    public final boolean isPublic$window_release(Method method) {
        j.g(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean validateImplementation$window_release(Class<?> implementation, Class<?> requirements) {
        j.g(implementation, "implementation");
        j.g(requirements, "requirements");
        Method[] methods = requirements.getMethods();
        j.f(methods, "requirements.methods");
        for (Method method : methods) {
            if (!validateReflection$window_release(implementation.getName() + '#' + method.getName() + " is not valid", new ReflectionUtils$validateImplementation$1$1(implementation, method))) {
                return false;
            }
        }
        return true;
    }

    public final boolean doesReturn$window_release(Method method, Class<?> clazz) {
        j.g(method, "<this>");
        j.g(clazz, "clazz");
        return method.getReturnType().equals(clazz);
    }
}
