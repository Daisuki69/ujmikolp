package com.google.android.gms.internal.location;

import androidx.annotation.GuardedBy;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.dynatrace.android.agent.Global;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbo {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;

    @GuardedBy("sharedStringBuilder")
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static void zza(long j, StringBuilder sb2) {
        if (j == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z4 = false;
        if (j < 0) {
            sb2.append(Global.HYPHEN);
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z4 = true;
            }
        }
        if (j >= 86400000) {
            sb2.append(j / 86400000);
            sb2.append("d");
            j %= 86400000;
        }
        if (true == z4) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb2.append(j / 3600000);
            sb2.append(CmcdData.Factory.STREAMING_FORMAT_HLS);
            j %= 3600000;
        }
        if (j >= 60000) {
            sb2.append(j / 60000);
            sb2.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb2.append(j / 1000);
            sb2.append(CmcdData.Factory.STREAMING_FORMAT_SS);
            j %= 1000;
        }
        if (j > 0) {
            sb2.append(j);
            sb2.append("ms");
        }
    }
}
