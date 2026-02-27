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
public final class KycOtherDocuments implements Parcelable {
    public static final Parcelable.Creator<KycOtherDocuments> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b("fileUrl")
    private final String fileUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    public static final class Creator implements Parcelable.Creator<KycOtherDocuments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycOtherDocuments createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycOtherDocuments(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycOtherDocuments[] newArray(int i) {
            return new KycOtherDocuments[i];
        }
    }

    public KycOtherDocuments() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ KycOtherDocuments copy$default(KycOtherDocuments kycOtherDocuments, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycOtherDocuments.id;
        }
        if ((i & 2) != 0) {
            str = kycOtherDocuments.key;
        }
        if ((i & 4) != 0) {
            str2 = kycOtherDocuments.description;
        }
        if ((i & 8) != 0) {
            str3 = kycOtherDocuments.fileUrl;
        }
        return kycOtherDocuments.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.fileUrl;
    }

    public final KycOtherDocuments copy(Integer num, String str, String str2, String str3) {
        return new KycOtherDocuments(num, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycOtherDocuments)) {
            return false;
        }
        KycOtherDocuments kycOtherDocuments = (KycOtherDocuments) obj;
        return j.b(this.id, kycOtherDocuments.id) && j.b(this.key, kycOtherDocuments.key) && j.b(this.description, kycOtherDocuments.description) && j.b(this.fileUrl, kycOtherDocuments.fileUrl);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.key;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.key;
        return a.p(AbstractC1213b.O(num, "KycOtherDocuments(id=", ", key=", str, ", description="), this.description, ", fileUrl=", this.fileUrl, ")");
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
        dest.writeString(this.key);
        dest.writeString(this.description);
        dest.writeString(this.fileUrl);
    }

    public KycOtherDocuments(Integer num, String str, String str2, String str3) {
        this.id = num;
        this.key = str;
        this.description = str2;
        this.fileUrl = str3;
    }

    public /* synthetic */ KycOtherDocuments(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
