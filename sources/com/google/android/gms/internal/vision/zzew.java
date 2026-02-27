package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class zzew extends zzee<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzew(Object[] objArr, int i, int i4) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzde.zza(i, this.zzc);
        return this.zza[(i * 2) + this.zzb];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.vision.zzeb
    public final boolean zzf() {
        return true;
    }
}
