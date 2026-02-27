package com.clevertap.android.sdk.pushnotification.fcm;

import B5.k;
import D.C0187u;
import D.S;
import D.d0;
import a0.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.impl.a;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.Global;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class CTFirebaseMessagingReceiver extends BroadcastReceiver implements b {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f9573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9574b = "";
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f9575d;
    public long e;

    public final void a(String str) {
        try {
            S.m("CTRM", "got a signal to kill receiver and timer because ".concat(str));
            if (!this.f9574b.trim().isEmpty()) {
            }
            long jNanoTime = System.nanoTime();
            if (this.f9575d == null || this.c) {
                S.m("CTRM", "have already informed OS to kill receiver, can not inform again else OS will get angry :-O");
                return;
            }
            S.m("CTRM", "informing OS to kill receiver...");
            this.f9575d.finish();
            this.c = true;
            k kVar = this.f9573a;
            if (kVar != null) {
                kVar.cancel();
            }
            S.m("CTRM", "informed OS to kill receiver...");
            S.m("CTRM", "receiver was alive for " + TimeUnit.NANOSECONDS.toSeconds(jNanoTime - this.e) + " seconds");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle bundle;
        this.e = System.nanoTime();
        S.c("CTRM", "received a message from Firebase");
        if (context == null || intent == null) {
            return;
        }
        RemoteMessage remoteMessage = new RemoteMessage(intent.getExtras());
        try {
            bundle = new Bundle();
            for (Map.Entry entry : remoteMessage.getData().entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            S.c("PushProvider", "FCMFound Valid Notification Message ");
        } catch (Throwable th2) {
            th2.printStackTrace();
            S.e("PushProvider", "FCMInvalid Notification Message ", th2);
            bundle = null;
        }
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = remoteMessage.f9764a;
        String string = bundle2.getString("google.delivered_priority");
        if (string != null) {
            if (!"high".equals(string) || !"normal".equals(string)) {
                S.c("CTRM", "returning from CTRM because message priority is not normal");
                return;
            }
        } else if (!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle2.getString("google.priority_reduced"))) {
            string = bundle2.getString("google.priority");
            if (!"high".equals(string)) {
            }
            S.c("CTRM", "returning from CTRM because message priority is not normal");
            return;
        }
        long j = Long.parseLong(bundle.getString("ctrmt", "4500"));
        this.f9575d = goAsync();
        if (!C0187u.h(bundle).f16771a) {
            S.m("CTRM", "Notification payload is not from CleverTap.");
            a("push is not from CleverTap.");
            return;
        }
        Pattern pattern = d0.f906a;
        boolean z4 = Boolean.parseBoolean((String) remoteMessage.getData().get("wzrk_tsr_fb"));
        boolean z5 = Boolean.parseBoolean((String) remoteMessage.getData().get("wzrk_fallback"));
        if (z4 || !z5) {
            S.m("CTRM", "Notification payload does not have a fallback key.");
            a("isRenderFallback is false");
            return;
        }
        String strJ = a.j(bundle.getString("wzrk_acct_id", ""), Global.UNDERSCORE, bundle.getString("wzrk_pid", ""));
        this.f9574b = strJ;
        C0187u.f.put(strJ, this);
        k kVar = new k(this, j);
        this.f9573a = kVar;
        kVar.start();
        new Thread(new androidx.work.impl.b(8, this, context, bundle)).start();
    }
}
