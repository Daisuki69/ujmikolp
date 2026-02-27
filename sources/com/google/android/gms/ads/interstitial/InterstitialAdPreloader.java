package com.google.android.gms.ads.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class InterstitialAdPreloader {
    private InterstitialAdPreloader() {
    }

    public static boolean destroy(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzf(str);
    }

    public static void destroyAll() {
        zzep zzepVarZza = zza();
        if (zzepVarZza != null) {
            zzepVarZza.zzg();
        }
    }

    @Nullable
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return null;
        }
        return zzepVarZza.zzi(str);
    }

    @NonNull
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzep zzepVarZza = zza();
        return zzepVarZza == null ? new HashMap() : zzepVarZza.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return 0;
        }
        return zzepVarZza.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzd(str);
    }

    @Nullable
    public static InterstitialAd pollAd(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return null;
        }
        return zzepVarZza.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzc(str, preloadConfiguration);
    }

    @Nullable
    private static zzep zza() {
        zzep zzepVar = (zzep) zzex.zzb().zza(AdFormat.INTERSTITIAL);
        if (zzepVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzepVar;
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
