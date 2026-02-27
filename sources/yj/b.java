package Yj;

import C3.f;
import C3.g;
import Xj.h;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Xj.a {
    public static final ArrayList m;
    public f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f6794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f6795l;

    static {
        ArrayList arrayList = new ArrayList();
        m = arrayList;
        arrayList.add(C3.a.f689a);
        arrayList.add(C3.a.f690b);
        arrayList.add(C3.a.c);
        arrayList.add(C3.a.f691d);
        arrayList.add(C3.a.e);
        arrayList.add(C3.a.f);
        arrayList.add(C3.a.f692g);
        arrayList.add(C3.a.h);
        arrayList.add(C3.a.i);
        arrayList.add(C3.a.j);
        arrayList.add(C3.a.f693k);
        arrayList.add(C3.a.f694l);
        arrayList.add(C3.a.m);
        arrayList.add(C3.a.f695n);
        arrayList.add(C3.a.f696o);
        arrayList.add(C3.a.f697p);
        arrayList.add(C3.a.f698q);
    }

    public b(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f6685g = true;
        this.h = true;
        getResources().getColor(R.color.viewfinder_laser);
        getResources().getColor(R.color.viewfinder_border);
        getResources().getColor(R.color.viewfinder_mask);
        getResources().getInteger(2131427398);
        getResources().getInteger(2131427397);
        this.i = 0.1f;
        this.c = a(getContext());
        EnumMap enumMap = new EnumMap(C3.b.class);
        enumMap.put(C3.b.POSSIBLE_FORMATS, getFormats());
        f fVar = new f();
        this.j = fVar;
        fVar.c(enumMap);
    }

    public final g d(int i, int i4, byte[] bArr) {
        Rect rect;
        synchronized (this) {
            try {
                if (this.f6684d == null) {
                    Rect framingRect = ((h) this.c).getFramingRect();
                    int width = this.c.getWidth();
                    int height = this.c.getHeight();
                    if (framingRect != null && width != 0 && height != 0) {
                        Rect rect2 = new Rect(framingRect);
                        if (i < width) {
                            rect2.left = (rect2.left * i) / width;
                            rect2.right = (rect2.right * i) / width;
                        }
                        if (i4 < height) {
                            rect2.top = (rect2.top * i4) / height;
                            rect2.bottom = (rect2.bottom * i4) / height;
                        }
                        this.f6684d = rect2;
                        rect = this.f6684d;
                    }
                    rect = null;
                } else {
                    rect = this.f6684d;
                }
            } finally {
            }
        }
        if (rect != null) {
            try {
                return new g(bArr, i, i4, rect.left, rect.top, rect.width(), rect.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Collection<C3.a> getFormats() {
        List list = this.f6794k;
        return list == null ? m : list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Xj.a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[PHI: r0 r2
  0x006b: PHI (r0v5 int) = (r0v4 int), (r0v16 int) binds: [B:6:0x001d, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r2v2 int) = (r2v1 int), (r2v11 int) binds: [B:6:0x001d, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[Catch: RuntimeException -> 0x0068, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0068, blocks: (B:5:0x0008, B:7:0x001f, B:11:0x002b, B:16:0x0046, B:20:0x004f, B:21:0x005e, B:22:0x0061, B:26:0x006d, B:28:0x0074, B:33:0x008c, B:43:0x00a8, B:48:0x00c5, B:50:0x00cc, B:51:0x00d1, B:52:0x00d2, B:35:0x0093, B:36:0x0098, B:37:0x0099, B:38:0x009b, B:39:0x009f, B:40:0x00a2, B:55:0x00da, B:56:0x00ef, B:44:0x00b8, B:46:0x00be, B:47:0x00c1, B:29:0x007f, B:31:0x0085, B:32:0x0088), top: B:60:0x0008, inners: #3, #4, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da A[Catch: RuntimeException -> 0x0068, TryCatch #2 {RuntimeException -> 0x0068, blocks: (B:5:0x0008, B:7:0x001f, B:11:0x002b, B:16:0x0046, B:20:0x004f, B:21:0x005e, B:22:0x0061, B:26:0x006d, B:28:0x0074, B:33:0x008c, B:43:0x00a8, B:48:0x00c5, B:50:0x00cc, B:51:0x00d1, B:52:0x00d2, B:35:0x0093, B:36:0x0098, B:37:0x0099, B:38:0x009b, B:39:0x009f, B:40:0x00a2, B:55:0x00da, B:56:0x00ef, B:44:0x00b8, B:46:0x00be, B:47:0x00c1, B:29:0x007f, B:31:0x0085, B:32:0x0088), top: B:60:0x0008, inners: #3, #4, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[Catch: RuntimeException -> 0x0068, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0068, blocks: (B:5:0x0008, B:7:0x001f, B:11:0x002b, B:16:0x0046, B:20:0x004f, B:21:0x005e, B:22:0x0061, B:26:0x006d, B:28:0x0074, B:33:0x008c, B:43:0x00a8, B:48:0x00c5, B:50:0x00cc, B:51:0x00d1, B:52:0x00d2, B:35:0x0093, B:36:0x0098, B:37:0x0099, B:38:0x009b, B:39:0x009f, B:40:0x00a2, B:55:0x00da, B:56:0x00ef, B:44:0x00b8, B:46:0x00be, B:47:0x00c1, B:29:0x007f, B:31:0x0085, B:32:0x0088), top: B:60:0x0008, inners: #3, #4, #5, #6, #7 }] */
    @Override // android.hardware.Camera.PreviewCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPreviewFrame(byte[] r17, android.hardware.Camera r18) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Yj.b.onPreviewFrame(byte[], android.hardware.Camera):void");
    }

    public void setFormats(List<C3.a> list) {
        this.f6794k = list;
        EnumMap enumMap = new EnumMap(C3.b.class);
        enumMap.put(C3.b.POSSIBLE_FORMATS, getFormats());
        f fVar = new f();
        this.j = fVar;
        fVar.c(enumMap);
    }

    public void setResultHandler(a aVar) {
        this.f6795l = aVar;
    }
}
