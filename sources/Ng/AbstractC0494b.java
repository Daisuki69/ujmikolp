package Ng;

import androidx.media3.common.MimeTypes;
import androidx.webkit.ProxyConfig;
import cj.C1112C;

/* JADX INFO: renamed from: Ng.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0494b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0496d f4422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0496d f4423b;

    static {
        C1112C c1112c = C1112C.f9377a;
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, ProxyConfig.MATCH_ALL_SCHEMES, c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "atom+xml", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "cbor", c1112c);
        f4422a = new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "json", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "hal+json", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "javascript", c1112c);
        f4423b = new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "octet-stream", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "rss+xml", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "soap+xml", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "xml", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "xml-dtd", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "zip", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "gzip", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "x-www-form-urlencoded", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "pdf", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.spreadsheetml.sheet", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.wordprocessingml.document", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.presentationml.presentation", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "protobuf", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "wasm", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "problem+json", c1112c);
        new C0496d(MimeTypes.BASE_TYPE_APPLICATION, "problem+xml", c1112c);
    }
}
