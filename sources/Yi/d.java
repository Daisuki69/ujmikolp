package yi;

import D.S;
import com.google.gson.JsonSyntaxException;
import defpackage.AbstractC1414e;
import io.split.android.client.service.sseclient.notifications.ControlNotification;
import io.split.android.client.service.sseclient.notifications.OccupancyNotification;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o6.C1967a;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f21288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1967a f21289b;
    public final AtomicLong c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f21290d;
    public final Qi.c e;

    public d(C1967a c1967a, Qi.c cVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f21288a = concurrentHashMap;
        this.c = new AtomicLong(0L);
        this.f21290d = new AtomicBoolean(true);
        this.f21289b = c1967a;
        this.e = cVar;
        concurrentHashMap.put("PRI", new C2535c(1));
        concurrentHashMap.put("SEC", new C2535c(0));
    }

    public final void a(ControlNotification controlNotification) {
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() >= controlNotification.getTimestamp()) {
            return;
        }
        atomicLong.set(controlNotification.getTimestamp());
        try {
            int i = AbstractC2534b.f21285a[controlNotification.getControlType().ordinal()];
            AtomicBoolean atomicBoolean = this.f21290d;
            Qi.c cVar = this.e;
            C1967a c1967a = this.f21289b;
            if (i == 1) {
                atomicBoolean.set(false);
                c1967a.b(new S(2));
                cVar.t(new Pi.a(Pi.d.PAUSED, System.currentTimeMillis()));
                return;
            }
            if (i == 2) {
                atomicBoolean.set(false);
                c1967a.b(new S(5));
                cVar.t(new Pi.a(Pi.d.DISABLED, System.currentTimeMillis()));
            } else {
                if (i == 3) {
                    atomicBoolean.set(true);
                    if (c() > 0) {
                        c1967a.b(new S(1));
                        cVar.t(new Pi.a(Pi.d.ENABLED, System.currentTimeMillis()));
                        return;
                    }
                    return;
                }
                if (i == 4) {
                    c1967a.b(new S(6));
                    return;
                }
                Ri.a.g("Unknown message received " + controlNotification.getControlType());
            }
        } catch (JsonSyntaxException e) {
            Ri.a.g("Could not parse control notification: " + controlNotification.getJsonData() + " -> " + e.getLocalizedMessage());
        } catch (Exception e7) {
            AbstractC1414e.o(e7, new StringBuilder("Unexpected error while processing control notification: "));
        }
    }

    public final void b(OccupancyNotification occupancyNotification) {
        String str;
        boolean z4;
        if (occupancyNotification.isControlPriChannel()) {
            str = "PRI";
        } else if (occupancyNotification.isControlSecChannel()) {
            str = "SEC";
        } else {
            Ri.a.q("Unknown occupancy channel " + occupancyNotification.getChannel());
            str = null;
        }
        if (str != null) {
            synchronized (this) {
                z4 = ((C2535c) this.f21288a.get(str)).f21287b >= occupancyNotification.getTimestamp();
            }
            if (z4) {
                return;
            }
            int iC = c();
            d(occupancyNotification.getMetrics().getPublishers(), occupancyNotification.getTimestamp(), str);
            if ("PRI".equals(str)) {
                this.e.t(new Pi.a(Oi.b.OCCUPANCY_PRI, Long.valueOf(c()), System.currentTimeMillis()));
            } else if ("SEC".equals(str)) {
                this.e.t(new Pi.a(Oi.b.OCCUPANCY_SEC, Long.valueOf(c()), System.currentTimeMillis()));
            }
            if (c() == 0 && iC > 0) {
                this.f21289b.b(new S(2));
            } else if (c() > 0 && iC == 0 && this.f21290d.get()) {
                this.f21289b.b(new S(1));
            }
        }
    }

    public final synchronized int c() {
        return ((C2535c) this.f21288a.get("PRI")).f21286a + ((C2535c) this.f21288a.get("SEC")).f21286a;
    }

    public final synchronized void d(int i, long j, String str) {
        C2535c c2535c = (C2535c) this.f21288a.get(str);
        if (c2535c == null) {
            return;
        }
        c2535c.f21287b = j;
        c2535c.f21286a = i;
    }
}
