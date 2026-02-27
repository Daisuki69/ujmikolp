package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference f9817d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f9818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ci.b f9819b;
    public final ScheduledThreadPoolExecutor c;

    public x(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.f9818a = sharedPreferences;
    }

    public final synchronized w a() {
        w wVar;
        String strH = this.f9819b.H();
        Pattern pattern = w.f9814d;
        wVar = null;
        if (!TextUtils.isEmpty(strH)) {
            String[] strArrSplit = strH.split("!", -1);
            if (strArrSplit.length == 2) {
                wVar = new w(strArrSplit[0], strArrSplit[1]);
            }
        }
        return wVar;
    }

    public final synchronized void b() {
        this.f9819b = Ci.b.o(this.f9818a, this.c);
    }

    public final synchronized void c(w wVar) {
        this.f9819b.J(wVar.c);
    }
}
