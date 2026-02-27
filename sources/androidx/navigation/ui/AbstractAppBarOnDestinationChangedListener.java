package androidx.navigation.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.customview.widget.Openable;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAppBarOnDestinationChangedListener implements NavController.OnDestinationChangedListener {
    private ValueAnimator animator;
    private DrawerArrowDrawable arrowDrawable;
    private final Context context;
    private final WeakReference<Openable> openableLayoutWeakReference;
    private final Set<Integer> topLevelDestinations;

    public AbstractAppBarOnDestinationChangedListener(Context context, AppBarConfiguration configuration) {
        j.g(context, "context");
        j.g(configuration, "configuration");
        this.context = context;
        this.topLevelDestinations = configuration.getTopLevelDestinations();
        Openable openableLayout = configuration.getOpenableLayout();
        this.openableLayoutWeakReference = openableLayout != null ? new WeakReference<>(openableLayout) : null;
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void setActionBarUpIndicator(boolean z4) {
        Pair pair;
        DrawerArrowDrawable drawerArrowDrawable = this.arrowDrawable;
        if (drawerArrowDrawable != null) {
            pair = new Pair(drawerArrowDrawable, Boolean.TRUE);
        } else {
            DrawerArrowDrawable drawerArrowDrawable2 = new DrawerArrowDrawable(this.context);
            this.arrowDrawable = drawerArrowDrawable2;
            pair = new Pair(drawerArrowDrawable2, Boolean.FALSE);
        }
        DrawerArrowDrawable drawerArrowDrawable3 = (DrawerArrowDrawable) pair.f18160a;
        boolean zBooleanValue = ((Boolean) pair.f18161b).booleanValue();
        setNavigationIcon(drawerArrowDrawable3, z4 ? R.string.nav_app_bar_open_drawer_description : R.string.nav_app_bar_navigate_up_description);
        float f = z4 ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            drawerArrowDrawable3.setProgress(f);
            return;
        }
        float progress = drawerArrowDrawable3.getProgress();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(drawerArrowDrawable3, "progress", progress, f);
        this.animator = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.animation.ObjectAnimator");
        }
        objectAnimatorOfFloat.start();
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
        j.g(controller, "controller");
        j.g(destination, "destination");
        if (destination instanceof FloatingWindow) {
            return;
        }
        WeakReference<Openable> weakReference = this.openableLayoutWeakReference;
        Openable openable = weakReference != null ? weakReference.get() : null;
        if (this.openableLayoutWeakReference != null && openable == null) {
            controller.removeOnDestinationChangedListener(this);
            return;
        }
        CharSequence label = destination.getLabel();
        if (label != null) {
            StringBuffer stringBuffer = new StringBuffer();
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(label);
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (bundle == null || !bundle.containsKey(strGroup)) {
                    throw new IllegalArgumentException("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) label) + '\"');
                }
                matcher.appendReplacement(stringBuffer, "");
                stringBuffer.append(String.valueOf(bundle.get(strGroup)));
            }
            matcher.appendTail(stringBuffer);
            setTitle(stringBuffer);
        }
        boolean zMatchDestinations$navigation_ui_release = NavigationUI.matchDestinations$navigation_ui_release(destination, this.topLevelDestinations);
        if (openable == null && zMatchDestinations$navigation_ui_release) {
            setNavigationIcon(null, 0);
        } else {
            setActionBarUpIndicator(openable != null && zMatchDestinations$navigation_ui_release);
        }
    }

    public abstract void setNavigationIcon(Drawable drawable, @StringRes int i);

    public abstract void setTitle(CharSequence charSequence);
}
