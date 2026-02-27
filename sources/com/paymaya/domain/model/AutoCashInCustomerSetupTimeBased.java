package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoCashInCustomerSetupTimeBased implements Parcelable {
    public static final Parcelable.Creator<AutoCashInCustomerSetupTimeBased> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(Constants.ENABLED)
    private final Boolean enabled;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    public static final class Creator implements Parcelable.Creator<AutoCashInCustomerSetupTimeBased> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoCashInCustomerSetupTimeBased createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            j.g(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoCashInCustomerSetupTimeBased(string, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoCashInCustomerSetupTimeBased[] newArray(int i) {
            return new AutoCashInCustomerSetupTimeBased[i];
        }
    }

    public AutoCashInCustomerSetupTimeBased(@Nullable String str, @Nullable Boolean bool) {
        this.id = str;
        this.enabled = bool;
    }

    public static /* synthetic */ AutoCashInCustomerSetupTimeBased copy$default(AutoCashInCustomerSetupTimeBased autoCashInCustomerSetupTimeBased, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoCashInCustomerSetupTimeBased.id;
        }
        if ((i & 2) != 0) {
            bool = autoCashInCustomerSetupTimeBased.enabled;
        }
        return autoCashInCustomerSetupTimeBased.copy(str, bool);
    }

    public final String component1() {
        return this.id;
    }

    public final Boolean component2() {
        return this.enabled;
    }

    public final AutoCashInCustomerSetupTimeBased copy(@Nullable String str, @Nullable Boolean bool) {
        return new AutoCashInCustomerSetupTimeBased(str, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCashInCustomerSetupTimeBased)) {
            return false;
        }
        AutoCashInCustomerSetupTimeBased autoCashInCustomerSetupTimeBased = (AutoCashInCustomerSetupTimeBased) obj;
        return j.b(this.id, autoCashInCustomerSetupTimeBased.id) && j.b(this.enabled, autoCashInCustomerSetupTimeBased.enabled);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enabled;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "AutoCashInCustomerSetupTimeBased(id=" + this.id + ", enabled=" + this.enabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        Boolean bool = this.enabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
    }
}
