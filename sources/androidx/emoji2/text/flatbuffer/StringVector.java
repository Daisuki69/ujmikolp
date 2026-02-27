package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class StringVector extends BaseVector {
    private Utf8 utf8 = Utf8.getDefault();

    public StringVector __assign(int i, int i4, ByteBuffer byteBuffer) {
        __reset(i, i4, byteBuffer);
        return this;
    }

    public String get(int i) {
        return Table.__string(__element(i), this.f7838bb, this.utf8);
    }
}
