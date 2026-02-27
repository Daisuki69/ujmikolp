package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbab;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeo extends com.google.android.gms.ads.preload.zzb {
    public zzeo(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final AppOpenAd zza(String str) {
        zzbab zzbabVarZzp;
        try {
            zzbabVarZzp = this.zza.zzp(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbabVarZzp = null;
        }
        if (zzbabVarZzp == null) {
            return null;
        }
        return new zzazx(zzbabVarZzp);
    }
}
