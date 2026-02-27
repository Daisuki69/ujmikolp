package com.google.android.gms.measurement.internal;

import We.s;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.datasource.cache.c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgv {

    @NonNull
    public final String zza;

    @NonNull
    public final String zzb;
    public final long zzc;

    @NonNull
    public final Bundle zzd;

    public zzgv(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static zzgv zza(zzbg zzbgVar) {
        return new zzgv(zzbgVar.zza, zzbgVar.zzc, zzbgVar.zzb.zzf(), zzbgVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String string = this.zzd.toString();
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        c.A(sb2, "origin=", str, ",name=", str2);
        return s.p(sb2, ",params=", string);
    }

    public final zzbg zzb() {
        return new zzbg(this.zza, new zzbe(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
