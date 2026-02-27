package dOYHB6.speLp8;

import android.content.pm.ApplicationInfo;
import android.os.Process;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class ilLni8 {
    private static boolean initialized = false;

    public static void aPokb1() {
        try {
            System.loadLibrary(g99FH4());
        } catch (Exception e) {
            Process.killProcess(Process.myPid());
        } catch (UnsatisfiedLinkError e7) {
            Process.killProcess(Process.myPid());
        }
    }

    public static void d8ErU0() {
        if (initialized || Process.myPid() != Process.myTid() || nuNd54()) {
            return;
        }
        initialized = true;
        aPokb1();
    }

    public static File ePXUU0() {
        try {
            return new File(((ApplicationInfo) Objects.requireNonNull(zNSPf1())).dataDir);
        } catch (Exception e) {
            return null;
        }
    }

    private static final String g99FH4() {
        return "loader";
    }

    public static Object getFieldValue(String str, Object obj, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e7) {
            e7.printStackTrace();
            return null;
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return null;
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static boolean nuNd54() {
        return Process.isIsolated();
    }

    public static String o3RBV7() {
        try {
            File fileEPXUU0 = ePXUU0();
            if (fileEPXUU0 == null) {
                return null;
            }
            return fileEPXUU0.getParent() + "/";
        } catch (Exception e) {
            return null;
        }
    }

    private static final String zMmdx0() {
        return "runtime.Setup";
    }

    private static ApplicationInfo zNSPf1() {
        try {
            return (ApplicationInfo) getFieldValue("android.app.LoadedApk", getFieldValue("android.app.ActivityThread$AppBindData", getFieldValue("android.app.ActivityThread", Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), "mBoundApplication"), "info"), "mApplicationInfo");
        } catch (Exception e) {
            return null;
        }
    }
}
