package d2;

import Kh.I;
import Y.e;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.T;
import e2.C1422d;
import g2.InterfaceC1496a;
import h2.p;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: d2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1326a implements InterfaceC1496a, f2.a, B2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1327b f16252a;

    public /* synthetic */ C1326a(C1327b c1327b) {
        this.f16252a = c1327b;
    }

    @Override // g2.InterfaceC1496a
    public void a(p pVar) {
        C1327b c1327b = this.f16252a;
        synchronized (c1327b) {
            try {
                if (c1327b.f16254b instanceof g2.b) {
                    c1327b.c.add(pVar);
                }
                c1327b.f16254b.a(pVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // B2.a
    public void d(B2.b bVar) {
        C1327b c1327b = this.f16252a;
        c1327b.getClass();
        C1422d c1422d = C1422d.f16556a;
        c1422d.c("AnalyticsConnector now available.");
        Y1.b bVar2 = (Y1.b) bVar.get();
        L l6 = new L(bVar2, 8);
        e eVar = new e(28);
        Y1.c cVar = (Y1.c) bVar2;
        I iB = cVar.b("clx", eVar);
        if (iB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            I iB2 = cVar.b(AppMeasurement.CRASH_ORIGIN, eVar);
            if (iB2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            iB = iB2;
        }
        if (iB == null) {
            c1422d.g("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        c1422d.c("Registered Firebase Analytics listener.");
        T t5 = new T(7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        U8.c cVar2 = new U8.c(l6);
        synchronized (c1327b) {
            try {
                Iterator it = c1327b.c.iterator();
                while (it.hasNext()) {
                    t5.a((p) it.next());
                }
                eVar.c = t5;
                eVar.f6708b = cVar2;
                c1327b.f16254b = t5;
                c1327b.f16253a = cVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f2.a
    public void h(Bundle bundle) {
        this.f16252a.f16253a.h(bundle);
    }
}
