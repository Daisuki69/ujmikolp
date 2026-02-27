package mg;

import C3.n;
import M5.f;
import We.s;
import Xh.i;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import bg.AbstractC0983W;
import cg.InterfaceC1101b;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.messaging.r;
import com.google.firebase.perf.config.RemoteConfigManager;
import hh.o;
import io.split.android.client.dtos.HttpProxyDto;
import io.split.android.client.network.k;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.net.HttpRetryException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import n3.C1916a;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements n, Ch.a, InterfaceC1101b, f, Q3.c, b2.c, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c f18414b = new c(19);
    public static final c c = new c(21);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f18415d = new c(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18416a;

    public /* synthetic */ c(int i) {
        this.f18416a = i;
    }

    public static K3.b a(byte[][] bArr, int i) {
        int i4 = i * 2;
        int length = bArr[0].length + i4;
        int length2 = bArr.length + i4;
        K3.b bVar = new K3.b(length, length2);
        int[] iArr = bVar.f2591d;
        int length3 = iArr.length;
        for (int i6 = 0; i6 < length3; i6++) {
            iArr[i6] = 0;
        }
        int i10 = (length2 - i) - 1;
        int i11 = 0;
        while (i11 < bArr.length) {
            byte[] bArr2 = bArr[i11];
            for (int i12 = 0; i12 < bArr[0].length; i12++) {
                if (bArr2[i12] == 1) {
                    bVar.f(i12 + i, i10);
                }
            }
            i11++;
            i10--;
        }
        return bVar;
    }

    public static byte[][] c(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                bArr2[i4][length] = bArr[i][i4];
            }
        }
        return bArr2;
    }

    public static void h(SSLSocket sSLSocket) throws IOException {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(sSLSocket.getInputStream(), StandardCharsets.UTF_8));
            String line2 = bufferedReader.readLine();
            if (line2 == null) {
                throw new IOException("No CONNECT response received from proxy");
            }
            String[] strArrSplit = line2.split(Global.BLANK);
            if (strArrSplit.length < 2) {
                throw new IOException("Invalid CONNECT response status line: ".concat(line2));
            }
            try {
                int i = Integer.parseInt(strArrSplit[1]);
                do {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                } while (!line.trim().isEmpty());
                if (i != 200) {
                    if (i == 407) {
                        throw new HttpRetryException("CONNECT request failed with status " + i + ": " + line2, 407);
                    }
                    throw new IOException("CONNECT request failed with status " + i + ": " + line2);
                }
            } catch (NumberFormatException e) {
                throw new IOException("Invalid CONNECT response status code: ".concat(line2), e);
            }
        } catch (IOException e7) {
            if (e7 instanceof HttpRetryException) {
                throw e7;
            }
            throw new IOException("Failed to validate CONNECT response from proxy: " + e7.getMessage(), e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public javax.net.ssl.SSLSocket b(java.lang.String r5, int r6, java.lang.String r7, int r8, javax.net.ssl.SSLSocketFactory r9, io.split.android.client.network.k r10, boolean r11) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            java.net.Socket r1 = new java.net.Socket     // Catch: java.lang.Exception -> L44
            r1.<init>(r5, r6)     // Catch: java.lang.Exception -> L44
            r2 = 20000(0x4e20, float:2.8026E-41)
            r1.setSoTimeout(r2)     // Catch: java.lang.Exception -> L42
            r3 = 1
            java.net.Socket r6 = r9.createSocket(r1, r5, r6, r3)     // Catch: java.lang.Exception -> L42
            javax.net.ssl.SSLSocket r6 = (javax.net.ssl.SSLSocket) r6     // Catch: java.lang.Exception -> L42
            r6.setUseClientMode(r3)     // Catch: java.lang.Exception -> L1c
            if (r11 == 0) goto L1f
            r9 = 0
            r6.setSoTimeout(r9)     // Catch: java.lang.Exception -> L1c
            goto L22
        L1c:
            r5 = move-exception
            r0 = r6
            goto L46
        L1f:
            r6.setSoTimeout(r2)     // Catch: java.lang.Exception -> L1c
        L22:
            r6.startHandshake()     // Catch: java.lang.Exception -> L1c
            javax.net.ssl.HostnameVerifier r9 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch: java.lang.Exception -> L1c
            javax.net.ssl.SSLSession r11 = r6.getSession()     // Catch: java.lang.Exception -> L1c
            boolean r5 = r9.verify(r5, r11)     // Catch: java.lang.Exception -> L1c
            if (r5 == 0) goto L3a
            r4.f(r6, r7, r8, r10)     // Catch: java.lang.Exception -> L1c
            h(r6)     // Catch: java.lang.Exception -> L1c
            return r6
        L3a:
            javax.net.ssl.SSLHandshakeException r5 = new javax.net.ssl.SSLHandshakeException     // Catch: java.lang.Exception -> L1c
            java.lang.String r7 = "Proxy hostname verification failed"
            r5.<init>(r7)     // Catch: java.lang.Exception -> L1c
            throw r5     // Catch: java.lang.Exception -> L1c
        L42:
            r5 = move-exception
            goto L46
        L44:
            r5 = move-exception
            r1 = r0
        L46:
            if (r0 == 0) goto L4c
            r0.close()     // Catch: java.io.IOException -> L51
            goto L51
        L4c:
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.io.IOException -> L51
        L51:
            boolean r6 = r5 instanceof java.net.HttpRetryException
            if (r6 != 0) goto L64
            boolean r6 = r5 instanceof java.io.IOException
            if (r6 == 0) goto L5c
            java.io.IOException r5 = (java.io.IOException) r5
            throw r5
        L5c:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Failed to establish SSL tunnel"
            r6.<init>(r7, r5)
            throw r6
        L64:
            java.net.HttpRetryException r5 = (java.net.HttpRetryException) r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c.b(java.lang.String, int, java.lang.String, int, javax.net.ssl.SSLSocketFactory, io.split.android.client.network.k, boolean):javax.net.ssl.SSLSocket");
    }

    @Override // M5.f
    public String d() {
        switch (this.f18416a) {
            case 6:
                return String.format("SELECT * FROM %1$s ORDER BY %2$s COLLATE NOCASE ASC", Arrays.copyOf(new Object[]{"shop_provider", "display_name"}, 2));
            case 7:
                return String.format("SELECT * FROM %2$s GROUP BY %3$s", "form_series", "form_series_bir", "form_series");
            case 8:
                return String.format("SELECT * FROM  %1$s WHERE %2$s = \"%3$s\"", Arrays.copyOf(new Object[]{"identity", SessionDescription.ATTR_TYPE, "username"}, 3));
            default:
                return String.format("SELECT * FROM %1$s ORDER BY timestamp DESC", "user_activity");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x048c A[LOOP:12: B:237:0x048a->B:238:0x048c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    @Override // C3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K3.b e(java.lang.String r32, C3.a r33, int r34, int r35, java.util.HashMap r36) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c.e(java.lang.String, C3.a, int, int, java.util.HashMap):K3.b");
    }

    public void f(SSLSocket sSLSocket, String str, int i, k kVar) {
        PrintWriter printWriter = new PrintWriter((Writer) new OutputStreamWriter(sSLSocket.getOutputStream(), StandardCharsets.UTF_8), false);
        printWriter.write(androidx.camera.core.impl.a.d(i, "CONNECT ", str, Global.COLON, " HTTP/1.1\r\n"));
        printWriter.write("Host: " + str + Global.COLON + i + "\r\n");
        if (kVar != null) {
            if (kVar instanceof Di.b) {
                String str2 = ((Di.b) kVar).f1162a.bearerToken;
                if (str2 != null && !str2.trim().isEmpty()) {
                    printWriter.write("Proxy-Authorization: Bearer " + str2 + "\r\n");
                }
            } else if (kVar instanceof Di.a) {
                HttpProxyDto httpProxyDto = ((Di.a) kVar).f1161a;
                String str3 = httpProxyDto.username;
                String str4 = httpProxyDto.password;
                if (str3 != null && !str3.trim().isEmpty() && str4 != null && !str4.trim().isEmpty()) {
                    StringBuilder sb2 = new StringBuilder("Proxy-Authorization: Basic ");
                    sb2.append(i.l(str3 + Global.COLON + str4));
                    sb2.append("\r\n");
                    printWriter.write(sb2.toString());
                }
            }
        }
        printWriter.write("\r\n");
        printWriter.flush();
    }

    @Override // Q3.c
    public void g(Q3.d dVar) {
        int i;
        int i4 = dVar.f5208d;
        String str = dVar.f5206a;
        int length = str.length();
        if (i4 < length) {
            char cCharAt = str.charAt(i4);
            i = 0;
            while (AbstractC0983W.n(cCharAt) && i4 < length) {
                i++;
                i4++;
                if (i4 < length) {
                    cCharAt = str.charAt(i4);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char cCharAt2 = str.charAt(dVar.f5208d);
            char cCharAt3 = str.charAt(dVar.f5208d + 1);
            if (AbstractC0983W.n(cCharAt2) && AbstractC0983W.n(cCharAt3)) {
                dVar.d((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                dVar.f5208d += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cA = dVar.a();
        int iS = AbstractC0983W.s(str, dVar.f5208d, 0);
        if (iS == 0) {
            if (!AbstractC0983W.o(cA)) {
                dVar.d((char) (cA + 1));
                dVar.f5208d++;
                return;
            } else {
                dVar.d((char) 235);
                dVar.d((char) (cA - 127));
                dVar.f5208d++;
                return;
            }
        }
        if (iS == 1) {
            dVar.d((char) 230);
            dVar.e = 1;
            return;
        }
        if (iS == 2) {
            dVar.d((char) 239);
            dVar.e = 2;
            return;
        }
        if (iS == 3) {
            dVar.d((char) 238);
            dVar.e = 3;
        } else if (iS == 4) {
            dVar.d((char) 240);
            dVar.e = 4;
        } else {
            if (iS != 5) {
                throw new IllegalStateException(s.f(iS, "Illegal mode: "));
            }
            dVar.d((char) 231);
            dVar.e = 5;
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        AbstractC1955a.d(remoteConfigManager);
        return remoteConfigManager;
    }

    @Override // Ch.a
    public void run() {
    }

    @Override // hh.o
    public boolean test(Object obj) {
        return true;
    }

    public String toString() {
        switch (this.f18416a) {
            case 2:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        switch (this.f18416a) {
            case 19:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(bVar);
            default:
                zzss.zzb("common");
                return new C1916a(0);
        }
    }

    public c(r rVar) {
        this.f18416a = 5;
    }
}
