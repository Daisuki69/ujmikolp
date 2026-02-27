package Je;

import kotlin.jvm.internal.j;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MediaType f2515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MediaType f2516b;

    static {
        MediaType.Companion companion = MediaType.Companion;
        companion.parse("multipart/form-data; charset=utf-8");
        f2515a = companion.parse("text/plain; charset=utf-8");
        f2516b = companion.parse("application/json; charset=utf-8");
    }

    public static final RequestBody a(byte[] content) {
        j.g(content, "content");
        return RequestBody.Companion.create$default(RequestBody.Companion, f2516b, content, 0, 0, 12, (Object) null);
    }
}
