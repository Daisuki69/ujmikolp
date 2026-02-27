package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileCmsData implements Parcelable {
    public static final Parcelable.Creator<ProfileCmsData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("meta")
    private final Meta meta;

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final UpdateProfileCmsContentData updateProfileCmsContentData;

    public static final class Creator implements Parcelable.Creator<ProfileCmsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileCmsData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ProfileCmsData(UpdateProfileCmsContentData.CREATOR.createFromParcel(parcel), (Meta) parcel.readParcelable(ProfileCmsData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileCmsData[] newArray(int i) {
            return new ProfileCmsData[i];
        }
    }

    public ProfileCmsData(UpdateProfileCmsContentData updateProfileCmsContentData, Meta meta) {
        j.g(updateProfileCmsContentData, "updateProfileCmsContentData");
        this.updateProfileCmsContentData = updateProfileCmsContentData;
        this.meta = meta;
    }

    public static /* synthetic */ ProfileCmsData copy$default(ProfileCmsData profileCmsData, UpdateProfileCmsContentData updateProfileCmsContentData, Meta meta, int i, Object obj) {
        if ((i & 1) != 0) {
            updateProfileCmsContentData = profileCmsData.updateProfileCmsContentData;
        }
        if ((i & 2) != 0) {
            meta = profileCmsData.meta;
        }
        return profileCmsData.copy(updateProfileCmsContentData, meta);
    }

    public final UpdateProfileCmsContentData component1() {
        return this.updateProfileCmsContentData;
    }

    public final Meta component2() {
        return this.meta;
    }

    public final ProfileCmsData copy(UpdateProfileCmsContentData updateProfileCmsContentData, Meta meta) {
        j.g(updateProfileCmsContentData, "updateProfileCmsContentData");
        return new ProfileCmsData(updateProfileCmsContentData, meta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileCmsData)) {
            return false;
        }
        ProfileCmsData profileCmsData = (ProfileCmsData) obj;
        return j.b(this.updateProfileCmsContentData, profileCmsData.updateProfileCmsContentData) && j.b(this.meta, profileCmsData.meta);
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final UpdateProfileCmsContentData getUpdateProfileCmsContentData() {
        return this.updateProfileCmsContentData;
    }

    public int hashCode() {
        int iHashCode = this.updateProfileCmsContentData.hashCode() * 31;
        Meta meta = this.meta;
        return iHashCode + (meta == null ? 0 : meta.hashCode());
    }

    public String toString() {
        return "ProfileCmsData(updateProfileCmsContentData=" + this.updateProfileCmsContentData + ", meta=" + this.meta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.updateProfileCmsContentData.writeToParcel(dest, i);
        dest.writeParcelable(this.meta, i);
    }

    public /* synthetic */ ProfileCmsData(UpdateProfileCmsContentData updateProfileCmsContentData, Meta meta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(updateProfileCmsContentData, (i & 2) != 0 ? null : meta);
    }
}
