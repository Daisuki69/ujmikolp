package androidx.media3.exoplayer.text;

import N1.g;
import O1.C0528w;
import O1.H;
import O1.O;
import O1.P;
import O1.S;
import O1.r0;
import O1.s0;
import O1.t0;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class MergingCuesResolver implements CuesResolver {
    private static final s0 CUES_DISPLAY_PRIORITY_COMPARATOR;
    private final List<CuesWithTiming> cuesWithTimingList = new ArrayList();

    static {
        final int i = 0;
        final int i4 = 1;
        CUES_DISPLAY_PRIORITY_COMPARATOR = new H(new C0528w(new g() { // from class: androidx.media3.exoplayer.text.a
            @Override // N1.g
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i) {
                    case 0:
                        return MergingCuesResolver.lambda$static$0(cuesWithTiming);
                    default:
                        return MergingCuesResolver.lambda$static$1(cuesWithTiming);
                }
            }
        }, r0.f4604b), new C0528w(new g() { // from class: androidx.media3.exoplayer.text.a
            @Override // N1.g
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i4) {
                    case 0:
                        return MergingCuesResolver.lambda$static$0(cuesWithTiming);
                    default:
                        return MergingCuesResolver.lambda$static$1(cuesWithTiming);
                }
            }
        }, r0.c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$0(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.startTimeUs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$1(CuesWithTiming cuesWithTiming) {
        return Long.valueOf(cuesWithTiming.durationUs);
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(CuesWithTiming cuesWithTiming, long j) {
        Assertions.checkArgument(cuesWithTiming.startTimeUs != C.TIME_UNSET);
        Assertions.checkArgument(cuesWithTiming.durationUs != C.TIME_UNSET);
        boolean z4 = cuesWithTiming.startTimeUs <= j && j < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z4;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z4;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int i = 0;
        while (i < this.cuesWithTimingList.size()) {
            long j6 = this.cuesWithTimingList.get(i).startTimeUs;
            if (j > j6 && j > this.cuesWithTimingList.get(i).endTimeUs) {
                this.cuesWithTimingList.remove(i);
                i--;
            } else if (j < j6) {
                return;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public S getCuesAtTimeUs(long j) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j >= this.cuesWithTimingList.get(0).startTimeUs) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
                    CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
                    if (j >= cuesWithTiming.startTimeUs && j < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                t0 t0VarU = S.u(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                O oJ = S.j();
                for (int i4 = 0; i4 < t0VarU.f4608d; i4++) {
                    oJ.d(((CuesWithTiming) t0VarU.get(i4)).cues);
                }
                return oJ.g();
            }
        }
        P p10 = S.f4555b;
        return t0.e;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i >= this.cuesWithTimingList.size()) {
                break;
            }
            long j6 = this.cuesWithTimingList.get(i).startTimeUs;
            long j7 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j < j6) {
                jMin = jMin == C.TIME_UNSET ? j6 : Math.min(jMin, j6);
            } else {
                if (j < j7) {
                    jMin = jMin == C.TIME_UNSET ? j7 : Math.min(jMin, j7);
                }
                i++;
            }
        }
        if (jMin != C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return C.TIME_UNSET;
        }
        long jMax = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j6 = this.cuesWithTimingList.get(i).startTimeUs;
            long j7 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j7 > j) {
                if (j6 > j) {
                    break;
                }
                jMax = Math.max(jMax, j6);
            } else {
                jMax = Math.max(jMax, j7);
            }
        }
        return jMax;
    }
}
