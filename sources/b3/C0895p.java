package b3;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: b3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0895p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1.g f8489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3.m f8490b;

    public C0895p(U1.g firebaseApp, e3.m settings, CoroutineContext backgroundDispatcher, W sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.j.g(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.j.g(settings, "settings");
        kotlin.jvm.internal.j.g(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.g(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f8489a = firebaseApp;
        this.f8490b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.2.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.f5904a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            Bj.H.w(Bj.H.c(backgroundDispatcher), null, null, new C0894o(this, sessionsActivityLifecycleCallbacks, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
