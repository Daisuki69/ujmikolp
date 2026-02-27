package androidx.navigation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class NavController$navInflater$2 extends k implements Function0<NavInflater> {
    final /* synthetic */ NavController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$navInflater$2(NavController navController) {
        super(0);
        this.this$0 = navController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NavInflater invoke() {
        NavInflater navInflater = this.this$0.inflater;
        return navInflater == null ? new NavInflater(this.this$0.getContext(), this.this$0._navigatorProvider) : navInflater;
    }
}
