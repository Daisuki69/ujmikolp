package androidx.navigation.ui;

import Gb.n;
import Xa.c;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.widget.Openable;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.profileinstaller.ProfileVerifier;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationUI {
    public static final NavigationUI INSTANCE = new NavigationUI();

    private NavigationUI() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final BottomSheetBehavior<?> findBottomSheetBehavior(View view) {
        j.g(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return findBottomSheetBehavior((View) parent);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$setupWithNavController$-Landroidx-appcompat-widget-Toolbar-Landroidx-navigation-NavController-Landroidx-navigation-ui-AppBarConfiguration--V, reason: not valid java name */
    public static /* synthetic */ void m121x4b1ca597(NavController navController, AppBarConfiguration appBarConfiguration, View view) {
        Callback.onClick_enter(view);
        try {
            m123setupWithNavController$lambda1(navController, appBarConfiguration, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$setupWithNavController$-Lcom-google-android-material-appbar-CollapsingToolbarLayout-Landroidx-appcompat-widget-Toolbar-Landroidx-navigation-NavController-Landroidx-navigation-ui-AppBarConfiguration--V, reason: not valid java name */
    public static /* synthetic */ void m122xd53ea1d8(NavController navController, AppBarConfiguration appBarConfiguration, View view) {
        Callback.onClick_enter(view);
        try {
            m124setupWithNavController$lambda2(navController, appBarConfiguration, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final boolean matchDestination$navigation_ui_release(NavDestination navDestination, @IdRes int i) {
        j.g(navDestination, "<this>");
        Iterator it = NavDestination.Companion.getHierarchy(navDestination).iterator();
        while (it.hasNext()) {
            if (((NavDestination) it.next()).getId() == i) {
                return true;
            }
        }
        return false;
    }

    public static final boolean matchDestinations$navigation_ui_release(NavDestination navDestination, Set<Integer> destinationIds) {
        j.g(navDestination, "<this>");
        j.g(destinationIds, "destinationIds");
        Iterator it = NavDestination.Companion.getHierarchy(navDestination).iterator();
        while (it.hasNext()) {
            if (destinationIds.contains(Integer.valueOf(((NavDestination) it.next()).getId()))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean navigateUp(NavController navController, Openable openable) {
        j.g(navController, "navController");
        return navigateUp(navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController) {
        j.g(item, "item");
        j.g(navController, "navController");
        NavOptions.Builder restoreState = new NavOptions.Builder().setLaunchSingleTop(true).setRestoreState(true);
        NavDestination currentDestination = navController.getCurrentDestination();
        j.d(currentDestination);
        NavGraph parent = currentDestination.getParent();
        j.d(parent);
        if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
            restoreState.setEnterAnim(R.anim.nav_default_enter_anim).setExitAnim(R.anim.nav_default_exit_anim).setPopEnterAnim(R.anim.nav_default_pop_enter_anim).setPopExitAnim(R.anim.nav_default_pop_exit_anim);
        } else {
            restoreState.setEnterAnim(R.animator.nav_default_enter_anim).setExitAnim(R.animator.nav_default_exit_anim).setPopEnterAnim(R.animator.nav_default_pop_enter_anim).setPopExitAnim(R.animator.nav_default_pop_exit_anim);
        }
        if ((item.getOrder() & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            restoreState.setPopUpTo(NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), false, true);
        }
        try {
            navController.navigate(item.getItemId(), (Bundle) null, restoreState.build());
            NavDestination currentDestination2 = navController.getCurrentDestination();
            if (currentDestination2 != null) {
                if (matchDestination$navigation_ui_release(currentDestination2, item.getItemId())) {
                    return true;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController) {
        j.g(activity, "activity");
        j.g(navController, "navController");
        setupActionBarWithNavController$default(activity, navController, null, 4, null);
    }

    public static /* synthetic */ void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration appBarConfiguration, int i, Object obj) {
        if ((i & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupActionBarWithNavController(appCompatActivity, navController, appBarConfiguration);
    }

    public static final void setupWithNavController(Toolbar toolbar, NavController navController) {
        j.g(toolbar, "toolbar");
        j.g(navController, "navController");
        setupWithNavController$default(toolbar, navController, null, 4, null);
    }

    public static /* synthetic */ void setupWithNavController$default(Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i, Object obj) {
        if ((i & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(toolbar, navController, appBarConfiguration);
    }

    /* JADX INFO: renamed from: setupWithNavController$lambda-1, reason: not valid java name */
    private static final void m123setupWithNavController$lambda1(NavController navController, AppBarConfiguration configuration, View view) {
        j.g(navController, "$navController");
        j.g(configuration, "$configuration");
        navigateUp(navController, configuration);
    }

    /* JADX INFO: renamed from: setupWithNavController$lambda-2, reason: not valid java name */
    private static final void m124setupWithNavController$lambda2(NavController navController, AppBarConfiguration configuration, View view) {
        j.g(navController, "$navController");
        j.g(configuration, "$configuration");
        navigateUp(navController, configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-3, reason: not valid java name */
    public static final boolean m125setupWithNavController$lambda3(NavController navController, NavigationView navigationView, MenuItem item) {
        j.g(navController, "$navController");
        j.g(navigationView, "$navigationView");
        j.g(item, "item");
        boolean zOnNavDestinationSelected = onNavDestinationSelected(item, navController);
        if (zOnNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
                return zOnNavDestinationSelected;
            }
            BottomSheetBehavior<?> bottomSheetBehaviorFindBottomSheetBehavior = findBottomSheetBehavior(navigationView);
            if (bottomSheetBehaviorFindBottomSheetBehavior != null) {
                bottomSheetBehaviorFindBottomSheetBehavior.setState(5);
            }
        }
        return zOnNavDestinationSelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-5, reason: not valid java name */
    public static final boolean m126setupWithNavController$lambda5(NavController navController, boolean z4, NavigationView navigationView, MenuItem item) {
        j.g(navController, "$navController");
        j.g(navigationView, "$navigationView");
        j.g(item, "item");
        boolean zOnNavDestinationSelected = onNavDestinationSelected(item, navController, z4);
        if (zOnNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
                return zOnNavDestinationSelected;
            }
            BottomSheetBehavior<?> bottomSheetBehaviorFindBottomSheetBehavior = findBottomSheetBehavior(navigationView);
            if (bottomSheetBehaviorFindBottomSheetBehavior != null) {
                bottomSheetBehaviorFindBottomSheetBehavior.setState(5);
            }
        }
        return zOnNavDestinationSelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-6, reason: not valid java name */
    public static final boolean m127setupWithNavController$lambda6(NavController navController, MenuItem item) {
        j.g(navController, "$navController");
        j.g(item, "item");
        return onNavDestinationSelected(item, navController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-8, reason: not valid java name */
    public static final boolean m128setupWithNavController$lambda8(NavController navController, boolean z4, MenuItem item) {
        j.g(navController, "$navController");
        j.g(item, "item");
        return onNavDestinationSelected(item, navController, z4);
    }

    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController, Openable openable) {
        j.g(activity, "activity");
        j.g(navController, "navController");
        setupActionBarWithNavController(activity, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController) {
        j.g(collapsingToolbarLayout, "collapsingToolbarLayout");
        j.g(toolbar, "toolbar");
        j.g(navController, "navController");
        setupWithNavController$default(collapsingToolbarLayout, toolbar, navController, null, 8, null);
    }

    public static final void setupWithNavController(Toolbar toolbar, NavController navController, Openable openable) {
        j.g(toolbar, "toolbar");
        j.g(navController, "navController");
        setupWithNavController(toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static /* synthetic */ void setupWithNavController$default(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i, Object obj) {
        if ((i & 8) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }

    public static final boolean navigateUp(NavController navController, AppBarConfiguration configuration) {
        j.g(navController, "navController");
        j.g(configuration, "configuration");
        Openable openableLayout = configuration.getOpenableLayout();
        NavDestination currentDestination = navController.getCurrentDestination();
        Set<Integer> topLevelDestinations = configuration.getTopLevelDestinations();
        if (openableLayout != null && currentDestination != null && matchDestinations$navigation_ui_release(currentDestination, topLevelDestinations)) {
            openableLayout.open();
            return true;
        }
        if (navController.navigateUp()) {
            return true;
        }
        AppBarConfiguration.OnNavigateUpListener fallbackOnNavigateUpListener = configuration.getFallbackOnNavigateUpListener();
        if (fallbackOnNavigateUpListener != null) {
            return fallbackOnNavigateUpListener.onNavigateUp();
        }
        return false;
    }

    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController, AppBarConfiguration configuration) {
        j.g(activity, "activity");
        j.g(navController, "navController");
        j.g(configuration, "configuration");
        navController.addOnDestinationChangedListener(new ActionBarOnDestinationChangedListener(activity, configuration));
    }

    public static final void setupWithNavController(Toolbar toolbar, NavController navController, AppBarConfiguration configuration) {
        j.g(toolbar, "toolbar");
        j.g(navController, "navController");
        j.g(configuration, "configuration");
        navController.addOnDestinationChangedListener(new ToolbarOnDestinationChangedListener(toolbar, configuration));
        toolbar.setNavigationOnClickListener(new a(navController, configuration, 0));
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, Openable openable) {
        j.g(collapsingToolbarLayout, "collapsingToolbarLayout");
        j.g(toolbar, "toolbar");
        j.g(navController, "navController");
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration configuration) {
        j.g(collapsingToolbarLayout, "collapsingToolbarLayout");
        j.g(toolbar, "toolbar");
        j.g(navController, "navController");
        j.g(configuration, "configuration");
        navController.addOnDestinationChangedListener(new CollapsingToolbarOnDestinationChangedListener(collapsingToolbarLayout, toolbar, configuration));
        toolbar.setNavigationOnClickListener(new a(navController, configuration, 1));
    }

    @NavigationUiSaveStateControl
    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController, boolean z4) {
        j.g(item, "item");
        j.g(navController, "navController");
        if (!z4) {
            NavOptions.Builder launchSingleTop = new NavOptions.Builder().setLaunchSingleTop(true);
            NavDestination currentDestination = navController.getCurrentDestination();
            j.d(currentDestination);
            NavGraph parent = currentDestination.getParent();
            j.d(parent);
            if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
                launchSingleTop.setEnterAnim(R.anim.nav_default_enter_anim).setExitAnim(R.anim.nav_default_exit_anim).setPopEnterAnim(R.anim.nav_default_pop_enter_anim).setPopExitAnim(R.anim.nav_default_pop_exit_anim);
            } else {
                launchSingleTop.setEnterAnim(R.animator.nav_default_enter_anim).setExitAnim(R.animator.nav_default_exit_anim).setPopEnterAnim(R.animator.nav_default_pop_enter_anim).setPopExitAnim(R.animator.nav_default_pop_exit_anim);
            }
            if ((item.getOrder() & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                NavOptions.Builder.setPopUpTo$default(launchSingleTop, NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), false, false, 4, (Object) null);
            }
            try {
                navController.navigate(item.getItemId(), (Bundle) null, launchSingleTop.build());
                NavDestination currentDestination2 = navController.getCurrentDestination();
                if (currentDestination2 != null) {
                    if (matchDestination$navigation_ui_release(currentDestination2, item.getItemId())) {
                        return true;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return false;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
    }

    public static final void setupWithNavController(NavigationView navigationView, final NavController navController) {
        j.g(navigationView, "navigationView");
        j.g(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new androidx.camera.lifecycle.a(14, navController, navigationView));
        final WeakReference weakReference = new WeakReference(navigationView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.4
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                j.g(controller, "controller");
                j.g(destination, "destination");
                NavigationView navigationView2 = weakReference.get();
                if (navigationView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                Menu menu = navigationView2.getMenu();
                j.f(menu, "view.menu");
                int size = menu.size();
                for (int i = 0; i < size; i++) {
                    MenuItem item = menu.getItem(i);
                    j.c(item, "getItem(index)");
                    item.setChecked(NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId()));
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    public static final void setupWithNavController(NavigationView navigationView, final NavController navController, boolean z4) {
        j.g(navigationView, "navigationView");
        j.g(navController, "navController");
        if (!z4) {
            navigationView.setNavigationItemSelectedListener(new b(navigationView, navController, z4));
            final WeakReference weakReference = new WeakReference(navigationView);
            navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.7
                @Override // androidx.navigation.NavController.OnDestinationChangedListener
                public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                    j.g(controller, "controller");
                    j.g(destination, "destination");
                    NavigationView navigationView2 = weakReference.get();
                    if (navigationView2 == null) {
                        navController.removeOnDestinationChangedListener(this);
                        return;
                    }
                    Menu menu = navigationView2.getMenu();
                    j.f(menu, "view.menu");
                    int size = menu.size();
                    for (int i = 0; i < size; i++) {
                        MenuItem item = menu.getItem(i);
                        j.c(item, "getItem(index)");
                        item.setChecked(NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId()));
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
    }

    public static final void setupWithNavController(NavigationBarView navigationBarView, final NavController navController) {
        j.g(navigationBarView, "navigationBarView");
        j.g(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new c(navController, 28));
        final WeakReference weakReference = new WeakReference(navigationBarView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.9
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                j.g(controller, "controller");
                j.g(destination, "destination");
                NavigationBarView navigationBarView2 = weakReference.get();
                if (navigationBarView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                Menu menu = navigationBarView2.getMenu();
                j.f(menu, "view.menu");
                int size = menu.size();
                for (int i = 0; i < size; i++) {
                    MenuItem item = menu.getItem(i);
                    j.c(item, "getItem(index)");
                    if (NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId())) {
                        item.setChecked(true);
                    }
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    public static final void setupWithNavController(NavigationBarView navigationBarView, final NavController navController, boolean z4) {
        j.g(navigationBarView, "navigationBarView");
        j.g(navController, "navController");
        if (!z4) {
            navigationBarView.setOnItemSelectedListener(new n(navController, z4, 3));
            final WeakReference weakReference = new WeakReference(navigationBarView);
            navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.12
                @Override // androidx.navigation.NavController.OnDestinationChangedListener
                public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                    j.g(controller, "controller");
                    j.g(destination, "destination");
                    NavigationBarView navigationBarView2 = weakReference.get();
                    if (navigationBarView2 == null) {
                        navController.removeOnDestinationChangedListener(this);
                        return;
                    }
                    Menu menu = navigationBarView2.getMenu();
                    j.f(menu, "view.menu");
                    int size = menu.size();
                    for (int i = 0; i < size; i++) {
                        MenuItem item = menu.getItem(i);
                        j.c(item, "getItem(index)");
                        if (NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId())) {
                            item.setChecked(true);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
    }
}
