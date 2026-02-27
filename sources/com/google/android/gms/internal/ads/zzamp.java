package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamp implements zzamd {
    private final zzef zza;
    private final zzado zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzaeb zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzamp(@Nullable String str, int i, String str2) {
        zzef zzefVar = new zzef(4);
        this.zza = zzefVar;
        zzefVar.zzi()[0] = -1;
        this.zzb = new zzado();
        this.zzn = androidx.media3.common.C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzg = zzanrVar.zzc();
        this.zzf = zzacxVar.zzu(zzanrVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        this.zzf.getClass();
        while (zzefVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                byte[] bArrZzi = zzefVar.zzi();
                int iZzg = zzefVar.zzg();
                int iZze = zzefVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzefVar.zzh(iZze);
                        break;
                    }
                    int i4 = iZzg + 1;
                    byte b8 = bArrZzi[iZzg];
                    boolean z4 = (b8 & 255) == 255;
                    boolean z5 = this.zzk && (b8 & 224) == 224;
                    this.zzk = z4;
                    if (z5) {
                        zzefVar.zzh(i4);
                        this.zzk = false;
                        this.zza.zzi()[1] = bArrZzi[iZzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    iZzg = i4;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzefVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzz(zzefVar, iMin);
                int i6 = this.zzi + iMin;
                this.zzi = i6;
                if (i6 >= this.zzm) {
                    zzghc.zzh(this.zzn != androidx.media3.common.C.TIME_UNSET);
                    this.zzf.zzx(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int iMin2 = Math.min(zzefVar.zzd(), 4 - this.zzi);
                zzef zzefVar2 = this.zza;
                zzefVar.zzm(zzefVar2.zzi(), this.zzi, iMin2);
                int i10 = this.zzi + iMin2;
                this.zzi = i10;
                if (i10 >= 4) {
                    zzefVar2.zzh(0);
                    zzado zzadoVar = this.zzb;
                    if (zzadoVar.zza(zzefVar2.zzB())) {
                        this.zzm = zzadoVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (((long) zzadoVar.zzg) * 1000000) / ((long) zzadoVar.zzd);
                            zzs zzsVar = new zzs();
                            zzsVar.zza(this.zzg);
                            zzsVar.zzl(this.zze);
                            zzsVar.zzm(zzadoVar.zzb);
                            zzsVar.zzn(4096);
                            zzsVar.zzE(zzadoVar.zze);
                            zzsVar.zzF(zzadoVar.zzd);
                            zzsVar.zze(this.zzc);
                            zzsVar.zzg(this.zzd);
                            this.zzf.zzu(zzsVar.zzM());
                            this.zzj = true;
                        }
                        zzefVar2.zzh(0);
                        this.zzf.zzz(zzefVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z4) {
    }
}
