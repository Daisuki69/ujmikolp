package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycSubmit implements Parcelable {
    public static final Parcelable.Creator<KycSubmit> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("header")
    private final String header;

    @InterfaceC1497a
    @InterfaceC1498b("highlightedPhrase")
    private final String highlightedPhrase;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("info")
    private final String info;

    public static final class Creator implements Parcelable.Creator<KycSubmit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSubmit createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycSubmit(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSubmit[] newArray(int i) {
            return new KycSubmit[i];
        }
    }

    public KycSubmit() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ KycSubmit copy$default(KycSubmit kycSubmit, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycSubmit.id;
        }
        if ((i & 2) != 0) {
            str = kycSubmit.info;
        }
        if ((i & 4) != 0) {
            str2 = kycSubmit.header;
        }
        if ((i & 8) != 0) {
            str3 = kycSubmit.highlightedPhrase;
        }
        return kycSubmit.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.info;
    }

    public final String component3() {
        return this.header;
    }

    public final String component4() {
        return this.highlightedPhrase;
    }

    public final KycSubmit copy(Integer num, String str, String str2, String str3) {
        return new KycSubmit(num, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycSubmit)) {
            return false;
        }
        KycSubmit kycSubmit = (KycSubmit) obj;
        return j.b(this.id, kycSubmit.id) && j.b(this.info, kycSubmit.info) && j.b(this.header, kycSubmit.header) && j.b(this.highlightedPhrase, kycSubmit.highlightedPhrase);
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getHighlightedPhrase() {
        return this.highlightedPhrase;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getInfo() {
        return this.info;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.info;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.header;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.highlightedPhrase;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.info;
        return a.p(AbstractC1213b.O(num, "KycSubmit(id=", ", info=", str, ", header="), this.header, ", highlightedPhrase=", this.highlightedPhrase, ")");
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
        dest.writeString(this.info);
        dest.writeString(this.header);
        dest.writeString(this.highlightedPhrase);
    }

    public KycSubmit(Integer num, String str, String str2, String str3) {
        this.id = num;
        this.info = str;
        this.header = str2;
        this.highlightedPhrase = str3;
    }

    public /* synthetic */ KycSubmit(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
