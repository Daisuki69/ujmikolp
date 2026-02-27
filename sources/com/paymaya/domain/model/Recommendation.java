package com.paymaya.domain.model;

import We.s;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class Recommendation {

    @InterfaceC1497a
    @InterfaceC1498b("application_uri")
    private final String applicationUri;

    @InterfaceC1497a
    @InterfaceC1498b("color")
    private final String color;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("media")
    private final com.paymaya.utilities.ImageUrlUnfiltered media;

    @InterfaceC1497a
    @InterfaceC1498b("subtitle")
    private final String subtitle;

    @InterfaceC1497a
    @InterfaceC1498b("title")
    private final String title;

    public Recommendation() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Recommendation copy$default(Recommendation recommendation, String str, String str2, String str3, String str4, String str5, com.paymaya.utilities.ImageUrlUnfiltered imageUrlUnfiltered, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendation.id;
        }
        if ((i & 2) != 0) {
            str2 = recommendation.color;
        }
        if ((i & 4) != 0) {
            str3 = recommendation.title;
        }
        if ((i & 8) != 0) {
            str4 = recommendation.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = recommendation.applicationUri;
        }
        if ((i & 32) != 0) {
            imageUrlUnfiltered = recommendation.media;
        }
        String str6 = str5;
        com.paymaya.utilities.ImageUrlUnfiltered imageUrlUnfiltered2 = imageUrlUnfiltered;
        return recommendation.copy(str, str2, str3, str4, str6, imageUrlUnfiltered2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.color;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.applicationUri;
    }

    public final com.paymaya.utilities.ImageUrlUnfiltered component6() {
        return this.media;
    }

    public final Recommendation copy(String str, String str2, String str3, String str4, String str5, com.paymaya.utilities.ImageUrlUnfiltered imageUrlUnfiltered) {
        return new Recommendation(str, str2, str3, str4, str5, imageUrlUnfiltered);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recommendation)) {
            return false;
        }
        Recommendation recommendation = (Recommendation) obj;
        return j.b(this.id, recommendation.id) && j.b(this.color, recommendation.color) && j.b(this.title, recommendation.title) && j.b(this.subtitle, recommendation.subtitle) && j.b(this.applicationUri, recommendation.applicationUri) && j.b(this.media, recommendation.media);
    }

    public final String getApplicationUri() {
        return this.applicationUri;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getId() {
        return this.id;
    }

    public final com.paymaya.utilities.ImageUrlUnfiltered getMedia() {
        return this.media;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.applicationUri;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        com.paymaya.utilities.ImageUrlUnfiltered imageUrlUnfiltered = this.media;
        return iHashCode5 + (imageUrlUnfiltered != null ? imageUrlUnfiltered.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.color;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.applicationUri;
        com.paymaya.utilities.ImageUrlUnfiltered imageUrlUnfiltered = this.media;
        StringBuilder sbX = s.x("Recommendation(id=", str, ", color=", str2, ", title=");
        c.A(sbX, str3, ", subtitle=", str4, ", applicationUri=");
        sbX.append(str5);
        sbX.append(", media=");
        sbX.append(imageUrlUnfiltered);
        sbX.append(")");
        return sbX.toString();
    }

    public Recommendation(String str, String str2, String str3, String str4, String str5, com.paymaya.utilities.ImageUrlUnfiltered imageUrlUnfiltered) {
        this.id = str;
        this.color = str2;
        this.title = str3;
        this.subtitle = str4;
        this.applicationUri = str5;
        this.media = imageUrlUnfiltered;
    }

    public /* synthetic */ Recommendation(String str, String str2, String str3, String str4, String str5, com.paymaya.utilities.ImageUrlUnfiltered imageUrlUnfiltered, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : imageUrlUnfiltered);
    }
}
