package com.paymaya.domain.model;

import We.s;
import com.google.android.gms.common.internal.ImagesContract;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycUrlPart {

    @InterfaceC1497a
    @InterfaceC1498b("part")
    private final String part;

    @InterfaceC1497a
    @InterfaceC1498b(ImagesContract.URL)
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public KycUrlPart() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycUrlPart copy$default(KycUrlPart kycUrlPart, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycUrlPart.part;
        }
        if ((i & 2) != 0) {
            str2 = kycUrlPart.url;
        }
        return kycUrlPart.copy(str, str2);
    }

    public final String component1() {
        return this.part;
    }

    public final String component2() {
        return this.url;
    }

    public final KycUrlPart copy(String str, String str2) {
        return new KycUrlPart(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycUrlPart)) {
            return false;
        }
        KycUrlPart kycUrlPart = (KycUrlPart) obj;
        return j.b(this.part, kycUrlPart.part) && j.b(this.url, kycUrlPart.url);
    }

    public final String getPart() {
        return this.part;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.part;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("KycUrlPart(part=", this.part, ", url=", this.url, ")");
    }

    public KycUrlPart(String str, String str2) {
        this.part = str;
        this.url = str2;
    }

    public /* synthetic */ KycUrlPart(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
