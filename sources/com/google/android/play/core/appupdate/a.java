package com.google.android.play.core.appupdate;

import E1.b;
import E1.d;
import E1.f;
import E1.j;
import E1.l;
import F1.k;
import F1.q;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f9724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9725b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f9726d = new Handler(Looper.getMainLooper());

    public a(j jVar, d dVar, Context context) {
        this.f9724a = jVar;
        this.f9725b = dVar;
        this.c = context;
    }

    public final Task a() {
        String packageName = this.c.getPackageName();
        j jVar = this.f9724a;
        q qVar = jVar.f1234a;
        if (qVar != null) {
            j.e.c("requestUpdateInfo(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            qVar.a().post(new f(qVar, taskCompletionSource, taskCompletionSource, new f(jVar, taskCompletionSource, packageName, taskCompletionSource), 2));
            return taskCompletionSource.getTask();
        }
        Object[] objArr = {-9};
        k kVar = j.e;
        kVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", k.e(kVar.f1526b, "onError(%d)", objArr));
        }
        return Tasks.forException(new InstallException(-9));
    }

    public final Task b(E1.a aVar, FragmentActivity fragmentActivity, l lVar) {
        if (aVar == null || aVar.f1223d) {
            return Tasks.forException(new InstallException(-4));
        }
        PendingIntent pendingIntent = aVar.c;
        if ((pendingIntent != null ? pendingIntent : null) == null) {
            return Tasks.forException(new InstallException(-6));
        }
        aVar.f1223d = true;
        Intent intent = new Intent(fragmentActivity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent != null ? pendingIntent : null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zze(this.f9726d, taskCompletionSource));
        fragmentActivity.startActivity(intent);
        return taskCompletionSource.getTask();
    }
}
