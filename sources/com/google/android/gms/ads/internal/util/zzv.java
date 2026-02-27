package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.core.graphics.a;
import c2.AbstractC1066i;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzcfz;
import com.google.android.gms.internal.ads.zzecy;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(26)
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzt, com.google.android.gms.ads.internal.util.zzz
    public final zzcev zzb(zzcek zzcekVar, zzbbh zzbbhVar, boolean z4, @Nullable zzecy zzecyVar) {
        return new zzcfz(zzcekVar, zzbbhVar, z4, zzecyVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final zzbbn.zzq zzf(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzt.zzc();
        return zzs.zzE(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? zzbbn.zzq.ENUM_TRUE : zzbbn.zzq.ENUM_FALSE : zzbbn.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzg(Context context, String str, String str2) {
        a.x();
        NotificationChannel notificationChannelE = AbstractC1066i.e(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjl)).intValue());
        notificationChannelE.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelE);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzh(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    @Nullable
    public final Intent zzi(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
