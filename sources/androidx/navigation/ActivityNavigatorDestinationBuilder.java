package androidx.navigation;

import X5.f;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.navigation.ActivityNavigator;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes2.dex */
@NavDestinationDsl
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {
    private String action;
    private InterfaceC2488d activityClass;
    private Context context;
    private Uri data;
    private String dataPattern;
    private String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, @IdRes int i) {
        super(navigator, i);
        j.g(navigator, "navigator");
        this.context = navigator.getContext();
    }

    public final String getAction() {
        return this.action;
    }

    public final InterfaceC2488d getActivityClass() {
        return this.activityClass;
    }

    public final Uri getData() {
        return this.data;
    }

    public final String getDataPattern() {
        return this.dataPattern;
    }

    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setActivityClass(InterfaceC2488d interfaceC2488d) {
        this.activityClass = interfaceC2488d;
    }

    public final void setData(Uri uri) {
        this.data = uri;
    }

    public final void setDataPattern(String str) {
        this.dataPattern = str;
    }

    public final void setTargetPackage(String str) {
        this.targetPackage = str;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        InterfaceC2488d interfaceC2488d = this.activityClass;
        if (interfaceC2488d != null) {
            destination.setComponentName(new ComponentName(this.context, (Class<?>) f.n(interfaceC2488d)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, String route) {
        super(navigator, route);
        j.g(navigator, "navigator");
        j.g(route, "route");
        this.context = navigator.getContext();
    }
}
