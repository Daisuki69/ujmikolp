package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdz {
    public static void zza(int i, Throwable th2, String str) {
        String strO = androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 20), "Ad failed to load : ", i);
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strO);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th2);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, str);
    }

    public static void zzb(Context context, boolean z4) {
        if (z4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        String strZzD = com.google.android.gms.ads.internal.util.client.zzf.zzD(context);
        String strQ = We.s.q(new StringBuilder(String.valueOf(strZzD).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", strZzD, "\")) to get test ads on this device.");
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strQ);
    }
}
