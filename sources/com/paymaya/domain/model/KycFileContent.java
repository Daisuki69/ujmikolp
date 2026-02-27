package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycFileContent implements Parcelable {
    public static final Parcelable.Creator<KycFileContent> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("base64")
    private final String base64;

    @InterfaceC1497a
    @InterfaceC1498b("privateUrl")
    private final String privateUrl;

    @InterfaceC1497a
    @InterfaceC1498b("s3Url")
    private final String s3Url;

    public static final class Creator implements Parcelable.Creator<KycFileContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycFileContent createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycFileContent(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycFileContent[] newArray(int i) {
            return new KycFileContent[i];
        }
    }

    public KycFileContent() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycFileContent copy$default(KycFileContent kycFileContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycFileContent.base64;
        }
        if ((i & 2) != 0) {
            str2 = kycFileContent.privateUrl;
        }
        if ((i & 4) != 0) {
            str3 = kycFileContent.s3Url;
        }
        return kycFileContent.copy(str, str2, str3);
    }

    public final String component1() {
        return this.base64;
    }

    public final String component2() {
        return this.privateUrl;
    }

    public final String component3() {
        return this.s3Url;
    }

    public final KycFileContent copy(String str, String str2, String str3) {
        return new KycFileContent(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycFileContent)) {
            return false;
        }
        KycFileContent kycFileContent = (KycFileContent) obj;
        return j.b(this.base64, kycFileContent.base64) && j.b(this.privateUrl, kycFileContent.privateUrl) && j.b(this.s3Url, kycFileContent.s3Url);
    }

    public final String getBase64() {
        return this.base64;
    }

    public final String getPrivateUrl() {
        return this.privateUrl;
    }

    public final String getS3Url() {
        return this.s3Url;
    }

    public int hashCode() {
        String str = this.base64;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.privateUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.s3Url;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.base64;
        String str2 = this.privateUrl;
        return s.p(s.x("KycFileContent(base64=", str, ", privateUrl=", str2, ", s3Url="), this.s3Url, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.base64);
        dest.writeString(this.privateUrl);
        dest.writeString(this.s3Url);
    }

    public KycFileContent(String str, String str2, String str3) {
        this.base64 = str;
        this.privateUrl = str2;
        this.s3Url = str3;
    }

    public /* synthetic */ KycFileContent(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
