package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqk {

    @Nullable
    private final Context zza;
    private final zzoz zzb;
    private boolean zzc;
    private final zzqj zzd;

    @Nullable
    private zzqm zze;
    private zzqi zzf;

    @Deprecated
    public zzqk() {
        this.zza = null;
        this.zzb = zzoz.zza;
        this.zzd = zzqj.zza;
    }

    public final zzrc zza() {
        zzghc.zzh(!this.zzc);
        this.zzc = true;
        if (this.zze == null) {
            this.zze = new zzqm(new zzcf[0]);
        }
        if (this.zzf == null) {
            this.zzf = new zzqi(this.zza);
        }
        return new zzrc(this, null);
    }

    public final /* synthetic */ Context zzb() {
        return this.zza;
    }

    public final /* synthetic */ zzoz zzc() {
        return this.zzb;
    }

    public final /* synthetic */ zzqm zzd() {
        return this.zze;
    }

    public final /* synthetic */ zzqi zze() {
        return this.zzf;
    }

    public zzqk(Context context) {
        this.zza = context;
        this.zzb = zzoz.zza;
        this.zzd = zzqj.zza;
    }
}
