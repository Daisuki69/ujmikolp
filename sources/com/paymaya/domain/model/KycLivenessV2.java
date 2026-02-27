package com.paymaya.domain.model;

import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycLivenessV2 {

    @InterfaceC1497a
    @InterfaceC1498b("parts")
    private final List<KycUrlPart> parts;

    /* JADX WARN: Multi-variable type inference failed */
    public KycLivenessV2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycLivenessV2 copy$default(KycLivenessV2 kycLivenessV2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kycLivenessV2.parts;
        }
        return kycLivenessV2.copy(list);
    }

    public final List<KycUrlPart> component1() {
        return this.parts;
    }

    public final KycLivenessV2 copy(List<KycUrlPart> list) {
        return new KycLivenessV2(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycLivenessV2) && j.b(this.parts, ((KycLivenessV2) obj).parts);
    }

    public final List<KycUrlPart> getParts() {
        return this.parts;
    }

    public int hashCode() {
        List<KycUrlPart> list = this.parts;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "KycLivenessV2(parts=" + this.parts + ")";
    }

    public KycLivenessV2(List<KycUrlPart> list) {
        this.parts = list;
    }

    public /* synthetic */ KycLivenessV2(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
