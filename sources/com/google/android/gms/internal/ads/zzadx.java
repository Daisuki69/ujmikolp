package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadx implements zzacu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacx zzf;
    private zzaeb zzg;

    public zzadx(int i, int i4, String str) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        int i = this.zza;
        zzghc.zzh((i == -1 || this.zzb == -1) ? false : true);
        int i4 = this.zzb;
        zzef zzefVar = new zzef(i4);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, i4, false);
        return zzefVar.zzt() == i;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzf = zzacxVar;
        zzaeb zzaebVarZzu = zzacxVar.zzu(1024, 4);
        this.zzg = zzaebVarZzu;
        zzs zzsVar = new zzs();
        String str = this.zzc;
        zzsVar.zzl(str);
        zzsVar.zzm(str);
        zzaebVarZzu.zzu(zzsVar.zzM());
        this.zzf.zzv();
        this.zzf.zzw(new zzady(androidx.media3.common.C.TIME_UNSET));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaeb zzaebVar = this.zzg;
        zzaebVar.getClass();
        int iZzy = zzaebVar.zzy(zzacvVar, 1024, true);
        if (iZzy == -1) {
            this.zze = 2;
            this.zzg.zzx(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZzy;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }
}
