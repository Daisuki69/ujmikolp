package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzdhk implements zzbjl {
    private final WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        zzdho zzdhoVar = (zzdho) this.zza.get();
        if (zzdhoVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdhoVar.zzD().onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlB)).booleanValue()) {
                zzdhoVar.zzE().zzdz();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdhoVar.zzE().zzdV();
            }
        }
    }
}
