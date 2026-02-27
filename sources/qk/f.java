package qk;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements ok.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ok.b f19815b;
    public Boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f19816d;
    public pk.a e;
    public final LinkedBlockingQueue f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19817g;

    public f(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z4) {
        this.f19814a = str;
        this.f = linkedBlockingQueue;
        this.f19817g = z4;
    }

    @Override // ok.b
    public final boolean a() {
        return i().a();
    }

    @Override // ok.b
    public final boolean b() {
        return i().b();
    }

    @Override // ok.b
    public final boolean c() {
        return i().c();
    }

    @Override // ok.b
    public final boolean d() {
        return i().d();
    }

    @Override // ok.b
    public final boolean e() {
        return i().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f.class == obj.getClass() && this.f19814a.equals(((f) obj).f19814a);
    }

    @Override // ok.b
    public final void f(String str) {
        i().f(str);
    }

    @Override // ok.b
    public final void g(String str) {
        i().g(str);
    }

    @Override // ok.b
    public final String getName() {
        return this.f19814a;
    }

    @Override // ok.b
    public final boolean h(int i) {
        return i().h(i);
    }

    public final int hashCode() {
        return this.f19814a.hashCode();
    }

    public final ok.b i() {
        if (this.f19815b != null) {
            return this.f19815b;
        }
        if (this.f19817g) {
            return b.f19809a;
        }
        if (this.e == null) {
            pk.a aVar = new pk.a();
            aVar.f19712b = this;
            aVar.f19711a = this.f19814a;
            aVar.c = this.f;
            this.e = aVar;
        }
        return this.e;
    }

    public final boolean j() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f19816d = this.f19815b.getClass().getMethod("log", pk.b.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }
}
