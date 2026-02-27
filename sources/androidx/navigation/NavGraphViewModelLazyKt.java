package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import bj.C1034e;
import bj.InterfaceC1033d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class NavGraphViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<CreationExtras> {
        final /* synthetic */ InterfaceC1033d $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$backStackEntry$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m111navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ InterfaceC1033d $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$backStackEntry$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m111navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$3, reason: invalid class name */
    public static final class AnonymousClass3 extends k implements Function0<CreationExtras> {
        final /* synthetic */ InterfaceC1033d $backStackEntry$delegate;
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function0<? extends CreationExtras> function0, InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$extrasProducer = function0;
            this.$backStackEntry$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? NavGraphViewModelLazyKt.m112navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$4, reason: invalid class name */
    public static final class AnonymousClass4 extends k implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ InterfaceC1033d $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$backStackEntry$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m112navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$5, reason: invalid class name */
    public static final class AnonymousClass5 extends k implements Function0<CreationExtras> {
        final /* synthetic */ InterfaceC1033d $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$backStackEntry$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m113navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$6, reason: invalid class name */
    public static final class AnonymousClass6 extends k implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ InterfaceC1033d $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$backStackEntry$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m113navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$7, reason: invalid class name */
    public static final class AnonymousClass7 extends k implements Function0<CreationExtras> {
        final /* synthetic */ InterfaceC1033d $backStackEntry$delegate;
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function0<? extends CreationExtras> function0, InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$extrasProducer = function0;
            this.$backStackEntry$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? NavGraphViewModelLazyKt.m114navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$8, reason: invalid class name */
    public static final class AnonymousClass8 extends k implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ InterfaceC1033d $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$backStackEntry$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m114navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1033d navGraphViewModels(Fragment fragment, @IdRes int i, Function0<? extends ViewModelProvider.Factory> function0) {
        j.g(fragment, "<this>");
        new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(C1034e.b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i)));
        j.m();
        throw null;
    }

    public static InterfaceC1033d navGraphViewModels$default(Fragment fragment, int i, Function0 function0, int i4, Object obj) {
        j.g(fragment, "<this>");
        new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(C1034e.b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i)));
        j.m();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: navGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m111navGraphViewModels$lambda0(InterfaceC1033d interfaceC1033d) {
        return (NavBackStackEntry) interfaceC1033d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: navGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m112navGraphViewModels$lambda1(InterfaceC1033d interfaceC1033d) {
        return (NavBackStackEntry) interfaceC1033d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: navGraphViewModels$lambda-2, reason: not valid java name */
    public static final NavBackStackEntry m113navGraphViewModels$lambda2(InterfaceC1033d interfaceC1033d) {
        return (NavBackStackEntry) interfaceC1033d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: navGraphViewModels$lambda-3, reason: not valid java name */
    public static final NavBackStackEntry m114navGraphViewModels$lambda3(InterfaceC1033d interfaceC1033d) {
        return (NavBackStackEntry) interfaceC1033d.getValue();
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1033d navGraphViewModels(Fragment fragment, @IdRes int i, Function0<? extends CreationExtras> function0, Function0<? extends ViewModelProvider.Factory> function02) {
        j.g(fragment, "<this>");
        new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(C1034e.b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, i)));
        j.m();
        throw null;
    }

    public static InterfaceC1033d navGraphViewModels$default(Fragment fragment, int i, Function0 function0, Function0 function02, int i4, Object obj) {
        j.g(fragment, "<this>");
        new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(C1034e.b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, i)));
        j.m();
        throw null;
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1033d navGraphViewModels(Fragment fragment, String navGraphRoute, Function0<? extends ViewModelProvider.Factory> function0) {
        j.g(fragment, "<this>");
        j.g(navGraphRoute, "navGraphRoute");
        new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(C1034e.b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$6(fragment, navGraphRoute)));
        j.m();
        throw null;
    }

    public static InterfaceC1033d navGraphViewModels$default(Fragment fragment, String navGraphRoute, Function0 function0, int i, Object obj) {
        j.g(fragment, "<this>");
        j.g(navGraphRoute, "navGraphRoute");
        new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(C1034e.b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$6(fragment, navGraphRoute)));
        j.m();
        throw null;
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1033d navGraphViewModels(Fragment fragment, String navGraphRoute, Function0<? extends CreationExtras> function0, Function0<? extends ViewModelProvider.Factory> function02) {
        j.g(fragment, "<this>");
        j.g(navGraphRoute, "navGraphRoute");
        new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(C1034e.b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute)));
        j.m();
        throw null;
    }

    public static InterfaceC1033d navGraphViewModels$default(Fragment fragment, String navGraphRoute, Function0 function0, Function0 function02, int i, Object obj) {
        j.g(fragment, "<this>");
        j.g(navGraphRoute, "navGraphRoute");
        new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(C1034e.b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute)));
        j.m();
        throw null;
    }
}
