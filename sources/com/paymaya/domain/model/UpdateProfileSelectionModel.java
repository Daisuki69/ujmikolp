package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdateProfileSelectionModel implements Parcelable {
    public static final Parcelable.Creator<UpdateProfileSelectionModel> CREATOR = new Creator();
    private final Integer headerTextRes;
    private final List<UpdateProfileSelectionItem> items;
    private final String selectedId;

    public static final class Creator implements Parcelable.Creator<UpdateProfileSelectionModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileSelectionModel createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int I4 = 0;
                while (I4 != i) {
                    I4 = AbstractC1213b.I(UpdateProfileSelectionItem.CREATOR, parcel, arrayList2, I4, 1);
                }
                arrayList = arrayList2;
            }
            return new UpdateProfileSelectionModel(numValueOf, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileSelectionModel[] newArray(int i) {
            return new UpdateProfileSelectionModel[i];
        }
    }

    public UpdateProfileSelectionModel() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateProfileSelectionModel copy$default(UpdateProfileSelectionModel updateProfileSelectionModel, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = updateProfileSelectionModel.headerTextRes;
        }
        if ((i & 2) != 0) {
            str = updateProfileSelectionModel.selectedId;
        }
        if ((i & 4) != 0) {
            list = updateProfileSelectionModel.items;
        }
        return updateProfileSelectionModel.copy(num, str, list);
    }

    public final Integer component1() {
        return this.headerTextRes;
    }

    public final String component2() {
        return this.selectedId;
    }

    public final List<UpdateProfileSelectionItem> component3() {
        return this.items;
    }

    public final UpdateProfileSelectionModel copy(@StringRes Integer num, String str, List<UpdateProfileSelectionItem> list) {
        return new UpdateProfileSelectionModel(num, str, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProfileSelectionModel)) {
            return false;
        }
        UpdateProfileSelectionModel updateProfileSelectionModel = (UpdateProfileSelectionModel) obj;
        return j.b(this.headerTextRes, updateProfileSelectionModel.headerTextRes) && j.b(this.selectedId, updateProfileSelectionModel.selectedId) && j.b(this.items, updateProfileSelectionModel.items);
    }

    public final Integer getHeaderTextRes() {
        return this.headerTextRes;
    }

    public final List<UpdateProfileSelectionItem> getItems() {
        return this.items;
    }

    public final String getSelectedId() {
        return this.selectedId;
    }

    public int hashCode() {
        Integer num = this.headerTextRes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.selectedId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UpdateProfileSelectionItem> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.headerTextRes;
        String str = this.selectedId;
        return s.r(AbstractC1213b.O(num, "UpdateProfileSelectionModel(headerTextRes=", ", selectedId=", str, ", items="), this.items, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.headerTextRes;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.selectedId);
        List<UpdateProfileSelectionItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itP = AbstractC1213b.P(dest, 1, list);
        while (itP.hasNext()) {
            ((UpdateProfileSelectionItem) itP.next()).writeToParcel(dest, i);
        }
    }

    public UpdateProfileSelectionModel(@StringRes Integer num, String str, List<UpdateProfileSelectionItem> list) {
        this.headerTextRes = num;
        this.selectedId = str;
        this.items = list;
    }

    public UpdateProfileSelectionModel(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? C1112C.f9377a : list);
    }
}
