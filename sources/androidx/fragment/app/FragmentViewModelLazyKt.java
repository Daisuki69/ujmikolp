package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import bj.C1034e;
import bj.EnumC1035f;
import bj.InterfaceC1033d;
import kotlin.jvm.functions.Function0;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.k implements Function0<ViewModelStore> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            kotlin.jvm.internal.j.f(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2, reason: invalid class name */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.k implements Function0<CreationExtras> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.j.f(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3, reason: invalid class name */
    public static final class AnonymousClass3 extends kotlin.jvm.internal.k implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.j.f(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4, reason: invalid class name */
    public static final class AnonymousClass4 extends kotlin.jvm.internal.k implements Function0<ViewModelStore> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            kotlin.jvm.internal.j.f(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5, reason: invalid class name */
    public static final class AnonymousClass5 extends kotlin.jvm.internal.k implements Function0<CreationExtras> {
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function0<? extends CreationExtras> function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.j.f(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6, reason: invalid class name */
    public static final class AnonymousClass6 extends kotlin.jvm.internal.k implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.j.f(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07791 extends kotlin.jvm.internal.k implements Function0<CreationExtras> {
        final /* synthetic */ Fragment $this_createViewModelLazy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07791(Fragment fragment) {
            super(0);
            this.$this_createViewModelLazy = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras = this.$this_createViewModelLazy.getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.j.f(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$2, reason: invalid class name and case insensitive filesystem */
    public static final class C07802 extends kotlin.jvm.internal.k implements Function0<CreationExtras> {
        final /* synthetic */ Fragment $this_createViewModelLazy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07802(Fragment fragment) {
            super(0);
            this.$this_createViewModelLazy = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras = this.$this_createViewModelLazy.getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.j.f(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07811 extends kotlin.jvm.internal.k implements Function0<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07811(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2, reason: invalid class name and case insensitive filesystem */
    public static final class C07822 extends kotlin.jvm.internal.k implements Function0<ViewModelStore> {
        final /* synthetic */ InterfaceC1033d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07822(InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$owner$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m93viewModels$lambda0(this.$owner$delegate).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3, reason: invalid class name and case insensitive filesystem */
    public static final class C07833 extends kotlin.jvm.internal.k implements Function0<CreationExtras> {
        final /* synthetic */ InterfaceC1033d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07833(InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$owner$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwnerM93viewModels$lambda0 = FragmentViewModelLazyKt.m93viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM93viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM93viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras()) == null) ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4, reason: invalid class name and case insensitive filesystem */
    public static final class C07844 extends kotlin.jvm.internal.k implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ InterfaceC1033d $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07844(Fragment fragment, InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM93viewModels$lambda0 = FragmentViewModelLazyKt.m93viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM93viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM93viewModels$lambda0 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.j.f(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$5, reason: invalid class name and case insensitive filesystem */
    public static final class C07855 extends kotlin.jvm.internal.k implements Function0<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07855(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6, reason: invalid class name and case insensitive filesystem */
    public static final class C07866 extends kotlin.jvm.internal.k implements Function0<ViewModelStore> {
        final /* synthetic */ InterfaceC1033d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07866(InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$owner$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m94viewModels$lambda1(this.$owner$delegate).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7, reason: invalid class name */
    public static final class AnonymousClass7 extends kotlin.jvm.internal.k implements Function0<CreationExtras> {
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;
        final /* synthetic */ InterfaceC1033d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function0<? extends CreationExtras> function0, InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerM94viewModels$lambda1 = FragmentViewModelLazyKt.m94viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM94viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM94viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8, reason: invalid class name */
    public static final class AnonymousClass8 extends kotlin.jvm.internal.k implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ InterfaceC1033d $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(Fragment fragment, InterfaceC1033d interfaceC1033d) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = interfaceC1033d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM94viewModels$lambda1 = FragmentViewModelLazyKt.m94viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM94viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM94viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.j.f(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1033d activityViewModels(Fragment fragment, Function0<? extends ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.m();
        throw null;
    }

    public static InterfaceC1033d activityViewModels$default(Fragment fragment, Function0 function0, int i, Object obj) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.m();
        throw null;
    }

    @MainThread
    public static final /* synthetic */ InterfaceC1033d createViewModelLazy(Fragment fragment, InterfaceC2488d viewModelClass, Function0 storeProducer, Function0 function0) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.j.g(storeProducer, "storeProducer");
        return createViewModelLazy(fragment, viewModelClass, storeProducer, new C07791(fragment), function0);
    }

    public static /* synthetic */ InterfaceC1033d createViewModelLazy$default(Fragment fragment, InterfaceC2488d interfaceC2488d, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 4) != 0) {
            function02 = null;
        }
        return createViewModelLazy(fragment, interfaceC2488d, function0, function02);
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1033d viewModels(Fragment fragment, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(ownerProducer, "ownerProducer");
        C1034e.a(EnumC1035f.c, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        kotlin.jvm.internal.j.m();
        throw null;
    }

    public static InterfaceC1033d viewModels$default(Fragment fragment, Function0 ownerProducer, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            ownerProducer = new C07811(fragment);
        }
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(ownerProducer, "ownerProducer");
        C1034e.a(EnumC1035f.c, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        kotlin.jvm.internal.j.m();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m93viewModels$lambda0(InterfaceC1033d interfaceC1033d) {
        return (ViewModelStoreOwner) interfaceC1033d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m94viewModels$lambda1(InterfaceC1033d interfaceC1033d) {
        return (ViewModelStoreOwner) interfaceC1033d.getValue();
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1033d activityViewModels(Fragment fragment, Function0<? extends CreationExtras> function0, Function0<? extends ViewModelProvider.Factory> function02) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.m();
        throw null;
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1033d createViewModelLazy(Fragment fragment, InterfaceC2488d viewModelClass, Function0<? extends ViewModelStore> storeProducer, Function0<? extends CreationExtras> extrasProducer, Function0<? extends ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.j.g(storeProducer, "storeProducer");
        kotlin.jvm.internal.j.g(extrasProducer, "extrasProducer");
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(viewModelClass, storeProducer, function0, extrasProducer);
    }

    public static /* synthetic */ InterfaceC1033d createViewModelLazy$default(Fragment fragment, InterfaceC2488d interfaceC2488d, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        if ((i & 4) != 0) {
            function02 = new C07802(fragment);
        }
        if ((i & 8) != 0) {
            function03 = null;
        }
        return createViewModelLazy(fragment, interfaceC2488d, function0, function02, function03);
    }

    public static InterfaceC1033d activityViewModels$default(Fragment fragment, Function0 function0, Function0 function02, int i, Object obj) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.m();
        throw null;
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1033d viewModels(Fragment fragment, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends CreationExtras> function0, Function0<? extends ViewModelProvider.Factory> function02) {
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(ownerProducer, "ownerProducer");
        C1034e.a(EnumC1035f.c, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        kotlin.jvm.internal.j.m();
        throw null;
    }

    public static InterfaceC1033d viewModels$default(Fragment fragment, Function0 ownerProducer, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            ownerProducer = new C07855(fragment);
        }
        kotlin.jvm.internal.j.g(fragment, "<this>");
        kotlin.jvm.internal.j.g(ownerProducer, "ownerProducer");
        C1034e.a(EnumC1035f.c, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        kotlin.jvm.internal.j.m();
        throw null;
    }
}
