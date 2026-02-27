package androidx.navigation.ui;

import androidx.navigation.ui.AppBarConfiguration;
import bj.InterfaceC1031b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InterfaceC1791f;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 implements AppBarConfiguration.OnNavigateUpListener, InterfaceC1791f {
    private final /* synthetic */ Function0 function;

    public AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(Function0 function0) {
        this.function = function0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AppBarConfiguration.OnNavigateUpListener) && (obj instanceof InterfaceC1791f)) {
            return j.b(getFunctionDelegate(), ((InterfaceC1791f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC1791f
    public final InterfaceC1031b getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener
    public final /* synthetic */ boolean onNavigateUp() {
        return ((Boolean) this.function.invoke()).booleanValue();
    }
}
