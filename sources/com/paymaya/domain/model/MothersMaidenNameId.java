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
public final class MothersMaidenNameId implements Parcelable {
    public static final Parcelable.Creator<MothersMaidenNameId> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    public static final class Creator implements Parcelable.Creator<MothersMaidenNameId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MothersMaidenNameId createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MothersMaidenNameId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MothersMaidenNameId[] newArray(int i) {
            return new MothersMaidenNameId[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MothersMaidenNameId() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MothersMaidenNameId copy$default(MothersMaidenNameId mothersMaidenNameId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mothersMaidenNameId.id;
        }
        return mothersMaidenNameId.copy(str);
    }

    public final String component1() {
        return this.id;
    }

    public final MothersMaidenNameId copy(String str) {
        return new MothersMaidenNameId(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MothersMaidenNameId) && j.b(this.id, ((MothersMaidenNameId) obj).id);
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
        return s.j("MothersMaidenNameId(id=", this.id, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
    }

    public MothersMaidenNameId(String str) {
        this.id = str;
    }

    public /* synthetic */ MothersMaidenNameId(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
