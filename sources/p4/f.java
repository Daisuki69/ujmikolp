package p4;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import k2.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractC2012a {
    public final LocationManager f;
    public final Context h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f19068d = new e(this);
    public Location e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Looper f19069g = null;

    public f(Context context) {
        this.h = context;
        this.f = (LocationManager) context.getSystemService("location");
    }

    @Override // p4.AbstractC2012a
    public final void d() {
        boolean zIsProviderEnabled;
        Location lastKnownLocation;
        LocationManager locationManager = this.f;
        if (locationManager == null) {
            h();
            return;
        }
        List<String> providers = locationManager.getProviders(true);
        if (providers.size() == 1 && providers.contains("passive")) {
            providers.clear();
        }
        if (providers.isEmpty()) {
            b("LOCATION_SERVICES_DISABLED");
            h();
            return;
        }
        providers.toString();
        Date date = new Date();
        for (String str : providers) {
            try {
                lastKnownLocation = locationManager.getLastKnownLocation(str);
            } catch (IllegalArgumentException e) {
                e.getMessage();
                b("LOCATION_COLLECTOR_UNAVAILABLE");
                c(Boolean.FALSE);
                lastKnownLocation = null;
            } catch (SecurityException e7) {
                e7.getMessage();
                b("PERMISSION_DENIED");
                c(Boolean.FALSE);
                lastKnownLocation = null;
            }
            if (lastKnownLocation != null) {
                String.format(Locale.US, "Got location for %s: %f, %f, %f", str, Double.valueOf(lastKnownLocation.getLongitude()), Double.valueOf(lastKnownLocation.getLatitude()), Float.valueOf(lastKnownLocation.getAccuracy()));
                if (date.getTime() - lastKnownLocation.getTime() < 86400000 && f(lastKnownLocation, this.e)) {
                    lastKnownLocation.getProvider();
                    this.e = lastKnownLocation;
                }
            }
        }
        if (this.e == null) {
            if (v0.r(this.h)) {
                b("NOT_AVAILABLE");
            } else {
                try {
                    zIsProviderEnabled = locationManager.isProviderEnabled("network");
                } catch (Exception e10) {
                    e10.getMessage();
                    zIsProviderEnabled = false;
                }
                if (zIsProviderEnabled && Looper.myLooper() != null) {
                    this.f19069g = Looper.myLooper();
                    Criteria criteria = new Criteria();
                    criteria.setAccuracy(2);
                    criteria.setPowerRequirement(0);
                    criteria.setAltitudeRequired(false);
                    criteria.setBearingRequired(false);
                    criteria.setSpeedRequired(false);
                    criteria.setHorizontalAccuracy(1);
                    criteria.setVerticalAccuracy(1);
                    try {
                        locationManager.requestSingleUpdate(criteria, this.f19068d, this.f19069g);
                    } catch (IllegalArgumentException e11) {
                        e11.getMessage();
                        b("LOCATION_COLLECTOR_UNAVAILABLE");
                        c(Boolean.FALSE);
                    } catch (SecurityException e12) {
                        e12.getMessage();
                        b("PERMISSION_DENIED");
                        c(Boolean.FALSE);
                    }
                    Looper.loop();
                    if (this.e == null) {
                        b("TIME_OUT");
                    }
                }
            }
        }
        h();
    }

    @Override // p4.AbstractC2012a
    public final String e() {
        return "collector_geo_loc";
    }

    public final boolean f(Location location, Location location2) {
        return location2 == null || ((int) (location.getAccuracy() - location2.getAccuracy())) < 0;
    }

    public final void g() {
        try {
            this.f.removeUpdates(this.f19068d);
        } catch (SecurityException e) {
            e.getMessage();
        }
    }

    public final void h() {
        boolean z4;
        Looper looper = this.f19069g;
        if (looper != null) {
            looper.quitSafely();
            this.f19069g = null;
            g();
        }
        Location location = this.e;
        if (location != null) {
            a("lat", Double.toString(location.getLatitude()));
            a("lon", Double.toString(this.e.getLongitude()));
            a("ltm", Long.toString(this.e.getTime() / 1000));
            z4 = true;
        } else {
            z4 = false;
        }
        c(Boolean.valueOf(z4));
    }
}
