package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin f17285b;
    public final /* synthetic */ Map c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f17286d;

    public /* synthetic */ a(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, Map map, TaskCompletionSource taskCompletionSource, int i) {
        this.f17284a = i;
        this.f17285b = flutterFirebaseCrashlyticsPlugin;
        this.c = map;
        this.f17286d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17284a) {
            case 0:
                this.f17285b.lambda$recordError$4(this.c, this.f17286d);
                break;
            default:
                this.f17285b.lambda$setCrashlyticsCollectionEnabled$7(this.c, this.f17286d);
                break;
        }
    }
}
