package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f7777b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7778d;

    public /* synthetic */ h(Object obj, Executor executor, Object obj2, int i) {
        this.f7776a = i;
        this.c = obj;
        this.f7777b = executor;
        this.f7778d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7776a) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.c).lambda$onGnssMeasurementsReceived$0(this.f7777b, (GnssMeasurementsEvent) this.f7778d);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.c).lambda$onGpsStatusChanged$3(this.f7777b, (GnssStatusCompat) this.f7778d);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.c).lambda$onSatelliteStatusChanged$3(this.f7777b, (GnssStatus) this.f7778d);
                break;
        }
    }
}
