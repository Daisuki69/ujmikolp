package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegq implements zzeef {
    private final Context zza;
    private final zzdhd zzb;
    private zzbpm zzc;
    private final VersionInfoParcel zzd;

    public zzegq(Context context, zzdhd zzdhdVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdhdVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        try {
            zzbqw zzbqwVar = (zzbqw) zzeecVar.zzb;
            zzbqwVar.zzo(zzfcjVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbU)).intValue()) {
                zzbqwVar.zzn(zzfcjVar.zzU, zzfcjVar.zzv.toString(), zzfcuVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegp(this, zzeecVar, null), (zzbpd) zzeecVar.zzc);
                return;
            }
            String str = zzfcjVar.zzU;
            String string = zzfcjVar.zzv.toString();
            zzfdc zzfdcVar = zzfcuVar.zza.zza;
            zzbqwVar.zzr(str, string, zzfdcVar.zzd, ObjectWrapper.wrap(this.zza), new zzegp(this, zzeecVar, null), (zzbpd) zzeecVar.zzc, zzfdcVar.zzj);
        } catch (RemoteException e) {
            throw new zzfdj(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzeho, zzfdj {
        ArrayList arrayList = zzfcuVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzeho(2, "Unified must be used for RTB.");
        }
        zzdiu zzdiuVarZzaf = zzdiu.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdiuVarZzaf.zzx()))) {
            throw new zzeho(1, "No corresponding native ad listener");
        }
        zzdiw zzdiwVarZze = this.zzb.zze(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdjf(zzdiuVarZzaf), new zzdky(null, null, this.zzc));
        ((zzefo) zzeecVar.zzc).zzc(zzdiwVarZze.zzg());
        return zzdiwVarZze.zzh();
    }

    public final /* synthetic */ void zzc(zzbpm zzbpmVar) {
        this.zzc = zzbpmVar;
    }
}
