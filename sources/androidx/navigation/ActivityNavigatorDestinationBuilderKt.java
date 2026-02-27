package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    public static final void activity(NavGraphBuilder navGraphBuilder, @IdRes int i, Function1<? super ActivityNavigatorDestinationBuilder, Unit> builder) {
        j.g(navGraphBuilder, "<this>");
        j.g(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), i);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final void activity(NavGraphBuilder navGraphBuilder, String route, Function1<? super ActivityNavigatorDestinationBuilder, Unit> builder) {
        j.g(navGraphBuilder, "<this>");
        j.g(route, "route");
        j.g(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), route);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}
