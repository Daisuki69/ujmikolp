package com.paymaya.domain.model;

import cj.C1112C;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycCmsContentDataKt {
    public static final List<KycDocument> getDocuments(KycCmsContentData kycCmsContentData, boolean z4) {
        j.g(kycCmsContentData, "<this>");
        if (!z4) {
            List<KycDocument> documents = kycCmsContentData.getDocuments();
            return documents == null ? C1112C.f9377a : documents;
        }
        ArrayList arrayList = new ArrayList();
        List<KycDocument> recommendedDocuments = kycCmsContentData.getRecommendedDocuments();
        if (recommendedDocuments != null) {
            arrayList.addAll(recommendedDocuments);
        }
        List<KycDocument> otherPrimaryDocuments = kycCmsContentData.getOtherPrimaryDocuments();
        if (otherPrimaryDocuments != null) {
            arrayList.addAll(otherPrimaryDocuments);
        }
        List<KycDocument> secondaryDocuments = kycCmsContentData.getSecondaryDocuments();
        if (secondaryDocuments != null) {
            arrayList.addAll(secondaryDocuments);
        }
        return arrayList;
    }
}
