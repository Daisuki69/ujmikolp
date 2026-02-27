package Kh;

import android.content.Context;
import android.os.Bundle;
import androidx.webkit.ProxyConfig;
import b2.C0859a;
import com.dynatrace.android.agent.Global;
import com.google.firebase.components.ComponentRegistrar;
import com.paymaya.mayaui.common.view.dialog.impl.MayaChoicesBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaSettingsPasswordCredentialBottomSheetFragment;
import d4.AbstractC1331a;
import gf.C1518a;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.functions.Function1;
import s1.InterfaceC2231f;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements Ch.c, M5.f, Ni.a, hh.o, b2.d, b2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile I f2692b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2693a;

    public /* synthetic */ I(int i) {
        this.f2693a = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static N.c g(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1824210231:
                    if (str.equals("custom-code")) {
                        return N.c.f3451r;
                    }
                    break;
                case -1698613420:
                    if (str.equals("half-interstitial-image")) {
                        return N.c.f3450q;
                    }
                    break;
                case -1258935355:
                    if (str.equals("cover-image")) {
                        return N.c.f3448o;
                    }
                    break;
                case -1160074422:
                    if (str.equals("halfInterstitialHtml")) {
                        return N.c.h;
                    }
                    break;
                case -1141304454:
                    if (str.equals("interstitial-image")) {
                        return N.c.f3449p;
                    }
                    break;
                case -728863497:
                    if (str.equals("interstitialHtml")) {
                        return N.c.e;
                    }
                    break;
                case -334055316:
                    if (str.equals("footer-template")) {
                        return N.c.m;
                    }
                    break;
                case -37253685:
                    if (str.equals("alert-template")) {
                        return N.c.f3447n;
                    }
                    break;
                case 3213227:
                    if (str.equals("html")) {
                        return N.c.c;
                    }
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        return N.c.i;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        return N.c.j;
                    }
                    break;
                case 894039686:
                    if (str.equals("half-interstitial")) {
                        return N.c.f3445k;
                    }
                    break;
                case 1189018554:
                    if (str.equals("header-template")) {
                        return N.c.f3446l;
                    }
                    break;
                case 1420225510:
                    if (str.equals("footerHtml")) {
                        return N.c.f3444g;
                    }
                    break;
                case 1977176024:
                    if (str.equals("headerHtml")) {
                        return N.c.f;
                    }
                    break;
                case 1979390978:
                    if (str.equals("coverHtml")) {
                        return N.c.f3443d;
                    }
                    break;
            }
        }
        return N.c.f3452s;
    }

    public static MayaChoicesBottomSheetDialogFragment i(String str, List values, boolean z4) {
        kotlin.jvm.internal.j.g(values, "values");
        MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment = new MayaChoicesBottomSheetDialogFragment();
        Bundle bundleD = androidx.media3.datasource.cache.c.d("title", str);
        bundleD.putStringArrayList("string_values", new ArrayList<>(values));
        bundleD.putBoolean("show_cancel", z4);
        bundleD.putInt("truncate_text", -1);
        mayaChoicesBottomSheetDialogFragment.setArguments(bundleD);
        return mayaChoicesBottomSheetDialogFragment;
    }

    public static MayaSettingsPasswordCredentialBottomSheetFragment j(String str, String str2, Function1 function1) {
        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment = new MayaSettingsPasswordCredentialBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("title", str);
        bundle.putCharSequence("description", str2);
        mayaSettingsPasswordCredentialBottomSheetFragment.setArguments(bundle);
        mayaSettingsPasswordCredentialBottomSheetFragment.f13873a0 = function1;
        return mayaSettingsPasswordCredentialBottomSheetFragment;
    }

    public static void m(SSLSocket sSLSocket, URL url, int i, HashMap map, String str) throws IOException {
        PrintWriter printWriter = new PrintWriter(sSLSocket.getOutputStream(), true);
        String path = url.getPath();
        if (path.isEmpty()) {
            path = "/";
        }
        if (url.getQuery() != null) {
            StringBuilder sbV = We.s.v(path, Global.QUESTION);
            sbV.append(url.getQuery());
            path = sbV.toString();
        }
        printWriter.write((AbstractC1331a.v(i) + Global.BLANK + path + " HTTP/1.1") + "\r\n");
        String host = url.getHost();
        int port = url.getPort();
        if (port == -1) {
            if (ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(url.getProtocol())) {
                port = 443;
            } else if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(url.getProtocol())) {
                port = 80;
            }
        }
        if ((!ProxyConfig.MATCH_HTTP.equalsIgnoreCase(url.getProtocol()) || port != 80) && (!ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(url.getProtocol()) || port != 443)) {
            host = androidx.media3.datasource.cache.c.h(port, host, Global.COLON);
        }
        printWriter.write("Host: " + host + "\r\n");
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && !"content-length".equalsIgnoreCase((String) entry.getKey()) && !"host".equalsIgnoreCase((String) entry.getKey())) {
                printWriter.write((((String) entry.getKey()) + ": " + ((String) entry.getValue())) + "\r\n");
            }
        }
        if (str != null) {
            printWriter.write(("Content-Length: " + str.getBytes("UTF-8").length) + "\r\n");
        }
        printWriter.write("Connection: close\r\n");
        printWriter.write("\r\n");
        if (str != null) {
            Ri.a.p("Sending request body: '" + str + "'");
            printWriter.write(str);
        }
        printWriter.flush();
        if (printWriter.checkError()) {
            throw new IOException("Failed to send HTTP request through tunnel");
        }
    }

    @Override // b2.d
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C0859a c0859a : componentRegistrar.getComponents()) {
            String str = c0859a.f8349a;
            if (str != null) {
                androidx.camera.lifecycle.a aVar = new androidx.camera.lifecycle.a(27, str, c0859a);
                c0859a = new C0859a(str, c0859a.f8350b, c0859a.c, c0859a.f8351d, c0859a.e, aVar, c0859a.f8352g);
            }
            arrayList.add(c0859a);
        }
        return arrayList;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        E1.c.k(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // Ni.a
    public void b() {
    }

    @Override // Ni.a
    public void c() {
    }

    @Override // M5.f
    public String d() {
        switch (this.f2693a) {
            case 7:
                return String.format("SELECT * FROM %1$s WHERE %2$s = 0 ORDER BY %3$s ASC, %4$s DESC", Arrays.copyOf(new Object[]{"decoration", "hidden", "priority", "updated_at"}, 4));
            case 8:
                return String.format("SELECT * FROM %1$s", "account_balance");
            default:
                return String.format("SELECT * FROM %1$s", Arrays.copyOf(new Object[]{"shop_provider_category"}, 1));
        }
    }

    @Override // Ni.a
    public void destroy() {
    }

    public io.split.android.client.network.g e(SSLSocket sSLSocket, URL url, int i, HashMap map, String str, Certificate[] certificateArr) throws IOException {
        Ri.a.p("Executing request through tunnel to: " + url);
        try {
            m(sSLSocket, url, i, map, str);
            return k(sSLSocket, certificateArr);
        } catch (SocketException e) {
            throw e;
        } catch (Exception e7) {
            Ri.a.g("Failed to execute request through tunnel: " + e7.getMessage());
            throw new IOException("Failed to execute HTTP request through tunnel to " + url, e7);
        }
    }

    public io.split.android.client.network.i f(SSLSocket sSLSocket, Socket socket, URL url, int i, HashMap map) throws IOException {
        Ri.a.p("Executing stream request through tunnel to: " + url);
        try {
            m(sSLSocket, url, i, map, null);
            return l(socket, sSLSocket);
        } catch (SocketException e) {
            throw e;
        } catch (Exception e7) {
            Ri.a.g("Failed to execute stream request through tunnel: " + e7.getMessage());
            throw new IOException("Failed to execute HTTP stream request through tunnel to " + url, e7);
        }
    }

    @Override // Ni.a
    public void flush() {
    }

    public T.b h(Context context, D.S s9) {
        T.b bVar;
        kotlin.jvm.internal.j.g(context, "context");
        T.b bVar2 = T.b.f5742g;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (this) {
            bVar = T.b.f5742g;
            if (bVar == null) {
                File dir = context.getDir("CleverTap.Images.", 0);
                kotlin.jvm.internal.j.f(dir, "getDir(...)");
                File dir2 = context.getDir("CleverTap.Gif.", 0);
                kotlin.jvm.internal.j.f(dir2, "getDir(...)");
                File dir3 = context.getDir("CleverTap.Files.", 0);
                kotlin.jvm.internal.j.f(dir3, "getDir(...)");
                bVar = new T.b(dir, dir2, dir3, s9);
                T.b.f5742g = bVar;
            }
        }
        return bVar;
    }

    public io.split.android.client.network.g k(SSLSocket sSLSocket, Certificate[] certificateArr) throws IOException {
        String str;
        String strJ;
        int i;
        int i4;
        InputStream inputStream = sSLSocket.getInputStream();
        String strJ2 = N4.d.j(inputStream);
        if (strJ2 == null) {
            throw new IOException("No HTTP response received from server");
        }
        int i6 = N4.d.i(strJ2);
        C1518a c1518aH = N4.d.h(inputStream);
        Charset charsetA = N4.d.a((String) c1518aH.f16802d);
        int i10 = 0;
        if (c1518aH.f16801b) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            do {
                String strJ3 = N4.d.j(inputStream);
                if (strJ3 == null) {
                    throw new IOException("Unexpected EOF while reading chunk size");
                }
                int iIndexOf = strJ3.indexOf(59);
                try {
                    int i11 = Integer.parseInt(iIndexOf >= 0 ? strJ3.substring(0, iIndexOf).trim() : strJ3.trim(), 16);
                    if (i11 < 0) {
                        throw new IOException(We.s.f(i11, "Negative chunk size: "));
                    }
                    if (i11 != 0) {
                        byte[] bArr = new byte[i11];
                        int i12 = 0;
                        while (i12 < i11) {
                            int i13 = inputStream.read(bArr, i12, i11 - i12);
                            if (i13 == -1) {
                                throw new IOException("Unexpected EOF while reading chunk data");
                            }
                            i12 += i13;
                        }
                        byteArrayOutputStream.write(bArr);
                        i = inputStream.read();
                        i4 = inputStream.read();
                        if (i != 13) {
                            break;
                        }
                    } else {
                        do {
                            strJ = N4.d.j(inputStream);
                            if (strJ == null) {
                                break;
                            }
                        } while (!strJ.trim().isEmpty());
                        str = new String(byteArrayOutputStream.toByteArray(), charsetA);
                    }
                } catch (NumberFormatException e) {
                    throw new IOException("Invalid chunk size: ".concat(strJ3), e);
                }
            } while (i4 == 10);
            throw new IOException("Expected CRLF after chunk data, got: " + ((char) i) + ((char) i4));
        }
        int i14 = c1518aH.f16800a;
        if (i14 > 0) {
            byte[] bArr2 = new byte[i14];
            while (i10 < i14) {
                int i15 = inputStream.read(bArr2, i10, i14 - i10);
                if (i15 == -1) {
                    throw new IOException("Unexpected EOF while reading fixed-length body");
                }
                i10 += i15;
            }
            str = new String(bArr2, charsetA);
        } else if (c1518aH.c) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byte[] bArr3 = new byte[8192];
            while (true) {
                int i16 = inputStream.read(bArr3);
                if (i16 == -1) {
                    break;
                }
                byteArrayOutputStream2.write(bArr3, 0, i16);
            }
            str = new String(byteArrayOutputStream2.toByteArray(), charsetA);
        } else {
            str = null;
        }
        return (str == null || str.trim().isEmpty()) ? new io.split.android.client.network.g(i6, null, certificateArr) : new io.split.android.client.network.g(i6, str, certificateArr);
    }

    public io.split.android.client.network.i l(Socket socket, SSLSocket sSLSocket) throws IOException {
        InputStream inputStream = sSLSocket.getInputStream();
        String strJ = N4.d.j(inputStream);
        if (strJ != null) {
            return new io.split.android.client.network.i(N4.d.i(strJ), new BufferedReader(new InputStreamReader(inputStream, N4.d.a((String) N4.d.h(inputStream).f16802d))), sSLSocket, socket);
        }
        throw new IOException("No HTTP response received from server");
    }

    @Override // hh.o
    public boolean test(Object obj) {
        switch (this.f2693a) {
            case 20:
                return ((Ze.a) obj).f6934b;
            default:
                return false;
        }
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        return new p3.d(bVar.d(p3.h.class));
    }

    public I(Ah.h hVar) {
        this.f2693a = 0;
    }

    public I(int i, int i4, int i6, InterfaceC2231f interfaceC2231f) {
        this.f2693a = 29;
    }
}
