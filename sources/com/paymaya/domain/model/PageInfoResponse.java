package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PageInfoResponse implements Parcelable {
    public static final Parcelable.Creator<PageInfoResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("number")
    private final int number;

    @InterfaceC1497a
    @InterfaceC1498b("size")
    private final int size;

    @InterfaceC1497a
    @InterfaceC1498b("totalElements")
    private final int totalElements;

    @InterfaceC1497a
    @InterfaceC1498b("totalPages")
    private final int totalPages;

    public static final class Creator implements Parcelable.Creator<PageInfoResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PageInfoResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PageInfoResponse(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PageInfoResponse[] newArray(int i) {
            return new PageInfoResponse[i];
        }
    }

    public PageInfoResponse() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ PageInfoResponse copy$default(PageInfoResponse pageInfoResponse, int i, int i4, int i6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = pageInfoResponse.size;
        }
        if ((i11 & 2) != 0) {
            i4 = pageInfoResponse.totalElements;
        }
        if ((i11 & 4) != 0) {
            i6 = pageInfoResponse.totalPages;
        }
        if ((i11 & 8) != 0) {
            i10 = pageInfoResponse.number;
        }
        return pageInfoResponse.copy(i, i4, i6, i10);
    }

    public final int component1() {
        return this.size;
    }

    public final int component2() {
        return this.totalElements;
    }

    public final int component3() {
        return this.totalPages;
    }

    public final int component4() {
        return this.number;
    }

    public final PageInfoResponse copy(int i, int i4, int i6, int i10) {
        return new PageInfoResponse(i, i4, i6, i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageInfoResponse)) {
            return false;
        }
        PageInfoResponse pageInfoResponse = (PageInfoResponse) obj;
        return this.size == pageInfoResponse.size && this.totalElements == pageInfoResponse.totalElements && this.totalPages == pageInfoResponse.totalPages && this.number == pageInfoResponse.number;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getTotalElements() {
        return this.totalElements;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        return (((((this.size * 31) + this.totalElements) * 31) + this.totalPages) * 31) + this.number;
    }

    public String toString() {
        int i = this.size;
        int i4 = this.totalElements;
        int i6 = this.totalPages;
        int i10 = this.number;
        StringBuilder sbU = s.u("PageInfoResponse(size=", i, ", totalElements=", i4, ", totalPages=");
        sbU.append(i6);
        sbU.append(", number=");
        sbU.append(i10);
        sbU.append(")");
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.size);
        dest.writeInt(this.totalElements);
        dest.writeInt(this.totalPages);
        dest.writeInt(this.number);
    }

    public PageInfoResponse(int i, int i4, int i6, int i10) {
        this.size = i;
        this.totalElements = i4;
        this.totalPages = i6;
        this.number = i10;
    }

    public /* synthetic */ PageInfoResponse(int i, int i4, int i6, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? 0 : i4, (i11 & 4) != 0 ? 0 : i6, (i11 & 8) != 0 ? 0 : i10);
    }
}
