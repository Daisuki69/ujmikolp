package com.paymaya.domain.model;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycOcrId {

    @InterfaceC1497a
    @InterfaceC1498b(Constants.FILE)
    private final KycFileContent file;

    @InterfaceC1497a
    @InterfaceC1498b(CommonUtils.SERVICE)
    private final KycOcrData ocr;

    @InterfaceC1497a
    @InterfaceC1498b("parts")
    private final List<KycPart> parts;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    public KycOcrId() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycOcrId copy$default(KycOcrId kycOcrId, String str, KycFileContent kycFileContent, KycOcrData kycOcrData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycOcrId.type;
        }
        if ((i & 2) != 0) {
            kycFileContent = kycOcrId.file;
        }
        if ((i & 4) != 0) {
            kycOcrData = kycOcrId.ocr;
        }
        if ((i & 8) != 0) {
            list = kycOcrId.parts;
        }
        return kycOcrId.copy(str, kycFileContent, kycOcrData, list);
    }

    public final String component1() {
        return this.type;
    }

    public final KycFileContent component2() {
        return this.file;
    }

    public final KycOcrData component3() {
        return this.ocr;
    }

    public final List<KycPart> component4() {
        return this.parts;
    }

    public final KycOcrId copy(String str, KycFileContent kycFileContent, KycOcrData kycOcrData, List<KycPart> list) {
        return new KycOcrId(str, kycFileContent, kycOcrData, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycOcrId)) {
            return false;
        }
        KycOcrId kycOcrId = (KycOcrId) obj;
        return j.b(this.type, kycOcrId.type) && j.b(this.file, kycOcrId.file) && j.b(this.ocr, kycOcrId.ocr) && j.b(this.parts, kycOcrId.parts);
    }

    public final KycFileContent getFile() {
        return this.file;
    }

    public final KycOcrData getOcr() {
        return this.ocr;
    }

    public final List<KycPart> getParts() {
        return this.parts;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        KycFileContent kycFileContent = this.file;
        int iHashCode2 = (iHashCode + (kycFileContent == null ? 0 : kycFileContent.hashCode())) * 31;
        KycOcrData kycOcrData = this.ocr;
        int iHashCode3 = (iHashCode2 + (kycOcrData == null ? 0 : kycOcrData.hashCode())) * 31;
        List<KycPart> list = this.parts;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "KycOcrId(type=" + this.type + ", file=" + this.file + ", ocr=" + this.ocr + ", parts=" + this.parts + ")";
    }

    public KycOcrId(String str, KycFileContent kycFileContent, KycOcrData kycOcrData, List<KycPart> list) {
        this.type = str;
        this.file = kycFileContent;
        this.ocr = kycOcrData;
        this.parts = list;
    }

    public /* synthetic */ KycOcrId(String str, KycFileContent kycFileContent, KycOcrData kycOcrData, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : kycFileContent, (i & 4) != 0 ? null : kycOcrData, (i & 8) != 0 ? null : list);
    }
}
