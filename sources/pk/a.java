package pk;

import d4.AbstractC1331a;
import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;
import qk.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ok.b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f19712b;
    public LinkedBlockingQueue c;

    @Override // ok.b
    public final boolean a() {
        return true;
    }

    @Override // ok.b
    public final boolean b() {
        return true;
    }

    @Override // ok.b
    public final boolean c() {
        return true;
    }

    @Override // ok.b
    public final boolean d() {
        return true;
    }

    @Override // ok.b
    public final boolean e() {
        return true;
    }

    @Override // ok.b
    public final void f(String str) {
        i(3);
    }

    @Override // ok.b
    public final void g(String str) {
        i(5);
    }

    @Override // ok.b
    public final String getName() {
        return this.f19711a;
    }

    @Override // ok.b
    public final /* synthetic */ boolean h(int i) {
        return AbstractC1331a.a(this, i);
    }

    public final void i(int i) {
        b bVar = new b();
        System.currentTimeMillis();
        bVar.f19713a = i;
        bVar.f19714b = this.f19712b;
        Thread.currentThread().getName();
        this.c.add(bVar);
    }
}
