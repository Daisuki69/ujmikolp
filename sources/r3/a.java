package R3;

import A7.f;
import C3.b;
import C3.i;
import C3.j;
import C3.k;
import C3.l;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.text.DecimalFormat;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l[] f5450b = new l[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Qd.a f5451a = new Qd.a(1);

    @Override // C3.i
    public final j a(f fVar, EnumMap enumMap) throws NotFoundException, ChecksumException, FormatException {
        byte[] bArr;
        byte[] bArr2;
        String strValueOf;
        int i;
        int i4 = 5;
        if (enumMap == null || !enumMap.containsKey(b.PURE_BARCODE)) {
            throw NotFoundException.c;
        }
        K3.b bVarE = fVar.e();
        int i6 = bVarE.f2589a;
        int i10 = bVarE.f2590b;
        int i11 = i10;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = bVarE.c;
                if (i15 < i16) {
                    int i17 = bVarE.f2591d[(i16 * i14) + i15];
                    if (i17 != 0) {
                        if (i14 < i11) {
                            i11 = i14;
                        }
                        if (i14 > i13) {
                            i13 = i14;
                        }
                        int i18 = i15 << 5;
                        if (i18 < i6) {
                            int i19 = 0;
                            while ((i17 << (31 - i19)) == 0) {
                                i19++;
                            }
                            i = i4;
                            int i20 = i18 + i19;
                            if (i20 < i6) {
                                i6 = i20;
                            }
                        } else {
                            i = i4;
                        }
                        if (i18 + 31 > i12) {
                            int i21 = 31;
                            while ((i17 >>> i21) == 0) {
                                i21--;
                            }
                            int i22 = i18 + i21;
                            if (i22 > i12) {
                                i12 = i22;
                            }
                        }
                    } else {
                        i = i4;
                    }
                    i15++;
                    i4 = i;
                }
            }
        }
        int i23 = i4;
        int[] iArr = (i12 < i6 || i13 < i11) ? null : new int[]{i6, i11, (i12 - i6) + 1, (i13 - i11) + 1};
        if (iArr == null) {
            throw NotFoundException.c;
        }
        int i24 = iArr[0];
        int i25 = iArr[1];
        int i26 = iArr[2];
        int i27 = iArr[3];
        int[] iArr2 = new int[33];
        for (int i28 = 0; i28 < 33; i28++) {
            int i29 = (((i27 / 2) + (i28 * i27)) / 33) + i25;
            for (int i30 = 0; i30 < 30; i30++) {
                if (bVarE.b((((((i28 & 1) * i26) / 2) + ((i26 / 2) + (i30 * i26))) / 30) + i24, i29)) {
                    int i31 = (i30 / 32) + i28;
                    iArr2[i31] = iArr2[i31] | (1 << (i30 & 31));
                }
            }
        }
        Qd.a aVar = this.f5451a;
        aVar.getClass();
        byte[] bArr3 = new byte[144];
        for (int i32 = 0; i32 < 33; i32++) {
            int[] iArr3 = S3.a.f5659a[i32];
            for (int i33 = 0; i33 < 30; i33++) {
                int i34 = iArr3[i33];
                if (i34 >= 0 && ((iArr2[(i33 / 32) + i32] >>> (i33 & 31)) & 1) != 0) {
                    int i35 = i34 / 6;
                    bArr3[i35] = (byte) (((byte) (1 << (5 - (i34 % 6)))) | bArr3[i35]);
                }
            }
        }
        aVar.b(bArr3, 0, 10, 10, 0);
        int i36 = bArr3[0] & 15;
        if (i36 == 2 || i36 == 3 || i36 == 4) {
            aVar.b(bArr3, 20, 84, 40, 1);
            aVar.b(bArr3, 20, 84, 40, 2);
            bArr = bArr3;
            bArr2 = new byte[94];
        } else {
            if (i36 != i23) {
                throw FormatException.a();
            }
            aVar.b(bArr3, 20, 68, 56, 1);
            aVar.b(bArr3, 20, 68, 56, 2);
            bArr2 = new byte[78];
            bArr = bArr3;
        }
        System.arraycopy(bArr, 0, bArr2, 0, 10);
        System.arraycopy(bArr, 20, bArr2, 10, bArr2.length - 10);
        StringBuilder sb2 = new StringBuilder(144);
        if (i36 == 2 || i36 == 3) {
            if (i36 == 2) {
                strValueOf = new DecimalFormat("0000000000".substring(0, S3.a.a(bArr2, new byte[]{39, 40, 41, 42, 31, 32}))).format(S3.a.a(bArr2, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
            } else {
                String[] strArr = S3.a.f5660b;
                strValueOf = String.valueOf(new char[]{strArr[0].charAt(S3.a.a(bArr2, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(S3.a.a(bArr2, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(S3.a.a(bArr2, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(S3.a.a(bArr2, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(S3.a.a(bArr2, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(S3.a.a(bArr2, new byte[]{9, 10, 11, 12, 1, 2}))});
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(S3.a.a(bArr2, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
            String str2 = decimalFormat.format(S3.a.a(bArr2, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
            sb2.append(S3.a.b(10, 84, bArr2));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            } else {
                sb2.insert(0, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            }
        } else if (i36 == 4) {
            sb2.append(S3.a.b(1, 93, bArr2));
        } else if (i36 == 5) {
            sb2.append(S3.a.b(1, 77, bArr2));
        }
        String string = sb2.toString();
        String strValueOf2 = String.valueOf(i36);
        j jVar = new j(string, bArr2, f5450b, C3.a.j);
        if (strValueOf2 != null) {
            jVar.a(k.c, strValueOf2);
        }
        return jVar;
    }

    @Override // C3.i
    public final void reset() {
    }
}
