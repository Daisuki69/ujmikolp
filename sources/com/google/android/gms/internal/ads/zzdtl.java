package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdtl implements AppEventListener, zzcyy, com.google.android.gms.ads.internal.client.zza, zzcvs, zzcwm, zzcwn, zzcxg, zzcvv, zzfhi {
    private final List zza;
    private final zzdsz zzb;
    private long zzc;

    public zzdtl(zzdsz zzdszVar, zzcgv zzcgvVar) {
        this.zzb = zzdszVar;
        this.zza = Collections.singletonList(zzcgvVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzi(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzi(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zza(Context context) {
        zzi(zzcwn.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzb(Context context) {
        zzi(zzcwn.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzc(Context context) {
        zzi(zzcwn.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(zzbvh zzbvhVar, String str, String str2) {
        zzi(zzcvs.class, "onRewarded", zzbvhVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzi(zzcvv.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
        zzi(zzcvs.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdP(zzfhb zzfhbVar, String str) {
        zzi(zzfha.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdQ(zzfhb zzfhbVar, String str) {
        zzi(zzfha.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdR(zzfhb zzfhbVar, String str, Throwable th2) {
        zzi(zzfha.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdS(zzfhb zzfhbVar, String str) {
        zzi(zzfha.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        zzi(zzcyy.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzi(zzcwm.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        zzi(zzcvs.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        zzi(zzcvs.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
        zzi(zzcvs.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
        zzi(zzcvs.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb2.append("Ad Request Latency : ");
        sb2.append(jElapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        zzi(zzcxg.class, "onAdLoaded", new Object[0]);
    }
}
