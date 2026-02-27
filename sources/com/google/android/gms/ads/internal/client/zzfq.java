package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwd;
import com.google.android.gms.internal.ads.zzbwh;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzbwo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfq extends zzbvz {
    private static void zzu(final zzbwh zzbwhVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbwh zzbwhVar2 = zzbwhVar;
                if (zzbwhVar2 != null) {
                    try {
                        zzbwhVar2.zzf(1);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzc(zzm zzmVar, zzbwh zzbwhVar) throws RemoteException {
        zzu(zzbwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzd(zzm zzmVar, zzbwh zzbwhVar) throws RemoteException {
        zzu(zzbwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(zzbwd zzbwdVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(zzdq zzdqVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final Bundle zzg() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh(zzbwo zzbwoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final boolean zzi() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzj() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    @Nullable
    public final zzbvx zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final zzea zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    @Nullable
    public final String zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo(zzdt zzdtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzp(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final long zzq() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzr(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(zzbwi zzbwiVar) throws RemoteException {
    }
}
