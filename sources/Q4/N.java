package Q4;

import M8.A0;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import cj.C1132s;
import com.paymaya.PayMayaApplication;
import defpackage.WifiNetwork;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5233d;
    public ConnectivityManager e;
    public L f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
        this.f5233d = new ArrayList();
    }

    public static final void e(N n7, String str) {
        ArrayList arrayList = n7.f5233d;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.j.b(((WifiNetwork) it.next()).getSsid(), str)) {
                    return;
                }
            }
        }
        arrayList.add(new WifiNetwork(str, null, null, null, 14, null));
    }

    @Override // F4.a
    public final void a() {
        Object objA;
        NetworkCapabilities networkCapabilities;
        Object objA2;
        if (!d(C1132s.g("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), true) || !d(cj.r.c("android.permission.ACCESS_WIFI_STATE"), false)) {
            g();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        PayMayaApplication payMayaApplication = this.c;
        if (i < 29) {
            try {
                C1037h.a aVar = C1037h.f9166b;
                Object systemService = payMayaApplication.getApplicationContext().getSystemService("wifi");
                WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
                WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
                this.f5233d.add(new WifiNetwork(connectionInfo != null ? connectionInfo.getSSID() : null, connectionInfo != null ? Integer.valueOf(connectionInfo.getIpAddress()).toString() : null, connectionInfo != null ? connectionInfo.getMacAddress() : null, null, 8, null));
                f();
                objA2 = Unit.f18162a;
            } catch (Throwable th2) {
                C1037h.a aVar2 = C1037h.f9166b;
                objA2 = AbstractC1039j.a(th2);
            }
            Throwable thA = C1037h.a(objA2);
            if (thA != null) {
                String strB = C1030a.b(thA);
                String strC = kotlin.jvm.internal.z.a(N.class).c();
                A0.w(2, strB, strC != null ? strC : "CoroutineScopedExtractor");
                G4.b bVar = this.f1548b;
                if (bVar != null) {
                    bVar.a(thA);
                }
                g();
                return;
            }
            return;
        }
        try {
            C1037h.a aVar3 = C1037h.f9166b;
            Object systemService2 = payMayaApplication.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService2 instanceof ConnectivityManager ? (ConnectivityManager) systemService2 : null;
            this.e = connectivityManager;
            networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) : null;
        } catch (Throwable th3) {
            C1037h.a aVar4 = C1037h.f9166b;
            objA = AbstractC1039j.a(th3);
        }
        if (networkCapabilities == null || !networkCapabilities.hasTransport(1)) {
            f();
            return;
        }
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).build();
        L l6 = new L(this);
        this.f = l6;
        ConnectivityManager connectivityManager2 = this.e;
        if (connectivityManager2 != null) {
            connectivityManager2.registerNetworkCallback(networkRequestBuild, l6);
        }
        objA = Unit.f18162a;
        Throwable thA2 = C1037h.a(objA);
        if (thA2 != null) {
            String strB2 = C1030a.b(thA2);
            String strC2 = kotlin.jvm.internal.z.a(N.class).c();
            A0.w(2, strB2, strC2 != null ? strC2 : "CoroutineScopedExtractor");
            G4.b bVar2 = this.f1548b;
            if (bVar2 != null) {
                bVar2.a(thA2);
            }
            g();
        }
    }

    @Override // F4.a
    public final String b() {
        return "wifi_network";
    }

    public final void f() {
        Bj.H.w(F4.a.c(), null, null, new M(this, null), 3);
    }

    public final void g() {
        ConnectivityManager connectivityManager;
        L l6 = this.f;
        if (l6 != null && (connectivityManager = this.e) != null) {
            connectivityManager.unregisterNetworkCallback(l6);
        }
        G4.b bVar = this.f1548b;
        if (bVar != null) {
            bVar.b(new K4.x(this.f5233d));
        }
    }
}
