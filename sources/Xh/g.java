package Xh;

import D.C0176i;
import We.s;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.C1781b;
import org.joda.time.DateTimeConstants;
import ui.C2319f;
import ui.C2320g;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6641b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6642d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6643g;
    public Object h;
    public Object i;
    public Object j;

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public c1.h b() {
        String strI = ((String) this.f6640a) == null ? " transportName" : "";
        if (((c1.k) this.c) == null) {
            strI = strI.concat(" encodedPayload");
        }
        if (((Long) this.f6642d) == null) {
            strI = s.i(strI, " eventMillis");
        }
        if (((Long) this.e) == null) {
            strI = s.i(strI, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            strI = s.i(strI, " autoMetadata");
        }
        if (strI.isEmpty()) {
            return new c1.h((String) this.f6640a, (Integer) this.f6641b, (c1.k) this.c, ((Long) this.f6642d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f, (Integer) this.f6643g, (String) this.h, (byte[]) this.i, (byte[]) this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public void c() {
        if (((AtomicBoolean) this.j).get()) {
            String str = (String) this.f;
            C1781b c1781b = (C1781b) this.f6641b;
            if (str != null) {
                c1781b.k(str);
            }
            ki.h hVar = (ki.h) this.f6642d;
            C0176i c0176i = hVar.f18141b;
            C2319f c2319f = new C2319f(hVar.f18142d, (io.split.android.client.storage.splits.c) c0176i.f914a, (Mi.c) c0176i.f923q, hVar.e, (Qi.c) c0176i.f919l, hVar.f18143g, 10);
            ((d) this.c).getClass();
            long j = DateTimeConstants.SECONDS_PER_HOUR;
            this.f = c1781b.h(c2319f, j, j, (ki.e) this.i);
        }
    }

    public void d(Long l6, Long l8) {
        if (((AtomicBoolean) this.j).get()) {
            ki.h hVar = (ki.h) this.f6642d;
            C0176i c0176i = hVar.f18141b;
            C2320g c2320g = new C2320g(hVar.f18142d, (io.split.android.client.storage.splits.c) c0176i.f914a, (Mi.c) c0176i.f923q, l6, l8, hVar.f18143g);
            yi.f fVar = (yi.f) this.h;
            fVar.d(c2320g, (ki.e) this.i);
            fVar.e();
        }
    }
}
