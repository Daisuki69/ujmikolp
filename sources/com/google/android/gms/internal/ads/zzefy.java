package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzefy implements zzdgp {
    final /* synthetic */ zzeec zza;
    final /* synthetic */ zzfcj zzb;
    final /* synthetic */ zzefz zzc;

    public zzefy(zzefz zzefzVar, zzeec zzeecVar, zzfcj zzfcjVar) {
        this.zza = zzeecVar;
        this.zzb = zzfcjVar;
        Objects.requireNonNull(zzefzVar);
        this.zzc = zzefzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z4, Context context, @Nullable zzcwf zzcwfVar) throws zzdgo {
        try {
            zzfea zzfeaVar = (zzfea) this.zza.zzb;
            zzfeaVar.zzs(z4);
            if (this.zzc.zzc().clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaX)).intValue()) {
                zzfeaVar.zzd();
            } else {
                zzfeaVar.zze(context);
            }
        } catch (zzfdj e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot show interstitial.");
            throw new zzdgo(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    @Nullable
    public final zzfcj zzb() {
        return this.zzb;
    }
}
