package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreateChallengeResponse implements Parcelable {
    public static final Parcelable.Creator<CreateChallengeResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("challengeId")
    private final String challengeId;

    public static final class Creator implements Parcelable.Creator<CreateChallengeResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateChallengeResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreateChallengeResponse(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateChallengeResponse[] newArray(int i) {
            return new CreateChallengeResponse[i];
        }
    }

    public CreateChallengeResponse(String challengeId) {
        j.g(challengeId, "challengeId");
        this.challengeId = challengeId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.challengeId);
    }
}
