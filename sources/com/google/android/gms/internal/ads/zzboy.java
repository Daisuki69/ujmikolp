package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzboy extends zzaxz implements zzbpa {
    public zzboy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzA(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayb.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdf(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final com.google.android.gms.ads.internal.client.zzed zzB() throws RemoteException {
        Parcel parcelZzde = zzde(26, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpm zzC() throws RemoteException {
        zzbpm zzbpkVar;
        Parcel parcelZzde = zzde(27, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbpkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbpkVar = iInterfaceQueryLocalInterface instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface : new zzbpk(strongBinder);
        }
        parcelZzde.recycle();
        return zzbpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzF(IObjectWrapper iObjectWrapper, zzblo zzbloVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbloVar);
        parcelZza.writeTypedList(list);
        zzdf(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrl zzH() throws RemoteException {
        Parcel parcelZzde = zzde(33, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(parcelZzde, zzbrl.CREATOR);
        parcelZzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrl zzI() throws RemoteException {
        Parcel parcelZzde = zzde(34, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(parcelZzde, zzbrl.CREATOR);
        parcelZzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zzc(parcelZza, zzrVar);
        zzayb.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpg zzK() throws RemoteException {
        zzbpg zzbpeVar;
        Parcel parcelZzde = zzde(36, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbpeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbpeVar = iInterfaceQueryLocalInterface instanceof zzbpg ? (zzbpg) iInterfaceQueryLocalInterface : new zzbpe(strongBinder);
        }
        parcelZzde.recycle();
        return zzbpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpi zzO() throws RemoteException {
        zzbpi zzbpiVar;
        Parcel parcelZzde = zzde(15, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbpiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbpiVar = iInterfaceQueryLocalInterface instanceof zzbpi ? (zzbpi) iInterfaceQueryLocalInterface : new zzbpi(strongBinder);
        }
        parcelZzde.recycle();
        return zzbpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpj zzP() throws RemoteException {
        zzbpj zzbpjVar;
        Parcel parcelZzde = zzde(16, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbpjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpjVar = iInterfaceQueryLocalInterface instanceof zzbpj ? (zzbpj) iInterfaceQueryLocalInterface : new zzbpj(strongBinder);
        }
        parcelZzde.recycle();
        return zzbpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final IObjectWrapper zzf() throws RemoteException {
        return androidx.media3.datasource.cache.c.f(zzde(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzh() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzi() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zzc(parcelZza, zzrVar);
        zzayb.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzl() throws RemoteException {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzm() throws RemoteException {
        zzdf(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvs zzbvsVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zzc(parcelZza, zzmVar);
        parcelZza.writeString(null);
        zzayb.zze(parcelZza, zzbvsVar);
        parcelZza.writeString(str2);
        zzdf(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzdf(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzp() throws RemoteException {
        zzdf(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzde = zzde(13, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar, zzbfl zzbflVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zze(parcelZza, zzbpdVar);
        zzayb.zzc(parcelZza, zzbflVar);
        parcelZza.writeStringList(list);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzx() throws RemoteException {
        Parcel parcelZzde = zzde(22, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzy(IObjectWrapper iObjectWrapper, zzbvs zzbvsVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbvsVar);
        parcelZza.writeStringList(list);
        zzdf(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbgq zzz() throws RemoteException {
        throw null;
    }
}
