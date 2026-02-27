package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgy extends zzfu<zzgy> implements Cloneable {
    private String[] zzbiw;
    private String[] zzbix;
    private int[] zzbiy;
    private long[] zzbiz;
    private long[] zzbja;

    public zzgy() {
        String[] strArr = zzgb.zzsc;
        this.zzbiw = strArr;
        this.zzbix = strArr;
        this.zzbiy = zzgb.zzrx;
        long[] jArr = zzgb.zzry;
        this.zzbiz = jArr;
        this.zzbja = jArr;
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzgb, reason: merged with bridge method [inline-methods] */
    public final zzgy clone() {
        try {
            zzgy zzgyVar = (zzgy) super.clone();
            String[] strArr = this.zzbiw;
            if (strArr != null && strArr.length > 0) {
                zzgyVar.zzbiw = (String[]) strArr.clone();
            }
            String[] strArr2 = this.zzbix;
            if (strArr2 != null && strArr2.length > 0) {
                zzgyVar.zzbix = (String[]) strArr2.clone();
            }
            int[] iArr = this.zzbiy;
            if (iArr != null && iArr.length > 0) {
                zzgyVar.zzbiy = (int[]) iArr.clone();
            }
            long[] jArr = this.zzbiz;
            if (jArr != null && jArr.length > 0) {
                zzgyVar.zzbiz = (long[]) jArr.clone();
            }
            long[] jArr2 = this.zzbja;
            if (jArr2 != null && jArr2.length > 0) {
                zzgyVar.zzbja = (long[]) jArr2.clone();
            }
            return zzgyVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgy)) {
            return false;
        }
        zzgy zzgyVar = (zzgy) obj;
        if (!zzfy.equals(this.zzbiw, zzgyVar.zzbiw) || !zzfy.equals(this.zzbix, zzgyVar.zzbix) || !zzfy.equals(this.zzbiy, zzgyVar.zzbiy) || !zzfy.equals(this.zzbiz, zzgyVar.zzbiz) || !zzfy.equals(this.zzbja, zzgyVar.zzbja)) {
            return false;
        }
        zzfw zzfwVar = this.zzrj;
        if (zzfwVar != null && !zzfwVar.isEmpty()) {
            return this.zzrj.equals(zzgyVar.zzrj);
        }
        zzfw zzfwVar2 = zzgyVar.zzrj;
        return zzfwVar2 == null || zzfwVar2.isEmpty();
    }

    public final int hashCode() {
        int iHashCode = (zzfy.hashCode(this.zzbja) + ((zzfy.hashCode(this.zzbiz) + ((zzfy.hashCode(this.zzbiy) + ((((553293455 + zzfy.hashCode(this.zzbiw)) * 31) + zzfy.hashCode(this.zzbix)) * 31)) * 31)) * 31)) * 31;
        zzfw zzfwVar = this.zzrj;
        return iHashCode + ((zzfwVar == null || zzfwVar.isEmpty()) ? 0 : this.zzrj.hashCode());
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(zzfs zzfsVar) throws IOException {
        String[] strArr = this.zzbiw;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.zzbiw;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    zzfsVar.zza(1, str);
                }
                i4++;
            }
        }
        String[] strArr3 = this.zzbix;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.zzbix;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i6];
                if (str2 != null) {
                    zzfsVar.zza(2, str2);
                }
                i6++;
            }
        }
        int[] iArr = this.zzbiy;
        if (iArr != null && iArr.length > 0) {
            int i10 = 0;
            while (true) {
                int[] iArr2 = this.zzbiy;
                if (i10 >= iArr2.length) {
                    break;
                }
                zzfsVar.zzc(3, iArr2[i10]);
                i10++;
            }
        }
        long[] jArr = this.zzbiz;
        if (jArr != null && jArr.length > 0) {
            int i11 = 0;
            while (true) {
                long[] jArr2 = this.zzbiz;
                if (i11 >= jArr2.length) {
                    break;
                }
                zzfsVar.zzi(4, jArr2[i11]);
                i11++;
            }
        }
        long[] jArr3 = this.zzbja;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.zzbja;
                if (i >= jArr4.length) {
                    break;
                }
                zzfsVar.zzi(5, jArr4[i]);
                i++;
            }
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final int zzen() {
        long[] jArr;
        int[] iArr;
        int iZzen = super.zzen();
        String[] strArr = this.zzbiw;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int iZzh = 0;
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.zzbiw;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    i6++;
                    iZzh += zzfs.zzh(str);
                }
                i4++;
            }
            iZzen = iZzen + iZzh + i6;
        }
        String[] strArr3 = this.zzbix;
        if (strArr3 != null && strArr3.length > 0) {
            int i10 = 0;
            int iZzh2 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr4 = this.zzbix;
                if (i10 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i10];
                if (str2 != null) {
                    i11++;
                    iZzh2 += zzfs.zzh(str2);
                }
                i10++;
            }
            iZzen = iZzen + iZzh2 + i11;
        }
        int[] iArr2 = this.zzbiy;
        if (iArr2 != null && iArr2.length > 0) {
            int i12 = 0;
            int iZzs = 0;
            while (true) {
                iArr = this.zzbiy;
                if (i12 >= iArr.length) {
                    break;
                }
                iZzs += zzfs.zzs(iArr[i12]);
                i12++;
            }
            iZzen = iZzen + iZzs + iArr.length;
        }
        long[] jArr2 = this.zzbiz;
        if (jArr2 != null && jArr2.length > 0) {
            int i13 = 0;
            int iZzo = 0;
            while (true) {
                jArr = this.zzbiz;
                if (i13 >= jArr.length) {
                    break;
                }
                iZzo += zzfs.zzo(jArr[i13]);
                i13++;
            }
            iZzen = iZzen + iZzo + jArr.length;
        }
        long[] jArr3 = this.zzbja;
        if (jArr3 == null || jArr3.length <= 0) {
            return iZzen;
        }
        int iZzo2 = 0;
        while (true) {
            long[] jArr4 = this.zzbja;
            if (i >= jArr4.length) {
                return iZzen + iZzo2 + jArr4.length;
            }
            iZzo2 += zzfs.zzo(jArr4[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    /* JADX INFO: renamed from: zzeo */
    public final /* synthetic */ zzfu clone() throws CloneNotSupportedException {
        return (zzgy) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzep */
    public final /* synthetic */ zzfz clone() throws CloneNotSupportedException {
        return (zzgy) clone();
    }
}
