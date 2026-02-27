package com.paymaya.common.utility;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I {
    public static boolean a(FragmentActivity fragmentActivity, String... strArr) {
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(fragmentActivity);
        if (Build.VERSION.SDK_INT >= 26) {
            for (String str : strArr) {
                NotificationChannel notificationChannel = notificationManagerCompatFrom.getNotificationChannel(str);
                if (notificationChannel == null || notificationChannel.getImportance() == 0) {
                    return false;
                }
            }
        }
        return notificationManagerCompatFrom.areNotificationsEnabled();
    }

    public static /* synthetic */ void b(Context context, AlertDialog alertDialog) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName()));
        } else {
            context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addFlags(268435456).setData(Uri.fromParts("package", context.getPackageName(), null)));
        }
        alertDialog.dismiss();
    }
}
