package Bf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import yf.C2531a;
import yf.p;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends a {
    public final Cg.c e;
    public final int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f461g;

    public g(p pVar, yf.e eVar, Cg.c cVar) throws IOException {
        super(new c(pVar.J()));
        this.f = new int[3];
        this.f461g = null;
        this.c = eVar;
        this.e = cVar;
        try {
            v(pVar);
        } catch (IOException e) {
            i iVar = this.f431b;
            if (iVar != null) {
                iVar.close();
            }
            this.c = null;
            throw e;
        }
    }

    public static long w(int i, int i4, byte[] bArr) {
        long j = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            j += (((long) bArr[i6 + i]) & 255) << (((i4 - i6) - 1) * 8);
        }
        return j;
    }

    public final void v(p pVar) throws IOException {
        C2531a c2531aI = pVar.i(yf.j.f21171B1);
        if (c2531aI == null) {
            throw new IOException("/W array is missing in Xref stream");
        }
        int size = c2531aI.f21151a.size();
        int[] iArr = this.f;
        if (size != 3) {
            throw new IOException("Wrong number of values for /W array in XRef: " + Arrays.toString(iArr));
        }
        for (int i = 0; i < 3; i++) {
            iArr[i] = c2531aI.i(i, 0);
        }
        if (iArr[0] < 0 || iArr[1] < 0 || iArr[2] < 0) {
            throw new IOException("Incorrect /W array in XRef: " + Arrays.toString(iArr));
        }
        C2531a c2531aI2 = pVar.i(yf.j.y0);
        if (c2531aI2 == null) {
            c2531aI2 = new C2531a();
            c2531aI2.f(yf.i.f21163d);
            c2531aI2.f(yf.i.m(pVar.t(yf.j.f21241o1, null, 0)));
        }
        ArrayList arrayList = c2531aI2.f21151a;
        if (arrayList.size() == 0 || arrayList.size() % 2 == 1) {
            throw new IOException("Wrong number of values for /Index array in XRef: " + Arrays.toString(iArr));
        }
        this.f461g = new f(c2531aI2);
    }
}
