package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class GamesInterstitialConfig implements Parcelable {
    public static final Parcelable.Creator<GamesInterstitialConfig> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("body_content")
    private final String bodyContent;

    @InterfaceC1497a
    @InterfaceC1498b("body_title")
    private final String bodyTitle;

    @InterfaceC1497a
    @InterfaceC1498b("page_title")
    private final String pageTitle;

    public static final class Creator implements Parcelable.Creator<GamesInterstitialConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GamesInterstitialConfig createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new GamesInterstitialConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GamesInterstitialConfig[] newArray(int i) {
            return new GamesInterstitialConfig[i];
        }
    }

    public GamesInterstitialConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ GamesInterstitialConfig copy$default(GamesInterstitialConfig gamesInterstitialConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gamesInterstitialConfig.pageTitle;
        }
        if ((i & 2) != 0) {
            str2 = gamesInterstitialConfig.bodyTitle;
        }
        if ((i & 4) != 0) {
            str3 = gamesInterstitialConfig.bodyContent;
        }
        return gamesInterstitialConfig.copy(str, str2, str3);
    }

    public final String component1() {
        return this.pageTitle;
    }

    public final String component2() {
        return this.bodyTitle;
    }

    public final String component3() {
        return this.bodyContent;
    }

    public final GamesInterstitialConfig copy(String str, String str2, String str3) {
        return new GamesInterstitialConfig(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesInterstitialConfig)) {
            return false;
        }
        GamesInterstitialConfig gamesInterstitialConfig = (GamesInterstitialConfig) obj;
        return j.b(this.pageTitle, gamesInterstitialConfig.pageTitle) && j.b(this.bodyTitle, gamesInterstitialConfig.bodyTitle) && j.b(this.bodyContent, gamesInterstitialConfig.bodyContent);
    }

    public final String getBodyContent() {
        return this.bodyContent;
    }

    public final String getBodyTitle() {
        return this.bodyTitle;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public int hashCode() {
        String str = this.pageTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bodyTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodyContent;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.pageTitle;
        String str2 = this.bodyTitle;
        return s.p(s.x("GamesInterstitialConfig(pageTitle=", str, ", bodyTitle=", str2, ", bodyContent="), this.bodyContent, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.pageTitle);
        dest.writeString(this.bodyTitle);
        dest.writeString(this.bodyContent);
    }

    public GamesInterstitialConfig(String str, String str2, String str3) {
        this.pageTitle = str;
        this.bodyTitle = str2;
        this.bodyContent = str3;
    }

    public /* synthetic */ GamesInterstitialConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
