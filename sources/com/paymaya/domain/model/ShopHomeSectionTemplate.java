package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopHomeSectionTemplate implements Parcelable {
    public static final Parcelable.Creator<ShopHomeSectionTemplate> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("list_type")
    private String listType;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    @InterfaceC1497a
    @InterfaceC1498b("position")
    private int position;

    public static final class Creator implements Parcelable.Creator<ShopHomeSectionTemplate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeSectionTemplate createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShopHomeSectionTemplate(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopHomeSectionTemplate[] newArray(int i) {
            return new ShopHomeSectionTemplate[i];
        }
    }

    public ShopHomeSectionTemplate(String name, String listType, int i) {
        j.g(name, "name");
        j.g(listType, "listType");
        this.name = name;
        this.listType = listType;
        this.position = i;
    }

    public static /* synthetic */ ShopHomeSectionTemplate copy$default(ShopHomeSectionTemplate shopHomeSectionTemplate, String str, String str2, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = shopHomeSectionTemplate.name;
        }
        if ((i4 & 2) != 0) {
            str2 = shopHomeSectionTemplate.listType;
        }
        if ((i4 & 4) != 0) {
            i = shopHomeSectionTemplate.position;
        }
        return shopHomeSectionTemplate.copy(str, str2, i);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.listType;
    }

    public final int component3() {
        return this.position;
    }

    public final ShopHomeSectionTemplate copy(String name, String listType, int i) {
        j.g(name, "name");
        j.g(listType, "listType");
        return new ShopHomeSectionTemplate(name, listType, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopHomeSectionTemplate)) {
            return false;
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate = (ShopHomeSectionTemplate) obj;
        return j.b(this.name, shopHomeSectionTemplate.name) && j.b(this.listType, shopHomeSectionTemplate.listType) && this.position == shopHomeSectionTemplate.position;
    }

    public final String getListType() {
        return this.listType;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPosition() {
        return this.position;
    }

    public int hashCode() {
        return AbstractC1414e.c(this.name.hashCode() * 31, 31, this.listType) + this.position;
    }

    public final void setListType(String str) {
        j.g(str, "<set-?>");
        this.listType = str;
    }

    public final void setName(String str) {
        j.g(str, "<set-?>");
        this.name = str;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.listType;
        return s.o(s.x("ShopHomeSectionTemplate(name=", str, ", listType=", str2, ", position="), ")", this.position);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.listType);
        dest.writeInt(this.position);
    }
}
