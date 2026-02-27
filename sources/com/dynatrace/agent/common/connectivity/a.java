package com.dynatrace.agent.common.connectivity;

import com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetworkConnectivityCheckerImpl f9582b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl, Object obj, int i) {
        this.f9581a = i;
        this.f9582b = networkConnectivityCheckerImpl;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9581a) {
            case 0:
                return NetworkConnectivityCheckerImpl.AnonymousClass1.invokeSuspend$lambda$0(this.f9582b, (NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1) this.c);
            default:
                return NetworkConnectivityCheckerImpl.C11391.invokeSuspend$lambda$0(this.f9582b, (NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1) this.c);
        }
    }
}
