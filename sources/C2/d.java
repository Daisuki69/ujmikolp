package C2;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import c2.ExecutorC1068k;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import dOYHB6.yFtIp6.svM7M6;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import org.json.JSONException;
import org.json.JSONObject;
import p3.C2011b;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {
    public static final Object m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1.g f674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E2.c f675b;
    public final A7.f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f676d;
    public final b2.j e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f677g;
    public final ExecutorService h;
    public final ExecutorC1068k i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f679l;

    static {
        new AtomicInteger(1);
    }

    public d(U1.g gVar, B2.b bVar, ExecutorService executorService, ExecutorC1068k executorC1068k) {
        gVar.a();
        E2.c cVar = new E2.c(gVar.f5904a, bVar);
        A7.f fVar = new A7.f(gVar);
        if (C2011b.f19022b == null) {
            C2011b.f19022b = new C2011b(3);
        }
        C2011b c2011b = C2011b.f19022b;
        if (k.f687d == null) {
            k.f687d = new k(c2011b);
        }
        k kVar = k.f687d;
        b2.j jVar = new b2.j(new b(gVar, 0));
        i iVar = new i();
        this.f677g = new Object();
        this.f678k = new HashSet();
        this.f679l = new ArrayList();
        this.f674a = gVar;
        this.f675b = cVar;
        this.c = fVar;
        this.f676d = kVar;
        this.e = jVar;
        this.f = iVar;
        this.h = executorService;
        this.i = executorC1068k;
    }

    public final void a(j jVar) {
        synchronized (this.f677g) {
            this.f679l.add(jVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        D2.b bVarL;
        synchronized (m) {
            try {
                U1.g gVar = this.f674a;
                gVar.a();
                A7.f fVarC = A7.f.c(gVar.f5904a);
                try {
                    bVarL = this.c.l();
                    int i = bVarL.f971b;
                    boolean z4 = true;
                    if (i != 2 && i != 1) {
                        z4 = false;
                    }
                    if (z4) {
                        String strH = h(bVarL);
                        A7.f fVar = this.c;
                        D2.a aVarA = bVarL.a();
                        aVarA.f966a = strH;
                        aVarA.f967b = 3;
                        bVarL = aVarA.a();
                        fVar.h(bVarL);
                    }
                    if (fVarC != null) {
                        fVarC.m();
                    }
                } catch (Throwable th2) {
                    if (fVarC != null) {
                        fVarC.m();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        k(bVarL);
        this.i.execute(new c(this, 2));
    }

    public final D2.b c(D2.b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        int responseCode;
        E2.b bVar2;
        E2.b bVarF;
        U1.g gVar = this.f674a;
        gVar.a();
        String str = gVar.c.f5911a;
        gVar.a();
        String str2 = gVar.c.f5914g;
        String str3 = bVar.f972d;
        E2.c cVar = this.f675b;
        E2.d dVar = cVar.c;
        if (!dVar.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = E2.c.a("projects/" + str2 + "/installations/" + bVar.f970a + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(ShareTarget.METHOD_POST);
                    httpURLConnectionC.addRequestProperty(RtspHeaders.AUTHORIZATION, "FIS_v2 " + str3);
                    httpURLConnectionC.setDoOutput(true);
                    E2.c.h(httpURLConnectionC);
                    responseCode = Callback.getResponseCode(httpURLConnectionC);
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = httpURLConnectionC;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVarF = E2.c.f(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    E2.c.b(httpURLConnectionC, null, str, str2);
                    httpURLConnection = httpURLConnectionC;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            bVar2 = new E2.b(null, 0L, 3);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            bVarF = bVar2;
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                bVar2 = new E2.b(null, 0L, 2);
                                httpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                bVarF = bVar2;
                            }
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        throw th;
                    }
                }
                int iC = AbstractC2217b.c(bVarF.c);
                if (iC != 0) {
                    if (iC == 1) {
                        D2.a aVarA = bVar.a();
                        aVarA.f969g = "BAD CONFIG";
                        aVarA.f967b = 5;
                        return aVarA.a();
                    }
                    if (iC != 2) {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    l(null);
                    D2.a aVarA2 = bVar.a();
                    aVarA2.f967b = 2;
                    return aVarA2.a();
                }
                k kVar = this.f676d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f688a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                D2.a aVarA3 = bVar.a();
                aVarA3.c = bVarF.f1241a;
                aVarA3.e = bVarF.f1242b;
                byte b8 = (byte) (aVarA3.h | 1);
                aVarA3.f = seconds;
                aVarA3.h = (byte) (b8 | 2);
                return aVarA3.a();
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnectionC;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new h(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new c(this, 0));
        return task;
    }

    public final Task e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(this.f676d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new c(this, 1));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(D2.b bVar) {
        synchronized (m) {
            try {
                U1.g gVar = this.f674a;
                gVar.a();
                A7.f fVarC = A7.f.c(gVar.f5904a);
                try {
                    this.c.h(bVar);
                    if (fVarC != null) {
                        fVarC.m();
                    }
                } catch (Throwable th2) {
                    if (fVarC != null) {
                        fVarC.m();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g() {
        U1.g gVar = this.f674a;
        gVar.a();
        Preconditions.checkNotEmpty(gVar.c.f5912b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkNotEmpty(gVar.c.f5914g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkNotEmpty(gVar.c.f5911a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.c.f5912b;
        Pattern pattern = k.c;
        Preconditions.checkArgument(str.contains(Global.COLON), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkArgument(k.c.matcher(gVar.c.f5911a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(D2.b r3) {
        /*
            r2 = this;
            U1.g r0 = r2.f674a
            r0.a()
            java.lang.String r0 = r0.f5905b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            U1.g r0 = r2.f674a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f5905b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
        L1e:
            r0 = 1
            int r3 = r3.f971b
            if (r3 != r0) goto L50
            b2.j r3 = r2.e
            java.lang.Object r3 = r3.get()
            D2.c r3 = (D2.c) r3
            android.content.SharedPreferences r0 = r3.f974a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4e
        L38:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4d
            C2.i r3 = r2.f
            r3.getClass()
            java.lang.String r3 = C2.i.a()
            return r3
        L4d:
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L50:
            C2.i r3 = r2.f
            r3.getClass()
            java.lang.String r3 = C2.i.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.d.h(D2.b):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [E2.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [E2.a] */
    public final D2.b i(D2.b bVar) throws FirebaseInstallationsException {
        int responseCode;
        String str = bVar.f970a;
        String string = null;
        if (str != null && str.length() == 11) {
            D2.c cVar = (D2.c) this.e.get();
            synchronized (cVar.f974a) {
                try {
                    String[] strArr = D2.c.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = svM7M6.getString(cVar.f974a, "|T|" + cVar.f975b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString(MPDbAdapter.KEY_TOKEN);
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        E2.c cVar2 = this.f675b;
        U1.g gVar = this.f674a;
        gVar.a();
        String str3 = gVar.c.f5911a;
        String str4 = bVar.f970a;
        U1.g gVar2 = this.f674a;
        gVar2.a();
        String str5 = gVar2.c.f5914g;
        U1.g gVar3 = this.f674a;
        gVar3.a();
        String str6 = gVar3.c.f5912b;
        E2.d dVar = cVar2.c;
        if (!dVar.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = E2.c.a("projects/" + str5 + "/installations");
        int i4 = 0;
        E2.a aVar = cVar2;
        while (i4 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(ShareTarget.METHOD_POST);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    E2.c.g(httpURLConnectionC, str4, str6);
                    responseCode = Callback.getResponseCode(httpURLConnectionC);
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    E2.a aVarE = E2.c.e(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = aVarE;
                } else {
                    try {
                        E2.c.b(httpURLConnectionC, str6, str3, str5);
                    } catch (IOException | AssertionError unused3) {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        E2.a aVar2 = new E2.a(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVar2;
                    } else {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i4++;
                        aVar = aVar;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i4++;
                    aVar = aVar;
                }
                int iC = AbstractC2217b.c(aVar.e);
                if (iC != 0) {
                    if (iC != 1) {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    D2.a aVarA = bVar.a();
                    aVarA.f969g = "BAD CONFIG";
                    aVarA.f967b = 5;
                    return aVarA.a();
                }
                String str7 = aVar.f1239b;
                String str8 = aVar.c;
                k kVar = this.f676d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f688a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                E2.b bVar2 = aVar.f1240d;
                String str9 = bVar2.f1241a;
                long j = bVar2.f1242b;
                D2.a aVarA2 = bVar.a();
                aVarA2.f966a = str7;
                aVarA2.f967b = 4;
                aVarA2.c = str9;
                aVarA2.f968d = str8;
                aVarA2.e = j;
                byte b8 = (byte) (aVarA2.h | 1);
                aVarA2.f = seconds;
                aVarA2.h = (byte) (b8 | 2);
                return aVarA2.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f677g) {
            try {
                Iterator it = this.f679l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(D2.b bVar) {
        synchronized (this.f677g) {
            try {
                Iterator it = this.f679l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(D2.b bVar, D2.b bVar2) {
        try {
            if (this.f678k.size() != 0 && !TextUtils.equals(bVar.f970a, bVar2.f970a)) {
                Iterator it = this.f678k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
