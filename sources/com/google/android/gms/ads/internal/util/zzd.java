package com.google.android.gms.ads.internal.util;

import S1.y;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbzk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd {
    public static void zza(Context context) {
        int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbee.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                y yVarZzb = new zzc(context).zzb();
                int i4 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                zzbzk.zza(yVarZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e);
            }
        }
    }
}
