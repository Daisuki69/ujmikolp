package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzamz {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzel zza = new zzel(0);
    private long zzf = androidx.media3.common.C.TIME_UNSET;
    private long zzg = androidx.media3.common.C.TIME_UNSET;
    private long zzh = androidx.media3.common.C.TIME_UNSET;
    private final zzef zzb = new zzef();

    public static long zze(zzef zzefVar) {
        int iZzg = zzefVar.zzg();
        if (zzefVar.zzd() < 9) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        zzefVar.zzm(bArr, 0, 9);
        zzefVar.zzh(iZzg);
        byte b8 = bArr[0];
        if ((b8 & 196) != 68) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte b10 = bArr[2];
        if ((b10 & 4) != 4) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte b11 = bArr[4];
        if ((b11 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j = b8;
        long j6 = b10;
        long j7 = (248 & j6) >> 3;
        long j9 = (bArr[1] & 255) << 20;
        long j10 = (j6 & 3) << 13;
        return j10 | j9 | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j7 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b11) & 248) >> 3);
    }

    private final int zzf(zzacv zzacvVar) {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzacvVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzel zzb() {
        return this.zza;
    }

    public final int zzc(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        boolean z4 = this.zze;
        long j = androidx.media3.common.C.TIME_UNSET;
        if (!z4) {
            long jZzo = zzacvVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j6 = jZzo - ((long) iMin);
            if (zzacvVar.zzn() != j6) {
                zzadsVar.zza = j6;
                return 1;
            }
            zzef zzefVar = this.zzb;
            zzefVar.zza(iMin);
            zzacvVar.zzl();
            zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
            int iZzg = zzefVar.zzg();
            int iZze = zzefVar.zze() - 4;
            while (true) {
                if (iZze < iZzg) {
                    break;
                }
                if (zzg(zzefVar.zzi(), iZze) == 442) {
                    zzefVar.zzh(iZze + 4);
                    long jZze = zze(zzefVar);
                    if (jZze != androidx.media3.common.C.TIME_UNSET) {
                        j = jZze;
                        break;
                    }
                }
                iZze--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == androidx.media3.common.C.TIME_UNSET) {
            zzf(zzacvVar);
            return 0;
        }
        if (this.zzd) {
            long j7 = this.zzf;
            if (j7 == androidx.media3.common.C.TIME_UNSET) {
                zzf(zzacvVar);
                return 0;
            }
            zzel zzelVar = this.zza;
            this.zzh = zzelVar.zzf(this.zzg) - zzelVar.zze(j7);
            zzf(zzacvVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzacvVar.zzo());
        if (zzacvVar.zzn() != 0) {
            zzadsVar.zza = 0L;
            return 1;
        }
        zzef zzefVar2 = this.zzb;
        zzefVar2.zza(iMin2);
        zzacvVar.zzl();
        zzacvVar.zzi(zzefVar2.zzi(), 0, iMin2);
        int iZzg2 = zzefVar2.zzg();
        int iZze2 = zzefVar2.zze();
        while (true) {
            if (iZzg2 >= iZze2 - 3) {
                break;
            }
            if (zzg(zzefVar2.zzi(), iZzg2) == 442) {
                zzefVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzefVar2);
                if (jZze2 != androidx.media3.common.C.TIME_UNSET) {
                    j = jZze2;
                    break;
                }
            }
            iZzg2++;
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
