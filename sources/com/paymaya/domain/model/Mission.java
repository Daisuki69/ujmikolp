package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Mission;
import com.paymaya.domain.model.C$AutoValue_Mission;
import com.paymaya.domain.model.MissionListItem;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Mission implements Parcelable, MissionListItem {

    public static abstract class Builder {
        public abstract Mission build();

        public abstract Builder mCompleted(boolean z4);

        public abstract Builder mDescription(String str);

        public abstract Builder mEndDate(String str);

        public abstract Builder mImageUrl(String str);

        public abstract Builder mMissionActionsList(@Nullable List<MissionAction> list);

        public abstract Builder mMissionMechanics(@Nullable MissionMechanics missionMechanics);

        public abstract Builder mMissionProgress(@Nullable MissionProgress missionProgress);

        public abstract Builder mMissionReward(@Nullable MissionReward missionReward);

        public abstract Builder mMissionValidity(MissionValidity missionValidity);

        public abstract Builder mStartDate(String str);

        public abstract Builder mStatus(String str);

        public abstract Builder mTitle(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Mission.Builder().mCompleted(false);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Mission.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.MissionListItem
    public MissionListItem.VIEW_TYPE getViewType() {
        return MissionListItem.VIEW_TYPE.VIEW_TYPE_MISSION;
    }

    @InterfaceC1498b("completed")
    public abstract boolean mCompleted();

    @InterfaceC1498b("description")
    public abstract String mDescription();

    @InterfaceC1498b("end_date")
    public abstract String mEndDate();

    @Nullable
    @InterfaceC1498b("image_url")
    public abstract String mImageUrl();

    @Nullable
    @InterfaceC1498b("actions")
    public abstract List<MissionAction> mMissionActionsList();

    @Nullable
    @InterfaceC1498b("mechanics")
    public abstract MissionMechanics mMissionMechanics();

    @Nullable
    @InterfaceC1498b("progress")
    public abstract MissionProgress mMissionProgress();

    @Nullable
    @InterfaceC1498b("reward")
    public abstract MissionReward mMissionReward();

    @Nullable
    @InterfaceC1498b("validity")
    public abstract MissionValidity mMissionValidity();

    @InterfaceC1498b("start_date")
    public abstract String mStartDate();

    @Nullable
    @InterfaceC1498b("status")
    public abstract String mStatus();

    @InterfaceC1498b("title")
    public abstract String mTitle();

    public abstract Builder toBuilder();
}
