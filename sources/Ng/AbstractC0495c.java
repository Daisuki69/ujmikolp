package Ng;

import androidx.webkit.ProxyConfig;
import cj.C1112C;

/* JADX INFO: renamed from: Ng.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0495c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0496d f4424a;

    static {
        C1112C c1112c = C1112C.f9377a;
        new C0496d("text", ProxyConfig.MATCH_ALL_SCHEMES, c1112c);
        f4424a = new C0496d("text", "plain", c1112c);
        new C0496d("text", "css", c1112c);
        new C0496d("text", "csv", c1112c);
        new C0496d("text", "html", c1112c);
        new C0496d("text", "javascript", c1112c);
        new C0496d("text", "vcard", c1112c);
        new C0496d("text", "xml", c1112c);
        new C0496d("text", "event-stream", c1112c);
    }
}
