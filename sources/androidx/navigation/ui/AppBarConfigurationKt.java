package androidx.navigation.ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.navigation.NavGraph;
import androidx.navigation.ui.AppBarConfiguration;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class AppBarConfigurationKt {

    /* JADX INFO: renamed from: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$3, reason: invalid class name */
    public static final class AnonymousClass3 extends k implements Function0<Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final AppBarConfiguration AppBarConfiguration(NavGraph navGraph, Openable openable, Function0<Boolean> fallbackOnNavigateUpListener) {
        j.g(navGraph, "navGraph");
        j.g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(NavGraph navGraph, Openable openable, Function0 fallbackOnNavigateUpListener, int i, Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            fallbackOnNavigateUpListener = AnonymousClass1.INSTANCE;
        }
        j.g(navGraph, "navGraph");
        j.g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    public static final AppBarConfiguration AppBarConfiguration(Menu topLevelMenu, Openable openable, Function0<Boolean> fallbackOnNavigateUpListener) {
        j.g(topLevelMenu, "topLevelMenu");
        j.g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Menu topLevelMenu, Openable openable, Function0 fallbackOnNavigateUpListener, int i, Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            fallbackOnNavigateUpListener = AnonymousClass2.INSTANCE;
        }
        j.g(topLevelMenu, "topLevelMenu");
        j.g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    public static final AppBarConfiguration AppBarConfiguration(Set<Integer> topLevelDestinationIds, Openable openable, Function0<Boolean> fallbackOnNavigateUpListener) {
        j.g(topLevelDestinationIds, "topLevelDestinationIds");
        j.g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelDestinationIds).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Set topLevelDestinationIds, Openable openable, Function0 fallbackOnNavigateUpListener, int i, Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            fallbackOnNavigateUpListener = AnonymousClass3.INSTANCE;
        }
        j.g(topLevelDestinationIds, "topLevelDestinationIds");
        j.g(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder((Set<Integer>) topLevelDestinationIds).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }
}
