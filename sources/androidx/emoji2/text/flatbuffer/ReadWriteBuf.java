package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
interface ReadWriteBuf extends ReadBuf {
    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void put(byte b8);

    void put(byte[] bArr, int i, int i4);

    void putBoolean(boolean z4);

    void putDouble(double d10);

    void putFloat(float f);

    void putInt(int i);

    void putLong(long j);

    void putShort(short s9);

    boolean requestCapacity(int i);

    void set(int i, byte b8);

    void set(int i, byte[] bArr, int i4, int i6);

    void setBoolean(int i, boolean z4);

    void setDouble(int i, double d10);

    void setFloat(int i, float f);

    void setInt(int i, int i4);

    void setLong(int i, long j);

    void setShort(int i, short s9);

    int writePosition();
}
