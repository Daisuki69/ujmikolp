package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkk {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkk() {
        this.zza = androidx.media3.common.C.TIME_UNSET;
        this.zzb = -3.4028235E38f;
        this.zzc = androidx.media3.common.C.TIME_UNSET;
    }

    public final zzkk zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzkk zzb(float f) {
        boolean z4 = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z4 = false;
        }
        zzghc.zza(z4);
        this.zzb = f;
        return this;
    }

    public final zzkk zzc(long j) {
        boolean z4 = true;
        if (j < 0) {
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = -9223372036854775807L;
            } else {
                z4 = false;
            }
        }
        zzghc.zza(z4);
        this.zzc = j;
        return this;
    }

    public final zzkl zzd() {
        return new zzkl(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public /* synthetic */ zzkk(zzkl zzklVar, byte[] bArr) {
        this.zza = zzklVar.zza;
        this.zzb = zzklVar.zzb;
        this.zzc = zzklVar.zzc;
    }
}
