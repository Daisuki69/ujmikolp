package N;

import bj.C1034e;
import e4.C1426c;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3485b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3486d;
    public final Object e;

    public m(Y.f fVar, O.k kVar, l0.c cVar, Ag.l lVar) {
        boolean z4 = q0.c.f19736b;
        this.f3485b = fVar;
        this.c = kVar;
        this.f3486d = cVar;
        this.f3484a = z4;
        this.e = C1034e.b(lVar);
    }

    public static float a(int i, int[] iArr) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static void b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    public static boolean c(int[] iArr) {
        int i = 0;
        for (int i4 = 0; i4 < 5; i4++) {
            int i6 = iArr[i4];
            if (i6 == 0) {
                return false;
            }
            i += i6;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f3 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f3 && Math.abs(f - ((float) iArr[1])) < f3 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f3 && Math.abs(f - ((float) iArr[3])) < f3 && Math.abs(f - ((float) iArr[4])) < f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r20, int r21, int[] r22) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.m.d(int, int, int[]):boolean");
    }

    public boolean e() {
        ArrayList<C1426c> arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        float fAbs = 0.0f;
        int i = 0;
        float f = 0.0f;
        for (C1426c c1426c : arrayList) {
            if (c1426c.f16597d >= 2) {
                i++;
                f += c1426c.c;
            }
        }
        if (i >= 3) {
            float f3 = f / size;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fAbs += Math.abs(((C1426c) it.next()).c - f3);
            }
            if (fAbs <= f * 0.05f) {
                return true;
            }
        }
        return false;
    }

    public m(String str, String str2, Long l6, String str3, boolean z4) {
        this.f3485b = str;
        this.c = str2;
        this.f3486d = l6;
        this.e = str3;
        this.f3484a = z4;
    }

    public m(K3.b bVar, C3.m mVar) {
        this.f3485b = bVar;
        this.c = new ArrayList();
        this.f3486d = new int[5];
        this.e = mVar;
    }
}
