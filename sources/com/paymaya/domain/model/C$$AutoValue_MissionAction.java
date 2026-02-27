package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MissionAction;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionAction, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MissionAction extends MissionAction {
    private final boolean mCompleted;
    private final String mDescription;
    private final String mName;
    private final Boolean mOngoing;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MissionAction$Builder */
    public static class Builder extends MissionAction.Builder {
        private Boolean mCompleted;
        private String mDescription;
        private String mName;
        private Boolean mOngoing;

        @Override // com.paymaya.domain.model.MissionAction.Builder
        public MissionAction build() {
            String strI = this.mName == null ? " mName" : "";
            if (this.mCompleted == null) {
                strI = s.i(strI, " mCompleted");
            }
            if (strI.isEmpty()) {
                return new AutoValue_MissionAction(this.mName, this.mCompleted.booleanValue(), this.mDescription, this.mOngoing);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.MissionAction.Builder
        public MissionAction.Builder mCompleted(boolean z4) {
            this.mCompleted = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.MissionAction.Builder
        public MissionAction.Builder mDescription(@Nullable String str) {
            this.mDescription = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionAction.Builder
        public MissionAction.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MissionAction.Builder
        public MissionAction.Builder mOngoing(@Nullable Boolean bool) {
            this.mOngoing = bool;
            return this;
        }
    }

    public C$$AutoValue_MissionAction(String str, boolean z4, @Nullable String str2, @Nullable Boolean bool) {
        if (str == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str;
        this.mCompleted = z4;
        this.mDescription = str2;
        this.mOngoing = bool;
    }

    public boolean equals(Object obj) {
        String str;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MissionAction) {
            MissionAction missionAction = (MissionAction) obj;
            if (this.mName.equals(missionAction.mName()) && this.mCompleted == missionAction.mCompleted() && ((str = this.mDescription) != null ? str.equals(missionAction.mDescription()) : missionAction.mDescription() == null) && ((bool = this.mOngoing) != null ? bool.equals(missionAction.mOngoing()) : missionAction.mOngoing() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.mName.hashCode() ^ 1000003) * 1000003) ^ (this.mCompleted ? 1231 : 1237)) * 1000003;
        String str = this.mDescription;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.mOngoing;
        return iHashCode2 ^ (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.MissionAction
    @InterfaceC1498b("completed")
    public boolean mCompleted() {
        return this.mCompleted;
    }

    @Override // com.paymaya.domain.model.MissionAction
    @Nullable
    @InterfaceC1498b("description")
    public String mDescription() {
        return this.mDescription;
    }

    @Override // com.paymaya.domain.model.MissionAction
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.MissionAction
    @Nullable
    @InterfaceC1498b("ongoing")
    public Boolean mOngoing() {
        return this.mOngoing;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MissionAction{mName=");
        sb2.append(this.mName);
        sb2.append(", mCompleted=");
        sb2.append(this.mCompleted);
        sb2.append(", mDescription=");
        sb2.append(this.mDescription);
        sb2.append(", mOngoing=");
        return AbstractC1213b.N(sb2, this.mOngoing, "}");
    }
}
