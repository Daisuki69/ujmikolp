package androidx.work.impl;

import M8.A0;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import androidx.work.impl.model.WorkGenerationalId;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8228b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8229d;

    public /* synthetic */ a(int i, Object obj, Object obj2, boolean z4) {
        this.f8227a = i;
        this.c = obj;
        this.f8229d = obj2;
        this.f8228b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8227a) {
            case 0:
                ((Processor) this.c).lambda$runOnExecuted$2((WorkGenerationalId) this.f8229d, this.f8228b);
                return;
            case 1:
                Context context = (Context) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f8229d;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = A0.r(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f8228b) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
            default:
                ((com.tencent.could.huiyansdk.operate.a) this.c).b((String) this.f8229d, this.f8228b, null);
                return;
        }
    }

    public /* synthetic */ a(Context context, boolean z4, TaskCompletionSource taskCompletionSource) {
        this.f8227a = 1;
        this.c = context;
        this.f8228b = z4;
        this.f8229d = taskCompletionSource;
    }
}
