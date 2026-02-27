package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class SystemBarStyle$Companion$auto$1 extends kotlin.jvm.internal.k implements Function1<Resources, Boolean> {
    public static final SystemBarStyle$Companion$auto$1 INSTANCE = new SystemBarStyle$Companion$auto$1();

    public SystemBarStyle$Companion$auto$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Resources resources) {
        kotlin.jvm.internal.j.g(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
