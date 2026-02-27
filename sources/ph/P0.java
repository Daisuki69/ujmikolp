package ph;

import java.util.Iterator;
import lh.AbstractC1832c;

/* JADX INFO: loaded from: classes4.dex */
public final class P0 extends AbstractC1832c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f19300b;
    public volatile boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19301d;
    public boolean e;
    public boolean f;

    public P0(ch.r rVar, Iterator it) {
        this.f19299a = rVar;
        this.f19300b = it;
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        this.f19301d = true;
        return 1;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        this.e = true;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.c = true;
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return this.e;
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        if (this.e) {
            return null;
        }
        boolean z4 = this.f;
        Iterator it = this.f19300b;
        if (!z4) {
            this.f = true;
        } else if (!it.hasNext()) {
            this.e = true;
            return null;
        }
        Object next = it.next();
        jh.e.b(next, "The iterator returned a null value");
        return next;
    }
}
