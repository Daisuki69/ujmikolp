package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreateChallengeRequest implements Parcelable {
    public static final Parcelable.Creator<CreateChallengeRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("nominatedMethod")
    private final String method;

    @InterfaceC1497a
    @InterfaceC1498b("purpose")
    private final String transactionType;

    public static final class Creator implements Parcelable.Creator<CreateChallengeRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateChallengeRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreateChallengeRequest(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateChallengeRequest[] newArray(int i) {
            return new CreateChallengeRequest[i];
        }
    }

    public CreateChallengeRequest(String transactionType, String method) {
        j.g(transactionType, "transactionType");
        j.g(method, "method");
        this.transactionType = transactionType;
        this.method = method;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.transactionType);
        dest.writeString(this.method);
    }
}
