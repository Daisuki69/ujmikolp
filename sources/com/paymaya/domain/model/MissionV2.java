package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MissionsV2ListItem;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MissionV2 implements Parcelable, MissionsV2ListItem {
    public static final Parcelable.Creator<MissionV2> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("actions")
    private final List<MissionV2Action> actions;

    @InterfaceC1497a
    @InterfaceC1498b("completed_count")
    private final Integer completedCount;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b("end_date")
    private final String endDate;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("image_url")
    private final String imageUrl;

    @InterfaceC1497a
    @InterfaceC1498b("maximum_completed_count")
    private final Integer maximumCompletedCount;

    @InterfaceC1497a
    @InterfaceC1498b("mechanics")
    private final MissionV2Mechanics mechanics;

    @InterfaceC1497a
    @InterfaceC1498b("reward")
    private final MissionV2Reward reward;

    @InterfaceC1497a
    @InterfaceC1498b("start_date")
    private final String startDate;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    @InterfaceC1497a
    @InterfaceC1498b("title")
    private final String title;

    @InterfaceC1497a
    @InterfaceC1498b("validity")
    private final MissionV2Validity validity;

    public static final class Creator implements Parcelable.Creator<MissionV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2 createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MissionV2Validity missionV2ValidityCreateFromParcel = parcel.readInt() == 0 ? null : MissionV2Validity.CREATOR.createFromParcel(parcel);
            MissionV2Reward missionV2RewardCreateFromParcel = parcel.readInt() == 0 ? null : MissionV2Reward.CREATOR.createFromParcel(parcel);
            MissionV2Mechanics missionV2MechanicsCreateFromParcel = parcel.readInt() == 0 ? null : MissionV2Mechanics.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
                str = string;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(MissionV2Action.CREATOR, parcel, arrayList2, I4, 1);
                    i = i;
                    string = string;
                }
                str = string;
                arrayList = arrayList2;
            }
            return new MissionV2(str, string2, string3, string4, string5, string6, string7, numValueOf, numValueOf2, missionV2ValidityCreateFromParcel, missionV2RewardCreateFromParcel, missionV2MechanicsCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2[] newArray(int i) {
            return new MissionV2[i];
        }
    }

    public MissionV2(String id, String title, String description, String startDate, String endDate, String str, String str2, Integer num, Integer num2, MissionV2Validity missionV2Validity, MissionV2Reward missionV2Reward, MissionV2Mechanics missionV2Mechanics, List<MissionV2Action> list) {
        j.g(id, "id");
        j.g(title, "title");
        j.g(description, "description");
        j.g(startDate, "startDate");
        j.g(endDate, "endDate");
        this.id = id;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = str;
        this.imageUrl = str2;
        this.maximumCompletedCount = num;
        this.completedCount = num2;
        this.validity = missionV2Validity;
        this.reward = missionV2Reward;
        this.mechanics = missionV2Mechanics;
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionV2 copy$default(MissionV2 missionV2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, MissionV2Validity missionV2Validity, MissionV2Reward missionV2Reward, MissionV2Mechanics missionV2Mechanics, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionV2.id;
        }
        return missionV2.copy(str, (i & 2) != 0 ? missionV2.title : str2, (i & 4) != 0 ? missionV2.description : str3, (i & 8) != 0 ? missionV2.startDate : str4, (i & 16) != 0 ? missionV2.endDate : str5, (i & 32) != 0 ? missionV2.status : str6, (i & 64) != 0 ? missionV2.imageUrl : str7, (i & 128) != 0 ? missionV2.maximumCompletedCount : num, (i & 256) != 0 ? missionV2.completedCount : num2, (i & 512) != 0 ? missionV2.validity : missionV2Validity, (i & 1024) != 0 ? missionV2.reward : missionV2Reward, (i & 2048) != 0 ? missionV2.mechanics : missionV2Mechanics, (i & 4096) != 0 ? missionV2.actions : list);
    }

    private final MissionsV2ListItem.VIEW_TYPE_MISSION_V2 getMissionType() {
        return "COMPLETED".equals(this.status) ? MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_COMPLETED : "ONGOING".equals(this.status) ? MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_IN_PROGRESS : MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_NOT_STARTED;
    }

    public final String component1() {
        return this.id;
    }

    public final MissionV2Validity component10() {
        return this.validity;
    }

    public final MissionV2Reward component11() {
        return this.reward;
    }

    public final MissionV2Mechanics component12() {
        return this.mechanics;
    }

    public final List<MissionV2Action> component13() {
        return this.actions;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.startDate;
    }

    public final String component5() {
        return this.endDate;
    }

    public final String component6() {
        return this.status;
    }

    public final String component7() {
        return this.imageUrl;
    }

    public final Integer component8() {
        return this.maximumCompletedCount;
    }

    public final Integer component9() {
        return this.completedCount;
    }

    public final MissionV2 copy(String id, String title, String description, String startDate, String endDate, String str, String str2, Integer num, Integer num2, MissionV2Validity missionV2Validity, MissionV2Reward missionV2Reward, MissionV2Mechanics missionV2Mechanics, List<MissionV2Action> list) {
        j.g(id, "id");
        j.g(title, "title");
        j.g(description, "description");
        j.g(startDate, "startDate");
        j.g(endDate, "endDate");
        return new MissionV2(id, title, description, startDate, endDate, str, str2, num, num2, missionV2Validity, missionV2Reward, missionV2Mechanics, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionV2)) {
            return false;
        }
        MissionV2 missionV2 = (MissionV2) obj;
        return j.b(this.id, missionV2.id) && j.b(this.title, missionV2.title) && j.b(this.description, missionV2.description) && j.b(this.startDate, missionV2.startDate) && j.b(this.endDate, missionV2.endDate) && j.b(this.status, missionV2.status) && j.b(this.imageUrl, missionV2.imageUrl) && j.b(this.maximumCompletedCount, missionV2.maximumCompletedCount) && j.b(this.completedCount, missionV2.completedCount) && j.b(this.validity, missionV2.validity) && j.b(this.reward, missionV2.reward) && j.b(this.mechanics, missionV2.mechanics) && j.b(this.actions, missionV2.actions);
    }

    public final List<MissionV2Action> getActions() {
        return this.actions;
    }

    public final Integer getCompletedCount() {
        return this.completedCount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getMaximumCompletedCount() {
        return this.maximumCompletedCount;
    }

    public final MissionV2Mechanics getMechanics() {
        return this.mechanics;
    }

    public final MissionV2Reward getReward() {
        return this.reward;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MissionV2Validity getValidity() {
        return this.validity;
    }

    @Override // com.paymaya.domain.model.MissionsV2ListItem
    public MissionsV2ListItem.VIEW_TYPE_MISSION_V2 getViewTypeMissionV2() {
        return getMissionType();
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.startDate), 31, this.endDate);
        String str = this.status;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.maximumCompletedCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.completedCount;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MissionV2Validity missionV2Validity = this.validity;
        int iHashCode5 = (iHashCode4 + (missionV2Validity == null ? 0 : missionV2Validity.hashCode())) * 31;
        MissionV2Reward missionV2Reward = this.reward;
        int iHashCode6 = (iHashCode5 + (missionV2Reward == null ? 0 : missionV2Reward.hashCode())) * 31;
        MissionV2Mechanics missionV2Mechanics = this.mechanics;
        int iHashCode7 = (iHashCode6 + (missionV2Mechanics == null ? 0 : missionV2Mechanics.hashCode())) * 31;
        List<MissionV2Action> list = this.actions;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.startDate;
        String str5 = this.endDate;
        String str6 = this.status;
        String str7 = this.imageUrl;
        Integer num = this.maximumCompletedCount;
        Integer num2 = this.completedCount;
        MissionV2Validity missionV2Validity = this.validity;
        MissionV2Reward missionV2Reward = this.reward;
        MissionV2Mechanics missionV2Mechanics = this.mechanics;
        List<MissionV2Action> list = this.actions;
        StringBuilder sbX = s.x("MissionV2(id=", str, ", title=", str2, ", description=");
        c.A(sbX, str3, ", startDate=", str4, ", endDate=");
        c.A(sbX, str5, ", status=", str6, ", imageUrl=");
        sbX.append(str7);
        sbX.append(", maximumCompletedCount=");
        sbX.append(num);
        sbX.append(", completedCount=");
        sbX.append(num2);
        sbX.append(", validity=");
        sbX.append(missionV2Validity);
        sbX.append(", reward=");
        sbX.append(missionV2Reward);
        sbX.append(", mechanics=");
        sbX.append(missionV2Mechanics);
        sbX.append(", actions=");
        return s.r(sbX, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
        dest.writeString(this.status);
        dest.writeString(this.imageUrl);
        Integer num = this.maximumCompletedCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        Integer num2 = this.completedCount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num2);
        }
        MissionV2Validity missionV2Validity = this.validity;
        if (missionV2Validity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            missionV2Validity.writeToParcel(dest, i);
        }
        MissionV2Reward missionV2Reward = this.reward;
        if (missionV2Reward == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            missionV2Reward.writeToParcel(dest, i);
        }
        MissionV2Mechanics missionV2Mechanics = this.mechanics;
        if (missionV2Mechanics == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            missionV2Mechanics.writeToParcel(dest, i);
        }
        List<MissionV2Action> list = this.actions;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((MissionV2Action) itP.next()).writeToParcel(dest, i);
        }
    }

    public /* synthetic */ MissionV2(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, MissionV2Validity missionV2Validity, MissionV2Reward missionV2Reward, MissionV2Mechanics missionV2Mechanics, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, num, num2, missionV2Validity, missionV2Reward, missionV2Mechanics, list);
    }
}
