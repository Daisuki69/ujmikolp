package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Mission;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Mission, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Mission extends Mission {
    private final boolean mCompleted;
    private final String mDescription;
    private final String mEndDate;
    private final String mImageUrl;
    private final List<MissionAction> mMissionActionsList;
    private final MissionMechanics mMissionMechanics;
    private final MissionProgress mMissionProgress;
    private final MissionReward mMissionReward;
    private final MissionValidity mMissionValidity;
    private final String mStartDate;
    private final String mStatus;
    private final String mTitle;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Mission$Builder */
    public static class Builder extends Mission.Builder {
        private Boolean mCompleted;
        private String mDescription;
        private String mEndDate;
        private String mImageUrl;
        private List<MissionAction> mMissionActionsList;
        private MissionMechanics mMissionMechanics;
        private MissionProgress mMissionProgress;
        private MissionReward mMissionReward;
        private MissionValidity mMissionValidity;
        private String mStartDate;
        private String mStatus;
        private String mTitle;

        public /* synthetic */ Builder(Mission mission, int i) {
            this(mission);
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission build() {
            String strI = this.mTitle == null ? " mTitle" : "";
            if (this.mDescription == null) {
                strI = s.i(strI, " mDescription");
            }
            if (this.mStartDate == null) {
                strI = s.i(strI, " mStartDate");
            }
            if (this.mEndDate == null) {
                strI = s.i(strI, " mEndDate");
            }
            if (this.mCompleted == null) {
                strI = s.i(strI, " mCompleted");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Mission(this.mTitle, this.mDescription, this.mStartDate, this.mEndDate, this.mImageUrl, this.mMissionValidity, this.mMissionReward, this.mMissionMechanics, this.mMissionActionsList, this.mMissionProgress, this.mCompleted.booleanValue(), this.mStatus);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mCompleted(boolean z4) {
            this.mCompleted = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mDescription(String str) {
            if (str == null) {
                throw new NullPointerException("Null mDescription");
            }
            this.mDescription = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mEndDate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mEndDate");
            }
            this.mEndDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mImageUrl(String str) {
            this.mImageUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mMissionActionsList(@Nullable List<MissionAction> list) {
            this.mMissionActionsList = list;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mMissionMechanics(@Nullable MissionMechanics missionMechanics) {
            this.mMissionMechanics = missionMechanics;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mMissionProgress(@Nullable MissionProgress missionProgress) {
            this.mMissionProgress = missionProgress;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mMissionReward(@Nullable MissionReward missionReward) {
            this.mMissionReward = missionReward;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mMissionValidity(MissionValidity missionValidity) {
            this.mMissionValidity = missionValidity;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mStartDate(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStartDate");
            }
            this.mStartDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mStatus(String str) {
            this.mStatus = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Mission.Builder
        public Mission.Builder mTitle(String str) {
            if (str == null) {
                throw new NullPointerException("Null mTitle");
            }
            this.mTitle = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Mission mission) {
            this.mTitle = mission.mTitle();
            this.mDescription = mission.mDescription();
            this.mStartDate = mission.mStartDate();
            this.mEndDate = mission.mEndDate();
            this.mImageUrl = mission.mImageUrl();
            this.mMissionValidity = mission.mMissionValidity();
            this.mMissionReward = mission.mMissionReward();
            this.mMissionMechanics = mission.mMissionMechanics();
            this.mMissionActionsList = mission.mMissionActionsList();
            this.mMissionProgress = mission.mMissionProgress();
            this.mCompleted = Boolean.valueOf(mission.mCompleted());
            this.mStatus = mission.mStatus();
        }
    }

    public C$$AutoValue_Mission(String str, String str2, String str3, String str4, @Nullable String str5, @Nullable MissionValidity missionValidity, @Nullable MissionReward missionReward, @Nullable MissionMechanics missionMechanics, @Nullable List<MissionAction> list, @Nullable MissionProgress missionProgress, boolean z4, @Nullable String str6) {
        if (str == null) {
            throw new NullPointerException("Null mTitle");
        }
        this.mTitle = str;
        if (str2 == null) {
            throw new NullPointerException("Null mDescription");
        }
        this.mDescription = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mStartDate");
        }
        this.mStartDate = str3;
        if (str4 == null) {
            throw new NullPointerException("Null mEndDate");
        }
        this.mEndDate = str4;
        this.mImageUrl = str5;
        this.mMissionValidity = missionValidity;
        this.mMissionReward = missionReward;
        this.mMissionMechanics = missionMechanics;
        this.mMissionActionsList = list;
        this.mMissionProgress = missionProgress;
        this.mCompleted = z4;
        this.mStatus = str6;
    }

    public boolean equals(Object obj) {
        String str;
        MissionValidity missionValidity;
        MissionReward missionReward;
        MissionMechanics missionMechanics;
        List<MissionAction> list;
        MissionProgress missionProgress;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Mission) {
            Mission mission = (Mission) obj;
            if (this.mTitle.equals(mission.mTitle()) && this.mDescription.equals(mission.mDescription()) && this.mStartDate.equals(mission.mStartDate()) && this.mEndDate.equals(mission.mEndDate()) && ((str = this.mImageUrl) != null ? str.equals(mission.mImageUrl()) : mission.mImageUrl() == null) && ((missionValidity = this.mMissionValidity) != null ? missionValidity.equals(mission.mMissionValidity()) : mission.mMissionValidity() == null) && ((missionReward = this.mMissionReward) != null ? missionReward.equals(mission.mMissionReward()) : mission.mMissionReward() == null) && ((missionMechanics = this.mMissionMechanics) != null ? missionMechanics.equals(mission.mMissionMechanics()) : mission.mMissionMechanics() == null) && ((list = this.mMissionActionsList) != null ? list.equals(mission.mMissionActionsList()) : mission.mMissionActionsList() == null) && ((missionProgress = this.mMissionProgress) != null ? missionProgress.equals(mission.mMissionProgress()) : mission.mMissionProgress() == null) && this.mCompleted == mission.mCompleted() && ((str2 = this.mStatus) != null ? str2.equals(mission.mStatus()) : mission.mStatus() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.mTitle.hashCode() ^ 1000003) * 1000003) ^ this.mDescription.hashCode()) * 1000003) ^ this.mStartDate.hashCode()) * 1000003) ^ this.mEndDate.hashCode()) * 1000003;
        String str = this.mImageUrl;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        MissionValidity missionValidity = this.mMissionValidity;
        int iHashCode3 = (iHashCode2 ^ (missionValidity == null ? 0 : missionValidity.hashCode())) * 1000003;
        MissionReward missionReward = this.mMissionReward;
        int iHashCode4 = (iHashCode3 ^ (missionReward == null ? 0 : missionReward.hashCode())) * 1000003;
        MissionMechanics missionMechanics = this.mMissionMechanics;
        int iHashCode5 = (iHashCode4 ^ (missionMechanics == null ? 0 : missionMechanics.hashCode())) * 1000003;
        List<MissionAction> list = this.mMissionActionsList;
        int iHashCode6 = (iHashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        MissionProgress missionProgress = this.mMissionProgress;
        int iHashCode7 = (((iHashCode6 ^ (missionProgress == null ? 0 : missionProgress.hashCode())) * 1000003) ^ (this.mCompleted ? 1231 : 1237)) * 1000003;
        String str2 = this.mStatus;
        return iHashCode7 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Mission
    @InterfaceC1498b("completed")
    public boolean mCompleted() {
        return this.mCompleted;
    }

    @Override // com.paymaya.domain.model.Mission
    @InterfaceC1498b("description")
    public String mDescription() {
        return this.mDescription;
    }

    @Override // com.paymaya.domain.model.Mission
    @InterfaceC1498b("end_date")
    public String mEndDate() {
        return this.mEndDate;
    }

    @Override // com.paymaya.domain.model.Mission
    @Nullable
    @InterfaceC1498b("image_url")
    public String mImageUrl() {
        return this.mImageUrl;
    }

    @Override // com.paymaya.domain.model.Mission
    @Nullable
    @InterfaceC1498b("actions")
    public List<MissionAction> mMissionActionsList() {
        return this.mMissionActionsList;
    }

    @Override // com.paymaya.domain.model.Mission
    @Nullable
    @InterfaceC1498b("mechanics")
    public MissionMechanics mMissionMechanics() {
        return this.mMissionMechanics;
    }

    @Override // com.paymaya.domain.model.Mission
    @Nullable
    @InterfaceC1498b("progress")
    public MissionProgress mMissionProgress() {
        return this.mMissionProgress;
    }

    @Override // com.paymaya.domain.model.Mission
    @Nullable
    @InterfaceC1498b("reward")
    public MissionReward mMissionReward() {
        return this.mMissionReward;
    }

    @Override // com.paymaya.domain.model.Mission
    @Nullable
    @InterfaceC1498b("validity")
    public MissionValidity mMissionValidity() {
        return this.mMissionValidity;
    }

    @Override // com.paymaya.domain.model.Mission
    @InterfaceC1498b("start_date")
    public String mStartDate() {
        return this.mStartDate;
    }

    @Override // com.paymaya.domain.model.Mission
    @Nullable
    @InterfaceC1498b("status")
    public String mStatus() {
        return this.mStatus;
    }

    @Override // com.paymaya.domain.model.Mission
    @InterfaceC1498b("title")
    public String mTitle() {
        return this.mTitle;
    }

    @Override // com.paymaya.domain.model.Mission
    public Mission.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Mission{mTitle=");
        sb2.append(this.mTitle);
        sb2.append(", mDescription=");
        sb2.append(this.mDescription);
        sb2.append(", mStartDate=");
        sb2.append(this.mStartDate);
        sb2.append(", mEndDate=");
        sb2.append(this.mEndDate);
        sb2.append(", mImageUrl=");
        sb2.append(this.mImageUrl);
        sb2.append(", mMissionValidity=");
        sb2.append(this.mMissionValidity);
        sb2.append(", mMissionReward=");
        sb2.append(this.mMissionReward);
        sb2.append(", mMissionMechanics=");
        sb2.append(this.mMissionMechanics);
        sb2.append(", mMissionActionsList=");
        sb2.append(this.mMissionActionsList);
        sb2.append(", mMissionProgress=");
        sb2.append(this.mMissionProgress);
        sb2.append(", mCompleted=");
        sb2.append(this.mCompleted);
        sb2.append(", mStatus=");
        return s.p(sb2, this.mStatus, "}");
    }
}
