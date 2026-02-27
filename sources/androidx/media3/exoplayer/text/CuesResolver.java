package androidx.media3.exoplayer.text;

import O1.S;
import androidx.media3.extractor.text.CuesWithTiming;

/* JADX INFO: loaded from: classes2.dex */
interface CuesResolver {
    boolean addCues(CuesWithTiming cuesWithTiming, long j);

    void clear();

    void discardCuesBeforeTimeUs(long j);

    S getCuesAtTimeUs(long j);

    long getNextCueChangeTimeUs(long j);

    long getPreviousCueChangeTimeUs(long j);
}
