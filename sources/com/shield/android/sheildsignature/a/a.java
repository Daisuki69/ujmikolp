package com.shield.android.sheildsignature.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import cj.C1132s;
import com.google.firebase.messaging.t;
import com.shield.android.shieldsignature.NTPTimestamp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import oi.C1989g;
import pg.C2038a;
import qc.c;
import u4.AbstractC2299a;
import u4.C2301c;
import u4.InterfaceC2300b;
import u4.d;
import v4.C2341a;
import w4.C2377a;
import w4.C2379c;
import w4.C2382f;
import w4.EnumC2380d;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InterfaceC2300b f15484a;

    /* JADX INFO: renamed from: com.shield.android.sheildsignature.a.a$a, reason: collision with other inner class name */
    public static final class C0079a implements d {
        @Override // u4.d
        public void onError(String host, Throwable throwable) {
            j.g(host, "host");
            j.g(throwable, "throwable");
        }

        @Override // u4.d
        public void onStartSync(String host) {
            j.g(host, "host");
        }

        @Override // u4.d
        public void onSuccess(long j, long j6) {
        }
    }

    public static final void a(Context context) {
        j.g(context, "context");
        C0079a c0079a = new C0079a();
        List ntpHosts = C1132s.g("time.apple.com", "time.google.com");
        long j = AbstractC2299a.f20262d;
        long j6 = AbstractC2299a.c;
        long j7 = AbstractC2299a.f20261b;
        long j9 = AbstractC2299a.e;
        j.g(ntpHosts, "ntpHosts");
        C1989g c1989g = new C1989g();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
        j.f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        t tVar = new t(sharedPreferences);
        if (c1989g instanceof InterfaceC2300b) {
            throw new IllegalArgumentException("Local clock should implement Clock instead of KronosClock");
        }
        C2382f c2382f = new C2382f(new c(c1989g, new C2377a(), new C2377a()), c1989g, new C2038a(22, tVar, c1989g, false), c0079a, ntpHosts, j, j6, j7, j9);
        f15484a = new C2341a(c2382f, c1989g);
        c2382f.b();
    }

    public static final NTPTimestamp a() {
        C2301c c2301c;
        InterfaceC2300b interfaceC2300b = f15484a;
        if (interfaceC2300b != null) {
            C2382f c2382f = ((C2341a) interfaceC2300b).f20475a;
            c2382f.a();
            C2038a c2038a = c2382f.e;
            t tVar = (t) c2038a.f19100b;
            long j = tVar.f9808a.getLong("com.lyft.kronos.cached_current_time", 0L);
            long j6 = tVar.f9808a.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
            C2379c c2379c = j6 == 0 ? null : new C2379c(j, j6, tVar.f9808a.getLong("com.lyft.kronos.cached_offset", 0L), (C1989g) c2038a.c);
            if (((EnumC2380d) c2382f.f20694a.get()) == EnumC2380d.f20690a && c2379c != null && Math.abs((c2379c.f20688a - c2379c.f20689b) - (System.currentTimeMillis() - SystemClock.elapsedRealtime())) >= 1000) {
                C2038a c2038a2 = c2382f.e;
                synchronized (c2038a2) {
                    ((t) c2038a2.f19100b).f9808a.edit().clear().apply();
                    Unit unit = Unit.f18162a;
                }
                c2379c = null;
            }
            if (c2379c == null) {
                if (SystemClock.elapsedRealtime() - c2382f.f20695b.get() >= c2382f.i) {
                    c2382f.b();
                }
                c2301c = null;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - c2379c.f20689b;
                if (jElapsedRealtime >= c2382f.j && SystemClock.elapsedRealtime() - c2382f.f20695b.get() >= c2382f.i) {
                    c2382f.b();
                }
                c2301c = new C2301c((SystemClock.elapsedRealtime() - c2379c.f20689b) + c2379c.f20688a + c2379c.c, Long.valueOf(jElapsedRealtime));
            }
            Long lValueOf = c2301c != null ? Long.valueOf(c2301c.f20263a) : null;
            if (lValueOf != null) {
                return new NTPTimestamp(true, lValueOf.longValue());
            }
            return new NTPTimestamp(false, System.currentTimeMillis());
        }
        return new NTPTimestamp(false, System.currentTimeMillis());
    }
}
