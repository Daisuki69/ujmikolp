package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes3.dex */
public final class zzent implements zzeun {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzent(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z4) {
        this.zza = zzxVar;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfT)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i = zzxVar.zza;
            if (i == 1) {
                bundle.putString("avo", TtmlNode.TAG_P);
            } else if (i == 2) {
                bundle.putString("avo", CmcdData.Factory.STREAM_TYPE_LIVE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zzb(Object obj) {
        q.a(this, obj);
    }
}
