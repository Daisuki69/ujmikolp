package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjt implements zzbjl {
    private final zzdtp zza;

    public zzbjt(zzdtp zzdtpVar) {
        this.zza = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey(TtmlNode.ATTR_ID) || TextUtils.isEmpty((CharSequence) map.get(TtmlNode.ATTR_ID)) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(Long.parseLong((String) map.get(TtmlNode.ATTR_ID)), Integer.parseInt((String) map.get("event_type")), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e);
        }
    }
}
