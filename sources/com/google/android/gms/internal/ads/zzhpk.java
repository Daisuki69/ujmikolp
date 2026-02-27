package com.google.android.gms.internal.ads;

import android.util.Log;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhpk extends zzhpp {
    final String zza;

    public zzhpk(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhpp
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.c(androidx.media3.datasource.cache.c.c(1, str2), str));
        sb2.append(str2);
        sb2.append(Global.COLON);
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}
