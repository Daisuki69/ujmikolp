package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdug implements zzdtv {
    private final long zza;
    private final zzelq zzb;

    public zzdug(long j, Context context, zzdtz zzdtzVar, zzcgv zzcgvVar, String str) {
        this.zza = j;
        zzfap zzfapVarZzl = zzcgvVar.zzl();
        zzfapVarZzl.zzd(context);
        zzfapVarZzl.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzfapVarZzl.zzc(str);
        zzelq zzelqVarZza = zzfapVarZzl.zza().zza();
        this.zzb = zzelqVarZza;
        zzelqVarZza.zzdW(new zzduf(this, zzdtzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzb() {
        this.zzb.zzR(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzc() {
        this.zzb.zzc();
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }
}
