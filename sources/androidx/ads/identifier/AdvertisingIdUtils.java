package androidx.ads.identifier;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AdvertisingIdUtils {
    public static final String GET_AD_ID_ACTION = "androidx.ads.identifier.provider.GET_AD_ID";

    @VisibleForTesting
    static final String HIGH_PRIORITY_PERMISSION = "androidx.ads.identifier.provider.HIGH_PRIORITY";

    @NonNull
    public static List<ServiceInfo> getAdvertisingIdProviderServices(@NonNull PackageManager packageManager) {
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent(GET_AD_ID_ACTION), Build.VERSION.SDK_INT >= 24 ? 1048576 : 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (Build.VERSION.SDK_INT >= 24 || isSystemByApplicationInfo(serviceInfo.packageName, packageManager)) {
                arrayList.add(serviceInfo);
            }
        }
        return arrayList;
    }

    private static boolean hasHigherPriority(PackageInfo packageInfo, PackageInfo packageInfo2) {
        boolean zIsRequestHighPriority = isRequestHighPriority(packageInfo);
        if (zIsRequestHighPriority != isRequestHighPriority(packageInfo2)) {
            return zIsRequestHighPriority;
        }
        long j = packageInfo.firstInstallTime;
        long j6 = packageInfo2.firstInstallTime;
        return j != j6 ? j < j6 : packageInfo.packageName.compareTo(packageInfo2.packageName) < 0;
    }

    private static boolean isRequestHighPriority(PackageInfo packageInfo) {
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (HIGH_PRIORITY_PERMISSION.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSystemByApplicationInfo(@NonNull String str, @NonNull PackageManager packageManager) {
        return (packageManager.getApplicationInfo(str, 0).flags & 1) != 0;
    }

    @Nullable
    public static ServiceInfo selectServiceByPriority(@NonNull List<ServiceInfo> list, @NonNull PackageManager packageManager) {
        PackageInfo packageInfo;
        ServiceInfo serviceInfo = null;
        if (list.isEmpty()) {
            return null;
        }
        PackageInfo packageInfo2 = null;
        for (ServiceInfo serviceInfo2 : list) {
            try {
                packageInfo = packageManager.getPackageInfo(serviceInfo2.packageName, 4096);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo2 == null || hasHigherPriority(packageInfo, packageInfo2)) {
                serviceInfo = serviceInfo2;
                packageInfo2 = packageInfo;
            }
        }
        return serviceInfo;
    }
}
