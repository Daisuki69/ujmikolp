package X2;

import M8.T2;
import We.s;
import android.os.Handler;
import android.util.Log;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.paymaya.domain.store.L;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n4.C1920d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6474b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6475d;
    public Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6476g;
    public final Object h;
    public final Object i;
    public final Object j;

    public c(C1920d c1920d, m4.i iVar, Handler handler) {
        this.f6473a = false;
        this.h = new Object();
        this.i = new C.c(this, 1);
        this.j = new L(this, 27);
        T2.R();
        this.f6474b = c1920d;
        this.e = iVar;
        this.f = handler;
    }

    public void a(int i, long j) {
        if (i == 0) {
            d(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template."));
            return;
        }
        ((ScheduledExecutorService) this.f6476g).schedule(new b(this, i, j), ((Random) this.h).nextInt(4), TimeUnit.SECONDS);
    }

    public void b(InputStream inputStream) throws IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strI = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strI = s.i(strI, line);
            if (line.contains("}")) {
                int iIndexOf = strI.indexOf(123);
                int iLastIndexOf = strI.lastIndexOf(125);
                strI = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strI.substring(iIndexOf, iLastIndexOf + 1);
                if (!strI.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strI);
                    } catch (JSONException e) {
                        d(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((l) this.f).onError(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = ((LinkedHashSet) this.f6474b).isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = ((j) this.f6475d).h.f6518a.getLong("last_template_version", 0L);
                        long j6 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j6 > j) {
                            a(3, j6);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        e(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    strI = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.c;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = Callback.getInputStream(httpURLConnection);
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e);
                }
            } catch (IOException e7) {
                if (!this.f6473a) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e7);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e10);
                }
            }
            throw th2;
        }
    }

    public synchronized void d(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = ((LinkedHashSet) this.f6474b).iterator();
        while (it.hasNext()) {
            ((W2.c) it.next()).onError(firebaseRemoteConfigException);
        }
    }

    public synchronized void e(int i) {
        ((o) this.j).f(new Date(new Date(((Clock) this.i).currentTimeMillis()).getTime() + (((long) i) * 1000)));
    }

    public c(HttpURLConnection httpURLConnection, j jVar, d dVar, LinkedHashSet linkedHashSet, l lVar, ScheduledExecutorService scheduledExecutorService, o oVar) {
        this.c = httpURLConnection;
        this.f6475d = jVar;
        this.e = dVar;
        this.f6474b = linkedHashSet;
        this.f = lVar;
        this.f6476g = scheduledExecutorService;
        this.h = new Random();
        this.f6473a = false;
        this.j = oVar;
        this.i = DefaultClock.getInstance();
    }
}
