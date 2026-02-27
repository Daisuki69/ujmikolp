package com.paymaya.domain.model;

import We.s;
import com.google.android.gms.common.internal.ImagesContract;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FileUrl {

    @InterfaceC1497a
    @InterfaceC1498b(ImagesContract.URL)
    private final String url;

    public FileUrl(String url) {
        j.g(url, "url");
        this.url = url;
    }

    public static /* synthetic */ FileUrl copy$default(FileUrl fileUrl, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileUrl.url;
        }
        return fileUrl.copy(str);
    }

    public final String component1() {
        return this.url;
    }

    public final FileUrl copy(String url) {
        j.g(url, "url");
        return new FileUrl(url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileUrl) && j.b(this.url, ((FileUrl) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return s.j("FileUrl(url=", this.url, ")");
    }
}
