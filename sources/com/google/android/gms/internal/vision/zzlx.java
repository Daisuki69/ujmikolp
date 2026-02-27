package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlx {
    private static final zzlx zza = new zzlx(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzlx() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzlx zza() {
        return zza;
    }

    public static zzlx zzb() {
        return new zzlx();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzlx)) {
            return false;
        }
        zzlx zzlxVar = (zzlx) obj;
        int i = this.zzb;
        if (i == zzlxVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzlxVar.zzc;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzlxVar.zzd;
                    int i6 = this.zzb;
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
        int i = this.zzb;
        int i4 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i6 = 17;
        for (int i10 = 0; i10 < i; i10++) {
            i6 = (i6 * 31) + iArr[i10];
        }
        int i11 = (i4 + i6) * 31;
        Object[] objArr = this.zzd;
        int i12 = this.zzb;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    public final void zzc() {
        this.zzf = false;
    }

    public final int zzd() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzd = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            iZzd += zzii.zzd(this.zzc[i4] >>> 3, (zzht) this.zzd[i4]);
        }
        this.zze = iZzd;
        return iZzd;
    }

    public final int zze() {
        int iZze;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZze2 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i6 = this.zzc[i4];
            int i10 = i6 >>> 3;
            int i11 = i6 & 7;
            if (i11 == 0) {
                iZze = zzii.zze(i10, ((Long) this.zzd[i4]).longValue());
            } else if (i11 == 1) {
                iZze = zzii.zzg(i10, ((Long) this.zzd[i4]).longValue());
            } else if (i11 == 2) {
                iZze = zzii.zzc(i10, (zzht) this.zzd[i4]);
            } else if (i11 == 3) {
                iZze2 = ((zzlx) this.zzd[i4]).zze() + (zzii.zze(i10) << 1) + iZze2;
            } else {
                if (i11 != 5) {
                    throw new IllegalStateException(zzjk.zzf());
                }
                iZze = zzii.zzi(i10, ((Integer) this.zzd[i4]).intValue());
            }
            iZze2 = iZze + iZze2;
        }
        this.zze = iZze2;
        return iZze2;
    }

    private zzlx(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzlx zza(zzlx zzlxVar, zzlx zzlxVar2) {
        int i = zzlxVar.zzb + zzlxVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzlxVar.zzc, i);
        System.arraycopy(zzlxVar2.zzc, 0, iArrCopyOf, zzlxVar.zzb, zzlxVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzlxVar.zzd, i);
        System.arraycopy(zzlxVar2.zzd, 0, objArrCopyOf, zzlxVar.zzb, zzlxVar2.zzb);
        return new zzlx(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final void zzb(zzmr zzmrVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzmrVar.zza() == zzmq.zza) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zzmrVar);
            }
            return;
        }
        for (int i4 = this.zzb - 1; i4 >= 0; i4--) {
            zza(this.zzc[i4], this.zzd[i4], zzmrVar);
        }
    }

    public final void zza(zzmr zzmrVar) throws IOException {
        if (zzmrVar.zza() == zzmq.zzb) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzmrVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzmrVar.zza(this.zzc[i4] >>> 3, this.zzd[i4]);
        }
    }

    private static void zza(int i, Object obj, zzmr zzmrVar) throws IOException {
        int i4 = i >>> 3;
        int i6 = i & 7;
        if (i6 == 0) {
            zzmrVar.zza(i4, ((Long) obj).longValue());
            return;
        }
        if (i6 == 1) {
            zzmrVar.zzd(i4, ((Long) obj).longValue());
            return;
        }
        if (i6 == 2) {
            zzmrVar.zza(i4, (zzht) obj);
            return;
        }
        if (i6 != 3) {
            if (i6 == 5) {
                zzmrVar.zzd(i4, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzjk.zzf());
        }
        if (zzmrVar.zza() == zzmq.zza) {
            zzmrVar.zza(i4);
            ((zzlx) obj).zzb(zzmrVar);
            zzmrVar.zzb(i4);
        } else {
            zzmrVar.zzb(i4);
            ((zzlx) obj).zzb(zzmrVar);
            zzmrVar.zza(i4);
        }
    }

    public final void zza(StringBuilder sb2, int i) {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzkp.zza(sb2, i, String.valueOf(this.zzc[i4] >>> 3), this.zzd[i4]);
        }
    }

    public final void zza(int i, Object obj) {
        if (this.zzf) {
            int i4 = this.zzb;
            int[] iArr = this.zzc;
            if (i4 == iArr.length) {
                int i6 = i4 + (i4 < 4 ? 8 : i4 >> 1);
                this.zzc = Arrays.copyOf(iArr, i6);
                this.zzd = Arrays.copyOf(this.zzd, i6);
            }
            int[] iArr2 = this.zzc;
            int i10 = this.zzb;
            iArr2[i10] = i;
            this.zzd[i10] = obj;
            this.zzb = i10 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
