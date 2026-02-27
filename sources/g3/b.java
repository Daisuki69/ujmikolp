package G3;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1703a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(K3.b bVar, int i, int i4) {
        for (int i6 = 0; i6 < i4; i6 += 2) {
            int i10 = i - i6;
            int i11 = i10;
            while (true) {
                int i12 = i + i6;
                if (i11 <= i12) {
                    bVar.f(i11, i10);
                    bVar.f(i11, i12);
                    bVar.f(i10, i11);
                    bVar.f(i12, i11);
                    i11++;
                }
            }
        }
        int i13 = i - i4;
        bVar.f(i13, i13);
        int i14 = i13 + 1;
        bVar.f(i14, i13);
        bVar.f(i13, i14);
        int i15 = i + i4;
        bVar.f(i15, i13);
        bVar.f(i15, i14);
        bVar.f(i15, i15 - 1);
    }

    public static K3.a b(int i, int i4, K3.a aVar) {
        M3.a aVar2;
        int i6 = aVar.f2588b / i4;
        if (i4 == 4) {
            aVar2 = M3.a.f3049k;
        } else if (i4 == 6) {
            aVar2 = M3.a.j;
        } else if (i4 == 8) {
            aVar2 = M3.a.f3051n;
        } else if (i4 == 10) {
            aVar2 = M3.a.i;
        } else {
            if (i4 != 12) {
                throw new IllegalArgumentException(s.f(i4, "Unsupported word size "));
            }
            aVar2 = M3.a.h;
        }
        Lh.c cVar = new Lh.c(aVar2);
        int i10 = i / i4;
        int[] iArr = new int[i10];
        int i11 = aVar.f2588b / i4;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i4; i14++) {
                i13 |= aVar.d((i12 * i4) + i14) ? 1 << ((i4 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        cVar.e(i10 - i6, iArr);
        K3.a aVar3 = new K3.a();
        aVar3.b(0, i % i4);
        for (int i15 = 0; i15 < i10; i15++) {
            aVar3.b(iArr[i15], i4);
        }
        return aVar3;
    }

    public static K3.a c(K3.a aVar, int i) {
        K3.a aVar2 = new K3.a();
        int i4 = aVar.f2588b;
        int i6 = (1 << i) - 2;
        int i10 = 0;
        while (i10 < i4) {
            int i11 = 0;
            for (int i12 = 0; i12 < i; i12++) {
                int i13 = i10 + i12;
                if (i13 >= i4 || aVar.d(i13)) {
                    i11 |= 1 << ((i - 1) - i12);
                }
            }
            int i14 = i11 & i6;
            if (i14 == i6) {
                aVar2.b(i14, i);
            } else if (i14 == 0) {
                aVar2.b(i11 | 1, i);
            } else {
                aVar2.b(i11, i);
                i10 += i;
            }
            i10--;
            i10 += i;
        }
        return aVar2;
    }
}
