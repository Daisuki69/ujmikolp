package com.paymaya.domain.model;

import cj.C1132s;
import cj.r;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class KycMinorPhotosKt {
    public static final List<KycAdditionalDocUrlV2> getAdditionalDocumentsV2(KycMinorPhotos kycMinorPhotos) {
        return C1132s.g(new KycAdditionalDocUrlV2(AdditionalDocType.PARENTAL_CONSENT.getType(), r.c(new KycUrlPart("FRONT", kycMinorPhotos != null ? kycMinorPhotos.getConsentFormUrl() : null)), null, 4, null), new KycAdditionalDocUrlV2(AdditionalDocType.PARENT_GUARDIAN_ID.getType(), r.c(new KycUrlPart("FRONT", kycMinorPhotos != null ? kycMinorPhotos.getParentIdUrl() : null)), null, 4, null), new KycAdditionalDocUrlV2(AdditionalDocType.BIRTH_CERTIFICATE.getType(), r.c(new KycUrlPart("FRONT", kycMinorPhotos != null ? kycMinorPhotos.getBirthCertificateUrl() : null)), null, 4, null));
    }
}
