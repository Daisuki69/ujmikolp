package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycMinorPhotos implements Parcelable {
    public static final Parcelable.Creator<KycMinorPhotos> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("birthCertificateUrl")
    private final String birthCertificateUrl;

    @InterfaceC1497a
    @InterfaceC1498b("consentFormUrl")
    private final String consentFormUrl;

    @InterfaceC1497a
    @InterfaceC1498b("parentIdUrl")
    private final String parentIdUrl;

    public static final class Creator implements Parcelable.Creator<KycMinorPhotos> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycMinorPhotos createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycMinorPhotos(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycMinorPhotos[] newArray(int i) {
            return new KycMinorPhotos[i];
        }
    }

    public KycMinorPhotos(String birthCertificateUrl, String parentIdUrl, String consentFormUrl) {
        j.g(birthCertificateUrl, "birthCertificateUrl");
        j.g(parentIdUrl, "parentIdUrl");
        j.g(consentFormUrl, "consentFormUrl");
        this.birthCertificateUrl = birthCertificateUrl;
        this.parentIdUrl = parentIdUrl;
        this.consentFormUrl = consentFormUrl;
    }

    public static /* synthetic */ KycMinorPhotos copy$default(KycMinorPhotos kycMinorPhotos, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycMinorPhotos.birthCertificateUrl;
        }
        if ((i & 2) != 0) {
            str2 = kycMinorPhotos.parentIdUrl;
        }
        if ((i & 4) != 0) {
            str3 = kycMinorPhotos.consentFormUrl;
        }
        return kycMinorPhotos.copy(str, str2, str3);
    }

    public final String component1() {
        return this.birthCertificateUrl;
    }

    public final String component2() {
        return this.parentIdUrl;
    }

    public final String component3() {
        return this.consentFormUrl;
    }

    public final KycMinorPhotos copy(String birthCertificateUrl, String parentIdUrl, String consentFormUrl) {
        j.g(birthCertificateUrl, "birthCertificateUrl");
        j.g(parentIdUrl, "parentIdUrl");
        j.g(consentFormUrl, "consentFormUrl");
        return new KycMinorPhotos(birthCertificateUrl, parentIdUrl, consentFormUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycMinorPhotos)) {
            return false;
        }
        KycMinorPhotos kycMinorPhotos = (KycMinorPhotos) obj;
        return j.b(this.birthCertificateUrl, kycMinorPhotos.birthCertificateUrl) && j.b(this.parentIdUrl, kycMinorPhotos.parentIdUrl) && j.b(this.consentFormUrl, kycMinorPhotos.consentFormUrl);
    }

    public final String getBirthCertificateUrl() {
        return this.birthCertificateUrl;
    }

    public final String getConsentFormUrl() {
        return this.consentFormUrl;
    }

    public final String getParentIdUrl() {
        return this.parentIdUrl;
    }

    public int hashCode() {
        return this.consentFormUrl.hashCode() + AbstractC1414e.c(this.birthCertificateUrl.hashCode() * 31, 31, this.parentIdUrl);
    }

    public String toString() {
        String str = this.birthCertificateUrl;
        String str2 = this.parentIdUrl;
        return s.p(s.x("KycMinorPhotos(birthCertificateUrl=", str, ", parentIdUrl=", str2, ", consentFormUrl="), this.consentFormUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.birthCertificateUrl);
        dest.writeString(this.parentIdUrl);
        dest.writeString(this.consentFormUrl);
    }
}
