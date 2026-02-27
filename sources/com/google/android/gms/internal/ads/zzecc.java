package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzecc extends zzecf {

    @Nullable
    private final String zza;
    private final String zzb;

    @Nullable
    private final Drawable zzc;

    public zzecc(@Nullable String str, String str2, @Nullable Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzecf) {
            zzecf zzecfVar = (zzecf) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzecfVar.zza()) : zzecfVar.zza() == null) {
                if (this.zzb.equals(zzecfVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzecfVar.zzc()) : zzecfVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        androidx.media3.datasource.cache.c.A(sb2, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return We.s.q(sb2, ", icon=", strValueOf, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    @Nullable
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    @Nullable
    public final Drawable zzc() {
        return this.zzc;
    }
}
