package K3;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final byte[] e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3.e f2599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f2600b = e;
    public final int[] c = new int[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f2601d;

    public e(C3.e eVar) {
        this.f2599a = eVar;
    }

    public static int a(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (i11 > i) {
                i6 = i10;
                i = i11;
            }
            if (i11 > i4) {
                i4 = i11;
            }
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = i14 - i6;
            int i16 = iArr[i14] * i15 * i15;
            if (i16 > i13) {
                i12 = i14;
                i13 = i16;
            }
        }
        if (i6 <= i12) {
            int i17 = i6;
            i6 = i12;
            i12 = i17;
        }
        if (i6 - i12 <= length / 16) {
            throw NotFoundException.c;
        }
        int i18 = i6 - 1;
        int i19 = -1;
        int i20 = i18;
        while (i18 > i12) {
            int i21 = i18 - i12;
            int i22 = (i4 - iArr[i18]) * (i6 - i18) * i21 * i21;
            if (i22 > i19) {
                i20 = i18;
                i19 = i22;
            }
            i18--;
        }
        return i20 << 3;
    }
}
