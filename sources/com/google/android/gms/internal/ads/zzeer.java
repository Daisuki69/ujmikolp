package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeer implements zzeef {
    private final Context zza;
    private final zzcny zzb;

    public zzeer(Context context, zzcny zzcnyVar) {
        this.zza = context;
        this.zzb = zzcnyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        try {
            zzbqw zzbqwVar = (zzbqw) zzeecVar.zzb;
            zzbqwVar.zzo(zzfcjVar.zzZ);
            zzbqwVar.zzs(zzfcjVar.zzU, zzfcjVar.zzv.toString(), zzfcuVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeeq(zzeecVar, null), (zzbpd) zzeecVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfdj(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzefx zzefxVar = new zzefx(zzfcjVar, (zzbqw) zzeecVar.zzb, AdFormat.APP_OPEN_AD);
        zzcnv zzcnvVarZzf = this.zzb.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdfe(zzefxVar, null), new zzcnw(zzfcjVar.zzaa));
        zzefxVar.zzc(zzcnvVarZzf.zzd());
        ((zzefo) zzeecVar.zzc).zzc(zzcnvVarZzf.zzg());
        return zzcnvVarZzf.zzh();
    }
}
