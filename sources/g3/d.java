package G3;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {
    public final short c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f1707d;

    public d(f fVar, int i, int i4) {
        super(fVar);
        this.c = (short) i;
        this.f1707d = (short) i4;
    }

    @Override // G3.f
    public final void a(K3.a aVar, byte[] bArr) {
        aVar.b(this.c, this.f1707d);
    }

    public final String toString() {
        short s9 = this.f1707d;
        return "<" + Integer.toBinaryString((1 << s9) | (((1 << s9) - 1) & this.c) | (1 << s9)).substring(1) + '>';
    }
}
