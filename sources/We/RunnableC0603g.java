package We;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import s.AbstractC2217b;

/* JADX INFO: renamed from: We.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC0603g implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f6387t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0600d f6388u = new C0600d(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicInteger f6389v = new AtomicInteger();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0601e f6390w = new C0601e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6391a = f6389v.incrementAndGet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f6392b;
    public final Si.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T3.l f6393d;
    public final I e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F f6394g;
    public final int h;
    public int i;
    public final H j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC0598b f6395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f6396l;
    public Bitmap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Future f6397n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6398o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Exception f6399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6402s;

    public RunnableC0603g(A a8, Si.b bVar, T3.l lVar, I i, AbstractC0598b abstractC0598b, H h) {
        this.f6392b = a8;
        this.c = bVar;
        this.f6393d = lVar;
        this.e = i;
        this.f6395k = abstractC0598b;
        this.f = abstractC0598b.f6381g;
        F f = abstractC0598b.f6379b;
        this.f6394g = f;
        this.f6402s = f.h;
        this.h = abstractC0598b.f6380d;
        this.i = abstractC0598b.e;
        this.j = h;
        this.f6401r = h.d();
    }

    public static Bitmap a(List list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            M m = (M) list.get(i);
            try {
                Bitmap bitmapB = m.b(bitmap);
                if (bitmapB == null) {
                    StringBuilder sbW = androidx.camera.core.impl.a.w(numX49.tnTj78("bkRU"));
                    sbW.append(m.a());
                    sbW.append(numX49.tnTj78("bkRe"));
                    sbW.append(i);
                    sbW.append(numX49.tnTj78("bkR8"));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sbW.append(((M) it.next()).a());
                        sbW.append('\n');
                    }
                    A.i.post(new C.h(sbW, 9));
                    return null;
                }
                if (bitmapB == bitmap && bitmap.isRecycled()) {
                    A.i.post(new RunnableC0602f(m, 0));
                    return null;
                }
                if (bitmapB != bitmap && !bitmap.isRecycled()) {
                    A.i.post(new RunnableC0602f(m, 1));
                    return null;
                }
                i++;
                bitmap = bitmapB;
            } catch (RuntimeException e) {
                A.i.post(new S1.v(19, m, e));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap c(Source source, F f) throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(source);
        boolean z4 = bufferedSourceBuffer.rangeEquals(0L, O.f6376b) && bufferedSourceBuffer.rangeEquals(8L, O.c);
        f.getClass();
        BitmapFactory.Options optionsC = H.c(f);
        boolean z5 = optionsC != null && optionsC.inJustDecodeBounds;
        int i = f.e;
        boolean z8 = z5;
        int i4 = f.f6356d;
        if (z4) {
            byte[] byteArray = bufferedSourceBuffer.readByteArray();
            if (z8) {
                BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsC);
                H.a(i4, i, optionsC.outWidth, optionsC.outHeight, optionsC, f);
            }
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsC);
        }
        InputStream inputStream = bufferedSourceBuffer.inputStream();
        if (z8) {
            r rVar = new r(inputStream);
            rVar.f = false;
            long j = rVar.f6418b + ((long) 1024);
            if (rVar.f6419d < j) {
                rVar.c(j);
            }
            long j6 = rVar.f6418b;
            BitmapFactory.decodeStream(rVar, null, optionsC);
            H.a(i4, i, optionsC.outWidth, optionsC.outHeight, optionsC, f);
            rVar.b(j6);
            rVar.f = true;
            inputStream = rVar;
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, optionsC);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException(numX49.tnTj78("bkRC"));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap f(We.F r16, android.graphics.Bitmap r17, int r18) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: We.RunnableC0603g.f(We.F, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void g(F f) {
        Uri uri = f.f6354a;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(f.f6355b);
        StringBuilder sb2 = (StringBuilder) f6388u.get();
        sb2.ensureCapacity(strValueOf.length() + 8);
        sb2.replace(8, sb2.length(), strValueOf);
        Thread.currentThread().setName(sb2.toString());
    }

    public final boolean b() {
        ArrayList arrayList;
        Future future;
        return this.f6395k == null && ((arrayList = this.f6396l) == null || arrayList.isEmpty()) && (future = this.f6397n) != null && future.cancel(false);
    }

    public final void d(AbstractC0598b abstractC0598b) {
        boolean zRemove;
        if (this.f6395k == abstractC0598b) {
            this.f6395k = null;
            zRemove = true;
        } else {
            ArrayList arrayList = this.f6396l;
            zRemove = arrayList != null ? arrayList.remove(abstractC0598b) : false;
        }
        if (zRemove) {
            if (abstractC0598b.f6379b.h == this.f6402s) {
                ArrayList arrayList2 = this.f6396l;
                boolean z4 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
                AbstractC0598b abstractC0598b2 = this.f6395k;
                if (abstractC0598b2 != null || z4) {
                    i = abstractC0598b2 != null ? abstractC0598b2.f6379b.h : 1;
                    if (z4) {
                        int size = this.f6396l.size();
                        for (int i = 0; i < size; i++) {
                            int i4 = ((AbstractC0598b) this.f6396l.get(i)).f6379b.h;
                            if (AbstractC2217b.c(i4) > AbstractC2217b.c(i)) {
                                i = i4;
                            }
                        }
                    }
                }
                this.f6402s = i;
            }
        }
        this.f6392b.getClass();
    }

    public final Bitmap e() {
        boolean z4 = true;
        if ((this.h & 1) == 0) {
            q qVar = (q) ((p) this.f6393d.f5786b).get(this.f);
            bitmapF = qVar != null ? qVar.f6415a : null;
            if (bitmapF != null) {
                this.e.f6363b.sendEmptyMessage(0);
                this.f6398o = 1;
                this.f6392b.getClass();
                return bitmapF;
            }
        }
        int i = this.f6401r == 0 ? 4 : this.i;
        this.i = i;
        Q3.b bVarE = this.j.e(this.f6394g, i);
        if (bVarE != null) {
            this.f6398o = bVarE.f5203a;
            this.f6400q = bVarE.f5204b;
            bitmapF = (Bitmap) bVarE.c;
            if (bitmapF == null) {
                Source source = (Source) bVarE.f5205d;
                try {
                    bitmapF = c(source, this.f6394g);
                } finally {
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmapF != null) {
            this.f6392b.getClass();
            I i4 = this.e;
            i4.getClass();
            StringBuilder sb2 = O.f6375a;
            int allocationByteCount = bitmapF.getAllocationByteCount();
            if (allocationByteCount < 0) {
                throw new IllegalStateException(numX49.tnTj78("bkRo") + bitmapF);
            }
            HandlerC0609m handlerC0609m = i4.f6363b;
            handlerC0609m.sendMessage(handlerC0609m.obtainMessage(2, allocationByteCount, 0));
            F f = this.f6394g;
            if (f.b() || f.c != null || this.f6400q != 0) {
                synchronized (f6387t) {
                    try {
                        if (this.f6394g.b() || this.f6400q != 0) {
                            bitmapF = f(this.f6394g, bitmapF, this.f6400q);
                            this.f6392b.getClass();
                        }
                        List list = this.f6394g.c;
                        if (list == null) {
                            z4 = false;
                        }
                        if (z4) {
                            Bitmap bitmapA = a(list, bitmapF);
                            this.f6392b.getClass();
                            bitmapF = bitmapA;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bitmapF != null) {
                    I i6 = this.e;
                    i6.getClass();
                    int allocationByteCount2 = bitmapF.getAllocationByteCount();
                    if (allocationByteCount2 < 0) {
                        throw new IllegalStateException(numX49.tnTj78("bkR4") + bitmapF);
                    }
                    HandlerC0609m handlerC0609m2 = i6.f6363b;
                    handlerC0609m2.sendMessage(handlerC0609m2.obtainMessage(3, allocationByteCount2, 0));
                }
            }
        }
        return bitmapF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Si.b bVar = this.c;
        String strTnTj78 = numX49.tnTj78("bkRK");
        try {
            try {
                try {
                    try {
                        g(this.f6394g);
                        this.f6392b.getClass();
                        Bitmap bitmapE = e();
                        this.m = bitmapE;
                        if (bitmapE == null) {
                            HandlerC0609m handlerC0609m = (HandlerC0609m) bVar.i;
                            handlerC0609m.sendMessage(handlerC0609m.obtainMessage(6, this));
                        } else {
                            bVar.b(this);
                        }
                    } catch (Exception e) {
                        this.f6399p = e;
                        HandlerC0609m handlerC0609m2 = (HandlerC0609m) bVar.i;
                        handlerC0609m2.sendMessage(handlerC0609m2.obtainMessage(6, this));
                    }
                } catch (v e7) {
                    this.f6399p = e7;
                    HandlerC0609m handlerC0609m3 = (HandlerC0609m) bVar.i;
                    handlerC0609m3.sendMessage(handlerC0609m3.obtainMessage(6, this));
                }
            } catch (IOException e10) {
                this.f6399p = e10;
                HandlerC0609m handlerC0609m4 = (HandlerC0609m) bVar.i;
                handlerC0609m4.sendMessageDelayed(handlerC0609m4.obtainMessage(5, this), 500L);
            } catch (OutOfMemoryError e11) {
                StringWriter stringWriter = new StringWriter();
                this.e.a().a(new PrintWriter(stringWriter));
                this.f6399p = new RuntimeException(stringWriter.toString(), e11);
                HandlerC0609m handlerC0609m5 = (HandlerC0609m) bVar.i;
                handlerC0609m5.sendMessage(handlerC0609m5.obtainMessage(6, this));
            }
        } finally {
            Thread.currentThread().setName(strTnTj78);
        }
    }
}
