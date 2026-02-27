package com.squareup.wire;

import A5.j;
import W4.b;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.work.WorkInfo;
import bj.C1034e;
import bj.EnumC1035f;
import bj.InterfaceC1033d;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class ReverseProtoWriter {
    private static final Companion Companion = new Companion(null);
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private int arrayLimit;
    private final InterfaceC1033d forwardBuffer$delegate;
    private final InterfaceC1033d forwardWriter$delegate;
    private Buffer tail = new Buffer();
    private Buffer head = new Buffer();
    private final Buffer.UnsafeCursor cursor = new Buffer.UnsafeCursor();
    private byte[] array = EMPTY_ARRAY;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReverseProtoWriter() {
        EnumC1035f enumC1035f = EnumC1035f.c;
        this.forwardBuffer$delegate = C1034e.a(enumC1035f, new j(24));
        this.forwardWriter$delegate = C1034e.a(enumC1035f, new b(this, 13));
    }

    private final void emitCurrentSegment() throws IOException {
        byte[] bArr = this.array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.skip(this.arrayLimit);
        this.head.writeAll(this.tail);
        Buffer buffer = this.tail;
        this.tail = this.head;
        this.head = buffer;
        this.array = bArr2;
        this.arrayLimit = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Buffer forwardBuffer_delegate$lambda$0() {
        return new Buffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoWriter forwardWriter_delegate$lambda$1(ReverseProtoWriter reverseProtoWriter) {
        return new ProtoWriter(reverseProtoWriter.getForwardBuffer());
    }

    private final Buffer getForwardBuffer() {
        return (Buffer) this.forwardBuffer$delegate.getValue();
    }

    private final ProtoWriter getForwardWriter() {
        return (ProtoWriter) this.forwardWriter$delegate.getValue();
    }

    private final void require(int i) throws IOException {
        if (this.arrayLimit >= i) {
            return;
        }
        emitCurrentSegment();
        this.head.readAndWriteUnsafe(this.cursor);
        this.cursor.expandBuffer(i);
        Buffer.UnsafeCursor unsafeCursor = this.cursor;
        if (unsafeCursor.offset == 0) {
            int i4 = unsafeCursor.end;
            byte[] bArr = unsafeCursor.data;
            kotlin.jvm.internal.j.d(bArr);
            if (i4 == bArr.length) {
                byte[] bArr2 = this.cursor.data;
                kotlin.jvm.internal.j.d(bArr2);
                this.array = bArr2;
                this.arrayLimit = this.cursor.end;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int getByteCount() {
        return (this.array.length - this.arrayLimit) + ((int) this.tail.size());
    }

    public final void writeBytes(ByteString value) throws IOException {
        kotlin.jvm.internal.j.g(value, "value");
        int size = value.size();
        while (size != 0) {
            require(1);
            int iMin = Math.min(this.arrayLimit, size);
            int i = this.arrayLimit - iMin;
            this.arrayLimit = i;
            size -= iMin;
            value.copyInto(size, this.array, i, iMin);
        }
    }

    public final void writeFixed32(int i) throws IOException {
        require(4);
        int i4 = this.arrayLimit;
        int i6 = i4 - 4;
        this.arrayLimit = i6;
        byte[] bArr = this.array;
        bArr[i6] = (byte) (i & 255);
        bArr[i4 - 3] = (byte) ((i >>> 8) & 255);
        bArr[i4 - 2] = (byte) ((i >>> 16) & 255);
        bArr[i4 - 1] = (byte) ((i >>> 24) & 255);
    }

    public final void writeFixed64(long j) throws IOException {
        require(8);
        int i = this.arrayLimit;
        int i4 = i - 8;
        this.arrayLimit = i4;
        byte[] bArr = this.array;
        bArr[i4] = (byte) (j & 255);
        bArr[i - 7] = (byte) ((j >>> 8) & 255);
        bArr[i - 6] = (byte) ((j >>> 16) & 255);
        bArr[i - 5] = (byte) ((j >>> 24) & 255);
        bArr[i - 4] = (byte) ((j >>> 32) & 255);
        bArr[i - 3] = (byte) ((j >>> 40) & 255);
        bArr[i - 2] = (byte) ((j >>> 48) & 255);
        bArr[i - 1] = (byte) ((j >>> 56) & 255);
    }

    public final void writeForward$wire_runtime(Function1<? super ProtoWriter, Unit> block) throws IOException {
        kotlin.jvm.internal.j.g(block, "block");
        block.invoke(getForwardWriter());
        writeBytes(getForwardBuffer().readByteString());
    }

    public final void writeSignedVarint32$wire_runtime(int i) throws IOException {
        if (i >= 0) {
            writeVarint32(i);
        } else {
            writeVarint64(i);
        }
    }

    public final void writeString(String value) throws IOException {
        kotlin.jvm.internal.j.g(value, "value");
        int length = value.length() - 1;
        while (length >= 0) {
            int i = length - 1;
            char cCharAt = value.charAt(length);
            if (cCharAt < 128) {
                require(1);
                int i4 = this.arrayLimit;
                byte[] bArr = this.array;
                int i6 = i4 - 1;
                bArr[i6] = (byte) cCharAt;
                int iMax = Math.max(-1, i - i6);
                int i10 = i6;
                length = i;
                while (length > iMax) {
                    char cCharAt2 = value.charAt(length);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    length--;
                    i10--;
                    bArr[i10] = (byte) cCharAt2;
                }
                this.arrayLimit = i10;
            } else {
                if (cCharAt < 2048) {
                    require(2);
                    byte[] bArr2 = this.array;
                    int i11 = this.arrayLimit;
                    int i12 = i11 - 1;
                    this.arrayLimit = i12;
                    bArr2[i12] = (byte) (128 | (cCharAt & '?'));
                    int i13 = i11 - 2;
                    this.arrayLimit = i13;
                    bArr2[i13] = (byte) ((cCharAt >> 6) | PsExtractor.AUDIO_STREAM);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    require(3);
                    byte[] bArr3 = this.array;
                    int i14 = this.arrayLimit;
                    int i15 = i14 - 1;
                    this.arrayLimit = i15;
                    bArr3[i15] = (byte) ((cCharAt & '?') | 128);
                    int i16 = i14 - 2;
                    this.arrayLimit = i16;
                    bArr3[i16] = (byte) (128 | (63 & (cCharAt >> 6)));
                    int i17 = i14 - 3;
                    this.arrayLimit = i17;
                    bArr3[i17] = (byte) ((cCharAt >> '\f') | 224);
                } else {
                    char cCharAt3 = i >= 0 ? value.charAt(i) : (char) 65535;
                    if (cCharAt3 > 56319 || 56320 > cCharAt || cCharAt >= 57344) {
                        require(1);
                        byte[] bArr4 = this.array;
                        int i18 = this.arrayLimit - 1;
                        this.arrayLimit = i18;
                        bArr4[i18] = Utf8.REPLACEMENT_BYTE;
                    } else {
                        length -= 2;
                        int i19 = (((cCharAt3 & 1023) << 10) | (cCharAt & 1023)) + 65536;
                        require(4);
                        byte[] bArr5 = this.array;
                        int i20 = this.arrayLimit;
                        int i21 = i20 - 1;
                        this.arrayLimit = i21;
                        bArr5[i21] = (byte) ((i19 & 63) | 128);
                        int i22 = i20 - 2;
                        this.arrayLimit = i22;
                        bArr5[i22] = (byte) (((i19 >> 6) & 63) | 128);
                        int i23 = i20 - 3;
                        this.arrayLimit = i23;
                        bArr5[i23] = (byte) (128 | (63 & (i19 >> 12)));
                        int i24 = i20 - 4;
                        this.arrayLimit = i24;
                        bArr5[i24] = (byte) ((i19 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                    }
                }
                length = i;
            }
        }
    }

    public final void writeTag(int i, FieldEncoding fieldEncoding) throws IOException {
        kotlin.jvm.internal.j.g(fieldEncoding, "fieldEncoding");
        writeVarint32(ProtoWriter.Companion.makeTag$wire_runtime(i, fieldEncoding));
    }

    public final void writeTo(BufferedSink sink) throws IOException {
        kotlin.jvm.internal.j.g(sink, "sink");
        emitCurrentSegment();
        sink.writeAll(this.tail);
    }

    public final void writeVarint32(int i) throws IOException {
        int iVarint32Size$wire_runtime = ProtoWriter.Companion.varint32Size$wire_runtime(i);
        require(iVarint32Size$wire_runtime);
        int i4 = this.arrayLimit - iVarint32Size$wire_runtime;
        this.arrayLimit = i4;
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            this.array[i4] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i4++;
        }
        this.array[i4] = (byte) i;
    }

    public final void writeVarint64(long j) throws IOException {
        int iVarint64Size$wire_runtime = ProtoWriter.Companion.varint64Size$wire_runtime(j);
        require(iVarint64Size$wire_runtime);
        int i = this.arrayLimit - iVarint64Size$wire_runtime;
        this.arrayLimit = i;
        while (((-128) & j) != 0) {
            this.array[i] = (byte) ((127 & j) | 128);
            j >>>= 7;
            i++;
        }
        this.array[i] = (byte) j;
    }
}
