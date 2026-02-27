package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.navigation.NavDestination;
import cj.C1110A;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import yj.e;
import yj.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Navigator<D extends NavDestination> {
    private NavigatorState _state;
    private boolean isAttached;

    public interface Extras {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Name {
        String value();
    }

    /* JADX INFO: renamed from: androidx.navigation.Navigator$navigate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<NavBackStackEntry, NavBackStackEntry> {
        final /* synthetic */ NavOptions $navOptions;
        final /* synthetic */ Extras $navigatorExtras;
        final /* synthetic */ Navigator<D> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Navigator<D> navigator, NavOptions navOptions, Extras extras) {
            super(1);
            this.this$0 = navigator;
            this.$navOptions = navOptions;
            this.$navigatorExtras = extras;
        }

        @Override // kotlin.jvm.functions.Function1
        public final NavBackStackEntry invoke(NavBackStackEntry backStackEntry) {
            NavDestination navDestinationNavigate;
            j.g(backStackEntry, "backStackEntry");
            NavDestination destination = backStackEntry.getDestination();
            if (!(destination != null)) {
                destination = null;
            }
            if (destination == null || (navDestinationNavigate = this.this$0.navigate(destination, backStackEntry.getArguments(), this.$navOptions, this.$navigatorExtras)) == null) {
                return null;
            }
            return navDestinationNavigate.equals(destination) ? backStackEntry : this.this$0.getState().createBackStackEntry(navDestinationNavigate, navDestinationNavigate.addInDefaultArgs(backStackEntry.getArguments()));
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.Navigator$onLaunchSingleTop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08151 extends k implements Function1<NavOptionsBuilder, Unit> {
        public static final C08151 INSTANCE = new C08151();

        public C08151() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NavOptionsBuilder) obj);
            return Unit.f18162a;
        }

        public final void invoke(NavOptionsBuilder navOptions) {
            j.g(navOptions, "$this$navOptions");
            navOptions.setLaunchSingleTop(true);
        }
    }

    public abstract D createDestination();

    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public NavDestination navigate(D destination, Bundle bundle, NavOptions navOptions, Extras extras) {
        j.g(destination, "destination");
        return destination;
    }

    @CallSuper
    public void onAttach(NavigatorState state) {
        j.g(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        j.g(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (!(destination != null)) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(C08151.INSTANCE), null);
        getState().onLaunchSingleTop(backStackEntry);
    }

    public void onRestoreState(Bundle savedState) {
        j.g(savedState, "savedState");
    }

    public Bundle onSaveState() {
        return null;
    }

    public boolean popBackStack() {
        return true;
    }

    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Extras extras) {
        j.g(entries, "entries");
        e eVar = new e(q.i(q.n(C1110A.u(entries), new AnonymousClass1(this, navOptions, extras))));
        while (eVar.hasNext()) {
            getState().push((NavBackStackEntry) eVar.next());
        }
    }

    public void popBackStack(NavBackStackEntry popUpTo, boolean z4) {
        j.g(popUpTo, "popUpTo");
        List list = (List) getState().getBackStack().getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry = null;
        while (popBackStack()) {
            navBackStackEntry = (NavBackStackEntry) listIterator.previous();
            if (j.b(navBackStackEntry, popUpTo)) {
                break;
            }
        }
        if (navBackStackEntry != null) {
            getState().pop(navBackStackEntry, z4);
        }
    }
}
