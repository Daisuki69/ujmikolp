package dOYHB6;

import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class x1qvk4 {
    private static final Map<StackTraceElement, Boolean> already_called = new ConcurrentHashMap();

    private static class xPNDT1 {
        private final StackTraceElement[] stack_trace;

        private xPNDT1() {
            this.stack_trace = Thread.currentThread().getStackTrace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StackTraceElement h5WnZ8() {
            return yAqMH6(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StackTraceElement yAqMH6(int i) {
            int i4 = i + 5;
            if (this.stack_trace.length > i4) {
                return this.stack_trace[i4];
            }
            String strTnTj78 = numX49.tnTj78("bHMb");
            return new StackTraceElement(strTnTj78, strTnTj78, strTnTj78, -1);
        }
    }

    public static boolean aW3VV6() {
        return already_called.putIfAbsent(new xPNDT1().h5WnZ8(), true) == null;
    }

    public static String amS0s9() {
        ProxyInfo defaultProxy;
        ConnectivityManager connectivityManager = (ConnectivityManager) nm8AQ4.get().getSystemService(numX49.tnTj78("bHM7"));
        String strTnTj78 = numX49.tnTj78("bHMA");
        if (connectivityManager == null || (defaultProxy = connectivityManager.getDefaultProxy()) == null) {
            return strTnTj78;
        }
        return defaultProxy.getHost() + numX49.tnTj78("bHMY") + defaultProxy.getPort();
    }

    public static boolean kBrqr2() {
        return fChUQ4.kCWS92();
    }

    public static boolean s9pHy6() {
        xPNDT1 xpndt1 = new xPNDT1();
        String methodName = xpndt1.h5WnZ8().getMethodName();
        try {
            Class<?> cls = Class.forName(xpndt1.h5WnZ8().getClassName());
            StackTraceElement stackTraceElementYAqMH6 = xpndt1.yAqMH6(1);
            int i = 1;
            while (stackTraceElementYAqMH6.getMethodName().equals(numX49.tnTj78("bHMT"))) {
                if (methodName.equals(stackTraceElementYAqMH6.getMethodName())) {
                    try {
                        Class<?> cls2 = Class.forName(stackTraceElementYAqMH6.getClassName());
                        if (cls2.isAssignableFrom(cls) && !cls.equals(cls2)) {
                            return true;
                        }
                    } catch (Exception e) {
                        return false;
                    }
                }
                i++;
                stackTraceElementYAqMH6 = xpndt1.yAqMH6(i);
            }
            return false;
        } catch (Exception e7) {
            return false;
        }
    }
}
