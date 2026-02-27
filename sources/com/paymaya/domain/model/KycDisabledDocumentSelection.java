package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycDisabledDocumentSelection implements Parcelable {
    public static final Parcelable.Creator<KycDisabledDocumentSelection> CREATOR = new Creator();
    private final String description;
    private final int disabledColor;

    public static final class Creator implements Parcelable.Creator<KycDisabledDocumentSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDisabledDocumentSelection createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycDisabledDocumentSelection(parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDisabledDocumentSelection[] newArray(int i) {
            return new KycDisabledDocumentSelection[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycDisabledDocumentSelection() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycDisabledDocumentSelection copy$default(KycDisabledDocumentSelection kycDisabledDocumentSelection, String str, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = kycDisabledDocumentSelection.description;
        }
        if ((i4 & 2) != 0) {
            i = kycDisabledDocumentSelection.disabledColor;
        }
        return kycDisabledDocumentSelection.copy(str, i);
    }

    public final String component1() {
        return this.description;
    }

    public final int component2() {
        return this.disabledColor;
    }

    public final KycDisabledDocumentSelection copy(String str, int i) {
        return new KycDisabledDocumentSelection(str, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDisabledDocumentSelection)) {
            return false;
        }
        KycDisabledDocumentSelection kycDisabledDocumentSelection = (KycDisabledDocumentSelection) obj;
        return j.b(this.description, kycDisabledDocumentSelection.description) && this.disabledColor == kycDisabledDocumentSelection.disabledColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDisabledColor() {
        return this.disabledColor;
    }

    public int hashCode() {
        String str = this.description;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.disabledColor;
    }

    public String toString() {
        return a.d(this.disabledColor, "KycDisabledDocumentSelection(description=", this.description, ", disabledColor=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.description);
        dest.writeInt(this.disabledColor);
    }

    public KycDisabledDocumentSelection(String str, int i) {
        this.description = str;
        this.disabledColor = i;
    }

    public /* synthetic */ KycDisabledDocumentSelection(String str, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? -7829368 : i);
    }
}
