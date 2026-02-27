package com.google.android.gms.internal.ads;

import java.util.Objects;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
final class zzaey extends zzacg {
    public zzaey(final zzadh zzadhVar, int i, long j, long j6) {
        long j7;
        Objects.requireNonNull(zzadhVar);
        zzacd zzacdVar = new zzacd() { // from class: com.google.android.gms.internal.ads.zzaew
            @Override // com.google.android.gms.internal.ads.zzacd
            public final /* synthetic */ long zza(long j9) {
                return zzadhVar.zzb(j9);
            }
        };
        zzaex zzaexVar = new zzaex(zzadhVar, i, null);
        long jZza = zzadhVar.zza();
        long j9 = zzadhVar.zzj;
        int i4 = zzadhVar.zzd;
        if (i4 > 0) {
            j7 = ((((long) i4) + ((long) zzadhVar.zzc)) / 2) + 1;
        } else {
            int i6 = zzadhVar.zza;
            int i10 = zzadhVar.zzb;
            long j10 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i6 == i10 && i6 > 0) {
                j10 = i6;
            }
            j7 = 64 + (((j10 * ((long) zzadhVar.zzg)) * ((long) zzadhVar.zzh)) / 8);
        }
        super(zzacdVar, zzaexVar, jZza, 0L, j9, j, j6, j7, Math.max(6, zzadhVar.zzc));
    }
}
