package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzevi implements zzgob {
    static final /* synthetic */ zzevi zza = new zzevi();

    private /* synthetic */ zzevi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ S1.y zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzgot.zza(new zzevk("", 1, null));
        }
        zzhme zzhmeVarZzc = zzhmf.zzc();
        for (Topic topic : getTopicsResponse.getTopics()) {
            zzhmc zzhmcVarZzc = zzhmd.zzc();
            zzhmcVarZzc.zza(topic.getTopicId());
            zzhmcVarZzc.zzb(topic.getModelVersion());
            zzhmcVarZzc.zzc(topic.getTaxonomyVersion());
            zzhmeVarZzc.zza((zzhmd) zzhmcVarZzc.zzbu());
        }
        return zzgot.zza(new zzevk(Base64.encodeToString(((zzhmf) zzhmeVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
