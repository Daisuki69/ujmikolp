package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class D {
    public static void a(zzkj zzkjVar, zzox zzoxVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    public static void b(zzkj zzkjVar, zzki zzkiVar, zzwq zzwqVar, zzyf[] zzyfVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    public static void c(zzkj zzkjVar, zzox zzoxVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    public static void d(zzkj zzkjVar, zzox zzoxVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    public static long e(zzkj zzkjVar, zzox zzoxVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    public static boolean f(zzkj zzkjVar, zzox zzoxVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    public static boolean g(zzkj zzkjVar, zzki zzkiVar) {
        long j = zzkiVar.zzd;
        throw null;
    }

    public static boolean h(zzkj zzkjVar, zzki zzkiVar) {
        zzbe zzbeVar = zzkiVar.zzb;
        throw null;
    }

    public static boolean i(zzkj zzkjVar, zzbe zzbeVar, zzup zzupVar, long j) {
        zzds.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
