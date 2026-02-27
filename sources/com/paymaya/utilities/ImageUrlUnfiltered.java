package com.paymaya.utilities;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.domain.model.DeviceInformation;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageUrlUnfiltered implements Parcelable {
    public static final Parcelable.Creator<ImageUrlUnfiltered> CREATOR = new a(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b("android")
    private final ImageUrl f14958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b(DeviceInformation.PLATFORM_IOS)
    private final ImageUrlIOS f14959b;

    public ImageUrlUnfiltered() {
        this(null, null);
    }

    public final ImageUrl a() {
        return this.f14958a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrlUnfiltered)) {
            return false;
        }
        ImageUrlUnfiltered imageUrlUnfiltered = (ImageUrlUnfiltered) obj;
        return j.b(this.f14958a, imageUrlUnfiltered.f14958a) && j.b(this.f14959b, imageUrlUnfiltered.f14959b);
    }

    public final int hashCode() {
        ImageUrl imageUrl = this.f14958a;
        int iHashCode = (imageUrl == null ? 0 : imageUrl.hashCode()) * 31;
        ImageUrlIOS imageUrlIOS = this.f14959b;
        return iHashCode + (imageUrlIOS != null ? imageUrlIOS.hashCode() : 0);
    }

    public final String toString() {
        return "ImageUrlUnfiltered(android=" + this.f14958a + ", ios=" + this.f14959b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        ImageUrl imageUrl = this.f14958a;
        if (imageUrl == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageUrl.writeToParcel(dest, i);
        }
        ImageUrlIOS imageUrlIOS = this.f14959b;
        if (imageUrlIOS == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageUrlIOS.writeToParcel(dest, i);
        }
    }

    public ImageUrlUnfiltered(ImageUrl imageUrl, ImageUrlIOS imageUrlIOS) {
        this.f14958a = imageUrl;
        this.f14959b = imageUrlIOS;
    }
}
