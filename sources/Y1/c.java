package Y1;

import Kh.I;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {
    public static volatile c c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f6730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6731b;

    public c(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f6730a = appMeasurementSdk;
        this.f6731b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (Z1.a.a(str) && Z1.a.b(bundle, str2) && Z1.a.d(str, str2, bundle)) {
            if ("clx".equals(str) && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f6730a.logEvent(str, str2, bundle);
        }
    }

    public final I b(String str, Y.e eVar) {
        Preconditions.checkNotNull(eVar);
        if (Z1.a.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f6731b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = AppMeasurement.FIAM_ORIGIN.equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f6730a;
                Object cVar = zEquals ? new Z1.c(appMeasurementSdk, eVar) : "clx".equals(str) ? new Z1.e(appMeasurementSdk, eVar) : null;
                if (cVar != null) {
                    concurrentHashMap.put(str, cVar);
                    return new I(19);
                }
            }
        }
        return null;
    }
}
