package We;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6425a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Looper looper, int i) {
        super(looper);
        this.f6425a = i;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.f6425a) {
            case 0:
                int i = message.what;
                if (i == 3) {
                    AbstractC0598b abstractC0598b = (AbstractC0598b) message.obj;
                    abstractC0598b.f6378a.getClass();
                    abstractC0598b.f6378a.a(abstractC0598b.d());
                    return;
                }
                if (i != 8) {
                    if (i != 13) {
                        throw new AssertionError(numX49.tnTj78("bkRP0") + message.what);
                    }
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        AbstractC0598b abstractC0598b2 = (AbstractC0598b) list.get(i4);
                        A a8 = abstractC0598b2.f6378a;
                        a8.getClass();
                        Bitmap bitmapI = (abstractC0598b2.f6380d & 1) == 0 ? a8.i(abstractC0598b2.f6381g) : null;
                        if (bitmapI != null) {
                            a8.b(bitmapI, 1, abstractC0598b2, null);
                        } else {
                            a8.c(abstractC0598b2);
                        }
                    }
                    return;
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    RunnableC0603g runnableC0603g = (RunnableC0603g) list2.get(i6);
                    A a10 = runnableC0603g.f6392b;
                    a10.getClass();
                    AbstractC0598b abstractC0598b3 = runnableC0603g.f6395k;
                    ArrayList arrayList = runnableC0603g.f6396l;
                    boolean z4 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                    if (abstractC0598b3 != null || z4) {
                        Uri uri = runnableC0603g.f6394g.f6354a;
                        Exception exc = runnableC0603g.f6399p;
                        Bitmap bitmap = runnableC0603g.m;
                        int i10 = runnableC0603g.f6398o;
                        if (abstractC0598b3 != null) {
                            a10.b(bitmap, i10, abstractC0598b3, exc);
                        }
                        if (z4) {
                            int size3 = arrayList.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                a10.b(bitmap, i10, (AbstractC0598b) arrayList.get(i11), exc);
                            }
                        }
                    }
                }
                return;
            case 1:
                sendMessageDelayed(obtainMessage(), 1000L);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
