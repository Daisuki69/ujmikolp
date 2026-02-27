package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import dOYHB6.yFtIp6.ht2aO8;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfng {
    private static int zza = 2;

    public static void zza(@NonNull Context context) {
        ht2aO8.registerReceiver(context, new zzfnf(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfnc.zzb() != zzflp.CTV) {
            return 2;
        }
        return zza;
    }
}
