package com.paymaya.domain.model;

import We.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycImageQualityConfidence {
    public static final Companion Companion = new Companion(null);
    private final String qualityResult;
    private final float score;
    private final MayaEKYCSelectedDocument selectedDocument;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KycImageQualityConfidence qualityResultGoodQuality(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, float f) {
            return new KycImageQualityConfidence("GOOD_QUALITY", mayaEKYCSelectedDocument, f);
        }

        public final KycImageQualityConfidence qualityResultOthers(String qualityResult, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, float f) {
            j.g(qualityResult, "qualityResult");
            return new KycImageQualityConfidence(qualityResult, mayaEKYCSelectedDocument, f);
        }

        public final KycImageQualityConfidence qualityResultPaper(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, float f) {
            return new KycImageQualityConfidence("PAPER", mayaEKYCSelectedDocument, f);
        }

        private Companion() {
        }
    }

    public KycImageQualityConfidence(String qualityResult, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, float f) {
        j.g(qualityResult, "qualityResult");
        this.qualityResult = qualityResult;
        this.selectedDocument = mayaEKYCSelectedDocument;
        this.score = f;
    }

    public static /* synthetic */ KycImageQualityConfidence copy$default(KycImageQualityConfidence kycImageQualityConfidence, String str, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycImageQualityConfidence.qualityResult;
        }
        if ((i & 2) != 0) {
            mayaEKYCSelectedDocument = kycImageQualityConfidence.selectedDocument;
        }
        if ((i & 4) != 0) {
            f = kycImageQualityConfidence.score;
        }
        return kycImageQualityConfidence.copy(str, mayaEKYCSelectedDocument, f);
    }

    public final String component1() {
        return this.qualityResult;
    }

    public final MayaEKYCSelectedDocument component2() {
        return this.selectedDocument;
    }

    public final float component3() {
        return this.score;
    }

    public final KycImageQualityConfidence copy(String qualityResult, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, float f) {
        j.g(qualityResult, "qualityResult");
        return new KycImageQualityConfidence(qualityResult, mayaEKYCSelectedDocument, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycImageQualityConfidence)) {
            return false;
        }
        KycImageQualityConfidence kycImageQualityConfidence = (KycImageQualityConfidence) obj;
        return j.b(this.qualityResult, kycImageQualityConfidence.qualityResult) && j.b(this.selectedDocument, kycImageQualityConfidence.selectedDocument) && Float.compare(this.score, kycImageQualityConfidence.score) == 0;
    }

    public final String getQualityResult() {
        return this.qualityResult;
    }

    public final float getScore() {
        return this.score;
    }

    public final MayaEKYCSelectedDocument getSelectedDocument() {
        return this.selectedDocument;
    }

    public int hashCode() {
        int iHashCode = this.qualityResult.hashCode() * 31;
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = this.selectedDocument;
        return Float.floatToIntBits(this.score) + ((iHashCode + (mayaEKYCSelectedDocument == null ? 0 : mayaEKYCSelectedDocument.hashCode())) * 31);
    }

    public String toString() {
        String str = this.qualityResult;
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = this.selectedDocument;
        float f = this.score;
        StringBuilder sb2 = new StringBuilder("KycImageQualityConfidence(qualityResult=");
        sb2.append(str);
        sb2.append(", selectedDocument=");
        sb2.append(mayaEKYCSelectedDocument);
        sb2.append(", score=");
        return s.n(sb2, ")", f);
    }
}
