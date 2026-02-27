package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvb {
    private final Context zza;
    private final zzfdc zzb;
    private final Bundle zzc;

    @Nullable
    private final zzfcv zzd;

    @Nullable
    private final zzcut zze;

    @Nullable
    private final zzeee zzf;
    private final int zzg;

    public /* synthetic */ zzcvb(zzcva zzcvaVar, byte[] bArr) {
        this.zza = zzcvaVar.zzi();
        this.zzb = zzcvaVar.zzj();
        this.zzc = zzcvaVar.zzk();
        this.zzd = zzcvaVar.zzl();
        this.zze = zzcvaVar.zzm();
        this.zzf = zzcvaVar.zzn();
        this.zzg = zzcvaVar.zzo();
    }

    public final zzcva zza() {
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(this.zza);
        zzcvaVar.zzb(this.zzb);
        zzcvaVar.zzc(this.zzc);
        zzcvaVar.zzd(this.zze);
        zzcvaVar.zzg(this.zzf);
        return zzcvaVar;
    }

    public final zzfdc zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzfcv zzc() {
        return this.zzd;
    }

    @Nullable
    public final Bundle zzd() {
        return this.zzc;
    }

    @Nullable
    public final zzcut zze() {
        return this.zze;
    }

    public final Context zzf(Context context) {
        return this.zza;
    }

    public final zzeee zzg(String str) {
        zzeee zzeeeVar = this.zzf;
        return zzeeeVar != null ? zzeeeVar : new zzeee(str);
    }

    public final int zzh() {
        return this.zzg;
    }
}
