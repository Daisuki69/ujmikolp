package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbox;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcz extends zzaxz implements zzdb {
    public zzcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzf(float f) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayb.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzayb.zze(parcelZza, iObjectWrapper);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final float zzk() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        float f = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() throws RemoteException {
        Parcel parcelZzde = zzde(9, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbox zzboxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzboxVar);
        zzdf(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzblr zzblrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzblrVar);
        zzdf(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() throws RemoteException {
        Parcel parcelZzde = zzde(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzde.createTypedArrayList(zzblk.CREATOR);
        parcelZzde.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(zzfv zzfvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzfvVar);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() throws RemoteException {
        zzdf(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(zzdn zzdnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzdnVar);
        zzdf(16, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayb.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdf(17, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(18, parcelZza);
    }
}
