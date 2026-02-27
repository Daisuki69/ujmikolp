package androidx.emoji2.text.flatbuffer;

import We.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    ByteBuffer f7839bb;
    ByteBufferFactory bb_factory;
    boolean finished;
    boolean force_defaults;
    int minalign;
    boolean nested;
    int num_vtables;
    int object_start;
    int space;
    final Utf8 utf8;
    int vector_num_elems;
    int[] vtable;
    int vtable_in_use;
    int[] vtables;

    public static class ByteBufferBackedInputStream extends InputStream {
        ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.buf.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i, ByteBufferFactory byteBufferFactory) {
        this(i, byteBufferFactory, null, Utf8.getDefault());
    }

    @Deprecated
    private int dataStart() {
        finished();
        return this.space;
    }

    public static ByteBuffer growByteBuffer(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferNewByteBuffer = byteBufferFactory.newByteBuffer(i);
        byteBufferNewByteBuffer.position(byteBufferNewByteBuffer.clear().capacity() - iCapacity);
        byteBufferNewByteBuffer.put(byteBuffer);
        return byteBufferNewByteBuffer;
    }

    public static boolean isFieldPresent(Table table, int i) {
        return table.__offset(i) != 0;
    }

    public void Nested(int i) {
        if (i != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(boolean z4) {
        prep(1, 0);
        putBoolean(z4);
    }

    public void addByte(byte b8) {
        prep(1, 0);
        putByte(b8);
    }

    public void addDouble(double d10) {
        prep(8, 0);
        putDouble(d10);
    }

    public void addFloat(float f) {
        prep(4, 0);
        putFloat(f);
    }

    public void addInt(int i) {
        prep(4, 0);
        putInt(i);
    }

    public void addLong(long j) {
        prep(8, 0);
        putLong(j);
    }

    public void addOffset(int i) {
        prep(4, 0);
        putInt((offset() - i) + 4);
    }

    public void addShort(short s9) {
        prep(2, 0);
        putShort(s9);
    }

    public void addStruct(int i, int i4, int i6) {
        if (i4 != i6) {
            Nested(i4);
            slot(i);
        }
    }

    public void clear() {
        this.space = this.f7839bb.capacity();
        this.f7839bb.clear();
        this.minalign = 1;
        while (true) {
            int i = this.vtable_in_use;
            if (i <= 0) {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
            int[] iArr = this.vtable;
            int i4 = i - 1;
            this.vtable_in_use = i4;
            iArr[i4] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f7839bb;
        int i = this.space - length;
        this.space = i;
        byteBuffer.position(i);
        this.f7839bb.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t5, int[] iArr) {
        t5.sortTables(iArr, this.f7839bb);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int iEncodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, iEncodedLength, 1);
        ByteBuffer byteBuffer = this.f7839bb;
        int i = this.space - iEncodedLength;
        this.space = i;
        byteBuffer.position(i);
        this.utf8.encodeUtf8(charSequence, this.f7839bb);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i, int i4, int i6) {
        int i10 = i * i4;
        startVector(i, i4, i6);
        ByteBuffer byteBuffer = this.f7839bb;
        int i11 = this.space - i10;
        this.space = i11;
        byteBuffer.position(i11);
        ByteBuffer byteBufferOrder = this.f7839bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i10);
        return byteBufferOrder;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.f7839bb;
    }

    public int endTable() {
        int i;
        if (this.vtable == null || !this.nested) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int iOffset = offset();
        int i4 = this.vtable_in_use - 1;
        while (i4 >= 0 && this.vtable[i4] == 0) {
            i4--;
        }
        for (int i6 = i4; i6 >= 0; i6--) {
            int i10 = this.vtable[i6];
            addShort((short) (i10 != 0 ? iOffset - i10 : 0));
        }
        addShort((short) (iOffset - this.object_start));
        addShort((short) ((i4 + 3) * 2));
        int i11 = 0;
        loop2: while (true) {
            if (i11 >= this.num_vtables) {
                i = 0;
                break;
            }
            int iCapacity = this.f7839bb.capacity() - this.vtables[i11];
            int i12 = this.space;
            short s9 = this.f7839bb.getShort(iCapacity);
            if (s9 == this.f7839bb.getShort(i12)) {
                for (int i13 = 2; i13 < s9; i13 += 2) {
                    if (this.f7839bb.getShort(iCapacity + i13) != this.f7839bb.getShort(i12 + i13)) {
                        break;
                    }
                }
                i = this.vtables[i11];
                break loop2;
            }
            i11++;
        }
        if (i != 0) {
            int iCapacity2 = this.f7839bb.capacity() - iOffset;
            this.space = iCapacity2;
            this.f7839bb.putInt(iCapacity2, i - iOffset);
        } else {
            int i14 = this.num_vtables;
            int[] iArr = this.vtables;
            if (i14 == iArr.length) {
                this.vtables = Arrays.copyOf(iArr, i14 * 2);
            }
            int[] iArr2 = this.vtables;
            int i15 = this.num_vtables;
            this.num_vtables = i15 + 1;
            iArr2[i15] = offset();
            ByteBuffer byteBuffer = this.f7839bb;
            byteBuffer.putInt(byteBuffer.capacity() - iOffset, offset() - iOffset);
        }
        this.nested = false;
        return iOffset;
    }

    public int endVector() {
        if (!this.nested) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.nested = false;
        putInt(this.vector_num_elems);
        return offset();
    }

    public void finish(int i, boolean z4) {
        prep(this.minalign, (z4 ? 4 : 0) + 4);
        addOffset(i);
        if (z4) {
            addInt(this.f7839bb.capacity() - this.space);
        }
        this.f7839bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i) {
        finish(i, true);
    }

    public void finished() {
        if (!this.finished) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z4) {
        this.force_defaults = z4;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.bb_factory = byteBufferFactory;
        this.f7839bb = byteBuffer;
        byteBuffer.clear();
        this.f7839bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.f7839bb.capacity();
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        return this;
    }

    public void notNested() {
        if (this.nested) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.f7839bb.capacity() - this.space;
    }

    public void pad(int i) {
        for (int i4 = 0; i4 < i; i4++) {
            ByteBuffer byteBuffer = this.f7839bb;
            int i6 = this.space - 1;
            this.space = i6;
            byteBuffer.put(i6, (byte) 0);
        }
    }

    public void prep(int i, int i4) {
        if (i > this.minalign) {
            this.minalign = i;
        }
        int i6 = ((~((this.f7839bb.capacity() - this.space) + i4)) + 1) & (i - 1);
        while (this.space < i6 + i + i4) {
            int iCapacity = this.f7839bb.capacity();
            ByteBuffer byteBuffer = this.f7839bb;
            ByteBuffer byteBufferGrowByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.f7839bb = byteBufferGrowByteBuffer;
            if (byteBuffer != byteBufferGrowByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space = (this.f7839bb.capacity() - iCapacity) + this.space;
        }
        pad(i6);
    }

    public void putBoolean(boolean z4) {
        ByteBuffer byteBuffer = this.f7839bb;
        int i = this.space - 1;
        this.space = i;
        byteBuffer.put(i, z4 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b8) {
        ByteBuffer byteBuffer = this.f7839bb;
        int i = this.space - 1;
        this.space = i;
        byteBuffer.put(i, b8);
    }

    public void putDouble(double d10) {
        ByteBuffer byteBuffer = this.f7839bb;
        int i = this.space - 8;
        this.space = i;
        byteBuffer.putDouble(i, d10);
    }

    public void putFloat(float f) {
        ByteBuffer byteBuffer = this.f7839bb;
        int i = this.space - 4;
        this.space = i;
        byteBuffer.putFloat(i, f);
    }

    public void putInt(int i) {
        ByteBuffer byteBuffer = this.f7839bb;
        int i4 = this.space - 4;
        this.space = i4;
        byteBuffer.putInt(i4, i);
    }

    public void putLong(long j) {
        ByteBuffer byteBuffer = this.f7839bb;
        int i = this.space - 8;
        this.space = i;
        byteBuffer.putLong(i, j);
    }

    public void putShort(short s9) {
        ByteBuffer byteBuffer = this.f7839bb;
        int i = this.space - 2;
        this.space = i;
        byteBuffer.putShort(i, s9);
    }

    public void required(int i, int i4) {
        int iCapacity = this.f7839bb.capacity() - i;
        if (this.f7839bb.getShort((iCapacity - this.f7839bb.getInt(iCapacity)) + i4) == 0) {
            throw new AssertionError(s.g(i4, "FlatBuffers: field ", " must be set"));
        }
    }

    public byte[] sizedByteArray(int i, int i4) {
        finished();
        byte[] bArr = new byte[i4];
        this.f7839bb.position(i);
        this.f7839bb.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer byteBufferDuplicate = this.f7839bb.duplicate();
        byteBufferDuplicate.position(this.space);
        byteBufferDuplicate.limit(this.f7839bb.capacity());
        return new ByteBufferBackedInputStream(byteBufferDuplicate);
    }

    public void slot(int i) {
        this.vtable[i] = offset();
    }

    public void startTable(int i) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i) {
            this.vtable = new int[i];
        }
        this.vtable_in_use = i;
        Arrays.fill(this.vtable, 0, i, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i, int i4, int i6) {
        notNested();
        this.vector_num_elems = i4;
        int i10 = i * i4;
        prep(4, i10);
        prep(i6, i10);
        this.nested = true;
    }

    public FlatBufferBuilder(int i, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i = i <= 0 ? 1 : i;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.f7839bb = byteBuffer;
            byteBuffer.clear();
            this.f7839bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f7839bb = byteBufferFactory.newByteBuffer(i);
        }
        this.utf8 = utf8;
        this.space = this.f7839bb.capacity();
    }

    public void addBoolean(int i, boolean z4, boolean z5) {
        if (this.force_defaults || z4 != z5) {
            addBoolean(z4);
            slot(i);
        }
    }

    public void addByte(int i, byte b8, int i4) {
        if (this.force_defaults || b8 != i4) {
            addByte(b8);
            slot(i);
        }
    }

    public void addDouble(int i, double d10, double d11) {
        if (this.force_defaults || d10 != d11) {
            addDouble(d10);
            slot(i);
        }
    }

    public void addFloat(int i, float f, double d10) {
        if (this.force_defaults || f != d10) {
            addFloat(f);
            slot(i);
        }
    }

    public void addInt(int i, int i4, int i6) {
        if (this.force_defaults || i4 != i6) {
            addInt(i4);
            slot(i);
        }
    }

    public void addLong(int i, long j, long j6) {
        if (this.force_defaults || j != j6) {
            addLong(j);
            slot(i);
        }
    }

    public void addShort(int i, short s9, int i4) {
        if (this.force_defaults || s9 != i4) {
            addShort(s9);
            slot(i);
        }
    }

    public void finishSizePrefixed(int i, String str) {
        finish(i, str, true);
    }

    public void addOffset(int i, int i4, int i6) {
        if (this.force_defaults || i4 != i6) {
            addOffset(i4);
            slot(i);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.f7839bb.capacity() - this.space);
    }

    public int createByteVector(byte[] bArr, int i, int i4) {
        startVector(1, i4, 1);
        ByteBuffer byteBuffer = this.f7839bb;
        int i6 = this.space - i4;
        this.space = i6;
        byteBuffer.position(i6);
        this.f7839bb.put(bArr, i, i4);
        return endVector();
    }

    public void finish(int i) {
        finish(i, false);
    }

    public int createString(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f7839bb;
        int i = this.space - iRemaining;
        this.space = i;
        byteBuffer2.position(i);
        this.f7839bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i, String str, boolean z4) {
        prep(this.minalign, (z4 ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i4 = 3; i4 >= 0; i4--) {
                addByte((byte) str.charAt(i4));
            }
            finish(i, z4);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f7839bb;
        int i = this.space - iRemaining;
        this.space = i;
        byteBuffer2.position(i);
        this.f7839bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i, String str) {
        finish(i, str, false);
    }

    public FlatBufferBuilder(int i) {
        this(i, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, Utf8.getDefault());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, new HeapByteBufferFactory());
    }
}
