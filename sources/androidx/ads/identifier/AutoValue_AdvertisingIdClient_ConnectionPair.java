package androidx.ads.identifier;

import We.s;
import androidx.ads.identifier.AdvertisingIdClient;
import androidx.ads.identifier.internal.HoldingConnectionClient;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AdvertisingIdClient_ConnectionPair extends AdvertisingIdClient.ConnectionPair {
    private final HoldingConnectionClient connectionClient;
    private final long connectionId;

    public AutoValue_AdvertisingIdClient_ConnectionPair(HoldingConnectionClient holdingConnectionClient, long j) {
        if (holdingConnectionClient == null) {
            throw new NullPointerException("Null connectionClient");
        }
        this.connectionClient = holdingConnectionClient;
        this.connectionId = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdvertisingIdClient.ConnectionPair) {
            AdvertisingIdClient.ConnectionPair connectionPair = (AdvertisingIdClient.ConnectionPair) obj;
            if (this.connectionClient.equals(connectionPair.getConnectionClient()) && this.connectionId == connectionPair.getConnectionId()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.ads.identifier.AdvertisingIdClient.ConnectionPair
    @NonNull
    public HoldingConnectionClient getConnectionClient() {
        return this.connectionClient;
    }

    @Override // androidx.ads.identifier.AdvertisingIdClient.ConnectionPair
    public long getConnectionId() {
        return this.connectionId;
    }

    public int hashCode() {
        int iHashCode = (this.connectionClient.hashCode() ^ 1000003) * 1000003;
        long j = this.connectionId;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConnectionPair{connectionClient=");
        sb2.append(this.connectionClient);
        sb2.append(", connectionId=");
        return s.h(this.connectionId, "}", sb2);
    }
}
