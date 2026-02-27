package D;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import dOYHB6.tiZVw8.numX49;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: D.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0172e implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.app.Activity r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0172e.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        HashMap map = C0187u.e;
        if (map == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            C0187u c0187u = (C0187u) C0187u.e.get((String) it.next());
            if (c0187u != null) {
                try {
                    ((C0171d) c0187u.f949b.e).b();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (C0187u.e == null) {
            C0187u.a(activity.getApplicationContext(), null);
        }
        B.f798v = true;
        if (C0187u.e == null) {
            S.l(numX49.tnTj78("Pe27"));
            return;
        }
        Activity activityF = B.f();
        String localClassName = activityF != null ? activityF.getLocalClassName() : null;
        if (activity == null) {
            B.f799w = null;
        } else if (!activity.getLocalClassName().contains(numX49.tnTj78("Pe2A"))) {
            B.f799w = new WeakReference(activity);
        }
        if (localClassName == null || !localClassName.equals(activity.getLocalClassName())) {
            B.f800x++;
        }
        if (B.f801y <= 0) {
            C0187u.f947g.getClass();
            B.f801y = (int) (System.currentTimeMillis() / ((long) 1000));
        }
        Iterator it = C0187u.e.keySet().iterator();
        while (it.hasNext()) {
            C0187u c0187u = (C0187u) C0187u.e.get((String) it.next());
            if (c0187u != null) {
                try {
                    ((C0171d) c0187u.f949b.e).c();
                } catch (Throwable th2) {
                    S.l(numX49.tnTj78("Pe2Y") + th2.getLocalizedMessage());
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
