package bg;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.nfc.NfcManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import dOYHB6.yFtIp6.ht2aO8;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: bg.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1007k extends kotlin.jvm.internal.k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f9020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1007k(Context context, int i) {
        super(0);
        this.f9019a = i;
        this.f9020b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9019a) {
            case 0:
                Object systemService = this.f9020b.getSystemService("systemhealth");
                if (systemService != null) {
                    return androidx.webkit.internal.a.k(systemService);
                }
                throw new TypeCastException("null cannot be cast to non-null type android.os.health.SystemHealthManager");
            case 1:
                Object systemService2 = this.f9020b.getSystemService("sensor");
                if (!(systemService2 instanceof SensorManager)) {
                    systemService2 = null;
                }
                return (SensorManager) systemService2;
            case 2:
                Object systemService3 = this.f9020b.getSystemService("activity");
                if (systemService3 != null) {
                    return (ActivityManager) systemService3;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
            case 3:
                Object systemService4 = this.f9020b.getSystemService("audio");
                if (systemService4 != null) {
                    return (AudioManager) systemService4;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.media.AudioManager");
            case 4:
                Object systemService5 = this.f9020b.getSystemService("bluetooth");
                if (systemService5 != null) {
                    return ((BluetoothManager) systemService5).getAdapter();
                }
                throw new TypeCastException("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            case 5:
                Object systemService6 = this.f9020b.getSystemService("wifi");
                if (systemService6 != null) {
                    return ((WifiManager) systemService6).getDhcpInfo();
                }
                throw new TypeCastException("null cannot be cast to non-null type android.net.wifi.WifiManager");
            case 6:
                Object systemService7 = this.f9020b.getSystemService("fingerprint");
                if (!(systemService7 instanceof FingerprintManager)) {
                    systemService7 = null;
                }
                return (FingerprintManager) systemService7;
            case 7:
                Context context = this.f9020b;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.consumerir")) {
                    return null;
                }
                Object systemService8 = context.getSystemService("consumer_ir");
                return (ConsumerIrManager) (systemService8 instanceof ConsumerIrManager ? systemService8 : null);
            case 8:
                Object systemService9 = this.f9020b.getSystemService("wifi");
                if (systemService9 != null) {
                    return ((WifiManager) systemService9).getConnectionInfo();
                }
                throw new TypeCastException("null cannot be cast to non-null type android.net.wifi.WifiManager");
            case 9:
                Object systemService10 = this.f9020b.getSystemService("wifi");
                if (systemService10 != null) {
                    return (WifiManager) systemService10;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.net.wifi.WifiManager");
            case 10:
                Object systemService11 = this.f9020b.getSystemService("window");
                if (systemService11 != null) {
                    return (WindowManager) systemService11;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
            case 11:
                return ht2aO8.registerReceiver(this.f9020b, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            case 12:
                Object systemService12 = this.f9020b.getSystemService("connectivity");
                if (!(systemService12 instanceof ConnectivityManager)) {
                    systemService12 = null;
                }
                return (ConnectivityManager) systemService12;
            case 13:
                Object systemService13 = this.f9020b.getSystemService("camera");
                if (!(systemService13 instanceof CameraManager)) {
                    systemService13 = null;
                }
                return (CameraManager) systemService13;
            case 14:
                Object systemService14 = this.f9020b.getSystemService("phone");
                if (systemService14 != null) {
                    return (TelephonyManager) systemService14;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            case 15:
                Object systemService15 = this.f9020b.getSystemService("user");
                if (!(systemService15 instanceof UserManager)) {
                    systemService15 = null;
                }
                return (UserManager) systemService15;
            case 16:
                return WallpaperManager.getInstance(this.f9020b);
            case 17:
                return this.f9020b;
            case 18:
                return this.f9020b;
            case 19:
                Object systemService16 = this.f9020b.getSystemService("alarm");
                if (!(systemService16 instanceof AlarmManager)) {
                    systemService16 = null;
                }
                return (AlarmManager) systemService16;
            case 20:
                Object systemService17 = this.f9020b.getSystemService("audio");
                if (systemService17 != null) {
                    return (AudioManager) systemService17;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.media.AudioManager");
            case 21:
                if (Build.VERSION.SDK_INT >= 26) {
                    return androidx.media3.common.util.e.n(this.f9020b.getSystemService(androidx.media3.common.util.e.q()));
                }
                return null;
            case 22:
                Object systemService18 = this.f9020b.getSystemService("fingerprint");
                if (!(systemService18 instanceof FingerprintManager)) {
                    systemService18 = null;
                }
                return (FingerprintManager) systemService18;
            case 23:
                Object systemService19 = this.f9020b.getSystemService("location");
                if (systemService19 != null) {
                    return (LocationManager) systemService19;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.location.LocationManager");
            case 24:
                Object systemService20 = this.f9020b.getSystemService("nfc");
                if (systemService20 != null) {
                    return (NfcManager) systemService20;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.nfc.NfcManager");
            case 25:
                Object systemService21 = this.f9020b.getSystemService("notification");
                if (systemService21 != null) {
                    return (NotificationManager) systemService21;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
            case 26:
                Object systemService22 = this.f9020b.getSystemService("power");
                if (systemService22 != null) {
                    return (PowerManager) systemService22;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.os.PowerManager");
            default:
                Object systemService23 = this.f9020b.getSystemService("uimode");
                if (systemService23 != null) {
                    return (UiModeManager) systemService23;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.UiModeManager");
        }
    }
}
