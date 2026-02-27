package io.split.android.client.dtos;

import g3.InterfaceC1498b;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class Excluded {

    @InterfaceC1498b("keys")
    private Set<String> mKeys;

    @InterfaceC1498b("segments")
    private Set<ExcludedSegment> mSegments;

    public static Excluded createEmpty() {
        Excluded excluded = new Excluded();
        excluded.mKeys = new HashSet();
        excluded.mSegments = new HashSet();
        return excluded;
    }

    public Set<String> getKeys() {
        return this.mKeys;
    }

    public Set<ExcludedSegment> getSegments() {
        return this.mSegments;
    }
}
