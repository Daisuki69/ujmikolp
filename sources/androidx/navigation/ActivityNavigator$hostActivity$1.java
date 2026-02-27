package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityNavigator$hostActivity$1 extends k implements Function1<Context, Context> {
    public static final ActivityNavigator$hostActivity$1 INSTANCE = new ActivityNavigator$hostActivity$1();

    public ActivityNavigator$hostActivity$1() {
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
