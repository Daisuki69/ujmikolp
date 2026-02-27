package gb;

import Ch.b;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycLatestSubmissionContentData;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: gb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1515a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1515a f16798a = new C1515a();

    @Override // Ch.b
    public final Object a(Object obj, Object obj2) {
        KycLatestSubmissionContentData kycSubmissionResponse = (KycLatestSubmissionContentData) obj;
        KycCmsContent kycCmsContent = (KycCmsContent) obj2;
        j.g(kycSubmissionResponse, "kycSubmissionResponse");
        j.g(kycCmsContent, "kycCmsContent");
        return new Pair(kycSubmissionResponse, kycCmsContent);
    }
}
