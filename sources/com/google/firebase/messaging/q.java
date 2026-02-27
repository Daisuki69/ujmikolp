package com.google.firebase.messaging;

import java.util.HashMap;
import pi.C2151a;
import w2.C2370a;
import x2.AbstractC2460g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2151a f9800a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C2370a c2370a = AbstractC2460g.f20888a;
        map.put(q.class, C1185c.f9777a);
        map2.remove(q.class);
        map.put(H2.e.class, C1184b.f9775a);
        map2.remove(H2.e.class);
        map.put(H2.d.class, C1183a.f9766a);
        map2.remove(H2.d.class);
        f9800a = new C2151a(new HashMap(map), new HashMap(map2), c2370a);
    }
}
