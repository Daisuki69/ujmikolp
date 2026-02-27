package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MFAChallengeVerificationResult implements Parcelable {
    public static final String STATUS_SUCCESS = "SUCCESS";

    @InterfaceC1497a
    @InterfaceC1498b("challenge_id")
    private final String challengeId;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MFAChallengeVerificationResult> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<MFAChallengeVerificationResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAChallengeVerificationResult createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MFAChallengeVerificationResult(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MFAChallengeVerificationResult[] newArray(int i) {
            return new MFAChallengeVerificationResult[i];
        }
    }

    public MFAChallengeVerificationResult(String challengeId, String status) {
        j.g(challengeId, "challengeId");
        j.g(status, "status");
        this.challengeId = challengeId;
        this.status = status;
    }

    public static /* synthetic */ MFAChallengeVerificationResult copy$default(MFAChallengeVerificationResult mFAChallengeVerificationResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mFAChallengeVerificationResult.challengeId;
        }
        if ((i & 2) != 0) {
            str2 = mFAChallengeVerificationResult.status;
        }
        return mFAChallengeVerificationResult.copy(str, str2);
    }

    public final String component1() {
        return this.challengeId;
    }

    public final String component2() {
        return this.status;
    }

    public final MFAChallengeVerificationResult copy(String challengeId, String status) {
        j.g(challengeId, "challengeId");
        j.g(status, "status");
        return new MFAChallengeVerificationResult(challengeId, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MFAChallengeVerificationResult)) {
            return false;
        }
        MFAChallengeVerificationResult mFAChallengeVerificationResult = (MFAChallengeVerificationResult) obj;
        return j.b(this.challengeId, mFAChallengeVerificationResult.challengeId) && j.b(this.status, mFAChallengeVerificationResult.status);
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
        return s.l("MFAChallengeVerificationResult(challengeId=", this.challengeId, ", status=", this.status, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.challengeId);
        dest.writeString(this.status);
    }
}
