package bg;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import cj.C1129o;
import kotlin.TypeCastException;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9101a;

    public n0(Context context) {
        this.f9101a = context;
    }

    public final String[] a() {
        String[] strArr;
        Context context = this.f9101a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo != null && (strArr = packageInfo.requestedPermissions) != null) {
                return strArr;
            }
            return new String[0];
        } catch (PackageManager.NameNotFoundException unused) {
            return new String[0];
        }
    }

    public final boolean b(String permission) {
        kotlin.jvm.internal.j.h(permission, "permission");
        String[] strArrA = a();
        if (strArrA.length == 0 || C1129o.p(strArrA, permission)) {
            boolean zEquals = permission.equals("android.permission.PACKAGE_USAGE_STATS");
            Context context = this.f9101a;
            if (zEquals) {
                Object systemService = context.getSystemService("appops");
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.AppOpsManager");
                }
                if (((AppOpsManager) systemService).checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName()) == 0) {
                    return true;
                }
            } else {
                if (!permission.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    if (permission.equals("android.permission.QUERY_ALL_PACKAGES")) {
                        return C1129o.p(a(), permission);
                    }
                    if ("android.permission.READ_SMS".equals(permission)) {
                        Object systemService2 = context.getSystemService("appops");
                        if (systemService2 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type android.app.AppOpsManager");
                        }
                        AppOpsManager appOpsManager = (AppOpsManager) systemService2;
                        String strPermissionToOp = AppOpsManager.permissionToOp(permission);
                        if (strPermissionToOp == null) {
                            strPermissionToOp = "android:read_sms";
                        }
                        return appOpsManager.noteOp(strPermissionToOp, Process.myUid(), context.getPackageName()) == 0 && context.checkSelfPermission(permission) == 0;
                    }
                    if (!"Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
                        return context.checkSelfPermission(permission) == 0;
                    }
                    Object systemService3 = context.getSystemService("appops");
                    if (systemService3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.AppOpsManager");
                    }
                    AppOpsManager appOpsManager2 = (AppOpsManager) systemService3;
                    String strPermissionToOp2 = AppOpsManager.permissionToOp(permission);
                    if (strPermissionToOp2 != null) {
                        if (appOpsManager2.noteOp(strPermissionToOp2, Process.myUid(), context.getPackageName()) == 0 && context.checkSelfPermission(permission) == 0) {
                            return true;
                        }
                    }
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    return Environment.isExternalStorageManager();
                }
            }
        }
        return false;
    }

    public final void c(String permission) throws IllegalAccessException {
        kotlin.jvm.internal.j.h(permission, "permission");
        if (!b(permission)) {
            throw new IllegalAccessException(permission);
        }
    }
}
