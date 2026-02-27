package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzbwl implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzbwl zza = new zzbwl();

    private /* synthetic */ zzbwl() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterfaceQueryLocalInterface instanceof zzbwe ? (zzbwe) iInterfaceQueryLocalInterface : new zzbwe(iBinder);
    }
}
