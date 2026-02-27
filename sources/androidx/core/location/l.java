package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f7787b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Object obj, int i) {
        this.f7786a = i;
        this.f7787b = locationListenerTransport;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7786a) {
            case 0:
                this.f7787b.lambda$onLocationChanged$1((List) this.c);
                break;
            default:
                this.f7787b.lambda$onLocationChanged$0((Location) this.c);
                break;
        }
    }
}
