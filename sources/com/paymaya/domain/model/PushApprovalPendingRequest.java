package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PushApprovalPendingRequest implements Parcelable {
    public static final Parcelable.Creator<PushApprovalPendingRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("createdAt")
    private final String createdAt;

    @InterfaceC1497a
    @InterfaceC1498b("deviceId")
    private final String deviceId;

    @InterfaceC1497a
    @InterfaceC1498b("expiresAt")
    private final String expiresAt;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("location")
    private final String location;

    @InterfaceC1497a
    @InterfaceC1498b("rrn")
    private final String rrn;

    public static final class Creator implements Parcelable.Creator<PushApprovalPendingRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PushApprovalPendingRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PushApprovalPendingRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PushApprovalPendingRequest[] newArray(int i) {
            return new PushApprovalPendingRequest[i];
        }
    }

    public PushApprovalPendingRequest(String id, String rrn, String str, String str2, String createdAt, String expiresAt) {
        j.g(id, "id");
        j.g(rrn, "rrn");
        j.g(createdAt, "createdAt");
        j.g(expiresAt, "expiresAt");
        this.id = id;
        this.rrn = rrn;
        this.deviceId = str;
        this.location = str2;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
    }

    public static /* synthetic */ PushApprovalPendingRequest copy$default(PushApprovalPendingRequest pushApprovalPendingRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushApprovalPendingRequest.id;
        }
        if ((i & 2) != 0) {
            str2 = pushApprovalPendingRequest.rrn;
        }
        if ((i & 4) != 0) {
            str3 = pushApprovalPendingRequest.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = pushApprovalPendingRequest.location;
        }
        if ((i & 16) != 0) {
            str5 = pushApprovalPendingRequest.createdAt;
        }
        if ((i & 32) != 0) {
            str6 = pushApprovalPendingRequest.expiresAt;
        }
        String str7 = str5;
        String str8 = str6;
        return pushApprovalPendingRequest.copy(str, str2, str3, str4, str7, str8);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.rrn;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final String component4() {
        return this.location;
    }

    public final String component5() {
        return this.createdAt;
    }

    public final String component6() {
        return this.expiresAt;
    }

    public final PushApprovalPendingRequest copy(String id, String rrn, String str, String str2, String createdAt, String expiresAt) {
        j.g(id, "id");
        j.g(rrn, "rrn");
        j.g(createdAt, "createdAt");
        j.g(expiresAt, "expiresAt");
        return new PushApprovalPendingRequest(id, rrn, str, str2, createdAt, expiresAt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushApprovalPendingRequest)) {
            return false;
        }
        PushApprovalPendingRequest pushApprovalPendingRequest = (PushApprovalPendingRequest) obj;
        return j.b(this.id, pushApprovalPendingRequest.id) && j.b(this.rrn, pushApprovalPendingRequest.rrn) && j.b(this.deviceId, pushApprovalPendingRequest.deviceId) && j.b(this.location, pushApprovalPendingRequest.location) && j.b(this.createdAt, pushApprovalPendingRequest.createdAt) && j.b(this.expiresAt, pushApprovalPendingRequest.expiresAt);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getRrn() {
        return this.rrn;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(this.id.hashCode() * 31, 31, this.rrn);
        String str = this.deviceId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.location;
        return this.expiresAt.hashCode() + AbstractC1414e.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.createdAt);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.rrn;
        String str3 = this.deviceId;
        String str4 = this.location;
        String str5 = this.createdAt;
        String str6 = this.expiresAt;
        StringBuilder sbX = s.x("PushApprovalPendingRequest(id=", str, ", rrn=", str2, ", deviceId=");
        c.A(sbX, str3, ", location=", str4, ", createdAt=");
        return a.p(sbX, str5, ", expiresAt=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.rrn);
        dest.writeString(this.deviceId);
        dest.writeString(this.location);
        dest.writeString(this.createdAt);
        dest.writeString(this.expiresAt);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PushApprovalPendingRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        str3 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            str7 = str6;
            str8 = str5;
            str9 = null;
        } else {
            str7 = str6;
            str8 = str5;
            str9 = str4;
        }
        this(str, str2, str3, str9, str8, str7);
    }
}
