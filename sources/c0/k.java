package c0;

import D.b0;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f9211b;
    public final Function0 c;

    public k(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        A5.j jVar = new A5.j(23);
        kotlin.jvm.internal.j.g(context, "context");
        this.f9210a = context;
        this.f9211b = cleverTapInstanceConfig;
        this.c = jVar;
    }

    public final void a(boolean z4) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f9211b;
        Context context = this.f9210a;
        if (z4) {
            b0.k(context, (int) (System.currentTimeMillis() / ((long) 1000)), b0.o(cleverTapInstanceConfig.f9439a, "comms_mtd"));
        } else {
            b0.k(context, 0, b0.o(cleverTapInstanceConfig.f9439a, "comms_mtd"));
        }
    }
}
