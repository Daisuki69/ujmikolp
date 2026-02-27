package p4;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.PlaybackException;
import com.dynatrace.android.agent.Global;
import dOYHB6.yFtIp6.svM7M6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AbstractC2012a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19066d = 0;
    public Object e;

    public /* synthetic */ d() {
    }

    public static int f(Calendar calendar) {
        return ((TimeZone.getDefault().getOffset(calendar.getTimeInMillis()) * (-1)) / 1000) / 60;
    }

    @Override // p4.AbstractC2012a
    public final void d() {
        String string;
        WifiInfo connectionInfo;
        long jIntValue;
        String str;
        switch (this.f19066d) {
            case 0:
                HashMap map = new HashMap();
                Context context = (Context) this.e;
                String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (string2 != null && !string2.isEmpty()) {
                    "Android ID = ".concat(string2);
                    map.put("ANDROID_ID", E1.c.f("ANDROID_ID".concat(string2)));
                }
                String str2 = Build.SERIAL;
                if (str2 != null && !str2.equalsIgnoreCase("unknown") && !str2.isEmpty()) {
                    "Android Serial = ".concat(str2);
                    map.put("ANDROID_SERIAL", E1.c.f("ANDROID_SERIAL".concat(str2)));
                }
                ArrayList arrayList = new ArrayList();
                try {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                        String macAddress = connectionInfo.getMacAddress();
                        if (macAddress != null) {
                            arrayList.add(macAddress.replace(Global.COLON, ""));
                        } else {
                            b("NOT_AVAILABLE");
                        }
                    }
                    break;
                } catch (SecurityException unused) {
                }
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                        if (networkInterfaceNextElement.isUp()) {
                            networkInterfaceNextElement.getName();
                            networkInterfaceNextElement.isVirtual();
                            byte[] hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                            if (hardwareAddress != null) {
                                StringBuilder sb2 = new StringBuilder();
                                for (byte b8 : hardwareAddress) {
                                    sb2.append(String.format("%02X", Byte.valueOf(b8)));
                                }
                                arrayList.add(sb2.toString());
                            }
                        }
                    }
                } catch (SecurityException unused2) {
                    b("PERMISSION_DENIED");
                } catch (SocketException unused3) {
                    b("NOT_AVAILABLE");
                }
                Collections.sort(arrayList);
                String strF = null;
                if (arrayList.size() > 0) {
                    StringBuilder sb3 = new StringBuilder("{");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb3.append((String) it.next());
                        sb3.append(",");
                    }
                    sb3.append("}");
                    string = sb3.toString();
                } else {
                    string = null;
                }
                if (string != null) {
                    map.put("MAC_HASH", E1.c.f("MAC_HASH".concat(string)));
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("k_prefs", 0);
                String string3 = sharedPreferences != null ? svM7M6.getString(sharedPreferences, "lic", null) : null;
                if (string3 != null && string3.contains("UID")) {
                    try {
                        int iIndexOf = string3.indexOf("UID") + 6;
                        strF = string3.substring(iIndexOf, string3.indexOf(34, iIndexOf));
                        break;
                    } catch (IndexOutOfBoundsException unused4) {
                    }
                }
                if (strF == null) {
                    strF = E1.c.f("UID" + UUID.randomUUID().toString());
                }
                map.put("UID", strF);
                JSONObject jSONObject = new JSONObject(map);
                a("dc", jSONObject.toString());
                if (string3 != null) {
                    a("odc", string3);
                }
                String string4 = jSONObject.toString();
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("k_prefs", 0).edit();
                editorEdit.putString("lic", string4);
                editorEdit.apply();
                c(Boolean.TRUE);
                break;
            default:
                a("mdl", Build.FINGERPRINT);
                a("os", Build.VERSION.RELEASE);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                    jIntValue = Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue() * 1024;
                    bufferedReader.close();
                } catch (IOException unused5) {
                    jIntValue = -1;
                }
                a("dmm", Long.toString(jIntValue / 1048576));
                a("ln", Locale.getDefault().getLanguage() + Global.HYPHEN + Locale.getDefault().getCountry());
                WindowManager windowManager = (WindowManager) this.e;
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    defaultDisplay.getWidth();
                    defaultDisplay.getHeight();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                    str = displayMetrics.heightPixels + "x" + displayMetrics.widthPixels;
                } else {
                    str = "windowManager is not a supported system service";
                }
                a("sa", str);
                Calendar.getInstance().set(PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, 7, 1);
                a("ta", Long.toString(f(r0)));
                Calendar.getInstance().set(PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, 1, 1);
                a("tf", Long.toString(f(r0)));
                a("t0", Long.toString(f(Calendar.getInstance(TimeZone.getDefault()))));
                a("e", Long.toString(new Date().getTime()));
                c(Boolean.TRUE);
                break;
        }
    }

    @Override // p4.AbstractC2012a
    public final String e() {
        switch (this.f19066d) {
            case 0:
                return "collector_device_cookie";
            default:
                return "LOCAL";
        }
    }

    public d(Context context) {
        this.e = (WindowManager) context.getSystemService("window");
    }
}
