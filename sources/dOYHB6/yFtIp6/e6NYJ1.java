package dOYHB6.yFtIp6;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.camera.video.AudioStats;
import dOYHB6.nm8AQ4;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes6.dex */
public class e6NYJ1 extends Service implements LocationListener {
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10;
    private static final long MIN_TIME_BW_UPDATES = 60000;
    private static e6NYJ1 instance;
    private Location location;
    protected LocationManager locationManager;
    private String locationState = numX49.tnTj78("bHfU");
    private String wifiSSIDStatus = numX49.tnTj78("bHfe");

    private e6NYJ1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fZPQe5() {
        String strTnTj78 = numX49.tnTj78("bHf8");
        String strTnTj782 = numX49.tnTj78("bHfC");
        try {
            this.locationManager = (LocationManager) nm8AQ4.get().getSystemService("location");
            LocationManager locationManager = this.locationManager;
            String strTnTj783 = numX49.tnTj78("bHf4");
            String strTnTj784 = numX49.tnTj78("bHfo");
            if (locationManager == null) {
                this.locationState = strTnTj784;
                this.wifiSSIDStatus = strTnTj783;
                return;
            }
            if (this.locationManager.isProviderEnabled(strTnTj782)) {
                requestLocationUpdates(strTnTj782);
            }
            if (this.locationManager.isProviderEnabled(strTnTj78)) {
                requestLocationUpdates(strTnTj78);
            }
            if (this.locationManager.isProviderEnabled(strTnTj78) && this.locationManager.isProviderEnabled(strTnTj782)) {
                return;
            }
            this.locationState = strTnTj784;
            this.wifiSSIDStatus = strTnTj783;
        } catch (Exception e) {
            this.locationState = numX49.tnTj78("bHfK");
            this.wifiSSIDStatus = numX49.tnTj78("bHfw");
        }
    }

    public static e6NYJ1 getInstance() {
        if (instance == null) {
            instance = new e6NYJ1();
        }
        return instance;
    }

    public static double getLatitude() {
        return getInstance()._getLatitude();
    }

    public static double getLongitude() {
        return getInstance()._getLongitude();
    }

    public static String getState() {
        return getInstance().locationState;
    }

    public static String rPQuR3() {
        return getInstance().wifiSSIDStatus;
    }

    private void requestLocationUpdates(String str) {
        if (str.isEmpty() || this.locationManager == null) {
            return;
        }
        this.locationManager.requestLocationUpdates(str, 60000L, 10.0f, this);
        this.locationState = numX49.tnTj78("bHfc");
        this.wifiSSIDStatus = numX49.tnTj78("bHfm");
        Location lastKnownLocation = this.locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null) {
            this.location = lastKnownLocation;
        }
    }

    public static String wHceR3() {
        return getInstance().getSsid();
    }

    public double _getLatitude() {
        if (this.location == null) {
            getLocation();
        }
        if (this.location != null) {
            return this.location.getLatitude();
        }
        if (nm8AQ4.get().checkCallingOrSelfPermission(numX49.tnTj78("bHfD")) != 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        this.locationState = numX49.tnTj78("bHfh");
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public double _getLongitude() {
        if (this.location == null) {
            getLocation();
        }
        if (this.location != null) {
            return this.location.getLongitude();
        }
        if (nm8AQ4.get().checkCallingOrSelfPermission(numX49.tnTj78("bHfM")) != 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        this.locationState = numX49.tnTj78("bHfN");
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public void getLocation() {
        if (nm8AQ4.get().checkCallingOrSelfPermission(numX49.tnTj78("bHf6")) == -1 && nm8AQ4.get().checkCallingOrSelfPermission(numX49.tnTj78("bHfa")) == -1) {
            this.locationState = numX49.tnTj78("bHfX");
            this.wifiSSIDStatus = numX49.tnTj78("bHfG");
        } else {
            this.locationState = numX49.tnTj78("bHf3");
            this.wifiSSIDStatus = numX49.tnTj78("bHfy");
            new Handler(nm8AQ4.get().getMainLooper()).post(new Runnable() { // from class: dOYHB6.yFtIp6.e6NYJ1.1
                @Override // java.lang.Runnable
                public void run() {
                    e6NYJ1.this.fZPQe5();
                }
            });
        }
    }

    public String getSsid() {
        String strTnTj78 = numX49.tnTj78("bHfv");
        try {
            WifiInfo connectionInfo = ((WifiManager) nm8AQ4.get().getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo.getNetworkId() == -1) {
                this.wifiSSIDStatus = "Location services enabled no wifi connection";
                if (nm8AQ4.get().checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1 && nm8AQ4.get().checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == -1) {
                    this.wifiSSIDStatus = "This application is not authorized to use location services cant get WifiSsid";
                } else if (this.locationManager != null && !this.locationManager.isProviderEnabled("gps")) {
                    this.wifiSSIDStatus = "Location Services is disable cant get WifiSsid";
                }
            }
            return connectionInfo.getSSID().equals("<unknown ssid>") ? strTnTj78 : connectionInfo.getSSID();
        } catch (Exception e) {
            return strTnTj78;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        this.location = location;
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        getLocation();
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        getLocation();
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        getLocation();
    }
}
