package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpb extends zzaxz implements zzbpd {
    public zzbpb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzf() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzh() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzi() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzj() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzk() throws RemoteException {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzl(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdf(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzm(zzbgq zzbgqVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbgqVar);
        parcelZza.writeString(str);
        zzdf(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzn() throws RemoteException {
        zzdf(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzo() throws RemoteException {
        zzdf(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzp(zzbvt zzbvtVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzq() throws RemoteException {
        zzdf(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzr(zzbvx zzbvxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbvxVar);
        zzdf(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzs(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzt() throws RemoteException {
        zzdf(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzu() throws RemoteException {
        zzdf(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzw(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzdf(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzeVar);
        zzdf(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzeVar);
        zzdf(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzz() throws RemoteException {
        zzdf(25, zza());
    }
}
