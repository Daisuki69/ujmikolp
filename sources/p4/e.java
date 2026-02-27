package p4;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Looper;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f19067a;

    public e(f fVar) {
        this.f19067a = fVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        String.format(Locale.US, "Provider " + location.getProvider() + " received location: %f, %f, %f", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf(location.getAccuracy()));
        f fVar = this.f19067a;
        fVar.getClass();
        if (fVar.f(location, fVar.e)) {
            fVar.e = location;
        }
        Looper looper = fVar.f19069g;
        if (looper != null) {
            looper.quitSafely();
            fVar.f19069g = null;
            fVar.g();
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
