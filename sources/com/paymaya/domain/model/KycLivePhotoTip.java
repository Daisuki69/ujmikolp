package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycLivePhotoTip implements Parcelable {
    public static final Parcelable.Creator<KycLivePhotoTip> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String description;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    public static final class Creator implements Parcelable.Creator<KycLivePhotoTip> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycLivePhotoTip createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycLivePhotoTip(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycLivePhotoTip[] newArray(int i) {
            return new KycLivePhotoTip[i];
        }
    }

    public KycLivePhotoTip() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ KycLivePhotoTip copy$default(KycLivePhotoTip kycLivePhotoTip, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycLivePhotoTip.id;
        }
        if ((i & 2) != 0) {
            str = kycLivePhotoTip.key;
        }
        if ((i & 4) != 0) {
            str2 = kycLivePhotoTip.description;
        }
        return kycLivePhotoTip.copy(num, str, str2);
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

    public final KycLivePhotoTip copy(Integer num, String str, String str2) {
        return new KycLivePhotoTip(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycLivePhotoTip)) {
            return false;
        }
        KycLivePhotoTip kycLivePhotoTip = (KycLivePhotoTip) obj;
        return j.b(this.id, kycLivePhotoTip.id) && j.b(this.key, kycLivePhotoTip.key) && j.b(this.description, kycLivePhotoTip.description);
    }

    public final String getDescription() {
        return this.description;
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
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.key;
        return s.p(AbstractC1213b.O(num, "KycLivePhotoTip(id=", ", key=", str, ", description="), this.description, ")");
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
    }

    public KycLivePhotoTip(Integer num, String str, String str2) {
        this.id = num;
        this.key = str;
        this.description = str2;
    }

    public /* synthetic */ KycLivePhotoTip(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
