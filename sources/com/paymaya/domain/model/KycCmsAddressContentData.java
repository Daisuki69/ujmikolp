package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class KycCmsAddressContentData implements Parcelable {
    public static final Parcelable.Creator<KycCmsAddressContentData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final List<KycCmsAddressProvince> data;

    public static final class Creator implements Parcelable.Creator<KycCmsAddressContentData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsAddressContentData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(KycCmsAddressProvince.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new KycCmsAddressContentData(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsAddressContentData[] newArray(int i) {
            return new KycCmsAddressContentData[i];
        }
    }

    public KycCmsAddressContentData() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycCmsAddressContentData copy$default(KycCmsAddressContentData kycCmsAddressContentData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kycCmsAddressContentData.data;
        }
        return kycCmsAddressContentData.copy(list);
    }

    public final List<KycCmsAddressProvince> component1() {
        return this.data;
    }

    public final KycCmsAddressContentData copy(List<KycCmsAddressProvince> list) {
        return new KycCmsAddressContentData(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycCmsAddressContentData) && j.b(this.data, ((KycCmsAddressContentData) obj).data);
    }

    public final List<KycCmsAddressProvince> getData() {
        return this.data;
    }

    public int hashCode() {
        List<KycCmsAddressProvince> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "KycCmsAddressContentData(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<KycCmsAddressProvince> list = this.data;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((KycCmsAddressProvince) itP.next()).writeToParcel(dest, i);
        }
    }

    public KycCmsAddressContentData(List<KycCmsAddressProvince> list) {
        this.data = list;
    }

    public KycCmsAddressContentData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1112C.f9377a : list);
    }
}
