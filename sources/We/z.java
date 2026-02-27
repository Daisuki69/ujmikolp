package We;

import android.os.Message;
import android.os.Process;
import dOYHB6.tiZVw8.numX49;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f6426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f6427b;

    public z(ReferenceQueue referenceQueue, y yVar) {
        this.f6426a = referenceQueue;
        this.f6427b = yVar;
        setDaemon(true);
        setName(numX49.tnTj78("bkRq"));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        y yVar = this.f6427b;
        Process.setThreadPriority(10);
        while (true) {
            try {
                C0597a c0597a = (C0597a) this.f6426a.remove(1000L);
                Message messageObtainMessage = yVar.obtainMessage();
                if (c0597a != null) {
                    messageObtainMessage.what = 3;
                    messageObtainMessage.obj = c0597a.f6377a;
                    yVar.sendMessage(messageObtainMessage);
                } else {
                    messageObtainMessage.recycle();
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e) {
                yVar.post(new C.h(e, 10));
                return;
            }
        }
    }
}
