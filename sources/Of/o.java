package of;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18836b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18837d;
    public final boolean e;
    public o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f18838g;

    public o() {
        this.f18835a = new byte[8192];
        this.e = true;
        this.f18837d = false;
    }

    public final o a() {
        o oVar = this.f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f18838g;
        oVar3.f = oVar;
        this.f.f18838g = oVar3;
        this.f = null;
        this.f18838g = null;
        return oVar2;
    }

    public final void b(o oVar) {
        oVar.f18838g = this;
        oVar.f = this.f;
        this.f.f18838g = oVar;
        this.f = oVar;
    }

    public final void c(o oVar, int i) {
        if (!oVar.e) {
            throw new IllegalArgumentException();
        }
        int i4 = oVar.c;
        int i6 = i4 + i;
        byte[] bArr = oVar.f18835a;
        if (i6 > 8192) {
            if (oVar.f18837d) {
                throw new IllegalArgumentException();
            }
            int i10 = oVar.f18836b;
            if (i6 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i10, bArr, 0, i4 - i10);
            oVar.c -= oVar.f18836b;
            oVar.f18836b = 0;
        }
        System.arraycopy(this.f18835a, this.f18836b, bArr, oVar.c, i);
        oVar.c += i;
        this.f18836b += i;
    }

    public final o d() {
        this.f18837d = true;
        return new o(this.f18835a, this.f18836b, this.c);
    }

    public o(byte[] bArr, int i, int i4) {
        this.f18835a = bArr;
        this.f18836b = i;
        this.c = i4;
        this.f18837d = true;
        this.e = false;
    }
}
