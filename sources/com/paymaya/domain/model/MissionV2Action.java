package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MissionV2Action implements Parcelable {
    public static final Parcelable.Creator<MissionV2Action> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("action")
    private final String action;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b("enter_code_spiel")
    private final String enterCodeSpiel;

    @InterfaceC1497a
    @InterfaceC1498b("event")
    private final String event;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("in_details_completed")
    private final Boolean inDetailsCompleted;

    @InterfaceC1497a
    @InterfaceC1498b("in_success_completed")
    private final Boolean inSuccessCompleted;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("progress")
    private final MissionV2Progress progress;

    @InterfaceC1497a
    @InterfaceC1498b("voucher_campaign_id")
    private final String voucherCampaignId;

    public static final class Creator implements Parcelable.Creator<MissionV2Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Action createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            MissionV2Progress missionV2ProgressCreateFromParcel = MissionV2Progress.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MissionV2Action(string, string2, string3, string4, string5, string6, missionV2ProgressCreateFromParcel, string7, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionV2Action[] newArray(int i) {
            return new MissionV2Action[i];
        }
    }

    public MissionV2Action(String id, String name, String str, String str2, String str3, String str4, MissionV2Progress progress, String str5, Boolean bool, Boolean bool2) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(progress, "progress");
        this.id = id;
        this.name = name;
        this.description = str;
        this.event = str2;
        this.action = str3;
        this.voucherCampaignId = str4;
        this.progress = progress;
        this.enterCodeSpiel = str5;
        this.inDetailsCompleted = bool;
        this.inSuccessCompleted = bool2;
    }

    public static /* synthetic */ MissionV2Action copy$default(MissionV2Action missionV2Action, String str, String str2, String str3, String str4, String str5, String str6, MissionV2Progress missionV2Progress, String str7, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionV2Action.id;
        }
        if ((i & 2) != 0) {
            str2 = missionV2Action.name;
        }
        if ((i & 4) != 0) {
            str3 = missionV2Action.description;
        }
        if ((i & 8) != 0) {
            str4 = missionV2Action.event;
        }
        if ((i & 16) != 0) {
            str5 = missionV2Action.action;
        }
        if ((i & 32) != 0) {
            str6 = missionV2Action.voucherCampaignId;
        }
        if ((i & 64) != 0) {
            missionV2Progress = missionV2Action.progress;
        }
        if ((i & 128) != 0) {
            str7 = missionV2Action.enterCodeSpiel;
        }
        if ((i & 256) != 0) {
            bool = missionV2Action.inDetailsCompleted;
        }
        if ((i & 512) != 0) {
            bool2 = missionV2Action.inSuccessCompleted;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        MissionV2Progress missionV2Progress2 = missionV2Progress;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        return missionV2Action.copy(str, str2, str3, str4, str9, str10, missionV2Progress2, str8, bool3, bool4);
    }

    public final String component1() {
        return this.id;
    }

    public final Boolean component10() {
        return this.inSuccessCompleted;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.event;
    }

    public final String component5() {
        return this.action;
    }

    public final String component6() {
        return this.voucherCampaignId;
    }

    public final MissionV2Progress component7() {
        return this.progress;
    }

    public final String component8() {
        return this.enterCodeSpiel;
    }

    public final Boolean component9() {
        return this.inDetailsCompleted;
    }

    public final MissionV2Action copy(String id, String name, String str, String str2, String str3, String str4, MissionV2Progress progress, String str5, Boolean bool, Boolean bool2) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(progress, "progress");
        return new MissionV2Action(id, name, str, str2, str3, str4, progress, str5, bool, bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionV2Action)) {
            return false;
        }
        MissionV2Action missionV2Action = (MissionV2Action) obj;
        return j.b(this.id, missionV2Action.id) && j.b(this.name, missionV2Action.name) && j.b(this.description, missionV2Action.description) && j.b(this.event, missionV2Action.event) && j.b(this.action, missionV2Action.action) && j.b(this.voucherCampaignId, missionV2Action.voucherCampaignId) && j.b(this.progress, missionV2Action.progress) && j.b(this.enterCodeSpiel, missionV2Action.enterCodeSpiel) && j.b(this.inDetailsCompleted, missionV2Action.inDetailsCompleted) && j.b(this.inSuccessCompleted, missionV2Action.inSuccessCompleted);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEnterCodeSpiel() {
        return this.enterCodeSpiel;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean getInDetailsCompleted() {
        return this.inDetailsCompleted;
    }

    public final Boolean getInSuccessCompleted() {
        return this.inSuccessCompleted;
    }

    public final String getName() {
        return this.name;
    }

    public final MissionV2Progress getProgress() {
        return this.progress;
    }

    public final String getVoucherCampaignId() {
        return this.voucherCampaignId;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(this.id.hashCode() * 31, 31, this.name);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.event;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.action;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.voucherCampaignId;
        int iHashCode4 = (this.progress.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.enterCodeSpiel;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.inDetailsCompleted;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.inSuccessCompleted;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.event;
        String str5 = this.action;
        String str6 = this.voucherCampaignId;
        MissionV2Progress missionV2Progress = this.progress;
        String str7 = this.enterCodeSpiel;
        Boolean bool = this.inDetailsCompleted;
        Boolean bool2 = this.inSuccessCompleted;
        StringBuilder sbX = s.x("MissionV2Action(id=", str, ", name=", str2, ", description=");
        c.A(sbX, str3, ", event=", str4, ", action=");
        c.A(sbX, str5, ", voucherCampaignId=", str6, ", progress=");
        sbX.append(missionV2Progress);
        sbX.append(", enterCodeSpiel=");
        sbX.append(str7);
        sbX.append(", inDetailsCompleted=");
        sbX.append(bool);
        sbX.append(", inSuccessCompleted=");
        sbX.append(bool2);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.event);
        dest.writeString(this.action);
        dest.writeString(this.voucherCampaignId);
        this.progress.writeToParcel(dest, i);
        dest.writeString(this.enterCodeSpiel);
        Boolean bool = this.inDetailsCompleted;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
        Boolean bool2 = this.inSuccessCompleted;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool2);
        }
    }

    public /* synthetic */ MissionV2Action(String str, String str2, String str3, String str4, String str5, String str6, MissionV2Progress missionV2Progress, String str7, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, missionV2Progress, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? Boolean.FALSE : bool2);
    }
}
