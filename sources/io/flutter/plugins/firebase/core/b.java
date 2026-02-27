package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCorePlugin f17274b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ b(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, TaskCompletionSource taskCompletionSource, int i) {
        this.f17273a = i;
        this.f17274b = flutterFirebaseCorePlugin;
        this.c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17273a) {
            case 0:
                this.f17274b.lambda$optionsFromResource$4(this.c);
                break;
            default:
                this.f17274b.lambda$initializeCore$3(this.c);
                break;
        }
    }
}
