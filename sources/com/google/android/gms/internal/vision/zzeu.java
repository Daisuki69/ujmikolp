package com.google.android.gms.internal.vision;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzeu extends zzee {
    private final /* synthetic */ zzer zza;

    public zzeu(zzer zzerVar) {
        this.zza = zzerVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzde.zza(i, this.zza.zzd);
        int i4 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.zza.zzb[i4], this.zza.zzb[i4 + 1]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzd;
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    public final boolean zzf() {
        return true;
    }
}
