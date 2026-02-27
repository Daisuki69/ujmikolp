package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import defpackage.AbstractC1414e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DataPrivacyProvision implements Parcelable {
    public static final String ID_SAVINGS = "SAVINGS";
    public static final String ID_WALLET = "WALLET";
    private final int bgColor;
    private final String description;
    private final int icon;
    private final String id;
    private boolean isChecked;
    private final boolean isEditable;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DataPrivacyProvision> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<DataPrivacyProvision> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataPrivacyProvision createFromParcel(Parcel parcel) {
            boolean z4;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i4 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z5 = false;
            if (parcel.readInt() != 0) {
                z4 = false;
                z5 = true;
            } else {
                z4 = false;
            }
            return new DataPrivacyProvision(string, i, i4, string2, string3, z5, parcel.readInt() == 0 ? z4 : true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataPrivacyProvision[] newArray(int i) {
            return new DataPrivacyProvision[i];
        }
    }

    public DataPrivacyProvision(String id, int i, int i4, String name, String description, boolean z4, boolean z5) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(description, "description");
        this.id = id;
        this.icon = i;
        this.bgColor = i4;
        this.name = name;
        this.description = description;
        this.isEditable = z4;
        this.isChecked = z5;
    }

    public static /* synthetic */ DataPrivacyProvision copy$default(DataPrivacyProvision dataPrivacyProvision, String str, int i, int i4, String str2, String str3, boolean z4, boolean z5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = dataPrivacyProvision.id;
        }
        if ((i6 & 2) != 0) {
            i = dataPrivacyProvision.icon;
        }
        if ((i6 & 4) != 0) {
            i4 = dataPrivacyProvision.bgColor;
        }
        if ((i6 & 8) != 0) {
            str2 = dataPrivacyProvision.name;
        }
        if ((i6 & 16) != 0) {
            str3 = dataPrivacyProvision.description;
        }
        if ((i6 & 32) != 0) {
            z4 = dataPrivacyProvision.isEditable;
        }
        if ((i6 & 64) != 0) {
            z5 = dataPrivacyProvision.isChecked;
        }
        boolean z8 = z4;
        boolean z9 = z5;
        String str4 = str3;
        int i10 = i4;
        return dataPrivacyProvision.copy(str, i, i10, str2, str4, z8, z9);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.icon;
    }

    public final int component3() {
        return this.bgColor;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.description;
    }

    public final boolean component6() {
        return this.isEditable;
    }

    public final boolean component7() {
        return this.isChecked;
    }

    public final DataPrivacyProvision copy(String id, int i, int i4, String name, String description, boolean z4, boolean z5) {
        j.g(id, "id");
        j.g(name, "name");
        j.g(description, "description");
        return new DataPrivacyProvision(id, i, i4, name, description, z4, z5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPrivacyProvision)) {
            return false;
        }
        DataPrivacyProvision dataPrivacyProvision = (DataPrivacyProvision) obj;
        return j.b(this.id, dataPrivacyProvision.id) && this.icon == dataPrivacyProvision.icon && this.bgColor == dataPrivacyProvision.bgColor && j.b(this.name, dataPrivacyProvision.name) && j.b(this.description, dataPrivacyProvision.description) && this.isEditable == dataPrivacyProvision.isEditable && this.isChecked == dataPrivacyProvision.isChecked;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getShouldShowTooltip() {
        return isSavings();
    }

    public final String getTooltipMessage() {
        boolean zIsSavings = isSavings();
        if (zIsSavings) {
            return "Earn up to 15% interest";
        }
        if (zIsSavings) {
            throw new NoWhenBranchMatchedException();
        }
        return "";
    }

    public int hashCode() {
        return ((AbstractC1414e.c(AbstractC1414e.c(((((this.id.hashCode() * 31) + this.icon) * 31) + this.bgColor) * 31, 31, this.name), 31, this.description) + (this.isEditable ? 1231 : 1237)) * 31) + (this.isChecked ? 1231 : 1237);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    public final boolean isSavings() {
        return j.b(this.id, ID_SAVINGS);
    }

    public final boolean isWallet() {
        return j.b(this.id, ID_WALLET);
    }

    public final void setChecked(boolean z4) {
        this.isChecked = z4;
    }

    public String toString() {
        String str = this.id;
        int i = this.icon;
        int i4 = this.bgColor;
        String str2 = this.name;
        String str3 = this.description;
        boolean z4 = this.isEditable;
        boolean z5 = this.isChecked;
        StringBuilder sbR = a.r(i, "DataPrivacyProvision(id=", str, ", icon=", ", bgColor=");
        sbR.append(i4);
        sbR.append(", name=");
        sbR.append(str2);
        sbR.append(", description=");
        sbR.append(str3);
        sbR.append(", isEditable=");
        sbR.append(z4);
        sbR.append(", isChecked=");
        return s.s(sbR, z5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.icon);
        dest.writeInt(this.bgColor);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeInt(this.isEditable ? 1 : 0);
        dest.writeInt(this.isChecked ? 1 : 0);
    }
}
