package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerAccountProductOffering implements Parcelable {
    public static final Parcelable.Creator<CustomerAccountProductOffering> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("code")
    private String code;

    @InterfaceC1497a
    @InterfaceC1498b("level")
    private String level;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.CLASS)
    private String offeringClass;

    @InterfaceC1497a
    @InterfaceC1498b("subtype")
    private String subType;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private String type;

    public static final class Creator implements Parcelable.Creator<CustomerAccountProductOffering> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccountProductOffering createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CustomerAccountProductOffering(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerAccountProductOffering[] newArray(int i) {
            return new CustomerAccountProductOffering[i];
        }
    }

    public CustomerAccountProductOffering(String type, String level, String subType, String code, String offeringClass) {
        j.g(type, "type");
        j.g(level, "level");
        j.g(subType, "subType");
        j.g(code, "code");
        j.g(offeringClass, "offeringClass");
        this.type = type;
        this.level = level;
        this.subType = subType;
        this.code = code;
        this.offeringClass = offeringClass;
    }

    public static /* synthetic */ CustomerAccountProductOffering copy$default(CustomerAccountProductOffering customerAccountProductOffering, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerAccountProductOffering.type;
        }
        if ((i & 2) != 0) {
            str2 = customerAccountProductOffering.level;
        }
        if ((i & 4) != 0) {
            str3 = customerAccountProductOffering.subType;
        }
        if ((i & 8) != 0) {
            str4 = customerAccountProductOffering.code;
        }
        if ((i & 16) != 0) {
            str5 = customerAccountProductOffering.offeringClass;
        }
        String str6 = str5;
        String str7 = str3;
        return customerAccountProductOffering.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.level;
    }

    public final String component3() {
        return this.subType;
    }

    public final String component4() {
        return this.code;
    }

    public final String component5() {
        return this.offeringClass;
    }

    public final CustomerAccountProductOffering copy(String type, String level, String subType, String code, String offeringClass) {
        j.g(type, "type");
        j.g(level, "level");
        j.g(subType, "subType");
        j.g(code, "code");
        j.g(offeringClass, "offeringClass");
        return new CustomerAccountProductOffering(type, level, subType, code, offeringClass);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerAccountProductOffering)) {
            return false;
        }
        CustomerAccountProductOffering customerAccountProductOffering = (CustomerAccountProductOffering) obj;
        return j.b(this.type, customerAccountProductOffering.type) && j.b(this.level, customerAccountProductOffering.level) && j.b(this.subType, customerAccountProductOffering.subType) && j.b(this.code, customerAccountProductOffering.code) && j.b(this.offeringClass, customerAccountProductOffering.offeringClass);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getOfferingClass() {
        return this.offeringClass;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.offeringClass.hashCode() + AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.type.hashCode() * 31, 31, this.level), 31, this.subType), 31, this.code);
    }

    public final void setCode(String str) {
        j.g(str, "<set-?>");
        this.code = str;
    }

    public final void setLevel(String str) {
        j.g(str, "<set-?>");
        this.level = str;
    }

    public final void setOfferingClass(String str) {
        j.g(str, "<set-?>");
        this.offeringClass = str;
    }

    public final void setSubType(String str) {
        j.g(str, "<set-?>");
        this.subType = str;
    }

    public final void setType(String str) {
        j.g(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.level;
        String str3 = this.subType;
        String str4 = this.code;
        String str5 = this.offeringClass;
        StringBuilder sbX = s.x("CustomerAccountProductOffering(type=", str, ", level=", str2, ", subType=");
        c.A(sbX, str3, ", code=", str4, ", offeringClass=");
        return s.p(sbX, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.level);
        dest.writeString(this.subType);
        dest.writeString(this.code);
        dest.writeString(this.offeringClass);
    }
}
