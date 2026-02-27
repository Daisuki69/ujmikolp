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
public final class ContactReferenceLearnMore implements Parcelable {
    public static final Parcelable.Creator<ContactReferenceLearnMore> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.TAG_BODY)
    private final String body;

    @InterfaceC1497a
    @InterfaceC1498b("header")
    private final String header;

    public static final class Creator implements Parcelable.Creator<ContactReferenceLearnMore> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceLearnMore createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ContactReferenceLearnMore(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceLearnMore[] newArray(int i) {
            return new ContactReferenceLearnMore[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactReferenceLearnMore() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContactReferenceLearnMore copy$default(ContactReferenceLearnMore contactReferenceLearnMore, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactReferenceLearnMore.header;
        }
        if ((i & 2) != 0) {
            str2 = contactReferenceLearnMore.body;
        }
        return contactReferenceLearnMore.copy(str, str2);
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.body;
    }

    public final ContactReferenceLearnMore copy(String str, String str2) {
        return new ContactReferenceLearnMore(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactReferenceLearnMore)) {
            return false;
        }
        ContactReferenceLearnMore contactReferenceLearnMore = (ContactReferenceLearnMore) obj;
        return j.b(this.header, contactReferenceLearnMore.header) && j.b(this.body, contactReferenceLearnMore.body);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHeader() {
        return this.header;
    }

    public int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("ContactReferenceLearnMore(header=", this.header, ", body=", this.body, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.header);
        dest.writeString(this.body);
    }

    public ContactReferenceLearnMore(String str, String str2) {
        this.header = str;
        this.body = str2;
    }

    public /* synthetic */ ContactReferenceLearnMore(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
