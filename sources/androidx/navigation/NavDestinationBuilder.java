package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@NavDestinationDsl
public class NavDestinationBuilder<D extends NavDestination> {
    private Map<Integer, NavAction> actions;
    private Map<String, NavArgument> arguments;
    private List<NavDeepLink> deepLinks;
    private final int id;
    private CharSequence label;
    private final Navigator<? extends D> navigator;
    private final String route;

    public NavDestinationBuilder(Navigator<? extends D> navigator, @IdRes int i, String str) {
        j.g(navigator, "navigator");
        this.navigator = navigator;
        this.id = i;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    public final void action(int i, Function1<? super NavActionBuilder, Unit> actionBuilder) {
        j.g(actionBuilder, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer numValueOf = Integer.valueOf(i);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        actionBuilder.invoke(navActionBuilder);
        map.put(numValueOf, navActionBuilder.build$navigation_common_release());
    }

    public final void argument(String name, Function1<? super NavArgumentBuilder, Unit> argumentBuilder) {
        j.g(name, "name");
        j.g(argumentBuilder, "argumentBuilder");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        argumentBuilder.invoke(navArgumentBuilder);
        map.put(name, navArgumentBuilder.build());
    }

    public D build() {
        D d10 = (D) this.navigator.createDestination();
        String str = this.route;
        if (str != null) {
            d10.setRoute(str);
        }
        int i = this.id;
        if (i != -1) {
            d10.setId(i);
        }
        d10.setLabel(this.label);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            d10.addArgument(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            d10.addDeepLink((NavDeepLink) it.next());
        }
        for (Map.Entry<Integer, NavAction> entry2 : this.actions.entrySet()) {
            d10.putAction(entry2.getKey().intValue(), entry2.getValue());
        }
        return d10;
    }

    public final void deepLink(String uriPattern) {
        j.g(uriPattern, "uriPattern");
        this.deepLinks.add(new NavDeepLink(uriPattern));
    }

    public final int getId() {
        return this.id;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    public final String getRoute() {
        return this.route;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void deepLink(Function1<? super NavDeepLinkDslBuilder, Unit> navDeepLink) {
        j.g(navDeepLink, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        navDeepLink.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_release());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, @IdRes int i) {
        this(navigator, i, null);
        j.g(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, String str) {
        this(navigator, -1, str);
        j.g(navigator, "navigator");
    }
}
