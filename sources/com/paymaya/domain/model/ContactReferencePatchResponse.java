package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactReferencePatchResponse implements Parcelable {
    public static final Parcelable.Creator<ContactReferencePatchResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("contactReference")
    private final ContactReferenceId contactReference;

    public static final class Creator implements Parcelable.Creator<ContactReferencePatchResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferencePatchResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ContactReferencePatchResponse(parcel.readInt() == 0 ? null : ContactReferenceId.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactReferencePatchResponse[] newArray(int i) {
            return new ContactReferencePatchResponse[i];
        }
    }

    public ContactReferencePatchResponse(ContactReferenceId contactReferenceId) {
        this.contactReference = contactReferenceId;
    }

    public static /* synthetic */ ContactReferencePatchResponse copy$default(ContactReferencePatchResponse contactReferencePatchResponse, ContactReferenceId contactReferenceId, int i, Object obj) {
        if ((i & 1) != 0) {
            contactReferenceId = contactReferencePatchResponse.contactReference;
        }
        return contactReferencePatchResponse.copy(contactReferenceId);
    }

    public final ContactReferenceId component1() {
        return this.contactReference;
    }

    public final ContactReferencePatchResponse copy(ContactReferenceId contactReferenceId) {
        return new ContactReferencePatchResponse(contactReferenceId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactReferencePatchResponse) && j.b(this.contactReference, ((ContactReferencePatchResponse) obj).contactReference);
    }

    public final ContactReferenceId getContactReference() {
        return this.contactReference;
    }

    public int hashCode() {
        ContactReferenceId contactReferenceId = this.contactReference;
        if (contactReferenceId == null) {
            return 0;
        }
        return contactReferenceId.hashCode();
    }

    public String toString() {
        return "ContactReferencePatchResponse(contactReference=" + this.contactReference + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        ContactReferenceId contactReferenceId = this.contactReference;
        if (contactReferenceId == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactReferenceId.writeToParcel(dest, i);
        }
    }
}
