package com.paymaya.domain.model;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycAdditionalDocType {

    @InterfaceC1497a
    @InterfaceC1498b(Constants.FILE)
    private final KycFileContent file;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public KycAdditionalDocType() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycAdditionalDocType copy$default(KycAdditionalDocType kycAdditionalDocType, String str, KycFileContent kycFileContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycAdditionalDocType.type;
        }
        if ((i & 2) != 0) {
            kycFileContent = kycAdditionalDocType.file;
        }
        return kycAdditionalDocType.copy(str, kycFileContent);
    }

    public final String component1() {
        return this.type;
    }

    public final KycFileContent component2() {
        return this.file;
    }

    public final KycAdditionalDocType copy(String str, KycFileContent kycFileContent) {
        return new KycAdditionalDocType(str, kycFileContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycAdditionalDocType)) {
            return false;
        }
        KycAdditionalDocType kycAdditionalDocType = (KycAdditionalDocType) obj;
        return j.b(this.type, kycAdditionalDocType.type) && j.b(this.file, kycAdditionalDocType.file);
    }

    public final KycFileContent getFile() {
        return this.file;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        KycFileContent kycFileContent = this.file;
        return iHashCode + (kycFileContent != null ? kycFileContent.hashCode() : 0);
    }

    public String toString() {
        return "KycAdditionalDocType(type=" + this.type + ", file=" + this.file + ")";
    }

    public KycAdditionalDocType(String str, KycFileContent kycFileContent) {
        this.type = str;
        this.file = kycFileContent;
    }

    public /* synthetic */ KycAdditionalDocType(String str, KycFileContent kycFileContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : kycFileContent);
    }
}
