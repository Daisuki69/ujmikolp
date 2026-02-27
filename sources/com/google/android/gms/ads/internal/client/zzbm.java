package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbm extends zzaya implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i4) throws RemoteException {
        if (i == 1) {
            zzb();
        } else {
            if (i != 2) {
                return false;
            }
            zze zzeVar = (zze) zzayb.zzb(parcel, zze.CREATOR);
            zzayb.zzh(parcel);
            zzc(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
