package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.android.gms.ads.MobileAds;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedx {
    private final Context zza;

    public zzedx(Context context) {
        this.zza = context;
    }

    public final S1.y zza(boolean z4) {
        try {
            GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z4).build();
            TopicsManagerFutures topicsManagerFuturesFrom = TopicsManagerFutures.from(this.zza);
            return topicsManagerFuturesFrom != null ? topicsManagerFuturesFrom.getTopicsAsync(getTopicsRequestBuild) : zzgot.zzc(new IllegalStateException());
        } catch (Exception e) {
            return zzgot.zzc(e);
        }
    }
}
