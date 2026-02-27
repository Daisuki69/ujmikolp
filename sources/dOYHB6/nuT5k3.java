package dOYHB6;

import dOYHB6.tiZVw8.numX49;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes6.dex */
public class nuT5k3 {
    static final int IPv4_LOCATION = 0;
    static final int IPv6_LOCATION = 1;

    static boolean[] snT3z1() {
        boolean z4;
        Enumeration<NetworkInterface> networkInterfaces;
        boolean[] zArr = new boolean[2];
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            z4 = false;
        }
        if (networkInterfaces == null) {
            return zArr;
        }
        z4 = false;
        while (networkInterfaces.hasMoreElements()) {
            try {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                for (InterfaceAddress interfaceAddress : networkInterfaceNextElement.getInterfaceAddresses()) {
                    InetAddress address = interfaceAddress.getAddress();
                    boolean z5 = interfaceAddress.getAddress() instanceof Inet4Address;
                    String strTnTj78 = numX49.tnTj78("bHMp");
                    if (z5) {
                        if (!address.isLoopbackAddress() && !networkInterfaceNextElement.getName().startsWith(strTnTj78)) {
                            zArr[0] = true;
                        }
                    }
                    if (interfaceAddress.getAddress() instanceof Inet6Address) {
                        if (address.isLoopbackAddress() || networkInterfaceNextElement.getName().startsWith(strTnTj78)) {
                            z4 = true;
                        } else {
                            zArr[1] = true;
                        }
                    }
                }
            } catch (SocketException e7) {
            }
        }
        if (z4 && zArr[0]) {
            zArr[1] = true;
        }
        return zArr;
    }
}
