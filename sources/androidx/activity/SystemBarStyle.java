package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final Function1<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i4, Function1 function1, int i6, Object obj) {
            if ((i6 & 4) != 0) {
                function1 = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i, i4, function1);
        }

        public final SystemBarStyle auto(@ColorInt int i, @ColorInt int i4) {
            return auto$default(this, i, i4, null, 4, null);
        }

        public final SystemBarStyle dark(@ColorInt int i) {
            return new SystemBarStyle(i, i, 2, SystemBarStyle$Companion$dark$1.INSTANCE, null);
        }

        public final SystemBarStyle light(@ColorInt int i, @ColorInt int i4) {
            return new SystemBarStyle(i, i4, 1, SystemBarStyle$Companion$light$1.INSTANCE, null);
        }

        private Companion() {
        }

        public final SystemBarStyle auto(@ColorInt int i, @ColorInt int i4, Function1<? super Resources, Boolean> detectDarkMode) {
            kotlin.jvm.internal.j.g(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i, i4, 0, detectDarkMode, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i, int i4, int i6, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i4, i6, function1);
    }

    public static final SystemBarStyle auto(@ColorInt int i, @ColorInt int i4) {
        return Companion.auto(i, i4);
    }

    public static final SystemBarStyle dark(@ColorInt int i) {
        return Companion.dark(i);
    }

    public static final SystemBarStyle light(@ColorInt int i, @ColorInt int i4) {
        return Companion.light(i, i4);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final Function1<Resources, Boolean> getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z4) {
        return z4 ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z4) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z4 ? this.darkScrim : this.lightScrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i, int i4, int i6, Function1<? super Resources, Boolean> function1) {
        this.lightScrim = i;
        this.darkScrim = i4;
        this.nightMode = i6;
        this.detectDarkMode = function1;
    }

    public static final SystemBarStyle auto(@ColorInt int i, @ColorInt int i4, Function1<? super Resources, Boolean> function1) {
        return Companion.auto(i, i4, function1);
    }
}
