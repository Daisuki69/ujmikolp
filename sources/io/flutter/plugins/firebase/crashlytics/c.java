package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin f17290b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ c(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, TaskCompletionSource taskCompletionSource, int i) {
        this.f17289a = i;
        this.f17290b = flutterFirebaseCrashlyticsPlugin;
        this.c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17289a) {
            case 0:
                this.f17290b.lambda$checkForUnsentReports$0(this.c);
                break;
            default:
                this.f17290b.lambda$didCrashOnPreviousExecution$3(this.c);
                break;
        }
    }
}
