package G3;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {
    public final short c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f1702d;

    public a(f fVar, int i, int i4) {
        super(fVar);
        this.c = (short) i;
        this.f1702d = (short) i4;
    }

    @Override // G3.f
    public final void a(K3.a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s9 = this.f1702d;
            if (i >= s9) {
                return;
            }
            if (i == 0 || (i == 31 && s9 <= 62)) {
                aVar.b(31, 5);
                if (s9 > 62) {
                    aVar.b(s9 - 31, 16);
                } else if (i == 0) {
                    aVar.b(Math.min((int) s9, 31), 5);
                } else {
                    aVar.b(s9 - 31, 5);
                }
            }
            aVar.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.c);
        sb2.append("::");
        sb2.append((r1 + this.f1702d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
