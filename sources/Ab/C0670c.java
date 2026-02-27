package ab;

import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import bj.InterfaceC1031b;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.InterfaceC1791f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: ab.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0670c implements NavController.OnDestinationChangedListener, InterfaceC1791f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaRegistrationV2Activity f7074a;

    public C0670c(MayaRegistrationV2Activity mayaRegistrationV2Activity) {
        this.f7074a = mayaRegistrationV2Activity;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof NavController.OnDestinationChangedListener) && (obj instanceof InterfaceC1791f)) {
            return getFunctionDelegate().equals(((InterfaceC1791f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC1791f
    public final InterfaceC1031b getFunctionDelegate() {
        return new i(this.f7074a, numX49.tnTj78("buHS"), 3, numX49.tnTj78("buHj"), 0, MayaRegistrationV2Activity.class);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public final void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle) {
        j.g(navController, numX49.tnTj78("buHd"));
        j.g(navDestination, numX49.tnTj78("buHi"));
        MayaRegistrationV2Activity mayaRegistrationV2Activity = this.f7074a;
        mayaRegistrationV2Activity.f13669s = mayaRegistrationV2Activity.f13670t;
        mayaRegistrationV2Activity.f13670t = Integer.valueOf(navDestination.getId());
    }
}
