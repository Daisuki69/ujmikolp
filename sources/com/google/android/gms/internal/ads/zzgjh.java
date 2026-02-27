package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzgjh extends AbstractSet {
    final /* synthetic */ zzgjk zza;

    public /* synthetic */ zzgjh(zzgjk zzgjkVar, byte[] bArr) {
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgjk zzgjkVar = this.zza;
        Map mapZzc = zzgjkVar.zzc();
        return mapZzc != null ? mapZzc.keySet().iterator() : new zzgjc(zzgjkVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgjk zzgjkVar = this.zza;
        Map mapZzc = zzgjkVar.zzc();
        return mapZzc != null ? mapZzc.keySet().remove(obj) : zzgjkVar.zzj(obj) != zzgjk.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
