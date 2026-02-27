package androidx.work.impl.constraints;

import androidx.camera.core.impl.a;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkState {
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    public NetworkState(boolean z4, boolean z5, boolean z8, boolean z9) {
        this.isConnected = z4;
        this.isValidated = z5;
        this.isMetered = z8;
        this.isNotRoaming = z9;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z4, boolean z5, boolean z8, boolean z9, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = networkState.isConnected;
        }
        if ((i & 2) != 0) {
            z5 = networkState.isValidated;
        }
        if ((i & 4) != 0) {
            z8 = networkState.isMetered;
        }
        if ((i & 8) != 0) {
            z9 = networkState.isNotRoaming;
        }
        return networkState.copy(z4, z5, z8, z9);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final boolean component2() {
        return this.isValidated;
    }

    public final boolean component3() {
        return this.isMetered;
    }

    public final boolean component4() {
        return this.isNotRoaming;
    }

    public final NetworkState copy(boolean z4, boolean z5, boolean z8, boolean z9) {
        return new NetworkState(z4, z5, z8, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming;
    }

    public int hashCode() {
        return ((((((this.isConnected ? 1231 : 1237) * 31) + (this.isValidated ? 1231 : 1237)) * 31) + (this.isMetered ? 1231 : 1237)) * 31) + (this.isNotRoaming ? 1231 : 1237);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isMetered() {
        return this.isMetered;
    }

    public final boolean isNotRoaming() {
        return this.isNotRoaming;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.isConnected);
        sb2.append(", isValidated=");
        sb2.append(this.isValidated);
        sb2.append(", isMetered=");
        sb2.append(this.isMetered);
        sb2.append(", isNotRoaming=");
        return a.q(sb2, this.isNotRoaming, ')');
    }
}
