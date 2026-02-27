package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccf implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcbd zzcbdVar = (zzcbd) obj;
        zzcfq zzcfqVarZzh = zzcbdVar.zzh();
        if (zzcfqVarZzh == null) {
            try {
                zzcfq zzcfqVar = new zzcfq(zzcbdVar, Float.parseFloat((String) map.get("duration")), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("customControlsAllowed")), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("clickToExpandAllowed")));
                zzcbdVar.zzw(zzcfqVar);
                zzcfqVarZzh = zzcfqVar;
            } catch (NullPointerException e) {
                e = e;
                Throwable th2 = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th2);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e7) {
                e = e7;
                Throwable th22 = e;
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", th22);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th22, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("muted"));
        float f3 = Float.parseFloat((String) map.get("currentTime"));
        int i6 = Integer.parseInt((String) map.get("playbackState"));
        if (i6 < 0 || i6 > 3) {
            i6 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f7 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f3).length() + 45 + String.valueOf(f).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i6).length() + 17 + String.valueOf(str).length());
            sb2.append("Video Meta GMSG: currentTime : ");
            sb2.append(f3);
            sb2.append(" , duration : ");
            sb2.append(f);
            sb2.append(" , isMuted : ");
            sb2.append(zEquals);
            sb2.append(" , playbackState : ");
            sb2.append(i6);
            sb2.append(" , aspectRatio : ");
            sb2.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
        }
        zzcfqVarZzh.zzs(f3, f, i6, zEquals, f7);
    }
}
