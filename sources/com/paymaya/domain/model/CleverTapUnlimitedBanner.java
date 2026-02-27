package com.paymaya.domain.model;

import M8.T2;
import We.s;
import androidx.media3.datasource.cache.c;
import com.google.gson.o;
import com.google.gson.q;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CleverTapUnlimitedBanner {
    public static final Factory Factory = new Factory(null);
    private static final String UNLIMITED_BANNER_ACTIVE_KEY = "active";
    private static final String UNLIMITED_BANNER_DEEPLINK_KEY = "deeplink";
    private static final String UNLIMITED_BANNER_IMAGE_KEY = "image_url";
    private static final String UNLIMITED_BANNER_NAME_KEY = "name";
    private static final String UNLIMITED_BANNER_PRIORITY_KEY = "priority";
    private final boolean active;
    private final String deeplink;
    private final String imageUrl;
    private final String name;
    private final int priority;

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CleverTapUnlimitedBanner parse(String json) {
            j.g(json, "json");
            q qVarG = T2.x(json).g();
            o oVarM = qVarG.m(CleverTapUnlimitedBanner.UNLIMITED_BANNER_PRIORITY_KEY);
            int iE = oVarM != null ? oVarM.e() : 1;
            o oVarM2 = qVarG.m(CleverTapUnlimitedBanner.UNLIMITED_BANNER_IMAGE_KEY);
            String strJ = oVarM2 != null ? oVarM2.j() : null;
            o oVarM3 = qVarG.m(CleverTapUnlimitedBanner.UNLIMITED_BANNER_DEEPLINK_KEY);
            String strJ2 = oVarM3 != null ? oVarM3.j() : null;
            o oVarM4 = qVarG.m("active");
            Boolean boolValueOf = oVarM4 != null ? Boolean.valueOf(oVarM4.c()) : null;
            o oVarM5 = qVarG.m("name");
            String strJ3 = oVarM5 != null ? oVarM5.j() : null;
            if (strJ == null) {
                strJ = "";
            }
            if (strJ2 == null) {
                strJ2 = "";
            }
            return new CleverTapUnlimitedBanner(iE, strJ, strJ2, strJ3 != null ? strJ3 : "", boolValueOf != null ? boolValueOf.booleanValue() : false);
        }

        private Factory() {
        }
    }

    public CleverTapUnlimitedBanner(int i, String imageUrl, String deeplink, String name, boolean z4) {
        j.g(imageUrl, "imageUrl");
        j.g(deeplink, "deeplink");
        j.g(name, "name");
        this.priority = i;
        this.imageUrl = imageUrl;
        this.deeplink = deeplink;
        this.name = name;
        this.active = z4;
    }

    public static /* synthetic */ CleverTapUnlimitedBanner copy$default(CleverTapUnlimitedBanner cleverTapUnlimitedBanner, int i, String str, String str2, String str3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cleverTapUnlimitedBanner.priority;
        }
        if ((i4 & 2) != 0) {
            str = cleverTapUnlimitedBanner.imageUrl;
        }
        if ((i4 & 4) != 0) {
            str2 = cleverTapUnlimitedBanner.deeplink;
        }
        if ((i4 & 8) != 0) {
            str3 = cleverTapUnlimitedBanner.name;
        }
        if ((i4 & 16) != 0) {
            z4 = cleverTapUnlimitedBanner.active;
        }
        boolean z5 = z4;
        String str4 = str2;
        return cleverTapUnlimitedBanner.copy(i, str, str4, str3, z5);
    }

    public final int component1() {
        return this.priority;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.deeplink;
    }

    public final String component4() {
        return this.name;
    }

    public final boolean component5() {
        return this.active;
    }

    public final CleverTapUnlimitedBanner copy(int i, String imageUrl, String deeplink, String name, boolean z4) {
        j.g(imageUrl, "imageUrl");
        j.g(deeplink, "deeplink");
        j.g(name, "name");
        return new CleverTapUnlimitedBanner(i, imageUrl, deeplink, name, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CleverTapUnlimitedBanner)) {
            return false;
        }
        CleverTapUnlimitedBanner cleverTapUnlimitedBanner = (CleverTapUnlimitedBanner) obj;
        return this.priority == cleverTapUnlimitedBanner.priority && j.b(this.imageUrl, cleverTapUnlimitedBanner.imageUrl) && j.b(this.deeplink, cleverTapUnlimitedBanner.deeplink) && j.b(this.name, cleverTapUnlimitedBanner.name) && this.active == cleverTapUnlimitedBanner.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.priority * 31, 31, this.imageUrl), 31, this.deeplink), 31, this.name) + (this.active ? 1231 : 1237);
    }

    public String toString() {
        int i = this.priority;
        String str = this.imageUrl;
        String str2 = this.deeplink;
        String str3 = this.name;
        boolean z4 = this.active;
        StringBuilder sb2 = new StringBuilder("CleverTapUnlimitedBanner(priority=");
        sb2.append(i);
        sb2.append(", imageUrl=");
        sb2.append(str);
        sb2.append(", deeplink=");
        c.A(sb2, str2, ", name=", str3, ", active=");
        return s.s(sb2, z4, ")");
    }
}
