package com.dynatrace.agent.common.connectivity;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkState {
    private final boolean isConnected;
    private final NetworkType networkType;

    public NetworkState(boolean z4, NetworkType networkType) {
        j.g(networkType, "networkType");
        this.isConnected = z4;
        this.networkType = networkType;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z4, NetworkType networkType, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = networkState.isConnected;
        }
        if ((i & 2) != 0) {
            networkType = networkState.networkType;
        }
        return networkState.copy(z4, networkType);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final NetworkType component2() {
        return this.networkType;
    }

    public final NetworkState copy(boolean z4, NetworkType networkType) {
        j.g(networkType, "networkType");
        return new NetworkState(z4, networkType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.networkType == networkState.networkType;
    }

    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    public int hashCode() {
        return this.networkType.hashCode() + ((this.isConnected ? 1231 : 1237) * 31);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", networkType=" + this.networkType + ')';
    }
}
