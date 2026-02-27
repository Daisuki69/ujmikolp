package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceInformation implements Parcelable {
    public static final String PLATFORM_ANDROID = "android";
    public static final String PLATFORM_IOS = "ios";

    @InterfaceC1497a
    @InterfaceC1498b("brand")
    private final String brand;

    @InterfaceC1497a
    @InterfaceC1498b("ip_address")
    private final String ipAddress;

    @InterfaceC1497a
    @InterfaceC1498b("is_active")
    private final boolean isActive;

    @InterfaceC1497a
    @InterfaceC1498b("last_logged_in")
    private final String lastLoggedIn;

    @InterfaceC1497a
    @InterfaceC1498b("location")
    private final String location;

    @InterfaceC1497a
    @InterfaceC1498b("device_model")
    private final String modelName;

    @InterfaceC1497a
    @InterfaceC1498b("nickname")
    private final String nickname;

    @InterfaceC1497a
    @InterfaceC1498b("os_version")
    private final String osVersion;

    @InterfaceC1497a
    @InterfaceC1498b("platform")
    private final String platform;

    @InterfaceC1497a
    @InterfaceC1498b("device_session_id")
    private final String sessionId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DeviceInformation> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<DeviceInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceInformation createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new DeviceInformation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceInformation[] newArray(int i) {
            return new DeviceInformation[i];
        }
    }

    public DeviceInformation(String sessionId, String str, String modelName, String location, String lastLoggedIn, String brand, String platform, String osVersion, String ipAddress, boolean z4) {
        j.g(sessionId, "sessionId");
        j.g(modelName, "modelName");
        j.g(location, "location");
        j.g(lastLoggedIn, "lastLoggedIn");
        j.g(brand, "brand");
        j.g(platform, "platform");
        j.g(osVersion, "osVersion");
        j.g(ipAddress, "ipAddress");
        this.sessionId = sessionId;
        this.nickname = str;
        this.modelName = modelName;
        this.location = location;
        this.lastLoggedIn = lastLoggedIn;
        this.brand = brand;
        this.platform = platform;
        this.osVersion = osVersion;
        this.ipAddress = ipAddress;
        this.isActive = z4;
    }

    public static /* synthetic */ DeviceInformation copy$default(DeviceInformation deviceInformation, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInformation.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = deviceInformation.nickname;
        }
        if ((i & 4) != 0) {
            str3 = deviceInformation.modelName;
        }
        if ((i & 8) != 0) {
            str4 = deviceInformation.location;
        }
        if ((i & 16) != 0) {
            str5 = deviceInformation.lastLoggedIn;
        }
        if ((i & 32) != 0) {
            str6 = deviceInformation.brand;
        }
        if ((i & 64) != 0) {
            str7 = deviceInformation.platform;
        }
        if ((i & 128) != 0) {
            str8 = deviceInformation.osVersion;
        }
        if ((i & 256) != 0) {
            str9 = deviceInformation.ipAddress;
        }
        if ((i & 512) != 0) {
            z4 = deviceInformation.isActive;
        }
        String str10 = str9;
        boolean z5 = z4;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return deviceInformation.copy(str, str2, str3, str4, str13, str14, str11, str12, str10, z5);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final boolean component10() {
        return this.isActive;
    }

    public final String component2() {
        return this.nickname;
    }

    public final String component3() {
        return this.modelName;
    }

    public final String component4() {
        return this.location;
    }

    public final String component5() {
        return this.lastLoggedIn;
    }

    public final String component6() {
        return this.brand;
    }

    public final String component7() {
        return this.platform;
    }

    public final String component8() {
        return this.osVersion;
    }

    public final String component9() {
        return this.ipAddress;
    }

    public final DeviceInformation copy(String sessionId, String str, String modelName, String location, String lastLoggedIn, String brand, String platform, String osVersion, String ipAddress, boolean z4) {
        j.g(sessionId, "sessionId");
        j.g(modelName, "modelName");
        j.g(location, "location");
        j.g(lastLoggedIn, "lastLoggedIn");
        j.g(brand, "brand");
        j.g(platform, "platform");
        j.g(osVersion, "osVersion");
        j.g(ipAddress, "ipAddress");
        return new DeviceInformation(sessionId, str, modelName, location, lastLoggedIn, brand, platform, osVersion, ipAddress, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInformation)) {
            return false;
        }
        DeviceInformation deviceInformation = (DeviceInformation) obj;
        return j.b(this.sessionId, deviceInformation.sessionId) && j.b(this.nickname, deviceInformation.nickname) && j.b(this.modelName, deviceInformation.modelName) && j.b(this.location, deviceInformation.location) && j.b(this.lastLoggedIn, deviceInformation.lastLoggedIn) && j.b(this.brand, deviceInformation.brand) && j.b(this.platform, deviceInformation.platform) && j.b(this.osVersion, deviceInformation.osVersion) && j.b(this.ipAddress, deviceInformation.ipAddress) && this.isActive == deviceInformation.isActive;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getLastLoggedIn() {
        return this.lastLoggedIn;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getPlatformLowercase() {
        String lowerCase = this.platform.toLowerCase(Locale.ROOT);
        j.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = this.sessionId.hashCode() * 31;
        String str = this.nickname;
        return AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.modelName), 31, this.location), 31, this.lastLoggedIn), 31, this.brand), 31, this.platform), 31, this.osVersion), 31, this.ipAddress) + (this.isActive ? 1231 : 1237);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.sessionId;
        String str2 = this.nickname;
        String str3 = this.modelName;
        String str4 = this.location;
        String str5 = this.lastLoggedIn;
        String str6 = this.brand;
        String str7 = this.platform;
        String str8 = this.osVersion;
        String str9 = this.ipAddress;
        boolean z4 = this.isActive;
        StringBuilder sbX = s.x("DeviceInformation(sessionId=", str, ", nickname=", str2, ", modelName=");
        c.A(sbX, str3, ", location=", str4, ", lastLoggedIn=");
        c.A(sbX, str5, ", brand=", str6, ", platform=");
        c.A(sbX, str7, ", osVersion=", str8, ", ipAddress=");
        sbX.append(str9);
        sbX.append(", isActive=");
        sbX.append(z4);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.sessionId);
        dest.writeString(this.nickname);
        dest.writeString(this.modelName);
        dest.writeString(this.location);
        dest.writeString(this.lastLoggedIn);
        dest.writeString(this.brand);
        dest.writeString(this.platform);
        dest.writeString(this.osVersion);
        dest.writeString(this.ipAddress);
        dest.writeInt(this.isActive ? 1 : 0);
    }
}
