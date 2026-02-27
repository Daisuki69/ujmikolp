package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaai {
    private final Context zza;
    private final zzaau zzb;
    private zzbr zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
    private final zzaav zzh = new zzaav(1.0f);
    private zzdb zze = zzdb.zza;

    public zzaai(Context context, zzaau zzaauVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaauVar;
    }

    public final zzaai zza(boolean z4) {
        this.zzd = true;
        return this;
    }

    public final zzaai zzb(zzdb zzdbVar) {
        this.zze = zzdbVar;
        return this;
    }

    public final zzaai zzc(long j) {
        this.zzg = j;
        return this;
    }

    public final zzaaq zzd() {
        zzghc.zzh(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzaao(false);
        }
        zzaaq zzaaqVar = new zzaaq(this, null);
        this.zzf = true;
        return zzaaqVar;
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zzaau zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzbr zzg() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    public final /* synthetic */ zzdb zzi() {
        return this.zze;
    }

    public final /* synthetic */ long zzj() {
        return this.zzg;
    }

    public final /* synthetic */ zzaav zzk() {
        return this.zzh;
    }
}
