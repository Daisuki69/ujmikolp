package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzaii {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z4 = false;
        while (it.hasNext()) {
            String str2 = ((zzaiv) it.next()).zza.zzg.zzo;
            if (zzar.zzb(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if (zzar.zza(str2)) {
                z4 = true;
            } else if (zzar.zzc(str2)) {
                if (Objects.equals(str2, MimeTypes.IMAGE_HEIC)) {
                    str = MimeTypes.IMAGE_HEIF;
                } else if (Objects.equals(str2, MimeTypes.IMAGE_AVIF)) {
                    str = MimeTypes.IMAGE_AVIF;
                }
            }
        }
        return z4 ? MimeTypes.AUDIO_MP4 : str != null ? str : MimeTypes.APPLICATION_MP4;
    }
}
