package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import We.s;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgt {
    private static final zzgt zza = new zzgt(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgt(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzgt zzc() {
        return zza;
    }

    public static zzgt zze(zzgt zzgtVar, zzgt zzgtVar2) {
        int i = zzgtVar.zzb + zzgtVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgtVar.zzc, i);
        System.arraycopy(zzgtVar2.zzc, 0, iArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgtVar.zzd, i);
        System.arraycopy(zzgtVar2.zzd, 0, objArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        return new zzgt(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzgt zzf() {
        return new zzgt(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzgt)) {
            return false;
        }
        zzgt zzgtVar = (zzgt) obj;
        int i = this.zzb;
        if (i == zzgtVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgtVar.zzc;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgtVar.zzd;
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
                    iZzA2 = zzdn.zzA(i10 << 3) + 8;
                } else if (i11 == 2) {
                    int i12 = i10 << 3;
                    zzdf zzdfVar = (zzdf) this.zzd[i4];
                    int iZzA4 = zzdn.zzA(i12);
                    int iZzd = zzdfVar.zzd();
                    iZzA3 = zzdn.zzA(iZzd) + iZzd + iZzA4 + iZzA3;
                } else if (i11 == 3) {
                    int iZzA5 = zzdn.zzA(i10 << 3);
                    iZzA = iZzA5 + iZzA5;
                    iZzB = ((zzgt) this.zzd[i4]).zza();
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(new zzeq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).getClass();
                    iZzA2 = zzdn.zzA(i10 << 3) + 4;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i13 = i10 << 3;
                long jLongValue = ((Long) this.zzd[i4]).longValue();
                iZzA = zzdn.zzA(i13);
                iZzB = zzdn.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i6 = this.zzc[i4] >>> 3;
            zzdf zzdfVar = (zzdf) this.zzd[i4];
            int iZzA = zzdn.zzA(8);
            int iZzA2 = zzdn.zzA(i6) + zzdn.zzA(16);
            int iZzA3 = zzdn.zzA(24);
            int iZzd = zzdfVar.zzd();
            iB = s.b(iZzA + iZzA, iZzA2, AbstractC1173g.E(iZzd, iZzd, iZzA3), iB);
        }
        this.zze = iB;
        return iB;
    }

    public final zzgt zzd(zzgt zzgtVar) {
        if (zzgtVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzgtVar.zzb;
        zzm(i);
        System.arraycopy(zzgtVar.zzc, 0, this.zzc, this.zzb, zzgtVar.zzb);
        System.arraycopy(zzgtVar.zzd, 0, this.zzd, this.zzb, zzgtVar.zzb);
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
            zzfo.zzb(sb2, i, String.valueOf(this.zzc[i4] >>> 3), this.zzd[i4]);
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

    public final void zzk(zzhh zzhhVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhhVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhh zzhhVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i4 = this.zzc[i];
                Object obj = this.zzd[i];
                int i6 = i4 & 7;
                int i10 = i4 >>> 3;
                if (i6 == 0) {
                    zzhhVar.zzt(i10, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    zzhhVar.zzm(i10, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    zzhhVar.zzd(i10, (zzdf) obj);
                } else if (i6 == 3) {
                    zzhhVar.zzF(i10);
                    ((zzgt) obj).zzl(zzhhVar);
                    zzhhVar.zzh(i10);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new zzeq("Protocol message tag had invalid wire type."));
                    }
                    zzhhVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzgt() {
        this(0, new int[8], new Object[8], true);
    }
}
