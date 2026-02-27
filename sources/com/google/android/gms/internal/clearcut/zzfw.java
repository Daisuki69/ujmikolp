package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfw implements Cloneable {
    private static final zzfx zzrl = new zzfx();
    private int mSize;
    private boolean zzrm;
    private int[] zzrn;
    private zzfx[] zzro;

    public zzfw() {
        this(10);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.mSize;
        zzfw zzfwVar = new zzfw(i);
        System.arraycopy(this.zzrn, 0, zzfwVar.zzrn, 0, i);
        for (int i4 = 0; i4 < i; i4++) {
            zzfx zzfxVar = this.zzro[i4];
            if (zzfxVar != null) {
                zzfwVar.zzro[i4] = (zzfx) zzfxVar.clone();
            }
        }
        zzfwVar.mSize = i;
        return zzfwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfw)) {
            return false;
        }
        zzfw zzfwVar = (zzfw) obj;
        int i = this.mSize;
        if (i != zzfwVar.mSize) {
            return false;
        }
        int[] iArr = this.zzrn;
        int[] iArr2 = zzfwVar.zzrn;
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                zzfx[] zzfxVarArr = this.zzro;
                zzfx[] zzfxVarArr2 = zzfwVar.zzro;
                int i6 = this.mSize;
                for (int i10 = 0; i10 < i6; i10++) {
                    if (zzfxVarArr[i10].equals(zzfxVarArr2[i10])) {
                    }
                }
                return true;
            }
            if (iArr[i4] != iArr2[i4]) {
                break;
            }
            i4++;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i = 0; i < this.mSize; i++) {
            iHashCode = (((iHashCode * 31) + this.zzrn[i]) * 31) + this.zzro[i].hashCode();
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    public final int size() {
        return this.mSize;
    }

    public final zzfx zzaq(int i) {
        return this.zzro[i];
    }

    private zzfw(int i) {
        this.zzrm = false;
        int i4 = i << 2;
        int i6 = 4;
        while (true) {
            if (i6 >= 32) {
                break;
            }
            int i10 = (1 << i6) - 12;
            if (i4 <= i10) {
                i4 = i10;
                break;
            }
            i6++;
        }
        int i11 = i4 / 4;
        this.zzrn = new int[i11];
        this.zzro = new zzfx[i11];
        this.mSize = 0;
    }
}
