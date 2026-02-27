package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UriUtil;

/* JADX INFO: loaded from: classes2.dex */
final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    private RtspTrackTiming(long j, int i, Uri uri) {
        this.rtpTimestamp = j;
        this.sequenceNumber = i;
        this.uri = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static O1.S parseTrackTiming(java.lang.String r21, android.net.Uri r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.rtsp.RtspTrackTiming.parseTrackTiming(java.lang.String, android.net.Uri):O1.S");
    }

    @VisibleForTesting
    public static Uri resolveUri(String str, Uri uri) {
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        return ((String) Assertions.checkNotNull(uri3.getHost())).equals(uri.getHost()) ? uri3 : string.endsWith("/") ? UriUtil.resolveToUri(string, str) : UriUtil.resolveToUri(string.concat("/"), str);
    }
}
