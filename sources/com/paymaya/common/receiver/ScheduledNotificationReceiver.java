package com.paymaya.common.receiver;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.ScheduledNotification;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class ScheduledNotificationReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10363a = 0;

    public static PendingIntent a(Context context, ScheduledNotification scheduledNotification) {
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        if (!C.e(scheduledNotification.mSchedulingDataIdentifier())) {
            intent.setData(Uri.parse("scheduled_notification://" + scheduledNotification.mSchedulingDataIdentifier()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("scheduled_notification", scheduledNotification);
        intent.putExtra("notification_payload_bundle", bundle);
        return PendingIntent.getBroadcast(context, scheduledNotification.mSchedulingRequestCode(), intent, 201326592);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ScheduledNotification scheduledNotification = (ScheduledNotification) intent.getBundleExtra("notification_payload_bundle").getParcelable("scheduled_notification");
        if (scheduledNotification == null) {
            a.f();
            return;
        }
        String strMNotificationChannelId = scheduledNotification.mNotificationChannelId();
        if (C.e(strMNotificationChannelId)) {
            strMNotificationChannelId = context.getString(R.string.pma_default_notification_channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, strMNotificationChannelId);
        builder.setSmallIcon(R.drawable.maya_ic_push_notification).setContentTitle(scheduledNotification.mTitle()).setContentText(scheduledNotification.mText()).setColor(ContextCompat.getColor(context, R.color.ocean_green)).setPriority(0).setAutoCancel(true);
        if (!C.e(scheduledNotification.mContentIntent())) {
            builder.setContentIntent(scheduledNotification.mContentIntent());
        }
        builder.setDefaults(7);
        ((NotificationManager) context.getSystemService("notification")).notify(intent.hashCode(), builder.build());
    }
}
