package com.google.android.gms.internal.measurement;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
final class zzbu extends zzca {
    private final String zzc;
    private final int zzd;
    private final int zze;

    public /* synthetic */ zzbu(String str, boolean z4, int i, zzbr zzbrVar, zzbs zzbsVar, int i4, byte[] bArr) {
        this.zzc = str;
        this.zzd = i;
        this.zze = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            zzca zzcaVar = (zzca) obj;
            if (this.zzc.equals(zzcaVar.zza())) {
                zzcaVar.zzb();
                int i = this.zzd;
                int iZze = zzcaVar.zze();
                if (i == 0) {
                    throw null;
                }
                if (i == iZze) {
                    zzcaVar.zzc();
                    zzcaVar.zzd();
                    int i4 = this.zze;
                    int iZzf = zzcaVar.zzf();
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
        int iHashCode = this.zzc.hashCode() ^ 1000003;
        int i = this.zzd;
        if (i == 0) {
            throw null;
        }
        int i4 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zze != 0) {
            return (i4 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.zzd;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zze == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzc;
        StringBuilder sb2 = new StringBuilder(str2.length() + androidx.media3.datasource.cache.c.b(androidx.media3.datasource.cache.c.c(73, str3), 91, str) + 1);
        androidx.media3.datasource.cache.c.A(sb2, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return s.q(sb2, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final String zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbs zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zzf() {
        return this.zze;
    }
}
