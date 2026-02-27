package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes3.dex */
final class zzay extends zzaz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaz zzc;

    public zzay(zzaz zzazVar, int i, int i4) {
        this.zzc = zzazVar;
        this.zza = i;
        this.zzb = i4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzas.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    /* JADX INFO: renamed from: zzf */
    public final zzaz subList(int i, int i4) {
        zzas.zze(i, i4, this.zzb);
        zzaz zzazVar = this.zzc;
        int i6 = this.zza;
        return zzazVar.subList(i + i6, i4 + i6);
    }
}
