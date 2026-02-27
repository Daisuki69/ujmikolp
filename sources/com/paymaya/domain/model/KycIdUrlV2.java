package com.paymaya.domain.model;

import androidx.camera.core.impl.a;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycIdUrlV2 {

    @InterfaceC1497a
    @InterfaceC1498b("expiry")
    private final String expiry;

    @InterfaceC1497a
    @InterfaceC1498b("number")
    private final String number;

    @InterfaceC1497a
    @InterfaceC1498b("parts")
    private final List<KycUrlPart> parts;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    public KycIdUrlV2() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycIdUrlV2 copy$default(KycIdUrlV2 kycIdUrlV2, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycIdUrlV2.type;
        }
        if ((i & 2) != 0) {
            list = kycIdUrlV2.parts;
        }
        if ((i & 4) != 0) {
            str2 = kycIdUrlV2.number;
        }
        if ((i & 8) != 0) {
            str3 = kycIdUrlV2.expiry;
        }
        return kycIdUrlV2.copy(str, list, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final List<KycUrlPart> component2() {
        return this.parts;
    }

    public final String component3() {
        return this.number;
    }

    public final String component4() {
        return this.expiry;
    }

    public final KycIdUrlV2 copy(String str, List<KycUrlPart> list, String str2, String str3) {
        return new KycIdUrlV2(str, list, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycIdUrlV2)) {
            return false;
        }
        KycIdUrlV2 kycIdUrlV2 = (KycIdUrlV2) obj;
        return j.b(this.type, kycIdUrlV2.type) && j.b(this.parts, kycIdUrlV2.parts) && j.b(this.number, kycIdUrlV2.number) && j.b(this.expiry, kycIdUrlV2.expiry);
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final String getNumber() {
        return this.number;
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
        String str2 = this.number;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiry;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        List<KycUrlPart> list = this.parts;
        String str2 = this.number;
        String str3 = this.expiry;
        StringBuilder sb2 = new StringBuilder("KycIdUrlV2(type=");
        sb2.append(str);
        sb2.append(", parts=");
        sb2.append(list);
        sb2.append(", number=");
        return a.p(sb2, str2, ", expiry=", str3, ")");
    }

    public KycIdUrlV2(String str, List<KycUrlPart> list, String str2, String str3) {
        this.type = str;
        this.parts = list;
        this.number = str2;
        this.expiry = str3;
    }

    public /* synthetic */ KycIdUrlV2(String str, List list, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
