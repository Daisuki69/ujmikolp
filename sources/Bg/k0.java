package bg;

import android.content.Intent;
import android.hardware.ConsumerIrManager;
import android.hardware.fingerprint.FingerprintManager;
import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import com.dynatrace.agent.events.enrichment.EventKeys;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0962F f9022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(C0962F c0962f, int i) {
        super(1);
        this.f9021a = i;
        this.f9022b = c0962f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FingerprintManager fingerprintManager;
        DhcpInfo dhcpInfo;
        switch (this.f9021a) {
            case 0:
                ConsumerIrManager consumerIrManager = (ConsumerIrManager) this.f9022b.i.getValue();
                if (consumerIrManager != null) {
                    return String.valueOf(Integer.valueOf(consumerIrManager.hasIrEmitter() ? 1 : 0));
                }
                return null;
            case 1:
                return String.valueOf(C0962F.l(this.f9022b).getStreamVolume(1));
            case 2:
                Intent intentH = C0962F.h(this.f9022b);
                Boolean boolValueOf = intentH != null ? Boolean.valueOf(intentH.getBooleanExtra("present", true)) : null;
                return String.valueOf(boolValueOf != null ? Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0) : null);
            case 3:
                return String.valueOf(C0962F.l(this.f9022b).getStreamVolume(0));
            case 4:
                C0962F c0962f = this.f9022b;
                if (((FingerprintManager) c0962f.f8795g.getValue()) == null || (fingerprintManager = (FingerprintManager) c0962f.f8795g.getValue()) == null) {
                    return null;
                }
                return String.valueOf(Integer.valueOf(fingerprintManager.isHardwareDetected() ? 1 : 0));
            case 5:
                C0962F c0962f2 = this.f9022b;
                if (C0962F.m(c0962f2) == null) {
                    return null;
                }
                WifiInfo wifiInfoM = C0962F.m(c0962f2);
                if (wifiInfoM == null) {
                    kotlin.jvm.internal.j.l();
                }
                return wifiInfoM.getBSSID();
            case 6:
                return ((AbstractC0982V) ((C0976O) this.f9022b.h.getValue()).f8843a.getValue()) instanceof C0980T ? String.valueOf((Object) 1) : String.valueOf((Object) 0);
            case 7:
                C0962F c0962f3 = this.f9022b;
                if (C0962F.m(c0962f3) == null) {
                    return null;
                }
                WifiInfo wifiInfoM2 = C0962F.m(c0962f3);
                return String.valueOf(wifiInfoM2 != null ? Integer.valueOf(wifiInfoM2.getLinkSpeed()) : null);
            case 8:
                this.f9022b.getClass();
                try {
                    return System.getProperty("os.arch");
                } catch (Exception unused) {
                    return null;
                }
            case 9:
                C0962F c0962f4 = this.f9022b;
                if (C0962F.m(c0962f4) == null) {
                    return null;
                }
                WifiInfo wifiInfoM3 = C0962F.m(c0962f4);
                return String.valueOf(wifiInfoM3 != null ? Integer.valueOf(wifiInfoM3.getRssi()) : null);
            case 10:
                this.f9022b.getClass();
                try {
                    Process process = Runtime.getRuntime().exec("uname -s");
                    kotlin.jvm.internal.j.c(process, "process");
                    return new BufferedReader(new InputStreamReader(process.getInputStream())).readLine();
                } catch (Exception unused2) {
                    return null;
                }
            case 11:
                C0962F c0962f5 = this.f9022b;
                if (((DhcpInfo) c0962f5.f8799o.getValue()) == null || (dhcpInfo = (DhcpInfo) c0962f5.f8799o.getValue()) == null) {
                    return null;
                }
                return Formatter.formatIpAddress(dhcpInfo.serverAddress).toString();
            case 12:
                this.f9022b.getClass();
                try {
                    return System.getProperty(EventKeys.OS.VERSION);
                } catch (Exception unused3) {
                    return null;
                }
            case 13:
                return String.valueOf(((WifiManager) this.f9022b.e.getValue()).isWifiEnabled());
            case 14:
                C0962F c0962f6 = this.f9022b;
                return C0962F.i(c0962f6, c0962f6.f8796k, "Free");
            default:
                return String.valueOf(((WifiManager) this.f9022b.e.getValue()).getWifiState());
        }
    }
}
