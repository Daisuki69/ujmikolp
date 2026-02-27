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
public final class MFAChallengeInformation implements Parcelable {
    public static final Parcelable.Creator<MFAChallengeInformation> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("challenge_id")
    private final String challengeId;

    @InterfaceC1497a
    @InterfaceC1498b("expires_at")
    private final String expiresAtDate;

    @InterfaceC1497a
    @InterfaceC1498b("expires_in")
    private final String expiryInSeconds;

    @InterfaceC1497a
    @InterfaceC1498b("light_data")
    private final String lightData;

    @InterfaceC1497a
    @InterfaceC1498b("tencent_token")
    private final String tencentToken;

    @InterfaceC1497a
    @InterfaceC1498b("upload_url")
    private final String uploadUrl;

    public static final class Creator implements Parcelable.Creator<MFAChallengeInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAChallengeInformation createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MFAChallengeInformation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAChallengeInformation[] newArray(int i) {
            return new MFAChallengeInformation[i];
        }
    }

    public MFAChallengeInformation(String challengeId, String expiryInSeconds, String expiresAtDate, String str, String str2, String str3) {
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

    public static /* synthetic */ MFAChallengeInformation copy$default(MFAChallengeInformation mFAChallengeInformation, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mFAChallengeInformation.challengeId;
        }
        if ((i & 2) != 0) {
            str2 = mFAChallengeInformation.expiryInSeconds;
        }
        if ((i & 4) != 0) {
            str3 = mFAChallengeInformation.expiresAtDate;
        }
        if ((i & 8) != 0) {
            str4 = mFAChallengeInformation.lightData;
        }
        if ((i & 16) != 0) {
            str5 = mFAChallengeInformation.uploadUrl;
        }
        if ((i & 32) != 0) {
            str6 = mFAChallengeInformation.tencentToken;
        }
        String str7 = str5;
        String str8 = str6;
        return mFAChallengeInformation.copy(str, str2, str3, str4, str7, str8);
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

    public final MFAChallengeInformation copy(String challengeId, String expiryInSeconds, String expiresAtDate, String str, String str2, String str3) {
        j.g(challengeId, "challengeId");
        j.g(expiryInSeconds, "expiryInSeconds");
        j.g(expiresAtDate, "expiresAtDate");
        return new MFAChallengeInformation(challengeId, expiryInSeconds, expiresAtDate, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MFAChallengeInformation)) {
            return false;
        }
        MFAChallengeInformation mFAChallengeInformation = (MFAChallengeInformation) obj;
        return j.b(this.challengeId, mFAChallengeInformation.challengeId) && j.b(this.expiryInSeconds, mFAChallengeInformation.expiryInSeconds) && j.b(this.expiresAtDate, mFAChallengeInformation.expiresAtDate) && j.b(this.lightData, mFAChallengeInformation.lightData) && j.b(this.uploadUrl, mFAChallengeInformation.uploadUrl) && j.b(this.tencentToken, mFAChallengeInformation.tencentToken);
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
        StringBuilder sbX = s.x("MFAChallengeInformation(challengeId=", str, ", expiryInSeconds=", str2, ", expiresAtDate=");
        c.A(sbX, str3, ", lightData=", str4, ", uploadUrl=");
        return a.p(sbX, str5, ", tencentToken=", str6, ")");
    }

    public final MFAChallengeInformationV2 transformToMfaChallengeInformationV2() {
        return new MFAChallengeInformationV2(this.challengeId, this.expiryInSeconds, this.expiresAtDate, this.lightData, this.uploadUrl, this.tencentToken);
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

    public /* synthetic */ MFAChallengeInformation(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
