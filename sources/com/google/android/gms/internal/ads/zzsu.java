package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(29)
final class zzsu {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4, double d10) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            int iZzc = zzc(supportedPerformancePoints, androidx.core.view.accessibility.c.f(i, i4, (int) d10));
            boolean z4 = true;
            if (iZzc == 1 && zzsv.zza == null) {
                if (Build.VERSION.SDK_INT < 35) {
                    int iZzb = zzb(false);
                    int iZzb2 = zzb(true);
                    if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                    }
                    zzsv.zza = Boolean.valueOf(z4);
                    if (!zzsv.zza.booleanValue()) {
                    }
                }
                z4 = false;
                zzsv.zza = Boolean.valueOf(z4);
                if (!zzsv.zza.booleanValue()) {
                }
            }
            return iZzc;
        }
        return 0;
    }

    private static int zzb(boolean z4) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzs zzsVar = new zzs();
            zzsVar.zzm("video/avc");
            zzu zzuVarZzM = zzsVar.zzM();
            if (zzuVarZzM.zzo != null) {
                List listZzc = zztl.zzc(zztb.zzb, zzuVarZzM, z4, false);
                for (int i = 0; i < listZzc.size(); i++) {
                    if (((zzst) listZzc.get(i)).zzd != null && (videoCapabilities = ((zzst) listZzc.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        androidx.core.view.accessibility.c.l();
                        return zzc(supportedPerformancePoints, androidx.core.view.accessibility.c.e());
                    }
                }
            }
        } catch (zztd unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (androidx.core.view.accessibility.c.g(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
