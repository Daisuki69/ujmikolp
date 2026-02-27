package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzzu {
    final /* synthetic */ zzzv zza;
    private zzu zzb;

    public /* synthetic */ zzzu(zzzv zzzvVar, byte[] bArr) {
        Objects.requireNonNull(zzzvVar);
        this.zza = zzzvVar;
    }

    public final void zza(final zzbu zzbuVar) {
        zzs zzsVar = new zzs();
        zzsVar.zzt(zzbuVar.zzb);
        zzsVar.zzu(zzbuVar.zzc);
        zzsVar.zzm(MimeTypes.VIDEO_RAW);
        this.zzb = zzsVar.zzM();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbuVar);
            }
        });
    }

    public final void zzb(long j, long j6, boolean z4) {
        if (z4) {
            zzzv zzzvVar = this.zza;
            if (zzzvVar.zzA() != null) {
                zzzvVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzu zzuVarZzM = this.zzb;
        if (zzuVarZzM == null) {
            zzuVarZzM = new zzs().zzM();
        }
        zzu zzuVar = zzuVarZzM;
        zzzv zzzvVar2 = this.zza;
        zzzvVar2.zzD().zzcS(j6, j, zzuVar, null);
        ((zzabp) zzzvVar2.zzz().remove()).zza(j);
    }
}
