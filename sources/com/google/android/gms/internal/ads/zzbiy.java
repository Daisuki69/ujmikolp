package com.google.android.gms.internal.ads;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbiy implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (map.containsKey(TtmlNode.START)) {
            zzcekVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzcekVar.zzP().zzs();
        } else if (map.containsKey("cancel")) {
            zzcekVar.zzP().zzt();
        }
    }
}
