package androidx.media3.extractor.text;

import O1.S;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class CuesWithTiming {
    public final S cues;
    public final long durationUs;
    public final long endTimeUs;
    public final long startTimeUs;

    public CuesWithTiming(List<Cue> list, long j, long j6) {
        this.cues = S.k(list);
        this.startTimeUs = j;
        this.durationUs = j6;
        long j7 = C.TIME_UNSET;
        if (j != C.TIME_UNSET && j6 != C.TIME_UNSET) {
            j7 = j + j6;
        }
        this.endTimeUs = j7;
    }
}
