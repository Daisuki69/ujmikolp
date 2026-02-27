package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class BaseVector {

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    protected ByteBuffer f7838bb;
    private int element_size;
    private int length;
    private int vector;

    public int __element(int i) {
        return (i * this.element_size) + this.vector;
    }

    public void __reset(int i, int i4, ByteBuffer byteBuffer) {
        this.f7838bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i;
            this.length = byteBuffer.getInt(i - 4);
            this.element_size = i4;
        } else {
            this.vector = 0;
            this.length = 0;
            this.element_size = 0;
        }
    }

    public int __vector() {
        return this.vector;
    }

    public int length() {
        return this.length;
    }

    public void reset() {
        __reset(0, 0, null);
    }
}
