package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhkw {
    private static final zzhkw zza = new zzhkw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhkw(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzhkw zza() {
        return zza;
    }

    public static zzhkw zzb() {
        return new zzhkw();
    }

    public static zzhkw zzc(zzhkw zzhkwVar, zzhkw zzhkwVar2) {
        int i = zzhkwVar.zzb + zzhkwVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhkwVar.zzc, i);
        System.arraycopy(zzhkwVar2.zzc, 0, iArrCopyOf, zzhkwVar.zzb, zzhkwVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhkwVar.zzd, i);
        System.arraycopy(zzhkwVar2.zzd, 0, objArrCopyOf, zzhkwVar.zzb, zzhkwVar2.zzb);
        return new zzhkw(i, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i) {
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
        if (obj == null || !(obj instanceof zzhkw)) {
            return false;
        }
        zzhkw zzhkwVar = (zzhkw) obj;
        int i = this.zzb;
        if (i == zzhkwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhkwVar.zzc;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhkwVar.zzd;
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

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzhlk zzhlkVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhlkVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzhlk zzhlkVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i4 = this.zzc[i];
                Object obj = this.zzd[i];
                int i6 = i4 & 7;
                int i10 = i4 >>> 3;
                if (i6 == 0) {
                    zzhlkVar.zzc(i10, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    zzhlkVar.zzj(i10, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    zzhlkVar.zzn(i10, (zzhhb) obj);
                } else if (i6 == 3) {
                    zzhlkVar.zzt(i10);
                    ((zzhkw) obj).zzg(zzhlkVar);
                    zzhlkVar.zzu(i10);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new zzhiv("Protocol message tag had invalid wire type."));
                    }
                    zzhlkVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i6 = this.zzc[i4] >>> 3;
            zzhhb zzhhbVar = (zzhhb) this.zzd[i4];
            int iZzA = zzhhm.zzA(8);
            int iZzA2 = zzhhm.zzA(i6) + zzhhm.zzA(16);
            int iZzA3 = zzhhm.zzA(24);
            int iZzc = zzhhbVar.zzc();
            iB = We.s.b(iZzA + iZzA, iZzA2, AbstractC1173g.e(iZzc, iZzc, iZzA3), iB);
        }
        this.zze = iB;
        return iB;
    }

    public final int zzi() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzA3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i6 = this.zzc[i4];
            int i10 = i6 >>> 3;
            int i11 = i6 & 7;
            if (i11 != 0) {
                if (i11 == 1) {
                    ((Long) this.zzd[i4]).getClass();
                    iZzA2 = zzhhm.zzA(i10 << 3) + 8;
                } else if (i11 == 2) {
                    int i12 = i10 << 3;
                    zzhhb zzhhbVar = (zzhhb) this.zzd[i4];
                    int iZzA4 = zzhhm.zzA(i12);
                    int iZzc = zzhhbVar.zzc();
                    iZzA3 = zzhhm.zzA(iZzc) + iZzc + iZzA4 + iZzA3;
                } else if (i11 == 3) {
                    int iZzA5 = zzhhm.zzA(i10 << 3);
                    iZzA = iZzA5 + iZzA5;
                    iZzB = ((zzhkw) this.zzd[i4]).zzi();
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(new zzhiv("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).getClass();
                    iZzA2 = zzhhm.zzA(i10 << 3) + 4;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i13 = i10 << 3;
                long jLongValue = ((Long) this.zzd[i4]).longValue();
                iZzA = zzhhm.zzA(i13);
                iZzB = zzhhm.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final void zzj(StringBuilder sb2, int i) {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzhju.zzb(sb2, i, String.valueOf(this.zzc[i4] >>> 3), this.zzd[i4]);
        }
    }

    public final void zzk(int i, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i4 = this.zzb;
        iArr[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }

    public final boolean zzl(int i, zzhhg zzhhgVar) throws IOException {
        int iZza;
        zze();
        int i4 = i & 7;
        if (i4 == 0) {
            zzk(i, Long.valueOf(zzhhgVar.zzg()));
            return true;
        }
        if (i4 == 1) {
            zzk(i, Long.valueOf(zzhhgVar.zzi()));
            return true;
        }
        if (i4 == 2) {
            zzk(i, zzhhgVar.zzn());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                zzhhgVar.zzI();
                return false;
            }
            if (i4 != 5) {
                throw new zzhiv("Protocol message tag had invalid wire type.");
            }
            zzk(i, Integer.valueOf(zzhhgVar.zzj()));
            return true;
        }
        zzhkw zzhkwVar = new zzhkw();
        do {
            iZza = zzhhgVar.zza();
            if (iZza == 0) {
                break;
            }
        } while (zzhkwVar.zzl(iZza, zzhhgVar));
        zzhhgVar.zzb(4 | ((i >>> 3) << 3));
        zzk(i, zzhkwVar);
        return true;
    }

    public final zzhkw zzm(zzhkw zzhkwVar) {
        if (zzhkwVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzhkwVar.zzb;
        zzn(i);
        System.arraycopy(zzhkwVar.zzc, 0, this.zzc, this.zzb, zzhkwVar.zzb);
        System.arraycopy(zzhkwVar.zzd, 0, this.zzd, this.zzb, zzhkwVar.zzb);
        this.zzb = i;
        return this;
    }

    private zzhkw() {
        this(0, new int[8], new Object[8], true);
    }
}
