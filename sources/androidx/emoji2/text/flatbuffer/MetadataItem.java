package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataItem extends Table {

    public static final class Vector extends BaseVector {
        public Vector __assign(int i, int i4, ByteBuffer byteBuffer) {
            __reset(i, i4, byteBuffer);
            return this;
        }

        public MetadataItem get(int i) {
            return get(new MetadataItem(), i);
        }

        public MetadataItem get(MetadataItem metadataItem, int i) {
            return metadataItem.__assign(Table.__indirect(__element(i), this.f7838bb), this.f7838bb);
        }
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static void addCodepoints(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(6, i, 0);
    }

    public static void addCompatAdded(FlatBufferBuilder flatBufferBuilder, short s9) {
        flatBufferBuilder.addShort(3, s9, 0);
    }

    public static void addEmojiStyle(FlatBufferBuilder flatBufferBuilder, boolean z4) {
        flatBufferBuilder.addBoolean(1, z4, false);
    }

    public static void addHeight(FlatBufferBuilder flatBufferBuilder, short s9) {
        flatBufferBuilder.addShort(5, s9, 0);
    }

    public static void addId(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(0, i, 0);
    }

    public static void addSdkAdded(FlatBufferBuilder flatBufferBuilder, short s9) {
        flatBufferBuilder.addShort(2, s9, 0);
    }

    public static void addWidth(FlatBufferBuilder flatBufferBuilder, short s9) {
        flatBufferBuilder.addShort(4, s9, 0);
    }

    public static int createCodepointsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createMetadataItem(FlatBufferBuilder flatBufferBuilder, int i, boolean z4, short s9, short s10, short s11, short s12, int i4) {
        flatBufferBuilder.startTable(7);
        addCodepoints(flatBufferBuilder, i4);
        addId(flatBufferBuilder, i);
        addHeight(flatBufferBuilder, s12);
        addWidth(flatBufferBuilder, s11);
        addCompatAdded(flatBufferBuilder, s10);
        addSdkAdded(flatBufferBuilder, s9);
        addEmojiStyle(flatBufferBuilder, z4);
        return endMetadataItem(flatBufferBuilder);
    }

    public static int endMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer) {
        return getRootAsMetadataItem(byteBuffer, new MetadataItem());
    }

    public static void startCodepointsVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startMetadataItem(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }

    public MetadataItem __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public int codepoints(int i) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return 0;
        }
        return this.f7844bb.getInt((i * 4) + __vector(i__offset));
    }

    public ByteBuffer codepointsAsByteBuffer() {
        return __vector_as_bytebuffer(16, 4);
    }

    public ByteBuffer codepointsInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 4);
    }

    public int codepointsLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector codepointsVector() {
        return codepointsVector(new IntVector());
    }

    public short compatAdded() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f7844bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public boolean emojiStyle() {
        int i__offset = __offset(6);
        return (i__offset == 0 || this.f7844bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public short height() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f7844bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public int id() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f7844bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public short sdkAdded() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f7844bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short width() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.f7844bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public static MetadataItem getRootAsMetadataItem(ByteBuffer byteBuffer, MetadataItem metadataItem) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return metadataItem.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public IntVector codepointsVector(IntVector intVector) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f7844bb);
        }
        return null;
    }
}
