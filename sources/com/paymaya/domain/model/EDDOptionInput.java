package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDOptionInput implements Parcelable {
    public static final Parcelable.Creator<EDDOptionInput> CREATOR = new Creator();
    private final String input;
    private final String othersInput;

    public static final class Creator implements Parcelable.Creator<EDDOptionInput> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EDDOptionInput createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new EDDOptionInput(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EDDOptionInput[] newArray(int i) {
            return new EDDOptionInput[i];
        }
    }

    public EDDOptionInput(String str, String str2) {
        this.input = str;
        this.othersInput = str2;
    }

    public static /* synthetic */ EDDOptionInput copy$default(EDDOptionInput eDDOptionInput, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eDDOptionInput.input;
        }
        if ((i & 2) != 0) {
            str2 = eDDOptionInput.othersInput;
        }
        return eDDOptionInput.copy(str, str2);
    }

    public final String component1() {
        return this.input;
    }

    public final String component2() {
        return this.othersInput;
    }

    public final EDDOptionInput copy(String str, String str2) {
        return new EDDOptionInput(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDDOptionInput)) {
            return false;
        }
        EDDOptionInput eDDOptionInput = (EDDOptionInput) obj;
        return j.b(this.input, eDDOptionInput.input) && j.b(this.othersInput, eDDOptionInput.othersInput);
    }

    public final String getInput() {
        return this.input;
    }

    public final String getOthersInput() {
        return this.othersInput;
    }

    public int hashCode() {
        String str = this.input;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.othersInput;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("EDDOptionInput(input=", this.input, ", othersInput=", this.othersInput, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.input);
        dest.writeString(this.othersInput);
    }
}
