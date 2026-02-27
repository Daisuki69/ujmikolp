package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhke implements zzhjp {
    private final zzhjs zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzhke(zzhjs zzhjsVar, String str, Object[] objArr) {
        this.zza = zzhjsVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i4 = 1;
        int i6 = 13;
        while (true) {
            int i10 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.zzd = i | (cCharAt2 << i6);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i4 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjp
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjp
    public final zzhjs zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhjp
    public final int zzc() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
