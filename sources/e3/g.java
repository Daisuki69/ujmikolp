package e3;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import b3.C0880a;
import b3.C0881b;
import java.net.URL;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0881b f16570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f16571b;

    public g(C0881b appInfo, CoroutineContext blockingDispatcher) {
        kotlin.jvm.internal.j.g(appInfo, "appInfo");
        kotlin.jvm.internal.j.g(blockingDispatcher, "blockingDispatcher");
        this.f16570a = appInfo;
        this.f16571b = blockingDispatcher;
    }

    public static final URL a(g gVar) {
        gVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C0881b c0881b = gVar.f16570a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c0881b.f8431a).appendPath("settings");
        C0880a c0880a = c0881b.f8432b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c0880a.c).appendQueryParameter("display_version", c0880a.f8427b).build().toString());
    }
}
