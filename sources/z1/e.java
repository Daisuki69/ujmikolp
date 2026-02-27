package Z1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y.e f6884a;

    public e(AppMeasurementSdk appMeasurementSdk, Y.e eVar) {
        this.f6884a = eVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new d(this));
    }
}
