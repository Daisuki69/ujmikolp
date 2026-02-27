package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ButterKnife {

    @VisibleForTesting
    static final Map<Class<?>, Constructor<? extends Unbinder>> BINDINGS = new LinkedHashMap();
    private static final String TAG = "ButterKnife";
    private static boolean debug;

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    @NonNull
    @UiThread
    public static Unbinder bind(@NonNull Activity activity) {
        return bind(activity, activity.getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @CheckResult
    @UiThread
    private static Constructor<? extends Unbinder> findBindingConstructorForClass(Class<?> cls) {
        Constructor<? extends Unbinder> constructorFindBindingConstructorForClass;
        Map<Class<?>, Constructor<? extends Unbinder>> map = BINDINGS;
        Constructor<? extends Unbinder> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            if (debug) {
                Log.d(TAG, "HIT: Cached in binding map.");
            }
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            if (!debug) {
                return null;
            }
            Log.d(TAG, "MISS: Reached framework class. Abandoning search.");
            return null;
        }
        try {
            constructorFindBindingConstructorForClass = cls.getClassLoader().loadClass(name.concat("_ViewBinding")).getConstructor(cls, View.class);
            if (debug) {
                Log.d(TAG, "HIT: Loaded binding class and constructor.");
            }
        } catch (ClassNotFoundException unused) {
            if (debug) {
                Log.d(TAG, "Not found. Trying superclass ".concat(cls.getSuperclass().getName()));
            }
            constructorFindBindingConstructorForClass = findBindingConstructorForClass(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find binding constructor for ".concat(name), e);
        }
        BINDINGS.put(cls, constructorFindBindingConstructorForClass);
        return constructorFindBindingConstructorForClass;
    }

    public static void setDebug(boolean z4) {
        debug = z4;
    }

    @NonNull
    @UiThread
    public static Unbinder bind(@NonNull View view) {
        return bind(view, view);
    }

    @NonNull
    @UiThread
    public static Unbinder bind(@NonNull Dialog dialog) {
        return bind(dialog, dialog.getWindow().getDecorView());
    }

    @NonNull
    @UiThread
    public static Unbinder bind(@NonNull Object obj, @NonNull Activity activity) {
        return bind(obj, activity.getWindow().getDecorView());
    }

    @NonNull
    @UiThread
    public static Unbinder bind(@NonNull Object obj, @NonNull Dialog dialog) {
        return bind(obj, dialog.getWindow().getDecorView());
    }

    @NonNull
    @UiThread
    public static Unbinder bind(@NonNull Object obj, @NonNull View view) {
        Class<?> cls = obj.getClass();
        if (debug) {
            Log.d(TAG, "Looking up binding for ".concat(cls.getName()));
        }
        Constructor<? extends Unbinder> constructorFindBindingConstructorForClass = findBindingConstructorForClass(cls);
        if (constructorFindBindingConstructorForClass != null) {
            try {
                return constructorFindBindingConstructorForClass.newInstance(obj, view);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Unable to invoke " + constructorFindBindingConstructorForClass, e);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Unable to invoke " + constructorFindBindingConstructorForClass, e7);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException("Unable to create binding instance.", cause);
                }
                throw ((RuntimeException) cause);
            }
        }
        return Unbinder.EMPTY;
    }
}
