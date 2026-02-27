package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NavGraphBuilderKt {
    public static final NavGraph navigation(NavigatorProvider navigatorProvider, @IdRes int i, @IdRes int i4, Function1<? super NavGraphBuilder, Unit> builder) {
        j.g(navigatorProvider, "<this>");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i, i4);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, int i, int i4, Function1 builder, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        j.g(navigatorProvider, "<this>");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i, i4);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, String startDestination, String str, Function1<? super NavGraphBuilder, Unit> builder) {
        j.g(navigatorProvider, "<this>");
        j.g(startDestination, "startDestination");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, String startDestination, String str, Function1 builder, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        j.g(navigatorProvider, "<this>");
        j.g(startDestination, "startDestination");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, @IdRes int i, @IdRes int i4, Function1<? super NavGraphBuilder, Unit> builder) {
        j.g(navGraphBuilder, "<this>");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), i, i4);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String startDestination, String route, Function1<? super NavGraphBuilder, Unit> builder) {
        j.g(navGraphBuilder, "<this>");
        j.g(startDestination, "startDestination");
        j.g(route, "route");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }
}
