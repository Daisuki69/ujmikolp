package Qh;

import fh.InterfaceC1486b;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5389a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5390b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5391d;
    public Object[] e;

    public /* synthetic */ h() {
    }

    public void a(InterfaceC1486b interfaceC1486b) {
        Object obj;
        Object obj2;
        Object[] objArr = this.e;
        int i = this.f5390b;
        int iHashCode = interfaceC1486b.hashCode() * (-1640531527);
        int i4 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i4];
        if (obj3 != null) {
            if (obj3.equals(interfaceC1486b)) {
                return;
            }
            do {
                i4 = (i4 + 1) & i;
                obj2 = objArr[i4];
                if (obj2 == null) {
                }
            } while (!obj2.equals(interfaceC1486b));
            return;
        }
        objArr[i4] = interfaceC1486b;
        int i6 = this.c + 1;
        this.c = i6;
        if (i6 < this.f5391d) {
            return;
        }
        Object[] objArr2 = this.e;
        int length = objArr2.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        Object[] objArr3 = new Object[i10];
        while (true) {
            int i12 = i6 - 1;
            if (i6 == 0) {
                this.f5390b = i11;
                this.f5391d = (int) (i10 * 0.75f);
                this.e = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i13 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i11;
            if (objArr3[i13] != null) {
                do {
                    i13 = (i13 + 1) & i11;
                } while (objArr3[i13] != null);
            }
            objArr3[i13] = objArr2[length];
            i6 = i12;
        }
    }

    public void b(io.reactivex.rxjava3.disposables.b bVar) {
        Object obj;
        Object obj2;
        Object[] objArr = this.e;
        int i = this.f5390b;
        int iHashCode = bVar.hashCode() * (-1640531527);
        int i4 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i4];
        if (obj3 != null) {
            if (obj3.equals(bVar)) {
                return;
            }
            do {
                i4 = (i4 + 1) & i;
                obj2 = objArr[i4];
                if (obj2 == null) {
                }
            } while (!obj2.equals(bVar));
            return;
        }
        objArr[i4] = bVar;
        int i6 = this.c + 1;
        this.c = i6;
        if (i6 < this.f5391d) {
            return;
        }
        Object[] objArr2 = this.e;
        int length = objArr2.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        Object[] objArr3 = new Object[i10];
        while (true) {
            int i12 = i6 - 1;
            if (i6 == 0) {
                this.f5390b = i11;
                this.f5391d = (int) (i10 * 0.75f);
                this.e = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i13 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i11;
            if (objArr3[i13] != null) {
                do {
                    i13 = (i13 + 1) & i11;
                } while (objArr3[i13] != null);
            }
            objArr3[i13] = objArr2[length];
            i6 = i12;
        }
    }

    public final void c(int i, int i4, Object[] objArr) {
        int i6;
        Object obj;
        Object obj2;
        switch (this.f5389a) {
            case 0:
                this.c--;
                while (true) {
                    int i10 = i + 1;
                    while (true) {
                        i6 = i10 & i4;
                        obj = objArr[i6];
                        if (obj == null) {
                            objArr[i] = null;
                        } else {
                            int iHashCode = obj.hashCode() * (-1640531527);
                            int i11 = (iHashCode ^ (iHashCode >>> 16)) & i4;
                            if (i <= i6) {
                                if (i < i11 && i11 <= i6) {
                                    i10 = i6 + 1;
                                }
                            } else if (i < i11 || i11 <= i6) {
                                i10 = i6 + 1;
                            }
                        }
                        break;
                    }
                    objArr[i] = obj;
                    i = i6;
                }
                break;
            default:
                this.c--;
                while (true) {
                    int i12 = i;
                    int i13 = i12 + 1;
                    while (true) {
                        i = i13 & i4;
                        obj2 = objArr[i];
                        if (obj2 == null) {
                            objArr[i12] = null;
                        } else {
                            int iHashCode2 = obj2.hashCode() * (-1640531527);
                            int i14 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i4;
                            if (i12 <= i) {
                                if (i12 < i14 && i14 <= i) {
                                    i13 = i + 1;
                                }
                            } else if (i12 < i14 || i14 <= i) {
                                i13 = i + 1;
                            }
                        }
                        break;
                    }
                    objArr[i12] = obj2;
                }
                break;
        }
    }

    public h(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        this.f5390b = iNumberOfLeadingZeros - 1;
        this.f5391d = (int) (0.75f * iNumberOfLeadingZeros);
        this.e = new Object[iNumberOfLeadingZeros];
    }
}
