package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbox;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdx extends zzaxz implements IInterface {
    public zzdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdw zze(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        zzdw zzduVar;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, iObjectWrapper);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(1, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzduVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzduVar = iInterfaceQueryLocalInterface instanceof zzdw ? (zzdw) iInterfaceQueryLocalInterface : new zzdu(strongBinder);
        }
        parcelZzde.recycle();
        return zzduVar;
    }
}
