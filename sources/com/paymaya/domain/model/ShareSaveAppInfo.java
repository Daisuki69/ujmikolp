package com.paymaya.domain.model;

import We.s;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareSaveAppInfo implements Parcelable {
    private final String activityClassName;
    private final Bitmap iconBitmap;
    private final String label;
    private final String packageName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareSaveAppInfo> CREATOR = new Creator();
    private static final ShareSaveAppInfo SAVE_IMAGE = new ShareSaveAppInfo("com.paymaya.saveimage", null, "Save to Gallery", null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ShareSaveAppInfo getSAVE_IMAGE() {
            return ShareSaveAppInfo.SAVE_IMAGE;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<ShareSaveAppInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareSaveAppInfo createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ShareSaveAppInfo(parcel.readString(), parcel.readString(), parcel.readString(), (Bitmap) parcel.readParcelable(ShareSaveAppInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareSaveAppInfo[] newArray(int i) {
            return new ShareSaveAppInfo[i];
        }
    }

    public ShareSaveAppInfo(String str, String str2, String str3, Bitmap bitmap) {
        this.packageName = str;
        this.activityClassName = str2;
        this.label = str3;
        this.iconBitmap = bitmap;
    }

    public static /* synthetic */ ShareSaveAppInfo copy$default(ShareSaveAppInfo shareSaveAppInfo, String str, String str2, String str3, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareSaveAppInfo.packageName;
        }
        if ((i & 2) != 0) {
            str2 = shareSaveAppInfo.activityClassName;
        }
        if ((i & 4) != 0) {
            str3 = shareSaveAppInfo.label;
        }
        if ((i & 8) != 0) {
            bitmap = shareSaveAppInfo.iconBitmap;
        }
        return shareSaveAppInfo.copy(str, str2, str3, bitmap);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.activityClassName;
    }

    public final String component3() {
        return this.label;
    }

    public final Bitmap component4() {
        return this.iconBitmap;
    }

    public final ShareSaveAppInfo copy(String str, String str2, String str3, Bitmap bitmap) {
        return new ShareSaveAppInfo(str, str2, str3, bitmap);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareSaveAppInfo)) {
            return false;
        }
        ShareSaveAppInfo shareSaveAppInfo = (ShareSaveAppInfo) obj;
        return j.b(this.packageName, shareSaveAppInfo.packageName) && j.b(this.activityClassName, shareSaveAppInfo.activityClassName) && j.b(this.label, shareSaveAppInfo.label) && j.b(this.iconBitmap, shareSaveAppInfo.iconBitmap);
    }

    public final String getActivityClassName() {
        return this.activityClassName;
    }

    public final Bitmap getIconBitmap() {
        return this.iconBitmap;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        String str = this.packageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.activityClassName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Bitmap bitmap = this.iconBitmap;
        return iHashCode3 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public String toString() {
        String str = this.packageName;
        String str2 = this.activityClassName;
        String str3 = this.label;
        Bitmap bitmap = this.iconBitmap;
        StringBuilder sbX = s.x("ShareSaveAppInfo(packageName=", str, ", activityClassName=", str2, ", label=");
        sbX.append(str3);
        sbX.append(", iconBitmap=");
        sbX.append(bitmap);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.packageName);
        dest.writeString(this.activityClassName);
        dest.writeString(this.label);
        dest.writeParcelable(this.iconBitmap, i);
    }
}
