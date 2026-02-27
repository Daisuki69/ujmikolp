package com.clevertap.android.sdk.pushnotification.amp;

import D.C;
import D.C0187u;
import D.S;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import g0.g;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CTPushAmpWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTPushAmpWorker(Context context, WorkerParameters params) {
        super(context, params);
        j.g(context, "context");
        j.g(params, "params");
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        S.l("PushAmpWorker is awake");
        Context applicationContext = getApplicationContext();
        HashMap map = C0187u.e;
        if (map == null) {
            C0187u c0187uF = C0187u.f(applicationContext);
            if (c0187uF != null) {
                C c = c0187uF.f949b;
                if (((CleverTapInstanceConfig) c.f814a).i) {
                    ((g) c.f822p).g(applicationContext);
                } else {
                    S.b("Instance doesn't allow Background sync, not running the Job");
                }
            }
        } else {
            for (String str : map.keySet()) {
                C0187u c0187u = (C0187u) C0187u.e.get(str);
                if (c0187u == null || !((CleverTapInstanceConfig) c0187u.f949b.f814a).h) {
                    if (c0187u != null) {
                        C c10 = c0187u.f949b;
                        if (((CleverTapInstanceConfig) c10.f814a).i) {
                            ((g) c10.f822p).g(applicationContext);
                        }
                    }
                    S.c(str, "Instance doesn't allow Background sync, not running the Job");
                } else {
                    S.c(str, "Instance is Analytics Only not running the Job");
                }
            }
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        j.f(resultSuccess, "success(...)");
        return resultSuccess;
    }
}
