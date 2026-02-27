package of;

import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f18829a = Logger.getLogger(k.class.getName());

    public static b a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuPq"));
        }
        if (socket.getOutputStream() == null) {
            throw new IOException(numX49.tnTj78("bQuPI"));
        }
        gf.i iVar = new gf.i(socket, 2);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new b(iVar, new b(iVar, outputStream, 1), 0);
        }
        throw new IllegalArgumentException(numX49.tnTj78("bQuPJ"));
    }

    public static c b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bQuPW"));
        }
        if (socket.getInputStream() == null) {
            throw new IOException(numX49.tnTj78("bQuPl"));
        }
        gf.i iVar = new gf.i(socket, 2);
        InputStream inputStream = socket.getInputStream();
        if (inputStream != null) {
            return new c(iVar, new c(iVar, inputStream));
        }
        throw new IllegalArgumentException(numX49.tnTj78("bQuPz"));
    }
}
