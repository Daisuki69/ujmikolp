package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MissionV2Reward implements Parcelable {
    public static final Parcelable.Creator<MissionV2Reward> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b("preview_icon")
    private final String previewIcon;

    @InterfaceC1497a
    @InterfaceC1498b("title")
    private final String title;

    public static final class Creator implements Parcelable.Creator<MissionV2Reward> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Reward createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MissionV2Reward(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Reward[] newArray(int i) {
            return new MissionV2Reward[i];
        }
    }

    public MissionV2Reward(String str, String str2, String str3) {
        this.title = str;
        this.description = str2;
        this.previewIcon = str3;
    }

    public static /* synthetic */ MissionV2Reward copy$default(MissionV2Reward missionV2Reward, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionV2Reward.title;
        }
        if ((i & 2) != 0) {
            str2 = missionV2Reward.description;
        }
        if ((i & 4) != 0) {
            str3 = missionV2Reward.previewIcon;
        }
        return missionV2Reward.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.previewIcon;
    }

    public final MissionV2Reward copy(String str, String str2, String str3) {
        return new MissionV2Reward(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionV2Reward)) {
            return false;
        }
        MissionV2Reward missionV2Reward = (MissionV2Reward) obj;
        return j.b(this.title, missionV2Reward.title) && j.b(this.description, missionV2Reward.description) && j.b(this.previewIcon, missionV2Reward.previewIcon);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPreviewIcon() {
        return this.previewIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.previewIcon;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isTitleAndDescriptionEmpty() {
        String str = this.title;
        if (str != null && str.length() != 0) {
            return false;
        }
        String str2 = this.description;
        return str2 == null || str2.length() == 0;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return s.p(s.x("MissionV2Reward(title=", str, ", description=", str2, ", previewIcon="), this.previewIcon, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.previewIcon);
    }
}
