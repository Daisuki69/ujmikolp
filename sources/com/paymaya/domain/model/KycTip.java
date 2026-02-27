package com.paymaya.domain.model;

import We.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycTip {
    public static final Companion Companion = new Companion(null);
    private final String description;
    private final String iconUrl;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KycTip fromPhotoTips(KycPhotoTip photoTip) {
            j.g(photoTip, "photoTip");
            return new KycTip(photoTip.getDescription(), photoTip.getIconUrl());
        }

        public final KycTip fromVideoTips(KycVideoTip videoTip) {
            j.g(videoTip, "videoTip");
            return new KycTip(videoTip.getDescription(), videoTip.getIconUrl());
        }

        private Companion() {
        }
    }

    public KycTip(String str, String str2) {
        this.description = str;
        this.iconUrl = str2;
    }

    public static /* synthetic */ KycTip copy$default(KycTip kycTip, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycTip.description;
        }
        if ((i & 2) != 0) {
            str2 = kycTip.iconUrl;
        }
        return kycTip.copy(str, str2);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final KycTip copy(String str, String str2) {
        return new KycTip(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycTip)) {
            return false;
        }
        KycTip kycTip = (KycTip) obj;
        return j.b(this.description, kycTip.description) && j.b(this.iconUrl, kycTip.iconUrl);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("KycTip(description=", this.description, ", iconUrl=", this.iconUrl, ")");
    }
}
