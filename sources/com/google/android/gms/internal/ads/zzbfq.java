package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfq extends NativeAd.AdChoicesInfo {
    private final zzbfp zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbfq(zzbfp zzbfpVar) {
        IBinder iBinder;
        this.zza = zzbfpVar;
        try {
            this.zzc = zzbfpVar.zzb();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbfpVar.zzc()) {
                zzbfw zzbfuVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbfuVar = iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfu(iBinder);
                }
                if (zzbfuVar != null) {
                    this.zzb.add(new zzbfx(zzbfuVar));
                }
            }
        } catch (RemoteException e7) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e7);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
