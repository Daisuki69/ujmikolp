package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class Dosri implements Parcelable {
    public static final Parcelable.Creator<Dosri> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("isRequired")
    private final Boolean isRequired;

    public static final class Creator implements Parcelable.Creator<Dosri> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Dosri createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            j.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Dosri(boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Dosri[] newArray(int i) {
            return new Dosri[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dosri() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Dosri copy$default(Dosri dosri, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = dosri.isRequired;
        }
        return dosri.copy(bool);
    }

    public final Boolean component1() {
        return this.isRequired;
    }

    public final Dosri copy(Boolean bool) {
        return new Dosri(bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dosri) && j.b(this.isRequired, ((Dosri) obj).isRequired);
    }

    public int hashCode() {
        Boolean bool = this.isRequired;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        return "Dosri(isRequired=" + this.isRequired + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Boolean bool = this.isRequired;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
    }

    public Dosri(Boolean bool) {
        this.isRequired = bool;
    }

    public /* synthetic */ Dosri(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
