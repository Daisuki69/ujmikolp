package x;

import dOYHB6.tiZVw8.numX49;
import pg.C2038a;
import s.AbstractC2217b;
import s.C2218c;
import y.AbstractC2494a;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements InterfaceC2445C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f20821a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2038a f20822b = C2038a.h("t", numX49.tnTj78("bbNbH"), numX49.tnTj78("bbNbO"), numX49.tnTj78("bbNbQ"), "tr", numX49.tnTj78("bbNbt"), numX49.tnTj78("bbNbU"), numX49.tnTj78("bbNbe"), numX49.tnTj78("bbNb8"), "sw", numX49.tnTj78("bbNbF"));

    @Override // x.InterfaceC2445C
    public final Object a(AbstractC2494a abstractC2494a, float f) {
        abstractC2494a.c();
        int i = 3;
        String strR = null;
        String strR2 = null;
        float fM = 0.0f;
        float fM2 = 0.0f;
        float fM3 = 0.0f;
        float fM4 = 0.0f;
        int iQ = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zK = true;
        while (abstractC2494a.i()) {
            switch (abstractC2494a.w(f20822b)) {
                case 0:
                    strR = abstractC2494a.r();
                    break;
                case 1:
                    strR2 = abstractC2494a.r();
                    break;
                case 2:
                    fM = (float) abstractC2494a.m();
                    break;
                case 3:
                    int iQ2 = abstractC2494a.q();
                    i = (iQ2 <= 2 && iQ2 >= 0) ? AbstractC2217b.d(3)[iQ2] : 3;
                    break;
                case 4:
                    iQ = abstractC2494a.q();
                    break;
                case 5:
                    fM2 = (float) abstractC2494a.m();
                    break;
                case 6:
                    fM3 = (float) abstractC2494a.m();
                    break;
                case 7:
                    iA = n.a(abstractC2494a);
                    break;
                case 8:
                    iA2 = n.a(abstractC2494a);
                    break;
                case 9:
                    fM4 = (float) abstractC2494a.m();
                    break;
                case 10:
                    zK = abstractC2494a.k();
                    break;
                default:
                    abstractC2494a.y();
                    abstractC2494a.z();
                    break;
            }
        }
        abstractC2494a.g();
        return new C2218c(strR, strR2, fM, i, iQ, fM2, fM3, iA, iA2, fM4, zK);
    }
}
