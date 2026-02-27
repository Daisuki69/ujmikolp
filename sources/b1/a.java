package B1;

import A7.f;
import Ch.c;
import D.C0187u;
import D.S;
import K3.b;
import U1.g;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.util.Log;
import b2.i;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1132s;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.zxing.FormatException;
import com.paymaya.data.database.repository.A;
import com.paymaya.domain.store.C1285t0;
import d4.AbstractC1331a;
import e0.C1416a;
import i2.e;
import j2.C1666e;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.y;
import n2.C1915b;
import n4.RunnableC1918b;
import org.json.JSONArray;
import p3.u;
import s.AbstractC2217b;
import y2.C2499a;
import y2.d;
import zj.C2581c;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f336b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f337d;
    public Object e;

    public a(boolean z4, C1285t0 c1285t0, String str, String str2) {
        this.f335a = 3;
        this.f336b = z4;
        this.c = c1285t0;
        this.f337d = str;
        this.e = str2;
    }

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f3 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f * f));
        float f7 = fArr2[10] / fSqrt;
        fArr[0] = f7;
        float f10 = fArr2[8];
        fArr[2] = f10 / fSqrt;
        fArr[8] = (-f10) / fSqrt;
        fArr[10] = f7;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        String str;
        List productsList = (List) obj;
        j.g(productsList, "productsList");
        boolean z4 = this.f336b;
        C1285t0 c1285t0 = (C1285t0) this.c;
        if (!z4) {
            A a8 = c1285t0.c;
            a8.getClass();
            a8.f11293a.c("product_v3", A.b(productsList));
            return;
        }
        A a10 = c1285t0.c;
        a10.getClass();
        String str2 = (String) this.f337d;
        String str3 = (String) this.e;
        ArrayList arrayListH = C1132s.h(str2);
        if (str3.length() > 0) {
            arrayListH.add("%\"code\":\"" + str3 + "\"%");
            str = "provider = ? AND shop_categories LIKE ?";
        } else {
            str = "provider = ? ";
        }
        f fVarA = a10.f11293a.a();
        fVarA.j("product_v3", str, (String[]) arrayListH.toArray(new String[0]));
        fVarA.k("product_v3", A.b(productsList));
        fVarA.d();
    }

    public int b(int i, int i4, int i6) {
        boolean z4 = this.f336b;
        b bVar = (b) this.c;
        return z4 ? bVar.b(i4, i) : bVar.b(i, i4) ? (i6 << 1) | 1 : i6 << 1;
    }

    public C1416a c(U8.c cVar) {
        C1416a c1416a;
        y yVar = new y();
        try {
            try {
                TrafficStats.setThreadStatsTag(17);
                yVar.f18195a = f(cVar);
                S.g((String) this.c, "Sending request to: " + ((Uri) cVar.f5964b));
                int responseCode = Callback.getResponseCode((HttpsURLConnection) yVar.f18195a);
                Map<String, List<String>> headerFields = Callback.getHeaderFields((HttpsURLConnection) yVar.f18195a);
                W4.b bVar = new W4.b(yVar, 18);
                if (responseCode == 200) {
                    j.d(headerFields);
                    c1416a = new C1416a(cVar, responseCode, headerFields, Callback.getInputStream((HttpURLConnection) yVar.f18195a), bVar);
                } else {
                    j.d(headerFields);
                    c1416a = new C1416a(cVar, responseCode, headerFields, Callback.getErrorStream((HttpsURLConnection) yVar.f18195a), bVar);
                }
                TrafficStats.clearThreadStatsTag();
                return c1416a;
            } catch (Exception e) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) yVar.f18195a;
                if (httpsURLConnection == null) {
                    throw e;
                }
                httpsURLConnection.disconnect();
                throw e;
            }
        } catch (Throwable th2) {
            TrafficStats.clearThreadStatsTag();
            throw th2;
        }
    }

    public synchronized void d() {
        try {
            if (this.f336b) {
                return;
            }
            Boolean boolG = g();
            this.f337d = boolG;
            if (boolG == null) {
                y2.b bVar = new y2.b() { // from class: com.google.firebase.messaging.l
                    @Override // y2.b
                    public final void a(C2499a c2499a) {
                        B1.a aVar = this.f9791a;
                        if (aVar.e()) {
                            t tVar = FirebaseMessaging.f9758k;
                            ((FirebaseMessaging) aVar.e).i();
                        }
                    }
                };
                i iVar = (i) ((d) this.c);
                iVar.c(iVar.c, bVar);
            }
            this.f336b = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean e() {
        Boolean bool;
        try {
            d();
            bool = (Boolean) this.f337d;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.e).f9760a.k();
    }

    public HttpsURLConnection f(U8.c cVar) throws Exception {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(((Uri) cVar.f5964b).toString()).openConnection());
        Callback.openConnection(uRLConnection);
        j.e(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        for (Map.Entry entry : ((Map) cVar.c).entrySet()) {
            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpsURLConnection.setInstanceFollowRedirects(false);
        if (this.f336b && ((SSLContext) ((InterfaceC1033d) this.e).getValue()) != null) {
            httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) ((InterfaceC1033d) this.f337d).getValue());
        }
        String str = (String) cVar.f5965d;
        if (str == null) {
            return httpsURLConnection;
        }
        httpsURLConnection.setDoOutput(true);
        OutputStream outputStream = Callback.getOutputStream((HttpURLConnection) httpsURLConnection);
        try {
            byte[] bytes = str.getBytes(C2581c.f21468b);
            j.f(bytes, "getBytes(...)");
            outputStream.write(bytes);
            Unit unit = Unit.f18162a;
            outputStream.close();
            return httpsURLConnection;
        } finally {
        }
    }

    public Boolean g() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        g gVar = ((FirebaseMessaging) this.e).f9760a;
        gVar.a();
        Context context = gVar.f5904a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public d4.d h() {
        d4.d dVar = (d4.d) this.e;
        if (dVar != null) {
            return dVar;
        }
        int iB = 0;
        int iB2 = 0;
        for (int i = 0; i < 6; i++) {
            iB2 = b(i, 8, iB2);
        }
        int iB3 = b(8, 7, b(8, 8, b(7, 8, iB2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            iB3 = b(8, i4, iB3);
        }
        int i6 = ((b) this.c).f2590b;
        int i10 = i6 - 7;
        for (int i11 = i6 - 1; i11 >= i10; i11--) {
            iB = b(8, i11, iB);
        }
        for (int i12 = i6 - 8; i12 < i6; i12++) {
            iB = b(i12, 8, iB);
        }
        d4.d dVarA = d4.d.a(iB3, iB);
        if (dVarA == null) {
            dVarA = d4.d.a(iB3 ^ 21522, iB ^ 21522);
        }
        this.e = dVarA;
        if (dVarA != null) {
            return dVarA;
        }
        throw FormatException.a();
    }

    public d4.g i() {
        d4.g gVar = (d4.g) this.f337d;
        if (gVar != null) {
            return gVar;
        }
        int i = ((b) this.c).f2590b;
        int i4 = (i - 17) / 4;
        if (i4 <= 6) {
            return d4.g.c(i4);
        }
        int i6 = i - 11;
        int iB = 0;
        int iB2 = 0;
        for (int i10 = 5; i10 >= 0; i10--) {
            for (int i11 = i - 9; i11 >= i6; i11--) {
                iB2 = b(i11, i10, iB2);
            }
        }
        d4.g gVarB = d4.g.b(iB2);
        if (gVarB != null && (gVarB.f16272a * 4) + 17 == i) {
            this.f337d = gVarB;
            return gVarB;
        }
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = i - 9; i13 >= i6; i13--) {
                iB = b(i12, i13, iB);
            }
        }
        d4.g gVarB2 = d4.g.b(iB);
        if (gVarB2 == null || (gVarB2.f16272a * 4) + 17 != i) {
            throw FormatException.a();
        }
        this.f337d = gVarB2;
        return gVarB2;
    }

    public void j() {
        if (((d4.d) this.e) == null) {
            return;
        }
        int i = AbstractC2217b.d(8)[((d4.d) this.e).f16265b];
        b bVar = (b) this.c;
        int i4 = 0;
        while (true) {
            int i6 = bVar.f2590b;
            if (i4 >= i6) {
                return;
            }
            for (int i10 = 0; i10 < i6; i10++) {
                if (AbstractC1331a.d(i, i4, i10)) {
                    bVar.a(i10, i4);
                }
            }
            i4++;
        }
    }

    public boolean k(String str, String str2) {
        synchronized (this) {
            try {
                if (!((C1666e) ((AtomicMarkableReference) this.c).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.c;
                atomicMarkableReference.set((C1666e) atomicMarkableReference.getReference(), true);
                androidx.window.layout.adapter.extensions.a aVar = new androidx.window.layout.adapter.extensions.a(this, 20);
                AtomicReference atomicReference = (AtomicReference) this.f337d;
                while (!atomicReference.compareAndSet(null, aVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((e) ((C1915b) this.e).f18588d).f17093b.a(aVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(Runnable runnable, Executor executor) {
        synchronized (this.c) {
            try {
                if (this.f336b) {
                    ((ArrayDeque) this.f337d).add(new u(runnable, executor));
                } else {
                    this.f336b = true;
                    n(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m() {
        synchronized (this.c) {
            try {
                if (((ArrayDeque) this.f337d).isEmpty()) {
                    this.f336b = false;
                    return;
                }
                u uVar = (u) ((ArrayDeque) this.f337d).remove();
                n(uVar.f19055b, uVar.f19054a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(new RunnableC1918b(4, this, runnable, false));
        } catch (RejectedExecutionException unused) {
            m();
        }
    }

    public String toString() {
        switch (this.f335a) {
            case 1:
                return "QueueData: numItems=" + ((JSONArray) this.c).length() + ", eventIds=" + ((ArrayList) this.f337d).size() + ", profileEventIds=" + ((ArrayList) this.e).size();
            default:
                return super.toString();
        }
    }

    public a(boolean z4, S s9, String logTag) {
        this.f335a = 5;
        j.g(logTag, "logTag");
        this.f336b = z4;
        this.c = logTag;
        final int i = 0;
        this.f337d = C1034e.b(new Function0(this) { // from class: e0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B1.a f16548b;

            {
                this.f16548b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        B1.a this$0 = this.f16548b;
                        j.g(this$0, "this$0");
                        try {
                            S.b("Pinning SSL session to DigiCertGlobalRoot CA certificate");
                            SSLContext sSLContext = (SSLContext) ((InterfaceC1033d) this$0.e).getValue();
                            if (sSLContext != null) {
                                return sSLContext.getSocketFactory();
                            }
                        } catch (Exception e) {
                            if (C0187u.c > 0) {
                                Log.d("CleverTap", "Issue in pinning SSL,", e);
                            }
                        }
                        return null;
                    default:
                        j.g(this.f16548b, "this$0");
                        try {
                            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                            keyStore.load(null, null);
                            ClassLoader classLoader = keyStore.getClass().getClassLoader();
                            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new BufferedInputStream(classLoader != null ? classLoader.getResourceAsStream("com/clevertap/android/sdk/certificates/AmazonRootCA1.cer") : null));
                            j.e(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                            keyStore.setCertificateEntry("AmazonRootCA1", (X509Certificate) certificateGenerateCertificate);
                            trustManagerFactory.init(keyStore);
                            sSLContext2.init(null, trustManagerFactory.getTrustManagers(), null);
                            S.b("SSL Context built");
                            return sSLContext2;
                        } catch (Exception e7) {
                            if (C0187u.c < 0) {
                                return null;
                            }
                            Log.i("CleverTap", "Error building SSL Context", e7);
                            return null;
                        }
                }
            }
        });
        final int i4 = 1;
        this.e = C1034e.b(new Function0(this) { // from class: e0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B1.a f16548b;

            {
                this.f16548b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        B1.a this$0 = this.f16548b;
                        j.g(this$0, "this$0");
                        try {
                            S.b("Pinning SSL session to DigiCertGlobalRoot CA certificate");
                            SSLContext sSLContext = (SSLContext) ((InterfaceC1033d) this$0.e).getValue();
                            if (sSLContext != null) {
                                return sSLContext.getSocketFactory();
                            }
                        } catch (Exception e) {
                            if (C0187u.c > 0) {
                                Log.d("CleverTap", "Issue in pinning SSL,", e);
                            }
                        }
                        return null;
                    default:
                        j.g(this.f16548b, "this$0");
                        try {
                            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                            keyStore.load(null, null);
                            ClassLoader classLoader = keyStore.getClass().getClassLoader();
                            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new BufferedInputStream(classLoader != null ? classLoader.getResourceAsStream("com/clevertap/android/sdk/certificates/AmazonRootCA1.cer") : null));
                            j.e(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                            keyStore.setCertificateEntry("AmazonRootCA1", (X509Certificate) certificateGenerateCertificate);
                            trustManagerFactory.init(keyStore);
                            sSLContext2.init(null, trustManagerFactory.getTrustManagers(), null);
                            S.b("SSL Context built");
                            return sSLContext2;
                        } catch (Exception e7) {
                            if (C0187u.c < 0) {
                                return null;
                            }
                            Log.i("CleverTap", "Error building SSL Context", e7);
                            return null;
                        }
                }
            }
        });
    }

    public a(int i) {
        this.f335a = i;
        switch (i) {
            case 1:
                this.c = new JSONArray();
                this.f337d = new ArrayList();
                this.e = new ArrayList();
                break;
            case 7:
                this.c = new Object();
                this.f337d = new ArrayDeque();
                this.e = new AtomicReference();
                break;
            default:
                this.c = new float[16];
                this.f337d = new float[16];
                this.e = new Q3.b(4);
                break;
        }
    }

    public a(b bVar) throws FormatException {
        this.f335a = 4;
        int i = bVar.f2590b;
        if (i >= 21 && (i & 3) == 1) {
            this.c = bVar;
            return;
        }
        throw FormatException.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.a.<init>(android.content.Context):void");
    }

    public a(C1915b c1915b, boolean z4) {
        this.f335a = 6;
        this.e = c1915b;
        this.f337d = new AtomicReference(null);
        this.f336b = z4;
        this.c = new AtomicMarkableReference(new C1666e(z4 ? 8192 : 1024), false);
    }

    public a(FirebaseMessaging firebaseMessaging, d dVar) {
        this.f335a = 2;
        this.e = firebaseMessaging;
        this.c = dVar;
    }
}
