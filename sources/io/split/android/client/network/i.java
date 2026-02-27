package io.split.android.client.network;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends W3.j implements AutoCloseable, Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedReader f17600b;
    public final SSLSocket c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Socket f17601d;

    public i(int i, BufferedReader bufferedReader, SSLSocket sSLSocket, Socket socket) {
        super(i);
        this.f17600b = bufferedReader;
        this.c = sSLSocket;
        this.f17601d = socket;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        BufferedReader bufferedReader = this.f17600b;
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                Ri.a.q("Failed to close BufferedReader: " + e.getMessage());
            }
        }
        SSLSocket sSLSocket = this.c;
        Socket socket = this.f17601d;
        if (socket != null && socket != sSLSocket) {
            try {
                socket.close();
                Ri.a.p("Origin socket closed");
            } catch (IOException e7) {
                Ri.a.q("Failed to close origin socket: " + e7.getMessage());
            }
        }
        if (sSLSocket != null) {
            try {
                sSLSocket.close();
                Ri.a.p("Tunnel socket closed");
            } catch (IOException e10) {
                Ri.a.q("Failed to close tunnel socket: " + e10.getMessage());
            }
        }
    }
}
