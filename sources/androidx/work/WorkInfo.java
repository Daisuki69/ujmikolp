package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okio.Utf8;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkInfo {
    public static final Companion Companion = new Companion(null);
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_FOREGROUND_SERVICE_TIMEOUT = -128;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;
    private final Constraints constraints;
    private final int generation;
    private final UUID id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;
    private final Data outputData;
    private final PeriodicityInfo periodicityInfo;
    private final Data progress;
    private final int runAttemptCount;
    private final State state;
    private final int stopReason;
    private final Set<String> tags;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        public PeriodicityInfo(long j, long j6) {
            this.repeatIntervalMillis = j;
            this.flexIntervalMillis = j6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PeriodicityInfo.class.equals(obj.getClass())) {
                PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
                if (periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public int hashCode() {
            long j = this.repeatIntervalMillis;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j6 = this.flexIntervalMillis;
            return i + ((int) ((j6 >>> 32) ^ j6));
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + '}';
        }
    }

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags) {
        this(id, state, tags, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !WorkInfo.class.equals(obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && j.b(this.id, workInfo.id) && this.state == workInfo.state && j.b(this.outputData, workInfo.outputData) && j.b(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && j.b(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && j.b(this.tags, workInfo.tags)) {
            return j.b(this.progress, workInfo.progress);
        }
        return false;
    }

    public final Constraints getConstraints() {
        return this.constraints;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final UUID getId() {
        return this.id;
    }

    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    public final Data getOutputData() {
        return this.outputData;
    }

    public final PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    public final Data getProgress() {
        return this.progress;
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    public final State getState() {
        return this.state;
    }

    @RequiresApi(31)
    public final int getStopReason() {
        return this.stopReason;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = (this.constraints.hashCode() + ((((((this.progress.hashCode() + ((this.tags.hashCode() + ((this.outputData.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.runAttemptCount) * 31) + this.generation) * 31)) * 31;
        long j = this.initialDelayMillis;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        PeriodicityInfo periodicityInfo = this.periodicityInfo;
        int iHashCode2 = (i + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31;
        long j6 = this.nextScheduleTimeMillis;
        return ((iHashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.stopReason;
    }

    public String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData) {
        this(id, state, tags, outputData, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
        j.g(outputData, "outputData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress) {
        this(id, state, tags, outputData, progress, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
        j.g(outputData, "outputData");
        j.g(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i) {
        this(id, state, tags, outputData, progress, i, 0, null, 0L, null, 0L, 0, 4032, null);
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
        j.g(outputData, "outputData");
        j.g(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i4) {
        this(id, state, tags, outputData, progress, i, i4, null, 0L, null, 0L, 0, Utf8.MASK_2BYTES, null);
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
        j.g(outputData, "outputData");
        j.g(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i4, Constraints constraints) {
        this(id, state, tags, outputData, progress, i, i4, constraints, 0L, null, 0L, 0, 3840, null);
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
        j.g(outputData, "outputData");
        j.g(progress, "progress");
        j.g(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i4, Constraints constraints, long j) {
        this(id, state, tags, outputData, progress, i, i4, constraints, j, null, 0L, 0, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, null);
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
        j.g(outputData, "outputData");
        j.g(progress, "progress");
        j.g(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i4, Constraints constraints, long j, PeriodicityInfo periodicityInfo) {
        this(id, state, tags, outputData, progress, i, i4, constraints, j, periodicityInfo, 0L, 0, 3072, null);
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
        j.g(outputData, "outputData");
        j.g(progress, "progress");
        j.g(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i4, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j6) {
        this(id, state, tags, outputData, progress, i, i4, constraints, j, periodicityInfo, j6, 0, 2048, null);
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
        j.g(outputData, "outputData");
        j.g(progress, "progress");
        j.g(constraints, "constraints");
    }

    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i4, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j6, int i6) {
        j.g(id, "id");
        j.g(state, "state");
        j.g(tags, "tags");
        j.g(outputData, "outputData");
        j.g(progress, "progress");
        j.g(constraints, "constraints");
        this.id = id;
        this.state = state;
        this.tags = tags;
        this.outputData = outputData;
        this.progress = progress;
        this.runAttemptCount = i;
        this.generation = i4;
        this.constraints = constraints;
        this.initialDelayMillis = j;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j6;
        this.stopReason = i6;
    }

    public /* synthetic */ WorkInfo(UUID uuid, State state, Set set, Data data, Data data2, int i, int i4, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j6, int i6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, state, set, (i10 & 8) != 0 ? Data.EMPTY : data, (i10 & 16) != 0 ? Data.EMPTY : data2, (i10 & 32) != 0 ? 0 : i, (i10 & 64) != 0 ? 0 : i4, (i10 & 128) != 0 ? Constraints.NONE : constraints, (i10 & 256) != 0 ? 0L : j, (i10 & 512) != 0 ? null : periodicityInfo, (i10 & 1024) != 0 ? Long.MAX_VALUE : j6, (i10 & 2048) != 0 ? -256 : i6);
    }
}
