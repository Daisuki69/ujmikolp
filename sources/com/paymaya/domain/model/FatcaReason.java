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
public final class FatcaReason implements Parcelable {
    public static final Parcelable.Creator<FatcaReason> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    public static final class Creator implements Parcelable.Creator<FatcaReason> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FatcaReason createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new FatcaReason(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FatcaReason[] newArray(int i) {
            return new FatcaReason[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FatcaReason() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FatcaReason copy$default(FatcaReason fatcaReason, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = fatcaReason.id;
        }
        if ((i & 2) != 0) {
            str = fatcaReason.key;
        }
        return fatcaReason.copy(num, str);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.key;
    }

    public final FatcaReason copy(Integer num, String str) {
        return new FatcaReason(num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FatcaReason)) {
            return false;
        }
        FatcaReason fatcaReason = (FatcaReason) obj;
        return j.b(this.id, fatcaReason.id) && j.b(this.key, fatcaReason.key);
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
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "FatcaReason(id=" + this.id + ", key=" + this.key + ")";
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
    }

    public FatcaReason(Integer num, String str) {
        this.id = num;
        this.key = str;
    }

    public /* synthetic */ FatcaReason(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
