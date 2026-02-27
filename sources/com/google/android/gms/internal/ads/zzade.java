package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzade {
    @Nullable
    public static zzao zza(zzacv zzacvVar, boolean z4) throws IOException {
        zzao zzaoVarZza = new zzadm().zza(zzacvVar, z4 ? null : zzagg.zza, 0);
        if (zzaoVarZza == null || zzaoVarZza.zza() == 0) {
            return null;
        }
        return zzaoVarZza;
    }

    public static boolean zzb(zzacv zzacvVar, zzadd zzaddVar) throws IOException {
        zzacvVar.zzl();
        zzee zzeeVar = new zzee(new byte[4], 4);
        zzacvVar.zzi(zzeeVar.zza, 0, 4);
        boolean zZzi = zzeeVar.zzi();
        int iZzj = zzeeVar.zzj(7);
        int iZzj2 = zzeeVar.zzj(24) + 4;
        if (iZzj == 0) {
            byte[] bArr = new byte[38];
            zzacvVar.zzc(bArr, 0, 38);
            zzaddVar.zza = new zzadh(bArr, 4);
            return zZzi;
        }
        zzadh zzadhVar = zzaddVar.zza;
        if (zzadhVar == null) {
            throw new IllegalArgumentException();
        }
        if (iZzj == 3) {
            zzef zzefVar = new zzef(iZzj2);
            zzacvVar.zzc(zzefVar.zzi(), 0, iZzj2);
            zzaddVar.zza = zzadhVar.zze(zzc(zzefVar));
            return zZzi;
        }
        if (iZzj == 4) {
            zzef zzefVar2 = new zzef(iZzj2);
            zzacvVar.zzc(zzefVar2.zzi(), 0, iZzj2);
            zzefVar2.zzk(4);
            zzaddVar.zza = new zzadh(zzadhVar.zza, zzadhVar.zzb, zzadhVar.zzc, zzadhVar.zzd, zzadhVar.zze, zzadhVar.zzg, zzadhVar.zzh, zzadhVar.zzj, zzadhVar.zzk, zzadhVar.zzd(zzaeh.zzc(Arrays.asList(zzaeh.zzb(zzefVar2, false, false).zza))));
            return zZzi;
        }
        if (iZzj != 6) {
            zzacvVar.zzf(iZzj2);
            return zZzi;
        }
        zzef zzefVar3 = new zzef(iZzj2);
        zzacvVar.zzc(zzefVar3.zzi(), 0, iZzj2);
        zzefVar3.zzk(4);
        zzaddVar.zza = new zzadh(zzadhVar.zza, zzadhVar.zzb, zzadhVar.zzc, zzadhVar.zzd, zzadhVar.zze, zzadhVar.zzg, zzadhVar.zzh, zzadhVar.zzj, zzadhVar.zzk, zzadhVar.zzd(new zzao(zzgjz.zzj(zzafu.zzb(zzefVar3)))));
        return zZzi;
    }

    public static zzadg zzc(zzef zzefVar) {
        zzefVar.zzk(1);
        int iZzx = zzefVar.zzx();
        long jZzg = zzefVar.zzg();
        long j = iZzx;
        int i = iZzx / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            long jZzD = zzefVar.zzD();
            if (jZzD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i4);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i4);
                break;
            }
            jArrCopyOf[i4] = jZzD;
            jArrCopyOf2[i4] = zzefVar.zzD();
            zzefVar.zzk(2);
            i4++;
        }
        zzefVar.zzk((int) ((jZzg + j) - ((long) zzefVar.zzg())));
        return new zzadg(jArrCopyOf, jArrCopyOf2);
    }
}
