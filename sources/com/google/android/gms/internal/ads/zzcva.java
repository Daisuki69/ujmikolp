package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcva {
    private Context zza;
    private zzfdc zzb;
    private Bundle zzc;

    @Nullable
    private zzfcv zzd;

    @Nullable
    private zzcut zze;

    @Nullable
    private zzeee zzf;
    private int zzg = 0;

    public final zzcva zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcva zzb(zzfdc zzfdcVar) {
        this.zzb = zzfdcVar;
        return this;
    }

    public final zzcva zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcva zzd(@Nullable zzcut zzcutVar) {
        this.zze = zzcutVar;
        return this;
    }

    public final zzcvb zze() {
        return new zzcvb(this, null);
    }

    public final zzcva zzf(zzfcv zzfcvVar) {
        this.zzd = zzfcvVar;
        return this;
    }

    public final zzcva zzg(@Nullable zzeee zzeeeVar) {
        this.zzf = zzeeeVar;
        return this;
    }

    public final zzcva zzh(int i) {
        this.zzg = i;
        return this;
    }

    public final /* synthetic */ Context zzi() {
        return this.zza;
    }

    public final /* synthetic */ zzfdc zzj() {
        return this.zzb;
    }

    public final /* synthetic */ Bundle zzk() {
        return this.zzc;
    }

    public final /* synthetic */ zzfcv zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzcut zzm() {
        return this.zze;
    }

    public final /* synthetic */ zzeee zzn() {
        return this.zzf;
    }

    public final /* synthetic */ int zzo() {
        return this.zzg;
    }
}
