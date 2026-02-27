package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzgen extends zzgfo {
    private final int zza;

    @Nullable
    private final String zzb;
    private final int zzc;

    public /* synthetic */ zzgen(int i, String str, int i4, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgfo) {
            zzgfo zzgfoVar = (zzgfo) obj;
            if (this.zza == zzgfoVar.zza() && ((str = this.zzb) != null ? str.equals(zzgfoVar.zzb()) : zzgfoVar.zzb() == null) && this.zzc == zzgfoVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i4 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i4).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i);
        sb2.append(", sessionToken=");
        sb2.append(str);
        return androidx.media3.datasource.cache.c.m(sb2, ", uiMode=", i4, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final int zzc() {
        return this.zzc;
    }
}
