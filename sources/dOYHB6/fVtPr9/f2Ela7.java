package dOYHB6.fVtPr9;

import android.os.Build;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class f2Ela7 {
    private static boolean dJoly9() {
        return Build.VERSION.SDK_INT < 30;
    }

    public static Method kcGVN3(Class<?> cls, String str, Class<?>... clsArr) throws Exception {
        if (dJoly9()) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception e) {
                return null;
            }
        }
        Method methodKcGVN3 = fChUQ4.kcGVN3(cls, str, clsArr);
        if (methodKcGVN3 != null) {
            return methodKcGVN3;
        }
        throw new Exception(s1Yq53());
    }

    public static Object pf8BU5(Object obj, String str, Object obj2) {
        try {
            Field fieldZYg5T4 = zYg5T4(obj.getClass(), str);
            fieldZYg5T4.setAccessible(true);
            return fieldZYg5T4.get(obj);
        } catch (Exception e) {
            return obj2;
        }
    }

    private static String s1Yq53() {
        return numX49.tnTj78("bFVk");
    }

    public static Method tqvfg7(Class<?> cls, String str, Class<?>... clsArr) throws Exception {
        if (dJoly9()) {
            try {
                return cls.getMethod(str, clsArr);
            } catch (Exception e) {
                return null;
            }
        }
        Method methodTqvfg7 = fChUQ4.tqvfg7(cls, str, clsArr);
        if (methodTqvfg7 != null) {
            return methodTqvfg7;
        }
        throw new Exception(s1Yq53());
    }

    public static Field zYg5T4(Class<?> cls, String str) throws Exception {
        if (dJoly9()) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception e) {
                return null;
            }
        }
        Field fieldZYg5T4 = fChUQ4.zYg5T4(cls, str);
        if (fieldZYg5T4 != null) {
            return fieldZYg5T4;
        }
        throw new Exception(s1Yq53());
    }
}
