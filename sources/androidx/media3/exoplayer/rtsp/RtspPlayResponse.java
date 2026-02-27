package androidx.media3.exoplayer.rtsp;

import O1.S;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class RtspPlayResponse {
    public final RtspSessionTiming sessionTiming;
    public final int status;
    public final S trackTimingList;

    public RtspPlayResponse(int i, RtspSessionTiming rtspSessionTiming, List<RtspTrackTiming> list) {
        this.status = i;
        this.sessionTiming = rtspSessionTiming;
        this.trackTimingList = S.k(list);
    }
}
