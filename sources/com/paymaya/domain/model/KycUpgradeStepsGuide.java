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
public final class KycUpgradeStepsGuide implements Parcelable {
    public static final Parcelable.Creator<KycUpgradeStepsGuide> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("images")
    private final List<KycUpgradeStepImage> images;

    public static final class Creator implements Parcelable.Creator<KycUpgradeStepsGuide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUpgradeStepsGuide createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(KycUpgradeStepImage.CREATOR, parcel, arrayList, I4, 1);
            }
            return new KycUpgradeStepsGuide(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycUpgradeStepsGuide[] newArray(int i) {
            return new KycUpgradeStepsGuide[i];
        }
    }

    public KycUpgradeStepsGuide() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycUpgradeStepsGuide copy$default(KycUpgradeStepsGuide kycUpgradeStepsGuide, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kycUpgradeStepsGuide.images;
        }
        return kycUpgradeStepsGuide.copy(list);
    }

    public final List<KycUpgradeStepImage> component1() {
        return this.images;
    }

    public final KycUpgradeStepsGuide copy(List<KycUpgradeStepImage> images) {
        j.g(images, "images");
        return new KycUpgradeStepsGuide(images);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycUpgradeStepsGuide) && j.b(this.images, ((KycUpgradeStepsGuide) obj).images);
    }

    public final List<KycUpgradeStepImage> getImages() {
        return this.images;
    }

    public int hashCode() {
        return this.images.hashCode();
    }

    public String toString() {
        return "KycUpgradeStepsGuide(images=" + this.images + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Iterator itQ = AbstractC1213b.Q(this.images, dest);
        while (itQ.hasNext()) {
            ((KycUpgradeStepImage) itQ.next()).writeToParcel(dest, i);
        }
    }

    public KycUpgradeStepsGuide(List<KycUpgradeStepImage> images) {
        j.g(images, "images");
        this.images = images;
    }

    public KycUpgradeStepsGuide(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1112C.f9377a : list);
    }
}
