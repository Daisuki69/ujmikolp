package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzefh extends zzbqj {
    final /* synthetic */ zzefi zza;
    private final zzeec zzb;

    public /* synthetic */ zzefh(zzefi zzefiVar, zzeec zzeecVar, byte[] bArr) {
        Objects.requireNonNull(zzefiVar);
        this.zza = zzefiVar;
        this.zzb = zzeecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzd((View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzefo) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf(String str) throws RemoteException {
        ((zzefo) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzefo) this.zzb.zzc).zzx(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzh(zzbpg zzbpgVar) throws RemoteException {
        this.zza.zze(zzbpgVar);
        ((zzefo) this.zzb.zzc).zzj();
    }
}
