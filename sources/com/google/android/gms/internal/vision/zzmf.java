package com.google.android.gms.internal.vision;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
final class zzmf {
    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b8, char[] cArr, int i) {
        cArr[i] = (char) b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(byte b8) {
        return b8 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(byte b8) {
        return b8 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzf(byte b8) {
        return b8 < -16;
    }

    private static boolean zzg(byte b8) {
        return b8 > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b8, byte b10, char[] cArr, int i) throws zzjk {
        if (b8 < -62 || zzg(b10)) {
            throw zzjk.zzh();
        }
        cArr[i] = (char) (((b8 & 31) << 6) | (b10 & Utf8.REPLACEMENT_BYTE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b8, byte b10, byte b11, char[] cArr, int i) throws zzjk {
        if (!zzg(b10) && ((b8 != -32 || b10 >= -96) && ((b8 != -19 || b10 < -96) && !zzg(b11)))) {
            cArr[i] = (char) (((b8 & 15) << 12) | ((b10 & Utf8.REPLACEMENT_BYTE) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzjk.zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b8, byte b10, byte b11, byte b12, char[] cArr, int i) throws zzjk {
        if (!zzg(b10)) {
            if ((((b10 + 112) + (b8 << 28)) >> 30) == 0 && !zzg(b11) && !zzg(b12)) {
                int i4 = ((b8 & 7) << 18) | ((b10 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE);
                cArr[i] = (char) ((i4 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i + 1] = (char) ((i4 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw zzjk.zzh();
    }
}
