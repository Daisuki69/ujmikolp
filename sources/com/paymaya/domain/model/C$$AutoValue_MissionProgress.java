package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.MissionProgress;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionProgress, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MissionProgress extends MissionProgress {
    private final int mActionsCompleted;
    private final int mActionsOngoing;
    private final int mActionsTotal;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionProgress$Builder */
    public static class Builder extends MissionProgress.Builder {
        private Integer mActionsCompleted;
        private Integer mActionsOngoing;
        private Integer mActionsTotal;

        @Override // com.paymaya.domain.model.MissionProgress.Builder
        public MissionProgress build() {
            String strI = this.mActionsCompleted == null ? " mActionsCompleted" : "";
            if (this.mActionsTotal == null) {
                strI = s.i(strI, " mActionsTotal");
            }
            if (this.mActionsOngoing == null) {
                strI = s.i(strI, " mActionsOngoing");
            }
            if (strI.isEmpty()) {
                return new AutoValue_MissionProgress(this.mActionsCompleted.intValue(), this.mActionsTotal.intValue(), this.mActionsOngoing.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.MissionProgress.Builder
        public MissionProgress.Builder mActionsCompleted(int i) {
            this.mActionsCompleted = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.MissionProgress.Builder
        public MissionProgress.Builder mActionsOngoing(int i) {
            this.mActionsOngoing = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.MissionProgress.Builder
        public MissionProgress.Builder mActionsTotal(int i) {
            this.mActionsTotal = Integer.valueOf(i);
            return this;
        }
    }

    public C$$AutoValue_MissionProgress(int i, int i4, int i6) {
        this.mActionsCompleted = i;
        this.mActionsTotal = i4;
        this.mActionsOngoing = i6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MissionProgress) {
            MissionProgress missionProgress = (MissionProgress) obj;
            if (this.mActionsCompleted == missionProgress.mActionsCompleted() && this.mActionsTotal == missionProgress.mActionsTotal() && this.mActionsOngoing == missionProgress.mActionsOngoing()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.mActionsCompleted ^ 1000003) * 1000003) ^ this.mActionsTotal) * 1000003) ^ this.mActionsOngoing;
    }

    @Override // com.paymaya.domain.model.MissionProgress
    @InterfaceC1498b("actions_completed")
    public int mActionsCompleted() {
        return this.mActionsCompleted;
    }

    @Override // com.paymaya.domain.model.MissionProgress
    @InterfaceC1498b("actions_ongoing")
    public int mActionsOngoing() {
        return this.mActionsOngoing;
    }

    @Override // com.paymaya.domain.model.MissionProgress
    @InterfaceC1498b("actions_total")
    public int mActionsTotal() {
        return this.mActionsTotal;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MissionProgress{mActionsCompleted=");
        sb2.append(this.mActionsCompleted);
        sb2.append(", mActionsTotal=");
        sb2.append(this.mActionsTotal);
        sb2.append(", mActionsOngoing=");
        return s.o(sb2, "}", this.mActionsOngoing);
    }
}
