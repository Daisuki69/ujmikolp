package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes3.dex */
final class zzbm extends zzbn {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbn zzc;

    public zzbm(zzbn zzbnVar, int i, int i4) {
        this.zzc = zzbnVar;
        this.zza = i;
        this.zzb = i4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzab.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbn subList(int i, int i4) {
        zzab.zzc(i, i4, this.zzb);
        zzbn zzbnVar = this.zzc;
        int i6 = this.zza;
        return zzbnVar.subList(i + i6, i4 + i6);
    }
}
