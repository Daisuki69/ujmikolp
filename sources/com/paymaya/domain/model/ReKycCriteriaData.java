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
public final class ReKycCriteriaData implements Parcelable {
    public static final Parcelable.Creator<ReKycCriteriaData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("prompt_guides")
    private final List<ReKycCriteriaPromptGuide> promptGuides;

    public static final class Creator implements Parcelable.Creator<ReKycCriteriaData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int I4 = 0;
            while (I4 != i4) {
                I4 = AbstractC1213b.I(ReKycCriteriaPromptGuide.CREATOR, parcel, arrayList, I4, 1);
            }
            return new ReKycCriteriaData(i, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReKycCriteriaData[] newArray(int i) {
            return new ReKycCriteriaData[i];
        }
    }

    public ReKycCriteriaData(int i, List<ReKycCriteriaPromptGuide> promptGuides) {
        j.g(promptGuides, "promptGuides");
        this.id = i;
        this.promptGuides = promptGuides;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReKycCriteriaData copy$default(ReKycCriteriaData reKycCriteriaData, int i, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reKycCriteriaData.id;
        }
        if ((i4 & 2) != 0) {
            list = reKycCriteriaData.promptGuides;
        }
        return reKycCriteriaData.copy(i, list);
    }

    public final int component1() {
        return this.id;
    }

    public final List<ReKycCriteriaPromptGuide> component2() {
        return this.promptGuides;
    }

    public final ReKycCriteriaData copy(int i, List<ReKycCriteriaPromptGuide> promptGuides) {
        j.g(promptGuides, "promptGuides");
        return new ReKycCriteriaData(i, promptGuides);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReKycCriteriaData)) {
            return false;
        }
        ReKycCriteriaData reKycCriteriaData = (ReKycCriteriaData) obj;
        return this.id == reKycCriteriaData.id && j.b(this.promptGuides, reKycCriteriaData.promptGuides);
    }

    public final int getId() {
        return this.id;
    }

    public final List<ReKycCriteriaPromptGuide> getPromptGuides() {
        return this.promptGuides;
    }

    public int hashCode() {
        return this.promptGuides.hashCode() + (this.id * 31);
    }

    public String toString() {
        return "ReKycCriteriaData(id=" + this.id + ", promptGuides=" + this.promptGuides + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        Iterator itQ = AbstractC1213b.Q(this.promptGuides, dest);
        while (itQ.hasNext()) {
            ((ReKycCriteriaPromptGuide) itQ.next()).writeToParcel(dest, i);
        }
    }
}
