package com.paymaya.domain.model;

import androidx.camera.core.impl.a;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycId {

    @InterfaceC1497a
    @InterfaceC1498b("expiry")
    private final String expiry;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.FILE)
    private final KycFileContent file;

    @InterfaceC1497a
    @InterfaceC1498b("number")
    private final String number;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    public KycId() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ KycId copy$default(KycId kycId, String str, KycFileContent kycFileContent, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycId.type;
        }
        if ((i & 2) != 0) {
            kycFileContent = kycId.file;
        }
        if ((i & 4) != 0) {
            str2 = kycId.number;
        }
        if ((i & 8) != 0) {
            str3 = kycId.expiry;
        }
        return kycId.copy(str, kycFileContent, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final KycFileContent component2() {
        return this.file;
    }

    public final String component3() {
        return this.number;
    }

    public final String component4() {
        return this.expiry;
    }

    public final KycId copy(String str, KycFileContent kycFileContent, String str2, String str3) {
        return new KycId(str, kycFileContent, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycId)) {
            return false;
        }
        KycId kycId = (KycId) obj;
        return j.b(this.type, kycId.type) && j.b(this.file, kycId.file) && j.b(this.number, kycId.number) && j.b(this.expiry, kycId.expiry);
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final KycFileContent getFile() {
        return this.file;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        KycFileContent kycFileContent = this.file;
        int iHashCode2 = (iHashCode + (kycFileContent == null ? 0 : kycFileContent.hashCode())) * 31;
        String str2 = this.number;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiry;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        KycFileContent kycFileContent = this.file;
        String str2 = this.number;
        String str3 = this.expiry;
        StringBuilder sb2 = new StringBuilder("KycId(type=");
        sb2.append(str);
        sb2.append(", file=");
        sb2.append(kycFileContent);
        sb2.append(", number=");
        return a.p(sb2, str2, ", expiry=", str3, ")");
    }

    public KycId(String str, KycFileContent kycFileContent, String str2, String str3) {
        this.type = str;
        this.file = kycFileContent;
        this.number = str2;
        this.expiry = str3;
    }

    public /* synthetic */ KycId(String str, KycFileContent kycFileContent, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : kycFileContent, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
