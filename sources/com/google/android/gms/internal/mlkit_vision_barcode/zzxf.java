package com.google.android.gms.internal.mlkit_vision_barcode;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
final class zzxf extends zzxm {
    private final int zzb;
    private final int zzc;
    private final float zzd;
    private final float zze;
    private final boolean zzf;
    private final float zzg;
    private final float zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final float zzl;
    private final float zzm;

    public /* synthetic */ zzxf(int i, int i4, float f, float f3, boolean z4, float f7, float f10, long j, long j6, boolean z5, float f11, float f12, zzxe zzxeVar) {
        this.zzb = i;
        this.zzc = i4;
        this.zzd = f;
        this.zze = f3;
        this.zzf = z4;
        this.zzg = f7;
        this.zzh = f10;
        this.zzi = j;
        this.zzj = j6;
        this.zzk = z5;
        this.zzl = f11;
        this.zzm = f12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxm) {
            zzxm zzxmVar = (zzxm) obj;
            if (this.zzb == zzxmVar.zzh() && this.zzc == zzxmVar.zzg() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxmVar.zzd()) && Float.floatToIntBits(this.zze) == Float.floatToIntBits(zzxmVar.zzc()) && this.zzf == zzxmVar.zzl() && Float.floatToIntBits(this.zzg) == Float.floatToIntBits(zzxmVar.zzb()) && Float.floatToIntBits(this.zzh) == Float.floatToIntBits(zzxmVar.zza()) && this.zzi == zzxmVar.zzj() && this.zzj == zzxmVar.zzi() && this.zzk == zzxmVar.zzk() && Float.floatToIntBits(this.zzl) == Float.floatToIntBits(zzxmVar.zze()) && Float.floatToIntBits(this.zzm) == Float.floatToIntBits(zzxmVar.zzf())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.zzb ^ 1000003) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(this.zze)) * 1000003) ^ (true != this.zzf ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzg)) * 1000003) ^ Float.floatToIntBits(this.zzh)) * 1000003) ^ ((int) this.zzi)) * 1000003) ^ ((int) this.zzj)) * 1000003) ^ (true != this.zzk ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzl)) * 1000003) ^ Float.floatToIntBits(this.zzm);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoZoomOptions{recentFramesToCheck=");
        sb2.append(this.zzb);
        sb2.append(", recentFramesContainingPredictedArea=");
        sb2.append(this.zzc);
        sb2.append(", recentFramesIou=");
        sb2.append(this.zzd);
        sb2.append(", maxCoverage=");
        sb2.append(this.zze);
        sb2.append(", useConfidenceScore=");
        sb2.append(this.zzf);
        sb2.append(", lowerConfidenceScore=");
        sb2.append(this.zzg);
        sb2.append(", higherConfidenceScore=");
        sb2.append(this.zzh);
        sb2.append(", zoomIntervalInMillis=");
        sb2.append(this.zzi);
        sb2.append(", resetIntervalInMillis=");
        sb2.append(this.zzj);
        sb2.append(", enableZoomThreshold=");
        sb2.append(this.zzk);
        sb2.append(", zoomInThreshold=");
        sb2.append(this.zzl);
        sb2.append(", zoomOutThreshold=");
        return s.n(sb2, "}", this.zzm);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zze() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzf() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final int zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final long zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final long zzj() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final boolean zzk() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final boolean zzl() {
        return this.zzf;
    }
}
