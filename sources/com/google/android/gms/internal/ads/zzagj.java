package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagj extends zzagh {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzagj(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagj.class == obj.getClass()) {
            zzagj zzagjVar = (zzagj) obj;
            if (Objects.equals(this.zzb, zzagjVar.zzb) && Objects.equals(this.zza, zzagjVar.zza) && Objects.equals(this.zzc, zzagjVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        return this.zzc.hashCode() + (iHashCode2 * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = str2.length() + length + 9;
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str3.length() + length2 + 14);
        androidx.media3.datasource.cache.c.A(sb2, str, ": domain=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
