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
public final class GenderId implements Parcelable {
    public static final Parcelable.Creator<GenderId> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    public static final class Creator implements Parcelable.Creator<GenderId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenderId createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new GenderId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenderId[] newArray(int i) {
            return new GenderId[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenderId() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GenderId copy$default(GenderId genderId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genderId.id;
        }
        return genderId.copy(str);
    }

    public final String component1() {
        return this.id;
    }

    public final GenderId copy(String str) {
        return new GenderId(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenderId) && j.b(this.id, ((GenderId) obj).id);
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
        return s.j("GenderId(id=", this.id, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
    }

    public GenderId(String str) {
        this.id = str;
    }

    public /* synthetic */ GenderId(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
