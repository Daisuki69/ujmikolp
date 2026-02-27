package com.dynatrace.agent.common.connectivity;

import Bj.E;
import Dj.q;
import Dj.r;
import Ej.S;
import Ej.W;
import Ej.e0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import bj.AbstractC1039j;
import dOYHB6.yFtIp6.ht2aO8;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import x3.d;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkConnectivityCheckerImpl implements NetworkConnectivityChecker {
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final E coroutineScope;
    private final S networkState;

    /* JADX INFO: renamed from: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1", f = "NetworkConnectivityCheckerImpl.kt", l = {162}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl, NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1 networkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1) {
            ht2aO8.unregisterReceiver(networkConnectivityCheckerImpl.context, networkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1);
            return Unit.f18162a;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = NetworkConnectivityCheckerImpl.this.new AnonymousClass1(interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                final r rVar = (r) this.L$0;
                final NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl = NetworkConnectivityCheckerImpl.this;
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerBroadcastReceiverFlow$1$receiver$1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        NetworkType networkType;
                        j.g(context, "context");
                        j.g(intent, "intent");
                        ConnectivityManager connectivityManager = networkConnectivityCheckerImpl.connectivityManager;
                        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                        boolean z4 = false;
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                            z4 = true;
                        }
                        if (activeNetworkInfo != null) {
                            int type = activeNetworkInfo.getType();
                            networkType = type != 0 ? type != 1 ? type != 9 ? NetworkType.OTHER : NetworkType.ETHERNET : NetworkType.WIFI : NetworkType.CELLULAR;
                        } else {
                            networkType = NetworkType.NONE;
                        }
                        ((q) rVar).j(new NetworkState(z4, networkType));
                    }
                };
                ht2aO8.registerReceiver(NetworkConnectivityCheckerImpl.this.context, broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                a aVar = new a(NetworkConnectivityCheckerImpl.this, broadcastReceiver, 0);
                this.label = 1;
                if (d.b(rVar, aVar, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1", f = "NetworkConnectivityCheckerImpl.kt", l = {126}, m = "invokeSuspend")
    public static final class C11391 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C11391(InterfaceC1526a<? super C11391> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(NetworkConnectivityCheckerImpl networkConnectivityCheckerImpl, NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1 networkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1) {
            ConnectivityManager connectivityManager = networkConnectivityCheckerImpl.connectivityManager;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(networkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1);
            }
            return Unit.f18162a;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C11391 c11391 = NetworkConnectivityCheckerImpl.this.new C11391(interfaceC1526a);
            c11391.L$0 = obj;
            return c11391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C11391) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                final r rVar = (r) this.L$0;
                ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl$registerNetworkCallbackFlow$1$networkCallback$1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        j.g(network, "network");
                        j.g(networkCapabilities, "networkCapabilities");
                        ((q) rVar).j(new NetworkState(networkCapabilities.hasCapability(16), networkCapabilities.hasTransport(1) ? NetworkType.WIFI : networkCapabilities.hasTransport(0) ? NetworkType.CELLULAR : networkCapabilities.hasTransport(3) ? NetworkType.ETHERNET : NetworkType.OTHER));
                    }
                };
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addCapability(16).build();
                ConnectivityManager connectivityManager = NetworkConnectivityCheckerImpl.this.connectivityManager;
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, networkCallback);
                }
                a aVar = new a(NetworkConnectivityCheckerImpl.this, networkCallback, 1);
                this.label = 1;
                if (d.b(rVar, aVar, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    public NetworkConnectivityCheckerImpl(Context context, E coroutineScope) {
        j.g(context, "context");
        j.g(coroutineScope, "coroutineScope");
        this.context = context;
        this.coroutineScope = coroutineScope;
        Object systemService = context.getSystemService("connectivity");
        this.connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.networkState = LocalBuild.INSTANCE.getVersionSdk() >= 26 ? registerNetworkCallbackFlow() : registerBroadcastReceiverFlow();
    }

    private final S registerBroadcastReceiverFlow() {
        return W.p(W.f(new AnonymousClass1(null)), this.coroutineScope, new e0());
    }

    private final S registerNetworkCallbackFlow() {
        return W.p(W.f(new C11391(null)), this.coroutineScope, new e0());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    @Override // com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.dynatrace.agent.common.connectivity.NetworkState currentNetworkState() {
        /*
            r5 = this;
            com.dynatrace.agent.common.connectivity.LocalBuild r0 = com.dynatrace.agent.common.connectivity.LocalBuild.INSTANCE
            int r0 = r0.getVersionSdk()
            r1 = 23
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 < r1) goto L53
            android.net.ConnectivityManager r0 = r5.connectivityManager
            if (r0 == 0) goto L16
            android.net.Network r0 = r0.getActiveNetwork()
            goto L17
        L16:
            r0 = r2
        L17:
            android.net.ConnectivityManager r1 = r5.connectivityManager
            if (r1 == 0) goto L1f
            android.net.NetworkCapabilities r2 = r1.getNetworkCapabilities(r0)
        L1f:
            if (r2 == 0) goto L28
            r0 = 16
            boolean r0 = r2.hasCapability(r0)
            goto L29
        L28:
            r0 = r4
        L29:
            if (r2 == 0) goto L4b
            boolean r1 = r2.hasTransport(r3)
            if (r1 == 0) goto L34
            com.dynatrace.agent.common.connectivity.NetworkType r1 = com.dynatrace.agent.common.connectivity.NetworkType.WIFI
            goto L49
        L34:
            boolean r1 = r2.hasTransport(r4)
            if (r1 == 0) goto L3d
            com.dynatrace.agent.common.connectivity.NetworkType r1 = com.dynatrace.agent.common.connectivity.NetworkType.CELLULAR
            goto L49
        L3d:
            r1 = 3
            boolean r1 = r2.hasTransport(r1)
            if (r1 == 0) goto L47
            com.dynatrace.agent.common.connectivity.NetworkType r1 = com.dynatrace.agent.common.connectivity.NetworkType.ETHERNET
            goto L49
        L47:
            com.dynatrace.agent.common.connectivity.NetworkType r1 = com.dynatrace.agent.common.connectivity.NetworkType.OTHER
        L49:
            if (r1 != 0) goto L4d
        L4b:
            com.dynatrace.agent.common.connectivity.NetworkType r1 = com.dynatrace.agent.common.connectivity.NetworkType.NONE
        L4d:
            com.dynatrace.agent.common.connectivity.NetworkState r2 = new com.dynatrace.agent.common.connectivity.NetworkState
            r2.<init>(r0, r1)
            return r2
        L53:
            android.net.ConnectivityManager r0 = r5.connectivityManager
            if (r0 == 0) goto L5b
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()
        L5b:
            if (r2 == 0) goto L64
            boolean r0 = r2.isConnectedOrConnecting()
            if (r0 != r3) goto L64
            r4 = r3
        L64:
            if (r2 == 0) goto L7e
            int r0 = r2.getType()
            if (r0 == 0) goto L7b
            if (r0 == r3) goto L78
            r1 = 9
            if (r0 == r1) goto L75
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.OTHER
            goto L80
        L75:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.ETHERNET
            goto L80
        L78:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.WIFI
            goto L80
        L7b:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.CELLULAR
            goto L80
        L7e:
            com.dynatrace.agent.common.connectivity.NetworkType r0 = com.dynatrace.agent.common.connectivity.NetworkType.NONE
        L80:
            com.dynatrace.agent.common.connectivity.NetworkState r1 = new com.dynatrace.agent.common.connectivity.NetworkState
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.common.connectivity.NetworkConnectivityCheckerImpl.currentNetworkState():com.dynatrace.agent.common.connectivity.NetworkState");
    }

    @Override // com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker
    public S getNetworkState() {
        return this.networkState;
    }
}
