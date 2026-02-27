package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ts.PsExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadc {
    public static boolean zza(zzef zzefVar, zzadh zzadhVar, int i, zzadb zzadbVar) {
        int iZzg = zzefVar.zzg();
        long jZzz = zzefVar.zzz();
        long j = jZzz >>> 16;
        if (j != i) {
            return false;
        }
        boolean z4 = (j & 1) == 1;
        long j6 = jZzz >> 12;
        long j7 = jZzz >> 8;
        long j9 = jZzz >> 4;
        long j10 = jZzz >> 1;
        long j11 = jZzz & 1;
        int i4 = (int) (j9 & 15);
        if (i4 <= 7) {
            if (i4 != zzadhVar.zzg - 1) {
                return false;
            }
        } else if (i4 > 10 || zzadhVar.zzg != 2) {
            return false;
        }
        int i6 = (int) (j10 & 7);
        if ((i6 != 0 && i6 != zzadhVar.zzi) || j11 == 1 || !zzd(zzefVar, zzadhVar, z4, zzadbVar)) {
            return false;
        }
        long j12 = zzadbVar.zza;
        int iZzc = zzc(zzefVar, (int) (j6 & 15));
        long j13 = zzadhVar.zzj;
        boolean z5 = j13 == 0 || j12 + ((long) iZzc) >= j13;
        if (iZzc == -1) {
            return false;
        }
        if ((!z5 && iZzc < zzadhVar.zza) || iZzc > zzadhVar.zzb) {
            return false;
        }
        int i10 = zzadhVar.zze;
        int i11 = (int) (j7 & 15);
        if (i11 != 0) {
            if (i11 <= 11) {
                if (i11 != zzadhVar.zzf) {
                    return false;
                }
            } else if (i11 == 12) {
                if (zzefVar.zzs() * 1000 != i10) {
                    return false;
                }
            } else {
                if (i11 > 14) {
                    return false;
                }
                int iZzt = zzefVar.zzt();
                if (i11 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i10) {
                    return false;
                }
            }
        }
        if (zzefVar.zzs() != zzeo.zzJ(zzefVar.zzi(), iZzg, zzefVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzefVar.zzd() != 0) {
            int iZzn = zzefVar.zzn();
            if ((iZzn & 128) != 0) {
                return false;
            }
            int i12 = (iZzn & 126) >> 1;
            if ((i12 >= 2 && i12 <= 7) || (i12 >= 13 && i12 <= 31)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 57);
                sb2.append("Ignoring frame where first subframe has a reserved type: ");
                sb2.append(i12);
                zzds.zzb("FlacFrameReader", sb2.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzacv zzacvVar, zzadh zzadhVar) throws IOException {
        zzacvVar.zzl();
        zzacvVar.zzk(1);
        byte[] bArr = new byte[1];
        zzacvVar.zzi(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z4 = 1 == i;
        zzacvVar.zzk(2);
        int i4 = 1 != i ? 6 : 7;
        zzef zzefVar = new zzef(i4);
        zzefVar.zzf(zzacy.zzb(zzacvVar, zzefVar.zzi(), 0, i4));
        zzacvVar.zzl();
        zzadb zzadbVar = new zzadb();
        if (zzd(zzefVar, zzadhVar, z4, zzadbVar)) {
            return zzadbVar.zza;
        }
        throw zzas.zzb(null, null);
    }

    public static int zzc(zzef zzefVar, int i) {
        switch (i) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzefVar.zzs() + 1;
            case 7:
                return zzefVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzef zzefVar, zzadh zzadhVar, boolean z4, zzadb zzadbVar) {
        try {
            long jZzO = zzefVar.zzO();
            if (!z4) {
                jZzO *= (long) zzadhVar.zzb;
            }
            long j = zzadhVar.zzj;
            if (j != 0 && jZzO > j) {
                return false;
            }
            zzadbVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
