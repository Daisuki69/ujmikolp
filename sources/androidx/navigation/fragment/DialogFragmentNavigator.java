package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import cj.C1110A;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Navigator.Name("dialog")
public final class DialogFragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "DialogFragmentNavigator";
    private final Context context;
    private final FragmentManager fragmentManager;
    private final LifecycleEventObserver observer;
    private final Set<String> restoredTagsAwaitingAttach;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NavDestination.ClassType(DialogFragment.class)
    public static class Destination extends NavDestination implements FloatingWindow {
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> fragmentNavigator) {
            super(fragmentNavigator);
            j.g(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            return obj != null && (obj instanceof Destination) && super.equals(obj) && j.b(this._className, ((Destination) obj)._className);
        }

        public final String getClassName() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this._className;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(Context context, AttributeSet attrs) {
            j.g(context, "context");
            j.g(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.DialogFragmentNavigator);
            j.f(typedArrayObtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = typedArrayObtainAttributes.getString(R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final Destination setClassName(String className) {
            j.g(className, "className");
            this._className = className;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(DialogFragmentNavigator.class));
            j.g(navigatorProvider, "navigatorProvider");
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        j.g(context, "context");
        j.g(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new androidx.navigation.a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observer$lambda-3, reason: not valid java name */
    public static final void m119observer$lambda3(DialogFragmentNavigator this$0, LifecycleOwner source, Lifecycle.Event event) {
        Object objPrevious;
        j.g(this$0, "this$0");
        j.g(source, "source");
        j.g(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            DialogFragment dialogFragment = (DialogFragment) source;
            Iterable iterable = (Iterable) this$0.getState().getBackStack().getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (j.b(((NavBackStackEntry) it.next()).getId(), dialogFragment.getTag())) {
                        return;
                    }
                }
            }
            dialogFragment.dismiss();
            return;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            DialogFragment dialogFragment2 = (DialogFragment) source;
            if (dialogFragment2.requireDialog().isShowing()) {
                return;
            }
            List list = (List) this$0.getState().getBackStack().getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (j.b(((NavBackStackEntry) objPrevious).getId(), dialogFragment2.getTag())) {
                        break;
                    }
                }
            }
            if (objPrevious == null) {
                throw new IllegalStateException(("Dialog " + dialogFragment2 + " has already been popped off of the Navigation back stack").toString());
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (!j.b(C1110A.H(list), navBackStackEntry)) {
                Log.i(TAG, "Dialog " + dialogFragment2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            this$0.popBackStack(navBackStackEntry, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAttach$lambda-5, reason: not valid java name */
    public static final void m120onAttach$lambda5(DialogFragmentNavigator this$0, FragmentManager fragmentManager, Fragment childFragment) {
        j.g(this$0, "this$0");
        j.g(fragmentManager, "<anonymous parameter 0>");
        j.g(childFragment, "childFragment");
        Set<String> set = this$0.restoredTagsAwaitingAttach;
        if (D.a(set).remove(childFragment.getTag())) {
            childFragment.getLifecycle().addObserver(this$0.observer);
        }
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras) {
        j.g(entries, "entries");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(NavigatorState state) {
        Lifecycle lifecycle;
        j.g(state, "state");
        super.onAttach(state);
        for (NavBackStackEntry navBackStackEntry : (List) state.getBackStack().getValue()) {
            DialogFragment dialogFragment = (DialogFragment) this.fragmentManager.findFragmentByTag(navBackStackEntry.getId());
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.restoredTagsAwaitingAttach.add(navBackStackEntry.getId());
            } else {
                lifecycle.addObserver(this.observer);
            }
        }
        this.fragmentManager.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.a
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                DialogFragmentNavigator.m120onAttach$lambda5(this.f8158a, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry popUpTo, boolean z4) {
        j.g(popUpTo, "popUpTo");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) getState().getBackStack().getValue();
        Iterator it = C1110A.O(list.subList(list.indexOf(popUpTo), list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentFindFragmentByTag = this.fragmentManager.findFragmentByTag(((NavBackStackEntry) it.next()).getId());
            if (fragmentFindFragmentByTag != null) {
                fragmentFindFragmentByTag.getLifecycle().removeObserver(this.observer);
                ((DialogFragment) fragmentFindFragmentByTag).dismiss();
            }
        }
        getState().pop(popUpTo, z4);
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry) {
        Destination destination = (Destination) navBackStackEntry.getDestination();
        String className = destination.getClassName();
        if (className.charAt(0) == '.') {
            className = this.context.getPackageName() + className;
        }
        Fragment fragmentInstantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        j.f(fragmentInstantiate, "fragmentManager.fragment…ader, className\n        )");
        if (DialogFragment.class.isAssignableFrom(fragmentInstantiate.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) fragmentInstantiate;
            dialogFragment.setArguments(navBackStackEntry.getArguments());
            dialogFragment.getLifecycle().addObserver(this.observer);
            dialogFragment.show(this.fragmentManager, navBackStackEntry.getId());
            getState().push(navBackStackEntry);
            return;
        }
        throw new IllegalArgumentException(("Dialog destination " + destination.getClassName() + " is not an instance of DialogFragment").toString());
    }
}
