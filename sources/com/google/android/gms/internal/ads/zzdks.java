package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzdks implements zzgoq {
    final /* synthetic */ zzdku zza;

    public zzdks(zzdku zzdkuVar) {
        Objects.requireNonNull(zzdkuVar);
        this.zza = zzdkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfR)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcek zzcekVar = (zzcek) list.get(0);
            if (zzcekVar != null) {
                this.zza.zza(zzcekVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfR)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "omid native display exp");
            }
        }
    }
}
