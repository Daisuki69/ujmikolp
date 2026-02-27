package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class zzvn implements zzvu {
    private final zzvu[] zza;

    public zzvn(zzvu... zzvuVarArr) {
        this.zza = zzvuVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvu
    public final zzvt zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzvu zzvuVar = this.zza[i];
            if (zzvuVar.zzc(cls)) {
                return zzvuVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvu
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
