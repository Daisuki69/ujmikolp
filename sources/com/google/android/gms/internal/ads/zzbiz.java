package com.google.android.gms.internal.ads;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbiz implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (map.containsKey(TtmlNode.START)) {
            zzcekVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzcekVar.zzas(false);
        }
    }
}
