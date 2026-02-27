package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzn extends zza implements IInterface {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    public final void zzc(zzg zzgVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzgVar);
        parcelZza.writeString(str);
        zzb(4, parcelZza);
    }

    public final void zzd(zzm zzmVar, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzmVar);
        zzc.zzd(parcelZza, browserPublicKeyCredentialCreationOptions);
        zzb(1, parcelZza);
    }

    public final void zze(zzm zzmVar, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzmVar);
        zzc.zzd(parcelZza, browserPublicKeyCredentialRequestOptions);
        zzb(2, parcelZza);
    }

    public final void zzf(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzeVar);
        zzb(3, parcelZza);
    }
}
