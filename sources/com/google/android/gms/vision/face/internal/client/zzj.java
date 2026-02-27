package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzs;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj extends com.google.android.gms.internal.vision.zzb implements zzh {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final FaceParcel[] zza(IObjectWrapper iObjectWrapper, zzs zzsVar) throws RemoteException {
        Parcel parcelA_ = a_();
        com.google.android.gms.internal.vision.zzd.zza(parcelA_, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(parcelA_, zzsVar);
        Parcel parcelZza = zza(1, parcelA_);
        FaceParcel[] faceParcelArr = (FaceParcel[]) parcelZza.createTypedArray(FaceParcel.CREATOR);
        parcelZza.recycle();
        return faceParcelArr;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final FaceParcel[] zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i, int i4, int i6, int i10, int i11, int i12, zzs zzsVar) throws RemoteException {
        Parcel parcelA_ = a_();
        com.google.android.gms.internal.vision.zzd.zza(parcelA_, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(parcelA_, iObjectWrapper2);
        com.google.android.gms.internal.vision.zzd.zza(parcelA_, iObjectWrapper3);
        parcelA_.writeInt(i);
        parcelA_.writeInt(i4);
        parcelA_.writeInt(i6);
        parcelA_.writeInt(i10);
        parcelA_.writeInt(i11);
        parcelA_.writeInt(i12);
        com.google.android.gms.internal.vision.zzd.zza(parcelA_, zzsVar);
        Parcel parcelZza = zza(4, parcelA_);
        FaceParcel[] faceParcelArr = (FaceParcel[]) parcelZza.createTypedArray(FaceParcel.CREATOR);
        parcelZza.recycle();
        return faceParcelArr;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final boolean zza(int i) throws RemoteException {
        Parcel parcelA_ = a_();
        parcelA_.writeInt(i);
        Parcel parcelZza = zza(2, parcelA_);
        boolean zZza = com.google.android.gms.internal.vision.zzd.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final void zza() throws RemoteException {
        zzb(3, a_());
    }
}
