package com.google.android.exoplayer2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n1.C1903i;
import n1.C1904j;
import n1.C1905k;
import n1.C1906l;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1905k f9637b;
    public final C1904j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1906l f9638d;
    public final C1903i e;

    public MediaItem(String str, C1903i c1903i, C1905k c1905k, C1904j c1904j, C1906l c1906l) {
        this.f9636a = str;
        this.f9637b = c1905k;
        this.c = c1904j;
        this.f9638d = c1906l;
        this.e = c1903i;
    }

    public static MediaItem a(String str) {
        String string;
        C1905k c1905k;
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        Uri uri = str == null ? null : Uri.parse(str);
        if (uri != null) {
            C1905k c1905k2 = new C1905k(uri);
            string = uri.toString();
            c1905k = c1905k2;
        } else {
            string = null;
            c1905k = null;
        }
        string.getClass();
        return new MediaItem(string, new C1903i(), c1905k, new C1904j(), new C1906l());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return AbstractC2550e.a(this.f9636a, mediaItem.f9636a) && this.e.equals(mediaItem.e) && AbstractC2550e.a(this.f9637b, mediaItem.f9637b) && AbstractC2550e.a(this.c, mediaItem.c) && AbstractC2550e.a(this.f9638d, mediaItem.f9638d);
    }

    public final int hashCode() {
        int iHashCode = this.f9636a.hashCode() * 31;
        C1905k c1905k = this.f9637b;
        return (this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (c1905k != null ? c1905k.hashCode() : 0)) * 31)) * 31)) * 31;
    }
}
