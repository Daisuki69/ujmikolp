package com.google.android.gms.internal.ads;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbit implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        ((zzcek) obj).zzaj(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("custom_close")));
    }
}
