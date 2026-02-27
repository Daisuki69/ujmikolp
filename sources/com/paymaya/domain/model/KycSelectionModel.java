package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycSelectionModel implements Parcelable {
    public static final Parcelable.Creator<KycSelectionModel> CREATOR = new Creator();
    private final int headerTextRes;
    private final boolean isDnfbpFlowEnabled;
    private final List<KycSelectionItem> items;
    private final int selectedId;
    private final KycFieldType type;

    public static final class Creator implements Parcelable.Creator<KycSelectionModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSelectionModel createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            int i4 = parcel.readInt();
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            int I4 = 0;
            while (I4 != i6) {
                I4 = AbstractC1213b.I(KycSelectionItem.CREATOR, parcel, arrayList, I4, 1);
            }
            return new KycSelectionModel(i, i4, arrayList, KycFieldType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycSelectionModel[] newArray(int i) {
            return new KycSelectionModel[i];
        }
    }

    public KycSelectionModel(@StringRes int i, int i4, List<KycSelectionItem> items, KycFieldType type, boolean z4) {
        j.g(items, "items");
        j.g(type, "type");
        this.headerTextRes = i;
        this.selectedId = i4;
        this.items = items;
        this.type = type;
        this.isDnfbpFlowEnabled = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycSelectionModel copy$default(KycSelectionModel kycSelectionModel, int i, int i4, List list, KycFieldType kycFieldType, boolean z4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = kycSelectionModel.headerTextRes;
        }
        if ((i6 & 2) != 0) {
            i4 = kycSelectionModel.selectedId;
        }
        if ((i6 & 4) != 0) {
            list = kycSelectionModel.items;
        }
        if ((i6 & 8) != 0) {
            kycFieldType = kycSelectionModel.type;
        }
        if ((i6 & 16) != 0) {
            z4 = kycSelectionModel.isDnfbpFlowEnabled;
        }
        boolean z5 = z4;
        List list2 = list;
        return kycSelectionModel.copy(i, i4, list2, kycFieldType, z5);
    }

    public final int component1() {
        return this.headerTextRes;
    }

    public final int component2() {
        return this.selectedId;
    }

    public final List<KycSelectionItem> component3() {
        return this.items;
    }

    public final KycFieldType component4() {
        return this.type;
    }

    public final boolean component5() {
        return this.isDnfbpFlowEnabled;
    }

    public final KycSelectionModel copy(@StringRes int i, int i4, List<KycSelectionItem> items, KycFieldType type, boolean z4) {
        j.g(items, "items");
        j.g(type, "type");
        return new KycSelectionModel(i, i4, items, type, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycSelectionModel)) {
            return false;
        }
        KycSelectionModel kycSelectionModel = (KycSelectionModel) obj;
        return this.headerTextRes == kycSelectionModel.headerTextRes && this.selectedId == kycSelectionModel.selectedId && j.b(this.items, kycSelectionModel.items) && this.type == kycSelectionModel.type && this.isDnfbpFlowEnabled == kycSelectionModel.isDnfbpFlowEnabled;
    }

    public final int getHeaderTextRes() {
        return this.headerTextRes;
    }

    public final List<KycSelectionItem> getItems() {
        return this.items;
    }

    public final int getSelectedId() {
        return this.selectedId;
    }

    public final KycFieldType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((this.type.hashCode() + AbstractC1414e.d(this.items, ((this.headerTextRes * 31) + this.selectedId) * 31, 31)) * 31) + (this.isDnfbpFlowEnabled ? 1231 : 1237);
    }

    public final boolean isDnfbpFlowEnabled() {
        return this.isDnfbpFlowEnabled;
    }

    public String toString() {
        int i = this.headerTextRes;
        int i4 = this.selectedId;
        List<KycSelectionItem> list = this.items;
        KycFieldType kycFieldType = this.type;
        boolean z4 = this.isDnfbpFlowEnabled;
        StringBuilder sbU = s.u("KycSelectionModel(headerTextRes=", i, ", selectedId=", i4, ", items=");
        sbU.append(list);
        sbU.append(", type=");
        sbU.append(kycFieldType);
        sbU.append(", isDnfbpFlowEnabled=");
        return s.s(sbU, z4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.headerTextRes);
        dest.writeInt(this.selectedId);
        Iterator itQ = AbstractC1213b.Q(this.items, dest);
        while (itQ.hasNext()) {
            ((KycSelectionItem) itQ.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.type.name());
        dest.writeInt(this.isDnfbpFlowEnabled ? 1 : 0);
    }

    public /* synthetic */ KycSelectionModel(int i, int i4, List list, KycFieldType kycFieldType, boolean z4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i4, list, kycFieldType, (i6 & 16) != 0 ? false : z4);
    }
}
