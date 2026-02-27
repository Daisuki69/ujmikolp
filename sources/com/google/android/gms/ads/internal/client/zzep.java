package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.zzbmg;

/* JADX INFO: loaded from: classes2.dex */
public final class zzep extends com.google.android.gms.ads.preload.zzb {
    public zzep(Context context) {
        super(context, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final InterstitialAd zza(String str) {
        zzbx zzbxVarZzo;
        try {
            zzbxVarZzo = this.zza.zzo(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbxVarZzo = null;
        }
        if (zzbxVarZzo == null) {
            return null;
        }
        return new zzbmg(zzj(), zzbxVarZzo);
    }
}
