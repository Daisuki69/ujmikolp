package androidx.navigation;

import M6.e;
import Y6.o;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;
import com.dynatrace.android.callback.Callback;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import yj.n;
import yj.q;

/* JADX INFO: loaded from: classes2.dex */
public final class Navigation {
    public static final Navigation INSTANCE = new Navigation();

    /* JADX INFO: renamed from: androidx.navigation.Navigation$findViewNavController$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<View, View> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(View it) {
            j.g(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.Navigation$findViewNavController$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function1<View, NavController> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NavController invoke(View it) {
            j.g(it, "it");
            return Navigation.INSTANCE.getViewNavController(it);
        }
    }

    private Navigation() {
    }

    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int i) {
        return createNavigateOnClickListener$default(i, null, 2, null);
    }

    public static /* synthetic */ View.OnClickListener createNavigateOnClickListener$default(int i, Bundle bundle, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i, bundle);
    }

    /* JADX INFO: renamed from: createNavigateOnClickListener$lambda-0, reason: not valid java name */
    private static final void m115createNavigateOnClickListener$lambda0(int i, Bundle bundle, View view) {
        j.f(view, "view");
        findNavController(view).navigate(i, bundle);
    }

    /* JADX INFO: renamed from: createNavigateOnClickListener$lambda-1, reason: not valid java name */
    private static final void m116createNavigateOnClickListener$lambda1(NavDirections directions, View view) {
        j.g(directions, "$directions");
        j.f(view, "view");
        findNavController(view).navigate(directions);
    }

    public static final NavController findNavController(Activity activity, @IdRes int i) {
        j.g(activity, "activity");
        View viewRequireViewById = ActivityCompat.requireViewById(activity, i);
        j.f(viewRequireViewById, "requireViewById<View>(activity, viewId)");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(viewRequireViewById);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    private final NavController findViewNavController(View view) {
        return (NavController) q.k(q.o(n.e(AnonymousClass1.INSTANCE, view), AnonymousClass2.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController getViewNavController(View view) {
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$createNavigateOnClickListener$-ILandroid-os-Bundle--Landroid-view-View$OnClickListener-, reason: not valid java name */
    public static /* synthetic */ void m117x54c2312e(int i, Bundle bundle, View view) {
        Callback.onClick_enter(view);
        try {
            m115createNavigateOnClickListener$lambda0(i, bundle, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$createNavigateOnClickListener$-Landroidx-navigation-NavDirections--Landroid-view-View$OnClickListener-, reason: not valid java name */
    public static /* synthetic */ void m118xe87b8eb4(NavDirections navDirections, View view) {
        Callback.onClick_enter(view);
        try {
            m116createNavigateOnClickListener$lambda1(navDirections, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final void setViewNavController(View view, NavController navController) {
        j.g(view, "view");
        view.setTag(R.id.nav_controller_view_tag, navController);
    }

    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int i, Bundle bundle) {
        return new e(i, bundle);
    }

    public static final View.OnClickListener createNavigateOnClickListener(NavDirections directions) {
        j.g(directions, "directions");
        return new o(directions, 9);
    }

    public static final NavController findNavController(View view) {
        j.g(view, "view");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(view);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
