package com.dynatrace.agent.common.connectivity;

import Ej.S;

/* JADX INFO: loaded from: classes2.dex */
public interface NetworkConnectivityChecker {
    NetworkState currentNetworkState();

    S getNetworkState();
}
