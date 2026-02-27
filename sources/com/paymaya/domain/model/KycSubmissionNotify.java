package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycSubmissionNotify {

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("referenceId")
    private final String referenceId;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    public KycSubmissionNotify(String str, String str2, String str3) {
        this.id = str;
        this.referenceId = str2;
        this.status = str3;
    }

    public static /* synthetic */ KycSubmissionNotify copy$default(KycSubmissionNotify kycSubmissionNotify, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycSubmissionNotify.id;
        }
        if ((i & 2) != 0) {
            str2 = kycSubmissionNotify.referenceId;
        }
        if ((i & 4) != 0) {
            str3 = kycSubmissionNotify.status;
        }
        return kycSubmissionNotify.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.referenceId;
    }

    public final String component3() {
        return this.status;
    }

    public final KycSubmissionNotify copy(String str, String str2, String str3) {
        return new KycSubmissionNotify(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycSubmissionNotify)) {
            return false;
        }
        KycSubmissionNotify kycSubmissionNotify = (KycSubmissionNotify) obj;
        return j.b(this.id, kycSubmissionNotify.id) && j.b(this.referenceId, kycSubmissionNotify.referenceId) && j.b(this.status, kycSubmissionNotify.status);
    }

    public final String getId() {
        return this.id;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.referenceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.referenceId;
        return s.p(s.x("KycSubmissionNotify(id=", str, ", referenceId=", str2, ", status="), this.status, ")");
    }
}
