package lh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import kh.InterfaceC1775b;
import of.p;

/* JADX INFO: renamed from: lh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1830a implements r, InterfaceC1775b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f18296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1486b f18297b;
    public InterfaceC1775b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18298d;
    public int e;

    public AbstractC1830a(r rVar) {
        this.f18296a = rVar;
    }

    public final void a(Throwable th2) {
        p.F(th2);
        this.f18297b.dispose();
        onError(th2);
    }

    @Override // kh.InterfaceC1776c
    public int b(int i) {
        InterfaceC1775b interfaceC1775b = this.c;
        if (interfaceC1775b == null || (i & 4) != 0) {
            return 0;
        }
        int iB = interfaceC1775b.b(i);
        if (iB == 0) {
            return iB;
        }
        this.e = iB;
        return iB;
    }

    @Override // kh.InterfaceC1779f
    public void clear() {
        this.c.clear();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f18297b.dispose();
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // kh.InterfaceC1779f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ch.r
    public void onComplete() {
        if (this.f18298d) {
            return;
        }
        this.f18298d = true;
        this.f18296a.onComplete();
    }

    @Override // ch.r
    public void onError(Throwable th2) {
        if (this.f18298d) {
            s.r(th2);
        } else {
            this.f18298d = true;
            this.f18296a.onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f18297b, interfaceC1486b)) {
            this.f18297b = interfaceC1486b;
            if (interfaceC1486b instanceof InterfaceC1775b) {
                this.c = (InterfaceC1775b) interfaceC1486b;
            }
            this.f18296a.onSubscribe(this);
        }
    }
}
