package org.tensorflow.lite;

import We.s;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.nnapi.NnApiDelegateImpl;

/* JADX INFO: loaded from: classes5.dex */
abstract class NativeInterpreterWrapper implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18920b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MappedByteBuffer f18921d;
    public final TensorImpl[] e;
    public final TensorImpl[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18922g;
    public final ArrayList h;
    public final ArrayList i;

    @UsedByReflection
    private long inferenceDurationNanoseconds = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        r7 = (org.tensorflow.lite.nnapi.NnApiDelegateImpl) r11.getConstructor(null).newInstance(null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NativeInterpreterWrapper(java.nio.MappedByteBuffer r17, org.tensorflow.lite.a r18) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.<init>(java.nio.MappedByteBuffer, org.tensorflow.lite.a):void");
    }

    private static native long allocateTensors(long j, long j6);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j6, int i, boolean z4, List<Long> list);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j6, long j7);

    private static native long deleteCancellationFlag(long j);

    private static native int getInputCount(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native int getOutputTensorIndex(long j, int i);

    private static native String[] getSignatureKeys(long j);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native boolean resizeInput(long j, long j6, int i, int[] iArr, boolean z4);

    private static native void run(long j, long j6);

    public final TensorImpl b(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.e;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.f18920b;
                TensorImpl tensorImplH = TensorImpl.h(getInputTensorIndex(j, i), j);
                tensorImplArr[i] = tensorImplH;
                return tensorImplH;
            }
        }
        throw new IllegalArgumentException(s.f(i, "Invalid input Tensor index: "));
    }

    public final TensorImpl c(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.f;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.f18920b;
                TensorImpl tensorImplH = TensorImpl.h(getOutputTensorIndex(j, i), j);
                tensorImplArr[i] = tensorImplH;
                return tensorImplH;
            }
        }
        throw new IllegalArgumentException(s.f(i, "Invalid output Tensor index: "));
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.e;
            if (i >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                tensorImpl.c();
                this.e[i] = null;
            }
            i++;
        }
        int i4 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.f;
            if (i4 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i4];
            if (tensorImpl2 != null) {
                tensorImpl2.c();
                this.f[i4] = null;
            }
            i4++;
        }
        this.h.clear();
        ArrayList arrayList = this.i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((NnApiDelegateImpl) it.next()).close();
        }
        arrayList.clear();
        delete(this.f18919a, this.c, this.f18920b);
        deleteCancellationFlag(0L);
        this.f18919a = 0L;
        this.c = 0L;
        this.f18920b = 0L;
        this.f18921d = null;
        this.f18922g = false;
    }

    public final String[] f() {
        return getSignatureKeys(this.f18920b);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object[] r9, java.util.HashMap r10) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.g(java.lang.Object[], java.util.HashMap):void");
    }
}
