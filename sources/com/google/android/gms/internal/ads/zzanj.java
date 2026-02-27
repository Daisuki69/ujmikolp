package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ts.TsExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzanj {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzel zza = new zzel(0);
    private long zzf = androidx.media3.common.C.TIME_UNSET;
    private long zzg = androidx.media3.common.C.TIME_UNSET;
    private long zzh = androidx.media3.common.C.TIME_UNSET;
    private final zzef zzb = new zzef();

    public zzanj(int i) {
    }

    private final int zze(zzacv zzacvVar) {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzacvVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzacv zzacvVar, zzads zzadsVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzacvVar);
            return 0;
        }
        boolean z4 = this.zze;
        long j = androidx.media3.common.C.TIME_UNSET;
        if (z4) {
            if (this.zzg == androidx.media3.common.C.TIME_UNSET) {
                zze(zzacvVar);
                return 0;
            }
            if (this.zzd) {
                long j6 = this.zzf;
                if (j6 == androidx.media3.common.C.TIME_UNSET) {
                    zze(zzacvVar);
                    return 0;
                }
                zzel zzelVar = this.zza;
                this.zzh = zzelVar.zzf(this.zzg) - zzelVar.zze(j6);
                zze(zzacvVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzacvVar.zzo());
            if (zzacvVar.zzn() != 0) {
                zzadsVar.zza = 0L;
                return 1;
            }
            zzef zzefVar = this.zzb;
            zzefVar.zza(iMin);
            zzacvVar.zzl();
            zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
            int iZzg = zzefVar.zzg();
            int iZze = zzefVar.zze();
            while (true) {
                if (iZzg >= iZze) {
                    break;
                }
                if (zzefVar.zzi()[iZzg] == 71) {
                    long jZzb = zzant.zzb(zzefVar, iZzg, i);
                    if (jZzb != androidx.media3.common.C.TIME_UNSET) {
                        j = jZzb;
                        break;
                    }
                }
                iZzg++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzacvVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j7 = jZzo - ((long) iMin2);
        if (zzacvVar.zzn() != j7) {
            zzadsVar.zza = j7;
            return 1;
        }
        zzef zzefVar2 = this.zzb;
        zzefVar2.zza(iMin2);
        zzacvVar.zzl();
        zzacvVar.zzi(zzefVar2.zzi(), 0, iMin2);
        int iZzg2 = zzefVar2.zzg();
        int iZze2 = zzefVar2.zze();
        int i4 = iZze2 - 188;
        while (true) {
            if (i4 < iZzg2) {
                break;
            }
            byte[] bArrZzi = zzefVar2.zzi();
            int i6 = -4;
            int i10 = 0;
            while (true) {
                if (i6 > 4) {
                    break;
                }
                int i11 = (i6 * TsExtractor.TS_PACKET_SIZE) + i4;
                if (i11 < iZzg2 || i11 >= iZze2 || bArrZzi[i11] != 71) {
                    i10 = 0;
                } else {
                    i10++;
                    if (i10 == 5) {
                        long jZzb2 = zzant.zzb(zzefVar2, i4, i);
                        if (jZzb2 != androidx.media3.common.C.TIME_UNSET) {
                            j = jZzb2;
                            break;
                        }
                    }
                }
                i6++;
            }
            i4--;
        }
        this.zzg = j;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzel zzd() {
        return this.zza;
    }
}
