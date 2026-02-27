package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt extends zza implements IInterface {
    public zzt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
    }

    public final void zzc(zzv zzvVar, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzvVar);
        zzc.zzd(parcelZza, sourceStartDirectTransferOptions);
        zzc.zzd(parcelZza, parcelFileDescriptor);
        zzc.zzd(parcelZza, parcelFileDescriptor2);
        zzb(1, parcelZza);
    }
}
