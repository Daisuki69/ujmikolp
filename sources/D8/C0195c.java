package D8;

import bj.C1042m;
import com.paymaya.domain.model.KycAdditionalDocsUploadResponse;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycLatestSubmissionContentData;
import com.paymaya.domain.model.KycPreSubmissionId;
import kotlin.Pair;

/* JADX INFO: renamed from: D8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0195c implements Ch.b, Ch.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0195c f1037b = new C0195c(0);
    public static final C0195c c = new C0195c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0195c f1038d = new C0195c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1039a;

    public /* synthetic */ C0195c(int i) {
        this.f1039a = i;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        switch (this.f1039a) {
            case 0:
                KycLatestSubmissionContentData kycSubmissionResponse = (KycLatestSubmissionContentData) obj;
                KycCmsContent kycCmsContent = (KycCmsContent) obj2;
                kotlin.jvm.internal.j.g(kycSubmissionResponse, "kycSubmissionResponse");
                kotlin.jvm.internal.j.g(kycCmsContent, "kycCmsContent");
                return new Pair(kycSubmissionResponse, kycCmsContent);
            default:
                KycCmsContent kycCmsContent2 = (KycCmsContent) obj;
                KycPreSubmissionId kycPreSubmissionId = (KycPreSubmissionId) obj2;
                kotlin.jvm.internal.j.g(kycCmsContent2, "kycCmsContent");
                kotlin.jvm.internal.j.g(kycPreSubmissionId, "kycPreSubmissionId");
                return new Pair(kycCmsContent2, kycPreSubmissionId);
        }
    }

    @Override // Ch.d
    public Object b(Object obj, Object obj2, Object obj3) {
        KycAdditionalDocsUploadResponse birthCertificateResponseBody = (KycAdditionalDocsUploadResponse) obj;
        KycAdditionalDocsUploadResponse parentIdResponseBody = (KycAdditionalDocsUploadResponse) obj2;
        KycAdditionalDocsUploadResponse consentFormResponseBody = (KycAdditionalDocsUploadResponse) obj3;
        kotlin.jvm.internal.j.g(birthCertificateResponseBody, "birthCertificateResponseBody");
        kotlin.jvm.internal.j.g(parentIdResponseBody, "parentIdResponseBody");
        kotlin.jvm.internal.j.g(consentFormResponseBody, "consentFormResponseBody");
        return new C1042m(birthCertificateResponseBody, parentIdResponseBody, consentFormResponseBody);
    }
}
