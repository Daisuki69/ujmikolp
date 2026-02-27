package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class zzgid extends zzgiu implements zzgkk {
    public zzgid(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgiu
    public final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgiu
    public final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgiu
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
