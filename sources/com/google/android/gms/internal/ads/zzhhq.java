package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhhq {
    private final Object zza;
    private final int zzb;

    public zzhhq(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhq)) {
            return false;
        }
        zzhhq zzhhqVar = (zzhhq) obj;
        return this.zza == zzhhqVar.zza && this.zzb == zzhhqVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
