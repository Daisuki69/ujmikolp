package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzaz extends zzau {
    final /* synthetic */ zzba zza;

    public zzaz(zzba zzbaVar) {
        this.zza = zzbaVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzak.zza(i, this.zza.zzc, "index");
        int i4 = i + i;
        Object obj = this.zza.zzb[i4];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
