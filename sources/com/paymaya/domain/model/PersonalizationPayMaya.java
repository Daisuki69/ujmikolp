package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PersonalizationPayMaya implements Personalization, Parcelable {
    public static final Parcelable.Creator<PersonalizationPayMaya> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String decorationId;

    public static final class Creator implements Parcelable.Creator<PersonalizationPayMaya> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalizationPayMaya createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PersonalizationPayMaya(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalizationPayMaya[] newArray(int i) {
            return new PersonalizationPayMaya[i];
        }
    }

    public PersonalizationPayMaya(String str) {
        this.decorationId = str;
    }

    public static /* synthetic */ PersonalizationPayMaya copy$default(PersonalizationPayMaya personalizationPayMaya, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalizationPayMaya.decorationId;
        }
        return personalizationPayMaya.copy(str);
    }

    public final String component1() {
        return this.decorationId;
    }

    public final PersonalizationPayMaya copy(String str) {
        return new PersonalizationPayMaya(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalizationPayMaya) && j.b(this.decorationId, ((PersonalizationPayMaya) obj).decorationId);
    }

    public final String getDecorationId() {
        return this.decorationId;
    }

    @Override // com.paymaya.domain.model.Personalization
    public String getId() {
        return this.decorationId;
    }

    public int hashCode() {
        String str = this.decorationId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("PersonalizationPayMaya(decorationId=", this.decorationId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.decorationId);
    }
}
