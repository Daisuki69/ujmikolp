package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DecoratedActivity implements Parcelable {
    public static final Parcelable.Creator<DecoratedActivity> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("decoration")
    private final Decoration mDecoration;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String mId;

    @InterfaceC1497a
    @InterfaceC1498b("identifier_type")
    private final String mIdentifierType;

    @InterfaceC1497a
    @InterfaceC1498b("identifier_value")
    private final String mIdentifierValue;

    @InterfaceC1497a
    @InterfaceC1498b("meta")
    private final TransferPersonalizationMeta mMeta;

    @InterfaceC1497a
    @InterfaceC1498b("provider")
    private final String mProvider;

    public static final class Creator implements Parcelable.Creator<DecoratedActivity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DecoratedActivity createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new DecoratedActivity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Decoration.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? TransferPersonalizationMeta.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DecoratedActivity[] newArray(int i) {
            return new DecoratedActivity[i];
        }
    }

    public DecoratedActivity(String mId, String mIdentifierType, String mIdentifierValue, Decoration decoration, String str, TransferPersonalizationMeta transferPersonalizationMeta) {
        j.g(mId, "mId");
        j.g(mIdentifierType, "mIdentifierType");
        j.g(mIdentifierValue, "mIdentifierValue");
        this.mId = mId;
        this.mIdentifierType = mIdentifierType;
        this.mIdentifierValue = mIdentifierValue;
        this.mDecoration = decoration;
        this.mProvider = str;
        this.mMeta = transferPersonalizationMeta;
    }

    public static /* synthetic */ DecoratedActivity copy$default(DecoratedActivity decoratedActivity, String str, String str2, String str3, Decoration decoration, String str4, TransferPersonalizationMeta transferPersonalizationMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = decoratedActivity.mId;
        }
        if ((i & 2) != 0) {
            str2 = decoratedActivity.mIdentifierType;
        }
        if ((i & 4) != 0) {
            str3 = decoratedActivity.mIdentifierValue;
        }
        if ((i & 8) != 0) {
            decoration = decoratedActivity.mDecoration;
        }
        if ((i & 16) != 0) {
            str4 = decoratedActivity.mProvider;
        }
        if ((i & 32) != 0) {
            transferPersonalizationMeta = decoratedActivity.mMeta;
        }
        String str5 = str4;
        TransferPersonalizationMeta transferPersonalizationMeta2 = transferPersonalizationMeta;
        return decoratedActivity.copy(str, str2, str3, decoration, str5, transferPersonalizationMeta2);
    }

    public final String component1() {
        return this.mId;
    }

    public final String component2() {
        return this.mIdentifierType;
    }

    public final String component3() {
        return this.mIdentifierValue;
    }

    public final Decoration component4() {
        return this.mDecoration;
    }

    public final String component5() {
        return this.mProvider;
    }

    public final TransferPersonalizationMeta component6() {
        return this.mMeta;
    }

    public final DecoratedActivity copy(String mId, String mIdentifierType, String mIdentifierValue, Decoration decoration, String str, TransferPersonalizationMeta transferPersonalizationMeta) {
        j.g(mId, "mId");
        j.g(mIdentifierType, "mIdentifierType");
        j.g(mIdentifierValue, "mIdentifierValue");
        return new DecoratedActivity(mId, mIdentifierType, mIdentifierValue, decoration, str, transferPersonalizationMeta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecoratedActivity)) {
            return false;
        }
        DecoratedActivity decoratedActivity = (DecoratedActivity) obj;
        return j.b(this.mId, decoratedActivity.mId) && j.b(this.mIdentifierType, decoratedActivity.mIdentifierType) && j.b(this.mIdentifierValue, decoratedActivity.mIdentifierValue) && j.b(this.mDecoration, decoratedActivity.mDecoration) && j.b(this.mProvider, decoratedActivity.mProvider) && j.b(this.mMeta, decoratedActivity.mMeta);
    }

    public final Decoration getMDecoration() {
        return this.mDecoration;
    }

    public final String getMId() {
        return this.mId;
    }

    public final String getMIdentifierType() {
        return this.mIdentifierType;
    }

    public final String getMIdentifierValue() {
        return this.mIdentifierValue;
    }

    public final TransferPersonalizationMeta getMMeta() {
        return this.mMeta;
    }

    public final String getMProvider() {
        return this.mProvider;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(this.mId.hashCode() * 31, 31, this.mIdentifierType), 31, this.mIdentifierValue);
        Decoration decoration = this.mDecoration;
        int iHashCode = (iC + (decoration == null ? 0 : decoration.hashCode())) * 31;
        String str = this.mProvider;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TransferPersonalizationMeta transferPersonalizationMeta = this.mMeta;
        return iHashCode2 + (transferPersonalizationMeta != null ? transferPersonalizationMeta.hashCode() : 0);
    }

    public String toString() {
        String str = this.mId;
        String str2 = this.mIdentifierType;
        String str3 = this.mIdentifierValue;
        Decoration decoration = this.mDecoration;
        String str4 = this.mProvider;
        TransferPersonalizationMeta transferPersonalizationMeta = this.mMeta;
        StringBuilder sbX = s.x("DecoratedActivity(mId=", str, ", mIdentifierType=", str2, ", mIdentifierValue=");
        sbX.append(str3);
        sbX.append(", mDecoration=");
        sbX.append(decoration);
        sbX.append(", mProvider=");
        sbX.append(str4);
        sbX.append(", mMeta=");
        sbX.append(transferPersonalizationMeta);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.mId);
        dest.writeString(this.mIdentifierType);
        dest.writeString(this.mIdentifierValue);
        Decoration decoration = this.mDecoration;
        if (decoration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            decoration.writeToParcel(dest, i);
        }
        dest.writeString(this.mProvider);
        TransferPersonalizationMeta transferPersonalizationMeta = this.mMeta;
        if (transferPersonalizationMeta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transferPersonalizationMeta.writeToParcel(dest, i);
        }
    }
}
