package ph;

import ih.EnumC1605c;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.p[] f19279b;
    public final Iterable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hh.n f19280d;
    public final int e;
    public final boolean f;

    public /* synthetic */ N(ch.p[] pVarArr, Iterable iterable, hh.n nVar, int i, boolean z4, int i4) {
        this.f19278a = i4;
        this.f19279b = pVarArr;
        this.c = iterable;
        this.f19280d = nVar;
        this.e = i;
        this.f = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        int length;
        int length2;
        switch (this.f19278a) {
            case 0:
                ch.p[] pVarArr = this.f19279b;
                if (pVarArr == null) {
                    pVarArr = new ch.p[8];
                    length = 0;
                    for (ch.p pVar : this.c) {
                        if (length == pVarArr.length) {
                            ch.p[] pVarArr2 = new ch.p[(length >> 2) + length];
                            System.arraycopy(pVarArr, 0, pVarArr2, 0, length);
                            pVarArr = pVarArr2;
                        }
                        pVarArr[length] = pVar;
                        length++;
                    }
                } else {
                    length = pVarArr.length;
                }
                if (length == 0) {
                    EnumC1605c.a(rVar);
                } else {
                    M m = new M(length, this.e, rVar, this.f19280d, this.f);
                    L[] lArr = m.c;
                    int length3 = lArr.length;
                    m.f19264a.onSubscribe(m);
                    for (int i = 0; i < length3 && !m.h && !m.f19267g; i++) {
                        pVarArr[i].subscribe(lArr[i]);
                    }
                }
                break;
            default:
                ch.p[] pVarArr3 = this.f19279b;
                if (pVarArr3 == null) {
                    pVarArr3 = new ch.p[8];
                    length2 = 0;
                    for (ch.p pVar2 : this.c) {
                        if (length2 == pVarArr3.length) {
                            ch.p[] pVarArr4 = new ch.p[(length2 >> 2) + length2];
                            System.arraycopy(pVarArr3, 0, pVarArr4, 0, length2);
                            pVarArr3 = pVarArr4;
                        }
                        pVarArr3[length2] = pVar2;
                        length2++;
                    }
                } else {
                    length2 = pVarArr3.length;
                }
                if (length2 == 0) {
                    EnumC1605c.a(rVar);
                } else {
                    q3 q3Var = new q3(length2, rVar, this.f19280d, this.f);
                    int i4 = this.e;
                    r3[] r3VarArr = q3Var.c;
                    int length4 = r3VarArr.length;
                    for (int i6 = 0; i6 < length4; i6++) {
                        r3VarArr[i6] = new r3(q3Var, i4);
                    }
                    q3Var.lazySet(0);
                    q3Var.f19608a.onSubscribe(q3Var);
                    for (int i10 = 0; i10 < length4 && !q3Var.f; i10++) {
                        pVarArr3[i10].subscribe(r3VarArr[i10]);
                    }
                }
                break;
        }
    }
}
