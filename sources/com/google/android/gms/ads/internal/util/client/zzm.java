package com.google.android.gms.ads.internal.util.client;

import androidx.media3.datasource.cache.c;

/* JADX INFO: loaded from: classes2.dex */
final class zzm extends zzw {
    private final int zza;
    private final int zzb;
    private final boolean zzc;

    public zzm(int i, int i4, boolean z4) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.zza == zzwVar.zza() && this.zzb == zzwVar.zzb() && this.zzc == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.zzc ? 1237 : 1231) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003);
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i4 = this.zzb;
        int length2 = String.valueOf(i4).length();
        boolean z4 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z4).length() + 1);
        c.y(sb2, "OfflineAdConfig{impressionPrerequisite=", i, ", clickPrerequisite=", i4);
        sb2.append(", notificationFlowEnabled=");
        sb2.append(z4);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.zzc;
    }
}
