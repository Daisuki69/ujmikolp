package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final class zzerm implements zzeun {
    public final String zza;
    public final boolean zzb;

    public zzerm(String str, boolean z4) {
        this.zza = str;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcuu) obj).zzb.putString("gct", this.zza);
    }
}
