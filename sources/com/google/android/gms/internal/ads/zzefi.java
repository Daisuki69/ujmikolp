package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefi implements zzeef {
    private final Context zza;
    private final zzcpp zzb;
    private View zzc;
    private zzbpg zzd;

    public zzefi(Context context, zzcpp zzcppVar) {
        this.zza = context;
        this.zzb = zzcppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        try {
            zzbqw zzbqwVar = (zzbqw) zzeecVar.zzb;
            zzbqwVar.zzo(zzfcjVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) {
                String str = zzfcjVar.zzU;
                String string = zzfcjVar.zzv.toString();
                zzfdc zzfdcVar = zzfcuVar.zza.zza;
                zzbqwVar.zzq(str, string, zzfdcVar.zzd, ObjectWrapper.wrap(this.zza), new zzefh(this, zzeecVar, null), (zzbpd) zzeecVar.zzc, zzfdcVar.zzf);
                return;
            }
            String str2 = zzfcjVar.zzU;
            String string2 = zzfcjVar.zzv.toString();
            zzfdc zzfdcVar2 = zzfcuVar.zza.zza;
            zzbqwVar.zzi(str2, string2, zzfdcVar2.zzd, ObjectWrapper.wrap(this.zza), new zzefh(this, zzeecVar, null), (zzbpd) zzeecVar.zzc, zzfdcVar2.zzf);
        } catch (RemoteException e) {
            throw new zzfdj(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, final zzfcj zzfcjVar, final zzeec zzeecVar) throws zzfdj, zzeho {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfdj(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzeff
                            @Override // com.google.android.gms.internal.ads.zzgob
                            public final /* synthetic */ S1.y zza(Object obj) {
                                return this.zza.zzc(view, zzfcjVar, obj);
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
            view = this.zzc;
        }
        zzcol zzcolVarZzf = this.zzb.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzcor(view, null, new zzcqq() { // from class: com.google.android.gms.internal.ads.zzefg
            @Override // com.google.android.gms.internal.ads.zzcqq
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() throws zzfdj {
                try {
                    return ((zzbqw) zzeecVar.zzb).zzh();
                } catch (RemoteException e10) {
                    throw new zzfdj(e10);
                }
            }
        }, (zzfck) zzfcjVar.zzu.get(0)));
        zzcolVarZzf.zzk().zza(view);
        ((zzefo) zzeecVar.zzc).zzc(zzcolVarZzf.zzg());
        return zzcolVarZzf.zzi();
    }

    public final /* synthetic */ S1.y zzc(View view, zzfcj zzfcjVar, Object obj) {
        return zzgot.zza(zzcqe.zza(this.zza, view, zzfcjVar));
    }

    public final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    public final /* synthetic */ void zze(zzbpg zzbpgVar) {
        this.zzd = zzbpgVar;
    }
}
