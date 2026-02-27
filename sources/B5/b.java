package B5;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import kotlin.time.a;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f351b;

    public /* synthetic */ b(Object obj, int i) {
        this.f350a = i;
        this.f351b = obj;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    public void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f351b;
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("google.c.a.tc"))) {
                    Y1.b bVar = (Y1.b) U1.g.e().c(Y1.b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (bVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        Y1.c cVar = (Y1.c) bVar;
                        if (Z1.a.a(AppMeasurement.FCM_ORIGIN) && Z1.a.c(AppMeasurement.FCM_ORIGIN, "_ln")) {
                            cVar.f6730a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", string2);
                        }
                        Bundle bundleE = androidx.media3.datasource.cache.c.e("source", "Firebase", "medium", "notification");
                        bundleE.putString("campaign", string2);
                        cVar.a(AppMeasurement.FCM_ORIGIN, "_cmp", bundleE);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            x3.d.w(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f350a) {
            case 0:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
            case 1:
                kotlin.jvm.internal.j.g(activity, "activity");
                ((d) this.f351b).f358d = new WeakReference(activity);
                break;
            case 2:
                kotlin.jvm.internal.j.g(activity, "activity");
                ((l) this.f351b).i = new WeakReference(activity);
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new androidx.media3.common.util.g(17, this, intent));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f350a) {
            case 0:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
            case 1:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
            case 2:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f350a) {
            case 0:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
            case 1:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
            case 2:
                kotlin.jvm.internal.j.g(activity, "activity");
                l lVar = (l) this.f351b;
                k kVar = lVar.e;
                if (kVar != null) {
                    kVar.cancel();
                }
                lVar.f373a.c0();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object obj = this.f351b;
        switch (this.f350a) {
            case 0:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
            case 1:
                kotlin.jvm.internal.j.g(activity, "activity");
                ((d) obj).f358d = new WeakReference(activity);
                break;
            case 2:
                kotlin.jvm.internal.j.g(activity, "activity");
                l lVar = (l) obj;
                lVar.i = new WeakReference(activity);
                if ((activity instanceof Qc.b) || lVar.f) {
                    k kVar = lVar.e;
                    if (kVar != null) {
                        kVar.cancel();
                    }
                } else {
                    com.paymaya.data.preference.a aVar = lVar.f373a;
                    aVar.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() - aVar.f11330b.getLong("key_last_activity_timestamp", System.currentTimeMillis());
                    a.C0097a c0097a = kotlin.time.a.f18208b;
                    if (jCurrentTimeMillis < kotlin.time.a.d(kotlin.time.b.d(((Number) lVar.j.getValue()).doubleValue(), Aj.b.e))) {
                        lVar.a(activity);
                        k kVar2 = lVar.e;
                        if (kVar2 != null) {
                            kVar2.start();
                        }
                        aVar.c0();
                    } else if (!aVar.f11330b.getBoolean("key_is_session_expired", false)) {
                        aVar.r0(true);
                        lVar.b();
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        switch (this.f350a) {
            case 0:
                kotlin.jvm.internal.j.g(activity, "activity");
                kotlin.jvm.internal.j.g(outState, "outState");
                break;
            case 1:
                kotlin.jvm.internal.j.g(activity, "activity");
                kotlin.jvm.internal.j.g(outState, "outState");
                break;
            case 2:
                kotlin.jvm.internal.j.g(activity, "activity");
                kotlin.jvm.internal.j.g(outState, "bundle");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f350a) {
            case 0:
                kotlin.jvm.internal.j.g(activity, "activity");
                c cVar = (c) this.f351b;
                if (!cVar.c.e()) {
                    Ag.k kVar = new Ag.k(cVar, 1);
                    cVar.c.getClass();
                    A5.m.c(kVar);
                } else {
                    cVar.a();
                }
                break;
            case 1:
                kotlin.jvm.internal.j.g(activity, "activity");
                ((d) this.f351b).f358d = new WeakReference(activity);
                break;
            case 2:
                kotlin.jvm.internal.j.g(activity, "activity");
                ((l) this.f351b).i = new WeakReference(activity);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f350a) {
            case 0:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
            case 1:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
            case 2:
                kotlin.jvm.internal.j.g(activity, "activity");
                break;
        }
    }

    public b() {
        this.f350a = 3;
        this.f351b = new ArrayDeque(10);
    }
}
