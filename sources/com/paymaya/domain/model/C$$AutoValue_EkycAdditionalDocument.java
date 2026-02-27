package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.domain.model.EkycAdditionalDocument;
import g3.InterfaceC1498b;
import java.io.File;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_EkycAdditionalDocument, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_EkycAdditionalDocument extends EkycAdditionalDocument {
    private final File mFile;
    private final String mImageUrl;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_EkycAdditionalDocument$Builder */
    public static class Builder extends EkycAdditionalDocument.Builder {
        private File mFile;
        private String mImageUrl;
        private String mType;

        public /* synthetic */ Builder(EkycAdditionalDocument ekycAdditionalDocument, int i) {
            this(ekycAdditionalDocument);
        }

        @Override // com.paymaya.domain.model.EkycAdditionalDocument.Builder
        public EkycAdditionalDocument build() {
            return new AutoValue_EkycAdditionalDocument(this.mType, this.mImageUrl, this.mFile);
        }

        @Override // com.paymaya.domain.model.EkycAdditionalDocument.Builder
        public EkycAdditionalDocument.Builder mFile(File file) {
            this.mFile = file;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycAdditionalDocument.Builder
        public EkycAdditionalDocument.Builder mImageUrl(String str) {
            this.mImageUrl = str;
            return this;
        }

        @Override // com.paymaya.domain.model.EkycAdditionalDocument.Builder
        public EkycAdditionalDocument.Builder mType(String str) {
            this.mType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(EkycAdditionalDocument ekycAdditionalDocument) {
            this.mType = ekycAdditionalDocument.mType();
            this.mImageUrl = ekycAdditionalDocument.mImageUrl();
            this.mFile = ekycAdditionalDocument.mFile();
        }
    }

    public C$$AutoValue_EkycAdditionalDocument(@Nullable String str, @Nullable String str2, @Nullable File file) {
        this.mType = str;
        this.mImageUrl = str2;
        this.mFile = file;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EkycAdditionalDocument) {
            EkycAdditionalDocument ekycAdditionalDocument = (EkycAdditionalDocument) obj;
            String str = this.mType;
            if (str != null ? str.equals(ekycAdditionalDocument.mType()) : ekycAdditionalDocument.mType() == null) {
                String str2 = this.mImageUrl;
                if (str2 != null ? str2.equals(ekycAdditionalDocument.mImageUrl()) : ekycAdditionalDocument.mImageUrl() == null) {
                    File file = this.mFile;
                    if (file != null ? file.equals(ekycAdditionalDocument.mFile()) : ekycAdditionalDocument.mFile() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mType;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mImageUrl;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        File file = this.mFile;
        return iHashCode2 ^ (file != null ? file.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.EkycAdditionalDocument
    @Nullable
    public File mFile() {
        return this.mFile;
    }

    @Override // com.paymaya.domain.model.EkycAdditionalDocument
    @Nullable
    @InterfaceC1498b(ImagesContract.URL)
    public String mImageUrl() {
        return this.mImageUrl;
    }

    @Override // com.paymaya.domain.model.EkycAdditionalDocument
    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.EkycAdditionalDocument
    public EkycAdditionalDocument.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "EkycAdditionalDocument{mType=" + this.mType + ", mImageUrl=" + this.mImageUrl + ", mFile=" + this.mFile + "}";
    }
}
