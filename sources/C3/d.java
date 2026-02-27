package C3;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {
    public final e c;

    public d(e eVar) {
        super(eVar.f712a, eVar.f713b);
        this.c = eVar;
    }

    @Override // C3.e
    public final byte[] a() {
        byte[] bArrA = this.c.a();
        int i = this.f712a * this.f713b;
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = (byte) (255 - (bArrA[i4] & 255));
        }
        return bArr;
    }

    @Override // C3.e
    public final byte[] b(int i, byte[] bArr) {
        byte[] bArrB = this.c.b(i, bArr);
        for (int i4 = 0; i4 < this.f712a; i4++) {
            bArrB[i4] = (byte) (255 - (bArrB[i4] & 255));
        }
        return bArrB;
    }

    @Override // C3.e
    public final boolean c() {
        return this.c.c();
    }

    @Override // C3.e
    public final e d() {
        return new d(this.c.d());
    }
}
