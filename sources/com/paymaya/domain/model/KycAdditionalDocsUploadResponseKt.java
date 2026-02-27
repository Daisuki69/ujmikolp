package com.paymaya.domain.model;

import cj.C1110A;
import cj.r;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycAdditionalDocsUploadResponseKt {
    public static final List<KycAdditionalDocUrlV2> getAdditionalDocumentsV2(KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse, String documentTypeKey) {
        j.g(kycAdditionalDocsUploadResponse, "<this>");
        j.g(documentTypeKey, "documentTypeKey");
        return r.c(new KycAdditionalDocUrlV2(documentTypeKey, r.c(new KycUrlPart("FRONT", kycAdditionalDocsUploadResponse.getFile().getPrivateUrl())), kycAdditionalDocsUploadResponse.getExpiry()));
    }

    public static /* synthetic */ List getAdditionalDocumentsV2$default(KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return getAdditionalDocumentsV2(kycAdditionalDocsUploadResponse, str);
    }

    public static final List<KycAdditionalDocUrlV2> getAdditionalDocumentsV2(KycAdditionalDocsUploadResponse kycAdditionalDocsUploadResponse, KycMinorPhotos kycMinorPhotos, String documentTypeKey) {
        j.g(kycAdditionalDocsUploadResponse, "<this>");
        j.g(documentTypeKey, "documentTypeKey");
        return C1110A.L(KycMinorPhotosKt.getAdditionalDocumentsV2(kycMinorPhotos), getAdditionalDocumentsV2(kycAdditionalDocsUploadResponse, documentTypeKey));
    }
}
