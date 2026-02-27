package com.google.android.gms.ads.appopen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AppOpenAdPreloader {
    private AppOpenAdPreloader() {
    }

    public static boolean destroy(@NonNull String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzf(str);
    }

    public static void destroyAll() {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza != null) {
            zzeoVarZza.zzg();
        }
    }

    @Nullable
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return null;
        }
        return zzeoVarZza.zzi(str);
    }

    @NonNull
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzeo zzeoVarZza = zza();
        return zzeoVarZza == null ? new HashMap() : zzeoVarZza.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return 0;
        }
        return zzeoVarZza.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzd(str);
    }

    @Nullable
    public static AppOpenAd pollAd(@NonNull String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return null;
        }
        return zzeoVarZza.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzc(str, preloadConfiguration);
    }

    @Nullable
    private static zzeo zza() {
        zzeo zzeoVar = (zzeo) zzex.zzb().zza(AdFormat.APP_OPEN_AD);
        if (zzeoVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzeoVar;
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
