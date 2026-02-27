package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NavHostKt {
    public static final NavGraph createGraph(NavHost navHost, @IdRes int i, @IdRes int i4, Function1<? super NavGraphBuilder, Unit> builder) {
        j.g(navHost, "<this>");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i, i4);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, int i, int i4, Function1 builder, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        j.g(navHost, "<this>");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i, i4);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph createGraph(NavHost navHost, String startDestination, String str, Function1<? super NavGraphBuilder, Unit> builder) {
        j.g(navHost, "<this>");
        j.g(startDestination, "startDestination");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, String startDestination, String str, Function1 builder, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        j.g(navHost, "<this>");
        j.g(startDestination, "startDestination");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
