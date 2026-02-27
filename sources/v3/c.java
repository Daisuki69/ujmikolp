package V3;

import C3.j;
import C3.l;
import T3.k;
import W3.f;
import We.s;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.zxing.NotFoundException;
import com.paymaya.domain.model.MfaTencentErrorResult;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import x3.d;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends U3.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f6047k = {7, 5, 4, 3, 1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f6048l = {4, 20, 52, 104, 204};
    public static final int[] m = {0, 348, 1388, 2948, 3988};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[][] f6049n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f6050o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{PsExtractor.PRIVATE_STREAM_1, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, TsExtractor.TS_STREAM_TYPE_DTS_HD, 197, 169, 85, 44, 132}, new int[]{185, 133, TsExtractor.TS_PACKET_SIZE, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, TsExtractor.TS_STREAM_TYPE_DTS, 203, 187, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, ModuleDescriptor.MODULE_VERSION}, new int[]{43, TsExtractor.TS_STREAM_TYPE_AC3, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, TsExtractor.TS_STREAM_TYPE_AC4, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, PsExtractor.AUDIO_STREAM, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, TsExtractor.TS_STREAM_TYPE_E_AC3, 194, 160, 58, 174, 100, 89}};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[][] f6051p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f6052g = new ArrayList(11);
    public final ArrayList h = new ArrayList();
    public final int[] i = new int[2];
    public boolean j;

    public static j m(List list) {
        Ng.j aVar;
        int i = 2;
        int i4 = 0;
        int i6 = 1;
        int size = list.size() << 1;
        int i10 = size - 1;
        if (((a) s.e(1, list)).f6044b == null) {
            i10 = size - 2;
        }
        K3.a aVar2 = new K3.a(i10 * 12);
        int i11 = ((a) list.get(0)).f6044b.f5928a;
        int i12 = 0;
        for (int i13 = 11; i13 >= 0; i13--) {
            if (((1 << i13) & i11) != 0) {
                aVar2.j(i12);
            }
            i12++;
        }
        for (int i14 = 1; i14 < list.size(); i14++) {
            a aVar3 = (a) list.get(i14);
            U3.b bVar = aVar3.f6043a;
            for (int i15 = 11; i15 >= 0; i15--) {
                if (((1 << i15) & bVar.f5928a) != 0) {
                    aVar2.j(i12);
                }
                i12++;
            }
            U3.b bVar2 = aVar3.f6044b;
            if (bVar2 != null) {
                for (int i16 = 11; i16 >= 0; i16--) {
                    if (((1 << i16) & bVar2.f5928a) != 0) {
                        aVar2.j(i12);
                    }
                    i12++;
                }
            }
        }
        if (aVar2.d(1)) {
            aVar = new W3.b(aVar2, i);
        } else if (aVar2.d(2)) {
            int iM = U8.c.m(1, 4, aVar2);
            if (iM == 4) {
                aVar = new W3.a(aVar2, 0);
            } else if (iM != 5) {
                int iM2 = U8.c.m(1, 5, aVar2);
                if (iM2 == 12) {
                    aVar = new W3.b(aVar2, i4);
                } else if (iM2 != 13) {
                    int iM3 = U8.c.m(1, 7, aVar2);
                    String strTnTj78 = numX49.tnTj78("bLeB");
                    String strTnTj782 = numX49.tnTj78("bLeu");
                    String strTnTj783 = numX49.tnTj78("bLeV");
                    String strTnTj784 = numX49.tnTj78("bLeS");
                    String strTnTj785 = numX49.tnTj78("bLej");
                    String strTnTj786 = numX49.tnTj78("bLed");
                    switch (iM3) {
                        case 56:
                            aVar = new W3.c(aVar2, strTnTj785, strTnTj78);
                            break;
                        case 57:
                            aVar = new W3.c(aVar2, strTnTj786, strTnTj78);
                            break;
                        case 58:
                            aVar = new W3.c(aVar2, strTnTj785, strTnTj782);
                            break;
                        case 59:
                            aVar = new W3.c(aVar2, strTnTj786, strTnTj782);
                            break;
                        case 60:
                            aVar = new W3.c(aVar2, strTnTj785, strTnTj783);
                            break;
                        case 61:
                            aVar = new W3.c(aVar2, strTnTj786, strTnTj783);
                            break;
                        case 62:
                            aVar = new W3.c(aVar2, strTnTj785, strTnTj784);
                            break;
                        case 63:
                            aVar = new W3.c(aVar2, strTnTj786, strTnTj784);
                            break;
                        default:
                            throw new IllegalStateException(numX49.tnTj78("bLei") + aVar2);
                    }
                } else {
                    aVar = new W3.b(aVar2, i6);
                }
            } else {
                aVar = new W3.a(aVar2, 1);
            }
        } else {
            aVar = new f(aVar2);
        }
        String strB = aVar.b();
        l[] lVarArr = ((a) list.get(0)).c.c;
        l[] lVarArr2 = ((a) s.e(1, list)).c.c;
        return new j(strB, null, new l[]{lVarArr[0], lVarArr[1], lVarArr2[0], lVarArr2[1]}, C3.a.f695n);
    }

    @Override // T3.k
    public final j b(int i, K3.a aVar, EnumMap enumMap) {
        ArrayList arrayList = this.f6052g;
        arrayList.clear();
        this.j = false;
        try {
            return m(o(aVar, i));
        } catch (NotFoundException unused) {
            arrayList.clear();
            this.j = true;
            return m(o(aVar, i));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.f6052g;
        a aVar = (a) arrayList.get(0);
        U3.b bVar = aVar.f6043a;
        U3.b bVar2 = aVar.f6044b;
        if (bVar2 != null) {
            int i = 2;
            int i4 = bVar2.f5929b;
            for (int i6 = 1; i6 < arrayList.size(); i6++) {
                a aVar2 = (a) arrayList.get(i6);
                i4 += aVar2.f6043a.f5929b;
                int i10 = i + 1;
                U3.b bVar3 = aVar2.f6044b;
                if (bVar3 != null) {
                    i4 += bVar3.f5929b;
                    i += 2;
                } else {
                    i = i10;
                }
            }
            if (((i - 4) * MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED) + (i4 % MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED) == bVar.f5928a) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (j() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        r1 = new java.util.ArrayList();
        r1.addAll(r11);
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        return k(r10 + 1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k(int r10, java.util.ArrayList r11) throws com.google.zxing.NotFoundException {
        /*
            r9 = this;
        L0:
            java.util.ArrayList r0 = r9.h
            int r1 = r0.size()
            if (r10 >= r1) goto L77
            java.lang.Object r0 = r0.get(r10)
            V3.b r0 = (V3.b) r0
            java.util.ArrayList r1 = r9.f6052g
            r1.clear()
            java.util.Iterator r2 = r11.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            V3.b r3 = (V3.b) r3
            java.util.ArrayList r3 = r3.f6045a
            r1.addAll(r3)
            goto L17
        L29:
            java.util.ArrayList r2 = r0.f6045a
            r1.addAll(r2)
            int[][] r2 = V3.c.f6051p
            r3 = 0
            r4 = r3
        L32:
            r5 = 10
            if (r4 >= r5) goto L74
            r5 = r2[r4]
            int r6 = r1.size()
            int r7 = r5.length
            if (r6 > r7) goto L71
            r6 = r3
        L40:
            int r7 = r1.size()
            if (r6 >= r7) goto L58
            java.lang.Object r7 = r1.get(r6)
            V3.a r7 = (V3.a) r7
            U3.c r7 = r7.c
            r8 = r5[r6]
            int r7 = r7.f5930a
            if (r7 == r8) goto L55
            goto L71
        L55:
            int r6 = r6 + 1
            goto L40
        L58:
            boolean r2 = r9.j()
            if (r2 == 0) goto L5f
            return r1
        L5f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r11)
            r1.add(r0)
            int r0 = r10 + 1
            java.util.List r10 = r9.k(r0, r1)     // Catch: com.google.zxing.NotFoundException -> L74
            return r10
        L71:
            int r4 = r4 + 1
            goto L32
        L74:
            int r10 = r10 + 1
            goto L0
        L77:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.c
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.c.k(int, java.util.ArrayList):java.util.List");
    }

    public final List l(boolean z4) {
        ArrayList arrayList = this.h;
        List listK = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.f6052g.clear();
        if (z4) {
            Collections.reverse(arrayList);
        }
        try {
            listK = k(0, new ArrayList());
        } catch (NotFoundException unused) {
        }
        if (z4) {
            Collections.reverse(arrayList);
        }
        return listK;
    }

    public final U3.b n(K3.a aVar, U3.c cVar, boolean z4, boolean z5) throws NotFoundException {
        int[] iArr;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int[][] iArr2;
        int i = 0;
        while (true) {
            iArr = this.f5926b;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = 0;
            i++;
        }
        if (z5) {
            k.f(cVar.f5931b[0], aVar, iArr);
        } else {
            k.e(cVar.f5931b[1], aVar, iArr);
            int i4 = 0;
            for (int length = iArr.length - 1; i4 < length; length--) {
                int i6 = iArr[i4];
                iArr[i4] = iArr[length];
                iArr[length] = i6;
                i4++;
            }
        }
        float fC = d.C(iArr) / 17.0f;
        int[] iArr3 = cVar.f5931b;
        float f = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(fC - f) / f > 0.3f) {
            throw NotFoundException.c;
        }
        int i10 = 0;
        while (true) {
            int length2 = iArr.length;
            float[] fArr = this.f5927d;
            float[] fArr2 = this.c;
            int[] iArr4 = this.f;
            int[] iArr5 = this.e;
            if (i10 >= length2) {
                int iC = d.C(iArr5);
                int iC2 = d.C(iArr4);
                if (iC > 13) {
                    z8 = false;
                    z9 = true;
                } else if (iC < 4) {
                    z9 = false;
                    z8 = true;
                } else {
                    z8 = false;
                    z9 = false;
                }
                if (iC2 > 13) {
                    z10 = false;
                    z11 = true;
                } else if (iC2 < 4) {
                    z11 = false;
                    z10 = true;
                } else {
                    z10 = false;
                    z11 = false;
                }
                int i11 = (iC + iC2) - 17;
                boolean z17 = (iC & 1) == 1;
                boolean z18 = (iC2 & 1) == 0;
                if (i11 != 1) {
                    z12 = true;
                    z15 = z8;
                    z13 = z9;
                    z14 = z10;
                    z16 = z11;
                    if (i11 != -1) {
                        if (i11 != 0) {
                            throw NotFoundException.c;
                        }
                        if (z17) {
                            if (!z18) {
                                throw NotFoundException.c;
                            }
                            if (iC < iC2) {
                                z15 = true;
                                z16 = true;
                                z13 = z9;
                                z14 = z10;
                            } else {
                                z13 = true;
                                z14 = true;
                                z15 = z8;
                                z16 = z11;
                            }
                        } else if (z18) {
                            throw NotFoundException.c;
                        }
                    } else if (z17) {
                        if (z18) {
                            throw NotFoundException.c;
                        }
                        z15 = true;
                        z13 = z9;
                        z14 = z10;
                        z16 = z11;
                    } else {
                        if (!z18) {
                            throw NotFoundException.c;
                        }
                        z14 = true;
                        z15 = z8;
                        z13 = z9;
                        z16 = z11;
                    }
                } else if (z17) {
                    if (z18) {
                        throw NotFoundException.c;
                    }
                    z13 = true;
                    z12 = true;
                    z15 = z8;
                    z14 = z10;
                    z16 = z11;
                } else {
                    if (!z18) {
                        throw NotFoundException.c;
                    }
                    z16 = true;
                    z12 = true;
                    z15 = z8;
                    z13 = z9;
                    z14 = z10;
                }
                if (z15) {
                    if (z13) {
                        throw NotFoundException.c;
                    }
                    U3.a.h(fArr2, iArr5);
                }
                if (z13) {
                    U3.a.g(fArr2, iArr5);
                }
                if (z14) {
                    if (z16) {
                        throw NotFoundException.c;
                    }
                    U3.a.h(fArr2, iArr4);
                }
                if (z16) {
                    U3.a.g(fArr, iArr4);
                }
                int i12 = cVar.f5930a;
                int i13 = (((i12 * 4) + (z4 ? 0 : 2)) + (!z5 ? 1 : 0)) - 1;
                int length3 = iArr5.length - 1;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    iArr2 = f6050o;
                    if (length3 < 0) {
                        break;
                    }
                    if (i12 != 0 || !z4 || !z5) {
                        i14 += iArr5[length3] * iArr2[i13][length3 * 2];
                    }
                    i15 += iArr5[length3];
                    length3--;
                }
                int i16 = 0;
                for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                    if (i12 != 0 || !z4 || !z5) {
                        i16 += iArr4[length4] * iArr2[i13][(length4 * 2) + 1];
                    }
                }
                int i17 = i14 + i16;
                if ((i15 & 1) != 0 || i15 > 13 || i15 < 4) {
                    throw NotFoundException.c;
                }
                int i18 = (13 - i15) / 2;
                int i19 = f6047k[i18];
                return new U3.b((X5.f.p(iArr5, i19, z12) * f6048l[i18]) + X5.f.p(iArr4, 9 - i19, false) + m[i18], i17);
            }
            float f3 = (iArr[i10] * 1.0f) / fC;
            int i20 = (int) (0.5f + f3);
            if (i20 <= 0) {
                if (f3 < 0.3f) {
                    throw NotFoundException.c;
                }
                i20 = 1;
            } else if (i20 > 8) {
                if (f3 > 8.7f) {
                    throw NotFoundException.c;
                }
                i20 = 8;
            }
            int i21 = i10 / 2;
            if ((i10 & 1) == 0) {
                iArr5[i21] = i20;
                fArr2[i21] = f3 - i20;
            } else {
                iArr4[i21] = i20;
                fArr[i21] = f3 - i20;
            }
            i10++;
        }
    }

    public final List o(K3.a aVar, int i) throws NotFoundException {
        boolean zEquals;
        ArrayList<a> arrayList = this.f6052g;
        while (true) {
            try {
                arrayList.add(p(aVar, arrayList, i));
            } catch (NotFoundException e) {
                if (arrayList.isEmpty()) {
                    throw e;
                }
                if (j()) {
                    return arrayList;
                }
                ArrayList arrayList2 = this.h;
                boolean zIsEmpty = arrayList2.isEmpty();
                int i4 = 0;
                boolean zEquals2 = false;
                while (true) {
                    if (i4 >= arrayList2.size()) {
                        zEquals = false;
                        break;
                    }
                    b bVar = (b) arrayList2.get(i4);
                    int i6 = bVar.f6046b;
                    ArrayList arrayList3 = bVar.f6045a;
                    if (i6 > i) {
                        zEquals = arrayList3.equals(arrayList);
                        break;
                    }
                    zEquals2 = arrayList3.equals(arrayList);
                    i4++;
                }
                if (!zEquals && !zEquals2) {
                    Iterator it = arrayList2.iterator();
                    loop2: while (true) {
                        if (it.hasNext()) {
                            b bVar2 = (b) it.next();
                            for (a aVar2 : arrayList) {
                                Iterator it2 = bVar2.f6045a.iterator();
                                while (it2.hasNext()) {
                                    if (aVar2.equals((a) it2.next())) {
                                        break;
                                    }
                                }
                            }
                            break loop2;
                        }
                        arrayList2.add(i4, new b(i, arrayList));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            b bVar3 = (b) it3.next();
                            if (bVar3.f6045a.size() != arrayList.size()) {
                                Iterator it4 = bVar3.f6045a.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        it3.remove();
                                        break;
                                    }
                                    a aVar3 = (a) it4.next();
                                    Iterator it5 = arrayList.iterator();
                                    while (it5.hasNext()) {
                                        if (aVar3.equals((a) it5.next())) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!zIsEmpty) {
                    List listL = l(false);
                    if (listL != null) {
                        return listL;
                    }
                    List listL2 = l(true);
                    if (listL2 != null) {
                        return listL2;
                    }
                }
                throw NotFoundException.c;
            }
        }
    }

    public final a p(K3.a aVar, ArrayList arrayList, int i) throws NotFoundException {
        int i4;
        int i6;
        int i10;
        int iF;
        int i11;
        U3.c cVar;
        int[][] iArr;
        int i12;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        boolean z4 = arrayList.size() % 2 == 0;
        if (this.j) {
            z4 = !z4;
        }
        int iE = -1;
        boolean z5 = true;
        while (true) {
            int[] iArr2 = this.f5925a;
            iArr2[i14] = i14;
            iArr2[i15] = i14;
            iArr2[i13] = i14;
            int i16 = 3;
            iArr2[3] = i14;
            int i17 = aVar.f2588b;
            int i18 = iE >= 0 ? iE : arrayList.isEmpty() ? i14 : ((a) androidx.camera.core.impl.a.b(i15, arrayList)).c.f5931b[i15];
            int i19 = arrayList.size() % i13 != 0 ? i15 : i14;
            if (this.j) {
                i19 ^= 1;
            }
            int i20 = i14;
            while (true) {
                if (i18 >= i17) {
                    break;
                }
                boolean zD = aVar.d(i18);
                int i21 = !zD;
                if (zD) {
                    i20 = i21;
                    break;
                }
                i18++;
                i20 = i21;
            }
            int i22 = i13;
            int i23 = i14;
            int i24 = i20;
            int i25 = i18;
            while (i18 < i17) {
                int i26 = i14;
                if (aVar.d(i18) != i24) {
                    iArr2[i23] = iArr2[i23] + i15;
                    i4 = i15;
                    i6 = i16;
                } else {
                    if (i23 == i16) {
                        if (i19 != 0) {
                            int length = iArr2.length;
                            i6 = i16;
                            int i27 = i26;
                            while (true) {
                                i10 = i15;
                                if (i27 >= length / 2) {
                                    break;
                                }
                                int i28 = iArr2[i27];
                                int i29 = (length - i27) - 1;
                                iArr2[i27] = iArr2[i29];
                                iArr2[i29] = i28;
                                i27++;
                                i15 = i10;
                            }
                        } else {
                            i10 = i15;
                            i6 = i16;
                        }
                        if (U3.a.i(iArr2)) {
                            int[] iArr3 = this.i;
                            iArr3[i26] = i25;
                            iArr3[i10] = i18;
                            if (z4) {
                                int i30 = i25 - 1;
                                while (i30 >= 0 && !aVar.d(i30)) {
                                    i30--;
                                }
                                i25 = i30 + 1;
                                i11 = iArr3[i26] - i25;
                                iF = iArr3[i10];
                            } else {
                                iF = aVar.f(i18 + 1);
                                i11 = iF - iArr3[i10];
                            }
                            int i31 = i25;
                            int i32 = iF;
                            System.arraycopy(iArr2, i26, iArr2, i10, iArr2.length - 1);
                            iArr2[i26] = i11;
                            U3.b bVarN = null;
                            try {
                                iArr = f6049n;
                            } catch (NotFoundException unused) {
                                cVar = null;
                            }
                            for (i12 = 0; i12 < 6; i12++) {
                                if (k.d(iArr2, iArr[i12], 0.45f) < 0.2f) {
                                    cVar = new U3.c(i12, new int[]{i31, i32}, i31, i32, i);
                                    if (cVar == null) {
                                        int i33 = iArr3[0];
                                        iE = aVar.d(i33) ? aVar.e(aVar.f(i33)) : aVar.f(aVar.e(i33));
                                    } else {
                                        z5 = false;
                                    }
                                    if (!z5) {
                                        U3.b bVarN2 = n(aVar, cVar, z4, true);
                                        if (!arrayList.isEmpty() && ((a) androidx.camera.core.impl.a.b(1, arrayList)).f6044b == null) {
                                            throw NotFoundException.c;
                                        }
                                        try {
                                            bVarN = n(aVar, cVar, z4, false);
                                        } catch (NotFoundException unused2) {
                                        }
                                        return new a(bVarN2, bVarN, cVar);
                                    }
                                    i13 = i22;
                                    i14 = 0;
                                    i15 = 1;
                                }
                            }
                            throw NotFoundException.c;
                        } else {
                            if (i19 != 0) {
                                int length2 = iArr2.length;
                                for (int i34 = 0; i34 < length2 / 2; i34++) {
                                    int i35 = iArr2[i34];
                                    int i36 = (length2 - i34) - 1;
                                    iArr2[i34] = iArr2[i36];
                                    iArr2[i36] = i35;
                                }
                            }
                            i4 = 1;
                            i26 = 0;
                            i25 += iArr2[0] + iArr2[1];
                            iArr2[0] = iArr2[i22];
                            iArr2[1] = iArr2[i6];
                            iArr2[i22] = 0;
                            iArr2[i6] = 0;
                            i23--;
                        }
                    } else {
                        i4 = i15;
                        i6 = i16;
                        i23++;
                    }
                    iArr2[i23] = i4;
                    i24 ^= 1;
                }
                i18++;
                i14 = i26;
                i16 = i6;
                i15 = i4;
            }
            throw NotFoundException.c;
        }
    }

    @Override // T3.k, C3.i
    public final void reset() {
        this.f6052g.clear();
        this.h.clear();
    }
}
