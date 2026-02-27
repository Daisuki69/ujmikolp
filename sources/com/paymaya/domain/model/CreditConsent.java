package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditConsent implements Parcelable {
    public static final Parcelable.Creator<CreditConsent> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("major_version")
    private final String majorVersion;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final String value;

    @InterfaceC1497a
    @InterfaceC1498b("version")
    private final String version;

    public static final class Creator implements Parcelable.Creator<CreditConsent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditConsent createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditConsent(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditConsent[] newArray(int i) {
            return new CreditConsent[i];
        }
    }

    public CreditConsent(Integer num, String type, String version, String str, String str2) {
        j.g(type, "type");
        j.g(version, "version");
        this.id = num;
        this.type = type;
        this.version = version;
        this.majorVersion = str;
        this.value = str2;
    }

    public static /* synthetic */ CreditConsent copy$default(CreditConsent creditConsent, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = creditConsent.id;
        }
        if ((i & 2) != 0) {
            str = creditConsent.type;
        }
        if ((i & 4) != 0) {
            str2 = creditConsent.version;
        }
        if ((i & 8) != 0) {
            str3 = creditConsent.majorVersion;
        }
        if ((i & 16) != 0) {
            str4 = creditConsent.value;
        }
        String str5 = str4;
        String str6 = str2;
        return creditConsent.copy(num, str, str6, str3, str5);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.version;
    }

    public final String component4() {
        return this.majorVersion;
    }

    public final String component5() {
        return this.value;
    }

    public final CreditConsent copy(Integer num, String type, String version, String str, String str2) {
        j.g(type, "type");
        j.g(version, "version");
        return new CreditConsent(num, type, version, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditConsent)) {
            return false;
        }
        CreditConsent creditConsent = (CreditConsent) obj;
        return j.b(this.id, creditConsent.id) && j.b(this.type, creditConsent.type) && j.b(this.version, creditConsent.version) && j.b(this.majorVersion, creditConsent.majorVersion) && j.b(this.value, creditConsent.value);
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getMajorVersion() {
        return this.majorVersion;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.id;
        int iC = AbstractC1414e.c(AbstractC1414e.c((num == null ? 0 : num.hashCode()) * 31, 31, this.type), 31, this.version);
        String str = this.majorVersion;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.type;
        String str2 = this.version;
        String str3 = this.majorVersion;
        String str4 = this.value;
        StringBuilder sbO = AbstractC1213b.O(num, "CreditConsent(id=", ", type=", str, ", version=");
        c.A(sbO, str2, ", majorVersion=", str3, ", value=");
        return s.p(sbO, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeString(this.type);
        dest.writeString(this.version);
        dest.writeString(this.majorVersion);
        dest.writeString(this.value);
    }
}
