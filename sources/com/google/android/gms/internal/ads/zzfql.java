package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfql extends zzfqr {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfql(String str, boolean z4, int i, zzfqi zzfqiVar, zzfqj zzfqjVar, int i4, byte[] bArr) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqr) {
            zzfqr zzfqrVar = (zzfqr) obj;
            if (this.zzb.equals(zzfqrVar.zza())) {
                zzfqrVar.zzb();
                int i = this.zzc;
                int iZze = zzfqrVar.zze();
                if (i == 0) {
                    throw null;
                }
                if (i == iZze) {
                    zzfqrVar.zzc();
                    zzfqrVar.zzd();
                    int i4 = this.zzd;
                    int iZzf = zzfqrVar.zzf();
                    if (i4 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i == 0) {
            throw null;
        }
        int i4 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zzd != 0) {
            return (i4 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.zzc;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + androidx.media3.datasource.cache.c.b(androidx.media3.datasource.cache.c.c(73, str3), 91, str) + 1);
        androidx.media3.datasource.cache.c.A(sb2, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return We.s.q(sb2, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final zzfqi zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final zzfqj zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final int zzf() {
        return this.zzd;
    }
}
