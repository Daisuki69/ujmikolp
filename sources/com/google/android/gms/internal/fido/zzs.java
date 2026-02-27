package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzs extends zza implements IInterface {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    public final void zzc(zzr zzrVar, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzrVar);
        zzc.zzd(parcelZza, publicKeyCredentialCreationOptions);
        zzb(1, parcelZza);
    }

    public final void zzd(zzr zzrVar, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzrVar);
        zzc.zzd(parcelZza, publicKeyCredentialRequestOptions);
        zzb(2, parcelZza);
    }

    public final void zze(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzeVar);
        zzb(3, parcelZza);
    }
}
