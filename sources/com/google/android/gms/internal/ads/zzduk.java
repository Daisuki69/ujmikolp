package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzduk implements zzdtv {
    private final long zza;
    private final zzdtz zzb;
    private final zzfca zzc;

    public zzduk(long j, Context context, zzdtz zzdtzVar, zzcgv zzcgvVar, String str) {
        this.zza = j;
        this.zzb = zzdtzVar;
        zzfcc zzfccVarZzo = zzcgvVar.zzo();
        zzfccVarZzo.zzc(context);
        zzfccVarZzo.zzb(str);
        this.zzc = zzfccVarZzo.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzc(zzmVar, new zzdui(this));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzb() {
        try {
            zzfca zzfcaVar = this.zzc;
            zzfcaVar.zze(new zzduj(this));
            zzfcaVar.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzc() {
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzdtz zze() {
        return this.zzb;
    }
}
