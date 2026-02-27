package kf;

import android.net.ssl.SSLSockets;
import df.EnumC1355A;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {
    @Override // kf.e, kf.f
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // kf.e, kf.f
    public final void g(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC1355A enumC1355A = (EnumC1355A) list.get(i);
                if (enumC1355A != EnumC1355A.HTTP_1_0) {
                    arrayList.add(enumC1355A.f16391a);
                }
            }
            sSLParameters.setApplicationProtocols((String[]) arrayList.toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
