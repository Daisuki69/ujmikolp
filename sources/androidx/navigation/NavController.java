package androidx.navigation;

import Ej.InterfaceC0230h;
import Ej.N;
import Ej.O;
import Ej.P;
import Ej.Q;
import Ej.V;
import Ej.W;
import Ej.f0;
import Ej.h0;
import Rj.f;
import We.s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1112C;
import cj.C1124j;
import cj.C1129o;
import cj.C1132s;
import cj.x;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlin.sequences.Sequence;
import yj.C2536a;
import yj.e;
import yj.i;
import yj.n;

/* JADX INFO: loaded from: classes2.dex */
public class NavController {
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";
    private static final String TAG = "NavController";
    private final N _currentBackStackEntryFlow;
    private NavGraph _graph;
    private NavigatorProvider _navigatorProvider;
    private final O _visibleEntries;
    private Activity activity;
    private Function1<? super NavBackStackEntry, Unit> addToBackStackHandler;
    private final C1124j<NavBackStackEntry> backQueue;
    private final List<NavBackStackEntry> backStackEntriesToDispatch;
    private final Map<Integer, String> backStackMap;
    private final Map<String, C1124j<NavBackStackEntryState>> backStackStates;
    private Parcelable[] backStackToRestore;
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;
    private final Context context;
    private final InterfaceC0230h currentBackStackEntryFlow;
    private boolean deepLinkHandled;
    private int dispatchReentrantCount;
    private boolean enableOnBackPressedCallback;
    private final Map<NavBackStackEntry, Boolean> entrySavedState;
    private Lifecycle.State hostLifecycleState;
    private NavInflater inflater;
    private final LifecycleObserver lifecycleObserver;
    private LifecycleOwner lifecycleOwner;
    private final InterfaceC1033d navInflater$delegate;
    private final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> navigatorState;
    private Bundle navigatorStateToRestore;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;
    private final CopyOnWriteArrayList<OnDestinationChangedListener> onDestinationChangedListeners;
    private final Map<NavBackStackEntry, AtomicInteger> parentToChildCount;
    private Function1<? super NavBackStackEntry, Unit> popFromBackStackHandler;
    private NavControllerViewModel viewModel;
    private final f0 visibleEntries;
    public static final Companion Companion = new Companion(null);
    private static boolean deepLinkSaveState = true;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean z4) {
            NavController.deepLinkSaveState = z4;
        }

        private Companion() {
        }
    }

    public final class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            j.g(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        public final void addInternal(NavBackStackEntry backStackEntry) {
            j.g(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination destination, Bundle bundle) {
            j.g(destination, "destination");
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.this$0.getContext(), destination, bundle, this.this$0.getHostLifecycleState$navigation_runtime_release(), this.this$0.viewModel, null, null, 96, null);
        }

        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(NavBackStackEntry entry) {
            NavControllerViewModel navControllerViewModel;
            j.g(entry, "entry");
            boolean zB = j.b(this.this$0.entrySavedState.get(entry), Boolean.TRUE);
            super.markTransitionComplete(entry);
            this.this$0.entrySavedState.remove(entry);
            if (this.this$0.getBackQueue().contains(entry)) {
                if (isNavigating()) {
                    return;
                }
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                ((h0) this.this$0._visibleEntries).h(this.this$0.populateVisibleEntries$navigation_runtime_release());
                return;
            }
            this.this$0.unlinkChildFromParent$navigation_runtime_release(entry);
            if (entry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
            }
            C1124j<NavBackStackEntry> backQueue = this.this$0.getBackQueue();
            if (backQueue == null || !backQueue.isEmpty()) {
                Iterator<NavBackStackEntry> it = backQueue.iterator();
                while (it.hasNext()) {
                    if (j.b(it.next().getId(), entry.getId())) {
                        break;
                    }
                }
                if (!zB && (navControllerViewModel = this.this$0.viewModel) != null) {
                    navControllerViewModel.clear(entry.getId());
                }
            } else if (!zB) {
                navControllerViewModel.clear(entry.getId());
            }
            this.this$0.updateBackStackLifecycle$navigation_runtime_release();
            ((h0) this.this$0._visibleEntries).h(this.this$0.populateVisibleEntries$navigation_runtime_release());
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(NavBackStackEntry popUpTo, boolean z4) {
            j.g(popUpTo, "popUpTo");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(popUpTo.getDestination().getNavigatorName());
            if (!j.b(navigator, this.navigator)) {
                Object obj = this.this$0.navigatorState.get(navigator);
                j.d(obj);
                ((NavControllerNavigatorState) obj).pop(popUpTo, z4);
            } else {
                Function1 function1 = this.this$0.popFromBackStackHandler;
                if (function1 == null) {
                    this.this$0.popBackStackFromNavigator$navigation_runtime_release(popUpTo, new NavController$NavControllerNavigatorState$pop$1(this, popUpTo, z4));
                } else {
                    function1.invoke(popUpTo);
                    super.pop(popUpTo, z4);
                }
            }
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry popUpTo, boolean z4) {
            j.g(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, z4);
            this.this$0.entrySavedState.put(popUpTo, Boolean.valueOf(z4));
        }

        @Override // androidx.navigation.NavigatorState
        public void push(NavBackStackEntry backStackEntry) {
            j.g(backStackEntry, "backStackEntry");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(backStackEntry.getDestination().getNavigatorName());
            if (!j.b(navigator, this.navigator)) {
                Object obj = this.this$0.navigatorState.get(navigator);
                if (obj != null) {
                    ((NavControllerNavigatorState) obj).push(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            Function1 function1 = this.this$0.addToBackStackHandler;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                addInternal(backStackEntry);
            } else {
                Log.i(NavController.TAG, "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
            }
        }
    }

    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$handleDeepLink$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function1<NavOptionsBuilder, Unit> {
        final /* synthetic */ NavDestination $node;
        final /* synthetic */ NavController this$0;

        /* JADX INFO: renamed from: androidx.navigation.NavController$handleDeepLink$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends k implements Function1<AnimBuilder, Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimBuilder) obj);
                return Unit.f18162a;
            }

            public final void invoke(AnimBuilder anim) {
                j.g(anim, "$this$anim");
                anim.setEnter(0);
                anim.setExit(0);
            }
        }

        /* JADX INFO: renamed from: androidx.navigation.NavController$handleDeepLink$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C00112 extends k implements Function1<PopUpToBuilder, Unit> {
            public static final C00112 INSTANCE = new C00112();

            public C00112() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PopUpToBuilder) obj);
                return Unit.f18162a;
            }

            public final void invoke(PopUpToBuilder popUpTo) {
                j.g(popUpTo, "$this$popUpTo");
                popUpTo.setSaveState(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NavDestination navDestination, NavController navController) {
            super(1);
            this.$node = navDestination;
            this.this$0 = navController;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NavOptionsBuilder) obj);
            return Unit.f18162a;
        }

        public final void invoke(NavOptionsBuilder navOptions) {
            j.g(navOptions, "$this$navOptions");
            navOptions.anim(AnonymousClass1.INSTANCE);
            NavDestination navDestination = this.$node;
            if (navDestination instanceof NavGraph) {
                Sequence<NavDestination> hierarchy = NavDestination.Companion.getHierarchy(navDestination);
                NavController navController = this.this$0;
                for (NavDestination navDestination2 : hierarchy) {
                    NavDestination currentDestination = navController.getCurrentDestination();
                    if (j.b(navDestination2, currentDestination != null ? currentDestination.getParent() : null)) {
                        return;
                    }
                }
                if (NavController.deepLinkSaveState) {
                    navOptions.popUpTo(NavGraph.Companion.findStartDestination(this.this$0.getGraph()).getId(), C00112.INSTANCE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$navigate$4, reason: invalid class name */
    public static final class AnonymousClass4 extends k implements Function1<NavBackStackEntry, Unit> {
        final /* synthetic */ Bundle $finalArgs;
        final /* synthetic */ u $navigated;
        final /* synthetic */ NavDestination $node;
        final /* synthetic */ NavController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(u uVar, NavController navController, NavDestination navDestination, Bundle bundle) {
            super(1);
            this.$navigated = uVar;
            this.this$0 = navController;
            this.$node = navDestination;
            this.$finalArgs = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NavBackStackEntry) obj);
            return Unit.f18162a;
        }

        public final void invoke(NavBackStackEntry it) {
            j.g(it, "it");
            this.$navigated.f18191a = true;
            NavController.addEntryToBackStack$default(this.this$0, this.$node, this.$finalArgs, it, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$navigateInternal$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<NavBackStackEntry, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(NavBackStackEntry it) {
            j.g(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NavBackStackEntry) obj);
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$popBackStackInternal$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08101 extends k implements Function1<NavBackStackEntry, Unit> {
        public static final C08101 INSTANCE = new C08101();

        public C08101() {
            super(1);
        }

        public final void invoke(NavBackStackEntry it) {
            j.g(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NavBackStackEntry) obj);
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$popBackStackInternal$2, reason: invalid class name and case insensitive filesystem */
    public static final class C08112 extends k implements Function1<NavBackStackEntry, Unit> {
        final /* synthetic */ u $popped;
        final /* synthetic */ u $receivedPop;
        final /* synthetic */ boolean $saveState;
        final /* synthetic */ C1124j<NavBackStackEntryState> $savedState;
        final /* synthetic */ NavController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08112(u uVar, u uVar2, NavController navController, boolean z4, C1124j<NavBackStackEntryState> c1124j) {
            super(1);
            this.$receivedPop = uVar;
            this.$popped = uVar2;
            this.this$0 = navController;
            this.$saveState = z4;
            this.$savedState = c1124j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NavBackStackEntry) obj);
            return Unit.f18162a;
        }

        public final void invoke(NavBackStackEntry entry) {
            j.g(entry, "entry");
            this.$receivedPop.f18191a = true;
            this.$popped.f18191a = true;
            this.this$0.popEntryFromBackStack(entry, this.$saveState, this.$savedState);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$popBackStackInternal$3, reason: invalid class name */
    public static final class AnonymousClass3 extends k implements Function1<NavDestination, NavDestination> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NavDestination invoke(NavDestination destination) {
            j.g(destination, "destination");
            NavGraph parent = destination.getParent();
            if (parent == null || parent.getStartDestinationId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$popBackStackInternal$4, reason: invalid class name and case insensitive filesystem */
    public static final class C08124 extends k implements Function1<NavDestination, Boolean> {
        public C08124() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(NavDestination destination) {
            j.g(destination, "destination");
            return Boolean.valueOf(!NavController.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$popBackStackInternal$6, reason: invalid class name */
    public static final class AnonymousClass6 extends k implements Function1<NavDestination, NavDestination> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NavDestination invoke(NavDestination destination) {
            j.g(destination, "destination");
            NavGraph parent = destination.getParent();
            if (parent == null || parent.getStartDestinationId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$popBackStackInternal$7, reason: invalid class name */
    public static final class AnonymousClass7 extends k implements Function1<NavDestination, Boolean> {
        public AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(NavDestination destination) {
            j.g(destination, "destination");
            return Boolean.valueOf(!NavController.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$restoreStateInternal$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08131 extends k implements Function1<String, Boolean> {
        final /* synthetic */ String $backStackId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08131(String str) {
            super(1);
            this.$backStackId = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            return Boolean.valueOf(j.b(str, this.$backStackId));
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$restoreStateInternal$4, reason: invalid class name and case insensitive filesystem */
    public static final class C08144 extends k implements Function1<NavBackStackEntry, Unit> {
        final /* synthetic */ Bundle $args;
        final /* synthetic */ List<NavBackStackEntry> $entries;
        final /* synthetic */ w $lastNavigatedIndex;
        final /* synthetic */ u $navigated;
        final /* synthetic */ NavController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08144(u uVar, List<NavBackStackEntry> list, w wVar, NavController navController, Bundle bundle) {
            super(1);
            this.$navigated = uVar;
            this.$entries = list;
            this.$lastNavigatedIndex = wVar;
            this.this$0 = navController;
            this.$args = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NavBackStackEntry) obj);
            return Unit.f18162a;
        }

        public final void invoke(NavBackStackEntry entry) {
            List<NavBackStackEntry> listSubList;
            j.g(entry, "entry");
            this.$navigated.f18191a = true;
            int iIndexOf = this.$entries.indexOf(entry);
            if (iIndexOf != -1) {
                int i = iIndexOf + 1;
                listSubList = this.$entries.subList(this.$lastNavigatedIndex.f18193a, i);
                this.$lastNavigatedIndex.f18193a = i;
            } else {
                listSubList = C1112C.f9377a;
            }
            this.this$0.addEntryToBackStack(entry.getDestination(), this.$args, entry, listSubList);
        }
    }

    public NavController(Context context) {
        Object next;
        j.g(context, "context");
        this.context = context;
        Iterator it = n.e(NavController$activity$1.INSTANCE, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.backQueue = new C1124j<>();
        h0 h0VarB = W.b(C1112C.f9377a);
        this._visibleEntries = h0VarB;
        this.visibleEntries = new Q(h0VarB);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new a(this, 0);
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this._navigatorProvider;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater$delegate = C1034e.b(new NavController$navInflater$2(this));
        V vA = W.a(1, 0, Dj.a.f1164b);
        this._currentBackStackEntryFlow = vA;
        this.currentBackStackEntryFlow = new P(vA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEntryToBackStack(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        NavController navController;
        Bundle bundle2;
        C1124j<NavBackStackEntry> c1124j;
        NavDestination destination;
        List<NavBackStackEntry> list2;
        NavBackStackEntry navBackStackEntry2;
        NavGraph navGraph;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntryPrevious2;
        List<NavBackStackEntry> list3 = list;
        NavDestination destination2 = navBackStackEntry.getDestination();
        if (destination2 instanceof FloatingWindow) {
            navController = this;
        } else {
            while (!getBackQueue().isEmpty() && (((NavBackStackEntry) getBackQueue().last()).getDestination() instanceof FloatingWindow)) {
                navController = this;
                if (!popBackStackInternal$default(navController, ((NavBackStackEntry) getBackQueue().last()).getDestination().getId(), true, false, 4, null)) {
                    break;
                }
            }
            navController = this;
        }
        C1124j c1124j2 = new C1124j();
        NavBackStackEntry navBackStackEntry3 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination2 = destination2;
            while (true) {
                j.d(navDestination2);
                NavGraph parent = navDestination2.getParent();
                if (parent != null) {
                    ListIterator<NavBackStackEntry> listIterator = list3.listIterator(list3.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = listIterator.previous();
                            if (j.b(navBackStackEntryPrevious2.getDestination(), parent)) {
                                break;
                            }
                        } else {
                            navBackStackEntryPrevious2 = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntryCreate$default = navBackStackEntryPrevious2;
                    if (navBackStackEntryCreate$default == null) {
                        bundle2 = bundle;
                        destination = destination2;
                        navBackStackEntryCreate$default = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, navController.context, parent, bundle2, navController.getHostLifecycleState$navigation_runtime_release(), navController.viewModel, null, null, 96, null);
                    } else {
                        bundle2 = bundle;
                        destination = destination2;
                    }
                    c1124j2.addFirst(navBackStackEntryCreate$default);
                    if (navController.getBackQueue().isEmpty() || ((NavBackStackEntry) navController.getBackQueue().last()).getDestination() != parent) {
                        navBackStackEntry2 = navBackStackEntry;
                        list2 = list;
                        c1124j = c1124j2;
                    } else {
                        list2 = list;
                        c1124j = c1124j2;
                        navBackStackEntry2 = navBackStackEntry;
                        popEntryFromBackStack$default(navController, (NavBackStackEntry) navController.getBackQueue().last(), false, null, 6, null);
                    }
                } else {
                    bundle2 = bundle;
                    c1124j = c1124j2;
                    destination = destination2;
                    list2 = list3;
                    navBackStackEntry2 = navBackStackEntry;
                }
                if (parent == null || parent == navDestination) {
                    break;
                }
                list3 = list2;
                navDestination2 = parent;
                c1124j2 = c1124j;
                destination2 = destination;
            }
        } else {
            bundle2 = bundle;
            c1124j = c1124j2;
            destination = destination2;
            list2 = list3;
            navBackStackEntry2 = navBackStackEntry;
        }
        NavDestination destination3 = c1124j.isEmpty() ? destination : ((NavBackStackEntry) c1124j.first()).getDestination();
        while (destination3 != null && navController.findDestination(destination3.getId()) == null) {
            NavGraph parent2 = destination3.getParent();
            if (parent2 != null) {
                ListIterator<NavBackStackEntry> listIterator2 = list2.listIterator(list2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = listIterator2.previous();
                        if (j.b(navBackStackEntryPrevious.getDestination(), parent2)) {
                            break;
                        }
                    } else {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntryCreate$default2 = navBackStackEntryPrevious;
                if (navBackStackEntryCreate$default2 == null) {
                    navGraph = parent2;
                    navBackStackEntryCreate$default2 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, navController.context, navGraph, parent2.addInDefaultArgs(bundle2), navController.getHostLifecycleState$navigation_runtime_release(), navController.viewModel, null, null, 96, null);
                } else {
                    navGraph = parent2;
                }
                c1124j.addFirst(navBackStackEntryCreate$default2);
            } else {
                navGraph = parent2;
            }
            destination3 = navGraph;
        }
        if (!c1124j.isEmpty()) {
            destination = ((NavBackStackEntry) c1124j.first()).getDestination();
        }
        while (!navController.getBackQueue().isEmpty() && (((NavBackStackEntry) navController.getBackQueue().last()).getDestination() instanceof NavGraph) && ((NavGraph) ((NavBackStackEntry) navController.getBackQueue().last()).getDestination()).findNode(destination.getId(), false) == null) {
            popEntryFromBackStack$default(navController, (NavBackStackEntry) navController.getBackQueue().last(), false, null, 6, null);
        }
        C1124j<NavBackStackEntry> backQueue = navController.getBackQueue();
        NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) (backQueue.isEmpty() ? null : backQueue.f9393b[backQueue.f9392a]);
        if (navBackStackEntry4 == null) {
            navBackStackEntry4 = (NavBackStackEntry) (c1124j.isEmpty() ? null : c1124j.f9393b[c1124j.f9392a]);
        }
        if (!j.b(navBackStackEntry4 != null ? navBackStackEntry4.getDestination() : null, navController._graph)) {
            ListIterator<NavBackStackEntry> listIterator3 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination destination4 = navBackStackEntryPrevious3.getDestination();
                NavGraph navGraph2 = navController._graph;
                j.d(navGraph2);
                if (j.b(destination4, navGraph2)) {
                    navBackStackEntry3 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryCreate$default3 = navBackStackEntry3;
            if (navBackStackEntryCreate$default3 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.Companion;
                Context context = navController.context;
                NavGraph navGraph3 = navController._graph;
                j.d(navGraph3);
                NavGraph navGraph4 = navController._graph;
                j.d(navGraph4);
                navBackStackEntryCreate$default3 = NavBackStackEntry.Companion.create$default(companion, context, navGraph3, navGraph4.addInDefaultArgs(bundle2), navController.getHostLifecycleState$navigation_runtime_release(), navController.viewModel, null, null, 96, null);
            }
            c1124j.addFirst(navBackStackEntryCreate$default3);
        }
        for (NavBackStackEntry navBackStackEntry5 : c1124j) {
            NavControllerNavigatorState navControllerNavigatorState = navController.navigatorState.get(navController._navigatorProvider.getNavigator(navBackStackEntry5.getDestination().getNavigatorName()));
            if (navControllerNavigatorState == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.getNavigatorName() + " should already be created").toString());
            }
            navControllerNavigatorState.addInternal(navBackStackEntry5);
        }
        navController.getBackQueue().addAll(c1124j);
        navController.getBackQueue().addLast(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry6 : C1110A.M(navBackStackEntry2, c1124j)) {
            NavGraph parent3 = navBackStackEntry6.getDestination().getParent();
            if (parent3 != null) {
                navController.linkChildToParent(navBackStackEntry6, navController.getBackStackEntry(parent3.getId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void addEntryToBackStack$default(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i & 8) != 0) {
            list = C1112C.f9377a;
        }
        navController.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
    }

    @MainThread
    private final boolean clearBackStackInternal(@IdRes int i) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(i, null, null, null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal(i, true, false);
    }

    private final boolean dispatchOnDestinationChanged() {
        while (!getBackQueue().isEmpty() && (((NavBackStackEntry) getBackQueue().last()).getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$default(this, (NavBackStackEntry) getBackQueue().last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) getBackQueue().e();
        if (navBackStackEntry != null) {
            this.backStackEntriesToDispatch.add(navBackStackEntry);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i;
        if (i == 0) {
            ArrayList<NavBackStackEntry> arrayListW = C1110A.W(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry2 : arrayListW) {
                Iterator<OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, navBackStackEntry2.getDestination(), navBackStackEntry2.getArguments());
                }
                this._currentBackStackEntryFlow.b(navBackStackEntry2);
            }
            ((h0) this._visibleEntries).h(populateVisibleEntries$navigation_runtime_release());
        }
        return navBackStackEntry != null;
    }

    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z4) {
        Companion.enableDeepLinkSaveState(z4);
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this._graph;
        int length = iArr.length;
        int i = 0;
        while (true) {
            NavDestination navDestinationFindNode = null;
            if (i >= length) {
                return null;
            }
            int i4 = iArr[i];
            if (i == 0) {
                NavGraph navGraph3 = this._graph;
                j.d(navGraph3);
                if (navGraph3.getId() == i4) {
                    navDestinationFindNode = this._graph;
                }
            } else {
                j.d(navGraph2);
                navDestinationFindNode = navGraph2.findNode(i4);
            }
            if (navDestinationFindNode == null) {
                return NavDestination.Companion.getDisplayName(this.context, i4);
            }
            if (i != iArr.length - 1 && (navDestinationFindNode instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestinationFindNode;
                    j.d(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestinationFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
    }

    private final int getDestinationCountOnBackStack() {
        C1124j<NavBackStackEntry> backQueue = getBackQueue();
        int i = 0;
        if ((backQueue != null) && backQueue.isEmpty()) {
            return 0;
        }
        Iterator<NavBackStackEntry> it = backQueue.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof NavGraph) && (i = i + 1) < 0) {
                C1132s.j();
                throw null;
            }
        }
        return i;
    }

    private final List<NavBackStackEntry> instantiateBackStack(C1124j<NavBackStackEntryState> c1124j) {
        NavDestination graph;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) getBackQueue().e();
        if (navBackStackEntry == null || (graph = navBackStackEntry.getDestination()) == null) {
            graph = getGraph();
        }
        if (c1124j != null) {
            for (NavBackStackEntryState navBackStackEntryState : c1124j) {
                NavDestination navDestinationFindDestination = findDestination(graph, navBackStackEntryState.getDestinationId());
                if (navDestinationFindDestination == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + graph).toString());
                }
                arrayList.add(navBackStackEntryState.instantiate(this.context, navDestinationFindDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                graph = navDestinationFindDestination;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lifecycleObserver$lambda-2, reason: not valid java name */
    public static final void m105lifecycleObserver$lambda2(NavController this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        j.g(this$0, "this$0");
        j.g(lifecycleOwner, "<anonymous parameter 0>");
        j.g(event, "event");
        Lifecycle.State targetState = event.getTargetState();
        j.f(targetState, "event.targetState");
        this$0.hostLifecycleState = targetState;
        if (this$0._graph != null) {
            Iterator<NavBackStackEntry> it = this$0.getBackQueue().iterator();
            while (it.hasNext()) {
                it.next().handleLifecycleEvent(event);
            }
        }
    }

    private final void linkChildToParent(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.childToParentEntries.put(navBackStackEntry, navBackStackEntry2);
        if (this.parentToChildCount.get(navBackStackEntry2) == null) {
            this.parentToChildCount.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntry2);
        j.d(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            navOptions = null;
        }
        if ((i & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    private final void navigateInternal(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras, Function1<? super NavBackStackEntry, Unit> function1) {
        this.addToBackStackHandler = function1;
        navigator.navigate(list, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateInternal$default(NavController navController, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
        }
        if ((i & 8) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        navController.navigateInternal(navigator, list, navOptions, extras, function1);
    }

    @MainThread
    private final void onGraphCreated(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.navigatorStateToRestore;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList(KEY_NAVIGATOR_STATE_NAMES)) != null) {
            for (String name : stringArrayList) {
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                j.f(name, "name");
                Navigator navigator = navigatorProvider.getNavigator(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    navigator.onRestoreState(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination navDestinationFindDestination = findDestination(navBackStackEntryState.getDestinationId());
                if (navDestinationFindDestination == null) {
                    StringBuilder sbW = s.w("Restoring the Navigation back stack failed: destination ", NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId()), " cannot be found from the current destination ");
                    sbW.append(getCurrentDestination());
                    throw new IllegalStateException(sbW.toString());
                }
                NavBackStackEntry navBackStackEntryInstantiate = navBackStackEntryState.instantiate(this.context, navDestinationFindDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(navDestinationFindDestination.getNavigatorName());
                Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.navigatorState;
                NavControllerNavigatorState navControllerNavigatorState = map.get(navigator2);
                if (navControllerNavigatorState == null) {
                    navControllerNavigatorState = new NavControllerNavigatorState(this, navigator2);
                    map.put(navigator2, navControllerNavigatorState);
                }
                getBackQueue().addLast(navBackStackEntryInstantiate);
                navControllerNavigatorState.addInternal(navBackStackEntryInstantiate);
                NavGraph parent = navBackStackEntryInstantiate.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent(navBackStackEntryInstantiate, getBackStackEntry(parent.getId()));
                }
            }
            updateOnBackPressedCallbackEnabled();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> collectionValues = this._navigatorProvider.getNavigators().values();
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((Navigator) obj).isAttached()) {
                arrayList.add(obj);
            }
        }
        for (Navigator<? extends NavDestination> navigator3 : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.navigatorState;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator3);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator3);
                map2.put(navigator3, navControllerNavigatorState2);
            }
            navigator3.onAttach(navControllerNavigatorState2);
        }
        if (this._graph == null || !getBackQueue().isEmpty()) {
            dispatchOnDestinationChanged();
            return;
        }
        if (!this.deepLinkHandled && (activity = this.activity) != null) {
            j.d(activity);
            if (handleDeepLink(activity.getIntent())) {
                return;
            }
        }
        NavGraph navGraph = this._graph;
        j.d(navGraph);
        navigate(navGraph, bundle, (NavOptions) null, (Navigator.Extras) null);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z4, boolean z5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 4) != 0) {
            z5 = false;
        }
        return navController.popBackStack(str, z4, z5);
    }

    private final void popBackStackInternal(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z4, Function1<? super NavBackStackEntry, Unit> function1) {
        this.popFromBackStackHandler = function1;
        navigator.popBackStack(navBackStackEntry, z4);
        this.popFromBackStackHandler = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popBackStackInternal$default(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z4, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i & 4) != 0) {
            function1 = C08101.INSTANCE;
        }
        navController.popBackStackInternal(navigator, navBackStackEntry, z4, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popEntryFromBackStack(NavBackStackEntry navBackStackEntry, boolean z4, C1124j<NavBackStackEntryState> c1124j) {
        NavControllerViewModel navControllerViewModel;
        f0 transitionsInProgress;
        Set set;
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) getBackQueue().last();
        if (!j.b(navBackStackEntry2, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.getDestination() + ", which is not the top of the back stack (" + navBackStackEntry2.getDestination() + ')').toString());
        }
        getBackQueue().removeLast();
        NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(navBackStackEntry2.getDestination().getNavigatorName()));
        boolean z5 = true;
        if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null || !set.contains(navBackStackEntry2)) && !this.parentToChildCount.containsKey(navBackStackEntry2)) {
            z5 = false;
        }
        Lifecycle.State currentState = navBackStackEntry2.getLifecycle().getCurrentState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            if (z4) {
                navBackStackEntry2.setMaxLifecycle(state);
                c1124j.addFirst(new NavBackStackEntryState(navBackStackEntry2));
            }
            if (z5) {
                navBackStackEntry2.setMaxLifecycle(state);
            } else {
                navBackStackEntry2.setMaxLifecycle(Lifecycle.State.DESTROYED);
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntry2);
            }
        }
        if (z4 || z5 || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        navControllerViewModel.clear(navBackStackEntry2.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popEntryFromBackStack$default(NavController navController, NavBackStackEntry navBackStackEntry, boolean z4, C1124j c1124j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        if ((i & 4) != 0) {
            c1124j = new C1124j();
        }
        navController.popEntryFromBackStack(navBackStackEntry, z4, c1124j);
    }

    private final boolean restoreStateInternal(int i, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        if (!this.backStackMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(i));
        Collection<String> collectionValues = this.backStackMap.values();
        C08131 c08131 = new C08131(str);
        j.g(collectionValues, "<this>");
        x.r(collectionValues, c08131, true);
        List<NavBackStackEntry> listInstantiateBackStack = instantiateBackStack((C1124j) D.c(this.backStackStates).remove(str));
        ArrayList<List<NavBackStackEntry>> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : listInstantiateBackStack) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list = (List) C1110A.H(arrayList);
            if (j.b((list == null || (navBackStackEntry = (NavBackStackEntry) C1110A.G(list)) == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getNavigatorName(), navBackStackEntry2.getDestination().getNavigatorName())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(C1132s.h(navBackStackEntry2));
            }
        }
        u uVar = new u();
        for (List<NavBackStackEntry> list2 : arrayList) {
            navigateInternal(this._navigatorProvider.getNavigator(((NavBackStackEntry) C1110A.A(list2)).getDestination().getNavigatorName()), list2, navOptions, extras, new C08144(uVar, listInstantiateBackStack, new w(), this, bundle));
        }
        return uVar.f18191a;
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        int i = 0;
        if (this.deepLinkHandled) {
            Activity activity = this.activity;
            j.d(activity);
            Intent intent = activity.getIntent();
            Bundle extras = intent.getExtras();
            j.d(extras);
            int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
            j.d(intArray);
            ArrayList arrayListA = C1129o.A(intArray);
            ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
            int iIntValue = ((Number) x.t(arrayListA)).intValue();
            if (parcelableArrayList != null) {
            }
            if (!arrayListA.isEmpty()) {
                NavDestination navDestinationFindDestination = findDestination(getGraph(), iIntValue);
                if (navDestinationFindDestination instanceof NavGraph) {
                    iIntValue = NavGraph.Companion.findStartDestination((NavGraph) navDestinationFindDestination).getId();
                }
                NavDestination currentDestination = getCurrentDestination();
                if (currentDestination != null && iIntValue == currentDestination.getId()) {
                    NavDeepLinkBuilder navDeepLinkBuilderCreateDeepLink = createDeepLink();
                    Bundle bundleBundleOf = BundleKt.bundleOf(new Pair(KEY_DEEP_LINK_INTENT, intent));
                    Bundle bundle = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
                    if (bundle != null) {
                        bundleBundleOf.putAll(bundle);
                    }
                    navDeepLinkBuilderCreateDeepLink.setArguments(bundleBundleOf);
                    for (Object obj : arrayListA) {
                        int i4 = i + 1;
                        Bundle bundle2 = null;
                        if (i < 0) {
                            C1132s.k();
                            throw null;
                        }
                        int iIntValue2 = ((Number) obj).intValue();
                        if (parcelableArrayList != null) {
                            bundle2 = (Bundle) parcelableArrayList.get(i);
                        }
                        navDeepLinkBuilderCreateDeepLink.addDestination(iIntValue2, bundle2);
                        i = i4;
                    }
                    navDeepLinkBuilderCreateDeepLink.createTaskStackBuilder().startActivities();
                    Activity activity2 = this.activity;
                    if (activity2 != null) {
                        activity2.finish();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        NavDestination currentDestination = getCurrentDestination();
        j.d(currentDestination);
        int id = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != id) {
                Bundle bundle = new Bundle();
                Activity activity = this.activity;
                if (activity != null) {
                    j.d(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        j.d(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            j.d(activity3);
                            bundle.putParcelable(KEY_DEEP_LINK_INTENT, activity3.getIntent());
                            NavGraph navGraph = this._graph;
                            j.d(navGraph);
                            Activity activity4 = this.activity;
                            j.d(activity4);
                            Intent intent = activity4.getIntent();
                            j.f(intent, "activity!!.intent");
                            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = navGraph.matchDeepLink(new NavDeepLinkRequest(intent));
                            if (deepLinkMatchMatchDeepLink != null) {
                                bundle.putAll(deepLinkMatchMatchDeepLink.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLink.getMatchingArgs()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundle).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 == null) {
                    return true;
                }
                activity5.finish();
                return true;
            }
            id = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void addOnDestinationChangedListener(OnDestinationChangedListener listener) {
        j.g(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (getBackQueue().isEmpty()) {
            return;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) getBackQueue().last();
        listener.onDestinationChanged(this, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
    }

    @MainThread
    public final boolean clearBackStack(String route) {
        j.g(route, "route");
        return clearBackStack(NavDestination.Companion.createRoute(route).hashCode());
    }

    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean z4) {
        this.enableOnBackPressedCallback = z4;
        updateOnBackPressedCallbackEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(@IdRes int i) {
        NavDestination destination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        j.d(navGraph);
        if (navGraph.getId() == i) {
            return this._graph;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) getBackQueue().e();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            j.d(destination);
        }
        return findDestination(destination, i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C1124j<NavBackStackEntry> getBackQueue() {
        return this.backQueue;
    }

    public NavBackStackEntry getBackStackEntry(@IdRes int i) {
        NavBackStackEntry navBackStackEntryPrevious;
        C1124j<NavBackStackEntry> backQueue = getBackQueue();
        ListIterator<NavBackStackEntry> listIterator = backQueue.listIterator(backQueue.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            if (navBackStackEntryPrevious.getDestination().getId() == i) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sbT = s.t(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbT.append(getCurrentDestination());
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context getContext() {
        return this.context;
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return (NavBackStackEntry) getBackQueue().e();
    }

    public final InterfaceC0230h getCurrentBackStackEntryFlow() {
        return this.currentBackStackEntryFlow;
    }

    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    @MainThread
    public NavGraph getGraph() {
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        if (navGraph != null) {
            return navGraph;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
    }

    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater$delegate.getValue();
    }

    public NavigatorProvider getNavigatorProvider() {
        return this._navigatorProvider;
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        Object next;
        Iterator it = C1110A.O(getBackQueue()).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((C2536a) n.b(it)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((NavBackStackEntry) next).getDestination() instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) next;
    }

    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int i) {
        if (this.viewModel == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        }
        NavBackStackEntry backStackEntry = getBackStackEntry(i);
        if (backStackEntry.getDestination() instanceof NavGraph) {
            return backStackEntry;
        }
        throw new IllegalArgumentException(s.g(i, "No NavGraph with ID ", " is on the NavController's back stack").toString());
    }

    public final f0 getVisibleEntries() {
        return this.visibleEntries;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleDeepLink(android.content.Intent r20) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.handleDeepLink(android.content.Intent):boolean");
    }

    public final void navigate(String route) {
        j.g(route, "route");
        navigate$default(this, route, null, null, 6, null);
    }

    @MainThread
    public boolean navigateUp() {
        Intent intent;
        if (getDestinationCountOnBackStack() != 1) {
            return popBackStack();
        }
        Activity activity = this.activity;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null) != null ? tryRelaunchUpToExplicitStack() : tryRelaunchUpToGeneratedStack();
    }

    @MainThread
    public final boolean popBackStack(String route, boolean z4) {
        j.g(route, "route");
        return popBackStack$default(this, route, z4, false, 4, null);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(NavBackStackEntry popUpTo, Function0<Unit> onComplete) {
        j.g(popUpTo, "popUpTo");
        j.g(onComplete, "onComplete");
        int iIndexOf = getBackQueue().indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != getBackQueue().size()) {
            popBackStackInternal(((NavBackStackEntry) getBackQueue().get(i)).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        updateOnBackPressedCallbackEnabled();
        dispatchOnDestinationChanged();
    }

    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            x.p(arrayList2, arrayList);
        }
        C1124j<NavBackStackEntry> backQueue = getBackQueue();
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : backQueue) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        x.p(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void removeOnDestinationChangedListener(OnDestinationChangedListener listener) {
        j.g(listener, "listener");
        this.onDestinationChangedListeners.remove(listener);
    }

    @CallSuper
    public void restoreState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = bundle.getBundle(KEY_NAVIGATOR_STATE);
        this.backStackToRestore = bundle.getParcelableArray(KEY_BACK_STACK);
        this.backStackStates.clear();
        int[] intArray = bundle.getIntArray(KEY_BACK_STACK_DEST_IDS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_BACK_STACK_IDS);
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i4 = 0;
            while (i < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i]), stringArrayList.get(i4));
                i++;
                i4++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_BACK_STACK_STATES_IDS);
        if (stringArrayList2 != null) {
            for (String id : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_BACK_STACK_STATES_PREFIX + id);
                if (parcelableArray != null) {
                    Map<String, C1124j<NavBackStackEntryState>> map = this.backStackStates;
                    j.f(id, "id");
                    C1124j<NavBackStackEntryState> c1124j = new C1124j<>(parcelableArray.length);
                    f fVarF = D.f(parcelableArray);
                    while (fVarF.hasNext()) {
                        Parcelable parcelable = (Parcelable) fVarF.next();
                        if (parcelable == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                        c1124j.addLast((NavBackStackEntryState) parcelable);
                    }
                    map.put(id, c1124j);
                }
            }
        }
        this.deepLinkHandled = bundle.getBoolean(KEY_DEEP_LINK_HANDLED);
    }

    @CallSuper
    public Bundle saveState() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle bundleOnSaveState = entry.getValue().onSaveState();
            if (bundleOnSaveState != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleOnSaveState);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList(KEY_NAVIGATOR_STATE_NAMES, arrayList);
            bundle.putBundle(KEY_NAVIGATOR_STATE, bundle2);
        }
        if (!getBackQueue().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[getBackQueue().size()];
            Iterator<NavBackStackEntry> it = getBackQueue().iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it.next());
                i++;
            }
            bundle.putParcelableArray(KEY_BACK_STACK, parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i4 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i4] = iIntValue;
                arrayList2.add(value);
                i4++;
            }
            bundle.putIntArray(KEY_BACK_STACK_DEST_IDS, iArr);
            bundle.putStringArrayList(KEY_BACK_STACK_IDS, arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, C1124j<NavBackStackEntryState>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                C1124j<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i6 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i10 = i6 + 1;
                    if (i6 < 0) {
                        C1132s.k();
                        throw null;
                    }
                    parcelableArr2[i6] = navBackStackEntryState;
                    i6 = i10;
                }
                bundle.putParcelableArray(AbstractC1414e.h(KEY_BACK_STACK_STATES_PREFIX, key2), parcelableArr2);
            }
            bundle.putStringArrayList(KEY_BACK_STACK_STATES_IDS, arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundle;
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph graph) {
        j.g(graph, "graph");
        setGraph(graph, (Bundle) null);
    }

    public final void setHostLifecycleState$navigation_runtime_release(Lifecycle.State state) {
        j.g(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(LifecycleOwner owner) {
        Lifecycle lifecycle;
        j.g(owner, "owner");
        if (owner.equals(this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(NavigatorProvider navigatorProvider) {
        j.g(navigatorProvider, "navigatorProvider");
        if (!getBackQueue().isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call");
        }
        this._navigatorProvider = navigatorProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(OnBackPressedDispatcher dispatcher) {
        j.g(dispatcher, "dispatcher");
        if (dispatcher.equals(this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = dispatcher;
        dispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.removeObserver(this.lifecycleObserver);
        lifecycle.addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(ViewModelStore viewModelStore) {
        j.g(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.Companion;
        if (j.b(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (!getBackQueue().isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = companion.getInstance(viewModelStore);
    }

    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(NavBackStackEntry child) {
        j.g(child, "child");
        NavBackStackEntry navBackStackEntryRemove = this.childToParentEntries.remove(child);
        if (navBackStackEntryRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntryRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntryRemove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(navBackStackEntryRemove);
            }
            this.parentToChildCount.remove(navBackStackEntryRemove);
        }
        return navBackStackEntryRemove;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        NavDestination parent;
        AtomicInteger atomicInteger;
        f0 transitionsInProgress;
        Set set;
        ArrayList<NavBackStackEntry> arrayListW = C1110A.W(getBackQueue());
        if (arrayListW.isEmpty()) {
            return;
        }
        NavDestination destination = ((NavBackStackEntry) C1110A.G(arrayListW)).getDestination();
        if (destination instanceof FloatingWindow) {
            Iterator it = C1110A.O(arrayListW).iterator();
            while (it.hasNext()) {
                parent = ((NavBackStackEntry) it.next()).getDestination();
                if (!(parent instanceof NavGraph) && !(parent instanceof FloatingWindow)) {
                    break;
                }
            }
            parent = null;
        } else {
            parent = null;
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : C1110A.O(arrayListW)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination2 = navBackStackEntry.getDestination();
            if (destination != null && destination2.getId() == destination.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    if (j.b((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInteger = this.parentToChildCount.get(navBackStackEntry)) != null && atomicInteger.get() == 0)) {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        map.put(navBackStackEntry, state);
                    }
                }
                destination = destination.getParent();
            } else if (parent == null || destination2.getId() != parent.getId()) {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            } else {
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        map.put(navBackStackEntry, state2);
                    }
                }
                parent = parent.getParent();
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayListW) {
            Lifecycle.State state3 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.setMaxLifecycle(state3);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int i) {
        return clearBackStackInternal(i) && dispatchOnDestinationChanged();
    }

    public final void navigate(String route, NavOptions navOptions) {
        j.g(route, "route");
        navigate$default(this, route, navOptions, null, 4, null);
    }

    @MainThread
    public boolean popBackStack() {
        if (getBackQueue().isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        j.d(currentDestination);
        return popBackStack(currentDestination.getId(), true);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i) {
        setGraph(getNavInflater().inflate(i), (Bundle) null);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i, boolean z4, boolean z5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i4 & 4) != 0) {
            z5 = false;
        }
        return navController.popBackStackInternal(i, z4, z5);
    }

    @MainThread
    public void navigate(@IdRes int i) {
        navigate(i, (Bundle) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i, Bundle bundle) {
        setGraph(getNavInflater().inflate(i), bundle);
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int i, boolean z4, boolean z5) {
        NavDestination destination;
        NavController navController;
        boolean z8;
        if (getBackQueue().isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C1110A.O(getBackQueue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(destination.getNavigatorName());
            if (z4 || destination.getId() != i) {
                arrayList.add(navigator);
            }
            if (destination.getId() == i) {
                break;
            }
        }
        if (destination == null) {
            Log.i(TAG, "Ignoring popBackStack to destination " + NavDestination.Companion.getDisplayName(this.context, i) + " as it was not found on the current back stack");
            return false;
        }
        u uVar = new u();
        C1124j<NavBackStackEntryState> c1124j = new C1124j<>();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                navController = this;
                z8 = z5;
                break;
            }
            Navigator<? extends NavDestination> navigator2 = (Navigator) it2.next();
            u uVar2 = new u();
            navController = this;
            z8 = z5;
            popBackStackInternal(navigator2, (NavBackStackEntry) getBackQueue().last(), z8, new C08112(uVar2, uVar, navController, z8, c1124j));
            if (!uVar2.f18191a) {
                break;
            }
            z5 = z8;
        }
        if (z8) {
            if (!z4) {
                Sequence sequenceE = n.e(AnonymousClass3.INSTANCE, destination);
                C08124 c08124 = new C08124();
                j.g(sequenceE, "<this>");
                e eVar = new e(new i(sequenceE, c08124));
                while (eVar.hasNext()) {
                    NavDestination navDestination = (NavDestination) eVar.next();
                    Map<Integer, String> map = navController.backStackMap;
                    Integer numValueOf = Integer.valueOf(navDestination.getId());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) (c1124j.isEmpty() ? null : c1124j.f9393b[c1124j.f9392a]);
                    map.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.getId() : null);
                }
            }
            if (!c1124j.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) c1124j.first();
                Sequence sequenceE2 = n.e(AnonymousClass6.INSTANCE, findDestination(navBackStackEntryState2.getDestinationId()));
                AnonymousClass7 anonymousClass7 = new AnonymousClass7();
                j.g(sequenceE2, "<this>");
                e eVar2 = new e(new i(sequenceE2, anonymousClass7));
                while (eVar2.hasNext()) {
                    navController.backStackMap.put(Integer.valueOf(((NavDestination) eVar2.next()).getId()), navBackStackEntryState2.getId());
                }
                navController.backStackStates.put(navBackStackEntryState2.getId(), c1124j);
            }
        }
        updateOnBackPressedCallbackEnabled();
        return uVar.f18191a;
    }

    @MainThread
    public void navigate(@IdRes int i, Bundle bundle) {
        navigate(i, bundle, (NavOptions) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i, boolean z4) {
        return popBackStack(i, z4, false);
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph graph, Bundle bundle) {
        NavController navController;
        j.g(graph, "graph");
        if (!j.b(this._graph, graph)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                for (Integer id : new ArrayList(this.backStackMap.keySet())) {
                    j.f(id, "id");
                    clearBackStackInternal(id.intValue());
                }
                navController = this;
                popBackStackInternal$default(navController, navGraph.getId(), true, false, 4, null);
            } else {
                navController = this;
            }
            navController._graph = graph;
            onGraphCreated(bundle);
            return;
        }
        int size = graph.getNodes().size();
        for (int i = 0; i < size; i++) {
            NavDestination newDestination = graph.getNodes().valueAt(i);
            NavGraph navGraph2 = this._graph;
            j.d(navGraph2);
            navGraph2.getNodes().replace(i, newDestination);
            C1124j<NavBackStackEntry> backQueue = getBackQueue();
            ArrayList<NavBackStackEntry> arrayList = new ArrayList();
            for (NavBackStackEntry navBackStackEntry : backQueue) {
                NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                if (newDestination != null && navBackStackEntry2.getDestination().getId() == newDestination.getId()) {
                    arrayList.add(navBackStackEntry);
                }
            }
            for (NavBackStackEntry navBackStackEntry3 : arrayList) {
                j.f(newDestination, "newDestination");
                navBackStackEntry3.setDestination(newDestination);
            }
        }
    }

    @MainThread
    public void navigate(@IdRes int i, Bundle bundle, NavOptions navOptions) {
        navigate(i, bundle, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i, boolean z4, boolean z5) {
        return popBackStackInternal(i, z4, z5) && dispatchOnDestinationChanged();
    }

    private final NavDestination findDestination(NavDestination navDestination, @IdRes int i) {
        NavGraph parent;
        if (navDestination.getId() == i) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            parent = (NavGraph) navDestination;
        } else {
            parent = navDestination.getParent();
            j.d(parent);
        }
        return parent.findNode(i);
    }

    @MainThread
    public void navigate(@IdRes int i, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination destination;
        int destinationId;
        if (getBackQueue().isEmpty()) {
            destination = this._graph;
        } else {
            destination = ((NavBackStackEntry) getBackQueue().last()).getDestination();
        }
        if (destination != null) {
            NavAction action = destination.getAction(i);
            Bundle bundle2 = null;
            if (action != null) {
                if (navOptions == null) {
                    navOptions = action.getNavOptions();
                }
                destinationId = action.getDestinationId();
                Bundle defaultArguments = action.getDefaultArguments();
                if (defaultArguments != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(defaultArguments);
                }
            } else {
                destinationId = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (destinationId == 0 && navOptions != null && navOptions.getPopUpToId() != -1) {
                popBackStack(navOptions.getPopUpToId(), navOptions.isPopUpToInclusive());
                return;
            }
            if (destinationId != 0) {
                NavDestination navDestinationFindDestination = findDestination(destinationId);
                if (navDestinationFindDestination == null) {
                    NavDestination.Companion companion = NavDestination.Companion;
                    String displayName = companion.getDisplayName(this.context, destinationId);
                    if (action == null) {
                        throw new IllegalArgumentException("Navigation action/destination " + displayName + " cannot be found from the current destination " + destination);
                    }
                    StringBuilder sbW = s.w("Navigation destination ", displayName, " referenced from action ");
                    sbW.append(companion.getDisplayName(this.context, i));
                    sbW.append(" cannot be found from the current destination ");
                    sbW.append(destination);
                    throw new IllegalArgumentException(sbW.toString().toString());
                }
                navigate(navDestinationFindDestination, bundle2, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        throw new IllegalStateException("no current navigation node");
    }

    @MainThread
    public final boolean popBackStack(String route, boolean z4, boolean z5) {
        j.g(route, "route");
        return popBackStack(NavDestination.Companion.createRoute(route).hashCode(), z4, z5);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(String destinationRoute) {
        NavGraph destination;
        NavGraph parent;
        j.g(destinationRoute, "destinationRoute");
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        j.d(navGraph);
        if (j.b(navGraph.getRoute(), destinationRoute)) {
            return this._graph;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) getBackQueue().e();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            j.d(destination);
        }
        if (destination instanceof NavGraph) {
            parent = destination;
        } else {
            parent = destination.getParent();
            j.d(parent);
        }
        return parent.findNode(destinationRoute);
    }

    public final NavBackStackEntry getBackStackEntry(String route) {
        NavBackStackEntry navBackStackEntryPrevious;
        j.g(route, "route");
        C1124j<NavBackStackEntry> backQueue = getBackQueue();
        ListIterator<NavBackStackEntry> listIterator = backQueue.listIterator(backQueue.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            if (j.b(navBackStackEntryPrevious.getDestination().getRoute(), route)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sbW = s.w("No destination with route ", route, " is on the NavController's back stack. The current destination is ");
        sbW.append(getCurrentDestination());
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    @MainThread
    public void navigate(Uri deepLink) {
        j.g(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null));
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions) {
        j.g(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions, Navigator.Extras extras) {
        j.g(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, extras);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request) {
        j.g(request, "request");
        navigate(request, (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions) {
        j.g(request, "request");
        navigate(request, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions, Navigator.Extras extras) {
        j.g(request, "request");
        NavGraph navGraph = this._graph;
        j.d(navGraph);
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = navGraph.matchDeepLink(request);
        if (deepLinkMatchMatchDeepLink != null) {
            Bundle bundleAddInDefaultArgs = deepLinkMatchMatchDeepLink.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLink.getMatchingArgs());
            if (bundleAddInDefaultArgs == null) {
                bundleAddInDefaultArgs = new Bundle();
            }
            NavDestination destination = deepLinkMatchMatchDeepLink.getDestination();
            Intent intent = new Intent();
            intent.setDataAndType(request.getUri(), request.getMimeType());
            intent.setAction(request.getAction());
            bundleAddInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
            navigate(destination, bundleAddInDefaultArgs, navOptions, extras);
            return;
        }
        throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0106 A[LOOP:1: B:35:0x0100->B:37:0x0106, LOOP_END] */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void navigate(androidx.navigation.NavDestination r20, android.os.Bundle r21, androidx.navigation.NavOptions r22, androidx.navigation.Navigator.Extras r23) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    @MainThread
    public void navigate(NavDirections directions) {
        j.g(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDirections directions, NavOptions navOptions) {
        j.g(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(NavDirections directions, Navigator.Extras navigatorExtras) {
        j.g(directions, "directions");
        j.g(navigatorExtras, "navigatorExtras");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null, navigatorExtras);
    }

    public final void navigate(String route, Function1<? super NavOptionsBuilder, Unit> builder) {
        j.g(route, "route");
        j.g(builder, "builder");
        navigate$default(this, route, NavOptionsBuilderKt.navOptions(builder), null, 4, null);
    }

    public final void navigate(String route, NavOptions navOptions, Navigator.Extras extras) {
        j.g(route, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.Companion;
        Uri uri = Uri.parse(NavDestination.Companion.createRoute(route));
        j.c(uri, "Uri.parse(this)");
        navigate(companion.fromUri(uri).build(), navOptions, extras);
    }
}
