package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzghk implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzghq zzb;

    public zzghk(zzghq zzghqVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzghqVar);
        this.zzb = zzghqVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzggw.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
