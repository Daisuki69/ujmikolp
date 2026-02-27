package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import cj.C1132s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class SavingsConsent implements Parcelable {
    public static final String TC_DEF_VERSION = "1.69";
    private static final String TYPE_DATA_PRIVACY = "Data Privacy";
    private static final String TYPE_TERMS_AND_CONDITIONS = "Terms and Conditions";
    private static final String VERSION_DATA_PRIVACY = "1.6";

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b("version")
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SavingsConsent> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<SavingsConsent> consents(String termsConditionsVersion) {
            j.g(termsConditionsVersion, "termsConditionsVersion");
            return C1132s.g(new SavingsConsent(SavingsConsent.TYPE_TERMS_AND_CONDITIONS, termsConditionsVersion), new SavingsConsent(SavingsConsent.TYPE_DATA_PRIVACY, SavingsConsent.VERSION_DATA_PRIVACY));
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<SavingsConsent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsConsent createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new SavingsConsent(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsConsent[] newArray(int i) {
            return new SavingsConsent[i];
        }
    }

    public SavingsConsent(String type, String version) {
        j.g(type, "type");
        j.g(version, "version");
        this.type = type;
        this.version = version;
    }

    public static /* synthetic */ SavingsConsent copy$default(SavingsConsent savingsConsent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsConsent.type;
        }
        if ((i & 2) != 0) {
            str2 = savingsConsent.version;
        }
        return savingsConsent.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.version;
    }

    public final SavingsConsent copy(String type, String version) {
        j.g(type, "type");
        j.g(version, "version");
        return new SavingsConsent(type, version);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsConsent)) {
            return false;
        }
        SavingsConsent savingsConsent = (SavingsConsent) obj;
        return j.b(this.type, savingsConsent.type) && j.b(this.version, savingsConsent.version);
    }

    public final String getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return s.l("SavingsConsent(type=", this.type, ", version=", this.version, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.version);
    }
}
