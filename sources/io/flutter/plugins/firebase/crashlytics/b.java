package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f17288b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ b(Map map, TaskCompletionSource taskCompletionSource, int i) {
        this.f17287a = i;
        this.f17288b = map;
        this.c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17287a) {
            case 0:
                FlutterFirebaseCrashlyticsPlugin.lambda$log$5(this.f17288b, this.c);
                break;
            case 1:
                FlutterFirebaseCrashlyticsPlugin.lambda$setUserIdentifier$8(this.f17288b, this.c);
                break;
            default:
                FlutterFirebaseCrashlyticsPlugin.lambda$setCustomKey$9(this.f17288b, this.c);
                break;
        }
    }
}
