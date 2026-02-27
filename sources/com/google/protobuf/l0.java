package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10108b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f10108b = i;
    }

    @Override // com.google.protobuf.n0
    public final boolean c(Object obj, long j) {
        switch (this.f10108b) {
            case 0:
                if (o0.f10120g) {
                    if (o0.h(obj, j) == 0) {
                    }
                } else if (o0.i(obj, j) == 0) {
                }
                break;
            default:
                if (o0.f10120g) {
                    if (o0.h(obj, j) == 0) {
                    }
                } else if (o0.i(obj, j) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.protobuf.n0
    public final byte d(Object obj, long j) {
        switch (this.f10108b) {
            case 0:
                if (!o0.f10120g) {
                }
                break;
            default:
                if (!o0.f10120g) {
                }
                break;
        }
        return o0.i(obj, j);
    }

    @Override // com.google.protobuf.n0
    public final double e(Object obj, long j) {
        switch (this.f10108b) {
        }
        return Double.longBitsToDouble(h(obj, j));
    }

    @Override // com.google.protobuf.n0
    public final float f(Object obj, long j) {
        switch (this.f10108b) {
        }
        return Float.intBitsToFloat(g(obj, j));
    }

    @Override // com.google.protobuf.n0
    public final void k(Object obj, long j, boolean z4) {
        switch (this.f10108b) {
            case 0:
                if (!o0.f10120g) {
                    o0.m(obj, j, z4 ? (byte) 1 : (byte) 0);
                } else {
                    o0.l(obj, j, z4 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!o0.f10120g) {
                    o0.m(obj, j, z4 ? (byte) 1 : (byte) 0);
                } else {
                    o0.l(obj, j, z4 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.n0
    public final void l(Object obj, long j, byte b8) {
        switch (this.f10108b) {
            case 0:
                if (!o0.f10120g) {
                    o0.m(obj, j, b8);
                } else {
                    o0.l(obj, j, b8);
                }
                break;
            default:
                if (!o0.f10120g) {
                    o0.m(obj, j, b8);
                } else {
                    o0.l(obj, j, b8);
                }
                break;
        }
    }

    @Override // com.google.protobuf.n0
    public final void m(Object obj, long j, double d10) {
        switch (this.f10108b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d10));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.protobuf.n0
    public final void n(Object obj, long j, float f) {
        switch (this.f10108b) {
            case 0:
                o(obj, j, Float.floatToIntBits(f));
                break;
            default:
                o(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // com.google.protobuf.n0
    public final boolean s() {
        switch (this.f10108b) {
        }
        return false;
    }
}
