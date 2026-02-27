package androidx.navigation.ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationViewKt {
    public static final void setupWithNavController(NavigationView navigationView, NavController navController) {
        j.g(navigationView, "<this>");
        j.g(navController, "navController");
        NavigationUI.setupWithNavController(navigationView, navController);
    }
}
