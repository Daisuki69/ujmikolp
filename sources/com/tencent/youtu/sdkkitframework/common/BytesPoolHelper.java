package com.tencent.youtu.sdkkitframework.common;

/* JADX INFO: loaded from: classes4.dex */
public class BytesPoolHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimplePool<byte[]> f15816a;

    public static final class ByteBufferPoolHelperHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BytesPoolHelper f15817a = new BytesPoolHelper();
    }

    public static BytesPoolHelper getInstance() {
        return ByteBufferPoolHelperHolder.f15817a;
    }

    public byte[] acquire() {
        synchronized (BytesPoolHelper.class) {
            try {
                SimplePool<byte[]> simplePool = this.f15816a;
                if (simplePool == null) {
                    return null;
                }
                return simplePool.acquire();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public byte[] copy(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        return bArr;
    }

    public void recycleAll() {
        this.f15816a = new SimplePool<>(10);
    }

    public boolean release(byte[] bArr) {
        synchronized (BytesPoolHelper.class) {
            try {
                SimplePool<byte[]> simplePool = this.f15816a;
                if (simplePool == null) {
                    return false;
                }
                return simplePool.release(bArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
