package bg;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import cj.C1112C;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: bg.S, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0979S extends AbstractC0988a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8868b;
    public final C0965G0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8869d;
    public final Uri e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f8870g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0979S(Context context, C0965G0 c0965g0) {
        super(c0965g0);
        kotlin.jvm.internal.j.h(context, "context");
        this.f8868b = context;
        this.c = c0965g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.util.LinkedList r9, android.database.Cursor r10, bg.C0960E r11) {
        /*
            java.lang.String r0 = "field"
            kotlin.jvm.internal.j.h(r11, r0)
            java.util.List r0 = r11.f8726b
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L1d
            java.lang.Object r0 = cj.C1110A.A(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r10.getColumnIndex(r0)
            java.lang.String r10 = r10.getString(r0)
            goto L5d
        L1d:
            r2 = 2
            if (r2 <= r1) goto L21
            goto L5c
        L21:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r2 < r1) goto L5c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r10.getColumnIndex(r1)
            java.lang.String r1 = r10.getString(r1)
            if (r1 == 0) goto L2f
            r3.add(r1)
            goto L2f
        L49:
            r6 = 0
            r7 = 0
            java.lang.String r4 = ";"
            r5 = 0
            r8 = 62
            java.lang.String r10 = cj.C1110A.F(r3, r4, r5, r6, r7, r8)
            if (r10 == 0) goto L5c
            int r0 = r10.length()
            if (r0 != 0) goto L5d
        L5c:
            r10 = 0
        L5d:
            kotlin.jvm.functions.Function1 r11 = r11.f
            if (r11 == 0) goto L67
            java.lang.Object r10 = r11.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
        L67:
            r9.add(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.C0979S.e(java.util.LinkedList, android.database.Cursor, bg.E):void");
    }

    @Override // bg.AbstractC0988a0
    public final Object a() {
        Uri uri;
        C0965G0 c0965g0;
        switch (this.f8869d) {
            case 0:
                uri = this.e;
                break;
            case 1:
                uri = this.e;
                break;
            default:
                uri = this.e;
                break;
        }
        Uri uri2 = uri;
        HashSet hashSet = new HashSet();
        Iterator it = f().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((C0960E) it.next()).f8726b);
        }
        ContentResolver contentResolver = this.f8868b.getContentResolver();
        Object[] array = hashSet.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Cursor cursorQuery = contentResolver.query(uri2, (String[]) array, null, null, null);
        if (cursorQuery == null) {
            return C1112C.f9377a;
        }
        LinkedList linkedList = new LinkedList();
        cursorQuery.moveToFirst();
        if (cursorQuery.getCount() > 0) {
            do {
                LinkedList linkedList2 = new LinkedList();
                Iterator it2 = f().iterator();
                while (it2.hasNext()) {
                    try {
                        e(linkedList2, cursorQuery, (C0960E) it2.next());
                    } catch (Exception e) {
                        linkedList2.add(X5.f.c(e));
                        if (!(e instanceof IllegalAccessException) && (c0965g0 = this.c) != null) {
                            c0965g0.b("Core", e, null);
                        }
                    }
                }
                linkedList.add(linkedList2);
            } while (cursorQuery.moveToNext());
        }
        return linkedList;
    }

    @Override // Xf.a
    public final String d() {
        switch (this.f8869d) {
        }
        return this.f;
    }

    public final List f() {
        switch (this.f8869d) {
        }
        return this.f8870g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0979S(Context context, ArrayList fields, C0965G0 c0965g0, int i) {
        this(context, c0965g0);
        this.f8869d = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.h(context, "context");
                kotlin.jvm.internal.j.h(fields, "fields");
                this(context, c0965g0);
                this.f8870g = fields;
                Uri uri = MediaStore.Video.Media.INTERNAL_CONTENT_URI;
                kotlin.jvm.internal.j.c(uri, "MediaStore.Video.Media.INTERNAL_CONTENT_URI");
                this.e = uri;
                this.f = "VideoInternal";
                break;
            case 2:
                kotlin.jvm.internal.j.h(context, "context");
                kotlin.jvm.internal.j.h(fields, "fields");
                this(context, c0965g0);
                this.f8870g = fields;
                Uri uri2 = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                kotlin.jvm.internal.j.c(uri2, "MediaStore.Images.Media.INTERNAL_CONTENT_URI");
                this.e = uri2;
                this.f = "ImagesInternal";
                break;
            default:
                kotlin.jvm.internal.j.h(context, "context");
                kotlin.jvm.internal.j.h(fields, "fields");
                this.f8870g = fields;
                Uri uri3 = MediaStore.Audio.Media.INTERNAL_CONTENT_URI;
                kotlin.jvm.internal.j.c(uri3, "MediaStore.Audio.Media.INTERNAL_CONTENT_URI");
                this.e = uri3;
                this.f = "AudioInternal";
                break;
        }
    }
}
