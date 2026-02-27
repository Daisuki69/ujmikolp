package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentNavigatorExtrasKt {
    public static final FragmentNavigator.Extras FragmentNavigatorExtras(Pair<? extends View, String>... sharedElements) {
        j.g(sharedElements, "sharedElements");
        FragmentNavigator.Extras.Builder builder = new FragmentNavigator.Extras.Builder();
        for (Pair<? extends View, String> pair : sharedElements) {
            builder.addSharedElement((View) pair.f18160a, (String) pair.f18161b);
        }
        return builder.build();
    }
}
