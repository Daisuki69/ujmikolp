package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class NavGraph$Companion$findStartDestination$1 extends k implements Function1<NavDestination, NavDestination> {
    public static final NavGraph$Companion$findStartDestination$1 INSTANCE = new NavGraph$Companion$findStartDestination$1();

    public NavGraph$Companion$findStartDestination$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NavDestination invoke(NavDestination it) {
        j.g(it, "it");
        if (!(it instanceof NavGraph)) {
            return null;
        }
        NavGraph navGraph = (NavGraph) it;
        return navGraph.findNode(navGraph.getStartDestinationId());
    }
}
