package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzclg implements zzgob {
    static final /* synthetic */ zzclg zza = new zzclg();

    private /* synthetic */ zzclg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ S1.y zza(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlk)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzgot.zza(new GetTopicsResponse(zzgjz.zzi()));
    }
}
