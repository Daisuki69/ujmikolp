package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class RtpUtils {
    private static final String RTP_ANY_INCOMING_IPV4 = "rtp://0.0.0.0";

    private RtpUtils() {
    }

    public static DataSpec getIncomingRtpDataSpec(int i) {
        return new DataSpec(Uri.parse(Util.formatInvariant("%s:%d", RTP_ANY_INCOMING_IPV4, Integer.valueOf(i))));
    }
}
