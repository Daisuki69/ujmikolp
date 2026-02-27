package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzgll extends zzgjz {
    final /* synthetic */ zzglm zza;

    public zzgll(zzglm zzglmVar) {
        Objects.requireNonNull(zzglmVar);
        this.zza = zzglmVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzglm zzglmVar = this.zza;
        zzghc.zzm(i, zzglmVar.zzw(), "index");
        int i4 = i + i;
        Object obj = zzglmVar.zzv()[i4];
        Objects.requireNonNull(obj);
        Object obj2 = zzglmVar.zzv()[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final boolean zzf() {
        return true;
    }
}
