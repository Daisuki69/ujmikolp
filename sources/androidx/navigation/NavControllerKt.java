package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NavControllerKt {
    public static final NavGraph createGraph(NavController navController, @IdRes int i, @IdRes int i4, Function1<? super NavGraphBuilder, Unit> builder) {
        j.g(navController, "<this>");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), i, i4);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, int i, int i4, Function1 builder, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        j.g(navController, "<this>");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), i, i4);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph createGraph(NavController navController, String startDestination, String str, Function1<? super NavGraphBuilder, Unit> builder) {
        j.g(navController, "<this>");
        j.g(startDestination, "startDestination");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, String startDestination, String str, Function1 builder, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        j.g(navController, "<this>");
        j.g(startDestination, "startDestination");
        j.g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
