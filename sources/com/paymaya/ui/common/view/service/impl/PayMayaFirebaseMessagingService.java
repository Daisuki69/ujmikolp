package com.paymaya.ui.common.view.service.impl;

import D.C;
import D.C0176i;
import D.C0187u;
import D.S;
import J5.b;
import Pc.c;
import Uh.d;
import Xc.a;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerLib;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.paymaya.R;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.domain.model.SendbirdMessage;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import dOYHB6.yFtIp6.svM7M6;
import g0.C1494c;
import g0.g;
import java.util.Map;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class PayMayaFirebaseMessagingService extends FirebaseMessagingService implements a {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f14434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f14435b;

    public final Oc.a c() {
        c cVar = this.f14434a;
        if (cVar != null) {
            return cVar;
        }
        j.n("mPayMayaFirebaseMessagingServicePresenter");
        throw null;
    }

    public final void d(Bundle bundle) {
        Object systemService = getSystemService("notification");
        j.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        String string = bundle.getString("nt");
        String string2 = bundle.getString("nm");
        String string3 = bundle.getString("wzrk_dl");
        String string4 = bundle.getString("dismiss_time_in_millis");
        long j = string4 != null ? Long.parseLong(string4) : 0L;
        if (j == 0) {
            Context applicationContext = getApplicationContext();
            int i = C0187u.c;
            C0187u c0187uB = C0187u.b(applicationContext, bundle.getString("wzrk_acct_id"));
            if (c0187uB != null) {
                C c10 = c0187uB.f949b;
                CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) c10.f814a;
                try {
                    synchronized (((g) c10.f822p).f16782l) {
                        g gVar = (g) c10.f822p;
                        gVar.i = new C1494c();
                        gVar.a(applicationContext, bundle, -1000);
                    }
                    return;
                } catch (Throwable th2) {
                    S sC = cleverTapInstanceConfig.c();
                    String str = cleverTapInstanceConfig.f9439a;
                    sC.getClass();
                    S.h(str, "Failed to process createNotification()", th2);
                    return;
                }
            }
            return;
        }
        String strValueOf = String.valueOf(string3);
        Intent intentMakeRestartActivityTask = Intent.makeRestartActivityTask(new ComponentName(this, (Class<?>) LauncherActivity.class));
        intentMakeRestartActivityTask.setFlags(268468224);
        intentMakeRestartActivityTask.putExtra("application-uri", strValueOf);
        intentMakeRestartActivityTask.putExtra("notificationId", bundle.hashCode());
        PendingIntent activity = PendingIntent.getActivity(this, bundle.hashCode(), intentMakeRestartActivityTask, 201326592);
        j.d(activity);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, getString(R.string.pma_default_notification_channel));
        builder.setContentTitle(string);
        builder.setContentText(string2);
        builder.setSmallIcon(R.drawable.maya_ic_push_notification);
        builder.setColor(ContextCompat.getColor(this, R.color.ocean_green));
        builder.setAutoCancel(true);
        builder.setContentIntent(activity);
        notificationManager.notify(bundle.hashCode(), builder.build());
        new Handler(Looper.getMainLooper()).postDelayed(new B5.g(14, notificationManager, bundle), j);
        C0187u c0187uF = C0187u.f(this);
        if (c0187uF != null) {
            ((C0176i) c0187uF.f949b.f).w(bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.firebase.messaging.RemoteMessage r8) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.ui.common.view.service.impl.PayMayaFirebaseMessagingService.e(com.google.firebase.messaging.RemoteMessage):void");
    }

    public final void f(RemoteMessage remoteMessage) {
        int i;
        SendbirdMessage sendbirdMessage = new SendbirdMessage(remoteMessage);
        boolean zB = j.b(sendbirdMessage.getNotificationPushDataType(), "TicketStatusNotif");
        String strValueOf = String.valueOf(zB ? com.paymaya.common.utility.C.d("paymaya://tickets", TtmlNode.ATTR_ID, sendbirdMessage.getNotificationPushDataCaseId()) : com.paymaya.common.utility.C.d(com.paymaya.common.utility.C.d(com.paymaya.common.utility.C.d("paymaya://inbox", "route", sendbirdMessage.getProcessedRoute()), "messageTimestamp", sendbirdMessage.getMessageTimestamp()), "channelUrl", sendbirdMessage.getChannelUrl()));
        Intent intentMakeRestartActivityTask = Intent.makeRestartActivityTask(new ComponentName(this, (Class<?>) LauncherActivity.class));
        intentMakeRestartActivityTask.setFlags(268468224);
        intentMakeRestartActivityTask.putExtra("application-uri", strValueOf);
        intentMakeRestartActivityTask.putExtra("notificationId", sendbirdMessage.getMessageId());
        boolean zW = z.w(sendbirdMessage.getChannelUrl(), 2, "maya_support", false);
        boolean z4 = Build.VERSION.SDK_INT >= 24;
        if (zW) {
            intentMakeRestartActivityTask.putExtra("group", sendbirdMessage.getChannelUrl());
        }
        PendingIntent activity = PendingIntent.getActivity(this, remoteMessage.hashCode(), intentMakeRestartActivityTask, 201326592);
        j.d(activity);
        String channelUrl = sendbirdMessage.getChannelUrl();
        b bVar = this.f14435b;
        if (bVar == null) {
            j.n("mChatSupportCache");
            throw null;
        }
        String str = bVar.f2415a;
        if (str == null) {
            str = "";
        }
        if (!j.b(channelUrl, str) || zB) {
            Object systemService = getSystemService("notification");
            j.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (!zW || z4) {
                Notification notificationBuild = new NotificationCompat.Builder(this, getString(R.string.pma_default_notification_channel)).setSmallIcon(R.drawable.maya_ic_push_notification).setColor(ContextCompat.getColor(this, R.color.ocean_green)).setContentTitle(sendbirdMessage.getPushTitle()).setContentText(sendbirdMessage.getMessageBody()).setStyle(new NotificationCompat.BigTextStyle().bigText(sendbirdMessage.getMessageBody())).setGroup(sendbirdMessage.getChannelUrl()).setContentIntent(activity).setAutoCancel(true).build();
                j.f(notificationBuild, "build(...)");
                notificationManager.notify(sendbirdMessage.getMessageTimestamp().hashCode(), notificationBuild);
            }
            if (zW && z4) {
                Notification notificationBuild2 = new NotificationCompat.Builder(this, getString(R.string.pma_default_notification_channel)).setSmallIcon(R.drawable.maya_ic_push_notification).setColor(ContextCompat.getColor(this, R.color.ocean_green)).setStyle(new NotificationCompat.InboxStyle().setSummaryText("Support")).setGroup(sendbirdMessage.getChannelUrl()).setGroupSummary(true).setContentText(sendbirdMessage.getPushTitle()).setContentIntent(activity).build();
                j.f(notificationBuild2, "build(...)");
                notificationManager.notify(sendbirdMessage.getChannelUrl().hashCode(), notificationBuild2);
            }
            if (!zW || z4) {
                return;
            }
            Oc.a aVarC = c();
            String channel = sendbirdMessage.getChannelUrl();
            j.g(channel, "channel");
            com.paymaya.data.preference.a aVar = ((c) aVarC).f5152d;
            if (j.b(svM7M6.getString(aVar.f11330b, "unread_support_channel", ""), channel)) {
                i = aVar.f11330b.getInt("unread_support_channel_count", 0);
            } else {
                aVar.f11330b.edit().putString("unread_support_channel", channel).apply();
                aVar.u0(0);
                i = 0;
            }
            int i4 = i + 1;
            String str2 = i4 + Global.BLANK + getResources().getQuantityString(R.plurals.maya_notification_message_chat_support, i4);
            com.paymaya.data.preference.a aVar2 = ((c) c()).f5152d;
            aVar2.u0(aVar2.f11330b.getInt("unread_support_channel_count", 0) + 1);
            Notification notificationBuild3 = new NotificationCompat.Builder(this, getString(R.string.pma_default_notification_channel)).setSmallIcon(R.drawable.maya_ic_push_notification).setColor(ContextCompat.getColor(this, R.color.ocean_green)).setContentTitle(sendbirdMessage.getPushTitle()).setContentText(str2).setStyle(new NotificationCompat.BigTextStyle().bigText(str2)).setGroup(sendbirdMessage.getChannelUrl()).setContentIntent(activity).setAutoCancel(true).build();
            j.f(notificationBuild3, "build(...)");
            notificationManager.notify(sendbirdMessage.getChannelUrl().hashCode(), notificationBuild3);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        O5.a aVar = (O5.a) W4.a.e().a().c;
        this.f14434a = new c((d) aVar.f4717g0.get(), (com.paymaya.data.preference.a) aVar.e.get());
        this.f14435b = (b) aVar.f4744v0.get();
        ((AbstractC2509a) c()).h(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        j.g(remoteMessage, "remoteMessage");
        try {
            if (remoteMessage.getData().containsKey("af-uinstall-tracking")) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_attribution_source", AttributionSource.f10369g);
            Map data = remoteMessage.getData();
            j.f(data, "getData(...)");
            for (Map.Entry entry : data.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            if (C0187u.h(bundle).f16771a) {
                bundle.toString();
                yk.a.a();
                d(bundle);
            } else if (remoteMessage.getData().containsKey("sendbird")) {
                f(remoteMessage);
            } else {
                e(remoteMessage);
            }
        } catch (Throwable unused) {
            yk.a.b();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String token) {
        j.g(token, "token");
        super.onNewToken(token);
        ((a) ((c) c()).c.get()).getClass();
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), token);
        C0187u c0187uF = C0187u.f(getApplicationContext());
        if (c0187uF != null) {
            ((g) c0187uF.f949b.f822p).d(token);
        }
    }
}
