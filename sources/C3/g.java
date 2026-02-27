package C3;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends e {
    public final byte[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f716d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f717g;

    public g(byte[] bArr, int i, int i4, int i6, int i10, int i11, int i12) {
        super(i11, i12);
        if (i11 + i6 > i || i12 + i10 > i4) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = bArr;
        this.f716d = i;
        this.e = i4;
        this.f = i6;
        this.f717g = i10;
    }

    @Override // C3.e
    public final byte[] a() {
        int i = this.f716d;
        byte[] bArr = this.c;
        int i4 = this.f712a;
        int i6 = this.f713b;
        if (i4 == i && i6 == this.e) {
            return bArr;
        }
        int i10 = i4 * i6;
        byte[] bArr2 = new byte[i10];
        int i11 = (this.f717g * i) + this.f;
        if (i4 == i) {
            System.arraycopy(bArr, i11, bArr2, 0, i10);
            return bArr2;
        }
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
        System.arraycopy(this.c, ((i + this.f717g) * this.f716d) + this.f, bArr, 0, i4);
        return bArr;
    }
}
