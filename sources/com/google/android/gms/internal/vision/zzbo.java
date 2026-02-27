package com.google.android.gms.internal.vision;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbo {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzcw<Context, Boolean> zzi;

    public zzbo(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzbo zza(String str) {
        boolean z4 = this.zze;
        if (z4) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzbo(this.zza, this.zzb, str, this.zzd, z4, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    private zzbo(String str, Uri uri, String str2, String str3, boolean z4, boolean z5, boolean z8, boolean z9, zzcw<Context, Boolean> zzcwVar) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = z8;
        this.zzh = z9;
        this.zzi = zzcwVar;
    }

    public final <T> zzbi<T> zza(String str, T t5, zzbp<T> zzbpVar) {
        return zzbi.zzb(this, str, t5, zzbpVar, true);
    }
}
