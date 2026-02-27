package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import cj.C1110A;
import cj.C1112C;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class KycUnlockEverythingDetails implements Parcelable {
    public static final Parcelable.Creator<KycUnlockEverythingDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("feature_icon_url")
    private final String featureIconUrl;

    @InterfaceC1497a
    @InterfaceC1498b("features")
    private final List<KycUnlockFeatureItem> features;

    public static final class Creator implements Parcelable.Creator<KycUnlockEverythingDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUnlockEverythingDetails createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(KycUnlockFeatureItem.CREATOR, parcel, arrayList, I4, 1);
            }
            return new KycUnlockEverythingDetails(arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUnlockEverythingDetails[] newArray(int i) {
            return new KycUnlockEverythingDetails[i];
        }
    }

    public KycUnlockEverythingDetails() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycUnlockEverythingDetails copy$default(KycUnlockEverythingDetails kycUnlockEverythingDetails, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kycUnlockEverythingDetails.features;
        }
        if ((i & 2) != 0) {
            str = kycUnlockEverythingDetails.featureIconUrl;
        }
        return kycUnlockEverythingDetails.copy(list, str);
    }

    public final List<KycUnlockFeatureItem> component1() {
        return this.features;
    }

    public final String component2() {
        return this.featureIconUrl;
    }

    public final KycUnlockEverythingDetails copy(List<KycUnlockFeatureItem> features, String str) {
        j.g(features, "features");
        return new KycUnlockEverythingDetails(features, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycUnlockEverythingDetails)) {
            return false;
        }
        KycUnlockEverythingDetails kycUnlockEverythingDetails = (KycUnlockEverythingDetails) obj;
        return j.b(this.features, kycUnlockEverythingDetails.features) && j.b(this.featureIconUrl, kycUnlockEverythingDetails.featureIconUrl);
    }

    public final String getFeatureIconUrl() {
        return this.featureIconUrl;
    }

    public final List<KycUnlockFeatureItem> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        int iHashCode = this.features.hashCode() * 31;
        String str = this.featureIconUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String instructions() {
        List<KycUnlockFeatureItem> list = this.features;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String instruction = ((KycUnlockFeatureItem) it.next()).getInstruction();
            if (instruction == null || C2576A.H(instruction)) {
                instruction = null;
            }
            if (instruction != null) {
                arrayList.add(instruction);
            }
        }
        return C1110A.F(arrayList, Global.NEWLINE, null, null, null, 62);
    }

    public String toString() {
        return "KycUnlockEverythingDetails(features=" + this.features + ", featureIconUrl=" + this.featureIconUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Iterator itQ = AbstractC1213b.Q(this.features, dest);
        while (itQ.hasNext()) {
            ((KycUnlockFeatureItem) itQ.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.featureIconUrl);
    }

    public KycUnlockEverythingDetails(List<KycUnlockFeatureItem> features, String str) {
        j.g(features, "features");
        this.features = features;
        this.featureIconUrl = str;
    }

    public KycUnlockEverythingDetails(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1112C.f9377a : list, (i & 2) != 0 ? null : str);
    }
}
