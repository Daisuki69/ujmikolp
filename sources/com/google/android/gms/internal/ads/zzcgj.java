package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.WebViewStartUpConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcgj {
    private final Context zzd;

    @Nullable
    private String zza = null;

    @Nullable
    private zzhlz zzb = null;
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    @Nullable
    private Profile zze = null;

    public zzcgj(Context context) {
        this.zzd = context;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjE)).booleanValue() && !this.zzc.getAndSet(true) && WebViewFeature.isFeatureSupported(WebViewFeature.GET_VARIATIONS_HEADER)) {
            try {
                String variationsHeader = WebViewCompat.getVariationsHeader();
                if (variationsHeader.isEmpty()) {
                    return;
                }
                this.zza = variationsHeader;
                this.zzb = zzhlz.zzc(Base64.decode(variationsHeader, 0), zzhhr.zzb());
            } catch (zzhiw | IllegalArgumentException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
            }
        }
    }

    @Nullable
    public final String zzb() {
        return this.zza;
    }

    @Nullable
    public final zzhlz zzc() {
        return this.zzb;
    }

    @OptIn(markerClass = {WebViewCompat.ExperimentalAsyncStartUp.class})
    public final void zzd(Executor executor, boolean z4, WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        WebViewCompat.startUpWebView(this.zzd, new WebViewStartUpConfig.Builder(executor).setShouldRunUiThreadStartUpTasks(z4).build(), webViewStartUpCallback);
    }

    public final void zze(WebView webView) {
        if (this.zze != null) {
            try {
                WebViewCompat.setProfile(webView, "GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e) {
                String strConcat = "WebViewCompat error: ".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoE)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "WebViewCompat.setProfile");
                }
            }
        }
    }

    @RequiresApi(api = 24)
    @UiThread
    public final void zzf(zzcgm zzcgmVar) {
        ProfileStore profileStore;
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfrt.zza("androidx.webkit.ProfileStore", "getInstance", new zzfrs[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e) {
            String strValueOf = String.valueOf(e.getMessage());
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzfrt.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzfrs[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e7) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e7.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zze = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoD)).booleanValue()) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcgmVar.zza;
                zzdsl zzdslVarZza = zzcgmVar.zzb.zzd().zza();
                zzdslVarZza.zzc("action", "webview_p_l");
                zzdslVarZza.zzc("webview_p_l", Long.toString(jElapsedRealtime));
                zzdslVarZza.zzd();
                return;
            }
            return;
        }
        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoD)).booleanValue()) {
            zzdsl zzdslVarZza2 = zzcgmVar.zzb.zzd().zza();
            zzdslVarZza2.zzc("action", "webview_p_f");
            zzdslVarZza2.zzc("webview_p_f", "No instance");
            zzdslVarZza2.zzd();
        }
    }
}
