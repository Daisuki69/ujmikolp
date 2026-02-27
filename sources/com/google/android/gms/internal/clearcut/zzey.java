package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzey {
    private static final zzey zzoz = new zzey(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzfa;
    private int zzjq;
    private Object[] zzmj;
    private int[] zzpa;

    private zzey() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzey zza(zzey zzeyVar, zzey zzeyVar2) {
        int i = zzeyVar.count + zzeyVar2.count;
        int[] iArrCopyOf = Arrays.copyOf(zzeyVar.zzpa, i);
        System.arraycopy(zzeyVar2.zzpa, 0, iArrCopyOf, zzeyVar.count, zzeyVar2.count);
        Object[] objArrCopyOf = Arrays.copyOf(zzeyVar.zzmj, i);
        System.arraycopy(zzeyVar2.zzmj, 0, objArrCopyOf, zzeyVar.count, zzeyVar2.count);
        return new zzey(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzey zzea() {
        return zzoz;
    }

    public static zzey zzeb() {
        return new zzey();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzey)) {
            return false;
        }
        zzey zzeyVar = (zzey) obj;
        int i = this.count;
        if (i == zzeyVar.count) {
            int[] iArr = this.zzpa;
            int[] iArr2 = zzeyVar.zzpa;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.zzmj;
                    Object[] objArr2 = zzeyVar.zzmj;
                    int i6 = this.count;
                    for (int i10 = 0; i10 < i6; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i4 = (i + 527) * 31;
        int[] iArr = this.zzpa;
        int iHashCode = 17;
        int i6 = 17;
        for (int i10 = 0; i10 < i; i10++) {
            i6 = (i6 * 31) + iArr[i10];
        }
        int i11 = (i4 + i6) * 31;
        Object[] objArr = this.zzmj;
        int i12 = this.count;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    public final int zzas() {
        int iZze;
        int i = this.zzjq;
        if (i != -1) {
            return i;
        }
        int iZzas = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            int i6 = this.zzpa[i4];
            int i10 = i6 >>> 3;
            int i11 = i6 & 7;
            if (i11 == 0) {
                iZze = zzbn.zze(i10, ((Long) this.zzmj[i4]).longValue());
            } else if (i11 == 1) {
                iZze = zzbn.zzg(i10, ((Long) this.zzmj[i4]).longValue());
            } else if (i11 == 2) {
                iZze = zzbn.zzc(i10, (zzbb) this.zzmj[i4]);
            } else if (i11 == 3) {
                iZzas = ((zzey) this.zzmj[i4]).zzas() + (zzbn.zzr(i10) << 1) + iZzas;
            } else {
                if (i11 != 5) {
                    throw new IllegalStateException(zzco.zzbn());
                }
                iZze = zzbn.zzj(i10, ((Integer) this.zzmj[i4]).intValue());
            }
            iZzas = iZze + iZzas;
        }
        this.zzjq = iZzas;
        return iZzas;
    }

    public final void zzb(int i, Object obj) {
        if (!this.zzfa) {
            throw new UnsupportedOperationException();
        }
        int i4 = this.count;
        int[] iArr = this.zzpa;
        if (i4 == iArr.length) {
            int i6 = i4 + (i4 < 4 ? 8 : i4 >> 1);
            this.zzpa = Arrays.copyOf(iArr, i6);
            this.zzmj = Arrays.copyOf(this.zzmj, i6);
        }
        int[] iArr2 = this.zzpa;
        int i10 = this.count;
        iArr2[i10] = i;
        this.zzmj[i10] = obj;
        this.count = i10 + 1;
    }

    public final int zzec() {
        int i = this.zzjq;
        if (i != -1) {
            return i;
        }
        int iZzd = 0;
        for (int i4 = 0; i4 < this.count; i4++) {
            iZzd += zzbn.zzd(this.zzpa[i4] >>> 3, (zzbb) this.zzmj[i4]);
        }
        this.zzjq = iZzd;
        return iZzd;
    }

    public final void zzv() {
        this.zzfa = false;
    }

    private zzey(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zzjq = -1;
        this.count = i;
        this.zzpa = iArr;
        this.zzmj = objArr;
        this.zzfa = z4;
    }

    private static void zzb(int i, Object obj, zzfr zzfrVar) throws IOException {
        int i4 = i >>> 3;
        int i6 = i & 7;
        if (i6 == 0) {
            zzfrVar.zzi(i4, ((Long) obj).longValue());
            return;
        }
        if (i6 == 1) {
            zzfrVar.zzc(i4, ((Long) obj).longValue());
            return;
        }
        if (i6 == 2) {
            zzfrVar.zza(i4, (zzbb) obj);
            return;
        }
        if (i6 != 3) {
            if (i6 != 5) {
                throw new RuntimeException(zzco.zzbn());
            }
            zzfrVar.zzf(i4, ((Integer) obj).intValue());
        } else if (zzfrVar.zzaj() == zzcg.zzg.zzko) {
            zzfrVar.zzaa(i4);
            ((zzey) obj).zzb(zzfrVar);
            zzfrVar.zzab(i4);
        } else {
            zzfrVar.zzab(i4);
            ((zzey) obj).zzb(zzfrVar);
            zzfrVar.zzaa(i4);
        }
    }

    public final void zza(zzfr zzfrVar) throws IOException {
        if (zzfrVar.zzaj() == zzcg.zzg.zzkp) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzfrVar.zza(this.zzpa[i] >>> 3, this.zzmj[i]);
            }
            return;
        }
        for (int i4 = 0; i4 < this.count; i4++) {
            zzfrVar.zza(this.zzpa[i4] >>> 3, this.zzmj[i4]);
        }
    }

    public final void zza(StringBuilder sb2, int i) {
        for (int i4 = 0; i4 < this.count; i4++) {
            zzdr.zza(sb2, i, String.valueOf(this.zzpa[i4] >>> 3), this.zzmj[i4]);
        }
    }

    public final void zzb(zzfr zzfrVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzfrVar.zzaj() == zzcg.zzg.zzko) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzpa[i], this.zzmj[i], zzfrVar);
            }
            return;
        }
        for (int i4 = this.count - 1; i4 >= 0; i4--) {
            zzb(this.zzpa[i4], this.zzmj[i4], zzfrVar);
        }
    }
}
