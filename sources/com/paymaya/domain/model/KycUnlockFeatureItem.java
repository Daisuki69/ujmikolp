package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycUnlockFeatureItem implements Parcelable {
    public static final Parcelable.Creator<KycUnlockFeatureItem> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("instruction")
    private final String instruction;

    public static final class Creator implements Parcelable.Creator<KycUnlockFeatureItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUnlockFeatureItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycUnlockFeatureItem(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUnlockFeatureItem[] newArray(int i) {
            return new KycUnlockFeatureItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycUnlockFeatureItem() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycUnlockFeatureItem copy$default(KycUnlockFeatureItem kycUnlockFeatureItem, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycUnlockFeatureItem.id;
        }
        if ((i4 & 2) != 0) {
            str = kycUnlockFeatureItem.instruction;
        }
        return kycUnlockFeatureItem.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.instruction;
    }

    public final KycUnlockFeatureItem copy(int i, String str) {
        return new KycUnlockFeatureItem(i, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycUnlockFeatureItem)) {
            return false;
        }
        KycUnlockFeatureItem kycUnlockFeatureItem = (KycUnlockFeatureItem) obj;
        return this.id == kycUnlockFeatureItem.id && j.b(this.instruction, kycUnlockFeatureItem.instruction);
    }

    public final int getId() {
        return this.id;
    }

    public final String getInstruction() {
        return this.instruction;
    }

    public int hashCode() {
        int i = this.id * 31;
        String str = this.instruction;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "KycUnlockFeatureItem(id=" + this.id + ", instruction=" + this.instruction + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.instruction);
    }

    public KycUnlockFeatureItem(int i, String str) {
        this.id = i;
        this.instruction = str;
    }

    public /* synthetic */ KycUnlockFeatureItem(int i, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? null : str);
    }
}
