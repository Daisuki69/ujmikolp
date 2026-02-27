package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class Table {

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    protected ByteBuffer f7844bb;
    protected int bb_pos;
    Utf8 utf8 = Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    public static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                return false;
            }
        }
        return true;
    }

    public static int compareStrings(int i, int i4, ByteBuffer byteBuffer) {
        int i6 = byteBuffer.getInt(i) + i;
        int i10 = byteBuffer.getInt(i4) + i4;
        int i11 = byteBuffer.getInt(i6);
        int i12 = byteBuffer.getInt(i10);
        int i13 = i6 + 4;
        int i14 = i10 + 4;
        int iMin = Math.min(i11, i12);
        for (int i15 = 0; i15 < iMin; i15++) {
            int i16 = i15 + i13;
            int i17 = i15 + i14;
            if (byteBuffer.get(i16) != byteBuffer.get(i17)) {
                return byteBuffer.get(i16) - byteBuffer.get(i17);
            }
        }
        return i11 - i12;
    }

    public int __indirect(int i) {
        return this.f7844bb.getInt(i) + i;
    }

    public int __offset(int i) {
        if (i < this.vtable_size) {
            return this.f7844bb.getShort(this.vtable_start + i);
        }
        return 0;
    }

    public void __reset(int i, ByteBuffer byteBuffer) {
        this.f7844bb = byteBuffer;
        if (byteBuffer == null) {
            this.bb_pos = 0;
            this.vtable_start = 0;
            this.vtable_size = 0;
        } else {
            this.bb_pos = i;
            int i4 = i - byteBuffer.getInt(i);
            this.vtable_start = i4;
            this.vtable_size = this.f7844bb.getShort(i4);
        }
    }

    public String __string(int i) {
        return __string(i, this.f7844bb, this.utf8);
    }

    public Table __union(Table table, int i) {
        return __union(table, i, this.f7844bb);
    }

    public int __vector(int i) {
        int i4 = i + this.bb_pos;
        return this.f7844bb.getInt(i4) + i4 + 4;
    }

    public ByteBuffer __vector_as_bytebuffer(int i, int i4) {
        int i__offset = __offset(i);
        if (i__offset == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f7844bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i__vector = __vector(i__offset);
        byteBufferOrder.position(i__vector);
        byteBufferOrder.limit((__vector_len(i__offset) * i4) + i__vector);
        return byteBufferOrder;
    }

    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i, int i4) {
        int i__offset = __offset(i);
        if (i__offset == 0) {
            return null;
        }
        int i__vector = __vector(i__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(i__offset) * i4) + i__vector);
        byteBuffer.position(i__vector);
        return byteBuffer;
    }

    public int __vector_len(int i) {
        int i4 = i + this.bb_pos;
        return this.f7844bb.getInt(this.f7844bb.getInt(i4) + i4);
    }

    public ByteBuffer getByteBuffer() {
        return this.f7844bb;
    }

    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    public void sortTables(int[] iArr, final ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new Comparator<Integer>() { // from class: androidx.emoji2.text.flatbuffer.Table.1
            @Override // java.util.Comparator
            public int compare(Integer num, Integer num2) {
                return Table.this.keysCompare(num, num2, byteBuffer);
            }
        });
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
    }

    public static int __indirect(int i, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i) + i;
    }

    public static int __offset(int i, int i4, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i4;
        return byteBuffer.getShort((i + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    public static String __string(int i, ByteBuffer byteBuffer, Utf8 utf8) {
        int i4 = byteBuffer.getInt(i) + i;
        return utf8.decodeUtf8(byteBuffer, i4 + 4, byteBuffer.getInt(i4));
    }

    public static Table __union(Table table, int i, ByteBuffer byteBuffer) {
        table.__reset(__indirect(i, byteBuffer), byteBuffer);
        return table;
    }

    public static int compareStrings(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getInt(i) + i;
        int i6 = byteBuffer.getInt(i4);
        int length = bArr.length;
        int i10 = i4 + 4;
        int iMin = Math.min(i6, length);
        for (int i11 = 0; i11 < iMin; i11++) {
            int i12 = i11 + i10;
            if (byteBuffer.get(i12) != bArr[i11]) {
                return byteBuffer.get(i12) - bArr[i11];
            }
        }
        return i6 - length;
    }

    public void __reset() {
        __reset(0, null);
    }
}
