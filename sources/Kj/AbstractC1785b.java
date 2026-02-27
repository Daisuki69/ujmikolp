package kj;

import mj.C1868a;

/* JADX INFO: renamed from: kj.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1785b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1868a f18153a = new C1868a();

    public static final int a(int i, int i4, int i6) {
        if (i6 > 0) {
            if (i < i4) {
                int i10 = i4 % i6;
                if (i10 < 0) {
                    i10 += i6;
                }
                int i11 = i % i6;
                if (i11 < 0) {
                    i11 += i6;
                }
                int i12 = (i10 - i11) % i6;
                if (i12 < 0) {
                    i12 += i6;
                }
                return i4 - i12;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i4) {
                int i13 = -i6;
                int i14 = i % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i4 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i4;
            }
        }
        return i4;
    }
}
