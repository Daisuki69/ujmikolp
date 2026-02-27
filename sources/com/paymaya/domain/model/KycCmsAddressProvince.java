package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycCmsAddressProvince implements Parcelable {
    public static final Parcelable.Creator<KycCmsAddressProvince> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("cities")
    private final List<KycCmsAddressCity> cities;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class Creator implements Parcelable.Creator<KycCmsAddressProvince> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsAddressProvince createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(KycCmsAddressCity.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new KycCmsAddressProvince(numValueOf, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycCmsAddressProvince[] newArray(int i) {
            return new KycCmsAddressProvince[i];
        }
    }

    public KycCmsAddressProvince() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycCmsAddressProvince copy$default(KycCmsAddressProvince kycCmsAddressProvince, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycCmsAddressProvince.id;
        }
        if ((i & 2) != 0) {
            str = kycCmsAddressProvince.name;
        }
        if ((i & 4) != 0) {
            list = kycCmsAddressProvince.cities;
        }
        return kycCmsAddressProvince.copy(num, str, list);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final List<KycCmsAddressCity> component3() {
        return this.cities;
    }

    public final KycCmsAddressProvince copy(Integer num, String str, List<KycCmsAddressCity> list) {
        return new KycCmsAddressProvince(num, str, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycCmsAddressProvince)) {
            return false;
        }
        KycCmsAddressProvince kycCmsAddressProvince = (KycCmsAddressProvince) obj;
        return j.b(this.id, kycCmsAddressProvince.id) && j.b(this.name, kycCmsAddressProvince.name) && j.b(this.cities, kycCmsAddressProvince.cities);
    }

    public final List<KycCmsAddressCity> getCities() {
        return this.cities;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<KycCmsAddressCity> list = this.cities;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.name;
        return s.r(AbstractC1213b.O(num, "KycCmsAddressProvince(id=", ", name=", str, ", cities="), this.cities, ")");
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
        dest.writeString(this.name);
        List<KycCmsAddressCity> list = this.cities;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((KycCmsAddressCity) itP.next()).writeToParcel(dest, i);
        }
    }

    public KycCmsAddressProvince(Integer num, String str, List<KycCmsAddressCity> list) {
        this.id = num;
        this.name = str;
        this.cities = list;
    }

    public KycCmsAddressProvince(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C1112C.f9377a : list);
    }
}
