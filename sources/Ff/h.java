package Ff;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f1587b = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1588a;

    public h() {
        HashMap map = new HashMap();
        this.f1588a = map;
        HashMap map2 = new HashMap();
        if (map.containsKey("Standard")) {
            throw new IllegalStateException("The security handler name is already registered");
        }
        map.put("Standard", k.class);
        map2.put(j.class, k.class);
        if (map.containsKey("Adobe.PubSec")) {
            throw new IllegalStateException("The security handler name is already registered");
        }
        map.put("Adobe.PubSec", e.class);
        map2.put(d.class, e.class);
    }
}
