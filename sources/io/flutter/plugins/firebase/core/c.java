package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17276b;
    public final /* synthetic */ Boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f17277d;

    public /* synthetic */ c(String str, Boolean bool, TaskCompletionSource taskCompletionSource, int i) {
        this.f17275a = i;
        this.f17276b = str;
        this.c = bool;
        this.f17277d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17275a) {
            case 0:
                FlutterFirebaseCorePlugin.lambda$setAutomaticDataCollectionEnabled$5(this.f17276b, this.c, this.f17277d);
                break;
            default:
                FlutterFirebaseCorePlugin.lambda$setAutomaticResourceManagementEnabled$6(this.f17276b, this.c, this.f17277d);
                break;
        }
    }
}
