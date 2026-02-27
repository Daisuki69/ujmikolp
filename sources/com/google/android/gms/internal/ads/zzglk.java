package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzglk extends zzgjz {
    static final zzgjz zza = new zzglk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzglk(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzghc.zzm(i, this.zzc, "index");
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgjz, com.google.android.gms.internal.ads.zzgjv
    public final int zzg(Object[] objArr, int i) {
        Object[] objArr2 = this.zzb;
        int i4 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i, i4);
        return i + i4;
    }
}
