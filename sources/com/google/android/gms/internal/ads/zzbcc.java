package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import dOYHB6.yFtIp6.svM7M6;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbcc implements zzbey {
    final /* synthetic */ SharedPreferences zza;

    public zzbcc(zzbcg zzbcgVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final Boolean zza(String str, boolean z4) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z4));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(svM7M6.getString(this.zza, str, String.valueOf(z4)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final Long zzb(String str, long j) {
        try {
            return Long.valueOf(this.zza.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final Double zzc(String str, double d10) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(svM7M6.getString(this.zza, str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final String zzd(String str, String str2) {
        return svM7M6.getString(this.zza, str, str2);
    }
}
