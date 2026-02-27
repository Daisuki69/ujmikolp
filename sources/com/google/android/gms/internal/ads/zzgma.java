package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzgma extends zzgke {
    final transient Object zza;

    public zzgma(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgke, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgki(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.zza.toString();
        return We.s.q(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
    }

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv
    /* JADX INFO: renamed from: zza */
    public final zzgmd iterator() {
        return new zzgki(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgke, com.google.android.gms.internal.ads.zzgjv
    public final zzgjz zze() {
        return zzgjz.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzg(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }
}
