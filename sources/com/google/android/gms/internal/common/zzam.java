package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzam extends zzak {
    static final zzak zza = new zzam(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzam(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzv.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzak, com.google.android.gms.internal.common.zzag
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final Object[] zzg() {
        return this.zzb;
    }
}
