package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycPreSubmissionId {

    @InterfaceC1497a
    @InterfaceC1498b("preSubmissionId")
    private final String preSubmissionId;

    /* JADX WARN: Multi-variable type inference failed */
    public KycPreSubmissionId() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycPreSubmissionId copy$default(KycPreSubmissionId kycPreSubmissionId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycPreSubmissionId.preSubmissionId;
        }
        return kycPreSubmissionId.copy(str);
    }

    public final String component1() {
        return this.preSubmissionId;
    }

    public final KycPreSubmissionId copy(String str) {
        return new KycPreSubmissionId(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycPreSubmissionId) && j.b(this.preSubmissionId, ((KycPreSubmissionId) obj).preSubmissionId);
    }

    public final String getPreSubmissionId() {
        return this.preSubmissionId;
    }

    public int hashCode() {
        String str = this.preSubmissionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("KycPreSubmissionId(preSubmissionId=", this.preSubmissionId, ")");
    }

    public KycPreSubmissionId(String str) {
        this.preSubmissionId = str;
    }

    public /* synthetic */ KycPreSubmissionId(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
