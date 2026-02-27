package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzgep extends zzgfr {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzgep(String str, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgfr) {
            zzgfr zzgfrVar = (zzgfr) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzgfrVar.zza()) : zzgfrVar.zza() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzgfrVar.zzb()) : zzgfrVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        androidx.media3.datasource.cache.c.A(sb2, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    @Nullable
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}
