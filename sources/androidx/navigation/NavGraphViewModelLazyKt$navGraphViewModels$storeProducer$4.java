package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import bj.InterfaceC1033d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 extends k implements Function0<ViewModelStore> {
    final /* synthetic */ InterfaceC1033d $backStackEntry$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(InterfaceC1033d interfaceC1033d) {
        super(0);
        this.$backStackEntry$delegate = interfaceC1033d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        return NavGraphViewModelLazyKt.m114navGraphViewModels$lambda3(this.$backStackEntry$delegate).getViewModelStore();
    }
}
