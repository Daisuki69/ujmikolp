package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdbs {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;

    @Nullable
    private final zzezy zzo;
    private zzcvu zzp;

    public /* synthetic */ zzdbs(zzdbr zzdbrVar, byte[] bArr) {
        this.zza = zzdbrVar.zzq();
        this.zzb = zzdbrVar.zzr();
        this.zzd = zzdbrVar.zzt();
        this.zze = zzdbrVar.zzu();
        this.zzc = zzdbrVar.zzs();
        this.zzf = zzdbrVar.zzv();
        this.zzg = zzdbrVar.zzo();
        this.zzh = zzdbrVar.zzw();
        this.zzi = zzdbrVar.zzz();
        this.zzj = zzdbrVar.zzx();
        this.zzk = zzdbrVar.zzy();
        this.zzl = zzdbrVar.zzA();
        this.zzo = zzdbrVar.zzC();
        this.zzm = zzdbrVar.zzB();
        this.zzn = zzdbrVar.zzp();
    }

    public final Set zza() {
        return this.zzc;
    }

    public final Set zzb() {
        return this.zzf;
    }

    public final Set zzc() {
        return this.zzh;
    }

    public final Set zzd() {
        return this.zzi;
    }

    public final Set zze() {
        return this.zzj;
    }

    public final Set zzf() {
        return this.zzk;
    }

    public final Set zzg() {
        return this.zza;
    }

    public final Set zzh() {
        return this.zzb;
    }

    public final Set zzi() {
        return this.zzd;
    }

    public final Set zzj() {
        return this.zze;
    }

    public final Set zzk() {
        return this.zzl;
    }

    public final Set zzl() {
        return this.zzn;
    }

    public final Set zzm() {
        return this.zzg;
    }

    public final Set zzn() {
        return this.zzm;
    }

    @Nullable
    public final zzezy zzo() {
        return this.zzo;
    }

    public final zzcvu zzp(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzcvu(set);
        }
        return this.zzp;
    }
}
