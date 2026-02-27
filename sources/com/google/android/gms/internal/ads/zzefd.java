package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefd implements zzeef {
    private final Context zza;
    private final zzcpp zzb;
    private final Executor zzc;

    public zzefd(Context context, zzcpp zzcppVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcppVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzfdcVar.zzf;
        if (zzrVar2.zzn) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) ? new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : zzfdi.zza(this.zza, zzfcjVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) {
            ((zzfea) zzeecVar.zzb).zzb(this.zza, zzrVar3, zzfdcVar.zzd, zzfcjVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfcjVar.zzs), (zzbpd) zzeecVar.zzc);
        } else {
            ((zzfea) zzeecVar.zzb).zzg(this.zza, zzrVar3, zzfdcVar.zzd, zzfcjVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfcjVar.zzs), (zzbpd) zzeecVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, final zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) {
            zzbpg zzbpgVarZzc = ((zzfea) zzeecVar.zzb).zzc();
            if (zzbpgVarZzc == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfdj(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbpgVarZzc.zze());
                boolean zZzf = zzbpgVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfdj(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzefb
                            @Override // com.google.android.gms.internal.ads.zzgob
                            public final /* synthetic */ S1.y zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfcjVar, obj);
                            }
                        }, zzbzh.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfdj(e);
                    }
                }
            } catch (RemoteException e7) {
                throw new zzfdj(e7);
            }
        } else {
            viewZza = ((zzfea) zzeecVar.zzb).zza();
        }
        zzcpp zzcppVar = this.zzb;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza);
        final zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        Objects.requireNonNull(zzfeaVar);
        zzcol zzcolVarZzf = zzcppVar.zzf(zzcriVar, new zzcor(viewZza, null, new zzcqq() { // from class: com.google.android.gms.internal.ads.zzefc
            @Override // com.google.android.gms.internal.ads.zzcqq
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzfeaVar.zzt();
            }
        }, (zzfck) zzfcjVar.zzu.get(0)));
        zzcolVarZzf.zzk().zza(viewZza);
        zzcolVarZzf.zza().zzq(new zzcly(zzfeaVar), this.zzc);
        ((zzefo) zzeecVar.zzc).zzc(zzcolVarZzf.zzf());
        return zzcolVarZzf.zzi();
    }

    public final /* synthetic */ S1.y zzc(View view, zzfcj zzfcjVar, Object obj) {
        return zzgot.zza(zzcqe.zza(this.zza, view, zzfcjVar));
    }
}
