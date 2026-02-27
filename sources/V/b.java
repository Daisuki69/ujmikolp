package V;

import D.S;
import Ej.Z;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6014b;
    public final S c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ri.a f6015d;
    public Z e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6016g;

    public b(f fVar, S s9, int i) {
        this.f6013a = i;
        switch (i) {
            case 1:
                this.f6014b = fVar;
                this.c = s9;
                this.f = new Object();
                this.f6016g = new Object();
                break;
            case 2:
                this.f6014b = fVar;
                this.c = s9;
                this.f = new Object();
                this.f6016g = new Object();
                break;
            default:
                this.f6014b = fVar;
                this.c = s9;
                this.f = new Object();
                this.f6016g = new Object();
                break;
        }
    }

    private final Z b() {
        if (this.e == null) {
            synchronized (this.f6016g) {
                try {
                    if (this.e == null) {
                        this.e = new Z(this.f6014b.c, (int) 5120, this.c);
                    }
                    Unit unit = Unit.f18162a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Z z4 = this.e;
        j.d(z4);
        return z4;
    }

    private final Z c() {
        if (this.e == null) {
            synchronized (this.f6016g) {
                try {
                    if (this.e == null) {
                        this.e = new Z(this.f6014b.c, (int) 5120, this.c);
                    }
                    Unit unit = Unit.f18162a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Z z4 = this.e;
        j.d(z4);
        return z4;
    }

    private final Ri.a e() {
        if (this.f6015d == null) {
            synchronized (this.f) {
                try {
                    if (this.f6015d == null) {
                        this.f6015d = new Ri.a(g());
                    }
                    Unit unit = Unit.f18162a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Ri.a aVar = this.f6015d;
        j.d(aVar);
        return aVar;
    }

    private final Ri.a f() {
        if (this.f6015d == null) {
            synchronized (this.f) {
                try {
                    if (this.f6015d == null) {
                        this.f6015d = new Ri.a(g());
                    }
                    Unit unit = Unit.f18162a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Ri.a aVar = this.f6015d;
        j.d(aVar);
        return aVar;
    }

    public final Z a() {
        switch (this.f6013a) {
            case 0:
                return b();
            case 1:
                return c();
            default:
                if (this.e == null) {
                    synchronized (this.f6016g) {
                        try {
                            if (this.e == null) {
                                this.e = new Z(this.f6014b.c, (int) 5120, this.c);
                            }
                            Unit unit = Unit.f18162a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                Z z4 = this.e;
                j.d(z4);
                return z4;
        }
    }

    public final Ri.a d() {
        switch (this.f6013a) {
            case 0:
                return e();
            case 1:
                return f();
            default:
                if (this.f6015d == null) {
                    synchronized (this.f) {
                        try {
                            if (this.f6015d == null) {
                                this.f6015d = new Ri.a(g());
                            }
                            Unit unit = Unit.f18162a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                Ri.a aVar = this.f6015d;
                j.d(aVar);
                return aVar;
        }
    }

    public final int g() {
        switch (this.f6013a) {
            case 0:
                f fVar = this.f6014b;
                long j = fVar.f6022b;
                long j6 = fVar.f6021a;
                int iMax = (int) Math.max(j, j6);
                if (this.c != null) {
                    S.q(numX49.tnTj78("bPCq") + j + numX49.tnTj78("bPCz") + j6 + numX49.tnTj78("bPCl") + iMax);
                }
                return iMax;
            case 1:
                f fVar2 = this.f6014b;
                long j7 = fVar2.f6022b;
                long j9 = fVar2.f6021a;
                int iMax2 = (int) Math.max(j7, j9);
                if (this.c != null) {
                    S.q(numX49.tnTj78("bPC5") + j7 + numX49.tnTj78("bPCJ") + j9 + numX49.tnTj78("bPCI") + iMax2);
                }
                return iMax2;
            default:
                f fVar3 = this.f6014b;
                long j10 = fVar3.f6022b;
                long j11 = fVar3.f6021a;
                int iMax3 = (int) Math.max(j10, j11);
                if (this.c != null) {
                    S.q(numX49.tnTj78("bPCn") + j10 + numX49.tnTj78("bPCx") + j11 + numX49.tnTj78("bPCs") + iMax3);
                }
                return iMax3;
        }
    }
}
