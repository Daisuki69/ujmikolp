package y5;

import androidx.browser.trusted.sharing.ShareTarget;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MediaType f21063a = MediaType.parse("application/json; charset=utf-8");

    static {
        MediaType.parse("application/gzip; charset=utf-8");
        MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART);
    }
}
