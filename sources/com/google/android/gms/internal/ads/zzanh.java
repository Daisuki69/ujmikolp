package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.TsExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzanh implements zzacf {
    private final zzel zza;
    private final zzef zzb = new zzef();
    private final int zzc;

    public zzanh(int i, zzel zzelVar, int i4) {
        this.zzc = i;
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacv zzacvVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzacvVar.zzn();
        int iMin = (int) Math.min(112800L, zzacvVar.zzo() - jZzn);
        zzef zzefVar = this.zzb;
        zzefVar.zza(iMin);
        zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
        int iZze = zzefVar.zze();
        long j6 = -1;
        long j7 = -9223372036854775807L;
        long j9 = -1;
        while (zzefVar.zzd() >= 188 && (iZza2 = (iZza = zzant.zza(zzefVar.zzi(), zzefVar.zzg(), iZze)) + TsExtractor.TS_PACKET_SIZE) <= iZze) {
            long jZzb = zzant.zzb(zzefVar, iZza, this.zzc);
            if (jZzb != androidx.media3.common.C.TIME_UNSET) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j) {
                    return j7 == androidx.media3.common.C.TIME_UNSET ? zzace.zza(jZze, jZzn) : zzace.zzc(jZzn + j9);
                }
                j9 = iZza;
                if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jZze > j) {
                    return zzace.zzc(jZzn + j9);
                }
                j7 = jZze;
            }
            zzefVar.zzh(iZza2);
            j6 = iZza2;
        }
        return j7 != androidx.media3.common.C.TIME_UNSET ? zzace.zzb(j7, jZzn + j6) : zzace.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzb() {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
