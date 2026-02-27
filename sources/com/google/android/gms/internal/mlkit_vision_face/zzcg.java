package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes3.dex */
final class zzcg extends zzbn {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzcg(Object[] objArr, int i, int i4) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzab.zza(i, this.zzc, "index");
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
