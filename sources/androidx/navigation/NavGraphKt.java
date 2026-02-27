package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NavGraphKt {
    public static final boolean contains(NavGraph navGraph, @IdRes int i) {
        j.g(navGraph, "<this>");
        return navGraph.findNode(i) != null;
    }

    public static final NavDestination get(NavGraph navGraph, @IdRes int i) {
        j.g(navGraph, "<this>");
        NavDestination navDestinationFindNode = navGraph.findNode(i);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + i + " was found in " + navGraph);
    }

    public static final void minusAssign(NavGraph navGraph, NavDestination node) {
        j.g(navGraph, "<this>");
        j.g(node, "node");
        navGraph.remove(node);
    }

    public static final void plusAssign(NavGraph navGraph, NavDestination node) {
        j.g(navGraph, "<this>");
        j.g(node, "node");
        navGraph.addDestination(node);
    }

    public static final boolean contains(NavGraph navGraph, String route) {
        j.g(navGraph, "<this>");
        j.g(route, "route");
        return navGraph.findNode(route) != null;
    }

    public static final NavDestination get(NavGraph navGraph, String route) {
        j.g(navGraph, "<this>");
        j.g(route, "route");
        NavDestination navDestinationFindNode = navGraph.findNode(route);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final void plusAssign(NavGraph navGraph, NavGraph other) {
        j.g(navGraph, "<this>");
        j.g(other, "other");
        navGraph.addAll(other);
    }
}
