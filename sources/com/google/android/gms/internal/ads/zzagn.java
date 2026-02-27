package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagn extends zzagh {

    @Nullable
    public final String zza;
    public final String zzb;

    public zzagn(String str, @Nullable String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagn.class == obj.getClass()) {
            zzagn zzagnVar = (zzagn) obj;
            if (this.zzf.equals(zzagnVar.zzf) && Objects.equals(this.zza, zzagnVar.zza) && Objects.equals(this.zzb, zzagnVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return We.s.q(new StringBuilder(str2.length() + length + 6), str, ": url=", str2);
    }
}
