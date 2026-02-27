package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
final class IndividualNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final Companion Companion = new Companion(null);
    private final Function1<ConstraintsState, Unit> onConstraintState;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function0<Unit> addCallback(ConnectivityManager connManager, NetworkRequest networkRequest, Function1<? super ConstraintsState, Unit> onConstraintState) {
            j.g(connManager, "connManager");
            j.g(networkRequest, "networkRequest");
            j.g(onConstraintState, "onConstraintState");
            IndividualNetworkCallback individualNetworkCallback = new IndividualNetworkCallback(onConstraintState, null);
            u uVar = new u();
            try {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, individualNetworkCallback);
                uVar.f18191a = true;
            } catch (RuntimeException e) {
                if (!z.n(e.getClass().getName(), 2, "TooManyRequestsException", false)) {
                    throw e;
                }
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController couldn't register callback", e);
                onConstraintState.invoke(new ConstraintsState.ConstraintsNotMet(7));
            }
            return new IndividualNetworkCallback$Companion$addCallback$1(uVar, connManager, individualNetworkCallback);
        }

        private Companion() {
        }
    }

    public /* synthetic */ IndividualNetworkCallback(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        j.g(network, "network");
        j.g(networkCapabilities, "networkCapabilities");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(ConstraintsState.ConstraintsMet.INSTANCE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        j.g(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new ConstraintsState.ConstraintsNotMet(7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private IndividualNetworkCallback(Function1<? super ConstraintsState, Unit> function1) {
        this.onConstraintState = function1;
    }
}
