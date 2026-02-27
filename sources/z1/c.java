package Z1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y.e f6882b;

    public c(AppMeasurementSdk appMeasurementSdk, Y.e eVar) {
        this.f6882b = eVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new b(this));
        this.f6881a = new HashSet();
    }
}
