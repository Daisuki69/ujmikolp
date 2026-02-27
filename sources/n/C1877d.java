package n;

import We.C0600d;
import dOYHB6.tiZVw8.numX49;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import z.AbstractC2540b;
import z.AbstractC2544f;

/* JADX INFO: renamed from: n.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1877d implements u {
    @Override // n.u
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        C0600d c0600d = AbstractC2544f.f21341a;
        if (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException)) {
            throw new IllegalStateException(numX49.tnTj78("b24H"), th2);
        }
        AbstractC2540b.c(numX49.tnTj78("b24O"), th2);
    }
}
