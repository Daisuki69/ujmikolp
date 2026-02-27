package T3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5791d = {1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1};
    public static final int[] f = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f5792g;
    public static final int[][] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f5793a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f5794b = new n(0);
    public final n c = new n(1);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f5792g = iArr;
        int[][] iArr2 = new int[20][];
        h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f5792g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i4 = 0; i4 < iArr3.length; i4++) {
                iArr4[i4] = iArr3[(iArr3.length - i4) - 1];
            }
            h[i] = iArr4;
        }
    }

    public static boolean h(String str) {
        int length = str.length();
        if (length != 0) {
            int i = length - 1;
            if (p(str.subSequence(0, i)) == Character.digit(str.charAt(i), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int i(K3.a aVar, int[] iArr, int i, int[][] iArr2) {
        k.e(i, aVar, iArr);
        int length = iArr2.length;
        float f3 = 0.48f;
        int i4 = -1;
        for (int i6 = 0; i6 < length; i6++) {
            float fD = k.d(iArr, iArr2[i6], 0.7f);
            if (fD < f3) {
                i4 = i6;
                f3 = fD;
            }
        }
        if (i4 >= 0) {
            return i4;
        }
        throw NotFoundException.c;
    }

    public static int[] m(K3.a aVar, int i, boolean z4, int[] iArr, int[] iArr2) {
        int i4 = aVar.f2588b;
        int iF = z4 ? aVar.f(i) : aVar.e(i);
        int length = iArr.length;
        boolean z5 = z4;
        int i6 = 0;
        int i10 = iF;
        while (iF < i4) {
            if (aVar.d(iF) != z5) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else {
                    if (k.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i10, iF};
                    }
                    i10 += iArr2[0] + iArr2[1];
                    int i11 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i11);
                    iArr2[i11] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z5 = !z5;
            }
            iF++;
        }
        throw NotFoundException.c;
    }

    public static int[] n(K3.a aVar) {
        int[] iArr = new int[3];
        int[] iArrM = null;
        boolean zH = false;
        int i = 0;
        while (!zH) {
            Arrays.fill(iArr, 0, 3, 0);
            iArrM = m(aVar, i, false, f5791d, iArr);
            int i4 = iArrM[0];
            int i6 = iArrM[1];
            int i10 = i4 - (i6 - i4);
            if (i10 >= 0) {
                zH = aVar.h(i10, i4);
            }
            i = i6;
        }
        return iArrM;
    }

    public static int p(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int iCharAt = charSequence.charAt(i4) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.a();
            }
            i += iCharAt;
        }
        int i6 = i * 3;
        for (int i10 = length - 2; i10 >= 0; i10 -= 2) {
            int iCharAt2 = charSequence.charAt(i10) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.a();
            }
            i6 += iCharAt2;
        }
        return (1000 - i6) % 10;
    }

    @Override // T3.k
    public C3.j b(int i, K3.a aVar, EnumMap enumMap) {
        return l(i, aVar, n(aVar), enumMap);
    }

    public boolean g(String str) {
        return h(str);
    }

    public int[] j(K3.a aVar, int i) {
        return m(aVar, i, false, f5791d, new int[3]);
    }

    public abstract int k(K3.a aVar, int[] iArr, StringBuilder sb2);

    public C3.j l(int i, K3.a aVar, int[] iArr, EnumMap enumMap) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String str = null;
        C3.m mVar = enumMap == null ? null : (C3.m) enumMap.get(C3.b.NEED_RESULT_POINT_CALLBACK);
        if (mVar != null) {
            mVar.a(new C3.l((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb2 = this.f5793a;
        sb2.setLength(0);
        int iK = k(aVar, iArr, sb2);
        if (mVar != null) {
            mVar.a(new C3.l(iK, i));
        }
        int[] iArrJ = j(aVar, iK);
        if (mVar != null) {
            mVar.a(new C3.l((iArrJ[0] + iArrJ[1]) / 2.0f, i));
        }
        int i4 = iArrJ[1];
        int i6 = (i4 - iArrJ[0]) + i4;
        if (i6 >= aVar.f2588b || !aVar.h(i4, i6)) {
            throw NotFoundException.c;
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw FormatException.a();
        }
        if (!g(string)) {
            throw ChecksumException.a();
        }
        C3.a aVarO = o();
        float f3 = i;
        C3.j jVar = new C3.j(string, null, new C3.l[]{new C3.l((iArr[1] + iArr[0]) / 2.0f, f3), new C3.l((iArrJ[1] + iArrJ[0]) / 2.0f, f3)}, aVarO);
        try {
            C3.j jVarB = this.f5794b.b(i, iArrJ[1], aVar);
            jVar.a(C3.k.f725g, jVarB.f719a);
            EnumMap enumMap2 = jVarB.e;
            if (enumMap2 != null) {
                EnumMap enumMap3 = jVar.e;
                if (enumMap3 == null) {
                    jVar.e = enumMap2;
                } else {
                    enumMap3.putAll(enumMap2);
                }
            }
            C3.l[] lVarArr = jVarB.c;
            C3.l[] lVarArr2 = jVar.c;
            if (lVarArr2 == null) {
                jVar.c = lVarArr;
            } else if (lVarArr != null && lVarArr.length > 0) {
                C3.l[] lVarArr3 = new C3.l[lVarArr2.length + lVarArr.length];
                System.arraycopy(lVarArr2, 0, lVarArr3, 0, lVarArr2.length);
                System.arraycopy(lVarArr, 0, lVarArr3, lVarArr2.length, lVarArr.length);
                jVar.c = lVarArr3;
            }
            length = jVarB.f719a.length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = enumMap == null ? null : (int[]) enumMap.get(C3.b.ALLOWED_EAN_EXTENSIONS);
        if (iArr2 != null) {
            for (int i10 : iArr2) {
                if (length != i10) {
                }
            }
            throw NotFoundException.c;
        }
        if (aVarO == C3.a.h || aVarO == C3.a.f696o) {
            n nVar = this.c;
            synchronized (nVar) {
                if (((ArrayList) nVar.f5789a).isEmpty()) {
                    nVar.a("US/CA", new int[]{0, 19});
                    nVar.a("US", new int[]{30, 39});
                    nVar.a("US/CA", new int[]{60, TsExtractor.TS_STREAM_TYPE_DTS_UHD});
                    nVar.a("FR", new int[]{300, 379});
                    nVar.a("BG", new int[]{380});
                    nVar.a("SI", new int[]{383});
                    nVar.a("HR", new int[]{385});
                    nVar.a("BA", new int[]{387});
                    nVar.a("DE", new int[]{YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR, 440});
                    nVar.a("JP", new int[]{450, 459});
                    nVar.a("RU", new int[]{460, 469});
                    nVar.a("TW", new int[]{471});
                    nVar.a("EE", new int[]{474});
                    nVar.a("LV", new int[]{475});
                    nVar.a("AZ", new int[]{476});
                    nVar.a("LT", new int[]{477});
                    nVar.a("UZ", new int[]{478});
                    nVar.a("LK", new int[]{479});
                    nVar.a("PH", new int[]{480});
                    nVar.a("BY", new int[]{481});
                    nVar.a("UA", new int[]{482});
                    nVar.a("MD", new int[]{484});
                    nVar.a("AM", new int[]{485});
                    nVar.a("GE", new int[]{486});
                    nVar.a("KZ", new int[]{487});
                    nVar.a("HK", new int[]{489});
                    nVar.a("JP", new int[]{490, 499});
                    nVar.a("GB", new int[]{500, 509});
                    nVar.a("GR", new int[]{520});
                    nVar.a("LB", new int[]{528});
                    nVar.a("CY", new int[]{529});
                    nVar.a("MK", new int[]{531});
                    nVar.a("MT", new int[]{535});
                    nVar.a("IE", new int[]{539});
                    nVar.a("BE/LU", new int[]{540, 549});
                    nVar.a("PT", new int[]{560});
                    nVar.a("IS", new int[]{569});
                    nVar.a("DK", new int[]{570, 579});
                    nVar.a("PL", new int[]{590});
                    nVar.a("RO", new int[]{594});
                    nVar.a("HU", new int[]{599});
                    nVar.a("ZA", new int[]{600, 601});
                    nVar.a("GH", new int[]{TypedValues.MotionType.TYPE_EASING});
                    nVar.a("BH", new int[]{TypedValues.MotionType.TYPE_DRAW_PATH});
                    nVar.a("MU", new int[]{TypedValues.MotionType.TYPE_POLAR_RELATIVETO});
                    nVar.a(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, new int[]{TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE});
                    nVar.a("DZ", new int[]{613});
                    nVar.a("KE", new int[]{616});
                    nVar.a("CI", new int[]{618});
                    nVar.a("TN", new int[]{619});
                    nVar.a("SY", new int[]{621});
                    nVar.a("EG", new int[]{622});
                    nVar.a("LY", new int[]{624});
                    nVar.a("JO", new int[]{625});
                    nVar.a("IR", new int[]{626});
                    nVar.a("KW", new int[]{627});
                    nVar.a("SA", new int[]{628});
                    nVar.a("AE", new int[]{629});
                    nVar.a("FI", new int[]{640, 649});
                    nVar.a("CN", new int[]{690, 695});
                    nVar.a("NO", new int[]{TypedValues.TransitionType.TYPE_DURATION, 709});
                    nVar.a("IL", new int[]{729});
                    nVar.a("SE", new int[]{730, 739});
                    nVar.a("GT", new int[]{740});
                    nVar.a("SV", new int[]{741});
                    nVar.a("HN", new int[]{742});
                    nVar.a("NI", new int[]{743});
                    nVar.a("CR", new int[]{744});
                    nVar.a("PA", new int[]{745});
                    nVar.a("DO", new int[]{746});
                    nVar.a("MX", new int[]{750});
                    nVar.a("CA", new int[]{754, 755});
                    nVar.a("VE", new int[]{759});
                    nVar.a("CH", new int[]{760, 769});
                    nVar.a("CO", new int[]{770});
                    nVar.a("UY", new int[]{773});
                    nVar.a("PE", new int[]{775});
                    nVar.a("BO", new int[]{777});
                    nVar.a("AR", new int[]{779});
                    nVar.a("CL", new int[]{780});
                    nVar.a("PY", new int[]{784});
                    nVar.a("PE", new int[]{785});
                    nVar.a("EC", new int[]{786});
                    nVar.a("BR", new int[]{789, 790});
                    nVar.a("IT", new int[]{800, 839});
                    nVar.a("ES", new int[]{840, 849});
                    nVar.a("CU", new int[]{850});
                    nVar.a("SK", new int[]{858});
                    nVar.a("CZ", new int[]{859});
                    nVar.a("YU", new int[]{860});
                    nVar.a("MN", new int[]{865});
                    nVar.a("KP", new int[]{867});
                    nVar.a(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16194z, new int[]{868, 869});
                    nVar.a("NL", new int[]{870, 879});
                    nVar.a("KR", new int[]{880});
                    nVar.a(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16153A, new int[]{885});
                    nVar.a("SG", new int[]{888});
                    nVar.a("IN", new int[]{890});
                    nVar.a("VN", new int[]{893});
                    nVar.a("PK", new int[]{896});
                    nVar.a("ID", new int[]{899});
                    nVar.a("AT", new int[]{900, 919});
                    nVar.a("AU", new int[]{930, 939});
                    nVar.a("AZ", new int[]{940, 949});
                    nVar.a("MY", new int[]{955});
                    nVar.a("MO", new int[]{958});
                }
            }
            int i11 = Integer.parseInt(string.substring(0, 3));
            int size = ((ArrayList) nVar.f5789a).size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                int[] iArr3 = (int[]) ((ArrayList) nVar.f5789a).get(i12);
                int i13 = iArr3[0];
                if (i11 < i13) {
                    break;
                }
                if (iArr3.length != 1) {
                    i13 = iArr3[1];
                }
                if (i11 <= i13) {
                    str = (String) ((ArrayList) nVar.f5790b).get(i12);
                    break;
                }
                i12++;
            }
            if (str != null) {
                jVar.a(C3.k.f, str);
            }
        }
        return jVar;
    }

    public abstract C3.a o();
}
