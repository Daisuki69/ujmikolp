package androidx.navigation.ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class MenuItemKt {
    public static final boolean onNavDestinationSelected(MenuItem menuItem, NavController navController) {
        j.g(menuItem, "<this>");
        j.g(navController, "navController");
        return NavigationUI.onNavDestinationSelected(menuItem, navController);
    }
}
