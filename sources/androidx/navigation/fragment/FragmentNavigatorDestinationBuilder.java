package androidx.navigation.fragment;

import X5.f;
import androidx.annotation.IdRes;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes2.dex */
@NavDestinationDsl
public final class FragmentNavigatorDestinationBuilder extends NavDestinationBuilder<FragmentNavigator.Destination> {
    private InterfaceC2488d fragmentClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigatorDestinationBuilder(FragmentNavigator navigator, @IdRes int i, InterfaceC2488d fragmentClass) {
        super(navigator, i);
        j.g(navigator, "navigator");
        j.g(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public FragmentNavigator.Destination build() {
        FragmentNavigator.Destination destination = (FragmentNavigator.Destination) super.build();
        destination.setClassName(f.n(this.fragmentClass).getName());
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigatorDestinationBuilder(FragmentNavigator navigator, String route, InterfaceC2488d fragmentClass) {
        super(navigator, route);
        j.g(navigator, "navigator");
        j.g(route, "route");
        j.g(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }
}
