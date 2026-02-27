package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycDocumentSample implements Parcelable {
    public static final Parcelable.Creator<KycDocumentSample> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("additionalDescription")
    private final String additionalDescription;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("images")
    private final List<KycDocumentSampleImage> images;

    @InterfaceC1497a
    @InterfaceC1498b("variant")
    private final String variant;

    public static final class Creator implements Parcelable.Creator<KycDocumentSample> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocumentSample createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(KycDocumentSampleImage.CREATOR, parcel, arrayList, I4, 1);
            }
            return new KycDocumentSample(numValueOf, string, string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocumentSample[] newArray(int i) {
            return new KycDocumentSample[i];
        }
    }

    public KycDocumentSample() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycDocumentSample copy$default(KycDocumentSample kycDocumentSample, Integer num, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycDocumentSample.id;
        }
        if ((i & 2) != 0) {
            str = kycDocumentSample.variant;
        }
        if ((i & 4) != 0) {
            str2 = kycDocumentSample.description;
        }
        if ((i & 8) != 0) {
            str3 = kycDocumentSample.additionalDescription;
        }
        if ((i & 16) != 0) {
            list = kycDocumentSample.images;
        }
        List list2 = list;
        String str4 = str2;
        return kycDocumentSample.copy(num, str, str4, str3, list2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.variant;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.additionalDescription;
    }

    public final List<KycDocumentSampleImage> component5() {
        return this.images;
    }

    public final KycDocumentSample copy(Integer num, String str, String str2, String str3, List<KycDocumentSampleImage> images) {
        j.g(images, "images");
        return new KycDocumentSample(num, str, str2, str3, images);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDocumentSample)) {
            return false;
        }
        KycDocumentSample kycDocumentSample = (KycDocumentSample) obj;
        return j.b(this.id, kycDocumentSample.id) && j.b(this.variant, kycDocumentSample.variant) && j.b(this.description, kycDocumentSample.description) && j.b(this.additionalDescription, kycDocumentSample.additionalDescription) && j.b(this.images, kycDocumentSample.images);
    }

    public final String getAdditionalDescription() {
        return this.additionalDescription;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getId() {
        return this.id;
    }

    public final List<KycDocumentSampleImage> getImages() {
        return this.images;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.variant;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.additionalDescription;
        return this.images.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.variant;
        String str2 = this.description;
        String str3 = this.additionalDescription;
        List<KycDocumentSampleImage> list = this.images;
        StringBuilder sbO = AbstractC1213b.O(num, "KycDocumentSample(id=", ", variant=", str, ", description=");
        c.A(sbO, str2, ", additionalDescription=", str3, ", images=");
        return s.r(sbO, list, ")");
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
        dest.writeString(this.variant);
        dest.writeString(this.description);
        dest.writeString(this.additionalDescription);
        Iterator itQ = AbstractC1213b.Q(this.images, dest);
        while (itQ.hasNext()) {
            ((KycDocumentSampleImage) itQ.next()).writeToParcel(dest, i);
        }
    }

    public KycDocumentSample(Integer num, String str, String str2, String str3, List<KycDocumentSampleImage> images) {
        j.g(images, "images");
        this.id = num;
        this.variant = str;
        this.description = str2;
        this.additionalDescription = str3;
        this.images = images;
    }

    public KycDocumentSample(Integer num, String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? C1112C.f9377a : list);
    }
}
