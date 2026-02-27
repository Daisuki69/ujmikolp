package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* JADX INFO: loaded from: classes3.dex */
public final class zzae extends zza implements IInterface {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    public final void zzc(zzad zzadVar, RegisterRequestParams registerRequestParams) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzadVar);
        zzc.zzd(parcelZza, registerRequestParams);
        zzb(1, parcelZza);
    }

    public final void zzd(zzad zzadVar, SignRequestParams signRequestParams) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzadVar);
        zzc.zzd(parcelZza, signRequestParams);
        zzb(2, parcelZza);
    }
}
