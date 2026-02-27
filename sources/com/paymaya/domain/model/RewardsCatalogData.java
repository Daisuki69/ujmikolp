package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalogData implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalogData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final List<RewardsCatalogProduct> data;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.TAG_METADATA)
    private final RewardsCatalogMetadata metadata;

    public static final class Creator implements Parcelable.Creator<RewardsCatalogData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(RewardsCatalogProduct.CREATOR, parcel, arrayList, I4, 1);
            }
            return new RewardsCatalogData(arrayList, parcel.readInt() == 0 ? null : RewardsCatalogMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogData[] newArray(int i) {
            return new RewardsCatalogData[i];
        }
    }

    public RewardsCatalogData(List<RewardsCatalogProduct> data, RewardsCatalogMetadata rewardsCatalogMetadata) {
        j.g(data, "data");
        this.data = data;
        this.metadata = rewardsCatalogMetadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardsCatalogData copy$default(RewardsCatalogData rewardsCatalogData, List list, RewardsCatalogMetadata rewardsCatalogMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rewardsCatalogData.data;
        }
        if ((i & 2) != 0) {
            rewardsCatalogMetadata = rewardsCatalogData.metadata;
        }
        return rewardsCatalogData.copy(list, rewardsCatalogMetadata);
    }

    public final List<RewardsCatalogProduct> component1() {
        return this.data;
    }

    public final RewardsCatalogMetadata component2() {
        return this.metadata;
    }

    public final RewardsCatalogData copy(List<RewardsCatalogProduct> data, RewardsCatalogMetadata rewardsCatalogMetadata) {
        j.g(data, "data");
        return new RewardsCatalogData(data, rewardsCatalogMetadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCatalogData)) {
            return false;
        }
        RewardsCatalogData rewardsCatalogData = (RewardsCatalogData) obj;
        return j.b(this.data, rewardsCatalogData.data) && j.b(this.metadata, rewardsCatalogData.metadata);
    }

    public final List<RewardsCatalogProduct> getData() {
        return this.data;
    }

    public final RewardsCatalogMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        RewardsCatalogMetadata rewardsCatalogMetadata = this.metadata;
        return iHashCode + (rewardsCatalogMetadata == null ? 0 : rewardsCatalogMetadata.hashCode());
    }

    public String toString() {
        return "RewardsCatalogData(data=" + this.data + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Iterator itQ = AbstractC1213b.Q(this.data, dest);
        while (itQ.hasNext()) {
            ((RewardsCatalogProduct) itQ.next()).writeToParcel(dest, i);
        }
        RewardsCatalogMetadata rewardsCatalogMetadata = this.metadata;
        if (rewardsCatalogMetadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsCatalogMetadata.writeToParcel(dest, i);
        }
    }
}
