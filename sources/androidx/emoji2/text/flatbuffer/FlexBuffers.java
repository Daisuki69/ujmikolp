package androidx.emoji2.text.flatbuffer;

import androidx.camera.video.AudioStats;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    public static class Blob extends Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final Blob EMPTY = new Blob(FlexBuffers.EMPTY_BB, 1, 1);

        public Blob(ReadBuf readBuf, int i, int i4) {
            super(readBuf, i, i4);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f7840bb.data());
            byteBufferWrap.position(this.end);
            byteBufferWrap.limit(size() + this.end);
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i) {
            return this.f7840bb.get(this.end + i);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.f7840bb.get(this.end + i);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.f7840bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append('\"');
            sb2.append(this.f7840bb.getString(this.end, size()));
            sb2.append('\"');
            return sb2;
        }
    }

    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    public static class Key extends Object {
        private static final Key EMPTY = new Key(FlexBuffers.EMPTY_BB, 0, 0);

        public Key(ReadBuf readBuf, int i, int i4) {
            super(readBuf, i, i4);
        }

        public static Key empty() {
            return EMPTY;
        }

        public int compareTo(byte[] bArr) {
            byte b8;
            byte b10;
            int i = this.end;
            int i4 = 0;
            do {
                b8 = this.f7840bb.get(i);
                b10 = bArr[i4];
                if (b8 == 0) {
                    return b8 - b10;
                }
                i++;
                i4++;
                if (i4 == bArr.length) {
                    return b8 - b10;
                }
            } while (b8 == b10);
            return b8 - b10;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.end == this.end && key.byteWidth == this.byteWidth;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i = this.end;
            while (this.f7840bb.get(i) != 0) {
                i++;
            }
            int i4 = this.end;
            return this.f7840bb.getString(i4, i - i4);
        }
    }

    public static class KeyVector {
        private final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i) {
            if (i >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i4 = (i * typedVector.byteWidth) + typedVector.end;
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.f7840bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i4, typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (int i = 0; i < this.vec.size(); i++) {
                this.vec.get(i).toString(sb2);
                if (i != this.vec.size() - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        public Map(ReadBuf readBuf, int i, int i4) {
            super(readBuf, i, i4);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i = 0;
            while (i <= size) {
                int i4 = (i + size) >>> 1;
                int iCompareTo = keyVector.get(i4).compareTo(bArr);
                if (iCompareTo < 0) {
                    i = i4 + 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i4;
                    }
                    size = i4 - 1;
                }
            }
            return -(i + 1);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            int i = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.f7840bb;
            int iIndirect = FlexBuffers.indirect(readBuf, i, this.byteWidth);
            ReadBuf readBuf2 = this.f7840bb;
            int i4 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, iIndirect, FlexBuffers.readInt(readBuf2, i + i4, i4), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append("{ ");
            KeyVector keyVectorKeys = keys();
            int size = size();
            Vector vectorValues = values();
            for (int i = 0; i < size; i++) {
                sb2.append('\"');
                sb2.append(keyVectorKeys.get(i).toString());
                sb2.append("\" : ");
                sb2.append(vectorValues.get(i).toString());
                if (i != size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" }");
            return sb2;
        }

        public Vector values() {
            return new Vector(this.f7840bb, this.end, this.byteWidth);
        }

        public Reference get(byte[] bArr) {
            KeyVector keyVectorKeys = keys();
            int size = keyVectorKeys.size();
            int iBinarySearch = binarySearch(keyVectorKeys, bArr);
            return (iBinarySearch < 0 || iBinarySearch >= size) ? Reference.NULL_REFERENCE : get(iBinarySearch);
        }
    }

    public static abstract class Object {

        /* JADX INFO: renamed from: bb, reason: collision with root package name */
        ReadBuf f7840bb;
        int byteWidth;
        int end;

        public Object(ReadBuf readBuf, int i, int i4) {
            this.f7840bb = readBuf;
            this.end = i;
            this.byteWidth = i4;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb2);
    }

    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);

        /* JADX INFO: renamed from: bb, reason: collision with root package name */
        private ReadBuf f7841bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        public Reference(ReadBuf readBuf, int i, int i4, int i6) {
            this(readBuf, i, i4, 1 << (i6 & 3), i6 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.f7841bb;
            return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            return isBoolean() ? this.f7841bb.get(this.end) != 0 : asUInt() != 0;
        }

        public double asFloat() {
            int i = this.type;
            if (i == 3) {
                return FlexBuffers.readDouble(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return FlexBuffers.readInt(this.f7841bb, this.end, this.parentWidth);
            }
            if (i != 2) {
                if (i == 5) {
                    return Double.parseDouble(asString());
                }
                if (i == 6) {
                    ReadBuf readBuf = this.f7841bb;
                    return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                }
                if (i == 7) {
                    ReadBuf readBuf2 = this.f7841bb;
                    return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                }
                if (i == 8) {
                    ReadBuf readBuf3 = this.f7841bb;
                    return FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                }
                if (i == 10) {
                    return asVector().size();
                }
                if (i != 26) {
                    return AudioStats.AUDIO_AMPLITUDE_NONE;
                }
            }
            return FlexBuffers.readUInt(this.f7841bb, this.end, this.parentWidth);
        }

        public int asInt() {
            int i = this.type;
            if (i == 1) {
                return FlexBuffers.readInt(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return (int) FlexBuffers.readUInt(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (int) FlexBuffers.readDouble(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return Integer.parseInt(asString());
            }
            if (i == 6) {
                ReadBuf readBuf = this.f7841bb;
                return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                ReadBuf readBuf2 = this.f7841bb;
                return (int) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i == 8) {
                ReadBuf readBuf3 = this.f7841bb;
                return (int) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0;
            }
            return FlexBuffers.readInt(this.f7841bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (!isKey()) {
                return Key.empty();
            }
            ReadBuf readBuf = this.f7841bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public long asLong() {
            int i = this.type;
            if (i == 1) {
                return FlexBuffers.readLong(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 2) {
                return FlexBuffers.readUInt(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.readDouble(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i == 6) {
                ReadBuf readBuf = this.f7841bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                ReadBuf readBuf2 = this.f7841bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i == 8) {
                ReadBuf readBuf3 = this.f7841bb;
                return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0L;
            }
            return FlexBuffers.readInt(this.f7841bb, this.end, this.parentWidth);
        }

        public Map asMap() {
            if (!isMap()) {
                return Map.empty();
            }
            ReadBuf readBuf = this.f7841bb;
            return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public String asString() {
            if (isString()) {
                int iIndirect = FlexBuffers.indirect(this.f7841bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.f7841bb;
                int i = this.byteWidth;
                return this.f7841bb.getString(iIndirect, (int) FlexBuffers.readUInt(readBuf, iIndirect - i, i));
            }
            if (!isKey()) {
                return "";
            }
            int iIndirect2 = FlexBuffers.indirect(this.f7841bb, this.end, this.byteWidth);
            int i4 = iIndirect2;
            while (this.f7841bb.get(i4) != 0) {
                i4++;
            }
            return this.f7841bb.getString(iIndirect2, i4 - iIndirect2);
        }

        public long asUInt() {
            int i = this.type;
            if (i == 2) {
                return FlexBuffers.readUInt(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 1) {
                return FlexBuffers.readLong(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 3) {
                return (long) FlexBuffers.readDouble(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i == 26) {
                return FlexBuffers.readInt(this.f7841bb, this.end, this.parentWidth);
            }
            if (i == 5) {
                return Long.parseLong(asString());
            }
            if (i == 6) {
                ReadBuf readBuf = this.f7841bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i == 7) {
                ReadBuf readBuf2 = this.f7841bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            }
            if (i != 8) {
                return 0L;
            }
            ReadBuf readBuf3 = this.f7841bb;
            return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.f7841bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i = this.type;
            if (i == 15) {
                ReadBuf readBuf2 = this.f7841bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (!FlexBuffers.isTypedVector(i)) {
                return Vector.empty();
            }
            ReadBuf readBuf3 = this.f7841bb;
            return new TypedVector(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
        }

        public int getType() {
            return this.type;
        }

        public boolean isBlob() {
            return this.type == 25;
        }

        public boolean isBoolean() {
            return this.type == 26;
        }

        public boolean isFloat() {
            int i = this.type;
            return i == 3 || i == 8;
        }

        public boolean isInt() {
            int i = this.type;
            return i == 1 || i == 6;
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isKey() {
            return this.type == 4;
        }

        public boolean isMap() {
            return this.type == 9;
        }

        public boolean isNull() {
            return this.type == 0;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isString() {
            return this.type == 5;
        }

        public boolean isTypedVector() {
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isUInt() {
            int i = this.type;
            return i == 2 || i == 7;
        }

        public boolean isVector() {
            int i = this.type;
            return i == 10 || i == 9;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public Reference(ReadBuf readBuf, int i, int i4, int i6, int i10) {
            this.f7841bb = readBuf;
            this.end = i;
            this.parentWidth = i4;
            this.byteWidth = i6;
            this.type = i10;
        }

        public StringBuilder toString(StringBuilder sb2) {
            int i = this.type;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb2.append("null");
                        return sb2;
                    case 1:
                    case 6:
                        sb2.append(asLong());
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(asUInt());
                        return sb2;
                    case 3:
                    case 8:
                        sb2.append(asFloat());
                        return sb2;
                    case 4:
                        Key keyAsKey = asKey();
                        sb2.append('\"');
                        StringBuilder string = keyAsKey.toString(sb2);
                        string.append('\"');
                        return string;
                    case 5:
                        sb2.append('\"');
                        sb2.append(asString());
                        sb2.append('\"');
                        return sb2;
                    case 9:
                        return asMap().toString(sb2);
                    case 10:
                        return asVector().toString(sb2);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb2);
                    case 26:
                        sb2.append(asBoolean());
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(asVector());
            return sb2;
        }
    }

    public static abstract class Sized extends Object {
        protected final int size;

        public Sized(ReadBuf readBuf, int i, int i4) {
            super(readBuf, i, i4);
            this.size = FlexBuffers.readInt(this.f7840bb, i - i4, i4);
        }

        public int size() {
            return this.size;
        }
    }

    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        public TypedVector(ReadBuf readBuf, int i, int i4, int i6) {
            super(readBuf, i, i4);
            this.elemType = i6;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i) {
            if (i >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f7840bb, (i * this.byteWidth) + this.end, this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }
    }

    public static class Unsigned {
        public static int byteToUnsignedInt(byte b8) {
            return b8 & 255;
        }

        public static long intToUnsignedLong(int i) {
            return ((long) i) & KeyboardMap.kValueMask;
        }

        public static int shortToUnsignedInt(short s9) {
            return s9 & 65535;
        }
    }

    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        public Vector(ReadBuf readBuf, int i, int i4) {
            super(readBuf, i, i4);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f7840bb, (i * this.byteWidth) + this.end, this.byteWidth, Unsigned.byteToUnsignedInt(this.f7840bb.get((int) ((size * ((long) this.byteWidth)) + ((long) this.end) + j))));
        }

        public boolean isEmpty() {
            return this == EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).toString(sb2);
                if (i != size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" ]");
            return sb2;
        }
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(ReadBuf readBuf, int i, int i4) {
        return (int) (((long) i) - readUInt(readBuf, i, i4));
    }

    public static boolean isTypeInline(int i) {
        return i <= 3 || i == 26;
    }

    public static boolean isTypedVector(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    public static boolean isTypedVectorElementType(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i, int i4) {
        if (i4 == 4) {
            return readBuf.getFloat(i);
        }
        if (i4 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i, int i4) {
        return (int) readLong(readBuf, i, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i, int i4) {
        int i6;
        if (i4 == 1) {
            i6 = readBuf.get(i);
        } else if (i4 == 2) {
            i6 = readBuf.getShort(i);
        } else {
            if (i4 != 4) {
                if (i4 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i);
            }
            i6 = readBuf.getInt(i);
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i, int i4) {
        if (i4 == 1) {
            return Unsigned.byteToUnsignedInt(readBuf.get(i));
        }
        if (i4 == 2) {
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i));
        }
        if (i4 == 4) {
            return Unsigned.intToUnsignedLong(readBuf.getInt(i));
        }
        if (i4 != 8) {
            return -1L;
        }
        return readBuf.getLong(i);
    }

    public static int toTypedVector(int i, int i4) {
        if (i4 == 0) {
            return i + 10;
        }
        if (i4 == 2) {
            return i + 15;
        }
        if (i4 == 3) {
            return i + 18;
        }
        if (i4 != 4) {
            return 0;
        }
        return i + 21;
    }

    public static int toTypedVectorElementType(int i) {
        return i - 10;
    }

    public static Reference getRoot(ReadBuf readBuf) {
        int iLimit = readBuf.limit();
        byte b8 = readBuf.get(iLimit - 1);
        int i = iLimit - 2;
        return new Reference(readBuf, i - b8, b8, Unsigned.byteToUnsignedInt(readBuf.get(i)));
    }
}
