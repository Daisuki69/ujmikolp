package okhttp3.internal.http2;

import We.s;
import androidx.camera.core.impl.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.ranges.c;
import kotlin.ranges.d;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes5.dex */
public final class Http2Reader implements Closeable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final BufferedSource source;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i, int i4, int i6) throws IOException {
            if ((i4 & 8) != 0) {
                i--;
            }
            if (i6 <= i) {
                return i - i6;
            }
            throw new IOException(a.c(i6, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        }

        private Companion() {
        }
    }

    public static final class ContinuationSource implements Source, AutoCloseable {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final BufferedSource source;
        private int streamId;

        public ContinuationSource(BufferedSource source) {
            j.g(source, "source");
            this.source = source;
        }

        private final void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i4 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i4;
            if (iAnd == 9) {
                if (i4 != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) throws IOException {
            j.g(sink, "sink");
            while (true) {
                int i = this.left;
                if (i != 0) {
                    long j6 = this.source.read(sink, Math.min(j, i));
                    if (j6 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j6;
                    return j6;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, ByteString byteString, String str2, int i4, long j);

        void data(boolean z4, int i, BufferedSource bufferedSource, int i4) throws IOException;

        void goAway(int i, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z4, int i, int i4, List<Header> list);

        void ping(boolean z4, int i, int i4);

        void priority(int i, int i4, int i6, boolean z4);

        void pushPromise(int i, int i4, List<Header> list) throws IOException;

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z4, Settings settings);

        void windowUpdate(int i, long j);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        j.f(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(BufferedSource source, boolean z4) {
        j.g(source, "source");
        this.source = source;
        this.client = z4;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i, int i4, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i4 & 1) != 0;
        if ((i4 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (i4 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z4, i6, this.source, Companion.lengthWithoutPadding(i, i4, iAnd));
        this.source.skip(iAnd);
    }

    private final void readGoAway(Handler handler, int i, int i4, int i6) throws IOException {
        if (i < 8) {
            throw new IOException(s.f(i, "TYPE_GOAWAY length < 8: "));
        }
        if (i6 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i10 = this.source.readInt();
        int i11 = this.source.readInt();
        int i12 = i - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i11);
        if (errorCodeFromHttp2 == null) {
            throw new IOException(s.f(i11, "TYPE_GOAWAY unexpected error code: "));
        }
        ByteString byteString = ByteString.EMPTY;
        if (i12 > 0) {
            byteString = this.source.readByteString(i12);
        }
        handler.goAway(i10, errorCodeFromHttp2, byteString);
    }

    private final List<Header> readHeaderBlock(int i, int i4, int i6, int i10) throws IOException {
        this.continuation.setLeft(i);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i4);
        this.continuation.setFlags(i6);
        this.continuation.setStreamId(i10);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i, int i4, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z4 = (i4 & 1) != 0;
        int iAnd = (i4 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i4 & 32) != 0) {
            readPriority(handler, i6);
            i -= 5;
        }
        handler.headers(z4, i6, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i4, iAnd), iAnd, i4, i6));
    }

    private final void readPing(Handler handler, int i, int i4, int i6) throws IOException {
        if (i != 8) {
            throw new IOException(s.f(i, "TYPE_PING length != 8: "));
        }
        if (i6 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i4 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int i, int i4, int i6) throws IOException {
        if (i != 5) {
            throw new IOException(s.g(i, "TYPE_PRIORITY length: ", " != 5"));
        }
        if (i6 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        readPriority(handler, i6);
    }

    private final void readPushPromise(Handler handler, int i, int i4, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i4 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(i6, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i4, iAnd), iAnd, i4, i6));
    }

    private final void readRstStream(Handler handler, int i, int i4, int i6) throws IOException {
        if (i != 4) {
            throw new IOException(s.g(i, "TYPE_RST_STREAM length: ", " != 4"));
        }
        if (i6 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i10 = this.source.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i10);
        if (errorCodeFromHttp2 == null) {
            throw new IOException(s.f(i10, "TYPE_RST_STREAM unexpected error code: "));
        }
        handler.rstStream(i6, errorCodeFromHttp2);
    }

    private final void readSettings(Handler handler, int i, int i4, int i6) throws IOException {
        int i10;
        if (i6 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i4 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i % 6 != 0) {
            throw new IOException(s.f(i, "TYPE_SETTINGS length % 6 != 0: "));
        }
        Settings settings = new Settings();
        c cVarE = d.e(d.f(0, i), 6);
        int i11 = cVarE.f18201a;
        int i12 = cVarE.f18202b;
        int i13 = cVarE.c;
        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
            while (true) {
                int iAnd = Util.and(this.source.readShort(), 65535);
                i10 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (i10 < 16384 || i10 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i10 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (i10 != 0 && i10 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, i10);
                if (i11 == i12) {
                    break;
                } else {
                    i11 += i13;
                }
            }
            throw new IOException(s.f(i10, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i, int i4, int i6) throws IOException {
        if (i != 4) {
            throw new IOException(s.f(i, "TYPE_WINDOW_UPDATE length !=4: "));
        }
        long jAnd = Util.and(this.source.readInt(), 2147483647L);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i6, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z4, Handler handler) throws IOException {
        j.g(handler, "handler");
        try {
            this.source.require(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException(s.f(medium, "FRAME_SIZE_ERROR: "));
            }
            int iAnd = Util.and(this.source.readByte(), 255);
            int iAnd2 = Util.and(this.source.readByte(), 255);
            int i = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, i, medium, iAnd, iAnd2));
            }
            if (z4 && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        j.g(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (j.b(byteString, byteString2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString2.utf8());
    }

    private final void readPriority(Handler handler, int i) throws IOException {
        int i4 = this.source.readInt();
        handler.priority(i, i4 & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i4) != 0);
    }
}
