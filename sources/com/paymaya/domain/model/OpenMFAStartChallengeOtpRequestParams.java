package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenMFAStartChallengeOtpRequestParams implements Parcelable {
    public static final Parcelable.Creator<OpenMFAStartChallengeOtpRequestParams> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("device")
    private final String device;

    @InterfaceC1497a
    @InterfaceC1498b("sender")
    private final String sender;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final String value;

    public static final class Creator implements Parcelable.Creator<OpenMFAStartChallengeOtpRequestParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMFAStartChallengeOtpRequestParams createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new OpenMFAStartChallengeOtpRequestParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMFAStartChallengeOtpRequestParams[] newArray(int i) {
            return new OpenMFAStartChallengeOtpRequestParams[i];
        }
    }

    public OpenMFAStartChallengeOtpRequestParams(String type, String value, String device, String sender) {
        j.g(type, "type");
        j.g(value, "value");
        j.g(device, "device");
        j.g(sender, "sender");
        this.type = type;
        this.value = value;
        this.device = device;
        this.sender = sender;
    }

    public static /* synthetic */ OpenMFAStartChallengeOtpRequestParams copy$default(OpenMFAStartChallengeOtpRequestParams openMFAStartChallengeOtpRequestParams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openMFAStartChallengeOtpRequestParams.type;
        }
        if ((i & 2) != 0) {
            str2 = openMFAStartChallengeOtpRequestParams.value;
        }
        if ((i & 4) != 0) {
            str3 = openMFAStartChallengeOtpRequestParams.device;
        }
        if ((i & 8) != 0) {
            str4 = openMFAStartChallengeOtpRequestParams.sender;
        }
        return openMFAStartChallengeOtpRequestParams.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.device;
    }

    public final String component4() {
        return this.sender;
    }

    public final OpenMFAStartChallengeOtpRequestParams copy(String type, String value, String device, String sender) {
        j.g(type, "type");
        j.g(value, "value");
        j.g(device, "device");
        j.g(sender, "sender");
        return new OpenMFAStartChallengeOtpRequestParams(type, value, device, sender);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMFAStartChallengeOtpRequestParams)) {
            return false;
        }
        OpenMFAStartChallengeOtpRequestParams openMFAStartChallengeOtpRequestParams = (OpenMFAStartChallengeOtpRequestParams) obj;
        return j.b(this.type, openMFAStartChallengeOtpRequestParams.type) && j.b(this.value, openMFAStartChallengeOtpRequestParams.value) && j.b(this.device, openMFAStartChallengeOtpRequestParams.device) && j.b(this.sender, openMFAStartChallengeOtpRequestParams.sender);
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.sender.hashCode() + AbstractC1414e.c(AbstractC1414e.c(this.type.hashCode() * 31, 31, this.value), 31, this.device);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.value;
        return a.p(s.x("OpenMFAStartChallengeOtpRequestParams(type=", str, ", value=", str2, ", device="), this.device, ", sender=", this.sender, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.value);
        dest.writeString(this.device);
        dest.writeString(this.sender);
    }
}
