package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ImagesContract;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycUpgradeStepImage implements Parcelable {
    public static final Parcelable.Creator<KycUpgradeStepImage> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("instruction")
    private final String instruction;

    @InterfaceC1497a
    @InterfaceC1498b(ImagesContract.URL)
    private final String url;

    public static final class Creator implements Parcelable.Creator<KycUpgradeStepImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUpgradeStepImage createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycUpgradeStepImage(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUpgradeStepImage[] newArray(int i) {
            return new KycUpgradeStepImage[i];
        }
    }

    public KycUpgradeStepImage() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ KycUpgradeStepImage copy$default(KycUpgradeStepImage kycUpgradeStepImage, int i, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycUpgradeStepImage.id;
        }
        if ((i4 & 2) != 0) {
            str = kycUpgradeStepImage.instruction;
        }
        if ((i4 & 4) != 0) {
            str2 = kycUpgradeStepImage.url;
        }
        return kycUpgradeStepImage.copy(i, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.instruction;
    }

    public final String component3() {
        return this.url;
    }

    public final KycUpgradeStepImage copy(int i, String str, String str2) {
        return new KycUpgradeStepImage(i, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycUpgradeStepImage)) {
            return false;
        }
        KycUpgradeStepImage kycUpgradeStepImage = (KycUpgradeStepImage) obj;
        return this.id == kycUpgradeStepImage.id && j.b(this.instruction, kycUpgradeStepImage.instruction) && j.b(this.url, kycUpgradeStepImage.url);
    }

    public final int getId() {
        return this.id;
    }

    public final String getInstruction() {
        return this.instruction;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i = this.id * 31;
        String str = this.instruction;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.id;
        String str = this.instruction;
        String str2 = this.url;
        StringBuilder sb2 = new StringBuilder("KycUpgradeStepImage(id=");
        sb2.append(i);
        sb2.append(", instruction=");
        sb2.append(str);
        sb2.append(", url=");
        return s.p(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.instruction);
        dest.writeString(this.url);
    }

    public KycUpgradeStepImage(int i, String str, String str2) {
        this.id = i;
        this.instruction = str;
        this.url = str2;
    }

    public /* synthetic */ KycUpgradeStepImage(int i, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2);
    }
}
