package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ForgotPasswordSubmitPasswordRequest implements Parcelable {
    public static final Parcelable.Creator<ForgotPasswordSubmitPasswordRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("challengeId")
    private final String challengeId;

    @InterfaceC1497a
    @InterfaceC1498b("nominatedPassword")
    private final String newPassword;

    public static final class Creator implements Parcelable.Creator<ForgotPasswordSubmitPasswordRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ForgotPasswordSubmitPasswordRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ForgotPasswordSubmitPasswordRequest(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ForgotPasswordSubmitPasswordRequest[] newArray(int i) {
            return new ForgotPasswordSubmitPasswordRequest[i];
        }
    }

    public ForgotPasswordSubmitPasswordRequest(String newPassword, String challengeId) {
        j.g(newPassword, "newPassword");
        j.g(challengeId, "challengeId");
        this.newPassword = newPassword;
        this.challengeId = challengeId;
    }

    public static /* synthetic */ ForgotPasswordSubmitPasswordRequest copy$default(ForgotPasswordSubmitPasswordRequest forgotPasswordSubmitPasswordRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forgotPasswordSubmitPasswordRequest.newPassword;
        }
        if ((i & 2) != 0) {
            str2 = forgotPasswordSubmitPasswordRequest.challengeId;
        }
        return forgotPasswordSubmitPasswordRequest.copy(str, str2);
    }

    public final String component1() {
        return this.newPassword;
    }

    public final String component2() {
        return this.challengeId;
    }

    public final ForgotPasswordSubmitPasswordRequest copy(String newPassword, String challengeId) {
        j.g(newPassword, "newPassword");
        j.g(challengeId, "challengeId");
        return new ForgotPasswordSubmitPasswordRequest(newPassword, challengeId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForgotPasswordSubmitPasswordRequest)) {
            return false;
        }
        ForgotPasswordSubmitPasswordRequest forgotPasswordSubmitPasswordRequest = (ForgotPasswordSubmitPasswordRequest) obj;
        return j.b(this.newPassword, forgotPasswordSubmitPasswordRequest.newPassword) && j.b(this.challengeId, forgotPasswordSubmitPasswordRequest.challengeId);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public int hashCode() {
        return this.challengeId.hashCode() + (this.newPassword.hashCode() * 31);
    }

    public String toString() {
        return s.l("ForgotPasswordSubmitPasswordRequest(newPassword=", this.newPassword, ", challengeId=", this.challengeId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.newPassword);
        dest.writeString(this.challengeId);
    }
}
