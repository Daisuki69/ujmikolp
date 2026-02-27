package dOYHB6.oNEjN0;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import dOYHB6.nm8AQ4;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class qEeHe8 {
    private static boolean send_malicious_permission_event = false;

    private static boolean ocbs83(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static void qFopv6() {
        PackageManager packageManager;
        List<ApplicationInfo> installedApplications;
        String[] strArr;
        if (send_malicious_permission_event || (installedApplications = (packageManager = nm8AQ4.get().getPackageManager()).getInstalledApplications(128)) == null) {
            return;
        }
        boolean bool = qOnQ39.getBool(numX49.tnTj78("bHYi"), false);
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (applicationInfo != null) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(applicationInfo.packageName, 4096);
                    if (packageInfo != null && (strArr = packageInfo.requestedPermissions) != null) {
                        List listAsList = Arrays.asList(strArr);
                        boolean zContains = listAsList.contains("android.permission.ACCESS_SUPERUSER");
                        String strTnTj78 = numX49.tnTj78("bHYE");
                        if (zContains) {
                            str = listAsList.contains("android.permission.SYSTEM_ALERT_WINDOW") ? "3fceb4349c9911814c87ba048eced215_d951a6e756f4f720a434fe348e6fa3bf" : null;
                            if (ocbs83(listAsList, "ACCESS_SUPERUSER_SERVICE") && ocbs83(listAsList, "SUPERUSER_SHELL")) {
                                str = str == null ? "3fceb4349c9911814c87ba048eced215_571b521ac836baec5b4ac16d1d79b633" : strTnTj78;
                            }
                        }
                        if (str != null) {
                            if (!bool || str.equals(strTnTj78)) {
                                send_malicious_permission_event = true;
                                fChUQ4.zJGTn5(str, "clickBotPermissionDetectionMethod", "Detected malicious click bot package: " + applicationInfo.packageName + " with permissions: " + listAsList, "clickBotApplicationName", (String) applicationInfo.loadLabel(packageManager));
                                return;
                            }
                            return;
                        }
                        continue;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        }
    }
}
