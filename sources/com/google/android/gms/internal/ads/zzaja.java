package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzaja extends zzajj {

    @Nullable
    private zzadh zza;

    @Nullable
    private zzaiz zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zza(boolean z4) {
        super.zza(z4);
        if (z4) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final long zzb(zzef zzefVar) {
        if (!zzd(zzefVar.zzi())) {
            return -1L;
        }
        int i = (zzefVar.zzi()[2] & 255) >> 4;
        if (i == 6) {
            zzefVar.zzk(4);
            zzefVar.zzO();
        } else if (i == 7) {
            i = 7;
            zzefVar.zzk(4);
            zzefVar.zzO();
        }
        int iZzc = zzadc.zzc(zzefVar, i);
        zzefVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final boolean zzc(zzef zzefVar, long j, zzajh zzajhVar) {
        byte[] bArrZzi = zzefVar.zzi();
        zzadh zzadhVar = this.zza;
        if (zzadhVar == null) {
            zzadh zzadhVar2 = new zzadh(bArrZzi, 17);
            this.zza = zzadhVar2;
            zzs zzsVarZza = zzadhVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzefVar.zze()), null).zza();
            zzsVarZza.zzl(MimeTypes.AUDIO_OGG);
            zzajhVar.zza = zzsVarZza.zzM();
            return true;
        }
        if ((bArrZzi[0] & 127) == 3) {
            zzadg zzadgVarZzc = zzade.zzc(zzefVar);
            zzadh zzadhVarZze = zzadhVar.zze(zzadgVarZzc);
            this.zza = zzadhVarZze;
            this.zzb = new zzaiz(zzadhVarZze, zzadgVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzaiz zzaizVar = this.zzb;
        if (zzaizVar != null) {
            zzaizVar.zzd(j);
            zzajhVar.zzb = this.zzb;
        }
        zzajhVar.zza.getClass();
        return false;
    }
}
