package T3;

import androidx.media3.extractor.ts.TsExtractor;
import com.google.zxing.ChecksumException;
import com.google.zxing.NotFoundException;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import java.util.Arrays;
import java.util.EnumMap;
import mx_android.support.v7.media.MediaRouter;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5768d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_CHANGED, 67, 322, 19, 274, 82, 7, MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_SELECTED, 70, 22, 385, 193, 448, 145, YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR, 208, 133, 388, 196, DateTimeConstants.HOURS_PER_WEEK, 162, TsExtractor.TS_STREAM_TYPE_DTS, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f5770b = new StringBuilder(20);
    public final int[] c = new int[9];

    public d(boolean z4) {
        this.f5769a = z4;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i4 = Integer.MAX_VALUE;
            for (int i6 : iArr) {
                if (i6 < i4 && i6 > i) {
                    i4 = i6;
                }
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = iArr[i13];
                if (i14 > i4) {
                    i11 |= 1 << ((length - 1) - i13);
                    i10++;
                    i12 += i14;
                }
            }
            if (i10 == 3) {
                for (int i15 = 0; i15 < length && i10 > 0; i15++) {
                    int i16 = iArr[i15];
                    if (i16 > i4) {
                        i10--;
                        if ((i16 << 1) >= i12) {
                            return -1;
                        }
                    }
                }
                return i11;
            }
            if (i10 <= 3) {
                return -1;
            }
            i = i4;
        }
    }

    @Override // T3.k
    public final C3.j b(int i, K3.a aVar, EnumMap enumMap) throws NotFoundException, ChecksumException {
        int i4;
        int i6;
        char cCharAt;
        int i10 = 1;
        int[] iArr = this.c;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f5770b;
        sb2.setLength(0);
        int i11 = aVar.f2588b;
        int iE = aVar.e(0);
        int length = iArr.length;
        boolean z4 = false;
        int i12 = 0;
        int i13 = iE;
        while (iE < i11) {
            if (aVar.d(iE) != z4) {
                iArr[i12] = iArr[i12] + i10;
                i4 = i10;
            } else {
                if (i12 == length - 1) {
                    int i14 = 148;
                    if (g(iArr) == 148 && aVar.h(Math.max(0, i13 - ((iE - i13) / 2)), i13)) {
                        int iE2 = aVar.e(new int[]{i13, iE}[i10]);
                        int i15 = aVar.f2588b;
                        while (true) {
                            k.e(iE2, aVar, iArr);
                            int iG = g(iArr);
                            if (iG < 0) {
                                throw NotFoundException.c;
                            }
                            int i16 = 0;
                            while (true) {
                                if (i16 < 43) {
                                    i6 = i10;
                                    if (f5768d[i16] == iG) {
                                        cCharAt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i16);
                                        break;
                                    }
                                    i16++;
                                    i10 = i6;
                                } else {
                                    i6 = i10;
                                    if (iG != i14) {
                                        throw NotFoundException.c;
                                    }
                                    cCharAt = '*';
                                }
                            }
                            sb2.append(cCharAt);
                            int i17 = iE2;
                            for (int i18 : iArr) {
                                i17 += i18;
                            }
                            int iE3 = aVar.e(i17);
                            if (cCharAt == '*') {
                                sb2.setLength(sb2.length() - 1);
                                int i19 = 0;
                                for (int i20 : iArr) {
                                    i19 += i20;
                                }
                                int i21 = (iE3 - iE2) - i19;
                                if (iE3 != i15 && (i21 << 1) < i19) {
                                    throw NotFoundException.c;
                                }
                                if (this.f5769a) {
                                    int length2 = sb2.length() - 1;
                                    int iIndexOf = 0;
                                    for (int i22 = 0; i22 < length2; i22++) {
                                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb2.charAt(i22));
                                    }
                                    if (sb2.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                                        throw ChecksumException.a();
                                    }
                                    sb2.setLength(length2);
                                }
                                if (sb2.length() == 0) {
                                    throw NotFoundException.c;
                                }
                                String string = sb2.toString();
                                float f = (r7[i6] + r7[0]) / 2.0f;
                                float f3 = (i19 / 2.0f) + iE2;
                                float f7 = i;
                                C3.l lVar = new C3.l(f, f7);
                                C3.l lVar2 = new C3.l(f3, f7);
                                C3.l[] lVarArr = new C3.l[2];
                                lVarArr[0] = lVar;
                                lVarArr[i6] = lVar2;
                                return new C3.j(string, null, lVarArr, C3.a.c);
                            }
                            i10 = i6;
                            iE2 = iE3;
                            i14 = 148;
                        }
                    } else {
                        i4 = i10;
                        i13 += iArr[0] + iArr[i4];
                        int i23 = i12 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i23);
                        iArr[i23] = 0;
                        iArr[i12] = 0;
                        i12--;
                    }
                } else {
                    i4 = i10;
                    i12++;
                }
                iArr[i12] = i4;
                z4 = !z4;
            }
            iE++;
            i10 = i4;
        }
        throw NotFoundException.c;
    }
}
