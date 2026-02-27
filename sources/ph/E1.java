package ph;

import lh.AbstractC1831b;

/* JADX INFO: loaded from: classes4.dex */
public final class E1 extends AbstractC1831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19173b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19174d;
    public boolean e;

    public /* synthetic */ E1(ch.r rVar, long j, long j6, int i) {
        this.f19172a = i;
        this.f19173b = rVar;
        this.f19174d = j;
        this.c = j6;
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        switch (this.f19172a) {
            case 0:
                this.e = true;
                break;
            default:
                this.e = true;
                break;
        }
        return 1;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        switch (this.f19172a) {
            case 0:
                this.f19174d = this.c;
                lazySet(1);
                break;
            default:
                this.f19174d = this.c;
                lazySet(1);
                break;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19172a) {
            case 0:
                set(1);
                break;
            default:
                set(1);
                break;
        }
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        switch (this.f19172a) {
            case 0:
                if (this.f19174d == this.c) {
                }
                break;
            default:
                if (this.f19174d == this.c) {
                }
                break;
        }
        return false;
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        switch (this.f19172a) {
            case 0:
                long j = this.f19174d;
                if (j == this.c) {
                    lazySet(1);
                } else {
                    this.f19174d = 1 + j;
                }
                break;
            default:
                long j6 = this.f19174d;
                if (j6 == this.c) {
                    lazySet(1);
                } else {
                    this.f19174d = 1 + j6;
                }
                break;
        }
        return null;
    }
}
