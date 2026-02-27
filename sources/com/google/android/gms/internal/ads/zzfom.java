package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfom extends zzfoj {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    public /* synthetic */ zzfom(String str, boolean z4, boolean z5, boolean z8, long j, boolean z9, long j6, byte[] bArr) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = z5;
        this.zzd = j;
        this.zze = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfoj) {
            zzfoj zzfojVar = (zzfoj) obj;
            if (this.zza.equals(zzfojVar.zza()) && this.zzb == zzfojVar.zzb() && this.zzc == zzfojVar.zzc()) {
                zzfojVar.zzd();
                if (this.zzd == zzfojVar.zze()) {
                    zzfojVar.zzf();
                    if (this.zze == zzfojVar.zzg()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        boolean z4 = this.zzb;
        int length = String.valueOf(z4).length();
        boolean z5 = this.zzc;
        int length2 = String.valueOf(z5).length();
        long j = this.zzd;
        int length3 = String.valueOf(j).length();
        long j6 = this.zze;
        int length4 = String.valueOf(j6).length();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z4);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z5);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(j);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb2.append(j6);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final long zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final long zzg() {
        return this.zze;
    }
}
