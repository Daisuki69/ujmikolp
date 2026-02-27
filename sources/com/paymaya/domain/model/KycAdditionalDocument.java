package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycAdditionalDocument implements Parcelable {
    public static final Parcelable.Creator<KycAdditionalDocument> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("consentUrl")
    private final String consentUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    public static final class Creator implements Parcelable.Creator<KycAdditionalDocument> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycAdditionalDocument createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycAdditionalDocument(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycAdditionalDocument[] newArray(int i) {
            return new KycAdditionalDocument[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycAdditionalDocument() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycAdditionalDocument copy$default(KycAdditionalDocument kycAdditionalDocument, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycAdditionalDocument.id;
        }
        if ((i & 2) != 0) {
            str = kycAdditionalDocument.consentUrl;
        }
        return kycAdditionalDocument.copy(num, str);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.consentUrl;
    }

    public final KycAdditionalDocument copy(Integer num, String str) {
        return new KycAdditionalDocument(num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycAdditionalDocument)) {
            return false;
        }
        KycAdditionalDocument kycAdditionalDocument = (KycAdditionalDocument) obj;
        return j.b(this.id, kycAdditionalDocument.id) && j.b(this.consentUrl, kycAdditionalDocument.consentUrl);
    }

    public final String getConsentUrl() {
        return this.consentUrl;
    }

    public final Integer getId() {
        return this.id;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.consentUrl;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "KycAdditionalDocument(id=" + this.id + ", consentUrl=" + this.consentUrl + ")";
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
        dest.writeString(this.consentUrl);
    }

    public KycAdditionalDocument(Integer num, String str) {
        this.id = num;
        this.consentUrl = str;
    }

    public /* synthetic */ KycAdditionalDocument(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str);
    }
}
