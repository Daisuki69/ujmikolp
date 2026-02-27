package com.paymaya.domain.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycPreSubmissionRequest {

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.TAG_METADATA)
    private final KycPreSubmissionMetadata metadata;

    public KycPreSubmissionRequest(KycPreSubmissionMetadata metadata) {
        j.g(metadata, "metadata");
        this.metadata = metadata;
    }

    public static /* synthetic */ KycPreSubmissionRequest copy$default(KycPreSubmissionRequest kycPreSubmissionRequest, KycPreSubmissionMetadata kycPreSubmissionMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            kycPreSubmissionMetadata = kycPreSubmissionRequest.metadata;
        }
        return kycPreSubmissionRequest.copy(kycPreSubmissionMetadata);
    }

    public final KycPreSubmissionMetadata component1() {
        return this.metadata;
    }

    public final KycPreSubmissionRequest copy(KycPreSubmissionMetadata metadata) {
        j.g(metadata, "metadata");
        return new KycPreSubmissionRequest(metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycPreSubmissionRequest) && j.b(this.metadata, ((KycPreSubmissionRequest) obj).metadata);
    }

    public final KycPreSubmissionMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode();
    }

    public String toString() {
        return "KycPreSubmissionRequest(metadata=" + this.metadata + ")";
    }
}
