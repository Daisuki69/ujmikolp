package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnu {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbod zzc;
    private zzbod zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zzd(Context context) {
        if (((Boolean) zzbes.zzc.zze()).booleanValue()) {
            return Arrays.asList(((String) zzbes.zzd.zze()).split(",")).contains(com.google.android.gms.ads.internal.util.zzs.zzm(zzc(context)).zza().toLowerCase(Locale.ROOT));
        }
        return false;
    }

    public final zzbod zza(Context context, VersionInfoParcel versionInfoParcel, zzfie zzfieVar) {
        zzbod zzbodVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzbod(zzc(context), versionInfoParcel, zzd(context) ? (String) zzbes.zzb.zze() : (String) zzbes.zzf.zze(), zzfieVar);
                }
                zzbodVar = this.zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbodVar;
    }

    public final zzbod zzb(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzfie zzfieVar) {
        zzbod zzbodVar;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = new zzbod(zzc(context), versionInfoParcel, zzd(context) ? ((Boolean) zzbeo.zzg.zze()).booleanValue() ? (String) zzbes.zza.zze() : (String) zzbes.zze.zze() : ((Boolean) zzbeo.zzf.zze()).booleanValue() ? (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zza) : (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzb), zzfieVar);
                }
                zzbodVar = this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbodVar;
    }
}
