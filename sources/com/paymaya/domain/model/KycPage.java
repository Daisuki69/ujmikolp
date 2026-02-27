package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycPage implements Parcelable {
    public static final Parcelable.Creator<KycPage> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("page")
    private final String page;

    public static final class Creator implements Parcelable.Creator<KycPage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycPage createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycPage(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycPage[] newArray(int i) {
            return new KycPage[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KycPage() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycPage copy$default(KycPage kycPage, int i, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycPage.id;
        }
        if ((i4 & 2) != 0) {
            str = kycPage.page;
        }
        return kycPage.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.page;
    }

    public final KycPage copy(int i, String page) {
        j.g(page, "page");
        return new KycPage(i, page);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycPage)) {
            return false;
        }
        KycPage kycPage = (KycPage) obj;
        return this.id == kycPage.id && j.b(this.page, kycPage.page);
    }

    public final int getId() {
        return this.id;
    }

    public final String getPage() {
        return this.page;
    }

    public int hashCode() {
        return this.page.hashCode() + (this.id * 31);
    }

    public String toString() {
        return "KycPage(id=" + this.id + ", page=" + this.page + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.page);
    }

    public KycPage(int i, String page) {
        j.g(page, "page");
        this.id = i;
        this.page = page;
    }

    public /* synthetic */ KycPage(int i, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str);
    }
}
