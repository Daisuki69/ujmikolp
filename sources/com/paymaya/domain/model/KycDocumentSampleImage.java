package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycDocumentSampleImage implements Parcelable {
    public static final Parcelable.Creator<KycDocumentSampleImage> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("instruction")
    private final String instruction;

    @InterfaceC1497a
    @InterfaceC1498b(ImagesContract.URL)
    private final String url;

    public static final class Creator implements Parcelable.Creator<KycDocumentSampleImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocumentSampleImage createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycDocumentSampleImage(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDocumentSampleImage[] newArray(int i) {
            return new KycDocumentSampleImage[i];
        }
    }

    public KycDocumentSampleImage() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycDocumentSampleImage copy$default(KycDocumentSampleImage kycDocumentSampleImage, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycDocumentSampleImage.id;
        }
        if ((i & 2) != 0) {
            str = kycDocumentSampleImage.instruction;
        }
        if ((i & 4) != 0) {
            str2 = kycDocumentSampleImage.url;
        }
        return kycDocumentSampleImage.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.instruction;
    }

    public final String component3() {
        return this.url;
    }

    public final KycDocumentSampleImage copy(Integer num, String str, String str2) {
        return new KycDocumentSampleImage(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDocumentSampleImage)) {
            return false;
        }
        KycDocumentSampleImage kycDocumentSampleImage = (KycDocumentSampleImage) obj;
        return j.b(this.id, kycDocumentSampleImage.id) && j.b(this.instruction, kycDocumentSampleImage.instruction) && j.b(this.url, kycDocumentSampleImage.url);
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getInstruction() {
        return this.instruction;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.instruction;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.instruction;
        return s.p(AbstractC1213b.O(num, "KycDocumentSampleImage(id=", ", instruction=", str, ", url="), this.url, ")");
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
        dest.writeString(this.instruction);
        dest.writeString(this.url);
    }

    public KycDocumentSampleImage(Integer num, String str, String str2) {
        this.id = num;
        this.instruction = str;
        this.url = str2;
    }

    public /* synthetic */ KycDocumentSampleImage(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
