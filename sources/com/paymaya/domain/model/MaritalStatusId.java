package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MaritalStatusId implements Parcelable {
    public static final Parcelable.Creator<MaritalStatusId> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    public static final class Creator implements Parcelable.Creator<MaritalStatusId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaritalStatusId createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MaritalStatusId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MaritalStatusId[] newArray(int i) {
            return new MaritalStatusId[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaritalStatusId() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MaritalStatusId copy$default(MaritalStatusId maritalStatusId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = maritalStatusId.id;
        }
        return maritalStatusId.copy(str);
    }

    public final String component1() {
        return this.id;
    }

    public final MaritalStatusId copy(String str) {
        return new MaritalStatusId(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaritalStatusId) && j.b(this.id, ((MaritalStatusId) obj).id);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("MaritalStatusId(id=", this.id, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
    }

    public MaritalStatusId(String str) {
        this.id = str;
    }

    public /* synthetic */ MaritalStatusId(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
