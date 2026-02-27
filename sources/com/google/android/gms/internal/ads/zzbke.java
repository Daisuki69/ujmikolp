package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbke implements zzbjl {
    private final zzbkd zza;

    public zzbke(zzbkd zzbkdVar) {
        this.zza = zzbkdVar;
    }

    public static void zzb(zzcek zzcekVar, zzbkd zzbkdVar) {
        zzcekVar.zzab("/reward", new zzbke(zzbkdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzbvt zzbvtVar = null;
        try {
            int i = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get(SessionDescription.ATTR_TYPE);
            if (!TextUtils.isEmpty(str2)) {
                zzbvtVar = new zzbvt(str2, i);
            }
        } catch (NumberFormatException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e);
        }
        this.zza.zzb(zzbvtVar);
    }
}
