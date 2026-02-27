package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ForgotPasswordValidateIdentityRequest implements Parcelable {
    public static final Parcelable.Creator<ForgotPasswordValidateIdentityRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final String value;

    public static final class Creator implements Parcelable.Creator<ForgotPasswordValidateIdentityRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ForgotPasswordValidateIdentityRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ForgotPasswordValidateIdentityRequest(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ForgotPasswordValidateIdentityRequest[] newArray(int i) {
            return new ForgotPasswordValidateIdentityRequest[i];
        }
    }

    public ForgotPasswordValidateIdentityRequest(String type, String value) {
        j.g(type, "type");
        j.g(value, "value");
        this.type = type;
        this.value = value;
    }

    public static /* synthetic */ ForgotPasswordValidateIdentityRequest copy$default(ForgotPasswordValidateIdentityRequest forgotPasswordValidateIdentityRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forgotPasswordValidateIdentityRequest.type;
        }
        if ((i & 2) != 0) {
            str2 = forgotPasswordValidateIdentityRequest.value;
        }
        return forgotPasswordValidateIdentityRequest.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final ForgotPasswordValidateIdentityRequest copy(String type, String value) {
        j.g(type, "type");
        j.g(value, "value");
        return new ForgotPasswordValidateIdentityRequest(type, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForgotPasswordValidateIdentityRequest)) {
            return false;
        }
        ForgotPasswordValidateIdentityRequest forgotPasswordValidateIdentityRequest = (ForgotPasswordValidateIdentityRequest) obj;
        return j.b(this.type, forgotPasswordValidateIdentityRequest.type) && j.b(this.value, forgotPasswordValidateIdentityRequest.value);
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return s.l("ForgotPasswordValidateIdentityRequest(type=", this.type, ", value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.value);
    }
}
