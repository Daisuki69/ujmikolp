package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PersonalizationGiphy implements Personalization, Parcelable {
    public static final Parcelable.Creator<PersonalizationGiphy> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("gif_id")
    private final String gifId;

    public static final class Creator implements Parcelable.Creator<PersonalizationGiphy> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalizationGiphy createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PersonalizationGiphy(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalizationGiphy[] newArray(int i) {
            return new PersonalizationGiphy[i];
        }
    }

    public PersonalizationGiphy(String str) {
        this.gifId = str;
    }

    public static /* synthetic */ PersonalizationGiphy copy$default(PersonalizationGiphy personalizationGiphy, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalizationGiphy.gifId;
        }
        return personalizationGiphy.copy(str);
    }

    public final String component1() {
        return this.gifId;
    }

    public final PersonalizationGiphy copy(String str) {
        return new PersonalizationGiphy(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalizationGiphy) && j.b(this.gifId, ((PersonalizationGiphy) obj).gifId);
    }

    public final String getGifId() {
        return this.gifId;
    }

    @Override // com.paymaya.domain.model.Personalization
    public String getId() {
        return this.gifId;
    }

    public int hashCode() {
        String str = this.gifId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("PersonalizationGiphy(gifId=", this.gifId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.gifId);
    }
}
