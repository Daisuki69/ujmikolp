package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.EkycIdentification;
import g3.InterfaceC1498b;
import java.io.File;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_EkycIdentification, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_EkycIdentification extends EkycIdentification {
    private final File mBackSideImageFile;
    private final String mBackSideImageUrl;
    private final String mExpirationDate;
    private final String mIdName;
    private final String mIdNumber;
    private final String mIdType;
    private final File mImageFile;
    private final String mImageUrl;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_EkycIdentification$Builder */
    public static class Builder extends EkycIdentification.Builder {
        private File mBackSideImageFile;
        private String mBackSideImageUrl;
        private String mExpirationDate;
        private String mIdName;
        private String mIdNumber;
        private String mIdType;
        private File mImageFile;
        private String mImageUrl;

        public /* synthetic */ Builder(EkycIdentification ekycIdentification, int i) {
            this(ekycIdentification);
        }

        @Override // com.paymaya.domain.model.EkycIdentification.Builder
        public EkycIdentification build() {
            return new AutoValue_EkycIdentification(this.mIdType, this.mIdName, this.mIdNumber, this.mExpirationDate, this.mImageUrl, this.mBackSideImageUrl, this.mImageFile, this.mBackSideImageFile);
        }

        @Override // com.paymaya.domain.model.EkycIdentification.Builder
        public EkycIdentification.Builder mBackSideImageFile(File file) {
            this.mBackSideImageFile = file;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycIdentification.Builder
        public EkycIdentification.Builder mBackSideImageUrl(String str) {
            this.mBackSideImageUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycIdentification.Builder
        public EkycIdentification.Builder mExpirationDate(String str) {
            this.mExpirationDate = str;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycIdentification.Builder
        public EkycIdentification.Builder mIdName(String str) {
            this.mIdName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycIdentification.Builder
        public EkycIdentification.Builder mIdNumber(String str) {
            this.mIdNumber = str;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycIdentification.Builder
        public EkycIdentification.Builder mIdType(String str) {
            this.mIdType = str;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycIdentification.Builder
        public EkycIdentification.Builder mImageFile(File file) {
            this.mImageFile = file;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycIdentification.Builder
        public EkycIdentification.Builder mImageUrl(String str) {
            this.mImageUrl = str;
            return this;
        }

        public Builder() {
        }

        private Builder(EkycIdentification ekycIdentification) {
            this.mIdType = ekycIdentification.mIdType();
            this.mIdName = ekycIdentification.mIdName();
            this.mIdNumber = ekycIdentification.mIdNumber();
            this.mExpirationDate = ekycIdentification.mExpirationDate();
            this.mImageUrl = ekycIdentification.mImageUrl();
            this.mBackSideImageUrl = ekycIdentification.mBackSideImageUrl();
            this.mImageFile = ekycIdentification.mImageFile();
            this.mBackSideImageFile = ekycIdentification.mBackSideImageFile();
        }
    }

    public C$$AutoValue_EkycIdentification(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable File file, @Nullable File file2) {
        this.mIdType = str;
        this.mIdName = str2;
        this.mIdNumber = str3;
        this.mExpirationDate = str4;
        this.mImageUrl = str5;
        this.mBackSideImageUrl = str6;
        this.mImageFile = file;
        this.mBackSideImageFile = file2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EkycIdentification) {
            EkycIdentification ekycIdentification = (EkycIdentification) obj;
            String str = this.mIdType;
            if (str != null ? str.equals(ekycIdentification.mIdType()) : ekycIdentification.mIdType() == null) {
                String str2 = this.mIdName;
                if (str2 != null ? str2.equals(ekycIdentification.mIdName()) : ekycIdentification.mIdName() == null) {
                    String str3 = this.mIdNumber;
                    if (str3 != null ? str3.equals(ekycIdentification.mIdNumber()) : ekycIdentification.mIdNumber() == null) {
                        String str4 = this.mExpirationDate;
                        if (str4 != null ? str4.equals(ekycIdentification.mExpirationDate()) : ekycIdentification.mExpirationDate() == null) {
                            String str5 = this.mImageUrl;
                            if (str5 != null ? str5.equals(ekycIdentification.mImageUrl()) : ekycIdentification.mImageUrl() == null) {
                                String str6 = this.mBackSideImageUrl;
                                if (str6 != null ? str6.equals(ekycIdentification.mBackSideImageUrl()) : ekycIdentification.mBackSideImageUrl() == null) {
                                    File file = this.mImageFile;
                                    if (file != null ? file.equals(ekycIdentification.mImageFile()) : ekycIdentification.mImageFile() == null) {
                                        File file2 = this.mBackSideImageFile;
                                        if (file2 != null ? file2.equals(ekycIdentification.mBackSideImageFile()) : ekycIdentification.mBackSideImageFile() == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mIdType;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mIdName;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mIdNumber;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mExpirationDate;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mImageUrl;
        int iHashCode5 = (iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.mBackSideImageUrl;
        int iHashCode6 = (iHashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        File file = this.mImageFile;
        int iHashCode7 = (iHashCode6 ^ (file == null ? 0 : file.hashCode())) * 1000003;
        File file2 = this.mBackSideImageFile;
        return iHashCode7 ^ (file2 != null ? file2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.EkycIdentification
    @Nullable
    public File mBackSideImageFile() {
        return this.mBackSideImageFile;
    }

    @Override // com.paymaya.domain.model.EkycIdentification
    @Nullable
    @InterfaceC1498b("backside_url")
    public String mBackSideImageUrl() {
        return this.mBackSideImageUrl;
    }

    @Override // com.paymaya.domain.model.EkycIdentification
    @Nullable
    @InterfaceC1498b("expiry")
    public String mExpirationDate() {
        return this.mExpirationDate;
    }

    @Override // com.paymaya.domain.model.EkycIdentification
    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mIdName() {
        return this.mIdName;
    }

    @Override // com.paymaya.domain.model.EkycIdentification
    @Nullable
    @InterfaceC1498b("number")
    public String mIdNumber() {
        return this.mIdNumber;
    }

    @Override // com.paymaya.domain.model.EkycIdentification
    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mIdType() {
        return this.mIdType;
    }

    @Override // com.paymaya.domain.model.EkycIdentification
    @Nullable
    public File mImageFile() {
        return this.mImageFile;
    }

    @Override // com.paymaya.domain.model.EkycIdentification
    @Nullable
    @InterfaceC1498b(ImagesContract.URL)
    public String mImageUrl() {
        return this.mImageUrl;
    }

    @Override // com.paymaya.domain.model.EkycIdentification
    public EkycIdentification.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "EkycIdentification{mIdType=" + this.mIdType + ", mIdName=" + this.mIdName + ", mIdNumber=" + this.mIdNumber + ", mExpirationDate=" + this.mExpirationDate + ", mImageUrl=" + this.mImageUrl + ", mBackSideImageUrl=" + this.mBackSideImageUrl + ", mImageFile=" + this.mImageFile + ", mBackSideImageFile=" + this.mBackSideImageFile + "}";
    }
}
