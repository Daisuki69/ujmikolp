package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import androidx.work.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes2.dex */
public final class IndividualNetworkCallback$Companion$addCallback$1 extends k implements Function0<Unit> {
    final /* synthetic */ u $callbackRegistered;
    final /* synthetic */ ConnectivityManager $connManager;
    final /* synthetic */ IndividualNetworkCallback $networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndividualNetworkCallback$Companion$addCallback$1(u uVar, ConnectivityManager connectivityManager, IndividualNetworkCallback individualNetworkCallback) {
        super(0);
        this.$callbackRegistered = uVar;
        this.$connManager = connectivityManager;
        this.$networkCallback = individualNetworkCallback;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m141invoke();
        return Unit.f18162a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m141invoke() {
        if (this.$callbackRegistered.f18191a) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister callback");
            this.$connManager.unregisterNetworkCallback(this.$networkCallback);
        }
    }
}
