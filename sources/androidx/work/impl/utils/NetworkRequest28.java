package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
public final class NetworkRequest28 {
    public static final NetworkRequest28 INSTANCE = new NetworkRequest28();

    private NetworkRequest28() {
    }

    public static final NetworkRequest createNetworkRequest(int[] capabilities, int[] transports) {
        j.g(capabilities, "capabilities");
        j.g(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : capabilities) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring adding capability '" + i + '\'', e);
            }
        }
        for (int i4 : NetworkRequestCompatKt.defaultCapabilities) {
            int length = capabilities.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    i6 = -1;
                    break;
                }
                if (i4 == capabilities[i6]) {
                    break;
                }
                i6++;
            }
            if (!(i6 >= 0)) {
                try {
                    builder.removeCapability(i4);
                } catch (IllegalArgumentException e7) {
                    Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring removing default capability '" + i4 + '\'', e7);
                }
            }
        }
        for (int i10 : transports) {
            builder.addTransportType(i10);
        }
        NetworkRequest networkRequestBuild = builder.build();
        j.f(networkRequestBuild, "networkRequest.build()");
        return networkRequestBuild;
    }

    public final NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(int[] capabilities, int[] transports) {
        j.g(capabilities, "capabilities");
        j.g(transports, "transports");
        return new NetworkRequestCompat(createNetworkRequest(capabilities, transports));
    }

    public final boolean hasCapability$work_runtime_release(NetworkRequest request, int i) {
        j.g(request, "request");
        return request.hasCapability(i);
    }

    public final boolean hasTransport$work_runtime_release(NetworkRequest request, int i) {
        j.g(request, "request");
        return request.hasTransport(i);
    }
}
