package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeno implements zzeup {
    private final Context zza;
    private final zzgpd zzb;

    public zzeno(zzgpd zzgpdVar, Context context) {
        this.zzb = zzgpdVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznJ)).booleanValue()) {
            return zzgot.zza(new zzenp(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzgot.zza(new zzenp(null, false)) : this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzenp(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 61;
    }
}
