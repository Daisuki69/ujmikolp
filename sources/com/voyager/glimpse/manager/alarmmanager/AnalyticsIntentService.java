package com.voyager.glimpse.manager.alarmmanager;

import Cg.c;
import Qf.b;
import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import x3.d;

/* JADX INFO: loaded from: classes4.dex */
public class AnalyticsIntentService extends IntentService implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f16224d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlarmManager f16225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f16226b;
    public c c;

    public AnalyticsIntentService() {
        super("Send Analytics");
    }

    @Override // Qf.b
    public final void b() {
        AlarmManager alarmManager = this.f16225a;
        int i = SendAnalyticsBroadcastReceiver.f16227a;
        alarmManager.cancel(PendingIntent.getBroadcast(this, 1234, new Intent(this, (Class<?>) SendAnalyticsBroadcastReceiver.class), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        PendingIntent.getBroadcast(this, 1234, new Intent(this, (Class<?>) SendAnalyticsBroadcastReceiver.class), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).cancel();
    }

    @Override // Qf.b
    public final void finish() {
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (d.f20899a == null) {
            d.f20899a = Executors.newSingleThreadExecutor();
        }
        this.f16226b = d.f20899a;
        this.f16225a = (AlarmManager) getSystemService("alarm");
        Object obj = null;
        this.c = new c(25, this, obj, obj);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !intent.getAction().equals("Intent Action Send Analytics")) {
            return;
        }
        this.c.t();
    }
}
