package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.annotation.OptIn;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcgr {
    private final zzcgj zza;
    private final zzdsm zzb;

    public zzcgr(zzcgj zzcgjVar, zzdsm zzdsmVar) {
        this.zza = zzcgjVar;
        this.zzb = zzdsmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.ThreadPoolExecutor] */
    /* JADX WARN: Type inference failed for: r2v4 */
    @OptIn(markerClass = {WebViewCompat.ExperimentalAsyncStartUp.class})
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzox)).booleanValue()) {
            Executor threadPoolExecutor = zzbzh.zza;
            final ?? r22 = 0;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoA)).booleanValue()) {
                zzcgq zzcgqVar = new zzcgq(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoC)).intValue(), null);
                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoB)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcgqVar);
                r22 = threadPoolExecutor;
            }
            final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            WebViewCompat.WebViewStartUpCallback webViewStartUpCallback = new WebViewCompat.WebViewStartUpCallback() { // from class: com.google.android.gms.internal.ads.zzcgo
                @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
                public final /* synthetic */ void onSuccess(WebViewStartUpResult webViewStartUpResult) {
                    this.zza.zzb(jElapsedRealtime, r22, webViewStartUpResult);
                }
            };
            this.zza.zzd(threadPoolExecutor, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoz)).booleanValue(), webViewStartUpCallback);
        }
    }

    public final /* synthetic */ void zzb(long j, ThreadPoolExecutor threadPoolExecutor, WebViewStartUpResult webViewStartUpResult) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoy)).booleanValue()) {
            long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
            zzdsl zzdslVarZza = this.zzb.zza();
            zzdslVarZza.zzc("action", "webview_startup_l");
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length());
            sb2.append(jElapsedRealtime);
            zzdslVarZza.zzc("webview_startup_l", sb2.toString());
            Long totalTimeInUiThreadMillis = webViewStartUpResult.getTotalTimeInUiThreadMillis();
            StringBuilder sb3 = new StringBuilder(String.valueOf(totalTimeInUiThreadMillis).length());
            sb3.append(totalTimeInUiThreadMillis);
            zzdslVarZza.zzc("webview_startup_uil", sb3.toString());
            zzdslVarZza.zzd();
        }
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoF)).booleanValue() || Build.VERSION.SDK_INT < 24) {
            return;
        }
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ void zzc() {
        this.zza.zzf(new zzcgm(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    public final /* synthetic */ zzdsm zzd() {
        return this.zzb;
    }
}
