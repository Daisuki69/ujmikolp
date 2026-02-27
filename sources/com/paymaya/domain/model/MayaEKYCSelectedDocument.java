package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaEKYCSelectedDocument implements Parcelable {
    private static final String OTHER_PRIMARY = "Other";
    private static final String RECOMMENDED_PRIMARY = "Recommended";
    private static final String SECONDARY = "Secondary";
    private final KycCaptureGuide captureGuide;
    private final KycDocument document;
    private final String idLevel;
    private final int index;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MayaEKYCSelectedDocument> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<MayaEKYCSelectedDocument> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaEKYCSelectedDocument createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MayaEKYCSelectedDocument(KycDocument.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : KycCaptureGuide.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaEKYCSelectedDocument[] newArray(int i) {
            return new MayaEKYCSelectedDocument[i];
        }
    }

    public MayaEKYCSelectedDocument(KycDocument document, KycCaptureGuide kycCaptureGuide, String idLevel, int i) {
        j.g(document, "document");
        j.g(idLevel, "idLevel");
        this.document = document;
        this.captureGuide = kycCaptureGuide;
        this.idLevel = idLevel;
        this.index = i;
    }

    public static /* synthetic */ MayaEKYCSelectedDocument copy$default(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, KycDocument kycDocument, KycCaptureGuide kycCaptureGuide, String str, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            kycDocument = mayaEKYCSelectedDocument.document;
        }
        if ((i4 & 2) != 0) {
            kycCaptureGuide = mayaEKYCSelectedDocument.captureGuide;
        }
        if ((i4 & 4) != 0) {
            str = mayaEKYCSelectedDocument.idLevel;
        }
        if ((i4 & 8) != 0) {
            i = mayaEKYCSelectedDocument.index;
        }
        return mayaEKYCSelectedDocument.copy(kycDocument, kycCaptureGuide, str, i);
    }

    public final KycDocument component1() {
        return this.document;
    }

    public final KycCaptureGuide component2() {
        return this.captureGuide;
    }

    public final String component3() {
        return this.idLevel;
    }

    public final int component4() {
        return this.index;
    }

    public final MayaEKYCSelectedDocument copy(KycDocument document, KycCaptureGuide kycCaptureGuide, String idLevel, int i) {
        j.g(document, "document");
        j.g(idLevel, "idLevel");
        return new MayaEKYCSelectedDocument(document, kycCaptureGuide, idLevel, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MayaEKYCSelectedDocument)) {
            return false;
        }
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) obj;
        return j.b(this.document, mayaEKYCSelectedDocument.document) && j.b(this.captureGuide, mayaEKYCSelectedDocument.captureGuide) && j.b(this.idLevel, mayaEKYCSelectedDocument.idLevel) && this.index == mayaEKYCSelectedDocument.index;
    }

    public final KycCaptureGuide getCaptureGuide() {
        return this.captureGuide;
    }

    public final String getDescription() {
        String description = this.document.getDescription();
        return description == null ? "" : description;
    }

    public final KycDocument getDocument() {
        return this.document;
    }

    public final String getEventAttributeIdLevel() {
        String str = this.idLevel;
        int iHashCode = str.hashCode();
        return iHashCode != -817598092 ? iHashCode != -314765822 ? (iHashCode == 1437916763 && str.equals("recommended")) ? RECOMMENDED_PRIMARY : "" : !str.equals("primary") ? "" : OTHER_PRIMARY : !str.equals("secondary") ? "" : SECONDARY;
    }

    public final String getGetCaptureMethod() {
        KycCaptureGuide kycCaptureGuide = this.captureGuide;
        String element = "SIMPLE_ID_TENCENT_LIVENESS";
        if (kycCaptureGuide != null) {
            try {
                element = kycCaptureGuide.getCaptureMethods().get(this.index).getMethod();
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        j.f(element, "element");
        return element;
    }

    public final String getIdLevel() {
        return this.idLevel;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getKey() {
        String key = this.document.getKey();
        return key == null ? "" : key;
    }

    public final boolean getRequiresBackId() {
        KycCaptureGuide kycCaptureGuide = this.captureGuide;
        if (kycCaptureGuide != null) {
            List<KycPage> pages = kycCaptureGuide.getPages();
            if (!(pages instanceof Collection) || !pages.isEmpty()) {
                Iterator<T> it = pages.iterator();
                while (it.hasNext()) {
                    if (C2576A.z(((KycPage) it.next()).getPage(), "BACK", false, 2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean getRequiresFrontId() {
        KycCaptureGuide kycCaptureGuide = this.captureGuide;
        if (kycCaptureGuide != null) {
            List<KycPage> pages = kycCaptureGuide.getPages();
            if (!(pages instanceof Collection) || !pages.isEmpty()) {
                Iterator<T> it = pages.iterator();
                while (it.hasNext()) {
                    if (C2576A.z(((KycPage) it.next()).getPage(), "FRONT", false, 2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.document.hashCode() * 31;
        KycCaptureGuide kycCaptureGuide = this.captureGuide;
        return AbstractC1414e.c((iHashCode + (kycCaptureGuide == null ? 0 : kycCaptureGuide.hashCode())) * 31, 31, this.idLevel) + this.index;
    }

    public String toString() {
        return "MayaEKYCSelectedDocument(document=" + this.document + ", captureGuide=" + this.captureGuide + ", idLevel=" + this.idLevel + ", index=" + this.index + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.document.writeToParcel(dest, i);
        KycCaptureGuide kycCaptureGuide = this.captureGuide;
        if (kycCaptureGuide == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycCaptureGuide.writeToParcel(dest, i);
        }
        dest.writeString(this.idLevel);
        dest.writeInt(this.index);
    }

    public /* synthetic */ MayaEKYCSelectedDocument(KycDocument kycDocument, KycCaptureGuide kycCaptureGuide, String str, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(kycDocument, kycCaptureGuide, (i4 & 4) != 0 ? "recommended" : str, (i4 & 8) != 0 ? 0 : i);
    }
}
