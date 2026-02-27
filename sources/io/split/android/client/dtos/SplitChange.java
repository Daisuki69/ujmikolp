package io.split.android.client.dtos;

import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SplitChange {

    @InterfaceC1498b(alternate = {"since"}, value = CmcdData.Factory.STREAMING_FORMAT_SS)
    public long since;

    @InterfaceC1498b(alternate = {"splits"}, value = "d")
    public List<Split> splits;

    @InterfaceC1498b(alternate = {"till"}, value = "t")
    public long till;

    @VisibleForTesting
    public static SplitChange create(long j, long j6, List<Split> list) {
        SplitChange splitChange = new SplitChange();
        splitChange.since = j;
        splitChange.till = j6;
        splitChange.splits = list;
        return splitChange;
    }
}
