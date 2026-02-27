package com.google.android.play.core.review;

import F1.d;
import J1.e;
import J1.g;
import J1.h;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f9734b;
    public final TaskCompletionSource c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I1.c f9735d;

    public c(I1.c cVar, TaskCompletionSource taskCompletionSource) {
        e eVar = new e("OnRequestInstallCallback", 0);
        this.f9735d = cVar;
        super(1);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f9734b = eVar;
        this.c = taskCompletionSource;
    }

    public final void zzb(Bundle bundle) {
        h hVar = this.f9735d.f2199a;
        if (hVar != null) {
            TaskCompletionSource taskCompletionSource = this.c;
            synchronized (hVar.f) {
                hVar.e.remove(taskCompletionSource);
            }
            synchronized (hVar.f) {
                try {
                    if (hVar.f2389k.get() <= 0 || hVar.f2389k.decrementAndGet() <= 0) {
                        hVar.a().post(new g(hVar, 0));
                    } else {
                        hVar.f2386b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                } finally {
                }
            }
        }
        this.f9734b.b("onGetLaunchReviewFlowInfo", new Object[0]);
        this.c.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
