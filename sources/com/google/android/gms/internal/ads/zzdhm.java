package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzdhm implements zzbjl {
    private final WeakReference zza;
    private final WeakReference zzb;

    public /* synthetic */ zzdhm(zzdho zzdhoVar, View view, byte[] bArr) {
        this.zza = new WeakReference(zzdhoVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznK)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        zzdho zzdhoVar = (zzdho) this.zza.get();
        if (zzdhoVar == null) {
            return;
        }
        zzdhoVar.zzC().zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznK)).booleanValue()) {
            zzdhoVar.zzB((View) this.zzb.get());
        }
    }
}
