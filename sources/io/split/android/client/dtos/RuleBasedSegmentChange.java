package io.split.android.client.dtos;

import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RuleBasedSegmentChange {

    @InterfaceC1498b("d")
    private List<RuleBasedSegment> segments;

    @InterfaceC1498b(CmcdData.Factory.STREAMING_FORMAT_SS)
    private long since;

    @InterfaceC1498b("t")
    private long till;

    @VisibleForTesting
    public static RuleBasedSegmentChange create(long j, long j6, List<RuleBasedSegment> list) {
        RuleBasedSegmentChange ruleBasedSegmentChange = new RuleBasedSegmentChange();
        ruleBasedSegmentChange.segments = list;
        ruleBasedSegmentChange.since = j;
        ruleBasedSegmentChange.till = j6;
        return ruleBasedSegmentChange;
    }

    @VisibleForTesting
    public static RuleBasedSegmentChange createEmpty() {
        return create(-1L, -1L, new ArrayList());
    }

    public List<RuleBasedSegment> getSegments() {
        return this.segments;
    }

    public long getSince() {
        return this.since;
    }

    public long getTill() {
        return this.till;
    }
}
