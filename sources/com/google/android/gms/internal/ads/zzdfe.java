package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class zzdfe {
    private final zzdgp zza;

    @Nullable
    private final zzcek zzb;

    public zzdfe(zzdgp zzdgpVar, @Nullable zzcek zzcekVar) {
        this.zza = zzdgpVar;
        this.zzb = zzcekVar;
    }

    public final zzdgp zza() {
        return this.zza;
    }

    @Nullable
    public final zzcek zzb() {
        return this.zzb;
    }

    @Nullable
    public final View zzc() {
        zzcek zzcekVar = this.zzb;
        if (zzcekVar != null) {
            return zzcekVar.zzD();
        }
        return null;
    }

    @Nullable
    public final View zzd() {
        zzcek zzcekVar = this.zzb;
        if (zzcekVar == null) {
            return null;
        }
        return zzcekVar.zzD();
    }

    public Set zze(zzcuj zzcujVar) {
        return Collections.singleton(new zzddr(zzcujVar, zzbzh.zzg));
    }

    public Set zzf(zzcuj zzcujVar) {
        return Collections.singleton(new zzddr(zzcujVar, zzbzh.zzg));
    }

    public final zzddr zzg(Executor executor) {
        final zzcek zzcekVar = this.zzb;
        return new zzddr(new zzdap() { // from class: com.google.android.gms.internal.ads.zzdfc
            @Override // com.google.android.gms.internal.ads.zzdap
            public final /* synthetic */ void zza() {
                com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL;
                zzcek zzcekVar2 = zzcekVar;
                if (zzcekVar2 == null || (zzlVarZzL = zzcekVar2.zzL()) == null) {
                    return;
                }
                zzlVarZzL.zzb();
            }
        }, executor);
    }
}
