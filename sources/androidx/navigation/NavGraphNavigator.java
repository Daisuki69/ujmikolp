package androidx.navigation;

import We.s;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.navigation.Navigator;
import cj.r;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Navigator.Name(NotificationCompat.CATEGORY_NAVIGATION)
public class NavGraphNavigator extends Navigator<NavGraph> {
    private final NavigatorProvider navigatorProvider;

    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        j.g(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras extras) {
        j.g(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, extras);
        }
    }

    @Override // androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination navDestinationFindNode;
        NavGraph navGraph = (NavGraph) navBackStackEntry.getDestination();
        Bundle arguments = navBackStackEntry.getArguments();
        int startDestinationId = navGraph.getStartDestinationId();
        String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (startDestinationId == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.getDisplayName()).toString());
        }
        if (startDestinationRoute != null) {
            navDestinationFindNode = navGraph.findNode(startDestinationRoute, false);
        } else {
            navDestinationFindNode = navGraph.findNode(startDestinationId, false);
        }
        if (navDestinationFindNode != null) {
            this.navigatorProvider.getNavigator(navDestinationFindNode.getNavigatorName()).navigate(r.c(getState().createBackStackEntry(navDestinationFindNode, navDestinationFindNode.addInDefaultArgs(arguments))), navOptions, extras);
            return;
        }
        throw new IllegalArgumentException(s.j("navigation destination ", navGraph.getStartDestDisplayName(), " is not a direct child of this NavGraph"));
    }
}
