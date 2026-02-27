package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycAdditionalDocsUploadRequest implements Parcelable {
    public static final Parcelable.Creator<KycAdditionalDocsUploadRequest> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("base64")
    private final String base64;

    @InterfaceC1497a
    @InterfaceC1498b("expiry")
    private final String expiry;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final AdditionalDocType type;

    public static final class Creator implements Parcelable.Creator<KycAdditionalDocsUploadRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycAdditionalDocsUploadRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycAdditionalDocsUploadRequest(AdditionalDocType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycAdditionalDocsUploadRequest[] newArray(int i) {
            return new KycAdditionalDocsUploadRequest[i];
        }
    }

    public KycAdditionalDocsUploadRequest(AdditionalDocType type, String base64, String str) {
        j.g(type, "type");
        j.g(base64, "base64");
        this.type = type;
        this.base64 = base64;
        this.expiry = str;
    }

    public static /* synthetic */ KycAdditionalDocsUploadRequest copy$default(KycAdditionalDocsUploadRequest kycAdditionalDocsUploadRequest, AdditionalDocType additionalDocType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            additionalDocType = kycAdditionalDocsUploadRequest.type;
        }
        if ((i & 2) != 0) {
            str = kycAdditionalDocsUploadRequest.base64;
        }
        if ((i & 4) != 0) {
            str2 = kycAdditionalDocsUploadRequest.expiry;
        }
        return kycAdditionalDocsUploadRequest.copy(additionalDocType, str, str2);
    }

    public final AdditionalDocType component1() {
        return this.type;
    }

    public final String component2() {
        return this.base64;
    }

    public final String component3() {
        return this.expiry;
    }

    public final KycAdditionalDocsUploadRequest copy(AdditionalDocType type, String base64, String str) {
        j.g(type, "type");
        j.g(base64, "base64");
        return new KycAdditionalDocsUploadRequest(type, base64, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycAdditionalDocsUploadRequest)) {
            return false;
        }
        KycAdditionalDocsUploadRequest kycAdditionalDocsUploadRequest = (KycAdditionalDocsUploadRequest) obj;
        return this.type == kycAdditionalDocsUploadRequest.type && j.b(this.base64, kycAdditionalDocsUploadRequest.base64) && j.b(this.expiry, kycAdditionalDocsUploadRequest.expiry);
    }

    public final String getBase64() {
        return this.base64;
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final AdditionalDocType getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(this.type.hashCode() * 31, 31, this.base64);
        String str = this.expiry;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        AdditionalDocType additionalDocType = this.type;
        String str = this.base64;
        String str2 = this.expiry;
        StringBuilder sb2 = new StringBuilder("KycAdditionalDocsUploadRequest(type=");
        sb2.append(additionalDocType);
        sb2.append(", base64=");
        sb2.append(str);
        sb2.append(", expiry=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.type.writeToParcel(dest, i);
        dest.writeString(this.base64);
        dest.writeString(this.expiry);
    }

    public /* synthetic */ KycAdditionalDocsUploadRequest(AdditionalDocType additionalDocType, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(additionalDocType, str, (i & 4) != 0 ? "" : str2);
    }
}
