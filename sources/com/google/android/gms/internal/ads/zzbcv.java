package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzbcv {
    private final Map zza = new HashMap();
    private final zzbcx zzb;

    public zzbcv(zzbcx zzbcxVar) {
        this.zzb = zzbcxVar;
    }

    public final void zza(String str, @Nullable zzbcu zzbcuVar) {
        this.zza.put(str, zzbcuVar);
    }

    public final void zzb(String str, String str2, long j) {
        Map map = this.zza;
        zzbcu zzbcuVar = (zzbcu) map.get(str2);
        String[] strArr = {str};
        if (zzbcuVar != null) {
            this.zzb.zzb(zzbcuVar, j, strArr);
        }
        map.put(str, new zzbcu(j, null, null));
    }

    public final zzbcx zzc() {
        return this.zzb;
    }
}
