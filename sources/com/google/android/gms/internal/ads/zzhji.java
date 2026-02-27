package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhji implements zzhjq {
    private final zzhjq[] zza;

    public zzhji(zzhjq... zzhjqVarArr) {
        this.zza = zzhjqVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhjq
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhjq
    public final zzhjp zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzhjq zzhjqVar = this.zza[i];
            if (zzhjqVar.zzb(cls)) {
                return zzhjqVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
