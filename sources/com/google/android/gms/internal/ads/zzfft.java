package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfft {
    private final zzffl zza;
    private final S1.y zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfft(final zzfer zzferVar, final zzffk zzffkVar, final zzffl zzfflVar) {
        this.zza = zzfflVar;
        this.zzb = zzgot.zzh(zzgot.zzj(zzffkVar.zza(zzfflVar), new zzgob() { // from class: com.google.android.gms.internal.ads.zzffs
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc(zzffkVar, zzferVar, zzfflVar, (zzffa) obj);
            }
        }, zzfflVar.zza()), Exception.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzffq
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzd(zzffkVar, (Exception) obj);
            }
        }, zzfflVar.zza());
    }

    public final synchronized void zza(zzgoq zzgoqVar) {
        zzffl zzfflVar = this.zza;
        zzgot.zzq(zzgot.zzj(this.zzb, zzffr.zza, zzfflVar.zza()), zzgoqVar, zzfflVar.zza());
    }

    public final synchronized S1.y zzb(zzffl zzfflVar) {
        if (!this.zzd && !this.zzc) {
            zzffl zzfflVar2 = this.zza;
            if (zzfflVar2.zzb() != null && zzfflVar.zzb() != null && zzfflVar2.zzb().equals(zzfflVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    public final /* synthetic */ S1.y zzc(zzffk zzffkVar, zzfer zzferVar, zzffl zzfflVar, zzffa zzffaVar) {
        synchronized (this) {
            try {
                this.zzd = true;
                zzffkVar.zzb(zzffaVar);
                if (this.zzc) {
                    return zzgot.zza(new zzffj(zzffaVar, zzfflVar));
                }
                zzferVar.zzb(zzfflVar.zzb(), zzffaVar);
                return zzgot.zza(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ S1.y zzd(zzffk zzffkVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}
