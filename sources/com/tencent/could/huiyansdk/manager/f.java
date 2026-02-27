package com.tencent.could.huiyansdk.manager;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.manager.b;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.a;
import com.tencent.could.huiyansdk.utils.b;
import com.tencent.could.huiyansdk.utils.h;
import com.tencent.could.huiyansdk.utils.i;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import sf.RunnableC2257a;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f15690b;
    public volatile int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaCodec f15691d;
    public MediaMuxer e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15692g;
    public String h;
    public Object i;
    public long m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayBlockingQueue<byte[]> f15689a = new ArrayBlockingQueue<>(10);
    public int f = -1;
    public volatile boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f15693k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15694l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f15695n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15696o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15697p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15698q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15699r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15700s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15701t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15702u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15703v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CountDownLatch f15704w = new CountDownLatch(1);

    public f() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        String strP;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
        Context contextA = huiYanBaseApi.a();
        if (contextA == null) {
            e.a.f15688a.a(2, "VideoRecorderManager", "Context is null");
            return;
        }
        if (huiYanBaseApi.f15621d) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(contextA.getExternalFilesDir(null));
            String str = File.separator;
            strP = androidx.camera.core.impl.a.p(sb2, str, "cloud-huiyan", str, "video");
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(contextA.getFilesDir());
            String str2 = File.separator;
            strP = androidx.camera.core.impl.a.p(sb3, str2, "cloud-huiyan", str2, "video");
        }
        File file = new File(strP);
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b A[EDGE_INSN: B:50:0x006b->B:35:0x006b BREAK  A[LOOP:0: B:6:0x001a->B:26:0x004b]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.huiyansdk.manager.f.f():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() throws Throwable {
        Object obj;
        byte[] bArrA;
        Exception e;
        h<byte[]> hVar;
        h<byte[]> hVar2;
        h<byte[]> hVar3;
        try {
            this.f15704w.await();
        } catch (InterruptedException e7) {
            e.a.f15688a.a(2, "VideoRecorderManager", "countDownLatch.wait(): " + e7.getLocalizedMessage());
        }
        while (!this.j) {
            long j = this.m;
            if (this.f15689a.size() > 0) {
                byte[] bArrPoll = this.f15689a.poll();
                try {
                    bArrA = a(bArrPoll);
                    b.a.f15729a.a(bArrPoll);
                    try {
                        try {
                            if (this.f15690b == 640) {
                                this.c = 448;
                            } else if (this.f15690b == 1280) {
                                this.c = TypedValues.TransitionType.TYPE_AUTO_TRANSITION;
                            }
                            if (this.f15700s) {
                                b(bArrA, this.f15690b, this.c);
                            }
                            if (this.f15701t) {
                                bArrA = c(bArrA, this.f15690b, this.c);
                            }
                            byte[] bArrA2 = a(bArrA, this.f15690b, this.c);
                            if (bArrA2 == null) {
                                b(bArrA);
                                if (bArrA2 != null && (hVar3 = a.C0086a.f15727a.f15726a) != null) {
                                    hVar3.release(bArrA2);
                                }
                                b(bArrA);
                            } else {
                                a(bArrA2, j);
                                h<byte[]> hVar4 = a.C0086a.f15727a.f15726a;
                                if (hVar4 != null) {
                                    hVar4.release(bArrA2);
                                }
                                b(bArrA);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            e.a.f15688a.a(2, "VideoRecorderManager", "record video has some error! " + e.getLocalizedMessage());
                            this.j = true;
                            if (0 != 0 && (hVar2 = a.C0086a.f15727a.f15726a) != null) {
                                hVar2.release(null);
                            }
                            b(bArrA);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bArrPoll = bArrA;
                        if (0 != 0 && (hVar = a.C0086a.f15727a.f15726a) != null) {
                            hVar.release(null);
                        }
                        b(bArrPoll);
                        throw th;
                    }
                } catch (Exception e11) {
                    bArrA = bArrPoll;
                    e = e11;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        synchronized (this.i) {
            try {
                try {
                    MediaMuxer mediaMuxer = this.e;
                    if (mediaMuxer != null) {
                        try {
                            mediaMuxer.stop();
                        } catch (IllegalStateException e12) {
                            e.a.f15688a.a(2, "VideoRecorderManager", "mediaMuxer.stop(): " + e12.getLocalizedMessage());
                        }
                        this.e.release();
                        this.e = null;
                    }
                    MediaCodec mediaCodec = this.f15691d;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        this.f15691d.release();
                        this.f15691d = null;
                    }
                    obj = this.i;
                } catch (Throwable th4) {
                    this.i.notifyAll();
                    throw th4;
                }
            } catch (RuntimeException e13) {
                e.a.f15688a.a(2, "VideoRecorderManager", "release media state error! e: " + e13.getLocalizedMessage());
                obj = this.i;
            }
            obj.notifyAll();
            if (this.f15693k) {
                Log.d("VideoRecorderManager", "delete All Temp video by temp!");
                a();
            }
        }
    }

    public void h() {
        e eVar = e.a.f15688a;
        eVar.a(1, "VideoRecorderManager", "start thread encoder video!");
        b.C0084b.f15678a.f15674s = true;
        if (d()) {
            eVar.a(2, "VideoRecorderManager", "start thread not need video!");
        } else {
            this.m = System.nanoTime();
            i.a.f15743a.a(new RunnableC2257a(this, 0));
        }
    }

    public final String a(String str) {
        String str2;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
        Context contextA = huiYanBaseApi.a();
        if (contextA == null) {
            e.a.f15688a.a(2, "VideoRecorderManager", "Context is null");
            return null;
        }
        StringBuilder sb2 = new StringBuilder("cloud-huiyan");
        String str3 = File.separator;
        String strP = androidx.camera.core.impl.a.p(sb2, str3, "video", str3, str);
        if (huiYanBaseApi.f15621d) {
            str2 = contextA.getExternalFilesDir(null) + str3 + strP;
        } else {
            str2 = contextA.getFilesDir() + str3 + strP;
        }
        File file = new File(str2);
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            e.a.f15688a.a(2, "VideoRecorderManager", "Create parent dir error!");
        }
        if (file.exists() && !file.delete()) {
            e.a.f15688a.a(2, "VideoRecorderManager", "delete last video error!");
        }
        return str2;
    }

    public final void b(byte[] bArr) {
        h<byte[]> hVar = a.C0086a.f15727a.f15726a;
        if (hVar == null) {
            return;
        }
        hVar.release(bArr);
    }

    public final byte[] c(byte[] bArr, int i, int i4) {
        byte[] bArrA = a.C0086a.f15727a.a();
        if (bArrA == null) {
            bArrA = new byte[((i * i4) * 3) / 2];
        }
        int i6 = i * i4;
        int i10 = 0;
        for (int i11 = i6 - 1; i11 >= 0; i11--) {
            bArrA[i10] = bArr[i11];
            i10++;
        }
        for (int i12 = ((i6 * 3) / 2) - 1; i12 >= i6; i12 -= 2) {
            int i13 = i10 + 1;
            bArrA[i10] = bArr[i12 - 1];
            i10 += 2;
            bArrA[i13] = bArr[i12];
        }
        b(bArr);
        return bArrA;
    }

    public final boolean d() {
        return (this.f15698q && this.f15695n && !this.f15697p) ? false : true;
    }

    public final void b() {
        HuiYanSdkConfig huiYanSdkConfigB = j.a.f15618a.b();
        if (huiYanSdkConfigB == null) {
            return;
        }
        this.f15698q = huiYanSdkConfigB.isRecordVideo();
        if (huiYanSdkConfigB.isDeleteVideoCache()) {
            i.a.f15743a.a(new RunnableC2257a(this, 1));
        }
    }

    public final int c() {
        HuiYanSdkConfig huiYanSdkConfigB = j.a.f15618a.b();
        return (huiYanSdkConfigB != null && huiYanSdkConfigB.isLandMode()) ? 0 : 90;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.tencent.could.huiyansdk.callback.e eVar) {
        synchronized (this.i) {
            try {
                this.j = true;
                this.i.wait();
            } catch (InterruptedException unused) {
                e.a.f15688a.a(2, "VideoRecorderManager", "wait thread is interrupted!");
            }
            String strA = a(eVar);
            if (!TextUtils.isEmpty(strA) && this.f15692g.equals(strA) && CommonUtils.copyFile(this.f15692g, this.h)) {
                strA = this.h;
            }
            if (eVar != null) {
                eVar.a(true, strA);
            }
            a();
        }
    }

    public void c(com.tencent.could.huiyansdk.callback.e eVar) {
        if (d()) {
            if (eVar != null) {
                eVar.a(false, "");
            }
        } else if (!this.j) {
            i.a.f15743a.a(new io.flutter.plugins.firebase.core.a(12, this, eVar));
        } else if (eVar != null) {
            eVar.a(false, "");
        }
    }

    public final void b(byte[] bArr, int i, int i4) {
        int i6 = 0;
        int i10 = 0;
        while (i10 < i4) {
            int i11 = i10 * i;
            i10++;
            for (int i12 = (i10 * i) - 1; i11 < i12; i12--) {
                byte b8 = bArr[i11];
                bArr[i11] = bArr[i12];
                bArr[i12] = b8;
                i11++;
            }
        }
        int i13 = i * i4;
        while (i6 < i4 / 2) {
            int i14 = i6 * i;
            i6++;
            for (int i15 = (i6 * i) - 2; i14 < i15; i15 -= 2) {
                int i16 = i14 + i13;
                byte b10 = bArr[i16];
                int i17 = i15 + i13;
                bArr[i16] = bArr[i17];
                bArr[i17] = b10;
                int i18 = i16 + 1;
                byte b11 = bArr[i18];
                int i19 = i17 + 1;
                bArr[i18] = bArr[i19];
                bArr[i19] = b11;
                i14 += 2;
            }
        }
    }

    public final boolean a(int i, int[] iArr) {
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    public void a(int i, int i4, int i6) {
        this.f15699r = false;
        this.f15690b = i;
        this.c = i4;
        j jVar = j.a.f15618a;
        if (jVar.d()) {
            this.f15699r = true;
            this.c = TypedValues.TransitionType.TYPE_AUTO_TRANSITION;
        } else {
            this.c = 448;
        }
        if (5 == i6) {
            this.f15701t = true;
        }
        HuiYanSdkConfig huiYanSdkConfigB = jVar.b();
        if (huiYanSdkConfigB != null && huiYanSdkConfigB.isUseBackCamera()) {
            this.f15700s = false;
        }
        this.f15702u = i;
        this.f15703v = i4;
        i.a.f15743a.a(new RunnableC2257a(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r12 = r5.getTrackFormat(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        r5.selectTrack(r11);
        r13 = r12.getLong("durationUs");
        r15 = com.tencent.could.huiyansdk.api.j.a.f15618a.f15615b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r15 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r15 = androidx.media3.exoplayer.ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r15 = r15.getCutVideoDuration();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r13 = r13 - (r15 * 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r13 >= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        r5.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        com.tencent.could.huiyansdk.manager.e.a.f15688a.a(2, "VideoRecorderManager", "use order video!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        return r19.f15692g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        r5.seekTo(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r12.containsKey("max-input-size") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r13 = r12.getInteger("height");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (r12.containsKey("max-height") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        r13 = java.lang.Math.max(r13, r12.getInteger("max-height"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        r3 = r12.getInteger("width");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (r12.containsKey("max-width") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r3 = java.lang.Math.max(r13, r12.getInteger("max-width"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        r12.setInteger("max-input-size", ((((r3 + 15) / 16) * ((r13 + 15) / 16)) * 768) / 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        r0 = java.nio.ByteBuffer.allocate(r12.getInteger("max-input-size"));
        r3 = new android.media.MediaCodec.BufferInfo();
        r4 = new android.media.MediaMuxer(r19.h, 0);
        r12 = r4.addTrack(r12);
        r4.setOrientationHint(c());
        r4.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        r13 = r5.readSampleData(r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
    
        if (r13 >= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
    
        r5.unselectTrack(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        r4.stop();
        r4.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
    
        com.tencent.could.huiyansdk.manager.e.a.f15688a.a(2, "VideoRecorderManager", "cutMediaMuxer.stop(): " + r0.getLocalizedMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011f, code lost:
    
        r14 = r5.getSampleFlags();
        r3.offset = 0;
        r3.size = r13;
        r3.flags = r14;
        r3.presentationTimeUs = r5.getSampleTime();
        r4.writeSampleData(r12, r0, r3);
        r5.advance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        r5.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013f, code lost:
    
        if (com.tencent.could.huiyansdk.utils.d.a.f15733a.f15731a == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0142, code lost:
    
        com.tencent.could.component.common.ai.log.AiLog.error("VideoRecorderManager", "mediaExtractor.getTrackFormat(sourceVideoTrack) IllegalArgumentException ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        return r19.f15692g;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(com.tencent.could.huiyansdk.callback.e r20) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.huiyansdk.manager.f.a(com.tencent.could.huiyansdk.callback.e):java.lang.String");
    }

    public final void a(byte[] bArr, long j) {
        ByteBuffer[] inputBuffers = this.f15691d.getInputBuffers();
        ByteBuffer[] outputBuffers = this.f15691d.getOutputBuffers();
        int iDequeueInputBuffer = this.f15691d.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            this.f15691d.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, (System.nanoTime() - j) / 1000, 0);
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.f15691d.dequeueOutputBuffer(bufferInfo, 0L);
        if (iDequeueOutputBuffer == -2) {
            int iAddTrack = this.e.addTrack(this.f15691d.getOutputFormat());
            this.f = iAddTrack;
            if (iAddTrack >= 0) {
                this.e.start();
            }
        }
        while (iDequeueOutputBuffer > 0) {
            ByteBuffer byteBuffer2 = outputBuffers[iDequeueOutputBuffer];
            int i = this.f;
            if (i >= 0) {
                this.e.writeSampleData(i, byteBuffer2, bufferInfo);
            }
            this.f15691d.releaseOutputBuffer(iDequeueOutputBuffer, false);
            iDequeueOutputBuffer = this.f15691d.dequeueOutputBuffer(bufferInfo, 0L);
        }
    }

    public final byte[] a(byte[] bArr, int i, int i4) {
        int i6;
        if (bArr == null) {
            return null;
        }
        int i10 = this.f15696o;
        if (i10 == 19) {
            byte[] bArrA = a.C0086a.f15727a.a();
            if (bArrA == null) {
                bArrA = new byte[((i * i4) * 3) / 2];
            }
            int i11 = i * i4;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrA, 0, i11);
            int i12 = i11 / 4;
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrA, i11, i12);
            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArrA, i11 + i12, i12);
            byteBufferWrap.put(bArr, 0, i11);
            while (i11 < bArr.length) {
                byteBufferWrap3.put(bArr[i11]);
                byteBufferWrap2.put(bArr[i11 + 1]);
                i11 += 2;
            }
            return bArrA;
        }
        if (i10 != 21) {
            return null;
        }
        byte[] bArrA2 = a.C0086a.f15727a.a();
        if (bArrA2 == null) {
            bArrA2 = new byte[((i * i4) * 3) / 2];
        }
        int i13 = i * i4;
        for (int i14 = 0; i14 < i13; i14++) {
            bArrA2[i14] = bArr[i14];
        }
        int i15 = 0;
        while (true) {
            i6 = i13 / 2;
            if (i15 >= i6) {
                break;
            }
            int i16 = i13 + i15;
            bArrA2[i16 - 1] = bArr[i16];
            i15 += 2;
        }
        for (int i17 = 0; i17 < i6; i17 += 2) {
            int i18 = i13 + i17;
            bArrA2[i18] = bArr[i18 - 1];
        }
        return bArrA2;
    }

    public final byte[] a(byte[] bArr) {
        if (this.f15699r) {
            int i = this.f15702u;
            int i4 = this.f15703v;
            return CommonUtils.clipNV21(bArr, i, i4, (i - 1280) / 2, (i4 - 704) / 2, 1280, TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
        }
        int i6 = this.f15702u;
        int i10 = this.f15703v;
        return CommonUtils.clipNV21(bArr, i6, i10, (i6 - 640) / 2, (i10 - 448) / 2, 640, 448);
    }

    public final void a() {
        String str = this.f15692g;
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            Log.e("VideoRecorderManager", "delete temp video error path:" + str);
        }
    }
}
