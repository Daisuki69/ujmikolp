package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycAdditionalDocsUploadResponse implements Parcelable {
    public static final Parcelable.Creator<KycAdditionalDocsUploadResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("expiry")
    private final String expiry;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.FILE)
    private final KycFileContent file;

    public static final class Creator implements Parcelable.Creator<KycAdditionalDocsUploadResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycAdditionalDocsUploadResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycAdditionalDocsUploadResponse(KycFileContent.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycAdditionalDocsUploadResponse[] newArray(int i) {
            return new KycAdditionalDocsUploadResponse[i];
        }
    }

    public KycAdditionalDocsUploadResponse(KycFileContent file, String str) {
        j.g(file, "file");
        this.file = file;
        this.expiry = str;
    }

    public static /* synthetic */ KycAdditionalDocsUploadResponse copy$default(KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse, KycFileContent kycFileContent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            kycFileContent = kycAdditionalDocsUploadResponse.file;
        }
        if ((i & 2) != 0) {
            str = kycAdditionalDocsUploadResponse.expiry;
        }
        return kycAdditionalDocsUploadResponse.copy(kycFileContent, str);
    }

    public final KycFileContent component1() {
        return this.file;
    }

    public final String component2() {
        return this.expiry;
    }

    public final KycAdditionalDocsUploadResponse copy(KycFileContent file, String str) {
        j.g(file, "file");
        return new KycAdditionalDocsUploadResponse(file, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycAdditionalDocsUploadResponse)) {
            return false;
        }
        KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse = (KycAdditionalDocsUploadResponse) obj;
        return j.b(this.file, kycAdditionalDocsUploadResponse.file) && j.b(this.expiry, kycAdditionalDocsUploadResponse.expiry);
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final KycFileContent getFile() {
        return this.file;
    }

    public int hashCode() {
        int iHashCode = this.file.hashCode() * 31;
        String str = this.expiry;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "KycAdditionalDocsUploadResponse(file=" + this.file + ", expiry=" + this.expiry + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.file.writeToParcel(dest, i);
        dest.writeString(this.expiry);
    }

    public /* synthetic */ KycAdditionalDocsUploadResponse(KycFileContent kycFileContent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kycFileContent, (i & 2) != 0 ? null : str);
    }
}
