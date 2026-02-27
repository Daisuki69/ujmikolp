package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdic extends zzbfs {
    private final zzdiu zza;
    private IObjectWrapper zzb;

    public zzdic(zzdiu zzdiuVar) {
        this.zza = zzdiuVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zze() throws RemoteException {
        zzcgt zzcgtVarZzN;
        int i;
        int i4;
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar.zzab() != 0.0f) {
            return zzdiuVar.zzab();
        }
        if (zzdiuVar.zzy() != null) {
            try {
                return zzdiuVar.zzy().zzm();
            } catch (RemoteException e) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzng)).booleanValue() && zzdiuVar.zzU() != null && (zzcgtVarZzN = zzdiuVar.zzU().zzN()) != null && (i = zzcgtVarZzN.zzb) >= 0 && (i4 = zzcgtVarZzN.zza) > 0) {
            return i / i4;
        }
        zzbfw zzbfwVarZzD = zzdiuVar.zzD();
        if (zzbfwVarZzD == null) {
            return 0.0f;
        }
        float fZze = (zzbfwVarZzD.zze() == -1 || zzbfwVarZzD.zzf() == -1) ? 0.0f : zzbfwVarZzD.zze() / zzbfwVarZzD.zzf();
        return fZze == 0.0f ? zzb(zzbfwVarZzD.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    @Nullable
    public final IObjectWrapper zzg() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbfw zzbfwVarZzD = this.zza.zzD();
        if (zzbfwVarZzD == null) {
            return null;
        }
        return zzbfwVarZzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzh() throws RemoteException {
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar.zzy() != null) {
            return zzdiuVar.zzy().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzi() throws RemoteException {
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar.zzy() != null) {
            return zzdiuVar.zzy().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzed zzj() throws RemoteException {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzk() throws RemoteException {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzl() throws RemoteException {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzm(zzbhe zzbheVar) {
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar.zzy() instanceof zzcfq) {
            ((zzcfq) zzdiuVar.zzy()).zzv(zzbheVar);
        }
    }
}
