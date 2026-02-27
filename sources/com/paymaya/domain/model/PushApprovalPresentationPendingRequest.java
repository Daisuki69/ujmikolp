package com.paymaya.domain.model;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PushApprovalPresentationPendingRequest {
    private final String formattedCreatedAt;
    private final String shortenedRrn;

    public PushApprovalPresentationPendingRequest(String shortenedRrn, String formattedCreatedAt) {
        j.g(shortenedRrn, "shortenedRrn");
        j.g(formattedCreatedAt, "formattedCreatedAt");
        this.shortenedRrn = shortenedRrn;
        this.formattedCreatedAt = formattedCreatedAt;
    }

    public static /* synthetic */ PushApprovalPresentationPendingRequest copy$default(PushApprovalPresentationPendingRequest pushApprovalPresentationPendingRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushApprovalPresentationPendingRequest.shortenedRrn;
        }
        if ((i & 2) != 0) {
            str2 = pushApprovalPresentationPendingRequest.formattedCreatedAt;
        }
        return pushApprovalPresentationPendingRequest.copy(str, str2);
    }

    public final String component1() {
        return this.shortenedRrn;
    }

    public final String component2() {
        return this.formattedCreatedAt;
    }

    public final PushApprovalPresentationPendingRequest copy(String shortenedRrn, String formattedCreatedAt) {
        j.g(shortenedRrn, "shortenedRrn");
        j.g(formattedCreatedAt, "formattedCreatedAt");
        return new PushApprovalPresentationPendingRequest(shortenedRrn, formattedCreatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushApprovalPresentationPendingRequest)) {
            return false;
        }
        PushApprovalPresentationPendingRequest pushApprovalPresentationPendingRequest = (PushApprovalPresentationPendingRequest) obj;
        return j.b(this.shortenedRrn, pushApprovalPresentationPendingRequest.shortenedRrn) && j.b(this.formattedCreatedAt, pushApprovalPresentationPendingRequest.formattedCreatedAt);
    }

    public final String getFormattedCreatedAt() {
        return this.formattedCreatedAt;
    }

    public final String getShortenedRrn() {
        return this.shortenedRrn;
    }

    public int hashCode() {
        return this.formattedCreatedAt.hashCode() + (this.shortenedRrn.hashCode() * 31);
    }

    public String toString() {
        return s.l("PushApprovalPresentationPendingRequest(shortenedRrn=", this.shortenedRrn, ", formattedCreatedAt=", this.formattedCreatedAt, ")");
    }
}
