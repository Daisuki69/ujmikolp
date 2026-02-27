package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class Decoration implements Parcelable {
    public static final Parcelable.Creator<Decoration> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("category")
    private final String mCategory;

    @InterfaceC1497a
    @InterfaceC1498b(MPDbAdapter.KEY_CREATED_AT)
    private final String mCreatedAt;

    @InterfaceC1497a
    @InterfaceC1498b("description")
    private final String mDescription;

    @InterfaceC1497a
    @InterfaceC1498b("hidden")
    private final boolean mHidden;

    @InterfaceC1497a
    @InterfaceC1498b("icon")
    private final String mIconUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String mId;

    @InterfaceC1497a
    @InterfaceC1498b("image")
    private final String mImageUrl;

    @InterfaceC1497a
    @InterfaceC1498b("label")
    private final String mLabel;

    @InterfaceC1497a
    @InterfaceC1498b("priority")
    private final Integer mPriority;

    @InterfaceC1497a
    @InterfaceC1498b("updated_at")
    private final String mUpdatedAt;

    public static final class Builder {
        private String mDescription;
        private boolean mHidden;
        private String mIconUrl;
        private String mImageUrl;
        private Integer mPriority;
        private String mCreatedAt = "";
        private String mUpdatedAt = "";
        private String mId = "";
        private String mCategory = "";
        private String mLabel = "";

        public final Decoration build() {
            return new Decoration(this.mCreatedAt, this.mUpdatedAt, this.mId, this.mCategory, this.mLabel, this.mDescription, this.mIconUrl, this.mImageUrl, this.mPriority, this.mHidden);
        }

        public final Builder mCategory(String value) {
            j.g(value, "value");
            this.mCategory = value;
            return this;
        }

        public final Builder mCreatedAt(String value) {
            j.g(value, "value");
            this.mCreatedAt = value;
            return this;
        }

        public final Builder mDescription(String str) {
            this.mDescription = str;
            return this;
        }

        public final Builder mHidden(boolean z4) {
            this.mHidden = z4;
            return this;
        }

        public final Builder mIconUrl(String str) {
            this.mIconUrl = str;
            return this;
        }

        public final Builder mId(String value) {
            j.g(value, "value");
            this.mId = value;
            return this;
        }

        public final Builder mImageUrl(String str) {
            this.mImageUrl = str;
            return this;
        }

        public final Builder mLabel(String value) {
            j.g(value, "value");
            this.mLabel = value;
            return this;
        }

        public final Builder mPriority(Integer num) {
            this.mPriority = num;
            return this;
        }

        public final Builder mUpdatedAt(String value) {
            j.g(value, "value");
            this.mUpdatedAt = value;
            return this;
        }
    }

    public static final class Creator implements Parcelable.Creator<Decoration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Decoration createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new Decoration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Decoration[] newArray(int i) {
            return new Decoration[i];
        }
    }

    public Decoration(String mCreatedAt, String mUpdatedAt, String mId, String mCategory, String mLabel, String str, String str2, String str3, Integer num, boolean z4) {
        j.g(mCreatedAt, "mCreatedAt");
        j.g(mUpdatedAt, "mUpdatedAt");
        j.g(mId, "mId");
        j.g(mCategory, "mCategory");
        j.g(mLabel, "mLabel");
        this.mCreatedAt = mCreatedAt;
        this.mUpdatedAt = mUpdatedAt;
        this.mId = mId;
        this.mCategory = mCategory;
        this.mLabel = mLabel;
        this.mDescription = str;
        this.mIconUrl = str2;
        this.mImageUrl = str3;
        this.mPriority = num;
        this.mHidden = z4;
    }

    public static /* synthetic */ Decoration copy$default(Decoration decoration, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = decoration.mCreatedAt;
        }
        if ((i & 2) != 0) {
            str2 = decoration.mUpdatedAt;
        }
        if ((i & 4) != 0) {
            str3 = decoration.mId;
        }
        if ((i & 8) != 0) {
            str4 = decoration.mCategory;
        }
        if ((i & 16) != 0) {
            str5 = decoration.mLabel;
        }
        if ((i & 32) != 0) {
            str6 = decoration.mDescription;
        }
        if ((i & 64) != 0) {
            str7 = decoration.mIconUrl;
        }
        if ((i & 128) != 0) {
            str8 = decoration.mImageUrl;
        }
        if ((i & 256) != 0) {
            num = decoration.mPriority;
        }
        if ((i & 512) != 0) {
            z4 = decoration.mHidden;
        }
        Integer num2 = num;
        boolean z5 = z4;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return decoration.copy(str, str2, str3, str4, str11, str12, str9, str10, num2, z5);
    }

    public final String component1() {
        return this.mCreatedAt;
    }

    public final boolean component10() {
        return this.mHidden;
    }

    public final String component2() {
        return this.mUpdatedAt;
    }

    public final String component3() {
        return this.mId;
    }

    public final String component4() {
        return this.mCategory;
    }

    public final String component5() {
        return this.mLabel;
    }

    public final String component6() {
        return this.mDescription;
    }

    public final String component7() {
        return this.mIconUrl;
    }

    public final String component8() {
        return this.mImageUrl;
    }

    public final Integer component9() {
        return this.mPriority;
    }

    public final Decoration copy(String mCreatedAt, String mUpdatedAt, String mId, String mCategory, String mLabel, String str, String str2, String str3, Integer num, boolean z4) {
        j.g(mCreatedAt, "mCreatedAt");
        j.g(mUpdatedAt, "mUpdatedAt");
        j.g(mId, "mId");
        j.g(mCategory, "mCategory");
        j.g(mLabel, "mLabel");
        return new Decoration(mCreatedAt, mUpdatedAt, mId, mCategory, mLabel, str, str2, str3, num, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Decoration)) {
            return false;
        }
        Decoration decoration = (Decoration) obj;
        return j.b(this.mCreatedAt, decoration.mCreatedAt) && j.b(this.mUpdatedAt, decoration.mUpdatedAt) && j.b(this.mId, decoration.mId) && j.b(this.mCategory, decoration.mCategory) && j.b(this.mLabel, decoration.mLabel) && j.b(this.mDescription, decoration.mDescription) && j.b(this.mIconUrl, decoration.mIconUrl) && j.b(this.mImageUrl, decoration.mImageUrl) && j.b(this.mPriority, decoration.mPriority) && this.mHidden == decoration.mHidden;
    }

    public final String getMCategory() {
        return this.mCategory;
    }

    public final String getMCreatedAt() {
        return this.mCreatedAt;
    }

    public final String getMDescription() {
        return this.mDescription;
    }

    public final boolean getMHidden() {
        return this.mHidden;
    }

    public final String getMIconUrl() {
        return this.mIconUrl;
    }

    public final String getMId() {
        return this.mId;
    }

    public final String getMImageUrl() {
        return this.mImageUrl;
    }

    public final String getMLabel() {
        return this.mLabel;
    }

    public final Integer getMPriority() {
        return this.mPriority;
    }

    public final String getMUpdatedAt() {
        return this.mUpdatedAt;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.mCreatedAt.hashCode() * 31, 31, this.mUpdatedAt), 31, this.mId), 31, this.mCategory), 31, this.mLabel);
        String str = this.mDescription;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mIconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mImageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.mPriority;
        return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + (this.mHidden ? 1231 : 1237);
    }

    public String toString() {
        String str = this.mCreatedAt;
        String str2 = this.mUpdatedAt;
        String str3 = this.mId;
        String str4 = this.mCategory;
        String str5 = this.mLabel;
        String str6 = this.mDescription;
        String str7 = this.mIconUrl;
        String str8 = this.mImageUrl;
        Integer num = this.mPriority;
        boolean z4 = this.mHidden;
        StringBuilder sbX = s.x("Decoration(mCreatedAt=", str, ", mUpdatedAt=", str2, ", mId=");
        c.A(sbX, str3, ", mCategory=", str4, ", mLabel=");
        c.A(sbX, str5, ", mDescription=", str6, ", mIconUrl=");
        c.A(sbX, str7, ", mImageUrl=", str8, ", mPriority=");
        sbX.append(num);
        sbX.append(", mHidden=");
        sbX.append(z4);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.mCreatedAt);
        dest.writeString(this.mUpdatedAt);
        dest.writeString(this.mId);
        dest.writeString(this.mCategory);
        dest.writeString(this.mLabel);
        dest.writeString(this.mDescription);
        dest.writeString(this.mIconUrl);
        dest.writeString(this.mImageUrl);
        Integer num = this.mPriority;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        dest.writeInt(this.mHidden ? 1 : 0);
    }
}
