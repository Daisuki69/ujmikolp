package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzece extends zzeda {
    private final Activity zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzl zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    public /* synthetic */ zzece(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeda) {
            zzeda zzedaVar = (zzeda) obj;
            if (this.zza.equals(zzedaVar.zza()) && ((zzlVar = this.zzb) != null ? zzlVar.equals(zzedaVar.zzb()) : zzedaVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzedaVar.zzc()) : zzedaVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzedaVar.zzd()) : zzedaVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzlVar == null ? 0 : zzlVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        int length2 = strValueOf.length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        androidx.media3.datasource.cache.c.A(sb2, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        androidx.media3.datasource.cache.c.A(sb2, ", gwsQueryId=", str, ", uri=", str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    @Nullable
    public final com.google.android.gms.ads.internal.overlay.zzl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    @Nullable
    public final String zzd() {
        return this.zzd;
    }
}
