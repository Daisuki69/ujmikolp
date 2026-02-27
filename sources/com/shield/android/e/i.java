package com.shield.android.e;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.Shield;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15264d = {1654536124, 160248125, 1435689871, 1114703854, 1442360564, 917179378};
    public static String hu = f("");
    private final com.shield.android.d.i hv;
    private final ExecutorService hw;

    /* JADX INFO: renamed from: com.shield.android.e.i$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15267d = {847755189, 2056670611, 1607605648, 123423647, 1957291578, 214848250};
        static final /* synthetic */ int[] hz;

        static {
            int[] iArr = new int[g.a.cc().length];
            hz = iArr;
            try {
                iArr[g.a.hn.ordinal()] = ((int) f15267d[0]) ^ 847755188;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hz[g.a.ho.ordinal()] = ((int) f15267d[1]) ^ 2056670609;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hz[g.a.hm.ordinal()] = ((int) f15267d[2]) ^ 1607605651;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15268d = {755915642, 2077828427, 1920936286, 1395520238, 642762175};
        public static final a hA;
        public static final a hB;

        static {
            a aVar = new a(f("\ue9e2\ue9f6\ue9fe\ue9f5\ue9ff\ue9f9\ue9f3"), ((int) f15268d[0]) ^ 755915642);
            hA = aVar;
            a aVar2 = new a(f("\ue9f4\ue9fa\ue9fe\ue9f8\ue9e5\ue9ff\ue9f1\ue9f1"), ((int) f15268d[1]) ^ 2077828426);
            hB = aVar2;
            long[] jArr = f15268d;
            a[] aVarArr = new a[((int) jArr[2]) ^ 1920936284];
            aVarArr[((int) jArr[0]) ^ 755915642] = aVar;
            aVarArr[((int) jArr[1]) ^ 2077828426] = aVar2;
        }

        private a(String str, int i) {
        }

        public static String f(String str) {
            StringBuilder sb2 = new StringBuilder();
            int i = ((int) f15268d[0]) ^ 755915642;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                long[] jArr = f15268d;
                long j = jArr[3];
                long j6 = jArr[1];
                int i4 = ~cCharAt;
                int i6 = (((int) j) ^ 1395465052) + cCharAt;
                sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1395465052)) + (((int) j6) ^ 2077828426), (~(((int) j) ^ 1395465052)) | i4, i6, (((((int) j) ^ 1395465052) + cCharAt) + (((int) j6) ^ 2077828426)) + ((~(((int) j) ^ 1395465052)) | i4)) ^ (i % (((int) jArr[4]) ^ 642726464))));
                long j7 = f15268d[1];
                int i10 = ~i;
                i = i + (((int) j7) ^ 2077828426) + (((int) j7) ^ 2077828426) + ((~(((int) j7) ^ 2077828426)) | i10) + (((((int) j7) ^ 2077828426) + i) - ((((((int) j7) ^ 2077828426) + i) + (((int) j7) ^ 2077828426)) + ((~(((int) j7) ^ 2077828426)) | i10)));
            }
            return sb2.toString();
        }
    }

    private i(ExecutorService executorService, com.shield.android.d.i iVar) {
        this.hw = executorService;
        this.hv = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(g gVar) {
        StringBuilder sb2;
        String strC = c(gVar);
        if (gVar.bX() == g.a.hn) {
            return strC;
        }
        Map<String, Object> mapBZ = gVar.bZ();
        if (mapBZ == null || mapBZ.size() <= 0) {
            sb2 = new StringBuilder(strC);
        } else {
            StringBuilder sbW = androidx.camera.core.impl.a.w(strC);
            sbW.append(f("풐"));
            sb2 = new StringBuilder(sbW.toString());
            for (Map.Entry<String, Object> entry : mapBZ.entrySet()) {
                Object value = entry.getValue();
                if (!(value instanceof String) || !com.shield.android.internal.i.a((CharSequence) value)) {
                    int length = sb2.length();
                    int length2 = strC.length();
                    long[] jArr = f15264d;
                    if (length != length2 + (((int) jArr[1]) ^ 160248124)) {
                        sb2.append((((int) jArr[2]) ^ 1435689897) == true ? (char) 1 : (char) 0);
                    }
                    sb2.append(entry.getKey());
                    sb2.append(f("풒"));
                    sb2.append(entry.getValue());
                }
            }
        }
        return sb2.toString();
    }

    private static byte[] e(g gVar) throws Exception {
        Map<String, Object> mapBZ = gVar.bZ();
        if (gVar.bY() == g.b.hq) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : mapBZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString().getBytes(StandardCharsets.UTF_8);
        }
        if (gVar.bY() == g.b.hs && mapBZ.get(f("퓋퓏퓙퓍")) != null) {
            return mapBZ.get(f("퓋퓏퓙퓍")).toString().getBytes(StandardCharsets.UTF_8);
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Object> entry2 : mapBZ.entrySet()) {
            String strValueOf = entry2.getValue() instanceof String ? (String) entry2.getValue() : String.valueOf(entry2.getValue());
            if (!com.shield.android.internal.i.a(strValueOf)) {
                if (sb2.length() != 0) {
                    sb2.append((((int) f15264d[2]) ^ 1435689897) == true ? (char) 1 : (char) 0);
                }
                sb2.append(URLEncoder.encode(entry2.getKey(), f("퓺퓺퓫풁풓")));
                sb2.append((((int) f15264d[3]) ^ 1114703827) == true ? (char) 1 : (char) 0);
                sb2.append(URLEncoder.encode(strValueOf, f("퓺퓺퓫풁풓")));
            }
        }
        return sb2.toString().getBytes(StandardCharsets.UTF_8);
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15264d[0]) ^ 1654536124;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15264d;
            long j = jArr[4];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1442347099) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1442347099)) + (((int) j6) ^ 160248124), (~(((int) j) ^ 1442347099)) | i4, i6, (((((int) j) ^ 1442347099) + cCharAt) + (((int) j6) ^ 160248124)) + ((~(((int) j) ^ 1442347099)) | i4)) ^ (i % (((int) jArr[5]) ^ 917238797))));
            long j7 = f15264d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 160248124) + (((int) j7) ^ 160248124) + ((~(((int) j7) ^ 160248124)) | i10) + (((((int) j7) ^ 160248124) + i) - ((((((int) j7) ^ 160248124) + i) + (((int) j7) ^ 160248124)) + ((~(((int) j7) ^ 160248124)) | i10)));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(g gVar) {
        try {
            b(gVar);
        } catch (ShieldException e) {
            gVar.c(e);
        } catch (IOException e7) {
            gVar.c(ShieldException.networkError(e7));
        } catch (Exception e10) {
            gVar.c(ShieldException.unexpectedError(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(g gVar, h hVar) {
        try {
            try {
                b(gVar);
            } catch (ShieldException e) {
                gVar.c(e);
            } catch (IOException e7) {
                gVar.c(ShieldException.networkError(e7));
            } catch (Exception e10) {
                gVar.c(ShieldException.unexpectedError(e10));
            }
        } finally {
            hVar.notifyState(a.hB);
        }
    }

    private static String c(g gVar) {
        if (gVar.bW() == null || gVar.bW().length() <= 0) {
            return gVar.bG();
        }
        return gVar.bW() + gVar.bG();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HttpURLConnection f(g gVar) throws Exception {
        String strD = d(gVar);
        if (com.shield.android.internal.i.a(strD)) {
            throw new IllegalArgumentException(f("퓚퓜퓁풌퓆퓟퓚퓜풇퓈퓊퓐풃퓀퓄풀퓑퓋퓑퓐풛퓕퓋풘퓒퓛퓅퓀퓊"));
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(strD).openConnection());
        Callback.openConnection(uRLConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setRequestMethod(gVar.bX().toString());
        httpURLConnection.setRequestProperty(f("퓮퓞퓄풁퓽퓏퓛퓛퓎퓉퓋"), f("풞"));
        g.a aVarBX = gVar.bX();
        g.a aVar = g.a.hn;
        if (aVarBX == aVar) {
            httpURLConnection.setRequestProperty(f("퓬퓁퓃퓘퓎퓄퓝풅퓳퓟퓕퓁"), gVar.bY().ht);
        } else {
            httpURLConnection.setRequestProperty(f("퓮퓍퓎퓉퓛퓞"), f("퓛퓋퓕퓘풄퓚퓅퓉퓎퓈"));
        }
        httpURLConnection.setRequestProperty(f("퓮퓞퓄풁퓹퓏퓘풅퓳퓏퓈퓁"), String.valueOf(System.currentTimeMillis()));
        httpURLConnection.setRequestProperty(f("퓼퓇퓙퓉풆퓣퓍"), gVar.ag());
        if (!com.shield.android.internal.i.a(gVar.getVersion())) {
            httpURLConnection.setRequestProperty(f("퓷풃퓨퓂퓏퓚퓆퓁퓉퓒품퓲퓆퓐퓒퓉퓐퓐"), gVar.getVersion());
        }
        httpURLConnection.setRequestProperty(f("퓜퓘"), f("풞풀풛풂풘풒"));
        httpURLConnection.setRequestProperty(f("퓟퓂퓌퓘퓍퓅퓛퓅"), f("풝"));
        httpURLConnection.setConnectTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        httpURLConnection.setReadTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        httpURLConnection.setDoInput(((int) f15264d[1]) ^ 160248124);
        if (gVar.bX() == aVar) {
            httpURLConnection.setDoOutput(((int) f15264d[1]) ^ 160248124);
        }
        HashMap<String, String> mapBV = gVar.bV();
        if (mapBV != null && mapBV.size() > 0) {
            for (Map.Entry<String, String> entry : mapBV.entrySet()) {
                if (!entry.getKey().equals(f("퓮퓍퓎퓉퓛퓞풄퓭퓉퓅퓊퓀퓊퓌퓆"))) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    public static /* synthetic */ String a(i iVar, InputStream inputStream) throws IOException {
        return a(inputStream);
    }

    public static synchronized i a(ExecutorService executorService, com.shield.android.d.i iVar) {
        return new i(executorService, iVar);
    }

    public final void a(g gVar) {
        this.hw.submit(new androidx.media3.common.util.g(22, this, gVar));
    }

    public final void a(g gVar, @NonNull h hVar) {
        hVar.notifyState(a.hA);
        try {
            this.hw.submit(new androidx.work.impl.b(5, this, gVar, hVar));
        } catch (Exception e) {
            gVar.c(ShieldException.unexpectedError(e));
            hVar.notifyState(a.hB);
        }
    }

    private void b(final g gVar) throws Exception {
        c cVarA;
        HashMap<String, String> mapBV;
        com.shield.android.k.a.dL().a(gVar.bW() + gVar.bG(), new Object[((int) f15264d[0]) ^ 1654536124]);
        HttpURLConnection httpURLConnectionF = f(gVar);
        int i = AnonymousClass3.hz[gVar.bX().ordinal()];
        if (i != 1 && i != 2) {
            cVarA = i != 3 ? null : a(httpURLConnectionF, gVar);
        } else {
            byte[] bArrE = e(gVar);
            if ((gVar instanceof l) && (mapBV = gVar.bV()) != null) {
                if (mapBV.containsKey(f("퓗풃퓝퓄"))) {
                    httpURLConnectionF.setRequestProperty(f("퓗풃퓝퓄"), mapBV.get(f("퓗풃퓝퓄")));
                }
                if (mapBV.containsKey(f("퓗풃퓝퓄풆퓜풛"))) {
                    httpURLConnectionF.setRequestProperty(f("퓗풃퓝퓄풆퓜풛"), mapBV.get(f("퓗풃퓝퓄풆퓜풛")));
                }
            }
            if (TextUtils.equals(f("퓈퓔퓄퓜"), httpURLConnectionF.getRequestProperty(f("퓮퓍퓎퓉퓛퓞풄퓭퓉퓅퓊퓀퓊퓌퓆")))) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArrE);
                gZIPOutputStream.close();
                bArrE = byteArrayOutputStream.toByteArray();
            }
            OutputStream outputStream = Callback.getOutputStream(httpURLConnectionF);
            outputStream.write(bArrE);
            cVarA = new c(httpURLConnectionF, null, outputStream) { // from class: com.shield.android.e.i.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15265d = {1190503308, 563909310, 232830860};

                public static String g(String str) {
                    StringBuilder sb2 = new StringBuilder();
                    int i4 = ((int) f15265d[0]) ^ 1190503308;
                    while (i4 < str.length()) {
                        char cCharAt = str.charAt(i4);
                        long[] jArr = f15265d;
                        long j = jArr[1];
                        long j6 = jArr[2];
                        int i6 = ~cCharAt;
                        int i10 = (((int) j) ^ 563931725) + cCharAt;
                        sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 563931725) + (((int) j6) ^ 232830861), i6 | (~(((int) j) ^ 563931725)), i10, (((int) j) ^ 563931725) + cCharAt + (((int) j6) ^ 232830861) + ((~(((int) j) ^ 563931725)) | i6)));
                        long j7 = f15265d[2];
                        int i11 = ~i4;
                        i4 = i4 + (((int) j7) ^ 232830861) + (((int) j7) ^ 232830861) + ((~(((int) j7) ^ 232830861)) | i11) + (((((int) j7) ^ 232830861) + i4) - ((((((int) j7) ^ 232830861) + i4) + (((int) j7) ^ 232830861)) + ((~(((int) j7) ^ 232830861)) | i11)));
                    }
                    return sb2.toString();
                }

                @Override // com.shield.android.e.c, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    Certificate[] serverCertificates;
                    String strA;
                    Certificate[] serverCertificates2;
                    HttpURLConnection httpURLConnection = this.gU;
                    if (httpURLConnection == null) {
                        return;
                    }
                    g gVar2 = gVar;
                    if (gVar2 instanceof l) {
                        try {
                            String str = i.hu;
                            if (str != null && str.length() > 0 && (serverCertificates = ((HttpsURLConnection) this.gU).getServerCertificates()) != null && serverCertificates.length > 0) {
                                X509Certificate x509Certificate = (X509Certificate) serverCertificates[((int) f15265d[0]) ^ 1190503308];
                                if (x509Certificate.getIssuerX500Principal() != null) {
                                    String string = x509Certificate.getIssuerX500Principal().toString();
                                    if (string.length() > 0 && !Objects.equals(i.hu, string)) {
                                        i.hu = string;
                                        Shield.getInstance().sendDeviceSignature(g("碐碖碁碇碚碕碚碐碒碇碖碬碐碛碒碝碔碖碬碗碖碇碖碐碇碖碗碬碋碊碉"));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } else if ((gVar2 instanceof b) && (serverCertificates2 = ((HttpsURLConnection) httpURLConnection).getServerCertificates()) != null && serverCertificates2.length > 0) {
                        X509Certificate x509Certificate2 = (X509Certificate) serverCertificates2[((int) f15265d[0]) ^ 1190503308];
                        if (x509Certificate2.getIssuerX500Principal() != null) {
                            String string2 = x509Certificate2.getIssuerX500Principal().toString();
                            if (string2.length() > 0) {
                                i.hu = string2;
                            }
                        }
                    }
                    try {
                        int responseCode = Callback.getResponseCode(this.gU);
                        if (responseCode >= 300) {
                            try {
                                strA = i.a(i.this, Callback.getInputStream(this.gU));
                            } catch (IOException unused2) {
                                strA = i.a(i.this, Callback.getErrorStream(this.gU));
                            }
                            throw ShieldException.httpError(i.this.d(gVar), responseCode, responseCode + g("磉磓") + Callback.getResponseMessage(this.gU), strA);
                        }
                        try {
                            try {
                                String strA2 = i.a(i.this, Callback.getInputStream(this.gU));
                                g gVar3 = gVar;
                                boolean z4 = gVar3 instanceof l;
                                gVar3.r(strA2);
                                return;
                            } catch (IOException e) {
                                throw ShieldException.networkError(e);
                            }
                        } catch (Exception e7) {
                            throw ShieldException.unexpectedError(e7);
                        }
                    } finally {
                        super.close();
                        this.gW.close();
                    }
                    super.close();
                    this.gW.close();
                }
            };
        }
        if (cVarA != null) {
            cVarA.close();
        }
    }

    private c a(HttpURLConnection httpURLConnection, final g gVar) throws Exception {
        try {
            InputStream inputStream = Callback.getInputStream(httpURLConnection);
            if (inputStream != null) {
                return new c(httpURLConnection, inputStream, null) { // from class: com.shield.android.e.i.2

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15266d = {1689325135, 1340626698, 700783380};

                    public static String g(String str) {
                        StringBuilder sb2 = new StringBuilder();
                        int i = ((int) f15266d[0]) ^ 1689325135;
                        while (i < str.length()) {
                            char cCharAt = str.charAt(i);
                            long[] jArr = f15266d;
                            long j = jArr[1];
                            long j6 = jArr[2];
                            int i4 = ~cCharAt;
                            int i6 = (((int) j) ^ 1340621452) + cCharAt;
                            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1340621452) + (((int) j6) ^ 700783381), i4 | (~(((int) j) ^ 1340621452)), i6, (((int) j) ^ 1340621452) + cCharAt + (((int) j6) ^ 700783381) + ((~(((int) j) ^ 1340621452)) | i4)));
                            long j7 = f15266d[2];
                            int i10 = ~i;
                            i = i + (((int) j7) ^ 700783381) + (((int) j7) ^ 700783381) + ((~(((int) j7) ^ 700783381)) | i10) + (((((int) j7) ^ 700783381) + i) - ((((((int) j7) ^ 700783381) + i) + (((int) j7) ^ 700783381)) + ((~(((int) j7) ^ 700783381)) | i10)));
                        }
                        return sb2.toString();
                    }

                    @Override // com.shield.android.e.c, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() throws IOException {
                        try {
                            int responseCode = Callback.getResponseCode(this.gU);
                            if (responseCode < 300) {
                                try {
                                    gVar.r(i.a(i.this, Callback.getInputStream(this.gU)));
                                    return;
                                } catch (IOException e) {
                                    throw ShieldException.networkError(e);
                                } catch (Exception e7) {
                                    throw ShieldException.unexpectedError(e7);
                                }
                            }
                            com.shield.android.k.a.dL().a(g("ᗵᗮᗯᗣᗪᗢᖦᗣᗴᗴᗩᗴᖼᖦ") + i.this.d(gVar), new Object[((int) f15266d[0]) ^ 1689325135]);
                            throw ShieldException.httpError(i.this.d(gVar), responseCode, Callback.getResponseMessage(this.gU), g("ᗕᗩᗫᗣᗲᗮᗯᗨᗡᖦᗱᗣᗨᗲᖦᗱᗴᗩᗨᗡᖨᖦᗎᗒᗒᗖᖦᗅᗉᗂᗃᖼ") + responseCode);
                        } finally {
                            super.close();
                            this.gV.close();
                        }
                    }
                };
            }
            return null;
        } catch (Exception e) {
            InputStream errorStream = Callback.getErrorStream(httpURLConnection);
            if (errorStream != null) {
                throw ShieldException.httpError(d(gVar), Callback.getResponseCode(httpURLConnection), Callback.getResponseMessage(httpURLConnection), a(errorStream));
            }
            throw ShieldException.unexpectedError(e);
        }
    }

    private static String a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb2.append(line);
            } else {
                return sb2.toString();
            }
        }
    }

    public static /* synthetic */ String a(i iVar, List list) {
        if (list != null && !list.isEmpty()) {
            return (String) list.get(((int) f15264d[0]) ^ 1654536124);
        }
        return f("");
    }
}
