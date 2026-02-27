package Y4;

import A5.j;
import bj.C1034e;
import bj.InterfaceC1033d;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OkHttpClient f6749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1033d f6750b;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f6749a = builder.connectTimeout(15L, timeUnit).readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).build();
        f6750b = C1034e.b(new j(21));
    }
}
