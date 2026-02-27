package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MFAChallengeVerificationResultV2 implements Parcelable {
    public static final String STATUS_SUCCESS = "SUCCESS";

    @InterfaceC1497a
    @InterfaceC1498b("challengeId")
    private final String challengeId;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MFAChallengeVerificationResultV2> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<MFAChallengeVerificationResultV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAChallengeVerificationResultV2 createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MFAChallengeVerificationResultV2(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAChallengeVerificationResultV2[] newArray(int i) {
            return new MFAChallengeVerificationResultV2[i];
        }
    }

    public MFAChallengeVerificationResultV2(String challengeId, String status) {
        j.g(challengeId, "challengeId");
        j.g(status, "status");
        this.challengeId = challengeId;
        this.status = status;
    }

    public static /* synthetic */ MFAChallengeVerificationResultV2 copy$default(MFAChallengeVerificationResultV2 mFAChallengeVerificationResultV2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mFAChallengeVerificationResultV2.challengeId;
        }
        if ((i & 2) != 0) {
            str2 = mFAChallengeVerificationResultV2.status;
        }
        return mFAChallengeVerificationResultV2.copy(str, str2);
    }

    public final String component1() {
        return this.challengeId;
    }

    public final String component2() {
        return this.status;
    }

    public final MFAChallengeVerificationResultV2 copy(String challengeId, String status) {
        j.g(challengeId, "challengeId");
        j.g(status, "status");
        return new MFAChallengeVerificationResultV2(challengeId, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MFAChallengeVerificationResultV2)) {
            return false;
        }
        MFAChallengeVerificationResultV2 mFAChallengeVerificationResultV2 = (MFAChallengeVerificationResultV2) obj;
        return j.b(this.challengeId, mFAChallengeVerificationResultV2.challengeId) && j.b(this.status, mFAChallengeVerificationResultV2.status);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.challengeId.hashCode() * 31);
    }

    public String toString() {
        return s.l("MFAChallengeVerificationResultV2(challengeId=", this.challengeId, ", status=", this.status, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.challengeId);
        dest.writeString(this.status);
    }
}
