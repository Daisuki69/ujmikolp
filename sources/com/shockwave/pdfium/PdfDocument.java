package com.shockwave.pdfium;

import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.ArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class PdfDocument {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParcelFileDescriptor f15507b;
    public final ArrayMap c = new ArrayMap();

    public static class Bookmark {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f15508a = new ArrayList();
    }

    public static class Link {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RectF f15509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f15510b;
        public String c;
    }

    public static class Meta {
    }
}
