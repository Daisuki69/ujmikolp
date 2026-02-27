package com.squareup.wire;

import We.s;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okio.Buffer;
import okio.ByteString;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class ByteArrayProtoReader32 implements ProtoReader32 {
    private final List<Buffer> bufferStack;
    private int limit;
    private FieldEncoding nextFieldEncoding;
    private int pos;
    private ProtoReader32AsProtoReader protoReader;
    private int pushedLimit;
    private int recursionDepth;
    private final byte[] source;
    private int state;
    private int tag;

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

    public ByteArrayProtoReader32(byte[] source, int i, int i4) {
        j.g(source, "source");
        this.source = source;
        this.pos = i;
        this.limit = i4;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1;
        this.bufferStack = new ArrayList();
    }

    private final void afterPackableScalar(int i) throws IOException {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        int i4 = this.pos;
        int i6 = this.limit;
        if (i4 > i6) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (i4 != i6) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1;
        this.state = 6;
    }

    private final int beforeLengthDelimitedScalar() throws ProtocolException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        int i = this.limit - this.pos;
        this.state = 6;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1;
        return i;
    }

    private final int internalNextLengthDelimited() throws ProtocolException, EOFException {
        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        this.state = 2;
        int iInternalReadVarint32 = internalReadVarint32();
        if (iInternalReadVarint32 < 0) {
            throw new ProtocolException(s.f(iInternalReadVarint32, "Negative length: "));
        }
        if (this.pushedLimit != -1) {
            throw new IllegalStateException();
        }
        int i = this.limit;
        this.pushedLimit = i;
        int i4 = this.pos + iInternalReadVarint32;
        this.limit = i4;
        if (i4 <= i) {
            return iInternalReadVarint32;
        }
        throw new EOFException();
    }

    private final int internalReadVarint32() throws ProtocolException, EOFException {
        int i;
        byte b8 = readByte();
        if (b8 >= 0) {
            return b8;
        }
        int i4 = b8 & 127;
        byte b10 = readByte();
        if (b10 >= 0) {
            i = b10 << 7;
        } else {
            i4 |= (b10 & 127) << 7;
            byte b11 = readByte();
            if (b11 >= 0) {
                i = b11 << 14;
            } else {
                i4 |= (b11 & 127) << 14;
                byte b12 = readByte();
                if (b12 < 0) {
                    int i6 = i4 | ((b12 & 127) << 21);
                    byte b13 = readByte();
                    int i10 = i6 | (b13 << 28);
                    if (b13 < 0) {
                        for (int i11 = 0; i11 < 5; i11++) {
                            if (readByte() < 0) {
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

    private final byte readByte() throws EOFException {
        int i = this.pos;
        if (i == this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        this.pos = i + 1;
        return bArr[i];
    }

    private final ByteString readByteString(int i) throws EOFException {
        int i4 = this.pos;
        int i6 = i4 + i;
        if (i6 > this.limit) {
            throw new EOFException();
        }
        ByteString byteStringOf = ByteString.Companion.of(this.source, i4, i);
        this.pos = i6;
        return byteStringOf;
    }

    private final int readIntLe() throws EOFException {
        int i = this.pos;
        if (i + 4 > this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        int i4 = i + 1;
        this.pos = i4;
        int i6 = bArr[i] & 255;
        int i10 = i + 2;
        this.pos = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i6;
        int i12 = i + 3;
        this.pos = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.pos = i + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    private final long readLongLe() throws EOFException {
        int i = this.pos;
        if (i + 8 > this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        int i4 = i + 1;
        this.pos = i4;
        long j = ((long) bArr[i]) & 255;
        int i6 = i + 2;
        this.pos = i6;
        long j6 = j | ((((long) bArr[i4]) & 255) << 8);
        int i10 = i + 3;
        this.pos = i10;
        long j7 = j6 | ((((long) bArr[i6]) & 255) << 16);
        int i11 = i + 4;
        this.pos = i11;
        long j9 = j7 | ((((long) bArr[i10]) & 255) << 24);
        int i12 = i + 5;
        this.pos = i12;
        long j10 = j9 | ((((long) bArr[i11]) & 255) << 32);
        int i13 = i + 6;
        this.pos = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i + 7;
        this.pos = i14;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 48);
        this.pos = i + 8;
        return ((((long) bArr[i14]) & 255) << 56) | j12;
    }

    private final String readUtf8(int i) throws EOFException {
        int i4 = this.pos;
        int i6 = i + i4;
        if (i6 > this.limit) {
            throw new EOFException();
        }
        String strK = z.k(i4, i6, this.source);
        this.pos = i6;
        return strK;
    }

    private final void skipGroup(int i) throws IOException {
        while (this.pos < this.limit) {
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
                skip(internalReadVarint32());
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

    @Override // com.squareup.wire.ProtoReader32
    public void addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) throws IOException {
        j.g(fieldEncoding, "fieldEncoding");
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
        j.e(protoAdapterRawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, i, obj);
    }

    @Override // com.squareup.wire.ProtoReader32
    public ProtoReader asProtoReader() {
        ProtoReader32AsProtoReader protoReader32AsProtoReader = this.protoReader;
        if (protoReader32AsProtoReader != null) {
            return protoReader32AsProtoReader;
        }
        ProtoReader32AsProtoReader protoReader32AsProtoReader2 = new ProtoReader32AsProtoReader(this);
        this.protoReader = protoReader32AsProtoReader2;
        return protoReader32AsProtoReader2;
    }

    @Override // com.squareup.wire.ProtoReader32
    public boolean beforePossiblyPackedScalar() throws ProtocolException {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1;
                this.state = 6;
                return false;
            }
            if (i != 5) {
                throw new ProtocolException("unexpected state: " + this.state);
            }
        }
        return true;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int beginMessage() throws IOException {
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
        int i4 = this.pushedLimit;
        this.pushedLimit = -1;
        this.state = 6;
        return i4;
    }

    @Override // com.squareup.wire.ProtoReader32
    public ByteString endMessageAndGetUnknownFields(int i) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i4 = this.recursionDepth - 1;
        this.recursionDepth = i4;
        if (i4 < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos == this.limit || i4 == 0) {
            this.limit = i;
            Buffer buffer = this.bufferStack.get(i4);
            return buffer.size() > 0 ? buffer.readByteString() : ByteString.EMPTY;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("nextFieldEncoding is not set");
        }
        if (i == 1) {
            return this.limit - this.pos;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        if (i == 4) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextLengthDelimited() {
        int i = this.state;
        if (i == 6 || i == 2) {
            return internalNextLengthDelimited();
        }
        throw new IllegalStateException("Unexpected call to nextDelimited()");
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit) {
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

    @Override // com.squareup.wire.ProtoReader32
    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    @Override // com.squareup.wire.ProtoReader32
    public ByteString readBytes() {
        return readByteString(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readFixed32() throws IOException {
        int i = this.state;
        if (i == 5 || i == 2) {
            int intLe = readIntLe();
            afterPackableScalar(5);
            return intLe;
        }
        throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readFixed64() throws IOException {
        int i = this.state;
        if (i == 1 || i == 2) {
            long longLe = readLongLe();
            afterPackableScalar(1);
            return longLe;
        }
        throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
    }

    @Override // com.squareup.wire.ProtoReader32
    public String readString() {
        return readUtf8(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public void readUnknownField(int i) throws IOException {
        FieldEncoding fieldEncodingPeekFieldEncoding = peekFieldEncoding();
        j.d(fieldEncodingPeekFieldEncoding);
        addUnknownField(i, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(this));
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readVarint32() throws IOException {
        int i = this.state;
        if (i == 0 || i == 2) {
            int iInternalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return iInternalReadVarint32;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readVarint64() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            byte b8 = readByte();
            j |= ((long) (b8 & 127)) << i4;
            if ((b8 & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    @Override // com.squareup.wire.ProtoReader32
    public void skip() throws IOException {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
        } else if (i == 2) {
            skip(beforeLengthDelimitedScalar());
        } else {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }

    private final void skip(int i) throws EOFException {
        int i4 = this.pos + i;
        if (i4 <= this.limit) {
            this.pos = i4;
            return;
        }
        throw new EOFException();
    }

    public /* synthetic */ ByteArrayProtoReader32(byte[] bArr, int i, int i4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? bArr.length : i4);
    }
}
