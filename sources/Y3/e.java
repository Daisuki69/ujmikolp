package Y3;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Y.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6746d;

    public e(c cVar, boolean z4) {
        super(cVar);
        this.f6746d = z4;
    }

    public final a A() {
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        a[] aVarArr = (a[]) this.c;
        for (a aVar : aVarArr) {
            if (aVar != null) {
                aVar.b();
                int i = aVar.e % 30;
                int i4 = aVar.f;
                if (!this.f6746d) {
                    i4 += 2;
                }
                int i6 = i4 % 3;
                if (i6 == 0) {
                    bVar2.b((i * 3) + 1);
                } else if (i6 == 1) {
                    bVar4.b(i / 3);
                    bVar3.b(i % 3);
                } else if (i6 == 2) {
                    bVar.b(i + 1);
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar2 = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0], 0);
        B(aVarArr, aVar2);
        return aVar2;
    }

    public final void B(a[] aVarArr, a aVar) {
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar2 = aVarArr[i];
            if (aVar2 != null) {
                int i4 = aVar2.e % 30;
                int i6 = aVar2.f;
                if (i6 > aVar.f) {
                    aVarArr[i] = null;
                } else {
                    if (!this.f6746d) {
                        i6 += 2;
                    }
                    int i10 = i6 % 3;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2 && i4 + 1 != aVar.f6737b) {
                                aVarArr[i] = null;
                            }
                        } else if (i4 / 3 != aVar.c || i4 % 3 != aVar.e) {
                            aVarArr[i] = null;
                        }
                    } else if ((i4 * 3) + 1 != aVar.f6738d) {
                        aVarArr[i] = null;
                    }
                }
            }
        }
    }

    @Override // Y.e
    public final String toString() {
        return "IsLeft: " + this.f6746d + '\n' + super.toString();
    }
}
