package com.voyager.glimpse.manager.alarmmanager;

import S1.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public class SendAnalyticsBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16227a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r.f("Send Analytics Broadcast Receiver received PendingIntent.");
        int i = AnalyticsIntentService.f16224d;
        Intent intent2 = new Intent(context, (Class<?>) AnalyticsIntentService.class);
        intent2.setAction("Intent Action Send Analytics");
        context.startService(intent2);
    }
}
