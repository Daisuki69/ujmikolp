package com.shockwave.pdfium;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.Size;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class PdfiumCore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f15511b;
    public static Field c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15512a;

    static {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e) {
            Log.e("com.shockwave.pdfium.PdfiumCore", "Native libraries failed to load - " + e);
        }
        f15511b = new Object();
        c = null;
    }

    private native void nativeCloseDocument(long j);

    private native void nativeClosePage(long j);

    private native long nativeGetBookmarkDestIndex(long j, long j6);

    private native String nativeGetBookmarkTitle(long j);

    private native Integer nativeGetDestPageIndex(long j, long j6);

    private native String nativeGetDocumentMetaText(long j, String str);

    private native Long nativeGetFirstChildBookmark(long j, Long l6);

    private native RectF nativeGetLinkRect(long j);

    private native String nativeGetLinkURI(long j, long j6);

    private native int nativeGetPageCount(long j);

    private native long[] nativeGetPageLinks(long j);

    private native Size nativeGetPageSizeByIndex(long j, int i, int i4);

    private native Long nativeGetSiblingBookmark(long j, long j6);

    private native long nativeLoadPage(long j, int i);

    private native long nativeOpenDocument(int i, String str);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native Point nativePageCoordsToDevice(long j, int i, int i4, int i6, int i10, int i11, double d10, double d11);

    private native void nativeRenderPageBitmap(long j, Bitmap bitmap, int i, int i4, int i6, int i10, int i11, boolean z4);

    public final void a(PdfDocument pdfDocument) {
        synchronized (f15511b) {
            try {
                Iterator it = pdfDocument.c.keySet().iterator();
                while (it.hasNext()) {
                    nativeClosePage(((Long) pdfDocument.c.get((Integer) it.next())).longValue());
                }
                pdfDocument.c.clear();
                nativeCloseDocument(pdfDocument.f15506a);
                ParcelFileDescriptor parcelFileDescriptor = pdfDocument.f15507b;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    pdfDocument.f15507b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final PdfDocument.Meta b(PdfDocument pdfDocument) {
        PdfDocument.Meta meta;
        synchronized (f15511b) {
            meta = new PdfDocument.Meta();
            nativeGetDocumentMetaText(pdfDocument.f15506a, "Title");
            nativeGetDocumentMetaText(pdfDocument.f15506a, "Author");
            nativeGetDocumentMetaText(pdfDocument.f15506a, "Subject");
            nativeGetDocumentMetaText(pdfDocument.f15506a, "Keywords");
            nativeGetDocumentMetaText(pdfDocument.f15506a, "Creator");
            nativeGetDocumentMetaText(pdfDocument.f15506a, "Producer");
            nativeGetDocumentMetaText(pdfDocument.f15506a, "CreationDate");
            nativeGetDocumentMetaText(pdfDocument.f15506a, "ModDate");
        }
        return meta;
    }

    public final int c(PdfDocument pdfDocument) {
        int iNativeGetPageCount;
        synchronized (f15511b) {
            iNativeGetPageCount = nativeGetPageCount(pdfDocument.f15506a);
        }
        return iNativeGetPageCount;
    }

    public final ArrayList d(PdfDocument pdfDocument, int i) {
        synchronized (f15511b) {
            try {
                ArrayList arrayList = new ArrayList();
                Long l6 = (Long) pdfDocument.c.get(Integer.valueOf(i));
                if (l6 == null) {
                    return arrayList;
                }
                for (long j : nativeGetPageLinks(l6.longValue())) {
                    Integer numNativeGetDestPageIndex = nativeGetDestPageIndex(pdfDocument.f15506a, j);
                    String strNativeGetLinkURI = nativeGetLinkURI(pdfDocument.f15506a, j);
                    RectF rectFNativeGetLinkRect = nativeGetLinkRect(j);
                    if (rectFNativeGetLinkRect != null && (numNativeGetDestPageIndex != null || strNativeGetLinkURI != null)) {
                        PdfDocument.Link link = new PdfDocument.Link();
                        link.f15509a = rectFNativeGetLinkRect;
                        link.f15510b = numNativeGetDestPageIndex;
                        link.c = strNativeGetLinkURI;
                        arrayList.add(link);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Size e(PdfDocument pdfDocument, int i) {
        Size sizeNativeGetPageSizeByIndex;
        synchronized (f15511b) {
            sizeNativeGetPageSizeByIndex = nativeGetPageSizeByIndex(pdfDocument.f15506a, i, this.f15512a);
        }
        return sizeNativeGetPageSizeByIndex;
    }

    public final ArrayList f(PdfDocument pdfDocument) {
        ArrayList arrayList;
        synchronized (f15511b) {
            try {
                arrayList = new ArrayList();
                Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f15506a, null);
                if (lNativeGetFirstChildBookmark != null) {
                    k(arrayList, pdfDocument, lNativeGetFirstChildBookmark.longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public final Point g(PdfDocument pdfDocument, int i, int i4, int i6, int i10, int i11, double d10, double d11) {
        return nativePageCoordsToDevice(((Long) pdfDocument.c.get(Integer.valueOf(i))).longValue(), i4, i6, i10, i11, 0, d10, d11);
    }

    public final PdfDocument h(ParcelFileDescriptor parcelFileDescriptor, String str) {
        PdfDocument pdfDocument = new PdfDocument();
        pdfDocument.f15507b = parcelFileDescriptor;
        synchronized (f15511b) {
            int i = -1;
            try {
                if (c == null) {
                    Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                    c = declaredField;
                    declaredField.setAccessible(true);
                }
                i = c.getInt(parcelFileDescriptor.getFileDescriptor());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e7) {
                e7.printStackTrace();
            }
            pdfDocument.f15506a = nativeOpenDocument(i, str);
        }
        return pdfDocument;
    }

    public final PdfDocument i(String str, byte[] bArr) {
        PdfDocument pdfDocument = new PdfDocument();
        synchronized (f15511b) {
            pdfDocument.f15506a = nativeOpenMemDocument(bArr, str);
        }
        return pdfDocument;
    }

    public final void j(PdfDocument pdfDocument, int i) {
        synchronized (f15511b) {
            pdfDocument.c.put(Integer.valueOf(i), Long.valueOf(nativeLoadPage(pdfDocument.f15506a, i)));
        }
    }

    public final void k(ArrayList arrayList, PdfDocument pdfDocument, long j) {
        PdfDocument.Bookmark bookmark = new PdfDocument.Bookmark();
        nativeGetBookmarkTitle(j);
        nativeGetBookmarkDestIndex(pdfDocument.f15506a, j);
        arrayList.add(bookmark);
        Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f15506a, Long.valueOf(j));
        if (lNativeGetFirstChildBookmark != null) {
            k(bookmark.f15508a, pdfDocument, lNativeGetFirstChildBookmark.longValue());
        }
        Long lNativeGetSiblingBookmark = nativeGetSiblingBookmark(pdfDocument.f15506a, j);
        if (lNativeGetSiblingBookmark != null) {
            k(arrayList, pdfDocument, lNativeGetSiblingBookmark.longValue());
        }
    }

    public final void l(PdfDocument pdfDocument, Bitmap bitmap, int i, int i4, int i6, int i10, int i11, boolean z4) {
        synchronized (f15511b) {
            try {
                nativeRenderPageBitmap(((Long) pdfDocument.c.get(Integer.valueOf(i))).longValue(), bitmap, this.f15512a, i4, i6, i10, i11, z4);
            } catch (NullPointerException e) {
                Log.e("com.shockwave.pdfium.PdfiumCore", "mContext may be null");
                e.printStackTrace();
            } catch (Exception e7) {
                Log.e("com.shockwave.pdfium.PdfiumCore", "Exception throw from native");
                e7.printStackTrace();
            }
        }
    }
}
