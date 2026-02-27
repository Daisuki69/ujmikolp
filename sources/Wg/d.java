package wg;

import Bg.E;
import Rg.r;
import com.paymaya.domain.store.H0;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import o5.C1963b;
import v0.C2333a;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20793b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f20794d;
    public final Serializable e;
    public final Serializable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f20795g;

    public d(Xh.d dVar) {
        this.c = false;
        this.f20794d = new AtomicLong(60L);
        this.e = new AtomicLong(60L);
        this.f = new AtomicLong(0L);
        this.f20792a = true;
        this.f20793b = true;
        this.f20795g = new C2333a(6);
    }

    public void a(E plugin, Function1 function1) {
        j.g(plugin, "plugin");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        linkedHashMap.put(plugin.getKey(), new C1963b(6, (Function1) linkedHashMap.get(plugin.getKey()), function1));
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f20794d;
        if (linkedHashMap2.containsKey(plugin.getKey())) {
            return;
        }
        linkedHashMap2.put(plugin.getKey(), new com.squareup.wire.internal.a(plugin, 21));
    }

    public d() {
        this.f20794d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.f20795g = new H0(25);
        this.f20792a = true;
        this.f20793b = true;
        int i = r.f5550a;
    }
}
