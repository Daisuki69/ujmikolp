package com.shield.android.r;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements AutoCloseable {
    private static final int rH = Math.min(32, Runtime.getRuntime().availableProcessors());
    private final byte[] rI;
    private final MessageDigest rJ;
    private final ExecutorService rK;

    public i(byte[] bArr) throws NoSuchAlgorithmException {
        int i = rH;
        this.rK = new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(4), new ThreadPoolExecutor.CallerRunsPolicy());
        this.rI = bArr;
        this.rJ = MessageDigest.getInstance("SHA-256");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [byte[][], java.io.Serializable] */
    private void a(com.shield.android.u.b bVar, com.shield.android.u.a aVar) throws IOException {
        long jEs = bVar.es();
        long j = 4095;
        long j6 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        int i = (int) ((jEs + 4095) / PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        ?? r12 = new byte[i][];
        Phaser phaser = new Phaser(1);
        long j7 = 0;
        int i4 = 0;
        while (j7 < jEs) {
            int iMin = (int) (Math.min(4194304 + j7, jEs) - j7);
            long j9 = iMin;
            int i6 = (int) ((j9 + j) / j6);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i6 << 12);
            bVar.a(j7, iMin, byteBufferAllocate);
            byteBufferAllocate.rewind();
            long j10 = j7;
            C7.d dVar = new C7.d(this, byteBufferAllocate, i4, r12, phaser, 1);
            phaser.register();
            this.rK.execute(dVar);
            i4 += i6;
            j7 = j10 + j9;
            j = 4095;
            j6 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        phaser.arriveAndAwaitAdvance();
        for (int i10 = 0; i10 < i; i10++) {
            byte[] bArr = r12[i10];
            aVar.a(bArr, 0, bArr.length);
        }
    }

    private MessageDigest ev() {
        try {
            try {
                return (MessageDigest) this.rJ.clone();
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException("Failed to obtain an instance of a previously available message digest", e);
            }
        } catch (CloneNotSupportedException unused) {
            return MessageDigest.getInstance("SHA-256");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.rK.shutdownNow();
    }

    public final ByteBuffer d(com.shield.android.u.b bVar) throws IOException {
        com.shield.android.u.b aVar;
        int digestLength = this.rJ.getDigestLength();
        int[] iArrB = b(bVar.es(), digestLength);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iArrB[iArrB.length - 1]);
        for (int length = iArrB.length - 2; length >= 0; length--) {
            int i = iArrB[length];
            int i4 = length + 1;
            int i6 = iArrB[i4];
            ByteBuffer byteBufferDuplicate = byteBufferAllocate.duplicate();
            byteBufferDuplicate.position(0);
            byteBufferDuplicate.limit(i6);
            byteBufferDuplicate.position(i);
            b bVar2 = new b(byteBufferDuplicate.slice());
            if (length == iArrB.length - 2) {
                a(bVar, bVar2);
                aVar = bVar;
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferAllocate.asReadOnlyBuffer();
                int i10 = iArrB[i4];
                int i11 = iArrB[length + 2];
                ByteBuffer byteBufferDuplicate2 = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate2.position(0);
                byteBufferDuplicate2.limit(i11);
                byteBufferDuplicate2.position(i10);
                ByteBuffer byteBufferSlice = byteBufferDuplicate2.slice();
                byteBufferSlice.getClass();
                aVar = new a(byteBufferSlice);
                a(aVar, bVar2);
            }
            int iEs = (int) ((((aVar.es() + 4095) / PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) * ((long) digestLength)) % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            if (iEs > 0) {
                int i12 = 4096 - iEs;
                bVar2.a(new byte[i12], 0, i12);
            }
        }
        return byteBufferAllocate;
    }

    public final byte[] w(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.asReadOnlyBuffer().duplicate();
        byteBufferDuplicate.position(0);
        byteBufferDuplicate.limit(4096);
        byteBufferDuplicate.position(0);
        ByteBuffer byteBufferSlice = byteBufferDuplicate.slice();
        MessageDigest messageDigest = this.rJ;
        messageDigest.reset();
        byte[] bArr = this.rI;
        if (bArr != null) {
            messageDigest.update(bArr);
        }
        messageDigest.update(byteBufferSlice);
        return messageDigest.digest();
    }

    private static int[] b(long j, int i) {
        ArrayList arrayList = new ArrayList();
        do {
            j = ((j + 4095) / PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) * ((long) i);
            arrayList.add(Long.valueOf(((4095 + j) / PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) * PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM));
        } while (j > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        int[] iArr = new int[arrayList.size() + 1];
        int i4 = 0;
        iArr[0] = 0;
        while (i4 < arrayList.size()) {
            int i6 = i4 + 1;
            int i10 = iArr[i4];
            long jLongValue = ((Long) arrayList.get((arrayList.size() - i4) - 1)).longValue();
            int i11 = (int) jLongValue;
            if (jLongValue != i11) {
                throw new ArithmeticException();
            }
            iArr[i6] = i10 + i11;
            i4 = i6;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ByteBuffer byteBuffer, int i, byte[][] bArr, Phaser phaser) {
        MessageDigest messageDigestEv = ev();
        int iCapacity = byteBuffer.capacity();
        int i4 = 0;
        while (i4 < iCapacity) {
            int i6 = i4 + 4096;
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.position(0);
            byteBufferDuplicate.limit(i6);
            byteBufferDuplicate.position(i4);
            ByteBuffer byteBufferSlice = byteBufferDuplicate.slice();
            messageDigestEv.reset();
            byte[] bArr2 = this.rI;
            if (bArr2 != null) {
                messageDigestEv.update(bArr2);
            }
            messageDigestEv.update(byteBufferSlice);
            bArr[i] = messageDigestEv.digest();
            i++;
            i4 = i6;
        }
        phaser.arriveAndDeregister();
    }
}
