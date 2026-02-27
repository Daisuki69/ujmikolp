package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbym implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbzm zzb;

    public zzbym(zzbyn zzbynVar, Context context, zzbzm zzbzmVar) {
        this.zza = context;
        this.zzb = zzbzmVar;
        Objects.requireNonNull(zzbynVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zzd(e);
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception while getting advertising Id info", e);
        }
    }
}
