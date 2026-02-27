package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DosriGuides implements Parcelable {
    public static final Parcelable.Creator<DosriGuides> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.TAG_BODY)
    private final String body;

    @InterfaceC1497a
    @InterfaceC1498b("header")
    private final String header;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    public static final class Creator implements Parcelable.Creator<DosriGuides> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriGuides createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new DosriGuides(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DosriGuides[] newArray(int i) {
            return new DosriGuides[i];
        }
    }

    public DosriGuides() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DosriGuides copy$default(DosriGuides dosriGuides, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dosriGuides.body;
        }
        if ((i & 2) != 0) {
            str2 = dosriGuides.header;
        }
        if ((i & 4) != 0) {
            num = dosriGuides.id;
        }
        return dosriGuides.copy(str, str2, num);
    }

    public final String component1() {
        return this.body;
    }

    public final String component2() {
        return this.header;
    }

    public final Integer component3() {
        return this.id;
    }

    public final DosriGuides copy(String str, String str2, Integer num) {
        return new DosriGuides(str, str2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DosriGuides)) {
            return false;
        }
        DosriGuides dosriGuides = (DosriGuides) obj;
        return j.b(this.body, dosriGuides.body) && j.b(this.header, dosriGuides.header) && j.b(this.id, dosriGuides.id);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHeader() {
        return this.header;
    }

    public final Integer getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.body;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.header;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.id;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.body;
        String str2 = this.header;
        Integer num = this.id;
        StringBuilder sbX = s.x("DosriGuides(body=", str, ", header=", str2, ", id=");
        sbX.append(num);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.body);
        dest.writeString(this.header);
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
    }

    public DosriGuides(String str, String str2, Integer num) {
        this.body = str;
        this.header = str2;
        this.id = num;
    }

    public /* synthetic */ DosriGuides(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
