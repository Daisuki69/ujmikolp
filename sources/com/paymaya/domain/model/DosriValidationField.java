package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DosriValidationField implements Parcelable {
    public static final Parcelable.Creator<DosriValidationField> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class Creator implements Parcelable.Creator<DosriValidationField> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriValidationField createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new DosriValidationField(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriValidationField[] newArray(int i) {
            return new DosriValidationField[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DosriValidationField() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DosriValidationField copy$default(DosriValidationField dosriValidationField, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dosriValidationField.id;
        }
        if ((i & 2) != 0) {
            str = dosriValidationField.name;
        }
        return dosriValidationField.copy(num, str);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final DosriValidationField copy(Integer num, String str) {
        return new DosriValidationField(num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DosriValidationField)) {
            return false;
        }
        DosriValidationField dosriValidationField = (DosriValidationField) obj;
        return j.b(this.id, dosriValidationField.id) && j.b(this.name, dosriValidationField.name);
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
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DosriValidationField(id=" + this.id + ", name=" + this.name + ")";
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
    }

    public DosriValidationField(Integer num, String str) {
        this.id = num;
        this.name = str;
    }

    public /* synthetic */ DosriValidationField(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
