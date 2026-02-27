package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcra implements zzehl {
    public final List zza;

    public zzcra(List list) {
        this.zza = list;
    }

    public static zzedz zza(@NonNull zzegf zzegfVar) {
        return new zzeea(zzegfVar, zzcqz.zza);
    }

    public static zzedz zzb(@NonNull zzedz zzedzVar) {
        return new zzeea(zzedzVar, zzcqy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgot.zzq((S1.y) it.next(), new zzcqx(this), zzgpk.zza());
        }
    }

    public zzcra(zzcqs zzcqsVar) {
        this.zza = Collections.singletonList(zzgot.zza(zzcqsVar));
    }
}
