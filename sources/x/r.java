package x;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.HashMap;
import n.C1880g;
import pg.C2038a;
import s.C2219d;
import s.C2220e;
import v.C2330e;
import y.C2495b;
import z.AbstractC2540b;
import z.AbstractC2544f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2038a f20841a = C2038a.h("w", numX49.tnTj78("bbN2"), numX49.tnTj78("bbNL"), numX49.tnTj78("bbNr"), numX49.tnTj78("bbNZ"), "v", numX49.tnTj78("bbNk"), numX49.tnTj78("bbNB"), numX49.tnTj78("bbNu"), numX49.tnTj78("bbNP"), numX49.tnTj78("bbNb"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2038a f20842b = C2038a.h(numX49.tnTj78("bbNS"), numX49.tnTj78("bbNj"), "w", numX49.tnTj78("bbNd"), numX49.tnTj78("bbNV"), "u");
    public static final C2038a c = C2038a.h(numX49.tnTj78("bbNi"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2038a f20843d = C2038a.h(numX49.tnTj78("bbNF"), "tm", numX49.tnTj78("bbNE"));

    public static C1880g a(C2495b c2495b) {
        float f;
        HashMap map;
        ArrayList arrayList;
        SparseArrayCompat sparseArrayCompat;
        float f3;
        int i;
        float f7;
        int i4;
        float f10;
        float fC = AbstractC2544f.c();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat sparseArrayCompat2 = new SparseArrayCompat();
        C1880g c1880g = new C1880g();
        c2495b.c();
        float fM = 0.0f;
        int iQ = 0;
        int iQ2 = 0;
        float fM2 = 0.0f;
        float fM3 = 0.0f;
        while (c2495b.i()) {
            switch (c2495b.w(f20841a)) {
                case 0:
                    iQ = c2495b.q();
                    break;
                case 1:
                    iQ2 = c2495b.q();
                    break;
                case 2:
                    f10 = fC;
                    fM2 = (float) c2495b.m();
                    fC = f10;
                    break;
                case 3:
                    f10 = fC;
                    fM = ((float) c2495b.m()) - 0.01f;
                    fC = f10;
                    break;
                case 4:
                    f10 = fC;
                    fM3 = (float) c2495b.m();
                    fC = f10;
                    break;
                case 5:
                    f = fC;
                    map = map4;
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat2;
                    f3 = fM;
                    i = iQ2;
                    f7 = fM2;
                    String[] strArrSplit = c2495b.r().split(numX49.tnTj78("bbNQ"));
                    int i6 = Integer.parseInt(strArrSplit[0]);
                    int i10 = Integer.parseInt(strArrSplit[1]);
                    int i11 = Integer.parseInt(strArrSplit[2]);
                    if (i6 < 4 || (i6 <= 4 && (i10 < 4 || (i10 <= 4 && i11 < 0)))) {
                        c1880g.a(numX49.tnTj78("bbNt"));
                    }
                    iQ2 = i;
                    fM = f3;
                    arrayList3 = arrayList;
                    fC = f;
                    map4 = map;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fM2 = f7;
                    break;
                case 6:
                    f = fC;
                    map = map4;
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat2;
                    f3 = fM;
                    i = iQ2;
                    f7 = fM2;
                    c2495b.b();
                    int i12 = 0;
                    while (c2495b.i()) {
                        C2330e c2330eA = q.a(c2495b, c1880g);
                        if (c2330eA.e == 3) {
                            i12++;
                        }
                        arrayList2.add(c2330eA);
                        longSparseArray.put(c2330eA.f20380d, c2330eA);
                        if (i12 > 4) {
                            AbstractC2540b.b(numX49.tnTj78("bbNH") + i12 + numX49.tnTj78("bbNO"));
                        }
                    }
                    c2495b.f();
                    iQ2 = i;
                    fM = f3;
                    arrayList3 = arrayList;
                    fC = f;
                    map4 = map;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fM2 = f7;
                    break;
                case 7:
                    f = fC;
                    arrayList = arrayList3;
                    f3 = fM;
                    c2495b.b();
                    while (c2495b.i()) {
                        ArrayList arrayList4 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        c2495b.c();
                        HashMap map5 = map4;
                        String strR = null;
                        String strR2 = null;
                        int iQ3 = 0;
                        int iQ4 = 0;
                        while (c2495b.i()) {
                            SparseArrayCompat sparseArrayCompat3 = sparseArrayCompat2;
                            int iW = c2495b.w(f20842b);
                            if (iW != 0) {
                                float f11 = fM2;
                                if (iW != 1) {
                                    if (iW == 2) {
                                        iQ3 = c2495b.q();
                                    } else if (iW == 3) {
                                        iQ4 = c2495b.q();
                                    } else if (iW == 4) {
                                        strR2 = c2495b.r();
                                    } else if (iW != 5) {
                                        c2495b.y();
                                        c2495b.z();
                                        i4 = iQ2;
                                    } else {
                                        c2495b.r();
                                    }
                                    sparseArrayCompat2 = sparseArrayCompat3;
                                    fM2 = f11;
                                } else {
                                    c2495b.b();
                                    while (c2495b.i()) {
                                        C2330e c2330eA2 = q.a(c2495b, c1880g);
                                        longSparseArray2.put(c2330eA2.f20380d, c2330eA2);
                                        arrayList4.add(c2330eA2);
                                        iQ2 = iQ2;
                                    }
                                    i4 = iQ2;
                                    c2495b.f();
                                }
                                iQ2 = i4;
                                sparseArrayCompat2 = sparseArrayCompat3;
                                fM2 = f11;
                            } else {
                                strR = c2495b.r();
                                sparseArrayCompat2 = sparseArrayCompat3;
                            }
                        }
                        SparseArrayCompat sparseArrayCompat4 = sparseArrayCompat2;
                        int i13 = iQ2;
                        float f12 = fM2;
                        c2495b.g();
                        if (strR2 != null) {
                            map3.put(strR, new n.t(iQ3, iQ4, strR, strR2));
                        } else {
                            map2.put(strR, arrayList4);
                        }
                        iQ2 = i13;
                        map4 = map5;
                        sparseArrayCompat2 = sparseArrayCompat4;
                        fM2 = f12;
                    }
                    map = map4;
                    sparseArrayCompat = sparseArrayCompat2;
                    i = iQ2;
                    f7 = fM2;
                    c2495b.f();
                    iQ2 = i;
                    fM = f3;
                    arrayList3 = arrayList;
                    fC = f;
                    map4 = map;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fM2 = f7;
                    break;
                case 8:
                    f = fC;
                    f3 = fM;
                    c2495b.c();
                    while (c2495b.i()) {
                        if (c2495b.w(c) != 0) {
                            c2495b.y();
                            c2495b.z();
                        } else {
                            c2495b.b();
                            while (c2495b.i()) {
                                C2038a c2038a = k.f20829a;
                                c2495b.c();
                                String strR3 = null;
                                String strR4 = null;
                                String strR5 = null;
                                while (c2495b.i()) {
                                    int iW2 = c2495b.w(k.f20829a);
                                    if (iW2 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (iW2 == 1) {
                                            strR4 = c2495b.r();
                                        } else if (iW2 == 2) {
                                            strR5 = c2495b.r();
                                        } else if (iW2 != 3) {
                                            c2495b.y();
                                            c2495b.z();
                                        } else {
                                            c2495b.m();
                                        }
                                        arrayList3 = arrayList5;
                                    } else {
                                        strR3 = c2495b.r();
                                    }
                                }
                                c2495b.g();
                                map4.put(strR4, new C2219d(strR3, strR4, strR5));
                                arrayList3 = arrayList3;
                            }
                            c2495b.f();
                        }
                    }
                    arrayList = arrayList3;
                    c2495b.g();
                    map = map4;
                    sparseArrayCompat = sparseArrayCompat2;
                    i = iQ2;
                    f7 = fM2;
                    iQ2 = i;
                    fM = f3;
                    arrayList3 = arrayList;
                    fC = f;
                    map4 = map;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fM2 = f7;
                    break;
                case 9:
                    f = fC;
                    f3 = fM;
                    c2495b.b();
                    while (c2495b.i()) {
                        C2038a c2038a2 = j.f20827a;
                        ArrayList arrayList6 = new ArrayList();
                        c2495b.c();
                        double dM = 0.0d;
                        String strR6 = null;
                        String strR7 = null;
                        char cCharAt = 0;
                        while (c2495b.i()) {
                            int iW3 = c2495b.w(j.f20827a);
                            if (iW3 == 0) {
                                cCharAt = c2495b.r().charAt(0);
                            } else if (iW3 == 1) {
                                c2495b.m();
                            } else if (iW3 == 2) {
                                dM = c2495b.m();
                            } else if (iW3 == 3) {
                                strR6 = c2495b.r();
                            } else if (iW3 == 4) {
                                strR7 = c2495b.r();
                            } else if (iW3 != 5) {
                                c2495b.y();
                                c2495b.z();
                            } else {
                                c2495b.c();
                                while (c2495b.i()) {
                                    if (c2495b.w(j.f20828b) != 0) {
                                        c2495b.y();
                                        c2495b.z();
                                    } else {
                                        c2495b.b();
                                        while (c2495b.i()) {
                                            arrayList6.add((u.l) g.a(c2495b, c1880g));
                                        }
                                        c2495b.f();
                                    }
                                }
                                c2495b.g();
                            }
                        }
                        c2495b.g();
                        C2220e c2220e = new C2220e(arrayList6, cCharAt, dM, strR6, strR7);
                        sparseArrayCompat2.put(c2220e.hashCode(), c2220e);
                    }
                    c2495b.f();
                    map = map4;
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat2;
                    i = iQ2;
                    f7 = fM2;
                    iQ2 = i;
                    fM = f3;
                    arrayList3 = arrayList;
                    fC = f;
                    map4 = map;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fM2 = f7;
                    break;
                case 10:
                    c2495b.b();
                    while (c2495b.i()) {
                        c2495b.c();
                        String strR8 = null;
                        float fM4 = 0.0f;
                        float fM5 = 0.0f;
                        while (c2495b.i()) {
                            int iW4 = c2495b.w(f20843d);
                            if (iW4 != 0) {
                                float f13 = fC;
                                if (iW4 == 1) {
                                    fM4 = (float) c2495b.m();
                                } else if (iW4 != 2) {
                                    c2495b.y();
                                    c2495b.z();
                                } else {
                                    fM5 = (float) c2495b.m();
                                }
                                fC = f13;
                            } else {
                                strR8 = c2495b.r();
                            }
                        }
                        float f14 = fC;
                        c2495b.g();
                        arrayList3.add(new s.i(strR8, fM4, fM5));
                        fM = fM;
                        fC = f14;
                    }
                    f = fC;
                    f3 = fM;
                    c2495b.f();
                    map = map4;
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat2;
                    i = iQ2;
                    f7 = fM2;
                    iQ2 = i;
                    fM = f3;
                    arrayList3 = arrayList;
                    fC = f;
                    map4 = map;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fM2 = f7;
                    break;
                default:
                    c2495b.y();
                    c2495b.z();
                    f = fC;
                    map = map4;
                    arrayList = arrayList3;
                    sparseArrayCompat = sparseArrayCompat2;
                    f3 = fM;
                    i = iQ2;
                    f7 = fM2;
                    iQ2 = i;
                    fM = f3;
                    arrayList3 = arrayList;
                    fC = f;
                    map4 = map;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fM2 = f7;
                    break;
            }
        }
        float f15 = fC;
        c1880g.j = new Rect(0, 0, (int) (iQ * f15), (int) (iQ2 * f15));
        c1880g.f18463k = fM2;
        c1880g.f18464l = fM;
        c1880g.m = fM3;
        c1880g.i = arrayList2;
        c1880g.h = longSparseArray;
        c1880g.c = map2;
        c1880g.f18461d = map3;
        c1880g.f18462g = sparseArrayCompat2;
        c1880g.e = map4;
        c1880g.f = arrayList3;
        return c1880g;
    }
}
