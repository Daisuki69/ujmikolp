package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(31)
final class NetworkRequest31 {
    public static final NetworkRequest31 INSTANCE = new NetworkRequest31();

    private NetworkRequest31() {
    }

    public final int[] capabilities(NetworkRequest request) {
        j.g(request, "request");
        int[] capabilities = request.getCapabilities();
        j.f(capabilities, "request.capabilities");
        return capabilities;
    }

    public final int[] transportTypes(NetworkRequest request) {
        j.g(request, "request");
        int[] transportTypes = request.getTransportTypes();
        j.f(transportTypes, "request.transportTypes");
        return transportTypes;
    }
}
