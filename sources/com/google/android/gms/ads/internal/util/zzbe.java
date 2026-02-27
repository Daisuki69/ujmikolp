package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbe {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbe zza(String str, double d10, double d11) {
        List list;
        int i = 0;
        while (true) {
            list = this.zza;
            if (i >= list.size()) {
                break;
            }
            double dDoubleValue = ((Double) this.zzc.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) this.zzb.get(i)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        list.add(i, str);
        this.zzc.add(i, Double.valueOf(d10));
        this.zzb.add(i, Double.valueOf(d11));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }

    public final /* synthetic */ List zzc() {
        return this.zza;
    }

    public final /* synthetic */ List zzd() {
        return this.zzb;
    }

    public final /* synthetic */ List zze() {
        return this.zzc;
    }
}
