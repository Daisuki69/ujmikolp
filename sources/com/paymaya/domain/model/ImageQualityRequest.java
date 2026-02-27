package com.paymaya.domain.model;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageQualityRequest {

    @InterfaceC1497a
    @InterfaceC1498b("imageQuality")
    private final String imageQuality;

    @InterfaceC1497a
    @InterfaceC1498b("part")
    private final String part;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    public ImageQualityRequest(String type, String part, String imageQuality) {
        j.g(type, "type");
        j.g(part, "part");
        j.g(imageQuality, "imageQuality");
        this.type = type;
        this.part = part;
        this.imageQuality = imageQuality;
    }

    public static /* synthetic */ ImageQualityRequest copy$default(ImageQualityRequest imageQualityRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageQualityRequest.type;
        }
        if ((i & 2) != 0) {
            str2 = imageQualityRequest.part;
        }
        if ((i & 4) != 0) {
            str3 = imageQualityRequest.imageQuality;
        }
        return imageQualityRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.part;
    }

    public final String component3() {
        return this.imageQuality;
    }

    public final ImageQualityRequest copy(String type, String part, String imageQuality) {
        j.g(type, "type");
        j.g(part, "part");
        j.g(imageQuality, "imageQuality");
        return new ImageQualityRequest(type, part, imageQuality);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageQualityRequest)) {
            return false;
        }
        ImageQualityRequest imageQualityRequest = (ImageQualityRequest) obj;
        return j.b(this.type, imageQualityRequest.type) && j.b(this.part, imageQualityRequest.part) && j.b(this.imageQuality, imageQualityRequest.imageQuality);
    }

    public final String getImageQuality() {
        return this.imageQuality;
    }

    public final String getPart() {
        return this.part;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.imageQuality.hashCode() + AbstractC1414e.c(this.type.hashCode() * 31, 31, this.part);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.part;
        return s.p(s.x("ImageQualityRequest(type=", str, ", part=", str2, ", imageQuality="), this.imageQuality, ")");
    }
}
