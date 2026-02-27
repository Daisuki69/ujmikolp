package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class zzed<E> extends zzdm<E> {
    private final zzee<E> zza;

    public zzed(zzee<E> zzeeVar, int i) {
        super(zzeeVar.size(), i);
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.vision.zzdm
    public final E zza(int i) {
        return this.zza.get(i);
    }
}
