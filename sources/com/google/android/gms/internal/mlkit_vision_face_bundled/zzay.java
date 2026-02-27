package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzay extends zzau {
    static final zzau zza = new zzay(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzay(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzak.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzau, com.google.android.gms.internal.mlkit_vision_face_bundled.zzaq
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzaq
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzaq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzaq
    public final Object[] zze() {
        return this.zzb;
    }
}
