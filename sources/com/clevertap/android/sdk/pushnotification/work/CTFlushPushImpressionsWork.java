package com.clevertap.android.sdk.pushnotification.work;

import D.AbstractC0184q;
import D.C0187u;
import D.S;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import cj.C1110A;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CTFlushPushImpressionsWork extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9576a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTFlushPushImpressionsWork(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        j.g(context, "context");
        j.g(workerParams, "workerParams");
        this.f9576a = "CTFlushPushImpressionsWork";
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        String str = this.f9576a;
        S.c(str, "hello, this is FlushPushImpressionsWork from CleverTap. I am awake now and ready to flush push impressions:-)");
        S.c(str, "initiating push impressions flush...");
        Context applicationContext = getApplicationContext();
        j.f(applicationContext, "getApplicationContext(...)");
        ArrayList arrayList = new ArrayList();
        HashMap map = C0187u.e;
        if (map == null || map.isEmpty()) {
            C0187u c0187uF = C0187u.f(applicationContext);
            if (c0187uF != null) {
                arrayList.add(c0187uF);
            }
        } else {
            arrayList.addAll(C0187u.e.values());
        }
        ArrayList arrayListY = C1110A.y(arrayList);
        ArrayList<C0187u> arrayList2 = new ArrayList();
        for (Object obj : arrayListY) {
            if (!((CleverTapInstanceConfig) ((C0187u) obj).f949b.f814a).h) {
                arrayList2.add(obj);
            }
        }
        for (C0187u c0187u : arrayList2) {
            if (isStopped()) {
                S.c(str, "someone told me to stop flushing and go to sleep again! going to sleep now.ˁ(-.-)ˀzzZZ");
            }
            if (isStopped()) {
                ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                j.f(resultSuccess, "success(...)");
                return resultSuccess;
            }
            S.c(str, "flushing queue for push impressions on CT instance = " + c0187u.c());
            AbstractC0184q.d(c0187u, applicationContext, str, "PI_WM");
        }
        S.c(str, "flush push impressions work is DONE! going to sleep now...ˁ(-.-)ˀzzZZ");
        ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
        j.f(resultSuccess2, "success(...)");
        return resultSuccess2;
    }
}
