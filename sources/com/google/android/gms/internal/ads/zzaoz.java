package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaoz {
    private final String zza;
    private final String zzb;

    public zzaoz(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaoz.class == obj.getClass()) {
            zzaoz zzaozVar = (zzaoz) obj;
            if (TextUtils.equals(this.zza, zzaozVar.zza) && TextUtils.equals(this.zzb, zzaozVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        androidx.media3.datasource.cache.c.A(sb2, "Header[name=", str, ",value=", str2);
        sb2.append("]");
        return sb2.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
