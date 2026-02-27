package ph;

import lh.AbstractC1832c;

/* JADX INFO: loaded from: classes4.dex */
public final class M0 extends AbstractC1832c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f19270b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19271d;
    public volatile boolean e;

    public M0(ch.r rVar, Object[] objArr) {
        this.f19269a = rVar;
        this.f19270b = objArr;
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        this.f19271d = true;
        return 1;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        this.c = this.f19270b.length;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.e = true;
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return this.c == this.f19270b.length;
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        int i = this.c;
        Object[] objArr = this.f19270b;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        jh.e.b(obj, "The array element is null");
        return obj;
    }
}
