package com.google.android.gms.internal.measurement;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
final class zzoq {
    public static /* synthetic */ boolean zza(byte b8) {
        return b8 >= 0;
    }

    public static /* synthetic */ void zzb(byte b8, byte b10, char[] cArr, int i) throws zzmr {
        if (b8 < -62 || zze(b10)) {
            throw new zzmr("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b8 & 31) << 6) | (b10 & Utf8.REPLACEMENT_BYTE));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zzc(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.measurement.zzmr {
        /*
            boolean r0 = zze(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = zze(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.android.gms.internal.measurement.zzmr r2 = new com.google.android.gms.internal.measurement.zzmr
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzoq.zzc(byte, byte, byte, char[], int):void");
    }

    public static /* synthetic */ void zzd(byte b8, byte b10, byte b11, byte b12, char[] cArr, int i) throws zzmr {
        if (!zze(b10)) {
            if ((((b10 + 112) + (b8 << 28)) >> 30) == 0 && !zze(b11) && !zze(b12)) {
                int i4 = ((b8 & 7) << 18) | ((b10 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE);
                cArr[i] = (char) ((i4 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i + 1] = (char) ((i4 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw new zzmr("Protocol message had invalid UTF-8.");
    }

    private static boolean zze(byte b8) {
        return b8 > -65;
    }
}
