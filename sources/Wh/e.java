package Wh;

import lh.AbstractC1831b;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC1831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f6443a;

    public e(f fVar) {
        this.f6443a = fVar;
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        this.f6443a.j = true;
        return 2;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        this.f6443a.f6444a.clear();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f6443a.e) {
            return;
        }
        this.f6443a.e = true;
        this.f6443a.d();
        this.f6443a.f6445b.lazySet(null);
        if (this.f6443a.i.getAndIncrement() == 0) {
            this.f6443a.f6445b.lazySet(null);
            f fVar = this.f6443a;
            if (fVar.j) {
                return;
            }
            fVar.f6444a.clear();
        }
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return this.f6443a.f6444a.isEmpty();
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        return this.f6443a.f6444a.poll();
    }
}
