package com.paymaya.domain.model;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycAdditionalDocUrlV2 {

    @InterfaceC1497a
    @InterfaceC1498b("expiry")
    private final String expiry;

    @InterfaceC1497a
    @InterfaceC1498b("parts")
    private final List<KycUrlPart> parts;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    public KycAdditionalDocUrlV2() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycAdditionalDocUrlV2 copy$default(KycAdditionalDocUrlV2 kycAdditionalDocUrlV2, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycAdditionalDocUrlV2.type;
        }
        if ((i & 2) != 0) {
            list = kycAdditionalDocUrlV2.parts;
        }
        if ((i & 4) != 0) {
            str2 = kycAdditionalDocUrlV2.expiry;
        }
        return kycAdditionalDocUrlV2.copy(str, list, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final List<KycUrlPart> component2() {
        return this.parts;
    }

    public final String component3() {
        return this.expiry;
    }

    public final KycAdditionalDocUrlV2 copy(String str, List<KycUrlPart> list, String str2) {
        return new KycAdditionalDocUrlV2(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycAdditionalDocUrlV2)) {
            return false;
        }
        KycAdditionalDocUrlV2 kycAdditionalDocUrlV2 = (KycAdditionalDocUrlV2) obj;
        return j.b(this.type, kycAdditionalDocUrlV2.type) && j.b(this.parts, kycAdditionalDocUrlV2.parts) && j.b(this.expiry, kycAdditionalDocUrlV2.expiry);
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final List<KycUrlPart> getParts() {
        return this.parts;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<KycUrlPart> list = this.parts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.expiry;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        List<KycUrlPart> list = this.parts;
        String str2 = this.expiry;
        StringBuilder sb2 = new StringBuilder("KycAdditionalDocUrlV2(type=");
        sb2.append(str);
        sb2.append(", parts=");
        sb2.append(list);
        sb2.append(", expiry=");
        return s.p(sb2, str2, ")");
    }

    public KycAdditionalDocUrlV2(String str, List<KycUrlPart> list, String str2) {
        this.type = str;
        this.parts = list;
        this.expiry = str2;
    }

    public /* synthetic */ KycAdditionalDocUrlV2(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
