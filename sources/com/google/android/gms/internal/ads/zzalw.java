package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalw implements zzamd {
    private final zzee zza;
    private final zzef zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaeb zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzu zzl;
    private int zzm;
    private long zzn;

    public zzalw(@Nullable String str, int i, String str2) {
        zzee zzeeVar = new zzee(new byte[16], 16);
        this.zza = zzeeVar;
        this.zzb = new zzef(zzeeVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = androidx.media3.common.C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzanrVar.zzc();
        this.zzg = zzacxVar.zzu(zzanrVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        this.zzg.getClass();
        while (zzefVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (zzefVar.zzd() > 0) {
                    if (this.zzj) {
                        int iZzs = zzefVar.zzs();
                        this.zzj = iZzs == 172;
                        if (iZzs != 64) {
                            if (iZzs == 65) {
                                iZzs = 65;
                            }
                        }
                        this.zzh = 1;
                        zzef zzefVar2 = this.zzb;
                        zzefVar2.zzi()[0] = -84;
                        zzefVar2.zzi()[1] = iZzs == 65 ? (byte) 65 : (byte) 64;
                        this.zzi = 2;
                    } else {
                        this.zzj = zzefVar.zzs() == 172;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzefVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzz(zzefVar, iMin);
                int i4 = this.zzi + iMin;
                this.zzi = i4;
                if (i4 == this.zzm) {
                    zzghc.zzh(this.zzn != androidx.media3.common.C.TIME_UNSET);
                    this.zzg.zzx(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzef zzefVar3 = this.zzb;
                byte[] bArrZzi = zzefVar3.zzi();
                int iMin2 = Math.min(zzefVar.zzd(), 16 - this.zzi);
                zzefVar.zzm(bArrZzi, this.zzi, iMin2);
                int i6 = this.zzi + iMin2;
                this.zzi = i6;
                if (i6 == 16) {
                    zzee zzeeVar = this.zza;
                    zzeeVar.zzf(0);
                    zzabx zzabxVarZzb = zzaby.zzb(zzeeVar);
                    zzu zzuVar = this.zzl;
                    if (zzuVar == null || zzuVar.zzG != 2 || zzabxVarZzb.zza != zzuVar.zzH || !MimeTypes.AUDIO_AC4.equals(zzuVar.zzo)) {
                        zzs zzsVar = new zzs();
                        zzsVar.zza(this.zzf);
                        zzsVar.zzl(this.zze);
                        zzsVar.zzm(MimeTypes.AUDIO_AC4);
                        zzsVar.zzE(2);
                        zzsVar.zzF(zzabxVarZzb.zza);
                        zzsVar.zze(this.zzc);
                        zzsVar.zzg(this.zzd);
                        zzu zzuVarZzM = zzsVar.zzM();
                        this.zzl = zzuVarZzM;
                        this.zzg.zzu(zzuVarZzM);
                    }
                    this.zzm = zzabxVarZzb.zzb;
                    this.zzk = (((long) zzabxVarZzb.zzc) * 1000000) / ((long) this.zzl.zzH);
                    zzefVar3.zzh(0);
                    this.zzg.zzz(zzefVar3, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z4) {
    }
}
