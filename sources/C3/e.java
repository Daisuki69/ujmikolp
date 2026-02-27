package C3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f713b;

    public e(int i, int i4) {
        this.f712a = i;
        this.f713b = i4;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i, byte[] bArr);

    public boolean c() {
        return false;
    }

    public e d() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f712a;
        byte[] bArrB = new byte[i];
        int i4 = this.f713b;
        StringBuilder sb2 = new StringBuilder((i + 1) * i4);
        for (int i6 = 0; i6 < i4; i6++) {
            bArrB = b(i6, bArrB);
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = bArrB[i10] & 255;
                sb2.append(i11 < 64 ? '#' : i11 < 128 ? '+' : i11 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
