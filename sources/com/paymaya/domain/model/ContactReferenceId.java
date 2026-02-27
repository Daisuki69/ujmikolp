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
public final class ContactReferenceId implements Parcelable {
    public static final Parcelable.Creator<ContactReferenceId> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    public static final class Creator implements Parcelable.Creator<ContactReferenceId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceId createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ContactReferenceId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferenceId[] newArray(int i) {
            return new ContactReferenceId[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactReferenceId() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContactReferenceId copy$default(ContactReferenceId contactReferenceId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactReferenceId.id;
        }
        return contactReferenceId.copy(str);
    }

    public final String component1() {
        return this.id;
    }

    public final ContactReferenceId copy(String str) {
        return new ContactReferenceId(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactReferenceId) && j.b(this.id, ((ContactReferenceId) obj).id);
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
        return s.j("ContactReferenceId(id=", this.id, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
    }

    public ContactReferenceId(String str) {
        this.id = str;
    }

    public /* synthetic */ ContactReferenceId(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
