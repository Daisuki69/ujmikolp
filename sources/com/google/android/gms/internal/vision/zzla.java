package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class zzla implements zzki {
    private final zzkk zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzla(zzkk zzkkVar, String str, Object[] objArr) {
        this.zza = zzkkVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i4 = 13;
        int i6 = 1;
        while (true) {
            int i10 = i6 + 1;
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 55296) {
                this.zzd = i | (cCharAt2 << i4);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i6 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzki
    public final int zza() {
        return (this.zzd & 1) == 1 ? zzkz.zza : zzkz.zzb;
    }

    @Override // com.google.android.gms.internal.vision.zzki
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.vision.zzki
    public final zzkk zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
