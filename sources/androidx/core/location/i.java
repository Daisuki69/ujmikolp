package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f7780b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7781d;

    public /* synthetic */ i(Object obj, Executor executor, int i, int i4) {
        this.f7779a = i4;
        this.f7781d = obj;
        this.f7780b = executor;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7779a) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f7781d).lambda$onStatusChanged$1(this.f7780b, this.c);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.f7781d).lambda$onGpsStatusChanged$2(this.f7780b, this.c);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f7781d).lambda$onFirstFix$2(this.f7780b, this.c);
                break;
        }
    }
}
