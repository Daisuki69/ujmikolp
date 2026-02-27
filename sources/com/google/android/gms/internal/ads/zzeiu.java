package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeiu implements zzeeb {
    private final zzejy zza;
    private final zzdqc zzb;

    public zzeiu(zzejy zzejyVar, zzdqc zzdqcVar) {
        this.zza = zzejyVar;
        this.zzb = zzdqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    @Nullable
    public final zzeec zza(String str, JSONObject jSONObject) throws zzfdj {
        zzbqw zzbqwVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbR)).booleanValue()) {
            try {
                zzbqwVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e);
                zzbqwVarZzb = null;
            }
        } else {
            zzbqwVarZzb = this.zza.zzb(str);
        }
        if (zzbqwVarZzb == null) {
            return null;
        }
        return new zzeec(zzbqwVarZzb, new zzefo(), str);
    }
}
