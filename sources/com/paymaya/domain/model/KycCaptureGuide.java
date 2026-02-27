package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycCaptureGuide implements Parcelable {
    public static final Parcelable.Creator<KycCaptureGuide> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("capture_methods")
    private final List<KycCaptureMethod> captureMethods;

    @InterfaceC1497a
    @InterfaceC1498b("document")
    private final KycDocumentTypeGuide document;

    @InterfaceC1497a
    @InterfaceC1498b("header")
    private final String header;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("id_guides")
    private final List<KycIdGuide> idGuide;

    @InterfaceC1497a
    @InterfaceC1498b("is_allowed_to_upload")
    private final Boolean isAllowedToUpload;

    @InterfaceC1497a
    @InterfaceC1498b("pages")
    private final List<KycPage> pages;

    @InterfaceC1497a
    @InterfaceC1498b("samples")
    private final List<KycDocumentSample> samples;

    @InterfaceC1497a
    @InterfaceC1498b("sub_header")
    private final String subHeader;

    @InterfaceC1497a
    @InterfaceC1498b("variations")
    private final List<KycVariation> variations;

    public static final class Creator implements Parcelable.Creator<KycCaptureGuide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCaptureGuide createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            KycDocumentTypeGuide kycDocumentTypeGuideCreateFromParcel = parcel.readInt() == 0 ? null : KycDocumentTypeGuide.CREATOR.createFromParcel(parcel);
            int I4 = 0;
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I9 = 0;
            while (I9 != i) {
                I9 = AbstractC1213b.I(KycPage.CREATOR, parcel, arrayList, I9, 1);
            }
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            int I10 = 0;
            while (I10 != i4) {
                I10 = AbstractC1213b.I(KycCaptureMethod.CREATOR, parcel, arrayList2, I10, 1);
            }
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            int I11 = 0;
            while (I11 != i6) {
                I11 = AbstractC1213b.I(KycDocumentSample.CREATOR, parcel, arrayList3, I11, 1);
            }
            int i10 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i10);
            int I12 = 0;
            while (I12 != i10) {
                I12 = AbstractC1213b.I(KycVariation.CREATOR, parcel, arrayList4, I12, 1);
            }
            int i11 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i11);
            while (I4 != i11) {
                I4 = AbstractC1213b.I(KycIdGuide.CREATOR, parcel, arrayList5, I4, 1);
            }
            return new KycCaptureGuide(numValueOf, kycDocumentTypeGuideCreateFromParcel, bool, string, string2, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCaptureGuide[] newArray(int i) {
            return new KycCaptureGuide[i];
        }
    }

    public KycCaptureGuide() {
        this(null, null, null, null, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycCaptureGuide copy$default(KycCaptureGuide kycCaptureGuide, Integer num, KycDocumentTypeGuide kycDocumentTypeGuide, Boolean bool, String str, String str2, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycCaptureGuide.id;
        }
        if ((i & 2) != 0) {
            kycDocumentTypeGuide = kycCaptureGuide.document;
        }
        if ((i & 4) != 0) {
            bool = kycCaptureGuide.isAllowedToUpload;
        }
        if ((i & 8) != 0) {
            str = kycCaptureGuide.header;
        }
        if ((i & 16) != 0) {
            str2 = kycCaptureGuide.subHeader;
        }
        if ((i & 32) != 0) {
            list = kycCaptureGuide.pages;
        }
        if ((i & 64) != 0) {
            list2 = kycCaptureGuide.captureMethods;
        }
        if ((i & 128) != 0) {
            list3 = kycCaptureGuide.samples;
        }
        if ((i & 256) != 0) {
            list4 = kycCaptureGuide.variations;
        }
        if ((i & 512) != 0) {
            list5 = kycCaptureGuide.idGuide;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list2;
        List list9 = list3;
        String str3 = str2;
        List list10 = list;
        return kycCaptureGuide.copy(num, kycDocumentTypeGuide, bool, str, str3, list10, list8, list9, list6, list7);
    }

    public final Integer component1() {
        return this.id;
    }

    public final List<KycIdGuide> component10() {
        return this.idGuide;
    }

    public final KycDocumentTypeGuide component2() {
        return this.document;
    }

    public final Boolean component3() {
        return this.isAllowedToUpload;
    }

    public final String component4() {
        return this.header;
    }

    public final String component5() {
        return this.subHeader;
    }

    public final List<KycPage> component6() {
        return this.pages;
    }

    public final List<KycCaptureMethod> component7() {
        return this.captureMethods;
    }

    public final List<KycDocumentSample> component8() {
        return this.samples;
    }

    public final List<KycVariation> component9() {
        return this.variations;
    }

    public final KycCaptureGuide copy(Integer num, KycDocumentTypeGuide kycDocumentTypeGuide, Boolean bool, String str, String str2, List<KycPage> pages, List<KycCaptureMethod> captureMethods, List<KycDocumentSample> samples, List<KycVariation> variations, List<KycIdGuide> idGuide) {
        j.g(pages, "pages");
        j.g(captureMethods, "captureMethods");
        j.g(samples, "samples");
        j.g(variations, "variations");
        j.g(idGuide, "idGuide");
        return new KycCaptureGuide(num, kycDocumentTypeGuide, bool, str, str2, pages, captureMethods, samples, variations, idGuide);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycCaptureGuide)) {
            return false;
        }
        KycCaptureGuide kycCaptureGuide = (KycCaptureGuide) obj;
        return j.b(this.id, kycCaptureGuide.id) && j.b(this.document, kycCaptureGuide.document) && j.b(this.isAllowedToUpload, kycCaptureGuide.isAllowedToUpload) && j.b(this.header, kycCaptureGuide.header) && j.b(this.subHeader, kycCaptureGuide.subHeader) && j.b(this.pages, kycCaptureGuide.pages) && j.b(this.captureMethods, kycCaptureGuide.captureMethods) && j.b(this.samples, kycCaptureGuide.samples) && j.b(this.variations, kycCaptureGuide.variations) && j.b(this.idGuide, kycCaptureGuide.idGuide);
    }

    public final List<KycCaptureMethod> getCaptureMethods() {
        return this.captureMethods;
    }

    public final KycDocumentTypeGuide getDocument() {
        return this.document;
    }

    public final String getHeader() {
        return this.header;
    }

    public final Integer getId() {
        return this.id;
    }

    public final List<KycIdGuide> getIdGuide() {
        return this.idGuide;
    }

    public final List<KycPage> getPages() {
        return this.pages;
    }

    public final List<KycDocumentSample> getSamples() {
        return this.samples;
    }

    public final String getSubHeader() {
        return this.subHeader;
    }

    public final List<KycVariation> getVariations() {
        return this.variations;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        KycDocumentTypeGuide kycDocumentTypeGuide = this.document;
        int iHashCode2 = (iHashCode + (kycDocumentTypeGuide == null ? 0 : kycDocumentTypeGuide.hashCode())) * 31;
        Boolean bool = this.isAllowedToUpload;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.header;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subHeader;
        return this.idGuide.hashCode() + AbstractC1414e.d(this.variations, AbstractC1414e.d(this.samples, AbstractC1414e.d(this.captureMethods, AbstractC1414e.d(this.pages, (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final Boolean isAllowedToUpload() {
        return this.isAllowedToUpload;
    }

    public String toString() {
        return "KycCaptureGuide(id=" + this.id + ", document=" + this.document + ", isAllowedToUpload=" + this.isAllowedToUpload + ", header=" + this.header + ", subHeader=" + this.subHeader + ", pages=" + this.pages + ", captureMethods=" + this.captureMethods + ", samples=" + this.samples + ", variations=" + this.variations + ", idGuide=" + this.idGuide + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        KycDocumentTypeGuide kycDocumentTypeGuide = this.document;
        if (kycDocumentTypeGuide == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycDocumentTypeGuide.writeToParcel(dest, i);
        }
        Boolean bool = this.isAllowedToUpload;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
        dest.writeString(this.header);
        dest.writeString(this.subHeader);
        Iterator itQ = AbstractC1213b.Q(this.pages, dest);
        while (itQ.hasNext()) {
            ((KycPage) itQ.next()).writeToParcel(dest, i);
        }
        Iterator itQ2 = AbstractC1213b.Q(this.captureMethods, dest);
        while (itQ2.hasNext()) {
            ((KycCaptureMethod) itQ2.next()).writeToParcel(dest, i);
        }
        Iterator itQ3 = AbstractC1213b.Q(this.samples, dest);
        while (itQ3.hasNext()) {
            ((KycDocumentSample) itQ3.next()).writeToParcel(dest, i);
        }
        Iterator itQ4 = AbstractC1213b.Q(this.variations, dest);
        while (itQ4.hasNext()) {
            ((KycVariation) itQ4.next()).writeToParcel(dest, i);
        }
        Iterator itQ5 = AbstractC1213b.Q(this.idGuide, dest);
        while (itQ5.hasNext()) {
            ((KycIdGuide) itQ5.next()).writeToParcel(dest, i);
        }
    }

    public KycCaptureGuide(Integer num, KycDocumentTypeGuide kycDocumentTypeGuide, Boolean bool, String str, String str2, List<KycPage> pages, List<KycCaptureMethod> captureMethods, List<KycDocumentSample> samples, List<KycVariation> variations, List<KycIdGuide> idGuide) {
        j.g(pages, "pages");
        j.g(captureMethods, "captureMethods");
        j.g(samples, "samples");
        j.g(variations, "variations");
        j.g(idGuide, "idGuide");
        this.id = num;
        this.document = kycDocumentTypeGuide;
        this.isAllowedToUpload = bool;
        this.header = str;
        this.subHeader = str2;
        this.pages = pages;
        this.captureMethods = captureMethods;
        this.samples = samples;
        this.variations = variations;
        this.idGuide = idGuide;
    }

    public KycCaptureGuide(Integer num, KycDocumentTypeGuide kycDocumentTypeGuide, Boolean bool, String str, String str2, List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : kycDocumentTypeGuide, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? C1112C.f9377a : list, (i & 64) != 0 ? C1112C.f9377a : list2, (i & 128) != 0 ? C1112C.f9377a : list3, (i & 256) != 0 ? C1112C.f9377a : list4, (i & 512) != 0 ? C1112C.f9377a : list5);
    }
}
