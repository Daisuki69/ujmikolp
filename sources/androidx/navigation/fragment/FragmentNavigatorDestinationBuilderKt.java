package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentNavigatorDestinationBuilderKt {
    public static final <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, @IdRes int i, Function1<? super FragmentNavigatorDestinationBuilder, Unit> builder) {
        j.g(navGraphBuilder, "<this>");
        j.g(builder, "builder");
        j.m();
        throw null;
    }

    public static final <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, String route, Function1<? super FragmentNavigatorDestinationBuilder, Unit> builder) {
        j.g(navGraphBuilder, "<this>");
        j.g(route, "route");
        j.g(builder, "builder");
        j.m();
        throw null;
    }

    public static final <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, @IdRes int i) {
        j.g(navGraphBuilder, "<this>");
        j.m();
        throw null;
    }

    public static final <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, String route) {
        j.g(navGraphBuilder, "<this>");
        j.g(route, "route");
        j.m();
        throw null;
    }
}
