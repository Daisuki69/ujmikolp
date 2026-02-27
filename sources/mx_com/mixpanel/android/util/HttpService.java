package mx_com.mixpanel.android.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes7.dex */
public class HttpService implements RemoteService {
    private static final String LOGTAG = "MixpanelAPI.Message";
    private static final int MAX_UNAVAILABLE_HTTP_RESPONSE_CODE = 599;
    private static final int MIN_UNAVAILABLE_HTTP_RESPONSE_CODE = 500;
    private static boolean sIsMixpanelBlocked;

    @Override // mx_com.mixpanel.android.util.RemoteService
    public void checkIsMixpanelBlocked() {
        new Thread(new Runnable() { // from class: mx_com.mixpanel.android.util.HttpService.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InetAddress byName = InetAddress.getByName("api.mixpanel.com");
                    boolean unused = HttpService.sIsMixpanelBlocked = byName.isLoopbackAddress() || byName.isAnyLocalAddress();
                    if (HttpService.sIsMixpanelBlocked) {
                        MPLog.v(HttpService.LOGTAG, "AdBlocker is enabled. Won't be able to use Mixpanel services.");
                    }
                } catch (Exception unused2) {
                }
            }
        }).start();
    }

    @Override // mx_com.mixpanel.android.util.RemoteService
    public boolean isOnline(Context context, OfflineMode offlineMode) {
        if (sIsMixpanelBlocked || onOfflineMode(offlineMode)) {
            return false;
        }
        boolean z4 = true;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                MPLog.v(LOGTAG, "A default network has not been set so we cannot be certain whether we are offline");
            } else {
                boolean zIsConnectedOrConnecting = activeNetworkInfo.isConnectedOrConnecting();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ConnectivityManager says we ");
                sb2.append(zIsConnectedOrConnecting ? "are" : "are not");
                sb2.append(" online");
                MPLog.v(LOGTAG, sb2.toString());
                z4 = zIsConnectedOrConnecting;
            }
        } catch (SecurityException unused) {
            MPLog.v(LOGTAG, "Don't have permission to check connectivity, will assume we are online");
        }
        return z4;
    }

    private boolean onOfflineMode(OfflineMode offlineMode) {
        if (offlineMode == null) {
            return false;
        }
        try {
            return offlineMode.isOffline();
        } catch (Exception e) {
            MPLog.v(LOGTAG, "Client State should not throw exception, will assume is not on offline mode", e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x001a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x00d4, IOException -> 0x00d7, EOFException -> 0x00dd, TryCatch #16 {EOFException -> 0x00dd, IOException -> 0x00d7, all -> 0x00d4, blocks: (B:9:0x002d, B:11:0x0031, B:12:0x0037, B:14:0x0043, B:15:0x0050, B:17:0x0056, B:18:0x006e, B:33:0x00b8), top: B:123:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[Catch: all -> 0x00d4, IOException -> 0x00d7, EOFException -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #16 {EOFException -> 0x00dd, IOException -> 0x00d7, all -> 0x00d4, blocks: (B:9:0x002d, B:11:0x0031, B:12:0x0037, B:14:0x0043, B:15:0x0050, B:17:0x0056, B:18:0x006e, B:33:0x00b8), top: B:123:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014c  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // mx_com.mixpanel.android.util.RemoteService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] performRequest(java.lang.String r12, java.util.Map<java.lang.String, java.lang.Object> r13, javax.net.ssl.SSLSocketFactory r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx_com.mixpanel.android.util.HttpService.performRequest(java.lang.String, java.util.Map, javax.net.ssl.SSLSocketFactory):byte[]");
    }

    private static byte[] slurp(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
