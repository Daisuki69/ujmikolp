package com.google.android.gms.internal.mlkit_vision_face_bundled;

import We.s;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzww {
    private static final zzww zza = new zzww(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzww(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzww zzc() {
        return zza;
    }

    public static zzww zze(zzww zzwwVar, zzww zzwwVar2) {
        int i = zzwwVar.zzb + zzwwVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzwwVar.zzc, i);
        System.arraycopy(zzwwVar2.zzc, 0, iArrCopyOf, zzwwVar.zzb, zzwwVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzwwVar.zzd, i);
        System.arraycopy(zzwwVar2.zzd, 0, objArrCopyOf, zzwwVar.zzb, zzwwVar2.zzb);
        return new zzww(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzww zzf() {
        return new zzww(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i4 = this.zzb;
            int i6 = (i4 / 2) + i4;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzww)) {
            return false;
        }
        zzww zzwwVar = (zzww) obj;
        int i = this.zzb;
        if (i == zzwwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzwwVar.zzc;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzwwVar.zzd;
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
        int i4 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i6 = 17;
        for (int i10 = 0; i10 < i; i10++) {
            i6 = (i6 * 31) + iArr[i10];
        }
        int i11 = ((i4 * 31) + i6) * 31;
        Object[] objArr = this.zzd;
        int i12 = this.zzb;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    public final int zza() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzz3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i6 = this.zzc[i4];
            int i10 = i6 >>> 3;
            int i11 = i6 & 7;
            if (i11 != 0) {
                if (i11 == 1) {
                    ((Long) this.zzd[i4]).getClass();
                    iZzz2 = zzuc.zzz(i10 << 3) + 8;
                } else if (i11 == 2) {
                    int i12 = i10 << 3;
                    zztu zztuVar = (zztu) this.zzd[i4];
                    int iZzz4 = zzuc.zzz(i12);
                    int iZzd = zztuVar.zzd();
                    iZzz3 = zzuc.zzz(iZzd) + iZzd + iZzz4 + iZzz3;
                } else if (i11 == 3) {
                    int iZzz5 = zzuc.zzz(i10 << 3);
                    iZzz = iZzz5 + iZzz5;
                    iZzA = ((zzww) this.zzd[i4]).zza();
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(new zzvd("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).getClass();
                    iZzz2 = zzuc.zzz(i10 << 3) + 4;
                }
                iZzz3 = iZzz2 + iZzz3;
            } else {
                int i13 = i10 << 3;
                long jLongValue = ((Long) this.zzd[i4]).longValue();
                iZzz = zzuc.zzz(i13);
                iZzA = zzuc.zzA(jLongValue);
            }
            iZzz3 = iZzA + iZzz + iZzz3;
        }
        this.zze = iZzz3;
        return iZzz3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i6 = this.zzc[i4] >>> 3;
            zztu zztuVar = (zztu) this.zzd[i4];
            int iZzz = zzuc.zzz(8);
            int iZzz2 = zzuc.zzz(i6) + zzuc.zzz(16);
            int iZzz3 = zzuc.zzz(24);
            int iZzd = zztuVar.zzd();
            iB = s.b(iZzz + iZzz, iZzz2, AbstractC1173g.F(iZzd, iZzd, iZzz3), iB);
        }
        this.zze = iB;
        return iB;
    }

    public final zzww zzd(zzww zzwwVar) {
        if (zzwwVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzwwVar.zzb;
        zzm(i);
        System.arraycopy(zzwwVar.zzc, 0, this.zzc, this.zzb, zzwwVar.zzb);
        System.arraycopy(zzwwVar.zzd, 0, this.zzd, this.zzb, zzwwVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i) {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzvy.zzb(sb2, i, String.valueOf(this.zzc[i4] >>> 3), this.zzd[i4]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i4 = this.zzb;
        iArr[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }

    public final void zzk(zzxi zzxiVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzxiVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzxi zzxiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i4 = this.zzc[i];
                Object obj = this.zzd[i];
                int i6 = i4 & 7;
                int i10 = i4 >>> 3;
                if (i6 == 0) {
                    zzxiVar.zzt(i10, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    zzxiVar.zzm(i10, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    zzxiVar.zzd(i10, (zztu) obj);
                } else if (i6 == 3) {
                    zzxiVar.zzF(i10);
                    ((zzww) obj).zzl(zzxiVar);
                    zzxiVar.zzh(i10);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new zzvd("Protocol message tag had invalid wire type."));
                    }
                    zzxiVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzww() {
        this(0, new int[8], new Object[8], true);
    }
}
