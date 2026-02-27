package ph;

import java.util.concurrent.TimeUnit;
import vh.C2356g;

/* JADX INFO: renamed from: ph.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2051a2 extends R1 {
    public final ch.v c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19408d;
    public final TimeUnit e;
    public final int f;

    public C2051a2(int i, long j, TimeUnit timeUnit, ch.v vVar) {
        this.c = vVar;
        this.f = i;
        this.f19408d = j;
        this.e = timeUnit;
    }

    @Override // ph.R1
    public final Object b(Object obj) {
        ch.v vVar = this.c;
        TimeUnit timeUnit = this.e;
        return new Vh.g(obj, vVar.c(timeUnit), timeUnit);
    }

    @Override // ph.R1
    public final U1 d() {
        U1 u12;
        long jC = this.c.c(this.e) - this.f19408d;
        U1 u13 = (U1) get();
        Object obj = u13.get();
        while (true) {
            U1 u14 = (U1) obj;
            u12 = u13;
            u13 = u14;
            if (u13 == null) {
                break;
            }
            Vh.g gVar = (Vh.g) u13.f19353a;
            Object obj2 = gVar.f6128a;
            if (obj2 != vh.h.f20506a) {
                if ((obj2 instanceof C2356g) || gVar.f6129b > jC) {
                    break;
                }
                obj = u13.get();
            } else {
                return u12;
            }
        }
        return u12;
    }

    @Override // ph.R1
    public final Object e(Object obj) {
        return ((Vh.g) obj).f6128a;
    }

    @Override // ph.R1
    public final void f() {
        U1 u12;
        long jC = this.c.c(this.e) - this.f19408d;
        U1 u13 = (U1) get();
        U1 u14 = (U1) u13.get();
        int i = 0;
        while (true) {
            U1 u15 = u14;
            u12 = u13;
            u13 = u15;
            if (u13 == null) {
                break;
            }
            int i4 = this.f19325b;
            if (i4 > this.f && i4 > 1) {
                i++;
                this.f19325b = i4 - 1;
                u14 = (U1) u13.get();
            } else {
                if (((Vh.g) u13.f19353a).f6129b > jC) {
                    break;
                }
                i++;
                this.f19325b = i4 - 1;
                u14 = (U1) u13.get();
            }
        }
        if (i != 0) {
            set(u12);
        }
    }

    @Override // ph.R1
    public final void g() {
        U1 u12;
        int i;
        long jC = this.c.c(this.e) - this.f19408d;
        U1 u13 = (U1) get();
        U1 u14 = (U1) u13.get();
        int i4 = 0;
        while (true) {
            U1 u15 = u14;
            u12 = u13;
            u13 = u15;
            if (u13 == null || (i = this.f19325b) <= 1 || ((Vh.g) u13.f19353a).f6129b > jC) {
                break;
            }
            i4++;
            this.f19325b = i - 1;
            u14 = (U1) u13.get();
        }
        if (i4 != 0) {
            set(u12);
        }
    }
}
