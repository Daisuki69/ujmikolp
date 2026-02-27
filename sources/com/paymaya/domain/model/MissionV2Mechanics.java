package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MissionV2Mechanics implements Parcelable {
    public static final Parcelable.Creator<MissionV2Mechanics> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("button_link")
    private final String buttonLink;

    @InterfaceC1497a
    @InterfaceC1498b("button_title")
    private final String buttonTitle;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    public static final class Creator implements Parcelable.Creator<MissionV2Mechanics> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Mechanics createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MissionV2Mechanics(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Mechanics[] newArray(int i) {
            return new MissionV2Mechanics[i];
        }
    }

    public MissionV2Mechanics(String str, String str2, String str3) {
        this.description = str;
        this.buttonTitle = str2;
        this.buttonLink = str3;
    }

    public static /* synthetic */ MissionV2Mechanics copy$default(MissionV2Mechanics missionV2Mechanics, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionV2Mechanics.description;
        }
        if ((i & 2) != 0) {
            str2 = missionV2Mechanics.buttonTitle;
        }
        if ((i & 4) != 0) {
            str3 = missionV2Mechanics.buttonLink;
        }
        return missionV2Mechanics.copy(str, str2, str3);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.buttonTitle;
    }

    public final String component3() {
        return this.buttonLink;
    }

    public final MissionV2Mechanics copy(String str, String str2, String str3) {
        return new MissionV2Mechanics(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionV2Mechanics)) {
            return false;
        }
        MissionV2Mechanics missionV2Mechanics = (MissionV2Mechanics) obj;
        return j.b(this.description, missionV2Mechanics.description) && j.b(this.buttonTitle, missionV2Mechanics.buttonTitle) && j.b(this.buttonLink, missionV2Mechanics.buttonLink);
    }

    public final String getButtonLink() {
        return this.buttonLink;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonLink;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.buttonTitle;
        return s.p(s.x("MissionV2Mechanics(description=", str, ", buttonTitle=", str2, ", buttonLink="), this.buttonLink, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.description);
        dest.writeString(this.buttonTitle);
        dest.writeString(this.buttonLink);
    }
}
