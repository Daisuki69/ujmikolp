package androidx.privacysandbox.ads.adservices.appsetid;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class AppSetIdManager$Companion$obtain$1 extends k implements Function1<Context, AppSetIdManagerApi31Ext9Impl> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManager$Companion$obtain$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AppSetIdManagerApi31Ext9Impl invoke(Context it) {
        j.g(it, "it");
        return new AppSetIdManagerApi31Ext9Impl(this.$context);
    }
}
