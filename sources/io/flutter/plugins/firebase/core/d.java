package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f17279b;

    public /* synthetic */ d(int i, TaskCompletionSource taskCompletionSource) {
        this.f17278a = i;
        this.f17279b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17278a) {
            case 0:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(this.f17279b);
                break;
            case 1:
                FlutterFirebaseCrashlyticsPlugin.lambda$deleteUnsentReports$2(this.f17279b);
                break;
            case 2:
                FlutterFirebaseCrashlyticsPlugin.lambda$sendUnsentReports$6(this.f17279b);
                break;
            default:
                FlutterFirebaseCrashlyticsPlugin.lambda$didReinitializeFirebaseCore$12(this.f17279b);
                break;
        }
    }
}
