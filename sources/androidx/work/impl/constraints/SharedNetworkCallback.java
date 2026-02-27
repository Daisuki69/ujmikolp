package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import cj.C1110A;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(30)
final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final SharedNetworkCallback INSTANCE = new SharedNetworkCallback();
    private static final Object requestsLock = new Object();

    @GuardedBy("requestsLock")
    private static final Map<Function1<ConstraintsState, Unit>, NetworkRequest> requests = new LinkedHashMap();

    /* JADX INFO: renamed from: androidx.work.impl.constraints.SharedNetworkCallback$addCallback$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function0<Unit> {
        final /* synthetic */ ConnectivityManager $connManager;
        final /* synthetic */ Function1<ConstraintsState, Unit> $onConstraintState;
        final /* synthetic */ SharedNetworkCallback this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super ConstraintsState, Unit> function1, ConnectivityManager connectivityManager, SharedNetworkCallback sharedNetworkCallback) {
            super(0);
            this.$onConstraintState = function1;
            this.$connManager = connectivityManager;
            this.this$0 = sharedNetworkCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m143invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m143invoke() {
            Object obj = SharedNetworkCallback.requestsLock;
            Function1<ConstraintsState, Unit> function1 = this.$onConstraintState;
            ConnectivityManager connectivityManager = this.$connManager;
            SharedNetworkCallback sharedNetworkCallback = this.this$0;
            synchronized (obj) {
                try {
                    SharedNetworkCallback.requests.remove(function1);
                    if (SharedNetworkCallback.requests.isEmpty()) {
                        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(sharedNetworkCallback);
                    }
                    Unit unit = Unit.f18162a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private SharedNetworkCallback() {
    }

    public final Function0<Unit> addCallback(ConnectivityManager connManager, NetworkRequest networkRequest, Function1<? super ConstraintsState, Unit> onConstraintState) {
        j.g(connManager, "connManager");
        j.g(networkRequest, "networkRequest");
        j.g(onConstraintState, "onConstraintState");
        synchronized (requestsLock) {
            try {
                Map<Function1<ConstraintsState, Unit>, NetworkRequest> map = requests;
                boolean zIsEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (zIsEmpty) {
                    Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(this);
                }
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new AnonymousClass2(onConstraintState, connManager, this);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listV;
        j.g(network, "network");
        j.g(networkCapabilities, "networkCapabilities");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            listV = C1110A.V(requests.entrySet());
        }
        for (Map.Entry entry : listV) {
            ((Function1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? ConstraintsState.ConstraintsMet.INSTANCE : new ConstraintsState.ConstraintsNotMet(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        List listV;
        j.g(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            listV = C1110A.V(requests.keySet());
        }
        Iterator it = listV.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(new ConstraintsState.ConstraintsNotMet(7));
        }
    }
}
