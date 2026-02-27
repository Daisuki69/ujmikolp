package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamn implements zzamd {
    private zzaeb zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = MimeTypes.VIDEO_MP2T;
    private final zzef zzb = new zzef(10);
    private long zze = androidx.media3.common.C.TIME_UNSET;

    public zzamn(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzd = false;
        this.zze = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 5);
        this.zzc = zzaebVarZzu;
        zzs zzsVar = new zzs();
        zzsVar.zza(zzanrVar.zzc());
        zzsVar.zzl(this.zza);
        zzsVar.zzm(MimeTypes.APPLICATION_ID3);
        zzaebVarZzu.zzu(zzsVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int iZzd = zzefVar.zzd();
            int i = this.zzg;
            if (i < 10) {
                int iMin = Math.min(iZzd, 10 - i);
                byte[] bArrZzi = zzefVar.zzi();
                int iZzg = zzefVar.zzg();
                zzef zzefVar2 = this.zzb;
                System.arraycopy(bArrZzi, iZzg, zzefVar2.zzi(), this.zzg, iMin);
                if (this.zzg + iMin == 10) {
                    zzefVar2.zzh(0);
                    if (zzefVar2.zzs() != 73 || zzefVar2.zzs() != 68 || zzefVar2.zzs() != 51) {
                        zzds.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzefVar2.zzk(3);
                        this.zzf = zzefVar2.zzG() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzd, this.zzf - this.zzg);
            this.zzc.zzz(zzefVar, iMin2);
            this.zzg += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z4) {
        int i;
        this.zzc.getClass();
        if (this.zzd && (i = this.zzf) != 0 && this.zzg == i) {
            zzghc.zzh(this.zze != androidx.media3.common.C.TIME_UNSET);
            this.zzc.zzx(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
