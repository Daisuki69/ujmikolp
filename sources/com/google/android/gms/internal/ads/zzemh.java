package com.google.android.gms.internal.ads;

import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemh implements zzeun {
    private final boolean zza;

    public zzemh(boolean z4) {
        this.zza = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcuu) obj).zza.putString("adid_p", true != this.zza ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zzb(Object obj) {
        q.a(this, obj);
    }
}
