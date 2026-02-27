package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaChoicesStringItem implements MayaChoicesAdapterItem {
    public static final Parcelable.Creator<MayaChoicesStringItem> CREATOR = new Creator();
    private final String itemAsString;
    private final int viewType;

    public static final class Creator implements Parcelable.Creator<MayaChoicesStringItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaChoicesStringItem createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MayaChoicesStringItem(parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaChoicesStringItem[] newArray(int i) {
            return new MayaChoicesStringItem[i];
        }
    }

    public MayaChoicesStringItem(String itemAsString, int i) {
        j.g(itemAsString, "itemAsString");
        this.itemAsString = itemAsString;
        this.viewType = i;
    }

    public static /* synthetic */ MayaChoicesStringItem copy$default(MayaChoicesStringItem mayaChoicesStringItem, String str, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = mayaChoicesStringItem.itemAsString;
        }
        if ((i4 & 2) != 0) {
            i = mayaChoicesStringItem.viewType;
        }
        return mayaChoicesStringItem.copy(str, i);
    }

    public final String component1() {
        return this.itemAsString;
    }

    public final int component2() {
        return this.viewType;
    }

    public final MayaChoicesStringItem copy(String itemAsString, int i) {
        j.g(itemAsString, "itemAsString");
        return new MayaChoicesStringItem(itemAsString, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MayaChoicesStringItem)) {
            return false;
        }
        MayaChoicesStringItem mayaChoicesStringItem = (MayaChoicesStringItem) obj;
        return j.b(this.itemAsString, mayaChoicesStringItem.itemAsString) && this.viewType == mayaChoicesStringItem.viewType;
    }

    @Override // com.paymaya.domain.model.MayaChoicesAdapterItem
    public String getItemAsString() {
        return this.itemAsString;
    }

    @Override // com.paymaya.domain.model.MayaChoicesAdapterItem
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return (this.itemAsString.hashCode() * 31) + this.viewType;
    }

    public String toString() {
        return a.d(this.viewType, "MayaChoicesStringItem(itemAsString=", this.itemAsString, ", viewType=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.itemAsString);
        dest.writeInt(this.viewType);
    }

    public /* synthetic */ MayaChoicesStringItem(String str, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? 1 : i);
    }
}
