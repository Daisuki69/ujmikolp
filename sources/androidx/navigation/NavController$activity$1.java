package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class NavController$activity$1 extends k implements Function1<Context, Context> {
    public static final NavController$activity$1 INSTANCE = new NavController$activity$1();

    public NavController$activity$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Context invoke(Context it) {
        j.g(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }
}
