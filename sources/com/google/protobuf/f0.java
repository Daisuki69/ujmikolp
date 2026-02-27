package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {
    public static final f0 f = new f0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10094b;
    public Object[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10095d = -1;
    public boolean e;

    public f0(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.f10093a = i;
        this.f10094b = iArr;
        this.c = objArr;
        this.e = z4;
    }

    public final int a() {
        int iH;
        int iJ;
        int iH2;
        int i = this.f10095d;
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        for (int i6 = 0; i6 < this.f10093a; i6++) {
            int i10 = this.f10094b[i6];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.c[i6]).getClass();
                    iH2 = C1193g.h(i11) + 8;
                } else if (i12 == 2) {
                    iH2 = C1193g.d(i11, (C1192f) this.c[i6]);
                } else if (i12 == 3) {
                    iH = C1193g.h(i11) * 2;
                    iJ = ((f0) this.c[i6]).a();
                } else {
                    if (i12 != 5) {
                        int i13 = InvalidProtocolBufferException.f10052a;
                        throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.c[i6]).getClass();
                    iH2 = C1193g.h(i11) + 4;
                }
                i4 = iH2 + i4;
            } else {
                long jLongValue = ((Long) this.c[i6]).longValue();
                iH = C1193g.h(i11);
                iJ = C1193g.j(jLongValue);
            }
            i4 = iJ + iH + i4;
        }
        this.f10095d = i4;
        return i4;
    }

    public final void b(E e) {
        if (this.f10093a == 0) {
            return;
        }
        e.getClass();
        for (int i = 0; i < this.f10093a; i++) {
            int i4 = this.f10094b[i];
            Object obj = this.c[i];
            int i6 = i4 >>> 3;
            int i10 = i4 & 7;
            C1193g c1193g = (C1193g) e.f10045a;
            if (i10 == 0) {
                c1193g.v(i6, ((Long) obj).longValue());
            } else if (i10 == 1) {
                c1193g.p(i6, ((Long) obj).longValue());
            } else if (i10 == 2) {
                c1193g.t(i6, 2);
                c1193g.m((C1192f) obj);
            } else if (i10 == 3) {
                c1193g.t(i6, 3);
                ((f0) obj).b(e);
                c1193g.t(i6, 4);
            } else {
                if (i10 != 5) {
                    int i11 = InvalidProtocolBufferException.f10052a;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type."));
                }
                c1193g.n(i6, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        int i = this.f10093a;
        if (i == f0Var.f10093a) {
            int[] iArr = this.f10094b;
            int[] iArr2 = f0Var.f10094b;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = f0Var.c;
                    int i6 = this.f10093a;
                    for (int i10 = 0; i10 < i6; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f10093a;
        int i4 = (527 + i) * 31;
        int[] iArr = this.f10094b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i10 = 0; i10 < i; i10++) {
            i6 = (i6 * 31) + iArr[i10];
        }
        int i11 = (i4 + i6) * 31;
        Object[] objArr = this.c;
        int i12 = this.f10093a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }
}
