package org.tensorflow.lite;

import We.s;
import d4.AbstractC1331a;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class TensorImpl implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18927b;
    public int[] c;

    public TensorImpl(long j) {
        int i;
        this.f18926a = j;
        int iDtype = dtype(j);
        switch (iDtype) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
            default:
                throw new IllegalArgumentException(s.g(iDtype, "DataType error: DataType ", " is not recognized in Java."));
            case 9:
                i = 8;
                break;
        }
        this.f18927b = i;
        this.c = shape(j);
        shapeSignature(j);
        quantizationScale(j);
        quantizationZeroPoint(j);
    }

    private static native ByteBuffer buffer(long j);

    private static native long create(long j, int i, int i4);

    public static int d(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return d(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native void delete(long j);

    private static native int dtype(long j);

    public static void g(Object obj, int i, int[] iArr) {
        if (i == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i4 = iArr[i];
        if (i4 == 0) {
            iArr[i] = length;
        } else if (i4 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)));
        }
        int i6 = i + 1;
        if (i6 == iArr.length) {
            return;
        }
        for (int i10 = 0; i10 < length; i10++) {
            g(Array.get(obj, i10), i6, iArr);
        }
    }

    public static TensorImpl h(int i, long j) {
        return new TensorImpl(create(j, i, 0));
    }

    private static native boolean hasDelegateBufferHandle(long j);

    private static native String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    private static native void writeScalar(long j, Object obj);

    @Override // org.tensorflow.lite.c
    public final int[] a() {
        return this.c;
    }

    public final ByteBuffer b() {
        return buffer(this.f18926a).order(ByteOrder.nativeOrder());
    }

    public final void c() {
        delete(this.f18926a);
        this.f18926a = 0L;
    }

    public final int[] e(Object obj) {
        int iD = d(obj);
        if (this.f18927b == 5) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iD--;
                }
            }
        }
        int[] iArr = new int[iD];
        g(obj, 0, iArr);
        return iArr;
    }

    public final void f(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.f18926a)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        k(obj);
        boolean z4 = obj instanceof Buffer;
        if (z4) {
            int iNumBytes = numBytes(this.f18926a);
            boolean z5 = obj instanceof ByteBuffer;
            int iCapacity = ((Buffer) obj).capacity();
            if (!z5) {
                iCapacity *= AbstractC1331a.c(this.f18927b);
            }
            if (iNumBytes > iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(this.f18926a), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
        } else {
            int[] iArrE = e(obj);
            if (!Arrays.equals(iArrE, this.c)) {
                throw new IllegalArgumentException(s.p(s.x("Cannot copy from a TensorFlowLite tensor (", name(this.f18926a), ") with shape ", Arrays.toString(this.c), " to a Java object with shape "), Arrays.toString(iArrE), "."));
            }
        }
        if (!z4) {
            readMultiDimensionalArray(this.f18926a, obj);
            return;
        }
        Buffer buffer = (Buffer) obj;
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(b());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(b().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(b().asLongBuffer());
            return;
        }
        if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(b().asIntBuffer());
        } else if (buffer instanceof ShortBuffer) {
            ((ShortBuffer) buffer).put(b().asShortBuffer());
        } else {
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    public final void i() {
        this.c = shape(this.f18926a);
    }

    public final void j(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.f18926a)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        k(obj);
        boolean z4 = obj instanceof Buffer;
        int i = this.f18927b;
        if (z4) {
            int iNumBytes = numBytes(this.f18926a);
            boolean z5 = obj instanceof ByteBuffer;
            int iCapacity = ((Buffer) obj).capacity();
            if (!z5) {
                iCapacity *= AbstractC1331a.c(i);
            }
            if (iNumBytes != iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(this.f18926a), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
        } else {
            int[] iArrE = e(obj);
            if (!Arrays.equals(iArrE, this.c)) {
                throw new IllegalArgumentException(s.p(s.x("Cannot copy to a TensorFlowLite tensor (", name(this.f18926a), ") with shape ", Arrays.toString(this.c), " from a Java object with shape "), Arrays.toString(iArrE), "."));
            }
        }
        if (!z4) {
            if (i == 5 && this.c.length == 0) {
                writeScalar(this.f18926a, obj);
                return;
            } else if (obj.getClass().isArray()) {
                writeMultiDimensionalArray(this.f18926a, obj);
                return;
            } else {
                writeScalar(this.f18926a, obj);
                return;
            }
        }
        Buffer buffer = (Buffer) obj;
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f18926a, buffer);
                return;
            } else {
                b().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f18926a, buffer);
                return;
            } else {
                b().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f18926a, buffer);
                return;
            } else {
                b().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f18926a, buffer);
                return;
            } else {
                b().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (!(buffer instanceof ShortBuffer)) {
            throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
        }
        ShortBuffer shortBuffer = (ShortBuffer) buffer;
        if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.f18926a, buffer);
        } else {
            b().asShortBuffer().put(shortBuffer);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (java.lang.String.class.equals(r0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bc, code lost:
    
        if (java.lang.String.class.equals(r0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d2, code lost:
    
        throw new java.lang.IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(r12.getClass().getName()));
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.TensorImpl.k(java.lang.Object):void");
    }
}
