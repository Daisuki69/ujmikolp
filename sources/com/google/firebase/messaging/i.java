package com.google.firebase.messaging;

import D.CallableC0170c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static D f9784d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9786b;

    public i(ExecutorService executorService) {
        this.f9786b = new ArrayMap();
        this.f9785a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z4) {
        D d10;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (f9784d == null) {
                    f9784d = new D(context);
                }
                d10 = f9784d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z4) {
            return d10.b(intent).continueWith(new androidx.arch.core.executor.a(2), new androidx.media3.extractor.flv.a(29));
        }
        if (r.r().C(context)) {
            A.b(context, d10, intent);
        } else {
            d10.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zIsAtLeastO = PlatformVersion.isAtLeastO();
        Context context = (Context) this.f9785a;
        boolean z4 = zIsAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z5 = (intent.getFlags() & 268435456) != 0;
        if (z4 && !z5) {
            return a(context, intent, z5);
        }
        androidx.arch.core.executor.a aVar = (androidx.arch.core.executor.a) this.f9786b;
        return Tasks.call(aVar, new CallableC0170c(13, context, intent)).continueWithTask(aVar, new androidx.navigation.ui.b(context, intent, z5));
    }

    public i(Context context) {
        this.f9785a = context;
        this.f9786b = new androidx.arch.core.executor.a(2);
    }

    public i(p pVar) {
        this.f9785a = pVar.o("gcm.n.title");
        pVar.l("gcm.n.title");
        Object[] objArrK = pVar.k("gcm.n.title");
        if (objArrK != null) {
            String[] strArr = new String[objArrK.length];
            for (int i = 0; i < objArrK.length; i++) {
                strArr[i] = String.valueOf(objArrK[i]);
            }
        }
        this.f9786b = pVar.o("gcm.n.body");
        pVar.l("gcm.n.body");
        Object[] objArrK2 = pVar.k("gcm.n.body");
        if (objArrK2 != null) {
            String[] strArr2 = new String[objArrK2.length];
            for (int i4 = 0; i4 < objArrK2.length; i4++) {
                strArr2[i4] = String.valueOf(objArrK2[i4]);
            }
        }
        pVar.o("gcm.n.icon");
        if (TextUtils.isEmpty(pVar.o("gcm.n.sound2"))) {
            pVar.o("gcm.n.sound");
        }
        pVar.o("gcm.n.tag");
        pVar.o("gcm.n.color");
        pVar.o("gcm.n.click_action");
        pVar.o("gcm.n.android_channel_id");
        String strO = pVar.o("gcm.n.link_android");
        strO = TextUtils.isEmpty(strO) ? pVar.o("gcm.n.link") : strO;
        if (!TextUtils.isEmpty(strO)) {
            Uri.parse(strO);
        }
        pVar.o("gcm.n.image");
        pVar.o("gcm.n.ticker");
        pVar.g("gcm.n.notification_priority");
        pVar.g("gcm.n.visibility");
        pVar.g("gcm.n.notification_count");
        pVar.e("gcm.n.sticky");
        pVar.e("gcm.n.local_only");
        pVar.e("gcm.n.default_sound");
        pVar.e("gcm.n.default_vibrate_timings");
        pVar.e("gcm.n.default_light_settings");
        pVar.m();
        pVar.j();
        pVar.p();
    }
}
