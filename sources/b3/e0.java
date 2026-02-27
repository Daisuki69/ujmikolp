package b3;

import android.util.Log;
import androidx.datastore.core.DataStore;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3.m f8450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f8451b;
    public final InterfaceC0875O c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f8452d;
    public final DataStore e;
    public final C0864D f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineContext f8453g;
    public C0868H h;
    public boolean i;
    public String j;

    public e0(e3.m sessionsSettings, U sessionGenerator, InterfaceC0875O sessionFirelogPublisher, i0 timeProvider, DataStore sessionDataStore, C0864D processDataManager, CoroutineContext backgroundDispatcher) {
        kotlin.jvm.internal.j.g(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.j.g(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.j.g(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.j.g(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.g(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.j.g(processDataManager, "processDataManager");
        kotlin.jvm.internal.j.g(backgroundDispatcher, "backgroundDispatcher");
        this.f8450a = sessionsSettings;
        this.f8451b = sessionGenerator;
        this.c = sessionFirelogPublisher;
        this.f8452d = timeProvider;
        this.e = sessionDataStore;
        this.f = processDataManager;
        this.f8453g = backgroundDispatcher;
        Y y7 = Y.f8422a;
        this.j = "";
        Bj.H.w(Bj.H.c(backgroundDispatcher), null, null, new X(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(b3.e0 r4, java.lang.String r5, b3.Y r6, gj.InterfaceC1526a r7) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.e0.a(b3.e0, java.lang.String, b3.Y, gj.a):java.lang.Object");
    }

    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        Bj.H.w(Bj.H.c(this.f8453g), null, null, new a0(this, null), 3);
    }

    public final boolean c(C0868H c0868h) {
        Map map = c0868h.c;
        boolean z4 = true;
        C0864D c0864d = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + c0864d.a());
            return true;
        }
        c0864d.getClass();
        C0862B c0862b = (C0862B) map.get(c0864d.a());
        if (c0862b != null && c0862b.f8377a == c0864d.c) {
            if (kotlin.jvm.internal.j.b(c0862b.f8378b, (String) c0864d.f8383d.getValue())) {
                z4 = false;
            }
        }
        if (z4) {
            Log.d("FirebaseSessions", "Process " + c0864d.a() + " is stale");
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(b3.C0868H r12) {
        /*
            r11 = this;
            b3.h0 r0 = r12.f8390b
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            b3.L r12 = r12.f8389a
            if (r0 == 0) goto L76
            b3.i0 r4 = r11.f8452d
            b3.j0 r4 = (b3.j0) r4
            b3.h0 r4 = r4.a()
            kotlin.time.a$a r5 = kotlin.time.a.f18208b
            long r4 = r4.f8465a
            long r6 = r0.f8465a
            long r4 = r4 - r6
            Aj.b r0 = Aj.b.c
            long r4 = kotlin.time.b.f(r4, r0)
            e3.m r0 = r11.f8450a
            e3.t r6 = r0.f16580a
            kotlin.time.a r6 = r6.b()
            r7 = 0
            if (r6 == 0) goto L39
            long r9 = r6.f18210a
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L39
            boolean r6 = kotlin.time.a.e(r9)
            if (r6 != 0) goto L39
            goto L56
        L39:
            e3.t r0 = r0.f16581b
            kotlin.time.a r0 = r0.b()
            if (r0 == 0) goto L4e
            long r9 = r0.f18210a
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4e
            boolean r0 = kotlin.time.a.e(r9)
            if (r0 != 0) goto L4e
            goto L56
        L4e:
            r0 = 30
            Aj.b r6 = Aj.b.e
            long r9 = kotlin.time.b.e(r0, r6)
        L56:
            int r0 = kotlin.time.a.c(r4, r9)
            if (r0 <= 0) goto L5d
            r3 = 1
        L5d:
            if (r3 == 0) goto L75
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f8393a
            r0.append(r12)
            java.lang.String r12 = " is expired"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
        L75:
            return r3
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f8393a
            r0.append(r12)
            java.lang.String r12 = " has not backgrounded yet"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.e0.d(b3.H):boolean");
    }
}
