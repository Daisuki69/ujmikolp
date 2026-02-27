package com.paymaya.domain.model;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycUploadRequest {

    @InterfaceC1497a
    @InterfaceC1498b("base64")
    private final String base64;

    @InterfaceC1497a
    @InterfaceC1498b("part")
    private final String part;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    public KycUploadRequest(String type, String part, String base64) {
        j.g(type, "type");
        j.g(part, "part");
        j.g(base64, "base64");
        this.type = type;
        this.part = part;
        this.base64 = base64;
    }

    public static /* synthetic */ KycUploadRequest copy$default(KycUploadRequest kycUploadRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycUploadRequest.type;
        }
        if ((i & 2) != 0) {
            str2 = kycUploadRequest.part;
        }
        if ((i & 4) != 0) {
            str3 = kycUploadRequest.base64;
        }
        return kycUploadRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.part;
    }

    public final String component3() {
        return this.base64;
    }

    public final KycUploadRequest copy(String type, String part, String base64) {
        j.g(type, "type");
        j.g(part, "part");
        j.g(base64, "base64");
        return new KycUploadRequest(type, part, base64);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycUploadRequest)) {
            return false;
        }
        KycUploadRequest kycUploadRequest = (KycUploadRequest) obj;
        return j.b(this.type, kycUploadRequest.type) && j.b(this.part, kycUploadRequest.part) && j.b(this.base64, kycUploadRequest.base64);
    }

    public final String getBase64() {
        return this.base64;
    }

    public final String getPart() {
        return this.part;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.base64.hashCode() + AbstractC1414e.c(this.type.hashCode() * 31, 31, this.part);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.part;
        return s.p(s.x("KycUploadRequest(type=", str, ", part=", str2, ", base64="), this.base64, ")");
    }
}
