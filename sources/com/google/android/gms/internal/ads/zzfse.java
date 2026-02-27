package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfse implements zzhpx {
    private final zzhqg zza;

    private zzfse(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzfse zza(zzhqg zzhqgVar) {
        return new zzfse(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzchb) this.zza).zza();
        kotlin.jvm.internal.j.g(context, "context");
        DataStore dataStoreCreate$default = DataStoreFactory.create$default(DataStoreFactory.INSTANCE, zzfsc.zza, null, null, null, new Function0() { // from class: com.google.android.gms.internal.ads.zzfsd
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Object invoke() {
                return DataStoreFile.dataStoreFile(context, "ad_quality_data.pb");
            }
        }, 14, null);
        zzhqf.zzb(dataStoreCreate$default);
        return dataStoreCreate$default;
    }
}
