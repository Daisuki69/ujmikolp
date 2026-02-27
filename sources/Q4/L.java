package Q4;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import defpackage.WifiNetwork;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5231b;
    public final /* synthetic */ N c;

    public L(N n7) {
        this.c = n7;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        kotlin.jvm.internal.j.g(network, "network");
        kotlin.jvm.internal.j.g(networkCapabilities, "networkCapabilities");
        TransportInfo transportInfo = networkCapabilities.getTransportInfo();
        WifiInfo wifiInfo = transportInfo instanceof WifiInfo ? (WifiInfo) transportInfo : null;
        this.f5230a = wifiInfo != null ? wifiInfo.getSSID() : null;
        this.f5231b = wifiInfo != null ? wifiInfo.getMacAddress() : null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        kotlin.jvm.internal.j.g(network, "network");
        kotlin.jvm.internal.j.g(linkProperties, "linkProperties");
        N n7 = this.c;
        n7.f5233d.add(new WifiNetwork(this.f5230a, linkProperties.getLinkAddresses().toString(), this.f5231b, null, 8, null));
        n7.f();
    }
}
