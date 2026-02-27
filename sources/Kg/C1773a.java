package kg;

import W0.i;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.b;
import cj.C1110A;
import cj.t;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.u;
import zj.o;

/* JADX INFO: renamed from: kg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1773a implements FlutterPlugin, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f18133a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f18134b = new Handler(Looper.getMainLooper());

    public static boolean a(String str, List list, Map map, int i, String str2) throws Exception {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        Callback.openConnection(uRLConnection);
        j.e(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        if (i > 0) {
            httpsURLConnection.setConnectTimeout(i * 1000);
        }
        for (Map.Entry entry : map.entrySet()) {
            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Callback.connect((HttpURLConnection) httpsURLConnection);
        Certificate certificate = httpsURLConnection.getServerCertificates()[0];
        j.e(certificate, "null cannot be cast to non-null type java.security.cert.Certificate");
        byte[] encoded = certificate.getEncoded();
        j.f(encoded, "getEncoded(...)");
        byte[] bArrDigest = MessageDigest.getInstance(str2).digest(encoded);
        j.f(bArrDigest, "digest(...)");
        ArrayList arrayList = new ArrayList(bArrDigest.length);
        for (byte b8 : bArrDigest) {
            arrayList.add(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b8)}, 1)));
        }
        String strF = C1110A.F(arrayList, "", null, null, null, 62);
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(t.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String upperCase = ((String) it.next()).toUpperCase();
            j.f(upperCase, "toUpperCase(...)");
            arrayList2.add(new o("\\s").f("", upperCase));
        }
        return arrayList2.contains(strF);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        new u(binding.getBinaryMessenger(), "http_certificate_pinning").b(new C1773a());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
    }

    @Override // pg.s
    public final void onMethodCall(r call, pg.t result) {
        j.g(call, "call");
        j.g(result, "result");
        try {
            if (!j.b(call.f19112a, "check")) {
                result.notImplemented();
                return;
            }
            ExecutorService executorService = this.f18133a;
            if (executorService != null) {
                executorService.execute(new b(18, this, call, result));
            }
        } catch (Exception e) {
            Handler handler = this.f18134b;
            if (handler != null) {
                handler.post(new i(result, e, 1));
            }
        }
    }
}
