package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MFAChallengeInformationV2 implements Parcelable {
    public static final Parcelable.Creator<MFAChallengeInformationV2> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("challengeId")
    private final String challengeId;

    @InterfaceC1497a
    @InterfaceC1498b("expiresAt")
    private final String expiresAtDate;

    @InterfaceC1497a
    @InterfaceC1498b("expiresIn")
    private final String expiryInSeconds;

    @InterfaceC1497a
    @InterfaceC1498b("lightData")
    private final String lightData;

    @InterfaceC1497a
    @InterfaceC1498b("tencentToken")
    private final String tencentToken;

    @InterfaceC1497a
    @InterfaceC1498b("uploadUrl")
    private final String uploadUrl;

    public static final class Creator implements Parcelable.Creator<MFAChallengeInformationV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAChallengeInformationV2 createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MFAChallengeInformationV2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAChallengeInformationV2[] newArray(int i) {
            return new MFAChallengeInformationV2[i];
        }
    }

    public MFAChallengeInformationV2(String challengeId, String expiryInSeconds, String expiresAtDate, String str, String str2, String str3) {
        j.g(challengeId, "challengeId");
        j.g(expiryInSeconds, "expiryInSeconds");
        j.g(expiresAtDate, "expiresAtDate");
        this.challengeId = challengeId;
        this.expiryInSeconds = expiryInSeconds;
        this.expiresAtDate = expiresAtDate;
        this.lightData = str;
        this.uploadUrl = str2;
        this.tencentToken = str3;
    }

    public static /* synthetic */ MFAChallengeInformationV2 copy$default(MFAChallengeInformationV2 mFAChallengeInformationV2, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mFAChallengeInformationV2.challengeId;
        }
        if ((i & 2) != 0) {
            str2 = mFAChallengeInformationV2.expiryInSeconds;
        }
        if ((i & 4) != 0) {
            str3 = mFAChallengeInformationV2.expiresAtDate;
        }
        if ((i & 8) != 0) {
            str4 = mFAChallengeInformationV2.lightData;
        }
        if ((i & 16) != 0) {
            str5 = mFAChallengeInformationV2.uploadUrl;
        }
        if ((i & 32) != 0) {
            str6 = mFAChallengeInformationV2.tencentToken;
        }
        String str7 = str5;
        String str8 = str6;
        return mFAChallengeInformationV2.copy(str, str2, str3, str4, str7, str8);
    }

    public final String component1() {
        return this.challengeId;
    }

    public final String component2() {
        return this.expiryInSeconds;
    }

    public final String component3() {
        return this.expiresAtDate;
    }

    public final String component4() {
        return this.lightData;
    }

    public final String component5() {
        return this.uploadUrl;
    }

    public final String component6() {
        return this.tencentToken;
    }

    public final MFAChallengeInformationV2 copy(String challengeId, String expiryInSeconds, String expiresAtDate, String str, String str2, String str3) {
        j.g(challengeId, "challengeId");
        j.g(expiryInSeconds, "expiryInSeconds");
        j.g(expiresAtDate, "expiresAtDate");
        return new MFAChallengeInformationV2(challengeId, expiryInSeconds, expiresAtDate, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MFAChallengeInformationV2)) {
            return false;
        }
        MFAChallengeInformationV2 mFAChallengeInformationV2 = (MFAChallengeInformationV2) obj;
        return j.b(this.challengeId, mFAChallengeInformationV2.challengeId) && j.b(this.expiryInSeconds, mFAChallengeInformationV2.expiryInSeconds) && j.b(this.expiresAtDate, mFAChallengeInformationV2.expiresAtDate) && j.b(this.lightData, mFAChallengeInformationV2.lightData) && j.b(this.uploadUrl, mFAChallengeInformationV2.uploadUrl) && j.b(this.tencentToken, mFAChallengeInformationV2.tencentToken);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getExpiresAtDate() {
        return this.expiresAtDate;
    }

    public final String getExpiryInSeconds() {
        return this.expiryInSeconds;
    }

    public final String getLightData() {
        return this.lightData;
    }

    public final String getTencentToken() {
        return this.tencentToken;
    }

    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(this.challengeId.hashCode() * 31, 31, this.expiryInSeconds), 31, this.expiresAtDate);
        String str = this.lightData;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uploadUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tencentToken;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.challengeId;
        String str2 = this.expiryInSeconds;
        String str3 = this.expiresAtDate;
        String str4 = this.lightData;
        String str5 = this.uploadUrl;
        String str6 = this.tencentToken;
        StringBuilder sbX = s.x("MFAChallengeInformationV2(challengeId=", str, ", expiryInSeconds=", str2, ", expiresAtDate=");
        c.A(sbX, str3, ", lightData=", str4, ", uploadUrl=");
        return a.p(sbX, str5, ", tencentToken=", str6, ")");
    }

    public final MFAChallengeInformation transformToMfaChallengeInformation() {
        return new MFAChallengeInformation(this.challengeId, this.expiryInSeconds, this.expiresAtDate, this.lightData, this.uploadUrl, this.tencentToken);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.challengeId);
        dest.writeString(this.expiryInSeconds);
        dest.writeString(this.expiresAtDate);
        dest.writeString(this.lightData);
        dest.writeString(this.uploadUrl);
        dest.writeString(this.tencentToken);
    }

    public /* synthetic */ MFAChallengeInformationV2(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
