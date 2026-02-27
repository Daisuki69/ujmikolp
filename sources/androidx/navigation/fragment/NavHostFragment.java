package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public class NavHostFragment extends Fragment implements NavHost {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    private static final String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean defaultNavHost;
    private int graphId;
    private Boolean isPrimaryBeforeOnCreate;
    private NavHostController navHostController;
    private View viewParent;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ NavHostFragment create$default(Companion companion, int i, Bundle bundle, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                bundle = null;
            }
            return companion.create(i, bundle);
        }

        public final NavHostFragment create(@NavigationRes int i) {
            return create$default(this, i, null, 2, null);
        }

        public final NavController findNavController(Fragment fragment) {
            Dialog dialog;
            Window window;
            j.g(fragment, "fragment");
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    NavHostController navHostController = ((NavHostFragment) parentFragment).navHostController;
                    if (navHostController != null) {
                        return navHostController;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                Fragment primaryNavigationFragment = parentFragment.getParentFragmentManager().getPrimaryNavigationFragment();
                if (primaryNavigationFragment instanceof NavHostFragment) {
                    NavHostController navHostController2 = ((NavHostFragment) primaryNavigationFragment).navHostController;
                    if (navHostController2 != null) {
                        return navHostController2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return Navigation.findNavController(view);
            }
            View decorView = null;
            DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
            if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return Navigation.findNavController(decorView);
            }
            throw new IllegalStateException(androidx.camera.core.impl.a.i("Fragment ", fragment, " does not have a NavController set"));
        }

        private Companion() {
        }

        public final NavHostFragment create(@NavigationRes int i, Bundle bundle) {
            Bundle bundle2;
            if (i != 0) {
                bundle2 = new Bundle();
                bundle2.putInt(NavHostFragment.KEY_GRAPH_ID, i);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle(NavHostFragment.KEY_START_DESTINATION_ARGS, bundle);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle2 != null) {
                navHostFragment.setArguments(bundle2);
            }
            return navHostFragment;
        }
    }

    public static final NavHostFragment create(@NavigationRes int i) {
        return Companion.create(i);
    }

    public static final NavController findNavController(Fragment fragment) {
        return Companion.findNavController(fragment);
    }

    private final int getContainerId() {
        int id = getId();
        return (id == 0 || id == -1) ? R.id.nav_host_fragment_container : id;
    }

    public Navigator<? extends FragmentNavigator.Destination> createFragmentNavigator() {
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        j.f(childFragmentManager, "childFragmentManager");
        return new FragmentNavigator(contextRequireContext, childFragmentManager, getContainerId());
    }

    @Override // androidx.navigation.NavHost
    public final NavController getNavController() {
        NavHostController navHostController = this.navHostController;
        if (navHostController == null) {
            throw new IllegalStateException("NavController is not available before onCreate()");
        }
        if (navHostController != null) {
            return navHostController;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavHostController");
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        if (this.defaultNavHost) {
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.NavHostFragment.onCreate(android.os.Bundle):void");
    }

    @CallSuper
    public void onCreateNavController(NavController navController) {
        j.g(navController, "navController");
        NavigatorProvider navigatorProvider = navController.getNavigatorProvider();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        j.f(childFragmentManager, "childFragmentManager");
        navigatorProvider.addNavigator(new DialogFragmentNavigator(contextRequireContext, childFragmentManager));
        navController.getNavigatorProvider().addNavigator(createFragmentNavigator());
    }

    @CallSuper
    public void onCreateNavHostController(NavHostController navHostController) {
        j.g(navHostController, "navHostController");
        onCreateNavController(navHostController);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        Context context = inflater.getContext();
        j.f(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(getContainerId());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && Navigation.findNavController(view) == this.navHostController) {
            Navigation.setViewNavController(view, null);
        }
        this.viewParent = null;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        j.g(context, "context");
        j.g(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.navigation.R.styleable.NavHost);
        j.f(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        Unit unit = Unit.f18162a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, R.styleable.NavHostFragment);
        j.f(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onPrimaryNavigationFragmentChanged(boolean z4) {
        NavHostController navHostController = this.navHostController;
        if (navHostController == null) {
            this.isPrimaryBeforeOnCreate = Boolean.valueOf(z4);
        } else if (navHostController != null) {
            navHostController.enableOnBackPressed(z4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(Bundle outState) {
        j.g(outState, "outState");
        super.onSaveInstanceState(outState);
        NavHostController navHostController = this.navHostController;
        j.d(navHostController);
        Bundle bundleSaveState = navHostController.saveState();
        if (bundleSaveState != null) {
            outState.putBundle(KEY_NAV_CONTROLLER_STATE, bundleSaveState);
        }
        if (this.defaultNavHost) {
            outState.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
        int i = this.graphId;
        if (i != 0) {
            outState.putInt(KEY_GRAPH_ID, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        Navigation.setViewNavController(view, this.navHostController);
        if (view.getParent() != null) {
            Object parent = view.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View view2 = (View) parent;
            this.viewParent = view2;
            if (view2.getId() == getId()) {
                View view3 = this.viewParent;
                j.d(view3);
                Navigation.setViewNavController(view3, this.navHostController);
            }
        }
    }

    public static final NavHostFragment create(@NavigationRes int i, Bundle bundle) {
        return Companion.create(i, bundle);
    }
}
