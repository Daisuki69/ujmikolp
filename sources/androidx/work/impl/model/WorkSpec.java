package androidx.work.impl.model;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import cj.t;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class WorkSpec {
    public static final Companion Companion = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;

    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @ColumnInfo(name = "backoff_policy")
    public BackoffPolicy backoffPolicy;

    @Embedded
    public Constraints constraints;

    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @ColumnInfo(defaultValue = "0")
    private final int generation;

    @PrimaryKey
    @ColumnInfo(name = TtmlNode.ATTR_ID)
    public final String id;

    @ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @ColumnInfo(name = "input")
    public Data input;

    @ColumnInfo(name = "input_merger_class_name")
    public String inputMergerClassName;

    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @ColumnInfo(defaultValue = "-1", name = "last_enqueue_time")
    public long lastEnqueueTime;

    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @ColumnInfo(defaultValue = "9223372036854775807", name = "next_schedule_time_override")
    private long nextScheduleTimeOverride;

    @ColumnInfo(defaultValue = "0", name = "next_schedule_time_override_generation")
    private int nextScheduleTimeOverrideGeneration;

    @ColumnInfo(name = "out_of_quota_policy")
    public OutOfQuotaPolicy outOfQuotaPolicy;

    @ColumnInfo(name = "output")
    public Data output;

    @ColumnInfo(defaultValue = "0", name = "period_count")
    private int periodCount;

    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @ColumnInfo(name = "state")
    public WorkInfo.State state;

    @ColumnInfo(defaultValue = "-256", name = DownloadService.KEY_STOP_REASON)
    private final int stopReason;

    @ColumnInfo(name = "trace_tag")
    private String traceTag;

    @ColumnInfo(name = "worker_class_name")
    public String workerClassName;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long calculateNextRunTime(boolean z4, int i, BackoffPolicy backoffPolicy, long j, long j6, int i4, boolean z5, long j7, long j9, long j10, long j11) {
            j.g(backoffPolicy, "backoffPolicy");
            if (j11 != Long.MAX_VALUE && z5) {
                if (i4 != 0) {
                    long j12 = j6 + PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
                    if (j11 < j12) {
                        return j12;
                    }
                }
                return j11;
            }
            if (z4) {
                long jScalb = backoffPolicy == BackoffPolicy.LINEAR ? j * ((long) i) : (long) Math.scalb(j, i - 1);
                if (jScalb > WorkRequest.MAX_BACKOFF_MILLIS) {
                    jScalb = 18000000;
                }
                return j6 + jScalb;
            }
            if (z5) {
                long j13 = i4 == 0 ? j6 + j7 : j6 + j10;
                return (j9 == j10 || i4 != 0) ? j13 : (j10 - j9) + j13;
            }
            if (j6 == -1) {
                return Long.MAX_VALUE;
            }
            return j6 + j7;
        }

        private Companion() {
        }
    }

    public static final class IdAndState {

        @ColumnInfo(name = TtmlNode.ATTR_ID)
        public String id;

        @ColumnInfo(name = "state")
        public WorkInfo.State state;

        public IdAndState(String id, WorkInfo.State state) {
            j.g(id, "id");
            j.g(state, "state");
            this.id = id;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idAndState.id;
            }
            if ((i & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final IdAndState copy(String id, WorkInfo.State state) {
            j.g(id, "id");
            j.g(state, "state");
            return new IdAndState(id, state);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return j.b(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return this.state.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        j.f(strTagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = strTagWithPrefix;
        WORK_INFO_MAPPER = new androidx.camera.camera2.internal.compat.workaround.c(4);
    }

    public WorkSpec(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j, long j6, long j7, Constraints constraints, @IntRange(from = 0) int i, BackoffPolicy backoffPolicy, long j9, long j10, long j11, long j12, boolean z4, OutOfQuotaPolicy outOfQuotaPolicy, int i4, int i6, long j13, int i10, int i11, String str) {
        j.g(id, "id");
        j.g(state, "state");
        j.g(workerClassName, "workerClassName");
        j.g(inputMergerClassName, "inputMergerClassName");
        j.g(input, "input");
        j.g(output, "output");
        j.g(constraints, "constraints");
        j.g(backoffPolicy, "backoffPolicy");
        j.g(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = inputMergerClassName;
        this.input = input;
        this.output = output;
        this.initialDelay = j;
        this.intervalDuration = j6;
        this.flexDuration = j7;
        this.constraints = constraints;
        this.runAttemptCount = i;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j9;
        this.lastEnqueueTime = j10;
        this.minimumRetentionDuration = j11;
        this.scheduleRequestedAt = j12;
        this.expedited = z4;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i4;
        this.generation = i6;
        this.nextScheduleTimeOverride = j13;
        this.nextScheduleTimeOverrideGeneration = i10;
        this.stopReason = i11;
        this.traceTag = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(t.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j6, long j7, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, long j11, long j12, boolean z4, OutOfQuotaPolicy outOfQuotaPolicy, int i4, int i6, long j13, int i10, int i11, String str4, int i12, Object obj) {
        String str5;
        int i13;
        BackoffPolicy backoffPolicy2;
        long j14;
        long j15;
        long j16;
        long j17;
        OutOfQuotaPolicy outOfQuotaPolicy2;
        int i14;
        int i15;
        long j18;
        WorkInfo.State state2;
        int i16;
        boolean z5;
        String str6;
        String str7;
        Data data3;
        Data data4;
        long j19;
        long j20;
        long j21;
        Constraints constraints2;
        int i17;
        String str8 = (i12 & 1) != 0 ? workSpec.id : str;
        WorkInfo.State state3 = (i12 & 2) != 0 ? workSpec.state : state;
        String str9 = (i12 & 4) != 0 ? workSpec.workerClassName : str2;
        String str10 = (i12 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        Data data5 = (i12 & 16) != 0 ? workSpec.input : data;
        Data data6 = (i12 & 32) != 0 ? workSpec.output : data2;
        long j22 = (i12 & 64) != 0 ? workSpec.initialDelay : j;
        long j23 = (i12 & 128) != 0 ? workSpec.intervalDuration : j6;
        long j24 = (i12 & 256) != 0 ? workSpec.flexDuration : j7;
        Constraints constraints3 = (i12 & 512) != 0 ? workSpec.constraints : constraints;
        int i18 = (i12 & 1024) != 0 ? workSpec.runAttemptCount : i;
        String str11 = str8;
        BackoffPolicy backoffPolicy3 = (i12 & 2048) != 0 ? workSpec.backoffPolicy : backoffPolicy;
        WorkInfo.State state4 = state3;
        long j25 = (i12 & 4096) != 0 ? workSpec.backoffDelayDuration : j9;
        long j26 = (i12 & 8192) != 0 ? workSpec.lastEnqueueTime : j10;
        long j27 = (i12 & 16384) != 0 ? workSpec.minimumRetentionDuration : j11;
        long j28 = (i12 & 32768) != 0 ? workSpec.scheduleRequestedAt : j12;
        boolean z8 = (i12 & 65536) != 0 ? workSpec.expedited : z4;
        long j29 = j28;
        OutOfQuotaPolicy outOfQuotaPolicy3 = (i12 & 131072) != 0 ? workSpec.outOfQuotaPolicy : outOfQuotaPolicy;
        int i19 = (i12 & 262144) != 0 ? workSpec.periodCount : i4;
        OutOfQuotaPolicy outOfQuotaPolicy4 = outOfQuotaPolicy3;
        int i20 = (i12 & 524288) != 0 ? workSpec.generation : i6;
        int i21 = i19;
        long j30 = (i12 & 1048576) != 0 ? workSpec.nextScheduleTimeOverride : j13;
        int i22 = (i12 & 2097152) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i10;
        int i23 = (i12 & 4194304) != 0 ? workSpec.stopReason : i11;
        if ((i12 & 8388608) != 0) {
            i13 = i22;
            str5 = workSpec.traceTag;
            j14 = j25;
            j15 = j26;
            j16 = j27;
            j17 = j29;
            outOfQuotaPolicy2 = outOfQuotaPolicy4;
            i14 = i21;
            i15 = i20;
            j18 = j30;
            state2 = state4;
            i16 = i23;
            z5 = z8;
            str6 = str9;
            str7 = str10;
            data3 = data5;
            data4 = data6;
            j19 = j22;
            j20 = j23;
            j21 = j24;
            constraints2 = constraints3;
            i17 = i18;
            backoffPolicy2 = backoffPolicy3;
        } else {
            str5 = str4;
            i13 = i22;
            backoffPolicy2 = backoffPolicy3;
            j14 = j25;
            j15 = j26;
            j16 = j27;
            j17 = j29;
            outOfQuotaPolicy2 = outOfQuotaPolicy4;
            i14 = i21;
            i15 = i20;
            j18 = j30;
            state2 = state4;
            i16 = i23;
            z5 = z8;
            str6 = str9;
            str7 = str10;
            data3 = data5;
            data4 = data6;
            j19 = j22;
            j20 = j23;
            j21 = j24;
            constraints2 = constraints3;
            i17 = i18;
        }
        return workSpec.copy(str11, state2, str6, str7, data3, data4, j19, j20, j21, constraints2, i17, backoffPolicy2, j14, j15, j16, j17, z5, outOfQuotaPolicy2, i14, i15, j18, i13, i16, str5);
    }

    public final long calculateNextRunTime() {
        return Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final String component1() {
        return this.id;
    }

    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.periodCount;
    }

    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.generation;
    }

    public final long component21() {
        return this.nextScheduleTimeOverride;
    }

    public final int component22() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int component23() {
        return this.stopReason;
    }

    public final String component24() {
        return this.traceTag;
    }

    public final String component3() {
        return this.workerClassName;
    }

    public final String component4() {
        return this.inputMergerClassName;
    }

    public final Data component5() {
        return this.input;
    }

    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j, long j6, long j7, Constraints constraints, @IntRange(from = 0) int i, BackoffPolicy backoffPolicy, long j9, long j10, long j11, long j12, boolean z4, OutOfQuotaPolicy outOfQuotaPolicy, int i4, int i6, long j13, int i10, int i11, String str) {
        j.g(id, "id");
        j.g(state, "state");
        j.g(workerClassName, "workerClassName");
        j.g(inputMergerClassName, "inputMergerClassName");
        j.g(input, "input");
        j.g(output, "output");
        j.g(constraints, "constraints");
        j.g(backoffPolicy, "backoffPolicy");
        j.g(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id, state, workerClassName, inputMergerClassName, input, output, j, j6, j7, constraints, i, backoffPolicy, j9, j10, j11, j12, z4, outOfQuotaPolicy, i4, i6, j13, i10, i11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return j.b(this.id, workSpec.id) && this.state == workSpec.state && j.b(this.workerClassName, workSpec.workerClassName) && j.b(this.inputMergerClassName, workSpec.inputMergerClassName) && j.b(this.input, workSpec.input) && j.b(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && j.b(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && j.b(this.traceTag, workSpec.traceTag);
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final String getTraceTag() {
        return this.traceTag;
    }

    public final boolean hasConstraints() {
        return !j.b(Constraints.NONE, this.constraints);
    }

    public int hashCode() {
        int iHashCode = (this.output.hashCode() + ((this.input.hashCode() + AbstractC1414e.c(AbstractC1414e.c((this.state.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.workerClassName), 31, this.inputMergerClassName)) * 31)) * 31;
        long j = this.initialDelay;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j6 = this.intervalDuration;
        int i4 = (i + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.flexDuration;
        int iHashCode2 = (this.backoffPolicy.hashCode() + ((((this.constraints.hashCode() + ((i4 + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31) + this.runAttemptCount) * 31)) * 31;
        long j9 = this.backoffDelayDuration;
        int i6 = (iHashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.lastEnqueueTime;
        int i10 = (i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.minimumRetentionDuration;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.scheduleRequestedAt;
        int iHashCode3 = (((((this.outOfQuotaPolicy.hashCode() + ((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.expedited ? 1231 : 1237)) * 31)) * 31) + this.periodCount) * 31) + this.generation) * 31;
        long j13 = this.nextScheduleTimeOverride;
        int i12 = (((((iHashCode3 + ((int) ((j13 >>> 32) ^ j13))) * 31) + this.nextScheduleTimeOverrideGeneration) * 31) + this.stopReason) * 31;
        String str = this.traceTag;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final void setBackoffDelayDuration(long j) {
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j < 10000) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = kotlin.ranges.d.c(j, 10000L, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final void setNextScheduleTimeOverride(long j) {
        this.nextScheduleTimeOverride = j;
    }

    public final void setNextScheduleTimeOverrideGeneration(int i) {
        this.nextScheduleTimeOverrideGeneration = i;
    }

    public final void setPeriodCount(int i) {
        this.periodCount = i;
    }

    public final void setPeriodic(long j) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j6 = j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS ? 900000L : j;
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            j = 900000;
        }
        setPeriodic(j6, j);
    }

    public final void setTraceTag(String str) {
        this.traceTag = str;
    }

    public String toString() {
        return androidx.camera.core.impl.a.n(new StringBuilder("{WorkSpec: "), this.id, '}');
    }

    public final void setPeriodic(long j, long j6) {
        long j7 = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        if (j >= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            j7 = j;
        }
        this.intervalDuration = j7;
        if (j6 < 300000) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j6 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j);
        }
        this.flexDuration = kotlin.ranges.d.c(j6, 300000L, this.intervalDuration);
    }

    public static final class WorkInfoPojo {

        @ColumnInfo(name = "backoff_delay_duration")
        private long backoffDelayDuration;

        @ColumnInfo(name = "backoff_policy")
        private BackoffPolicy backoffPolicy;

        @Embedded
        private final Constraints constraints;

        @ColumnInfo(name = "flex_duration")
        private final long flexDuration;

        @ColumnInfo(name = "generation")
        private final int generation;

        @ColumnInfo(name = TtmlNode.ATTR_ID)
        private final String id;

        @ColumnInfo(name = "initial_delay")
        private final long initialDelay;

        @ColumnInfo(name = "interval_duration")
        private final long intervalDuration;

        @ColumnInfo(name = "last_enqueue_time")
        private long lastEnqueueTime;

        @ColumnInfo(name = "next_schedule_time_override")
        private final long nextScheduleTimeOverride;

        @ColumnInfo(name = "output")
        private final Data output;

        @ColumnInfo(defaultValue = "0", name = "period_count")
        private int periodCount;

        @Relation(entity = WorkProgress.class, entityColumn = "work_spec_id", parentColumn = TtmlNode.ATTR_ID, projection = {"progress"})
        private final List<Data> progress;

        @ColumnInfo(name = "run_attempt_count")
        private final int runAttemptCount;

        @ColumnInfo(name = "state")
        private final WorkInfo.State state;

        @ColumnInfo(name = DownloadService.KEY_STOP_REASON)
        private final int stopReason;

        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = TtmlNode.ATTR_ID, projection = {"tag"})
        private final List<String> tags;

        public WorkInfoPojo(String id, WorkInfo.State state, Data output, long j, long j6, long j7, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, int i4, int i6, long j11, int i10, List<String> tags, List<Data> progress) {
            j.g(id, "id");
            j.g(state, "state");
            j.g(output, "output");
            j.g(constraints, "constraints");
            j.g(backoffPolicy, "backoffPolicy");
            j.g(tags, "tags");
            j.g(progress, "progress");
            this.id = id;
            this.state = state;
            this.output = output;
            this.initialDelay = j;
            this.intervalDuration = j6;
            this.flexDuration = j7;
            this.constraints = constraints;
            this.runAttemptCount = i;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j9;
            this.lastEnqueueTime = j10;
            this.periodCount = i4;
            this.generation = i6;
            this.nextScheduleTimeOverride = j11;
            this.stopReason = i10;
            this.tags = tags;
            this.progress = progress;
        }

        private final long calculateNextRunTimeMillis() {
            if (this.state == WorkInfo.State.ENQUEUED) {
                return WorkSpec.Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, Data data, long j, long j6, long j7, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, int i4, int i6, long j11, int i10, List list, List list2, int i11, Object obj) {
            String str2 = (i11 & 1) != 0 ? workInfoPojo.id : str;
            WorkInfo.State state2 = (i11 & 2) != 0 ? workInfoPojo.state : state;
            return workInfoPojo.copy(str2, state2, (i11 & 4) != 0 ? workInfoPojo.output : data, (i11 & 8) != 0 ? workInfoPojo.initialDelay : j, (i11 & 16) != 0 ? workInfoPojo.intervalDuration : j6, (i11 & 32) != 0 ? workInfoPojo.flexDuration : j7, (i11 & 64) != 0 ? workInfoPojo.constraints : constraints, (i11 & 128) != 0 ? workInfoPojo.runAttemptCount : i, (i11 & 256) != 0 ? workInfoPojo.backoffPolicy : backoffPolicy, (i11 & 512) != 0 ? workInfoPojo.backoffDelayDuration : j9, (i11 & 1024) != 0 ? workInfoPojo.lastEnqueueTime : j10, (i11 & 2048) != 0 ? workInfoPojo.periodCount : i4, (i11 & 4096) != 0 ? workInfoPojo.generation : i6, (i11 & 8192) != 0 ? workInfoPojo.nextScheduleTimeOverride : j11, (i11 & 16384) != 0 ? workInfoPojo.stopReason : i10, (32768 & i11) != 0 ? workInfoPojo.tags : list, (i11 & 65536) != 0 ? workInfoPojo.progress : list2);
        }

        private final WorkInfo.PeriodicityInfo getPeriodicityOrNull() {
            long j = this.intervalDuration;
            if (j != 0) {
                return new WorkInfo.PeriodicityInfo(j, this.flexDuration);
            }
            return null;
        }

        public final String component1() {
            return this.id;
        }

        public final long component10() {
            return this.backoffDelayDuration;
        }

        public final long component11() {
            return this.lastEnqueueTime;
        }

        public final int component12() {
            return this.periodCount;
        }

        public final int component13() {
            return this.generation;
        }

        public final long component14() {
            return this.nextScheduleTimeOverride;
        }

        public final int component15() {
            return this.stopReason;
        }

        public final List<String> component16() {
            return this.tags;
        }

        public final List<Data> component17() {
            return this.progress;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final Data component3() {
            return this.output;
        }

        public final long component4() {
            return this.initialDelay;
        }

        public final long component5() {
            return this.intervalDuration;
        }

        public final long component6() {
            return this.flexDuration;
        }

        public final Constraints component7() {
            return this.constraints;
        }

        public final int component8() {
            return this.runAttemptCount;
        }

        public final BackoffPolicy component9() {
            return this.backoffPolicy;
        }

        public final WorkInfoPojo copy(String id, WorkInfo.State state, Data output, long j, long j6, long j7, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, int i4, int i6, long j11, int i10, List<String> tags, List<Data> progress) {
            j.g(id, "id");
            j.g(state, "state");
            j.g(output, "output");
            j.g(constraints, "constraints");
            j.g(backoffPolicy, "backoffPolicy");
            j.g(tags, "tags");
            j.g(progress, "progress");
            return new WorkInfoPojo(id, state, output, j, j6, j7, constraints, i, backoffPolicy, j9, j10, i4, i6, j11, i10, tags, progress);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return j.b(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && j.b(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && j.b(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && j.b(this.tags, workInfoPojo.tags) && j.b(this.progress, workInfoPojo.progress);
        }

        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        public final BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        public final Constraints getConstraints() {
            return this.constraints;
        }

        public final long getFlexDuration() {
            return this.flexDuration;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final String getId() {
            return this.id;
        }

        public final long getInitialDelay() {
            return this.initialDelay;
        }

        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        public final Data getOutput() {
            return this.output;
        }

        public final int getPeriodCount() {
            return this.periodCount;
        }

        public final List<Data> getProgress() {
            return this.progress;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public final WorkInfo.State getState() {
            return this.state;
        }

        public final int getStopReason() {
            return this.stopReason;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public int hashCode() {
            int iHashCode = (this.output.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
            long j = this.initialDelay;
            int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
            long j6 = this.intervalDuration;
            int i4 = (i + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j7 = this.flexDuration;
            int iHashCode2 = (this.backoffPolicy.hashCode() + ((((this.constraints.hashCode() + ((i4 + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31) + this.runAttemptCount) * 31)) * 31;
            long j9 = this.backoffDelayDuration;
            int i6 = (iHashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.lastEnqueueTime;
            int i10 = (((((i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.periodCount) * 31) + this.generation) * 31;
            long j11 = this.nextScheduleTimeOverride;
            return this.progress.hashCode() + AbstractC1414e.d(this.tags, (((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.stopReason) * 31, 31);
        }

        public final boolean isBackedOff() {
            return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
        }

        public final boolean isPeriodic() {
            return this.intervalDuration != 0;
        }

        public final void setBackoffDelayDuration(long j) {
            this.backoffDelayDuration = j;
        }

        public final void setBackoffPolicy(BackoffPolicy backoffPolicy) {
            j.g(backoffPolicy, "<set-?>");
            this.backoffPolicy = backoffPolicy;
        }

        public final void setLastEnqueueTime(long j) {
            this.lastEnqueueTime = j;
        }

        public final void setPeriodCount(int i) {
            this.periodCount = i;
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        public final WorkInfo toWorkInfo() {
            Data data = !this.progress.isEmpty() ? this.progress.get(0) : Data.EMPTY;
            UUID uuidFromString = UUID.fromString(this.id);
            j.f(uuidFromString, "fromString(id)");
            return new WorkInfo(uuidFromString, this.state, new HashSet(this.tags), this.output, data, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, getPeriodicityOrNull(), calculateNextRunTimeMillis(), this.stopReason);
        }

        public /* synthetic */ WorkInfoPojo(String str, WorkInfo.State state, Data data, long j, long j6, long j7, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, int i4, int i6, long j11, int i10, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, state, data, (i11 & 8) != 0 ? 0L : j, (i11 & 16) != 0 ? 0L : j6, (i11 & 32) != 0 ? 0L : j7, constraints, i, (i11 & 256) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i11 & 512) != 0 ? 30000L : j9, (i11 & 1024) != 0 ? 0L : j10, (i11 & 2048) != 0 ? 0 : i4, i6, j11, i10, list, list2);
        }
    }

    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j6, long j7, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, long j11, long j12, boolean z4, OutOfQuotaPolicy outOfQuotaPolicy, int i4, int i6, long j13, int i10, int i11, String str4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? WorkInfo.State.ENQUEUED : state, str2, (i12 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i12 & 16) != 0 ? Data.EMPTY : data, (i12 & 32) != 0 ? Data.EMPTY : data2, (i12 & 64) != 0 ? 0L : j, (i12 & 128) != 0 ? 0L : j6, (i12 & 256) != 0 ? 0L : j7, (i12 & 512) != 0 ? Constraints.NONE : constraints, (i12 & 1024) != 0 ? 0 : i, (i12 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i12 & 4096) != 0 ? 30000L : j9, (i12 & 8192) != 0 ? -1L : j10, (i12 & 16384) == 0 ? j11 : 0L, (32768 & i12) != 0 ? -1L : j12, (65536 & i12) != 0 ? false : z4, (131072 & i12) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i12) != 0 ? 0 : i4, (524288 & i12) != 0 ? 0 : i6, (1048576 & i12) != 0 ? Long.MAX_VALUE : j13, (2097152 & i12) != 0 ? 0 : i10, (4194304 & i12) != 0 ? -256 : i11, (i12 & 8388608) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
        j.g(id, "id");
        j.g(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String newId, WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new Data(other.input), new Data(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new Constraints(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, other.nextScheduleTimeOverride, other.nextScheduleTimeOverrideGeneration, other.stopReason, other.traceTag, 524288, null);
        j.g(newId, "newId");
        j.g(other, "other");
    }
}
