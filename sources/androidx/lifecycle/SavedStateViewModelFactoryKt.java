package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import cj.C1129o;
import cj.C1132s;
import cj.r;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class SavedStateViewModelFactoryKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = C1132s.g(Application.class, SavedStateHandle.class);
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = r.c(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        j.g(modelClass, "modelClass");
        j.g(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        j.f(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            j.f(parameterTypes, "constructor.parameterTypes");
            List listZ = C1129o.z(parameterTypes);
            if (signature.equals(listZ)) {
                return constructor;
            }
            if (signature.size() == listZ.size() && listZ.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        j.g(modelClass, "modelClass");
        j.g(constructor, "constructor");
        j.g(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(androidx.camera.core.impl.a.g(modelClass, "Failed to access "), e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(androidx.camera.core.impl.a.g(modelClass, "An exception happened in constructor of "), e10.getCause());
        }
    }
}
