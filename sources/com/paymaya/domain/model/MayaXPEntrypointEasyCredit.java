package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaXPEntrypointEasyCredit implements Parcelable {
    public static final Parcelable.Creator<MayaXPEntrypointEasyCredit> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    private final int target;

    @InterfaceC1497a
    @InterfaceC1498b("visibility")
    private final boolean visibility;

    public static final class Creator implements Parcelable.Creator<MayaXPEntrypointEasyCredit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPEntrypointEasyCredit createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MayaXPEntrypointEasyCredit(parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MayaXPEntrypointEasyCredit[] newArray(int i) {
            return new MayaXPEntrypointEasyCredit[i];
        }
    }

    public MayaXPEntrypointEasyCredit(boolean z4, int i) {
        this.visibility = z4;
        this.target = i;
    }

    public static /* synthetic */ MayaXPEntrypointEasyCredit copy$default(MayaXPEntrypointEasyCredit mayaXPEntrypointEasyCredit, boolean z4, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = mayaXPEntrypointEasyCredit.visibility;
        }
        if ((i4 & 2) != 0) {
            i = mayaXPEntrypointEasyCredit.target;
        }
        return mayaXPEntrypointEasyCredit.copy(z4, i);
    }

    public final boolean component1() {
        return this.visibility;
    }

    public final int component2() {
        return this.target;
    }

    public final MayaXPEntrypointEasyCredit copy(boolean z4, int i) {
        return new MayaXPEntrypointEasyCredit(z4, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MayaXPEntrypointEasyCredit)) {
            return false;
        }
        MayaXPEntrypointEasyCredit mayaXPEntrypointEasyCredit = (MayaXPEntrypointEasyCredit) obj;
        return this.visibility == mayaXPEntrypointEasyCredit.visibility && this.target == mayaXPEntrypointEasyCredit.target;
    }

    public final int getTarget() {
        return this.target;
    }

    public final boolean getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        return ((this.visibility ? 1231 : 1237) * 31) + this.target;
    }

    public String toString() {
        return "MayaXPEntrypointEasyCredit(visibility=" + this.visibility + ", target=" + this.target + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.visibility ? 1 : 0);
        dest.writeInt(this.target);
    }
}
