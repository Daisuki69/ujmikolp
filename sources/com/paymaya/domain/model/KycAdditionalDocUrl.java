package com.paymaya.domain.model;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ImagesContract;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycAdditionalDocUrl {

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b(ImagesContract.URL)
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public KycAdditionalDocUrl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycAdditionalDocUrl copy$default(KycAdditionalDocUrl kycAdditionalDocUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycAdditionalDocUrl.type;
        }
        if ((i & 2) != 0) {
            str2 = kycAdditionalDocUrl.url;
        }
        return kycAdditionalDocUrl.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.url;
    }

    public final KycAdditionalDocUrl copy(String str, String str2) {
        return new KycAdditionalDocUrl(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycAdditionalDocUrl)) {
            return false;
        }
        KycAdditionalDocUrl kycAdditionalDocUrl = (KycAdditionalDocUrl) obj;
        return j.b(this.type, kycAdditionalDocUrl.type) && j.b(this.url, kycAdditionalDocUrl.url);
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
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("KycAdditionalDocUrl(type=", this.type, ", url=", this.url, ")");
    }

    public KycAdditionalDocUrl(String str, String str2) {
        this.type = str;
        this.url = str2;
    }

    public /* synthetic */ KycAdditionalDocUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
