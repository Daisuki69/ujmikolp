package com.google.android.play.core.review;

import A7.f;
import J1.e;
import J1.h;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements I1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1.c f9732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f9733b = new Handler(Looper.getMainLooper());

    public b(I1.c cVar) {
        this.f9732a = cVar;
    }

    public final Task a(Activity activity, ReviewInfo reviewInfo) {
        zza zzaVar = (zza) reviewInfo;
        if (zzaVar.f9737b) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", zzaVar.f9736a);
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this.f9733b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    public final Task b() {
        int i = 1;
        int i4 = 0;
        I1.c cVar = this.f9732a;
        e eVar = I1.c.c;
        eVar.b("requestInAppReview (%s)", cVar.f2200b);
        if (cVar.f2199a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", e.c(eVar.f2381b, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap map = K1.a.f2558a;
            return Tasks.forException(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : androidx.media3.datasource.cache.c.l((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) K1.a.f2559b.get(-1), ")")))));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h hVar = cVar.f2199a;
        I1.b bVar = new I1.b(cVar, taskCompletionSource, taskCompletionSource, i4);
        synchronized (hVar.f) {
            hVar.e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new f(20, hVar, taskCompletionSource));
        }
        synchronized (hVar.f) {
            try {
                if (hVar.f2389k.getAndIncrement() > 0) {
                    e eVar2 = hVar.f2386b;
                    Object[] objArr2 = new Object[0];
                    eVar2.getClass();
                    if (Log.isLoggable("PlayCore", 3)) {
                        Log.d("PlayCore", e.c(eVar2.f2381b, "Already connected to the service.", objArr2));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.a().post(new I1.b(hVar, taskCompletionSource, bVar, i));
        return taskCompletionSource.getTask();
    }
}
