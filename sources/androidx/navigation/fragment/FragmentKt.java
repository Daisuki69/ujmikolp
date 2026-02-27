package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentKt {
    public static final NavController findNavController(Fragment fragment) {
        j.g(fragment, "<this>");
        return NavHostFragment.Companion.findNavController(fragment);
    }
}
