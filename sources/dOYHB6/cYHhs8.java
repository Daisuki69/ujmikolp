package dOYHB6;

import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class cYHhs8 {
    public static Method bqTqr1(Object obj, String str, Class<?>... clsArr) {
        Method declaredMethod = null;
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                break;
            } catch (NoSuchMethodException e) {
            }
        }
        return declaredMethod;
    }

    public static Field eMD8C8(Object obj, String str) {
        Field declaredField = null;
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                break;
            } catch (NoSuchFieldException e) {
            }
        }
        return declaredField;
    }

    public static void gWQKs2(Exception exc, boolean z4) {
        String str = numX49.tnTj78("bHMM") + exc.getClass().getName() + numX49.tnTj78("bHMN") + exc.getMessage() + (z4 ? numX49.tnTj78("bHMD") : numX49.tnTj78("bHMh"));
        if (exc instanceof InvocationTargetException) {
            String str2 = str + numX49.tnTj78("bHM6") + exc.getCause();
        }
        exc.printStackTrace();
        if (z4) {
            iKNpI8.rmvdY2();
        }
    }

    public static Object getField(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (IllegalAccessException e) {
            return null;
        } catch (NoSuchFieldException e7) {
            return null;
        }
    }

    public static Object getField(Object obj, String str, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (IllegalAccessException e) {
            return obj2;
        } catch (NoSuchFieldException e7) {
            return obj2;
        }
    }

    public static Object getField(Object obj, Field field) {
        if (field == null) {
            return null;
        }
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            return null;
        }
    }

    public static boolean setField(Object obj, Field field, Object obj2) {
        try {
            field.set(obj, obj2);
            return true;
        } catch (IllegalAccessException e) {
            return false;
        }
    }

    private static String zMmdx0() {
        return cYHhs8.class.getSimpleName();
    }

    public static Field zl1RP8(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e) {
            return null;
        }
    }
}
