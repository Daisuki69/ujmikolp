package dOYHB6.lBzGT9;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import dOYHB6.nm8AQ4;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes6.dex */
public class i5fG65 implements z73qw4 {
    private static int LOCATION_TIME_DIFF_THRESHOLD = 1000;
    private static z73qw4 instance;
    private final LocationManager locationManager = (LocationManager) nm8AQ4.get().getSystemService(numX49.tnTj78("bHyS"));
    private Location newestUnderTimeDiffThresholdLocation;
    private Location oldestUnderTimeDiffThresholdLocation;

    private i5fG65() {
    }

    private static boolean g39bs1(Location location) {
        if (location == null) {
            return false;
        }
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        return latitude >= -90.0d && latitude <= 90.0d && longitude >= -180.0d && longitude <= 180.0d && !Double.isNaN(latitude) && !Double.isNaN(longitude);
    }

    public static synchronized z73qw4 getInstance() {
        if (instance == null) {
            instance = new i5fG65();
        }
        return instance;
    }

    public static boolean iWUBo9(Location location, double d10) {
        return (location == null || n1iN88(location) || ((double) ((System.currentTimeMillis() - location.getTime()) / 1000)) <= d10) ? false : true;
    }

    public static boolean n1iN88(Location location) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 30) {
            return location.isFromMockProvider();
        }
        if (i > 30) {
            return location.isMock();
        }
        return false;
    }

    private void pVfHo7() {
        if (pYp6Y3.uVdQL2()) {
            Location lastKnownLocation = this.locationManager.getLastKnownLocation(numX49.tnTj78("bHyi"));
            if (g39bs1(lastKnownLocation)) {
                if (this.newestUnderTimeDiffThresholdLocation == null || this.oldestUnderTimeDiffThresholdLocation == null) {
                    this.newestUnderTimeDiffThresholdLocation = lastKnownLocation;
                    this.oldestUnderTimeDiffThresholdLocation = lastKnownLocation;
                } else {
                    if (lastKnownLocation.getTime() - this.newestUnderTimeDiffThresholdLocation.getTime() > LOCATION_TIME_DIFF_THRESHOLD && this.newestUnderTimeDiffThresholdLocation.getTime() - this.oldestUnderTimeDiffThresholdLocation.getTime() > LOCATION_TIME_DIFF_THRESHOLD) {
                        this.oldestUnderTimeDiffThresholdLocation = this.newestUnderTimeDiffThresholdLocation;
                    }
                    this.newestUnderTimeDiffThresholdLocation = lastKnownLocation;
                }
            }
        }
    }

    public static void svwdc1(Activity activity) {
        getInstance().getLastLocation();
        String strFz7rZ7 = pYp6Y3.fz7rZ7(activity);
        if (strFz7rZ7.equals(pYp6Y3.yqRi20())) {
            return;
        }
        fChUQ4.zJGTn5(numX49.tnTj78("bHyd"), numX49.tnTj78("bHyj"), strFz7rZ7);
    }

    @Override // dOYHB6.lBzGT9.z73qw4
    public Location[] get2LastKnownLocations() {
        pVfHo7();
        if (this.newestUnderTimeDiffThresholdLocation == null || this.oldestUnderTimeDiffThresholdLocation == null || this.newestUnderTimeDiffThresholdLocation.getTime() - this.oldestUnderTimeDiffThresholdLocation.getTime() < LOCATION_TIME_DIFF_THRESHOLD || this.oldestUnderTimeDiffThresholdLocation == null || this.newestUnderTimeDiffThresholdLocation == null) {
            return null;
        }
        return new Location[]{new Location(this.oldestUnderTimeDiffThresholdLocation), new Location(this.newestUnderTimeDiffThresholdLocation)};
    }

    @Override // dOYHB6.lBzGT9.z73qw4
    public Location getLastLocation() {
        pVfHo7();
        if (this.newestUnderTimeDiffThresholdLocation == null) {
            return null;
        }
        return new Location(this.newestUnderTimeDiffThresholdLocation);
    }
}
