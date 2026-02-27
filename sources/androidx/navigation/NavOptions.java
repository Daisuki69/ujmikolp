package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NavOptions {
    private final int enterAnim;
    private final int exitAnim;
    private final int popEnterAnim;
    private final int popExitAnim;

    @IdRes
    private final int popUpToId;
    private final boolean popUpToInclusive;
    private String popUpToRoute;
    private final boolean popUpToSaveState;
    private final boolean restoreState;
    private final boolean singleTop;

    public static final class Builder {
        private boolean popUpToInclusive;
        private String popUpToRoute;
        private boolean popUpToSaveState;
        private boolean restoreState;
        private boolean singleTop;

        @IdRes
        private int popUpToId = -1;

        @AnimRes
        @AnimatorRes
        private int enterAnim = -1;

        @AnimRes
        @AnimatorRes
        private int exitAnim = -1;

        @AnimRes
        @AnimatorRes
        private int popEnterAnim = -1;

        @AnimRes
        @AnimatorRes
        private int popExitAnim = -1;

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i, boolean z4, boolean z5, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                z5 = false;
            }
            return builder.setPopUpTo(i, z4, z5);
        }

        public final NavOptions build() {
            String str = this.popUpToRoute;
            return str != null ? new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim) : new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final Builder setEnterAnim(@AnimRes @AnimatorRes int i) {
            this.enterAnim = i;
            return this;
        }

        public final Builder setExitAnim(@AnimRes @AnimatorRes int i) {
            this.exitAnim = i;
            return this;
        }

        public final Builder setLaunchSingleTop(boolean z4) {
            this.singleTop = z4;
            return this;
        }

        public final Builder setPopEnterAnim(@AnimRes @AnimatorRes int i) {
            this.popEnterAnim = i;
            return this;
        }

        public final Builder setPopExitAnim(@AnimRes @AnimatorRes int i) {
            this.popExitAnim = i;
            return this;
        }

        public final Builder setPopUpTo(@IdRes int i, boolean z4) {
            return setPopUpTo$default(this, i, z4, false, 4, (Object) null);
        }

        public final Builder setRestoreState(boolean z4) {
            this.restoreState = z4;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, String str, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 4) != 0) {
                z5 = false;
            }
            return builder.setPopUpTo(str, z4, z5);
        }

        public final Builder setPopUpTo(String str, boolean z4) {
            return setPopUpTo$default(this, str, z4, false, 4, (Object) null);
        }

        public final Builder setPopUpTo(@IdRes int i, boolean z4, boolean z5) {
            this.popUpToId = i;
            this.popUpToRoute = null;
            this.popUpToInclusive = z4;
            this.popUpToSaveState = z5;
            return this;
        }

        public final Builder setPopUpTo(String str, boolean z4, boolean z5) {
            this.popUpToRoute = str;
            this.popUpToId = -1;
            this.popUpToInclusive = z4;
            this.popUpToSaveState = z5;
            return this;
        }
    }

    public NavOptions(boolean z4, boolean z5, @IdRes int i, boolean z8, boolean z9, @AnimRes @AnimatorRes int i4, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11) {
        this.singleTop = z4;
        this.restoreState = z5;
        this.popUpToId = i;
        this.popUpToInclusive = z8;
        this.popUpToSaveState = z9;
        this.enterAnim = i4;
        this.exitAnim = i6;
        this.popEnterAnim = i10;
        this.popExitAnim = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NavOptions.class.equals(obj.getClass())) {
            NavOptions navOptions = (NavOptions) obj;
            if (this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && j.b(this.popUpToRoute, navOptions.popUpToRoute) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim) {
                return true;
            }
        }
        return false;
    }

    @AnimRes
    @AnimatorRes
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getExitAnim() {
        return this.exitAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    @IdRes
    public final int getPopUpTo() {
        return this.popUpToId;
    }

    @IdRes
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public int hashCode() {
        int i = ((((shouldRestoreState() ? 1 : 0) + ((shouldLaunchSingleTop() ? 1 : 0) * 31)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        return (((((((((shouldPopUpToSaveState() ? 1 : 0) + (((isPopUpToInclusive() ? 1 : 0) + ((i + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public final boolean isPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    public final boolean shouldLaunchSingleTop() {
        return this.singleTop;
    }

    public final boolean shouldPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    public final boolean shouldRestoreState() {
        return this.restoreState;
    }

    public NavOptions(boolean z4, boolean z5, String str, boolean z8, boolean z9, int i, int i4, int i6, int i10) {
        this(z4, z5, NavDestination.Companion.createRoute(str).hashCode(), z8, z9, i, i4, i6, i10);
        this.popUpToRoute = str;
    }
}
