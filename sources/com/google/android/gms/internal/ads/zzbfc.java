package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfc {
    private final Context zza;

    public zzbfc(Context context) {
        this.zza = context;
    }

    public final void zza(zzbtz zzbtzVar) {
        try {
            ((zzbfd) com.google.android.gms.ads.internal.util.client.zzs.zza(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbfb.zza)).zze(zzbtzVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e7) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e7.getMessage())));
        }
    }
}
