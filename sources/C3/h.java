package C3;

import We.s;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends e {
    public final byte[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f718d;
    public final int e;

    public h(int i, int i4, int[] iArr) {
        super(i, i4);
        this.f718d = i;
        this.e = i4;
        int i6 = i * i4;
        this.c = new byte[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = iArr[i10];
            this.c[i10] = (byte) (((((i11 >> 16) & 255) + ((i11 >> 7) & TypedValues.PositionType.TYPE_POSITION_TYPE)) + (i11 & 255)) / 4);
        }
    }

    @Override // C3.e
    public final byte[] a() {
        int i = this.f718d;
        byte[] bArr = this.c;
        int i4 = this.f712a;
        int i6 = this.f713b;
        if (i4 == i && i6 == this.e) {
            return bArr;
        }
        int i10 = i4 * i6;
        byte[] bArr2 = new byte[i10];
        if (i4 == i) {
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            return bArr2;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i6; i12++) {
            System.arraycopy(bArr, i11, bArr2, i12 * i4, i4);
            i11 += i;
        }
        return bArr2;
    }

    @Override // C3.e
    public final byte[] b(int i, byte[] bArr) {
        if (i < 0 || i >= this.f713b) {
            throw new IllegalArgumentException(s.f(i, "Requested row is outside the image: "));
        }
        int i4 = this.f712a;
        if (bArr == null || bArr.length < i4) {
            bArr = new byte[i4];
        }
        System.arraycopy(this.c, i * this.f718d, bArr, 0, i4);
        return bArr;
    }
}
