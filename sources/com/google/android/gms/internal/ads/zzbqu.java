package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqu extends zzaxz implements zzbqw {
    public zzbqu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbqz zzbqzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzayb.zzc(parcelZza, bundle);
        zzayb.zzc(parcelZza, bundle2);
        zzayb.zzc(parcelZza, zzrVar);
        zzayb.zze(parcelZza, zzbqzVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final zzbrl zzf() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(parcelZzde, zzbrl.CREATOR);
        parcelZzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final zzbrl zzg() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(parcelZzde, zzbrl.CREATOR);
        parcelZzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqk zzbqkVar, zzbpd zzbpdVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbqkVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzayb.zzc(parcelZza, zzrVar);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqn zzbqnVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbqnVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzde = zzde(15, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqt zzbqtVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbqtVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzde = zzde(17, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqq zzbqqVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbqqVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzo(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqt zzbqtVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbqtVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqk zzbqkVar, zzbpd zzbpdVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbqkVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzayb.zzc(parcelZza, zzrVar);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqq zzbqqVar, zzbpd zzbpdVar, zzbfl zzbflVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbqqVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzayb.zzc(parcelZza, zzbflVar);
        zzdf(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqh zzbqhVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, zzmVar);
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzbqhVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzde = zzde(24, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }
}
