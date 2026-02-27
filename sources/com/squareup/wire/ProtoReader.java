package com.squareup.wire;

import We.s;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public class ProtoReader {
    public static final Companion Companion = new Companion(null);
    public static final int FIELD_ENCODING_MASK = 7;
    public static final int RECURSION_LIMIT = 100;
    public static final int STATE_END_GROUP = 4;
    public static final int STATE_FIXED32 = 5;
    public static final int STATE_FIXED64 = 1;
    public static final int STATE_LENGTH_DELIMITED = 2;
    public static final int STATE_PACKED_TAG = 7;
    public static final int STATE_START_GROUP = 3;
    public static final int STATE_TAG = 6;
    public static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;
    private final List<Buffer> bufferStack;
    private long limit;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit;
    private int recursionDepth;
    private final BufferedSource source;
    private int state;
    private int tag;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProtoReader(BufferedSource source) {
        j.g(source, "source");
        this.source = source;
        this.limit = Long.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    private final void afterPackableScalar(int i) throws IOException {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j6 = this.limit;
        if (j > j6) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j != j6) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private final long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        long j = this.limit - this.pos;
        this.source.require(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
    }

    private final int internalNextLengthDelimited() throws IOException {
        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        this.state = 2;
        int iInternalReadVarint32 = internalReadVarint32();
        if (iInternalReadVarint32 < 0) {
            throw new ProtocolException(s.f(iInternalReadVarint32, "Negative length: "));
        }
        if (this.pushedLimit != -1) {
            throw new IllegalStateException();
        }
        long j = this.limit;
        this.pushedLimit = j;
        long j6 = this.pos + ((long) iInternalReadVarint32);
        this.limit = j6;
        if (j6 <= j) {
            return iInternalReadVarint32;
        }
        throw new EOFException();
    }

    private final int internalReadVarint32() throws IOException {
        int i;
        this.source.require(1L);
        this.pos++;
        byte b8 = this.source.readByte();
        if (b8 >= 0) {
            return b8;
        }
        int i4 = b8 & 127;
        this.source.require(1L);
        this.pos++;
        byte b10 = this.source.readByte();
        if (b10 >= 0) {
            i = b10 << 7;
        } else {
            i4 |= (b10 & 127) << 7;
            this.source.require(1L);
            this.pos++;
            byte b11 = this.source.readByte();
            if (b11 >= 0) {
                i = b11 << 14;
            } else {
                i4 |= (b11 & 127) << 14;
                this.source.require(1L);
                this.pos++;
                byte b12 = this.source.readByte();
                if (b12 < 0) {
                    int i6 = i4 | ((b12 & 127) << 21);
                    this.source.require(1L);
                    this.pos++;
                    byte b13 = this.source.readByte();
                    int i10 = i6 | (b13 << 28);
                    if (b13 < 0) {
                        for (int i11 = 0; i11 < 5; i11++) {
                            this.source.require(1L);
                            this.pos++;
                            if (this.source.readByte() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i10;
                }
                i = b12 << 21;
            }
        }
        return i4 | i;
    }

    private final void skipGroup(int i) throws IOException {
        while (this.pos < this.limit && !this.source.exhausted()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i4 = iInternalReadVarint32 >> 3;
            int i6 = iInternalReadVarint32 & 7;
            if (i6 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i6 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i6 == 2) {
                long jInternalReadVarint32 = internalReadVarint32();
                this.pos += jInternalReadVarint32;
                this.source.skip(jInternalReadVarint32);
            } else {
                if (i6 == 3) {
                    int i10 = this.recursionDepth + 1;
                    this.recursionDepth = i10;
                    if (i10 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        skipGroup(i4);
                    } finally {
                    }
                    this.recursionDepth--;
                }
                if (i6 == 4) {
                    if (i4 != i) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i6 != 5) {
                        throw new ProtocolException(s.f(i6, "Unexpected field encoding: "));
                    }
                    this.state = 5;
                    readFixed32();
                }
            }
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: -forEachTag, reason: not valid java name */
    public final ByteString m184forEachTag(Function1<? super Integer, ? extends Object> tagHandler) throws IOException {
        j.g(tagHandler, "tagHandler");
        long jBeginMessage = beginMessage();
        while (true) {
            int iNextTag = nextTag();
            if (iNextTag == -1) {
                return endMessageAndGetUnknownFields(jBeginMessage);
            }
            tagHandler.invoke(Integer.valueOf(iNextTag));
        }
    }

    public void addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) throws IOException {
        j.g(fieldEncoding, "fieldEncoding");
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
        j.e(protoAdapterRawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, i, obj);
    }

    public boolean beforePossiblyPackedScalar$wire_runtime() throws ProtocolException {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1L;
                this.state = 6;
                return false;
            }
            if (i != 5) {
                throw new ProtocolException("unexpected state: " + this.state);
            }
        }
        return true;
    }

    public long beginMessage() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        if (i > this.bufferStack.size()) {
            this.bufferStack.add(new Buffer());
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    public final void endMessage(long j) throws IOException {
        endMessageAndGetUnknownFields(j);
    }

    public ByteString endMessageAndGetUnknownFields(long j) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (i < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos == this.limit || i == 0) {
            this.limit = j;
            Buffer buffer = this.bufferStack.get(i);
            return buffer.size() > 0 ? buffer.readByteString() : ByteString.EMPTY;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public long nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("nextFieldEncoding is not set");
        }
        if (i == 1) {
            return this.limit - this.pos;
        }
        if (i == 2) {
            return 4L;
        }
        if (i == 3) {
            return 8L;
        }
        if (i == 4) {
            return 1L;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int nextLengthDelimited() throws IOException {
        int i = this.state;
        if (i == 6 || i == 2) {
            return internalNextLengthDelimited();
        }
        throw new IllegalStateException("Unexpected call to nextDelimited()");
    }

    public int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.exhausted()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i4 = iInternalReadVarint32 >> 3;
            this.tag = i4;
            int i6 = iInternalReadVarint32 & 7;
            if (i6 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i4;
            }
            if (i6 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i4;
            }
            if (i6 == 2) {
                internalNextLengthDelimited();
                return this.tag;
            }
            if (i6 != 3) {
                if (i6 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i6 != 5) {
                    throw new ProtocolException(s.f(i6, "Unexpected field encoding: "));
                }
                this.nextFieldEncoding = FieldEncoding.FIXED32;
                this.state = 5;
                return i4;
            }
            skipGroup(i4);
        }
        return -1;
    }

    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public ByteString readBytes() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(jBeforeLengthDelimitedScalar);
        return this.source.readByteString(jBeforeLengthDelimitedScalar);
    }

    public int readFixed32() throws IOException {
        int i = this.state;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(4L);
        this.pos += (long) 4;
        int intLe = this.source.readIntLe();
        afterPackableScalar(5);
        return intLe;
    }

    public long readFixed64() throws IOException {
        int i = this.state;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(8L);
        this.pos += (long) 8;
        long longLe = this.source.readLongLe();
        afterPackableScalar(1);
        return longLe;
    }

    public String readString() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(jBeforeLengthDelimitedScalar);
        return this.source.readUtf8(jBeforeLengthDelimitedScalar);
    }

    public void readUnknownField(int i) throws IOException {
        FieldEncoding fieldEncodingPeekFieldEncoding = peekFieldEncoding();
        j.d(fieldEncodingPeekFieldEncoding);
        addUnknownField(i, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(this));
    }

    public int readVarint32() throws IOException {
        int i = this.state;
        if (i == 0 || i == 2) {
            int iInternalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return iInternalReadVarint32;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    public long readVarint64() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            this.source.require(1L);
            this.pos++;
            byte b8 = this.source.readByte();
            j |= ((long) (b8 & 127)) << i4;
            if ((b8 & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public void skip() throws IOException {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
            return;
        }
        if (i == 2) {
            this.source.skip(beforeLengthDelimitedScalar());
        } else {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }
}
