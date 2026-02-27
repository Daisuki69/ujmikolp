package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import com.dynatrace.agent.events.enrichment.EventKeys;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MfaMeta implements Parcelable {
    public static final Parcelable.Creator<MfaMeta> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("challenge_id")
    private final String challengeId;

    @InterfaceC1497a
    @InterfaceC1498b(EventKeys.CLIENT)
    private final String client;

    @InterfaceC1497a
    @InterfaceC1498b("fallback_source_screen")
    private String fallbackSourceScreen;

    @InterfaceC1497a
    @InterfaceC1498b("has_min_changed")
    private boolean hasChangedMin;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.METHOD)
    private String method;

    @InterfaceC1497a
    @InterfaceC1498b("mobile_number")
    private String mobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b("params")
    private MfaParams params;

    @InterfaceC1497a
    @InterfaceC1498b("source_screen")
    private String sourceScreen;

    @InterfaceC1497a
    @InterfaceC1498b("success_screen")
    private String successScreen;

    @InterfaceC1497a
    @InterfaceC1498b("transaction_type")
    private String transactionType;

    public static final class Creator implements Parcelable.Creator<MfaMeta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaMeta createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MfaMeta(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MfaParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaMeta[] newArray(int i) {
            return new MfaMeta[i];
        }
    }

    public static final class MfaParams implements Parcelable {
        public static final Parcelable.Creator<MfaParams> CREATOR = new Creator();

        @InterfaceC1497a
        @InterfaceC1498b("device_data")
        private final String deviceData;

        @InterfaceC1497a
        @InterfaceC1498b("lifestyle_id")
        private String lifeStyleId;

        public static final class Creator implements Parcelable.Creator<MfaParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MfaParams createFromParcel(Parcel parcel) {
                j.g(parcel, "parcel");
                return new MfaParams(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MfaParams[] newArray(int i) {
                return new MfaParams[i];
            }
        }

        public MfaParams(String str, String str2) {
            this.lifeStyleId = str;
            this.deviceData = str2;
        }

        public static /* synthetic */ MfaParams copy$default(MfaParams mfaParams, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mfaParams.lifeStyleId;
            }
            if ((i & 2) != 0) {
                str2 = mfaParams.deviceData;
            }
            return mfaParams.copy(str, str2);
        }

        public final String component1() {
            return this.lifeStyleId;
        }

        public final String component2() {
            return this.deviceData;
        }

        public final MfaParams copy(String str, String str2) {
            return new MfaParams(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MfaParams)) {
                return false;
            }
            MfaParams mfaParams = (MfaParams) obj;
            return j.b(this.lifeStyleId, mfaParams.lifeStyleId) && j.b(this.deviceData, mfaParams.deviceData);
        }

        public final String getDeviceData() {
            return this.deviceData;
        }

        public final String getLifeStyleId() {
            return this.lifeStyleId;
        }

        public int hashCode() {
            String str = this.lifeStyleId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.deviceData;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setLifeStyleId(String str) {
            this.lifeStyleId = str;
        }

        public String toString() {
            return s.l("MfaParams(lifeStyleId=", this.lifeStyleId, ", deviceData=", this.deviceData, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            j.g(dest, "dest");
            dest.writeString(this.lifeStyleId);
            dest.writeString(this.deviceData);
        }
    }

    public MfaMeta(String challengeId, String str, String method, String transactionType, MfaParams mfaParams, String str2, String str3, String str4, String str5, boolean z4) {
        j.g(challengeId, "challengeId");
        j.g(method, "method");
        j.g(transactionType, "transactionType");
        this.challengeId = challengeId;
        this.client = str;
        this.method = method;
        this.transactionType = transactionType;
        this.params = mfaParams;
        this.mobileNumber = str2;
        this.sourceScreen = str3;
        this.successScreen = str4;
        this.fallbackSourceScreen = str5;
        this.hasChangedMin = z4;
    }

    public static /* synthetic */ MfaMeta copy$default(MfaMeta mfaMeta, String str, String str2, String str3, String str4, MfaParams mfaParams, String str5, String str6, String str7, String str8, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mfaMeta.challengeId;
        }
        if ((i & 2) != 0) {
            str2 = mfaMeta.client;
        }
        if ((i & 4) != 0) {
            str3 = mfaMeta.method;
        }
        if ((i & 8) != 0) {
            str4 = mfaMeta.transactionType;
        }
        if ((i & 16) != 0) {
            mfaParams = mfaMeta.params;
        }
        if ((i & 32) != 0) {
            str5 = mfaMeta.mobileNumber;
        }
        if ((i & 64) != 0) {
            str6 = mfaMeta.sourceScreen;
        }
        if ((i & 128) != 0) {
            str7 = mfaMeta.successScreen;
        }
        if ((i & 256) != 0) {
            str8 = mfaMeta.fallbackSourceScreen;
        }
        if ((i & 512) != 0) {
            z4 = mfaMeta.hasChangedMin;
        }
        String str9 = str8;
        boolean z5 = z4;
        String str10 = str6;
        String str11 = str7;
        MfaParams mfaParams2 = mfaParams;
        String str12 = str5;
        return mfaMeta.copy(str, str2, str3, str4, mfaParams2, str12, str10, str11, str9, z5);
    }

    public final String component1() {
        return this.challengeId;
    }

    public final boolean component10() {
        return this.hasChangedMin;
    }

    public final String component2() {
        return this.client;
    }

    public final String component3() {
        return this.method;
    }

    public final String component4() {
        return this.transactionType;
    }

    public final MfaParams component5() {
        return this.params;
    }

    public final String component6() {
        return this.mobileNumber;
    }

    public final String component7() {
        return this.sourceScreen;
    }

    public final String component8() {
        return this.successScreen;
    }

    public final String component9() {
        return this.fallbackSourceScreen;
    }

    public final MfaMeta copy(String challengeId, String str, String method, String transactionType, MfaParams mfaParams, String str2, String str3, String str4, String str5, boolean z4) {
        j.g(challengeId, "challengeId");
        j.g(method, "method");
        j.g(transactionType, "transactionType");
        return new MfaMeta(challengeId, str, method, transactionType, mfaParams, str2, str3, str4, str5, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MfaMeta)) {
            return false;
        }
        MfaMeta mfaMeta = (MfaMeta) obj;
        return j.b(this.challengeId, mfaMeta.challengeId) && j.b(this.client, mfaMeta.client) && j.b(this.method, mfaMeta.method) && j.b(this.transactionType, mfaMeta.transactionType) && j.b(this.params, mfaMeta.params) && j.b(this.mobileNumber, mfaMeta.mobileNumber) && j.b(this.sourceScreen, mfaMeta.sourceScreen) && j.b(this.successScreen, mfaMeta.successScreen) && j.b(this.fallbackSourceScreen, mfaMeta.fallbackSourceScreen) && this.hasChangedMin == mfaMeta.hasChangedMin;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getClient() {
        return this.client;
    }

    public final String getFallbackSourceScreen() {
        return this.fallbackSourceScreen;
    }

    public final boolean getHasChangedMin() {
        return this.hasChangedMin;
    }

    public final String getLifeStyleId() {
        MfaParams mfaParams = this.params;
        if (mfaParams != null) {
            return mfaParams.getLifeStyleId();
        }
        return null;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final MfaParams getParams() {
        return this.params;
    }

    public final String getSourceScreen() {
        return this.sourceScreen;
    }

    public final String getSuccessScreen() {
        return this.successScreen;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        int iHashCode = this.challengeId.hashCode() * 31;
        String str = this.client;
        int iC = AbstractC1414e.c(AbstractC1414e.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.method), 31, this.transactionType);
        MfaParams mfaParams = this.params;
        int iHashCode2 = (iC + (mfaParams == null ? 0 : mfaParams.hashCode())) * 31;
        String str2 = this.mobileNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceScreen;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.successScreen;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fallbackSourceScreen;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.hasChangedMin ? 1231 : 1237);
    }

    public final void setFallbackSourceScreen(String str) {
        this.fallbackSourceScreen = str;
    }

    public final void setHasChangedMin(boolean z4) {
        this.hasChangedMin = z4;
    }

    public final void setMethod(String str) {
        j.g(str, "<set-?>");
        this.method = str;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final void setParams(MfaParams mfaParams) {
        this.params = mfaParams;
    }

    public final void setSourceScreen(String str) {
        this.sourceScreen = str;
    }

    public final void setSuccessScreen(String str) {
        this.successScreen = str;
    }

    public final void setTransactionType(String str) {
        j.g(str, "<set-?>");
        this.transactionType = str;
    }

    public String toString() {
        String str = this.challengeId;
        String str2 = this.client;
        String str3 = this.method;
        String str4 = this.transactionType;
        MfaParams mfaParams = this.params;
        String str5 = this.mobileNumber;
        String str6 = this.sourceScreen;
        String str7 = this.successScreen;
        String str8 = this.fallbackSourceScreen;
        boolean z4 = this.hasChangedMin;
        StringBuilder sbX = s.x("MfaMeta(challengeId=", str, ", client=", str2, ", method=");
        c.A(sbX, str3, ", transactionType=", str4, ", params=");
        sbX.append(mfaParams);
        sbX.append(", mobileNumber=");
        sbX.append(str5);
        sbX.append(", sourceScreen=");
        c.A(sbX, str6, ", successScreen=", str7, ", fallbackSourceScreen=");
        sbX.append(str8);
        sbX.append(", hasChangedMin=");
        sbX.append(z4);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.challengeId);
        dest.writeString(this.client);
        dest.writeString(this.method);
        dest.writeString(this.transactionType);
        MfaParams mfaParams = this.params;
        if (mfaParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mfaParams.writeToParcel(dest, i);
        }
        dest.writeString(this.mobileNumber);
        dest.writeString(this.sourceScreen);
        dest.writeString(this.successScreen);
        dest.writeString(this.fallbackSourceScreen);
        dest.writeInt(this.hasChangedMin ? 1 : 0);
    }

    public /* synthetic */ MfaMeta(String str, String str2, String str3, String str4, MfaParams mfaParams, String str5, String str6, String str7, String str8, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : mfaParams, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? false : z4);
    }
}
