package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafa implements zzacu {
    private final byte[] zza;
    private final zzef zzb;
    private final zzadb zzc;
    private zzacx zzd;
    private zzaeb zze;
    private int zzf;

    @Nullable
    private zzao zzg;
    private zzadh zzh;
    private int zzi;
    private int zzj;
    private zzaey zzk;
    private int zzl;
    private long zzm;

    public zzafa() {
        throw null;
    }

    private final long zza(zzef zzefVar, boolean z4) {
        boolean zZza;
        this.zzh.getClass();
        int iZzg = zzefVar.zzg();
        while (iZzg <= zzefVar.zze() - 16) {
            zzefVar.zzh(iZzg);
            zzadh zzadhVar = this.zzh;
            int i = this.zzj;
            zzadb zzadbVar = this.zzc;
            if (zzadc.zza(zzefVar, zzadhVar, i, zzadbVar)) {
                zzefVar.zzh(iZzg);
                return zzadbVar.zza;
            }
            iZzg++;
        }
        if (!z4) {
            zzefVar.zzh(iZzg);
            return -1L;
        }
        while (iZzg <= zzefVar.zze() - this.zzi) {
            zzefVar.zzh(iZzg);
            try {
                zZza = zzadc.zza(zzefVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZza = false;
            }
            if (zzefVar.zzg() <= zzefVar.zze() && zZza) {
                zzefVar.zzh(iZzg);
                return this.zzc.zza;
            }
            iZzg++;
        }
        zzefVar.zzh(zzefVar.zze());
        return -1L;
    }

    private final void zzb() {
        long j = this.zzm * 1000000;
        zzadh zzadhVar = this.zzh;
        String str = zzeo.zza;
        this.zze.zzx(j / ((long) zzadhVar.zze), 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzade.zza(zzacvVar, false);
        zzef zzefVar = new zzef(4);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, 4, false);
        return zzefVar.zzz() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzd = zzacxVar;
        this.zze = zzacxVar.zzu(0, 1);
        zzacxVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        boolean zZzb;
        zzadh zzadhVar;
        zzadv zzaduVar;
        boolean z4;
        int i = this.zzf;
        if (i == 0) {
            zzacvVar.zzl();
            long jZzm = zzacvVar.zzm();
            zzao zzaoVarZza = zzade.zza(zzacvVar, true);
            zzacvVar.zzf((int) (zzacvVar.zzm() - jZzm));
            this.zzg = zzaoVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzacvVar.zzi(this.zza, 0, 42);
            zzacvVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzef zzefVar = new zzef(4);
            zzacvVar.zzc(zzefVar.zzi(), 0, 4);
            if (zzefVar.zzz() != 1716281667) {
                throw zzas.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzadd zzaddVar = new zzadd(this.zzh);
            do {
                zZzb = zzade.zzb(zzacvVar, zzaddVar);
                zzadhVar = zzaddVar.zza;
                String str = zzeo.zza;
                this.zzh = zzadhVar;
            } while (!zZzb);
            zzadhVar.getClass();
            this.zzi = Math.max(zzadhVar.zzc, 6);
            zzu zzuVarZzc = this.zzh.zzc(this.zza, this.zzg);
            zzaeb zzaebVar = this.zze;
            zzs zzsVarZza = zzuVarZzc.zza();
            zzsVarZza.zzl(MimeTypes.AUDIO_FLAC);
            zzaebVar.zzu(zzsVarZza.zzM());
            this.zzh.zza();
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzacvVar.zzl();
            zzef zzefVar2 = new zzef(2);
            zzacvVar.zzi(zzefVar2.zzi(), 0, 2);
            int iZzt = zzefVar2.zzt();
            if ((iZzt >> 2) != 16382) {
                zzacvVar.zzl();
                throw zzas.zzb("First frame does not start with sync code.", null);
            }
            zzacvVar.zzl();
            this.zzj = iZzt;
            zzacx zzacxVar = this.zzd;
            String str2 = zzeo.zza;
            long jZzn = zzacvVar.zzn();
            long jZzo = zzacvVar.zzo();
            zzadh zzadhVar2 = this.zzh;
            zzadhVar2.getClass();
            zzadg zzadgVar = zzadhVar2.zzk;
            if (zzadgVar != null && zzadgVar.zza.length > 0) {
                zzaduVar = new zzadf(zzadhVar2, jZzn);
            } else if (jZzo == -1 || zzadhVar2.zzj <= 0) {
                zzaduVar = new zzadu(zzadhVar2.zza(), 0L);
            } else {
                zzaey zzaeyVar = new zzaey(zzadhVar2, this.zzj, jZzn, jZzo);
                this.zzk = zzaeyVar;
                zzaduVar = zzaeyVar.zza();
            }
            zzacxVar.zzw(zzaduVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzadh zzadhVar3 = this.zzh;
        zzadhVar3.getClass();
        zzaey zzaeyVar2 = this.zzk;
        if (zzaeyVar2 != null && zzaeyVar2.zzc()) {
            return zzaeyVar2.zzd(zzacvVar, zzadsVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzadc.zzb(zzacvVar, zzadhVar3);
            return 0;
        }
        zzef zzefVar3 = this.zzb;
        int iZze = zzefVar3.zze();
        if (iZze < 32768) {
            int iZza = zzacvVar.zza(zzefVar3.zzi(), iZze, 32768 - iZze);
            z4 = iZza == -1;
            if (!z4) {
                zzefVar3.zzf(iZze + iZza);
            } else if (zzefVar3.zzd() == 0) {
                zzb();
                return -1;
            }
        } else {
            z4 = false;
        }
        int iZzg = zzefVar3.zzg();
        int i4 = this.zzl;
        int i6 = this.zzi;
        if (i4 < i6) {
            zzefVar3.zzk(Math.min(i6 - i4, zzefVar3.zzd()));
        }
        long jZza = zza(zzefVar3, z4);
        int iZzg2 = zzefVar3.zzg() - iZzg;
        zzefVar3.zzh(iZzg);
        this.zze.zzz(zzefVar3, iZzg2);
        this.zzl += iZzg2;
        if (jZza != -1) {
            zzb();
            this.zzl = 0;
            this.zzm = jZza;
        }
        int length = zzefVar3.zzi().length - zzefVar3.zze();
        if (zzefVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int iZzd = zzefVar3.zzd();
        System.arraycopy(zzefVar3.zzi(), zzefVar3.zzg(), zzefVar3.zzi(), 0, iZzd);
        zzefVar3.zzh(0);
        zzefVar3.zzf(iZzd);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzaey zzaeyVar = this.zzk;
            if (zzaeyVar != null) {
                zzaeyVar.zzb(j6);
            }
        }
        this.zzm = j6 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }

    public zzafa(int i) {
        this.zza = new byte[42];
        this.zzb = new zzef(new byte[32768], 0);
        this.zzc = new zzadb();
        this.zzf = 0;
    }
}
