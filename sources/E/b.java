package E;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import dOYHB6.tiZVw8.numX49;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1207b;
    public final Pair c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1208d;
    public HttpURLConnection e;

    public b(g gVar, c cVar, Pair pair) {
        j.g(gVar, numX49.tnTj78("P4t"));
        this.f1206a = gVar;
        this.f1207b = cVar;
        this.c = pair;
    }

    public final HttpURLConnection a(URL url) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        Callback.openConnection(uRLConnection);
        j.e(uRLConnection, numX49.tnTj78("P4U"));
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        g gVar = this.f1206a;
        httpURLConnection.setConnectTimeout(gVar.f1216a);
        httpURLConnection.setReadTimeout(gVar.f1217b);
        httpURLConnection.setUseCaches(gVar.c);
        httpURLConnection.setDoInput(gVar.f1218d);
        for (Map.Entry entry : gVar.e.entrySet()) {
            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return httpURLConnection;
    }

    public /* synthetic */ b(g gVar, c cVar) {
        this(gVar, cVar, new Pair(Boolean.FALSE, 0));
    }
}
