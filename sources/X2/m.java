package X2;

import We.s;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f6503s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f6504t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f6505a;
    public int c;
    public HttpURLConnection f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f6508g;
    public final ScheduledExecutorService h;
    public final j i;
    public final U1.g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2.e f6509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f6510l;
    public final Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6511n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f6514q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6506b = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Random f6512o = new Random();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Clock f6513p = DefaultClock.getInstance();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6507d = false;
    public boolean e = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f6515r = new Object();

    public m(U1.g gVar, C2.e eVar, j jVar, d dVar, Context context, String str, LinkedHashSet linkedHashSet, o oVar, ScheduledExecutorService scheduledExecutorService) {
        this.f6505a = linkedHashSet;
        this.h = scheduledExecutorService;
        this.c = Math.max(8 - oVar.c().f6516a, 1);
        this.j = gVar;
        this.i = jVar;
        this.f6509k = eVar;
        this.f6510l = dVar;
        this.m = context;
        this.f6511n = str;
        this.f6514q = oVar;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f6505a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f6506b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f6507d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.m.a():boolean");
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e7) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e7);
            }
        }
    }

    public final String c(String str) {
        U1.g gVar = this.j;
        gVar.a();
        Matcher matcher = f6504t.matcher(gVar.c.f5912b);
        return s.l("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.h.schedule(new C.h(this, 11), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    g(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f6505a.iterator();
        while (it.hasNext()) {
            ((W2.c) it.next()).onError(firebaseRemoteConfigException);
        }
    }

    public final synchronized void h() {
        this.c = 8;
    }

    public final synchronized void i() {
        e(Math.max(0L, this.f6514q.c().f6517b.getTime() - new Date(this.f6513p.currentTimeMillis()).getTime()));
    }

    public final synchronized void j(boolean z4) {
        this.f6506b = z4;
    }

    public final void k(boolean z4) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f6515r) {
            try {
                this.e = z4;
                c cVar = this.f6508g;
                if (cVar != null) {
                    cVar.f6473a = z4;
                }
                if (Build.VERSION.SDK_INT >= 26 && z4 && (httpURLConnection = this.f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.m.l(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized c m(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.i, this.f6510l, this.f6505a, new l(this), this.h, this.f6514q);
    }

    public final void n(Date date) {
        o oVar = this.f6514q;
        int i = oVar.c().f6516a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f6503s[(i < 8 ? i : 8) - 1]);
        oVar.g(i, new Date(date.getTime() + (millis / 2) + ((long) this.f6512o.nextInt((int) millis))));
    }
}
