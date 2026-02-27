package lh;

import ch.r;

/* JADX INFO: renamed from: lh.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1835f extends AbstractC1831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f18304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18305b;

    public C1835f(r rVar) {
        this.f18304a = rVar;
    }

    public final void a(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        r rVar = this.f18304a;
        if (i == 8) {
            this.f18305b = obj;
            lazySet(16);
            rVar.onNext(null);
        } else {
            lazySet(2);
            rVar.onNext(obj);
        }
        if (get() != 4) {
            rVar.onComplete();
        }
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        lazySet(8);
        return 2;
    }

    public final boolean c() {
        return get() == 4;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        lazySet(32);
        this.f18305b = null;
    }

    @Override // fh.InterfaceC1486b
    public void dispose() {
        set(4);
        this.f18305b = null;
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        a(obj);
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f18305b;
        this.f18305b = null;
        lazySet(32);
        return obj;
    }
}
