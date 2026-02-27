package com.google.android.gms.internal.measurement;

import We.s;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoj {
    private static final zzoj zza = new zzoj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoj(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzoj zza() {
        return zza;
    }

    public static zzoj zzb() {
        return new zzoj(0, new int[8], new Object[8], true);
    }

    public static zzoj zzc(zzoj zzojVar, zzoj zzojVar2) {
        int i = zzojVar.zzb + zzojVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzojVar.zzc, i);
        System.arraycopy(zzojVar2.zzc, 0, iArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzojVar.zzd, i);
        System.arraycopy(zzojVar2.zzd, 0, objArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        return new zzoj(i, iArrCopyOf, objArrCopyOf, true);
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
        if (obj == null || !(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        int i = this.zzb;
        if (i == zzojVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzojVar.zzc;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzojVar.zzd;
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

    public final void zzf(zzov zzovVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzovVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzov zzovVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i4 = this.zzc[i];
                Object obj = this.zzd[i];
                int i6 = i4 & 7;
                int i10 = i4 >>> 3;
                if (i6 == 0) {
                    zzovVar.zzc(i10, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    zzovVar.zzj(i10, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    zzovVar.zzn(i10, (zzlh) obj);
                } else if (i6 == 3) {
                    zzovVar.zzt(i10);
                    ((zzoj) obj).zzg(zzovVar);
                    zzovVar.zzu(i10);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    zzovVar.zzk(i10, ((Integer) obj).intValue());
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
            zzlh zzlhVar = (zzlh) this.zzd[i4];
            int iZzz = zzlm.zzz(8);
            int iZzz2 = zzlm.zzz(i6) + zzlm.zzz(16);
            int iZzz3 = zzlm.zzz(24);
            int iZzc = zzlhVar.zzc();
            iB = s.b(iZzz + iZzz, iZzz2, AbstractC1173g.C(iZzc, iZzc, iZzz3), iB);
        }
        this.zze = iB;
        return iB;
    }

    public final int zzi() {
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
                    iZzz2 = zzlm.zzz(i10 << 3) + 8;
                } else if (i11 == 2) {
                    int i12 = i10 << 3;
                    zzlh zzlhVar = (zzlh) this.zzd[i4];
                    int iZzz4 = zzlm.zzz(i12);
                    int iZzc = zzlhVar.zzc();
                    iZzz3 = zzlm.zzz(iZzc) + iZzc + iZzz4 + iZzz3;
                } else if (i11 == 3) {
                    int iZzz5 = zzlm.zzz(i10 << 3);
                    iZzz = iZzz5 + iZzz5;
                    iZzA = ((zzoj) this.zzd[i4]).zzi();
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).getClass();
                    iZzz2 = zzlm.zzz(i10 << 3) + 4;
                }
                iZzz3 = iZzz2 + iZzz3;
            } else {
                int i13 = i10 << 3;
                long jLongValue = ((Long) this.zzd[i4]).longValue();
                iZzz = zzlm.zzz(i13);
                iZzA = zzlm.zzA(jLongValue);
            }
            iZzz3 = iZzA + iZzz + iZzz3;
        }
        this.zze = iZzz3;
        return iZzz3;
    }

    public final void zzj(StringBuilder sb2, int i) {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzno.zzb(sb2, i, String.valueOf(this.zzc[i4] >>> 3), this.zzd[i4]);
        }
    }

    public final void zzk(int i, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i4 = this.zzb;
        iArr[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }

    public final zzoj zzl(zzoj zzojVar) {
        if (zzojVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzojVar.zzb;
        zzm(i);
        System.arraycopy(zzojVar.zzc, 0, this.zzc, this.zzb, zzojVar.zzb);
        System.arraycopy(zzojVar.zzd, 0, this.zzd, this.zzb, zzojVar.zzb);
        this.zzb = i;
        return this;
    }

    private zzoj() {
        this(0, new int[8], new Object[8], true);
    }
}
