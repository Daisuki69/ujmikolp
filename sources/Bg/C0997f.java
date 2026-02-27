package bg;

import android.app.AlarmManager;
import android.content.Context;
import android.location.LocationManager;
import android.media.AudioManager;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import bj.InterfaceC1033d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0997f extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0955B0 f8946b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0997f(C0955B0 c0955b0, int i) {
        super(1);
        this.f8945a = i;
        this.f8946b = c0955b0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AlarmManager.AlarmClockInfo nextAlarmClock;
        switch (this.f8945a) {
            case 0:
                return Settings.Secure.getString(this.f8946b.c, "accessibility_enabled");
            case 1:
                return Settings.Secure.getString(this.f8946b.c, "adb_enabled");
            case 2:
                return Settings.Global.getString(this.f8946b.c, "airplane_mode_on");
            case 3:
                return String.valueOf(Settings.System.getInt(this.f8946b.c, "always_finish_activities", 0));
            case 4:
                return Settings.Global.getString(this.f8946b.c, "animator_duration_scale");
            case 5:
                return Settings.System.getString(this.f8946b.c, "auto_time");
            case 6:
                return Settings.System.getString(this.f8946b.c, "auto_time_zone");
            case 7:
                return Settings.System.getString(this.f8946b.c, "bluetooth_on");
            case 8:
                return Settings.Global.getString(this.f8946b.c, "boot_count");
            case 9:
                int i = Build.VERSION.SDK_INT;
                C0955B0 c0955b0 = this.f8946b;
                if (i >= 33) {
                    Context context = c0955b0.f7198b;
                    if (context.getApplicationInfo().targetSdkVersion >= 33) {
                        if (!c0955b0.f8719o.b("android.permission.ACCESS_NETWORK_STATE")) {
                            return null;
                        }
                        Object systemService = context.getSystemService("phone");
                        if (!(systemService instanceof TelephonyManager)) {
                            systemService = null;
                        }
                        TelephonyManager telephonyManager = (TelephonyManager) systemService;
                        if (telephonyManager != null) {
                            return String.valueOf(Integer.valueOf(telephonyManager.isDataRoamingEnabled() ? 1 : 0));
                        }
                        return null;
                    }
                }
                return Settings.System.getString(c0955b0.c, "data_roaming");
            case 10:
                return Settings.Global.getString(this.f8946b.c, "debug_app");
            case 11:
                return Settings.Global.getString(this.f8946b.c, "development_settings_enabled");
            case 12:
                return Settings.System.getString(this.f8946b.c, "device_provisioned");
            case 13:
                return Settings.System.getString(this.f8946b.c, "install_non_market_apps");
            case 14:
                return Settings.System.getString(this.f8946b.c, "mode_ringer");
            case 15:
                return Settings.System.getString(this.f8946b.c, "transition_animation_scale");
            case 16:
                return Settings.System.getString(this.f8946b.c, "usb_mass_storage_enabled");
            case 17:
                return Settings.Secure.getString(this.f8946b.c, "wifi_max_dhcp_retry_count");
            case 18:
                return Settings.Global.getString(this.f8946b.c, "wifi_mobile_data_transition_wakelock_timeout_ms");
            case 19:
                return Settings.System.getString(this.f8946b.c, "wifi_networks_available_notification_on");
            case 20:
                return Settings.Global.getString(this.f8946b.c, "wifi_networks_available_repeat_delay");
            case 21:
                return Settings.Global.getString(this.f8946b.c, "wifi_watchdog_on");
            case 22:
                LocationManager locationManager = (LocationManager) this.f8946b.f8715g.getValue();
                Boolean boolValueOf = locationManager != null ? Boolean.valueOf(locationManager.isLocationEnabled()) : null;
                return String.valueOf(boolValueOf != null ? Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0) : null);
            case 23:
                AudioManager audioManager = (AudioManager) this.f8946b.i.getValue();
                return String.valueOf((audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null).intValue());
            case 24:
                AlarmManager alarmManager = (AlarmManager) this.f8946b.j.getValue();
                if (alarmManager == null || (nextAlarmClock = alarmManager.getNextAlarmClock()) == null) {
                    return null;
                }
                return String.valueOf(nextAlarmClock.getTriggerTime());
            case 25:
                return Settings.Global.getString(this.f8946b.c, "wifi_device_owner_configs_lockdown");
            case 26:
                C0955B0 c0955b02 = this.f8946b;
                if (C0955B0.h(c0955b02) == null || C0955B0.h(c0955b02).getDefaultAdapter() == null) {
                    return null;
                }
                NfcAdapter defaultAdapter = C0955B0.h(c0955b02).getDefaultAdapter();
                kotlin.jvm.internal.j.c(defaultAdapter, "_nfcManager.defaultAdapter");
                return String.valueOf(Integer.valueOf(defaultAdapter.isEnabled() ? 1 : 0));
            case 27:
                return Settings.Global.getString(this.f8946b.c, "wifi_num_open_networks_kept");
            case 28:
                InterfaceC1033d interfaceC1033d = this.f8946b.e;
                if (((NfcManager) interfaceC1033d.getValue()) == null || ((NfcManager) interfaceC1033d.getValue()).getDefaultAdapter() == null) {
                    return null;
                }
                NfcAdapter defaultAdapter2 = ((NfcManager) interfaceC1033d.getValue()).getDefaultAdapter();
                kotlin.jvm.internal.j.c(defaultAdapter2, "_nfcManager.defaultAdapter");
                return String.valueOf(Integer.valueOf(defaultAdapter2.isSecureNfcEnabled() ? 1 : 0));
            default:
                return String.valueOf(C0955B0.i(this.f8946b).getBubblePreference());
        }
    }
}
