package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes3.dex */
public class zzur extends zzuq implements zzvx {
    public zzur(zzus zzusVar) {
        super(zzusVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuq, com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzus zzp() {
        if (!((zzus) this.zza).zzI()) {
            return (zzus) this.zza;
        }
        ((zzus) this.zza).zzb.zzh();
        return (zzus) super.zzp();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuq
    public final void zzs() {
        super.zzs();
        if (((zzus) this.zza).zzb != zzum.zzd()) {
            zzus zzusVar = (zzus) this.zza;
            zzusVar.zzb = zzusVar.zzb.clone();
        }
    }
}
