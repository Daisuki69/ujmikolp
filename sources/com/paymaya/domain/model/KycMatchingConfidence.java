package com.paymaya.domain.model;

import androidx.camera.core.impl.a;
import com.paymaya.common.utility.G;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycMatchingConfidence {
    public static final Companion Companion = new Companion(null);
    private final String detectedDocumentKey;
    private final G matchingConfidenceLevel;
    private final float score;
    private final String selectedDocumentKey;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ KycMatchingConfidence notMatch$default(Companion companion, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, String str, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            return companion.notMatch(mayaEKYCSelectedDocument, str, f);
        }

        public static /* synthetic */ KycMatchingConfidence unpublished$default(Companion companion, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, String str, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            return companion.unpublished(mayaEKYCSelectedDocument, str, f);
        }

        public final KycMatchingConfidence guideMismatch(String frontIdResult, String backIdResult) {
            j.g(frontIdResult, "frontIdResult");
            j.g(backIdResult, "backIdResult");
            return new KycMatchingConfidence(G.f10415b, 0.0f, backIdResult, frontIdResult);
        }

        public final KycMatchingConfidence high(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, String detectedDocumentKey, float f) {
            String key;
            j.g(detectedDocumentKey, "detectedDocumentKey");
            G g8 = G.f10417g;
            if (mayaEKYCSelectedDocument == null || (key = mayaEKYCSelectedDocument.getKey()) == null) {
                key = "";
            }
            return new KycMatchingConfidence(g8, f, detectedDocumentKey, key);
        }

        public final KycMatchingConfidence highAutoDetected(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, String detectedDocumentKey, float f) {
            String key;
            j.g(detectedDocumentKey, "detectedDocumentKey");
            G g8 = G.f;
            if (mayaEKYCSelectedDocument == null || (key = mayaEKYCSelectedDocument.getKey()) == null) {
                key = "";
            }
            return new KycMatchingConfidence(g8, f, detectedDocumentKey, key);
        }

        public final KycMatchingConfidence notMatch(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, String detectedDocumentKey, float f) {
            String key;
            j.g(detectedDocumentKey, "detectedDocumentKey");
            G g8 = G.f10414a;
            if (mayaEKYCSelectedDocument == null || (key = mayaEKYCSelectedDocument.getKey()) == null) {
                key = "";
            }
            return new KycMatchingConfidence(g8, f, detectedDocumentKey, key);
        }

        public final KycMatchingConfidence philsysCaptureMismatch(String frontIdResult) {
            j.g(frontIdResult, "frontIdResult");
            return new KycMatchingConfidence(G.c, 0.0f, frontIdResult, frontIdResult);
        }

        public final KycMatchingConfidence philsysUploadMismatch(String frontIdResult) {
            j.g(frontIdResult, "frontIdResult");
            return new KycMatchingConfidence(G.f10416d, 0.0f, frontIdResult, frontIdResult);
        }

        public final KycMatchingConfidence unpublished(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, String detectedDocumentKey, float f) {
            String key;
            j.g(detectedDocumentKey, "detectedDocumentKey");
            G g8 = G.e;
            if (mayaEKYCSelectedDocument == null || (key = mayaEKYCSelectedDocument.getKey()) == null) {
                key = "";
            }
            return new KycMatchingConfidence(g8, f, detectedDocumentKey, key);
        }

        public final KycMatchingConfidence zeroPassingThreshold(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
            String key;
            G g8 = G.f10417g;
            if (mayaEKYCSelectedDocument == null || (key = mayaEKYCSelectedDocument.getKey()) == null) {
                key = "";
            }
            return new KycMatchingConfidence(g8, 0.0f, "", key);
        }

        private Companion() {
        }
    }

    public KycMatchingConfidence(G matchingConfidenceLevel, float f, String detectedDocumentKey, String selectedDocumentKey) {
        j.g(matchingConfidenceLevel, "matchingConfidenceLevel");
        j.g(detectedDocumentKey, "detectedDocumentKey");
        j.g(selectedDocumentKey, "selectedDocumentKey");
        this.matchingConfidenceLevel = matchingConfidenceLevel;
        this.score = f;
        this.detectedDocumentKey = detectedDocumentKey;
        this.selectedDocumentKey = selectedDocumentKey;
    }

    public static /* synthetic */ KycMatchingConfidence copy$default(KycMatchingConfidence kycMatchingConfidence, G g8, float f, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            g8 = kycMatchingConfidence.matchingConfidenceLevel;
        }
        if ((i & 2) != 0) {
            f = kycMatchingConfidence.score;
        }
        if ((i & 4) != 0) {
            str = kycMatchingConfidence.detectedDocumentKey;
        }
        if ((i & 8) != 0) {
            str2 = kycMatchingConfidence.selectedDocumentKey;
        }
        return kycMatchingConfidence.copy(g8, f, str, str2);
    }

    public final G component1() {
        return this.matchingConfidenceLevel;
    }

    public final float component2() {
        return this.score;
    }

    public final String component3() {
        return this.detectedDocumentKey;
    }

    public final String component4() {
        return this.selectedDocumentKey;
    }

    public final KycMatchingConfidence copy(G matchingConfidenceLevel, float f, String detectedDocumentKey, String selectedDocumentKey) {
        j.g(matchingConfidenceLevel, "matchingConfidenceLevel");
        j.g(detectedDocumentKey, "detectedDocumentKey");
        j.g(selectedDocumentKey, "selectedDocumentKey");
        return new KycMatchingConfidence(matchingConfidenceLevel, f, detectedDocumentKey, selectedDocumentKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycMatchingConfidence)) {
            return false;
        }
        KycMatchingConfidence kycMatchingConfidence = (KycMatchingConfidence) obj;
        return this.matchingConfidenceLevel == kycMatchingConfidence.matchingConfidenceLevel && Float.compare(this.score, kycMatchingConfidence.score) == 0 && j.b(this.detectedDocumentKey, kycMatchingConfidence.detectedDocumentKey) && j.b(this.selectedDocumentKey, kycMatchingConfidence.selectedDocumentKey);
    }

    public final String getDetectedDocumentKey() {
        return this.detectedDocumentKey;
    }

    public final G getMatchingConfidenceLevel() {
        return this.matchingConfidenceLevel;
    }

    public final float getScore() {
        return this.score;
    }

    public final String getSelectedDocumentKey() {
        return this.selectedDocumentKey;
    }

    public int hashCode() {
        return this.selectedDocumentKey.hashCode() + AbstractC1414e.c((Float.floatToIntBits(this.score) + (this.matchingConfidenceLevel.hashCode() * 31)) * 31, 31, this.detectedDocumentKey);
    }

    public String toString() {
        G g8 = this.matchingConfidenceLevel;
        float f = this.score;
        String str = this.detectedDocumentKey;
        String str2 = this.selectedDocumentKey;
        StringBuilder sb2 = new StringBuilder("KycMatchingConfidence(matchingConfidenceLevel=");
        sb2.append(g8);
        sb2.append(", score=");
        sb2.append(f);
        sb2.append(", detectedDocumentKey=");
        return a.p(sb2, str, ", selectedDocumentKey=", str2, ")");
    }
}
