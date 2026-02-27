package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzvz {
    private final zzef zza = new zzef(32);
    private zzvy zzb;
    private zzvy zzc;
    private zzvy zzd;
    private long zze;
    private final zzyv zzf;

    public zzvz(zzyv zzyvVar) {
        this.zzf = zzyvVar;
        zzvy zzvyVar = new zzvy(0L, 65536);
        this.zzb = zzvyVar;
        this.zzc = zzvyVar;
        this.zzd = zzvyVar;
    }

    private final int zzi(int i) {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar.zzc == null) {
            zzyo zzyoVarZzc = this.zzf.zzc();
            zzvy zzvyVar2 = new zzvy(this.zzd.zzb, 65536);
            zzvyVar.zzc = zzyoVarZzc;
            zzvyVar.zzd = zzvyVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private final void zzj(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zzvy zzvyVar = this.zzd;
        if (j == zzvyVar.zzb) {
            this.zzd = zzvyVar.zzd;
        }
    }

    private static zzvy zzk(zzvy zzvyVar, zzhg zzhgVar, zzwa zzwaVar, zzef zzefVar) {
        zzvy zzvyVarZzm;
        int iZzt;
        if (zzhgVar.zzk()) {
            long j = zzwaVar.zzb;
            zzefVar.zza(1);
            zzvy zzvyVarZzm2 = zzm(zzvyVar, j, zzefVar.zzi(), 1);
            long j6 = j + 1;
            byte b8 = zzefVar.zzi()[0];
            int i = b8 & 128;
            int i4 = b8 & 127;
            zzhd zzhdVar = zzhgVar.zzb;
            byte[] bArr = zzhdVar.zza;
            if (bArr == null) {
                zzhdVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z4 = i != 0;
            zzvyVarZzm = zzm(zzvyVarZzm2, j6, zzhdVar.zza, i4);
            long j7 = j6 + ((long) i4);
            if (z4) {
                zzefVar.zza(2);
                zzvyVarZzm = zzm(zzvyVarZzm, j7, zzefVar.zzi(), 2);
                j7 += 2;
                iZzt = zzefVar.zzt();
            } else {
                iZzt = 1;
            }
            int[] iArr = zzhdVar.zzd;
            if (iArr == null || iArr.length < iZzt) {
                iArr = new int[iZzt];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhdVar.zze;
            if (iArr3 == null || iArr3.length < iZzt) {
                iArr3 = new int[iZzt];
            }
            int[] iArr4 = iArr3;
            if (z4) {
                int i6 = iZzt * 6;
                zzefVar.zza(i6);
                zzvyVarZzm = zzm(zzvyVarZzm, j7, zzefVar.zzi(), i6);
                j7 += (long) i6;
                zzefVar.zzh(0);
                for (int i10 = 0; i10 < iZzt; i10++) {
                    iArr2[i10] = zzefVar.zzt();
                    iArr4[i10] = zzefVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwaVar.zza - ((int) (j7 - zzwaVar.zzb));
            }
            zzaea zzaeaVar = zzwaVar.zzc;
            String str = zzeo.zza;
            zzhdVar.zza(iZzt, iArr2, iArr4, zzaeaVar.zzb, zzhdVar.zza, zzaeaVar.zza, zzaeaVar.zzc, zzaeaVar.zzd);
            long j9 = zzwaVar.zzb;
            int i11 = (int) (j7 - j9);
            zzwaVar.zzb = j9 + ((long) i11);
            zzwaVar.zza -= i11;
        } else {
            zzvyVarZzm = zzvyVar;
        }
        if (!zzhgVar.zze()) {
            zzhgVar.zzj(zzwaVar.zza);
            return zzl(zzvyVarZzm, zzwaVar.zzb, zzhgVar.zzc, zzwaVar.zza);
        }
        zzefVar.zza(4);
        zzvy zzvyVarZzm3 = zzm(zzvyVarZzm, zzwaVar.zzb, zzefVar.zzi(), 4);
        int iZzH = zzefVar.zzH();
        zzwaVar.zzb += 4;
        zzwaVar.zza -= 4;
        zzhgVar.zzj(iZzH);
        zzvy zzvyVarZzl = zzl(zzvyVarZzm3, zzwaVar.zzb, zzhgVar.zzc, iZzH);
        zzwaVar.zzb += (long) iZzH;
        int i12 = zzwaVar.zza - iZzH;
        zzwaVar.zza = i12;
        ByteBuffer byteBuffer = zzhgVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i12) {
            zzhgVar.zzf = ByteBuffer.allocate(i12);
        } else {
            zzhgVar.zzf.clear();
        }
        return zzl(zzvyVarZzl, zzwaVar.zzb, zzhgVar.zzf, zzwaVar.zza);
    }

    private static zzvy zzl(zzvy zzvyVar, long j, ByteBuffer byteBuffer, int i) {
        zzvy zzvyVarZzn = zzn(zzvyVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzvyVarZzn.zzb - j));
            byteBuffer.put(zzvyVarZzn.zzc.zza, zzvyVarZzn.zzb(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == zzvyVarZzn.zzb) {
                zzvyVarZzn = zzvyVarZzn.zzd;
            }
        }
        return zzvyVarZzn;
    }

    private static zzvy zzm(zzvy zzvyVar, long j, byte[] bArr, int i) {
        zzvy zzvyVarZzn = zzn(zzvyVar, j);
        int i4 = i;
        while (i4 > 0) {
            int iMin = Math.min(i4, (int) (zzvyVarZzn.zzb - j));
            System.arraycopy(zzvyVarZzn.zzc.zza, zzvyVarZzn.zzb(j), bArr, i - i4, iMin);
            i4 -= iMin;
            j += (long) iMin;
            if (j == zzvyVarZzn.zzb) {
                zzvyVarZzn = zzvyVarZzn.zzd;
            }
        }
        return zzvyVarZzn;
    }

    private static zzvy zzn(zzvy zzvyVar, long j) {
        while (j >= zzvyVar.zzb) {
            zzvyVar = zzvyVar.zzd;
        }
        return zzvyVar;
    }

    public final void zza() {
        zzvy zzvyVar = this.zzb;
        if (zzvyVar.zzc != null) {
            this.zzf.zze(zzvyVar);
            zzvyVar.zzc();
        }
        this.zzb.zza(0L, 65536);
        zzvy zzvyVar2 = this.zzb;
        this.zzc = zzvyVar2;
        this.zzd = zzvyVar2;
        this.zze = 0L;
        this.zzf.zzf();
    }

    public final void zzb() {
        this.zzc = this.zzb;
    }

    public final void zzc(zzhg zzhgVar, zzwa zzwaVar) {
        this.zzc = zzk(this.zzc, zzhgVar, zzwaVar, this.zza);
    }

    public final void zzd(zzhg zzhgVar, zzwa zzwaVar) {
        zzk(this.zzc, zzhgVar, zzwaVar, this.zza);
    }

    public final void zze(long j) {
        zzvy zzvyVar;
        if (j != -1) {
            while (true) {
                zzvyVar = this.zzb;
                if (j < zzvyVar.zzb) {
                    break;
                }
                this.zzf.zzd(zzvyVar.zzc);
                this.zzb = this.zzb.zzc();
            }
            if (this.zzc.zza < zzvyVar.zza) {
                this.zzc = zzvyVar;
            }
        }
    }

    public final long zzf() {
        return this.zze;
    }

    public final int zzg(zzi zziVar, int i, boolean z4) throws IOException {
        int iZzi = zzi(i);
        zzvy zzvyVar = this.zzd;
        int iZza = zziVar.zza(zzvyVar.zzc.zza, zzvyVar.zzb(this.zze), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzef zzefVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzvy zzvyVar = this.zzd;
            zzefVar.zzm(zzvyVar.zzc.zza, zzvyVar.zzb(this.zze), iZzi);
            i -= iZzi;
            zzj(iZzi);
        }
    }
}
