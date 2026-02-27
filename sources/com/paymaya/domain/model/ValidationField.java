package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ValidationField implements Parcelable {
    public static final Parcelable.Creator<ValidationField> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public static final class Creator implements Parcelable.Creator<ValidationField> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidationField createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ValidationField(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidationField[] newArray(int i) {
            return new ValidationField[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationField() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ValidationField copy$default(ValidationField validationField, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validationField.name;
        }
        return validationField.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final ValidationField copy(String str) {
        return new ValidationField(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidationField) && j.b(this.name, ((ValidationField) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("ValidationField(name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
    }

    public ValidationField(String str) {
        this.name = str;
    }

    public /* synthetic */ ValidationField(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
