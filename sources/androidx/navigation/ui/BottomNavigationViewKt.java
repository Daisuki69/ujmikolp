package androidx.navigation.ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class BottomNavigationViewKt {
    public static final void setupWithNavController(NavigationBarView navigationBarView, NavController navController) {
        j.g(navigationBarView, "<this>");
        j.g(navController, "navController");
        NavigationUI.setupWithNavController(navigationBarView, navController);
    }
}
