package androidx.navigation;

import X5.f;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String name) {
        j.g(navigatorProvider, "<this>");
        j.g(name, "name");
        return (T) navigatorProvider.getNavigator(name);
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        j.g(navigatorProvider, "<this>");
        j.g(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String name, Navigator<? extends NavDestination> navigator) {
        j.g(navigatorProvider, "<this>");
        j.g(name, "name");
        j.g(navigator, "navigator");
        return navigatorProvider.addNavigator(name, navigator);
    }

    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, InterfaceC2488d clazz) {
        j.g(navigatorProvider, "<this>");
        j.g(clazz, "clazz");
        return (T) navigatorProvider.getNavigator(f.n(clazz));
    }
}
