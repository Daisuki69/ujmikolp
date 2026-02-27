package com.paymaya.domain.model;

import We.s;
import androidx.camera.core.impl.a;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycIdUrl {

    @InterfaceC1497a
    @InterfaceC1498b("expiry")
    private final String expiry;

    @InterfaceC1497a
    @InterfaceC1498b("number")
    private final String number;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b(ImagesContract.URL)
    private final String url;

    public KycIdUrl() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ KycIdUrl copy$default(KycIdUrl kycIdUrl, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycIdUrl.type;
        }
        if ((i & 2) != 0) {
            str2 = kycIdUrl.url;
        }
        if ((i & 4) != 0) {
            str3 = kycIdUrl.number;
        }
        if ((i & 8) != 0) {
            str4 = kycIdUrl.expiry;
        }
        return kycIdUrl.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.number;
    }

    public final String component4() {
        return this.expiry;
    }

    public final KycIdUrl copy(String str, String str2, String str3, String str4) {
        return new KycIdUrl(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycIdUrl)) {
            return false;
        }
        KycIdUrl kycIdUrl = (KycIdUrl) obj;
        return j.b(this.type, kycIdUrl.type) && j.b(this.url, kycIdUrl.url) && j.b(this.number, kycIdUrl.number) && j.b(this.expiry, kycIdUrl.expiry);
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.number;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiry;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.url;
        return a.p(s.x("KycIdUrl(type=", str, ", url=", str2, ", number="), this.number, ", expiry=", this.expiry, ")");
    }

    public KycIdUrl(String str, String str2, String str3, String str4) {
        this.type = str;
        this.url = str2;
        this.number = str3;
        this.expiry = str4;
    }

    public /* synthetic */ KycIdUrl(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
