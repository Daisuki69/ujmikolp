package i0;

import D.S;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17066b;
    public final S c;

    public a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        j.g(context, "context");
        this.f17065a = context;
        String str = cleverTapInstanceConfig.f9439a;
        j.f(str, "getAccountId(...)");
        this.f17066b = str;
        S sC = cleverTapInstanceConfig.c();
        j.f(sC, "getLogger(...)");
        this.c = sC;
    }
}
