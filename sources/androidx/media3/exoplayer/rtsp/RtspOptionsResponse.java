package androidx.media3.exoplayer.rtsp;

import O1.S;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class RtspOptionsResponse {
    public final int status;
    public final S supportedMethods;

    public RtspOptionsResponse(int i, List<Integer> list) {
        this.status = i;
        this.supportedMethods = S.k(list);
    }
}
